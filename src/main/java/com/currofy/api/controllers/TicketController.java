package com.currofy.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.currofy.api.controllers.exception.ControllerException;
import com.currofy.api.core.dto.BasicDTO;
import com.currofy.api.core.dto.ErrorDTO;
import com.currofy.api.core.dto.TicketDTO;
import com.currofy.api.service.exception.ServiceException;
import com.currofy.api.service.ticket.TicketService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RequestMapping("/ticket")
@RestController
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@Operation(summary = "Tickets del cliente",
		    tags = {"Tickets"},
		    description = "Servicio de obtención de tickets por correo electrónico de usuario",
		    responses = {
		            @ApiResponse(description = "Los tickets de ese usuario", 
		            			content = @Content(schema = @Schema(implementation = TicketDTO.class)
		            )),
		            @ApiResponse(responseCode = "400", 
		            			description = "O no hay tickets o no existe el usuario",
		            			content = @Content(schema = @Schema(implementation = ErrorDTO.class)))
		    })
	@GetMapping("/{email}")
	public List<TicketDTO> getTicketsOfUser(@PathVariable String email) throws ControllerException {
		List<TicketDTO> result = new ArrayList<>();
		try {
			result = ticketService.getTicketsOfUser(email);
		} catch (ServiceException e) {
			throw new ControllerException(e.getExceptionType());
		}
		return result;

	}
	
	@Operation(summary = "Actualización de un ticket",
		    tags = {"Tickets"},
		    description = "Servicio de actualización de de tickets.",
		    responses = {
		            @ApiResponse(description = "Muestra un ok si todo ha ido bien", 
		            			content = @Content(schema = @Schema(implementation = BasicDTO.class)
		            )),
		            @ApiResponse(responseCode = "400", 
		            			description = "Si no se ha podido modificar alguno de los parámetros",
		            			content = @Content(schema = @Schema(implementation = ErrorDTO.class)))
		    })
	@PutMapping
	public BasicDTO updateTicket(@RequestBody TicketDTO ticket) throws ControllerException {
		return new BasicDTO("ok");
	}

	@Operation(summary = "Borrado de un ticket",
		    tags = {"Tickets"},
		    description = "Servicio de borrado de de tickets",
		    responses = {
		            @ApiResponse(description = "Muestra un ok si todo ha ido bien", 
		            			content = @Content(schema = @Schema(implementation = BasicDTO.class)
		            )),
		            @ApiResponse(responseCode = "400", 
		            			description = "Si no se ha podido eliminar el ticket",
		            			content = @Content(schema = @Schema(implementation = ErrorDTO.class)))
		    })	
	@DeleteMapping ("/{ticketId}")
	public BasicDTO deleteTicket(@PathVariable String ticketId) throws ControllerException {
		return new BasicDTO("ok");
	}
	
	@Operation(summary = "Creación de un ticket",
		    tags = {"Tickets"},
		    description = "Servicio de creación de de tickets",
		    responses = {
		            @ApiResponse(description = "Muestra un ok si todo ha ido bien", 
		            			content = @Content(schema = @Schema(implementation = BasicDTO.class)
		            )),
		            @ApiResponse(responseCode = "400", 
		            			description = "Si existe algún error en alguno de los parámetros",
		            			content = @Content(schema = @Schema(implementation = ErrorDTO.class)))
		    })
	@PostMapping
	public BasicDTO createTicket(@RequestBody TicketDTO ticket) throws ControllerException {
		return new BasicDTO("ok");
	}
	
}
