package com.cst8288.lab2.indysimplelab2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.List;
/**
 * The AuthorDAO interface defines methods for managing author data in the context of a database.
 * It provides functionality to retrieve and add information about authors who are award winners.
 * 
 * <p>This interface follows the Data Access Object (DAO) pattern, separating database operations
 * from the business logic to ensure better modularity and maintainability.</p>
 * 
 * @author kajan
 * @version 1.0
 */
public interface AuthorDAO {

    /**
     * Retrieves a paginated list of authors who are winners.
     * 
     * @param offset The starting point for the records to fetch.
     * @param limit The maximum number of records to retrieve.
     * @return A list of {@code AuthorDTO} objects representing the winners.
     */
    List<AuthorDTO> getWinners(int offset, int limit);

    /**
     * Adds a new winner to the database.
     * 
     * @param winner An {@code AuthorDTO} object representing the winner to add.
     * @return {@code true} if the operation was successful, otherwise {@code false}.
     */
    boolean addWinner(AuthorDTO winner);
}
