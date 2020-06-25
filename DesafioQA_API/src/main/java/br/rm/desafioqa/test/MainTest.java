package br.rm.desafioqa.test;
import static org.hamcrest.Matchers.hasSize;


import org.hamcrest.Matchers;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.rm.desafioqa.rest.core.BaseTest;


import static io.restassured.RestAssured.given;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainTest extends BaseTest{
	
	@Test
	public void t_03_deveAcessarSimuladoreValidarTamanhoArrays() {
		given()
		.when()
			.get("/api/v1/simulador")
		.then()
			.statusCode(200)
			.log().all()
			.body("meses", hasSize(4))
			.body("valor", hasSize(4))
		;
		
	}
	
	@Test
	public void t_04_deveValidraId() {
		given()
		.when()
			.get("/api/v1/simulador")
		.then()
			.statusCode(200)
			.log().all()
			.body("id", Matchers.comparesEqualTo(1))
		;
		
	}
	
	@Test
	public void t_05_erroAoTentaralterarDadoId() {
		given()
			.body("{ \"id\": \"2\"}")
		.when()
			.put("api/v1/simulador")
		.then()
			.log().all()
			.statusCode(400)
		;
			
	}
	
	@Test
	public void t_01_deveValidarMeses() {
		given()
		.when()
			.get("/api/v1/simulador")
		.then()
			.statusCode(200)
			.log().all()
			.body("meses", Matchers.hasItems("112", "124", "136", "148"));
					;
		
	}
	
	@Test
	public void t_02_deveValidarValores() {
		given()
		.when()
			.get("/api/v1/simulador")
		.then()
			.statusCode(200)
			.log().all()
			.body("valor", Matchers.hasItems("2.802","3.174","3.564","3.971"));
					;
		
	}
	


	
	
}
