package com.medipol.yazilimaraclarifinal.H5190036YunusEmreSamatFinal;

import java.util.*;

public final class UrunDepo {

	private static final  List<Urun> URUNLER = new ArrayList<>();
	static {
		URUNLER.add( new Urun("Ekmek","2TL") );
		URUNLER.add( new Urun("Peynir","3TL") );
		URUNLER.add( new Urun("Zeytin","4TL") );
		URUNLER.add( new Urun("Domates","5TL") );
	}
	
	private UrunDepo() {
	}
		
	public static List<Urun> urunleriGetir() {
		return URUNLER;
	}
	
	public static List<Urun> urunEkle(Urun urun) {
		if(urun != null) {
			URUNLER.add(urun);
			return URUNLER;
		}
		else {
			return null;
		}
	}
	
	public static String urunSil(String ad,String fiyat) {		
		if(ad != null && fiyat != null) {
			for(Urun u:URUNLER) {
				if(u.getAd().equals(ad) && u.getFiyat().equals(fiyat)) {
					URUNLER.remove(u);
				}	
			}
			return "Urun Silinmistir..";
		}
		else {
			return null;
		}
	}
}
