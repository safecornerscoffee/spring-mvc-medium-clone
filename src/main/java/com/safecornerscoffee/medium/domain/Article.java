package com.safecornerscoffee.medium.domain;

import java.util.Set;

public class Article {
    private Long id;
    private String title;
    private String body;
    private Long userId;
    private Set<Tag> tags;

    public Article() {

    }

    public Article(Long id, String title, String body, Long userId) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public Article(Long id, String title, String body, Long userId, Set<Tag> tags) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.userId = userId;
        this.tags = tags;
    }

    public void updateTitle(String title) {
        setTitle(title);
    }

    public void updateBody(String body) {
        setBody(body);
    }

    public void updateTags(Set<Tag> tags) {
        setTags(tags);
    }

    public void addTag(Tag tag) {
        if (tags.contains(tag)) {
            throw new IllegalStateException("already have tag: " + tag.getName());
        }
        tags.add(tag);
    }

    public void removeTag(Tag tag) {
        if (!tags.contains(tag)) {
           throw new IllegalStateException("does not have tag: " + tag.getName());
        }
        tags.remove(tag);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public static class ArticleBuilder {
        private Long id;
        private String title;
        private String body;
        private Long userId;
        private Set<Tag> tags;

        public ArticleBuilder(Long id, String title, String body, Long userId) {
            this.id = id;
            this.title = title;
            this.body = body;
            this.userId = userId;
        }

        public ArticleBuilder tags(Set<Tag> tags) {
            this.tags = tags;
            return this;
        }

        public Article build() {
            return new Article(id, title, body, userId, tags);
        }
    }
}
