package com.siukatech.poc.react.backend.user.business.mapper;

import com.siukatech.poc.react.backend.core.business.mapper.AbstractMapper;
import com.siukatech.poc.react.backend.user.business.dto.SimpleDto;
import com.siukatech.poc.react.backend.user.business.form.SimpleForm;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleMapper extends AbstractMapper {
    SimpleDto convertToSimpleDto(SimpleForm simpleForm);
}
