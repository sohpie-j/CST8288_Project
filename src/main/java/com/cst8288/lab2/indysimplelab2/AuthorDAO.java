package com.cst8288.lab2.indysimplelab2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.List;
/**
 *
 * @author kajan
 */
public interface AuthorDAO {
    List<AuthorDTO> getWinners(int offset, int limit); // Pagination
    
     /**
     * Adds a new winner to the database.
     * @param winner The winner to add.
     * @return true if the operation was successful, otherwise false.
     */
    boolean addWinner(AuthorDTO winner);
}