package com.currofy.api.service.ticket;

import java.util.List;

import com.currofy.api.core.dto.TicketDTO;
import com.currofy.api.service.exception.ServiceException;

public interface TicketService {
	List<TicketDTO> getTicketsOfUser(String email) throws ServiceException;
}
