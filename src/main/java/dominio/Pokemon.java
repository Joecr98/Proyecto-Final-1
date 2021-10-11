/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.sql.ResultSet;

/**
 *
 * @author Joe
 */
public class Pokemon {
    
    private String id;
    private String name;
    private String forme_name;
    private String forme_base_pokemon_id;
    private String generation_id;
    private String evolution_chain_id;
    private String evolution_method_id;
    private String evolution_parameter;
    private String height;
    private String weight;
    //-------------------------    
    private String species;
    private String color;
    private String pokemon_shape_id;
    private String habitat;
    private String gender_rate;
    private String capture_rate;
    private String base_experience;
    private String base_happiness;
    private String gen1_internal_id;
    private String is_baby;
    private String has_gen4_fem_sprite;
    private String has_gen4_fem_back_sprite;

    public Pokemon(String id, String name, String forme_name, String forme_base_pokemon_id, String generation_id, String evolution_chain_id, String evolution_method_id, String evolution_parameter, String height, String weight, String species, String color, String pokemon_shape_id, String habitat, String gender_rate, String capture_rate, String base_experience, String base_happiness, String gen1_internal_id, String is_baby, String has_gen4_fem_sprite, String has_gen4_fem_back_sprite) {
        this.id = id;
        this.name = name;
        this.forme_name = forme_name;
        this.forme_base_pokemon_id = forme_base_pokemon_id;
        this.generation_id = generation_id;
        this.evolution_chain_id = evolution_chain_id;
        this.evolution_method_id = evolution_method_id;
        this.evolution_parameter = evolution_parameter;
        this.height = height;
        this.weight = weight;
        this.species = species;
        this.color = color;
        this.pokemon_shape_id = pokemon_shape_id;
        this.habitat = habitat;
        this.gender_rate = gender_rate;
        this.capture_rate = capture_rate;
        this.base_experience = base_experience;
        this.base_happiness = base_happiness;
        this.gen1_internal_id = gen1_internal_id;
        this.is_baby = is_baby;
        this.has_gen4_fem_sprite = has_gen4_fem_sprite;
        this.has_gen4_fem_back_sprite = has_gen4_fem_back_sprite;
    }
        
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the forme_name
     */
    public String getForme_name() {
        return forme_name;
    }

    /**
     * @param forme_name the forme_name to set
     */
    public void setForme_name(String forme_name) {
        this.forme_name = forme_name;
    }

    /**
     * @return the forme_base_pokemon_id
     */
    public String getForme_base_pokemon_id() {
        return forme_base_pokemon_id;
    }

    /**
     * @param forme_base_pokemon_id the forme_base_pokemon_id to set
     */
    public void setForme_base_pokemon_id(String forme_base_pokemon_id) {
        this.forme_base_pokemon_id = forme_base_pokemon_id;
    }

    /**
     * @return the generation_id
     */
    public String getGeneration_id() {
        return generation_id;
    }

    /**
     * @param generation_id the generation_id to set
     */
    public void setGeneration_id(String generation_id) {
        this.generation_id = generation_id;
    }

    /**
     * @return the evolution_chain_id
     */
    public String getEvolution_chain_id() {
        return evolution_chain_id;
    }

    /**
     * @param evolution_chain_id the evolution_chain_id to set
     */
    public void setEvolution_chain_id(String evolution_chain_id) {
        this.evolution_chain_id = evolution_chain_id;
    }

    /**
     * @return the evolution_method_id
     */
    public String getEvolution_method_id() {
        return evolution_method_id;
    }

    /**
     * @param evolution_method_id the evolution_method_id to set
     */
    public void setEvolution_method_id(String evolution_method_id) {
        this.evolution_method_id = evolution_method_id;
    }

    /**
     * @return the evolution_parameter
     */
    public String getEvolution_parameter() {
        return evolution_parameter;
    }

