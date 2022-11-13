package com.amxwer.foodrecipe.repository;

/*@Entity
@Table("FoodRecipe")*/
public class FoodRecipe {
 private String nameOfRecipe;
/*@Id
@GeneratedValue()*/
 private int id;
 private String description;
 private String ingredients;


 public FoodRecipe(String nameOfRecipe, int id, String description, String ingredients) {
  this.nameOfRecipe = nameOfRecipe;
  this.id = id;
  this.description = description;
  this.ingredients = ingredients;
 }

 public String getNameOfRecipe() {
  return nameOfRecipe;
 }

 public FoodRecipe() {
 }

 public void setNameOfRecipe(String nameOfRecipe) {
  this.nameOfRecipe = nameOfRecipe;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public String getIngredients() {
  return ingredients;
 }

 public void setIngredients(String ingredients) {
  this.ingredients = ingredients;
 }
}
