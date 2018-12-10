package com.ignacio1250.iwasoft.controller;


import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ignacio1250.iwasoft.commons.BodyRequestRecarga;
import com.ignacio1250.iwasoft.commons.Response;
import com.ignacio1250.iwasoft.dao.RecargasRepository;
import com.ignacio1250.iwasoft.model.CompaniasRanking;
import com.ignacio1250.iwasoft.model.Recargas;
import com.ignacio1250.iwasoft.model.Tarifas;




/**
 * Hello world!
 *
 */

@Controller
@RequestMapping("/Demo")
public class AppController 
{
	@Autowired
	private RecargasRepository recargasRepository;
   
   @CrossOrigin(origins = "http://localhost:4200")
   @PostMapping("/recarga")
   public @ResponseBody String addMetadata(@RequestBody String body ) {
	   Gson response= new Gson();
	   BodyRequestRecarga data = response.fromJson(body, BodyRequestRecarga.class);
	   Response bodyResponse= new Response();
	   if(data.getNumero()==null) {
		   bodyResponse.setCode(401);
		   bodyResponse.setMessage("Numero is missing");
		   return response.toJson(bodyResponse);
	   }else if (data.getCompany()==null) {
		   bodyResponse.setCode(401);
		   bodyResponse.setMessage("Company is missing");
		   return response.toJson(bodyResponse);
	   }else if(data.getMonto()== 0) {
		   bodyResponse.setCode(401);
		   bodyResponse.setMessage("monto is missing");
		   return response.toJson(bodyResponse);
	   }
	   Recargas model= new Recargas();
	   model.setNumero(data.getNumero());
	   model.setCompany(data.getCompany());
	   model.setMonto(data.getMonto());
	   recargasRepository.save(model);
	   bodyResponse.setCode(200);
	   bodyResponse.setMessage("Recarga Realizada");
	   return response.toJson(bodyResponse);
	  
   }
   @CrossOrigin(origins = "http://localhost:4200")
   @GetMapping("/getRecargas")
   public @ResponseBody Iterable<Tarifas> getRecargas(){
	   int[] tarifas = recargasRepository.findTarifas();
	   ArrayList<Tarifas> responseTarifas = new ArrayList<Tarifas>();
	   for(int i=0; i<tarifas.length;i++) {
		  responseTarifas.add(new Tarifas(tarifas[i],recargasRepository.findCountsTarifas(tarifas[i])));
	   }
	   return responseTarifas;
   }
   
   
  
   
   @CrossOrigin(origins = "http://localhost:4200")
   @GetMapping("/getRecargasbyAmount")
   public @ResponseBody Iterable<CompaniasRanking> getRecargasbyAmount(@RequestParam int monto){
	  String[] companys= recargasRepository.getCompany(monto);
	  ArrayList<CompaniasRanking> responseRanking = new ArrayList<CompaniasRanking>();
	  for(int i=0; i<companys.length;i++) {
		  responseRanking.add(new CompaniasRanking(companys[i],recargasRepository.getAmountsByCompany(companys[i], monto) ));
	  }
	   return responseRanking;
   }
}
