package com.cours644_1.maa_bom.ittrainingapp.DataObjects;

import java.util.Objects;

/**
 * Created by arnaud on 14.11.2015.
 */
public class Cours implements Comparable<Cours>{
    protected CoursData data;

    Cours(CoursData data){
        this.data= data;
    }

    public int getId(){
        return data.id;
    }
    public String getName(){
        return data.name;
    }
    public String getDescription(){
        return data.description;
    }
    public CoursModificator getModificator() {
        return new CoursModificator(data.getCopie());
    }

    void update (CoursData data){
        if(this.data.id== data.id)
            this.data=data;
    }

    public SessionModificator getNewSession(){
        SessionModificator respons =Session.getDefault(this);
        respons.setCours(this);
        return respons;
    }

    @Override
    public String toString(){
        return data.name;
    }
    public static  CoursModificator newForCreation(){
        return new CoursModificator(CoursData.getDefault());
    }

    @Override
    public int compareTo(Cours another) {
        return this.data.name.compareTo(another.data.name);
    }

    @Override
    public boolean equals(Object o){
        try {
            return this.data.id==((Cours)o).data.id;
        }catch (Exception e) {}
        return false;

    }
}
