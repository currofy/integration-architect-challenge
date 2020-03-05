package com.currofy.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.currofy.api.data.model.ArticleInTicketModel;
import com.currofy.api.data.model.ArticleModel;
import com.currofy.api.data.model.CustomerModel;
import com.currofy.api.data.model.MarketPriceModel;
import com.currofy.api.data.model.StoreModel;
import com.currofy.api.data.model.TicketModel;
import com.currofy.api.data.repository.ArticleRepository;
import com.currofy.api.data.repository.CustomerRepository;
import com.currofy.api.data.repository.StoreRepository;
import com.currofy.api.data.repository.TicketRepository;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	StoreRepository storeRepo;
	
	@Autowired
	ArticleRepository articleRepo;
	
	@Autowired
	TicketRepository ticketRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {
		customerRepo.deleteAll();
		storeRepo.deleteAll();
		articleRepo.deleteAll();
		ticketRepo.deleteAll();
		
		CustomerModel juan = new CustomerModel();
		juan.setName("Juan");
		juan.setSurname("Nadie");
		juan.setEmail("juan@nadie.es");
		juan.setAddress("rúa del percebe, 13");
		juan.setPhoneNumber("666777888");
		
		customerRepo.save(juan);
		
		CustomerModel perico = new CustomerModel();
		perico.setName("Perico");
		perico.setSurname("Palotes");
		perico.setEmail("perico@palotes.es");
		perico.setAddress("rúa del percebe, 13");
		perico.setPhoneNumber("666000999");
		
		customerRepo.save(perico);
		
		StoreModel store = new StoreModel();
		store.setCommercialArea("Plaza Norte 2");
		store.setLat(40.540807);
		store.setLon(-3.611773);
		store.setName("Zara");
	    List<String> sections = Arrays.asList("Hombre", "Mujer");
		store.setSections(sections);
		
		storeRepo.save(store);
		
		MarketPriceModel jerseySpain = new MarketPriceModel();
		jerseySpain.setCountryISOCode("ES");
		jerseySpain.setCurrenry("EUR");
		jerseySpain.setPrice(BigDecimal.valueOf(17.20));
		
		MarketPriceModel jerseyFrance = new MarketPriceModel();
		jerseySpain.setCountryISOCode("FR");
		jerseySpain.setCurrenry("EUR");
		jerseySpain.setPrice(BigDecimal.valueOf(18.20));
		
		List<MarketPriceModel> jerseyPrices = new ArrayList<>();
		jerseyPrices.add(jerseyFrance);
		jerseyPrices.add(jerseySpain);
		
		ArticleModel jersey = new ArticleModel();
		jersey.setColor("BLACK");
		jersey.setDescription("Jersey black");
		jersey.setInternalId("jjeerrsseeyy");
		List<String> jerseyMaterials = Arrays.asList("Linen", "Wool");
		jersey.setMaterials(jerseyMaterials);
		jersey.setName("Jersey");
		List<String> jerseyPhotos = Arrays.asList("http://whatever.com/jersey.jpg", "http://whatever.com/jersey2.jpg");
		jersey.setPhotos(jerseyPhotos);
		List<Integer> jerseySeason = Arrays.asList(18, 19, 30);
		jersey.setSeasons(jerseySeason);
		jersey.setSize("SMALL");
		jersey.setPrices(jerseyPrices);
		
		articleRepo.save(jersey);
		
		MarketPriceModel cardiganSpain = new MarketPriceModel();
		cardiganSpain.setCountryISOCode("ES");
		cardiganSpain.setCurrenry("EUR");
		cardiganSpain.setPrice(BigDecimal.valueOf(27.20));
		
		MarketPriceModel cardiganFrance = new MarketPriceModel();
		cardiganFrance.setCountryISOCode("FR");
		cardiganFrance.setCurrenry("EUR");
		cardiganFrance.setPrice(BigDecimal.valueOf(28.20));
		
		List<MarketPriceModel> cardiganPrices = new ArrayList<>();
		cardiganPrices.add(cardiganSpain);
		cardiganPrices.add(jerseySpain);
		
		ArticleModel cardigan = new ArticleModel();
		cardigan.setColor("WHITE");
		cardigan.setDescription("Cardigan white");
		cardigan.setInternalId("ccaarrddiiggaann");
		List<String> cardiganMaterials =Arrays.asList("Linen", "Wool");
		cardigan.setMaterials(cardiganMaterials);
		cardigan.setName("Cardigan");
		List<String> cardiganPhotos = Arrays.asList("http://whatever.com/cardigan.jpg", "http://whatever.com/cardigan2.jpg");
		cardigan.setPhotos(cardiganPhotos);
		List<Integer> cardiganSeason = Arrays.asList(19, 20);
		cardigan.setSeasons(cardiganSeason);
		cardigan.setPrices(cardiganPrices);
		
		cardigan.setSize("BIG");
		
		articleRepo.save(cardigan);
		
		
		
		List<ArticleInTicketModel> articlesInTicket = new ArrayList<>();
		ArticleInTicketModel onlyOne = new ArticleInTicketModel();
		onlyOne.setArticle(cardigan);
		onlyOne.setNumber(1);
		articlesInTicket.add(onlyOne);
		ArticleInTicketModel twoItems = new ArticleInTicketModel();
		twoItems.setArticle(jersey);
		twoItems.setNumber(2);
		articlesInTicket.add(twoItems);
		
		TicketModel expensive = new TicketModel();
		expensive.setArticles(articlesInTicket);
		expensive.setCustomer(juan);
		expensive.setGenerateDate(System.currentTimeMillis()/1000);
		expensive.setStore(store);
		
		ticketRepo.save(expensive);
	}
	
}
