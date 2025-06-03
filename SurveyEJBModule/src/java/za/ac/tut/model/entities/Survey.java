/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class Survey implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String email;
    private Date dob;
    private String contactNumber;
    
    private String favoriteFood;
    
    private Integer countPizza;
    private Integer countPasta;
    private Integer countPapAndWors;
    private Integer countOther;
    
    private Integer age;
    
    @Column(name="RATE_OF_WATCH_MOVIE")
    private Integer countWatchMovie;
    
    @Column(name="RATE_OF_LISTEN_TO_RADIO")
    private Integer countListenRadio;
    
    @Column(name="RATE_OF_EATING_OUT")
    private Integer countEatOut;
    
    @Column(name="RATE_OF_WATCH_TV")
    private Integer countWatchTv;

    public Survey() {
    }

    public Survey(String name, String email, Date dob, String contactNumber, String favoriteFood, Integer countPizza, Integer countPasta, Integer countPapAndWors, Integer countOther, Integer age, Integer countWatchMovie, Integer countListenRadio, Integer countEatOut, Integer countWatchTv) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.contactNumber = contactNumber;
        this.favoriteFood = favoriteFood;
        this.countPizza = countPizza;
        this.countPasta = countPasta;
        this.countPapAndWors = countPapAndWors;
        this.countOther = countOther;
        this.age = age;
        this.countWatchMovie = countWatchMovie;
        this.countListenRadio = countListenRadio;
        this.countEatOut = countEatOut;
        this.countWatchTv = countWatchTv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public Integer getCountPizza() {
        return countPizza;
    }

    public void setCountPizza(Integer countPizza) {
        this.countPizza = countPizza;
    }

    public Integer getCountPasta() {
        return countPasta;
    }

    public void setCountPasta(Integer countPasta) {
        this.countPasta = countPasta;
    }

    public Integer getCountPapAndWors() {
        return countPapAndWors;
    }

    public void setCountPapAndWors(Integer countPapAndWors) {
        this.countPapAndWors = countPapAndWors;
    }

    public Integer getCountOther() {
        return countOther;
    }

    public void setCountOther(Integer countOther) {
        this.countOther = countOther;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCountWatchMovie() {
        return countWatchMovie;
    }

    public void setCountWatchMovie(Integer countWatchMovie) {
        this.countWatchMovie = countWatchMovie;
    }

    public Integer getCountListenRadio() {
        return countListenRadio;
    }

    public void setCountListenRadio(Integer countListenRadio) {
        this.countListenRadio = countListenRadio;
    }

    public Integer getCountEatOut() {
        return countEatOut;
    }

    public void setCountEatOut(Integer countEatOut) {
        this.countEatOut = countEatOut;
    }

    public Integer getCountWatchTv() {
        return countWatchTv;
    }

    public void setCountWatchTv(Integer countWatchTv) {
        this.countWatchTv = countWatchTv;
    }

    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Survey)) {
            return false;
        }
        Survey other = (Survey) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.model.entities.Survey[ id=" + id + " ]";
    }
    
}
