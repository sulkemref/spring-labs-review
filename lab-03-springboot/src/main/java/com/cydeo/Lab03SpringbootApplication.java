package com.cydeo;

import com.cydeo.config.AuthorConfig;
import com.cydeo.service.RecipeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab03SpringbootApplication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(Lab03SpringbootApplication.class, args);
        RecipeService recipeService = container.getBean(RecipeService.class);

        recipeService.prepareRecipe();

        AuthorConfig authorConfig = container.getBean(AuthorConfig.class);

        System.out.println("autoConfig.getName() " + authorConfig.getName());
        System.out.println("autoConfig.getSurname() " + authorConfig.getSurname());
        System.out.println("autoConfig.getPhone() " + authorConfig.getPhone());
        System.out.println("autoConfig.getSocialMedias() " + authorConfig.getSocialMedias());
        System.out.println("autoConfig.getEmail() " + authorConfig.getEmail());
    }

}
