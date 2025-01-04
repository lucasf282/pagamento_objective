package siqueira.farias.lucas.resources;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import siqueira.farias.lucas.dtos.*;
import siqueira.farias.lucas.services.ContaService;

@Path("/conta")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContaResource {

    @Inject
    ContaService contaService;

    @POST
    public Response cadastrar(@Valid ContaDTO contaDTO) {
        ContaDTO contaCadastrada = contaService.cadastrar(contaDTO);
        return Response.ok(contaCadastrada).build();
    }

    @GET
    public Response buscar(
            @NotBlank(message = "{conta.numeroConta.notBlank}")
            @Positive(message = "{conta.numeroConta.positive}")
            @QueryParam("numero_conta")
            Long numeroConta
    ) {
        //TODO: implementar serviço de busca da conta
        return Response.ok().build();
    }
}


