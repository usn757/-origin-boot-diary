package org.example.bootdiary.service;

import org.example.bootdiary.model.entity.Article;

import java.util.List;

// 타입
public interface ArticleService {
    List<Article> findAll();
}
