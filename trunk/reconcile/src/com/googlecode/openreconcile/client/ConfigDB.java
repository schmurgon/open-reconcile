package com.googlecode.openreconcile.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.googlecode.openreconcile.client.datatypes.DatabaseData;

public interface ConfigDB extends RemoteService{
	/**
	 * Gets a list of accessible tables in the database. 
	 * 
	@param inputs A DatabaseData object that contains information for creating a connection to a database.
	 *                           	                          
	@return An ArrayList<String> of table names. The first entry 
	 * of the ArrayList is a "1" or a "0", a "1" signifies a successful execution. If there are any errors 
	 * the ArrayList will contain two entries, a "0" and the exception caught.
	 *  
	 */
	public ArrayList<String> getTables (DatabaseData inputs);
	/**
	 * Gets a list of accessible columns in the selected table from the database. 
	 * 
	@param  inputs A DatabaseData object that contains information for creating a connection to a database and the name of the table in question.
	 *                           	                          
	@return An ArrayList<String> of column names. The first entry 
	* of the ArrayList is a "1" or a "0", a "1" signifies a successful execution. If there are any errors 
	* the ArrayList will contain two entries, a "0" and the exception caught.
	 *  
	 */
	public ArrayList<String> getColumns (DatabaseData inputs);
	/**
	 * Gets a list of accessible tables in the database. 
	 * 
	@param inputs A DatabaseData object containing information to be added to the configuration file.
	 *                          	                          
	@return An ArrayList of Strings.  The first entry of the ArrayList is a "1" or a "0",
	 *  a "1" signifies a successful execution. If there are any errors 
	 * the ArrayList will contain two entries, a "0" and the exception caught.
	 *  
	 */
	public ArrayList<String> addEntry (DatabaseData inputs);

	/**
	 * Returns all data in the configuration file 
	 *     	                          
	@return An ArrayList<String[]> of the data, each String[] contains all the 
	 * entries for one entry in the file.
	 *  
	 */
	public ArrayList<String[]> getCurrent ();
	/**
	 * Deletes an entry out of the configuration file
	 * 
	@param primaryKey This is the primary key for the entry which is to be deleted.
	 *                    	                          
	@return An ArrayList<String> that will have 1 or 2 entries. The first entry will be either a "1" signaling a
	 * successful execution, or a "0" indicating an exception was thrown. The second entry will be the exception, if any, that
	 * was thrown.
	 *  
	 */
	public ArrayList<String> deleteThisEntry(String primaryKey);
	/**
	 * Gets a "preview" of vocab terms from database entry.
	 * 
	@param primaryKey This is the primary key for the entry in the config file for which the data is desired.
	 *                    	                          
	@return An ArrayList<String> that will have 2 or 12 entries. The first entry will be either a "1" signaling a
	 * successful execution, or a "0" indicating an exception was thrown. The second entry will be the exception, if any, that
	 * was thrown, or the Vocab Name. If it was successful the next 10 entires are ten entries from the vocab.
	 *  
	 */
	public ArrayList<String> getPreview(String primaryKey);
}