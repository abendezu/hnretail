/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnretail.queries;

/**
 *
 * @author abendezu
 */
public class genericSql {
    
    public String cuantos(String tabla){
        String sql = "select count(*) from "+tabla;
        return sql;
    }
    
    public String selectCampo(String campo, String tabla){
        String sql = "select "+campo+" from "+tabla;
        return sql;
    }
    
}
