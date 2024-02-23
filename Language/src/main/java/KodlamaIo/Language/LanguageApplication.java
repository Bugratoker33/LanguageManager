package KodlamaIo.Language;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class LanguageApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanguageApplication.class, args);

	}
	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}

}
