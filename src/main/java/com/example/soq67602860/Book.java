package com.example.soq67602860;

import lombok.Value;

@Value(staticConstructor = "of")
public class Book {
	private String id, author, title;
}