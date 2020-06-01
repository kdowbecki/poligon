package poligon;

import lombok.Getter;

public class App {

	@Getter
	private String version = "1";

	public static void main(String[] args) {
		System.out.println(new App().getVersion());
	}

}
