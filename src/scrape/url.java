package scrape;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class url {
	
	private String url; 
	private String data; 
	private String agent; 
	private String cookie; 
	private int timeout; 
    
    public url (String Url, String Data, String Agent, String Cookie, int Timeout) 
    { 
    	    	
    } 
	  
    
    public void fetch() throws IOException 
    { 
    	 Document doc = Jsoup.connect("http://example.com")
   			  .data	("query", "Java")
   			  .userAgent("Mozilla")
   			  .cookie("auth", "token")
   			  .timeout(3000)
   			  .post(); 	
    }


	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}


	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}


	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}


	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}


	/**
	 * @return the agent
	 */
	public String getAgent() {
		return agent;
	}


	/**
	 * @param agent the agent to set
	 */
	public void setAgent(String agent) {
		this.agent = agent;
	}


	/**
	 * @return the cookie
	 */
	public String getCookie() {
		return cookie;
	}


	/**
	 * @param cookie the cookie to set
	 */
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}


	/**
	 * @return the timeout
	 */
	public int getTimeout() {
		return timeout;
	}


	/**
	 * @param timeout the timeout to set
	 */
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
    
   
}
