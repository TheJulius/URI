package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;

public class Uri {
	private String url;
	private String html;
	Pessoa pessoa = new Pessoa();
	
	public String getHtml() {
		return html;
	}

	public void setHtml() {
		this.html = returnHtml();
	}

	public String getUrl() {
		return url;
	}
	
	public Uri(String url) {
		setUrl(url);
		setHtml();
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String returnHtml () {
		String any = null;
		int TAM = 50;
		String array[] = new String[TAM];
		String array2[] = new String[TAM];
		try {         
			URL url = new URL(this.url);         
			URI uri = url.toURI();          
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));          
			String s;        
			int cont = 0;
		
			while ((s = br.readLine()) != null) { 
				
				if (cont == 139) {
					array = s.split(">");
					array2 = array[1].split("</");
					pessoa.setname(array2[0]);
					any = any+"\n" + s;
					}
				
				if (cont == 146) {
					array = s.split("                ");
					array2 =array[1].split("            </li>");
					if(array2[0].equals("Desconhecido")) {
						pessoa.setplacement(array2[0]);}
					else {
						array = s.split("                ");
						array2 =array[1].split("&ordm;            </li>");
						pessoa.setplacement(array2[0]);
					}
					any = any+"\n" + s;
					}
				
				
				if (cont == 149) {
					array2 =s.split("</li>");
					if(array2[0].equals("                -            ")) {
						array2 = array2[0].split("                ");
						array2 = array2[1].split("            ");
						pessoa.setcountry(array2[0]);}
					else {
						array = s.split(">");
						array2 =array[1].split("</");
						pessoa.setcountry(array2[0]);
					}
					any = any+"\n" + s;
					}
				
				if (cont == 152) {
					array = s.split("'name'>");
					array2 =array[1].split("</");
					if(array2[0].equals("'name'><")) {
						pessoa.setfaculdade("Desconhecido");}
					else {
						pessoa.setfaculdade(array2[0]);
					}
					any = any+"\n" + s;
					}
				
				if (cont == 155) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					pessoa.setsince(array2[0]);
					any = any+"\n" + s;
					}
				
				if (cont == 158) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					pessoa.setpontuacao(array2[0]);
					any = any+"\n" + s;
					}
				
				if (cont == 161) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					pessoa.setfinished(array2[0]);
					any = any+"\n" + s;
					}
				
				if (cont == 164) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					pessoa.settried(array2[0]);
					any = any+"\n" + s;
					}
				
				if (cont == 167) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					pessoa.setsubmissions(array2[0]);
					any = any+"\n" + s;
					}
				
			  cont++;
			}
			
			br.close();      
			} 
		catch (MalformedURLException excecao) {          
			excecao.printStackTrace();      
			} 
		catch (URISyntaxException excecao) {          
			excecao.printStackTrace();      
			} 
		catch (IOException excecao) {          
			excecao.printStackTrace();      
			}
		return any;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Url [url=");
		builder.append(url);
		builder.append("]\n");
		builder.append(pessoa.toString()); 
		return builder.toString();
	}
}
