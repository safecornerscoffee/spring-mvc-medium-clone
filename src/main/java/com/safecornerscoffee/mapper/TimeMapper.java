package com.safecornerscoffee.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TimeMapper {
    String getCurrentTime();
}
