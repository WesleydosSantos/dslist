package com.devsuperior.dslist.projections;

//pega os atributos da Query do BD
public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}
