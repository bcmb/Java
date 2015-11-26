package com.multithread;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Parser {
 
	public static void main(String[] args) {
		String s = "{\"data\":{\"movies\":[{\"title\":\"The Shawshank Redemption\",\"originalTitle\":\"\",\"year\":\"1994\",\"releaseDate\":\"19941014\",\"directors\":[{\"name\":\"Frank Darabont\",\"nameId\":\"nm0001104\"}],\"writers\":[{\"name\":\"Stephen King\",\"nameId\":\"nm0000175\"},{\"name\":\"Frank Darabont\",\"nameId\":\"nm0001104\"}],\"runtime\":[\"142 min\"],\"urlPoster\":\"http://ia.media-imdb.com/images/M/MV5BODU4MjU4NjIwNl5BMl5BanBnXkFtZTgwMDU2MjEyMDE@._V1_SX214_AL_.jpg\",\"countries\":[\"USA\"],\"languages\":[\"English\"],\"genres\":[\"Crime\",\"Drama\"],\"plot\":\"Andy Dufresne is a young and successful banker whose life changes drastically when he is convicted and sentenced to life imprisonment for the murder of his wife and her lover. Set in the 1940s, the film shows how Andy, with the help of his friend Red, the prison entrepreneur, turns out to be a most unconventional prisoner.\",\"simplePlot\":\"Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.\",\"idIMDB\":\"tt0111161\",\"urlIMDB\":\"http://www.imdb.com/title/tt0111161\",\"rating\":\"9.3\",\"metascore\":\"80/100\",\"filmingLocations\":[\"St. Croix\",\"U.S. Virgin Islands\"],\"rated\":\"R\",\"votes\":\"1,559,547\",\"type\":\"Movie\",\"ranking\":1},{\"title\":\"The Godfather\",\"originalTitle\":\"\",\"year\":\"1972\",\"releaseDate\":\"19720324\",\"directors\":[{\"name\":\"Francis Ford Coppola\",\"nameId\":\"nm0000338\"}],\"writers\":[{\"name\":\"Mario Puzo\",\"nameId\":\"nm0701374\"},{\"name\":\"Francis Ford Coppola\",\"nameId\":\"nm0000338\"}],\"runtime\":[\"175 min\"],\"urlPoster\":\"http://ia.media-imdb.com/images/M/MV5BMjEyMjcyNDI4MF5BMl5BanBnXkFtZTcwMDA5Mzg3OA@@._V1_SX214_AL_.jpg\",\"countries\":[\"USA\"],\"languages\":[\"English\",\"Italian\",\"Latin\"],\"genres\":[\"Crime\",\"Drama\"],\"plot\":\"When the aging head of a famous crime family decides to transfer his position to one of his subalterns, a series of unfortunate events start happening to the family, and a war begins between all the well-known families leading to insolence, deportation, murder and revenge, and ends with the favorable successor being finally chosen.\",\"simplePlot\":\"The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.\",\"idIMDB\":\"tt0068646\",\"urlIMDB\":\"http://www.imdb.com/title/tt0068646\",\"rating\":\"9.2\",\"metascore\":\"100/100\",\"filmingLocations\":[\"NY Eye and Ear Infirmary\",\"2nd Avenue & East 13th Street\",\"New York City\",\"New York\",\"USA\"],\"rated\":\"R\",\"votes\":\"1,067,621\",\"type\":\"Movie\",\"ranking\":2}]},\"about\":{\"version\":\"2.2.0\"}}";
		JsonNagibator jn = new JsonNagibator();
		jn.nagibator(s);
		for (HashMap<String, String> x : jn.movieList) {
			System.out.println(x.containsKey(jn.MOVIE_NAME));				
			}
		}
	}


class JsonNagibator {
	   ArrayList<HashMap<String, String>> movieList = new ArrayList<>();
	    public static final String MOVIE_NAME = "title";
	    public static final String POSTER_URL = "urlPoster";
	    public static final String YEAR = "year";
	    public static final String MOVIE_ARRAY = "movies";
	    public static final String MOVIE_DATA = "data";
	    
	    public void nagibator(String s) {
	   try {
		   System.out.println("1111");
            JSONObject jsonObj = new JSONObject(s);
     	   System.out.println("1111");
            JSONObject ja = jsonObj.getJSONObject(MOVIE_DATA);
     	   System.out.println("1111");
            JSONArray mvs = ja.getJSONArray(MOVIE_ARRAY);
     	   System.out.println("1111");

            for (int i = 0; i < mvs.length(); i++) {
                JSONObject m = mvs.getJSONObject(i);
                String name = m.getString(MOVIE_NAME);
                String year = m.getString(YEAR);
                String imgUrl = m.getString(POSTER_URL);
                HashMap<String, String> movie = new HashMap<String, String>();
                // adding each child node to HashMap key => value
                movie.put(MOVIE_NAME, name);
                movie.put(YEAR, year);
                movie.put(POSTER_URL, imgUrl);
                // adding contact to contact list
                movieList.add(movie);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
	    
	
}
}
