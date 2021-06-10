package com.medipol.yazilimaraclarifinal.H5190036YunusEmreSamatFinal;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/urun")
public class UrunRestApi {
	
	@GetMapping("/listele")
	public List<Urun> listele(){
		return UrunDepo.urunleriGetir();
	}
	
	@PostMapping("/ekle")
	public List<Urun> ekle(@RequestBody Urun urun){
		List<Urun> urunListe = UrunDepo.urunEkle(urun);
		return urunListe;
	}
	
	@PostMapping("/sil")
	public String sil(@RequestBody Urun urun){
		String urunListe = UrunDepo.urunSil(urun.getAd(),urun.getFiyat());
		return urunListe;
	}

}