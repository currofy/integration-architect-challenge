package com.currofy.api.service.ticket.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currofy.api.core.dto.ArticleDTO;
import com.currofy.api.core.dto.ArticleInTicketDTO;
import com.currofy.api.core.dto.MarketPriceDTO;
import com.currofy.api.core.dto.StoreDTO;
import com.currofy.api.core.dto.TicketDTO;
import com.currofy.api.core.enums.ExceptionCodeEnum;
import com.currofy.api.data.model.ArticleInTicketModel;
import com.currofy.api.data.model.ArticleModel;
import com.currofy.api.data.model.MarketPriceModel;
import com.currofy.api.data.model.StoreModel;
import com.currofy.api.data.model.TicketModel;
import com.currofy.api.data.repository.CustomerRepository;
import com.currofy.api.data.repository.TicketRepository;
import com.currofy.api.service.exception.ServiceException;
import com.currofy.api.service.ticket.TicketService;

import lombok.extern.java.Log;

@Log
@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	TicketRepository ticketRepo;

	@Autowired
	CustomerRepository customerRepo;
	
	@Override
	public List<TicketDTO> getTicketsOfUser(String email) throws ServiceException {
		
		log.info("user mail: " + email);
		List<TicketDTO> result = new ArrayList<>();
		List<TicketModel> tickets = ticketRepo.findByCustomerEmail(email);
		log.info("tickets #: " + tickets.size());
		if (tickets.isEmpty()) {
			throw new ServiceException((customerRepo.findByEmail(email)==null) ?
										ExceptionCodeEnum.USER_NOT_FOUND:
										ExceptionCodeEnum.USER_WITHOUT_TICKETS);
		}
		for (TicketModel ticketModel : tickets) {

			TicketDTO ticketResult = convertTicket(ticketModel);
			result.add(ticketResult);
			
		}
		return result;
		
	}
	
	//TODO pasar esto a mapstruts o jmapper, nunca a dozer!!
	private TicketDTO convertTicket(TicketModel ticket) {
		
		TicketDTO result = new TicketDTO();
		result.setGenerateDate(ticket.getGenerateDate());
		result.setTotalPrice(ticket.getTotalPrice());
		result.setTicketId(ticket.getId());
		result.setStore(convertStore(ticket.getStore()));
		result.setArticles(convertArticleInTicket(ticket.getArticles()));
		return result;
	
	}
	
	private StoreDTO convertStore(StoreModel store) {
		
		StoreDTO result = new StoreDTO();
		result.setCommercialArea(store.getCommercialArea());
		result.setLat(store.getLat());
		result.setLon(store.getLon());
		result.setName(store.getName());
		result.setSalesEstimated(store.getSalesEstimated());
		result.setSections(store.getSections());
		result.setStoreId(store.getStoreId());
		return result;
	
	}
	
	private List<ArticleInTicketDTO> convertArticleInTicket (List<ArticleInTicketModel> articleInTicket) {
		
		List<ArticleInTicketDTO> result = new ArrayList<>();
		for (ArticleInTicketModel article : articleInTicket) {
			
			ArticleInTicketDTO item = new ArticleInTicketDTO();
			item.setNumber(article.getNumber());
			item.setArticle(convertArticle(article.getArticle()));
			result.add(item);
		}
		return result;
		
	}
	
	private ArticleDTO convertArticle (ArticleModel article) {
		
		ArticleDTO result = new ArticleDTO();
		result.setColor(article.getColor());
		result.setDescription(article.getDescription());
		result.setInternalId(article.getInternalId());
		result.setMaterials(article.getMaterials());
		result.setName(article.getName());
		result.setPhotos(article.getPhotos());
		result.setPrices(covertMarketPrice(article.getPrices()));
		result.setSeasons(article.getSeasons());
		result.setSize(article.getSize());
		return result;
		
	}
	
	private List<MarketPriceDTO> covertMarketPrice (List<MarketPriceModel> marketPrices) {
		
		List<MarketPriceDTO> result = new ArrayList<>();
		for (MarketPriceModel marketPrice : marketPrices) {			
			MarketPriceDTO item = new MarketPriceDTO();
			item.setCountryISOCode(marketPrice.getCountryISOCode());
			item.setCurrenry(marketPrice.getCurrenry());
			item.setPrice(marketPrice.getPrice());
			result.add(item);	
		}
		return result;
		
	}
	
	

}
