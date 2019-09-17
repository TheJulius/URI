package uri;

public class Pessoa {
	private String name;
	private String placement;
	private String country;
	private String faculdade;
	private String since;
	private String pontuacao;
	private String finished;
	private String tried;
	private String submissions;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getplacement() {
		return placement;
	}
	public void setplacement(String placement) {
		this.placement = placement;
	}
	public String getcountry() {
		return country;
	}
	public void setcountry(String country) {
		this.country = country;
	}
	public String getfaculdade() {
		return faculdade;
	}
	public void setfaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	public String getsince() {
		return since;
	}
	public void setsince(String since) {
		this.since = since;
	}
	public String getpontuacao() {
		return pontuacao;
	}
	public void setpontuacao(String pontuacao) {
		this.pontuacao = pontuacao;
	}
	public String getfinished() {
		return finished;
	}
	public void setfinished(String finished) {
		this.finished = finished;
	}
	public String gettried() {
		return tried;
	}
	public void settried(String tried) {
		this.tried = tried;
	}
	public String getsubmissions() {
		return submissions;
	}
	public void setsubmissions(String subimissoes) {
		this.submissions = subimissoes;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [name=");
		builder.append(name);
		builder.append(", Posição=");
		builder.append(placement);
		builder.append(", País=");
		builder.append(country);
		builder.append(", faculdade=");
		builder.append(faculdade);
		builder.append(", since=");
		builder.append(since);
		builder.append(", pontuacao=");
		builder.append(pontuacao);
		builder.append(", finished=");
		builder.append(finished);
		builder.append(", tried=");
		builder.append(tried);
		builder.append(", Submissões=");
		builder.append(submissions);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}