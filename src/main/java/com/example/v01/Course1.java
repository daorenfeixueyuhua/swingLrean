package com.example.v01;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course1 {
	private Integer index;
	private String name;
	private String comment;
	private List<Word1> words;
}
