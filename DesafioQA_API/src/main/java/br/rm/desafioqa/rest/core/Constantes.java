
package br.rm.desafioqa.rest.core;

import io.restassured.http.ContentType;

public interface Constantes {
	String APP_BASE_URL = "http://5b847b30db24a100142dce1b.mockapi.io";
	Integer APP_PORT = 80 ;
	String APP_BASE_PATH = "";	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;	
	Long MAX_TIMEOUT = 7000L;
	
	

}
