package com.devsuperior.dslist.dto;



import com.devsuperior.dslist.entities.GameList;


public class GameListDTO {
    private Long id;
    private String name;

    
    public GameListDTO() {
    }
    
    
    public GameListDTO(GameList entity) {
        // BeanUtils.copyProperties(entity, this);
        id = entity.getId();
        name = entity.getName();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    

    
    

    
}
