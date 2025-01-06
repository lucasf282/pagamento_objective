package siqueira.farias.lucas;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import siqueira.farias.lucas.dtos.ContaDTO;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ContaResourceTest {
    @Test
    void testCadastro() {
        ContaDTO conta = new ContaDTO();
        conta.setNumeroConta(123L);
        conta.setSaldo(100.0f);

        given()
              .contentType("application/json")
              .body(conta)
              .when().post("/conta")
              .then()
              .statusCode(200)
              .body(containsString("\"saldo\":100.0"))
              .body(containsString("\"numero_conta\":123"));
    }

}