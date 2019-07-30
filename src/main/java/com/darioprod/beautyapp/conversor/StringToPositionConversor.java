package com.darioprod.beautyapp.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.darioprod.beautyapp.model.Position;
import com.darioprod.beautyapp.service.PositionService;

@Component
public class StringToPositionConversor  implements Converter<String, Position>{

	@Autowired 
	private PositionService positionService;

	@Override
	public Position convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return positionService.findById(id);
	}

}
