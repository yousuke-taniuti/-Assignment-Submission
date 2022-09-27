package com.example.demo;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class TestForm {
	@Id
    private Integer id;    
    @NotEmpty(message = "名前を入力してください")
    private String name;
    @NotNull(message = "年齢を入力してください")
    private Integer old;

}