package siqueira.farias.lucas.resources;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import siqueira.farias.lucas.dtos.ContaDTO;
import siqueira.farias.lucas.dtos.TransacaoDTO;
import siqueira.farias.lucas.services.TransacaoService;

@Path("/transacao")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TransacaoResource {

    @Inject
    private TransacaoService transacaoService;

    @POST
    public Response pagar(@Valid TransacaoDTO transacaoDTO) {
        ContaDTO contaDTO = transacaoService.pagar(transacaoDTO);
        return Response.ok(contaDTO).build();
    }

}


