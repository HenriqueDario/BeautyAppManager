package com.darioprod.beautyapp.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.darioprod.beautyapp.model.Product;
import com.darioprod.beautyapp.service.ProductService;

@Component
public class StringToProductConveter implements Converter<String, Product>{

	@Autowired 
	private ProductService productService;

	@Override
	public Product convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return productService.findById(id);
	}

}