    /**
     * @param evolution_parameter the evolution_parameter to set
     */
    public void setEvolution_parameter(String evolution_parameter) {
        this.evolution_parameter = evolution_parameter;
    }

    /**
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the pokemon_shape_id
     */
    public String getPokemon_shape_id() {
        return pokemon_shape_id;
    }

    /**
     * @param pokemon_shape_id the pokemon_shape_id to set
     */
    public void setPokemon_shape_id(String pokemon_shape_id) {
        this.pokemon_shape_id = pokemon_shape_id;
    }

    /**
     * @return the habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * @return the gender_rate
     */
    public String getGender_rate() {
        return gender_rate;
    }

    /**
     * @param gender_rate the gender_rate to set
     */
    public void setGender_rate(String gender_rate) {
        this.gender_rate = gender_rate;
    }

    /**
     * @return the capture_rate
     */
    public String getCapture_rate() {
        return capture_rate;
    }

    /**
     * @param capture_rate the capture_rate to set
     */
    public void setCapture_rate(String capture_rate) {
        this.capture_rate = capture_rate;
    }

    /**
     * @return the base_experience
     */
    public String getBase_experience() {
        return base_experience;
    }

    /**
     * @param base_experience the base_experience to set
     */
    public void setBase_experience(String base_experience) {
        this.base_experience = base_experience;
    }

    /**
     * @return the base_happiness
     */
    public String getBase_happiness() {
        return base_happiness;
    }

    /**
     * @param base_happiness the base_happiness to set
     */
    public void setBase_happiness(String base_happiness) {
        this.base_happiness = base_happiness;
    }

    /**
     * @return the gen1_internal_id
     */
    public String getGen1_Stringernal_id() {
        return gen1_internal_id;
    }

    /**
     * @param gen1_internal_id the gen1_internal_id to set
     */
    public void setGen1_Stringernal_id(String gen1_internal_id) {
        this.gen1_internal_id = gen1_internal_id;
    }

    /**
     * @return the is_baby
     */
    public String getIs_baby() {
        return is_baby;
    }

    /**
     * @param is_baby the is_baby to set
     */
    public void setIs_baby(String is_baby) {
        this.is_baby = is_baby;
    }

    /**
     * @return the has_gen4_fem_sprite
     */
    public String getHas_gen4_fem_sprite() {
        return has_gen4_fem_sprite;
    }

    /**
     * @param has_gen4_fem_sprite the has_gen4_fem_sprite to set
     */
    public void setHas_gen4_fem_sprite(String has_gen4_fem_sprite) {
        this.has_gen4_fem_sprite = has_gen4_fem_sprite;
    }

    /**
     * @return the has_gen4_fem_back_sprite
     */
    public String getHas_gen4_fem_back_sprite() {
        return has_gen4_fem_back_sprite;
    }

    /**
     * @param has_gen4_fem_back_sprite the has_gen4_fem_back_sprite to set
     */
    public void setHas_gen4_fem_back_sprite(String has_gen4_fem_back_sprite) {
        this.has_gen4_fem_back_sprite = has_gen4_fem_back_sprite;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", name=" + name + ", forme_name=" + forme_name + ", forme_base_pokemon_id=" + forme_base_pokemon_id + ", generation_id=" + generation_id + ", evolution_chain_id=" + evolution_chain_id + ", evolution_method_id=" + evolution_method_id + ", evolution_parameter=" + evolution_parameter + ", height=" + height + ", weight=" + weight + ", species=" + species + ", color=" + color + ", pokemon_shape_id=" + pokemon_shape_id + ", habitat=" + habitat + ", gender_rate=" + gender_rate + ", capture_rate=" + capture_rate + ", base_experience=" + base_experience + ", base_happiness=" + base_happiness + ", gen1_internal_id=" + gen1_internal_id + ", is_baby=" + is_baby + ", has_gen4_fem_sprite=" + has_gen4_fem_sprite + ", has_gen4_fem_back_sprite=" + has_gen4_fem_back_sprite + '}';
    }  
    
}
