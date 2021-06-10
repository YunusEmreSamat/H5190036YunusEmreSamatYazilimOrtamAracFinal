package com.medipol.yazilimaraclarifinal.H5190036YunusEmreSamatFinal;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class H5190036YunusEmreSamatYazilimAraclariFinalApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testUrun() {
		
		Assert.assertEquals(null, UrunDepo.urunEkle(null));
		
		Assert.assertEquals(null, UrunDepo.urunSil(null,null));
		
	}
}
