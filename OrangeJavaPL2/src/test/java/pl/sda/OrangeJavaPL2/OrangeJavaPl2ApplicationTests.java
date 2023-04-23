package pl.sda.OrangeJavaPL2;

import org.assertj.core.util.Sets;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.sda.OrangeJavaPL2.entity.Bread;

import java.util.stream.Collectors;

@SpringBootTest
class OrangeJavaPl2ApplicationTests {

	@Test
	void contextLoads() {
	}

//	@Test
//	void testTest() {
//
//
//		Set<Bread> breads = Sets.set(
//				new Bread("Wieloziarnisty", 4.50),
//				new Bread("Wieloziarnisty", 2.50),
//				new Bread("Wieloziarnisty", 1.50),
//				new Bread("Wieloziarnisty", 5.50),
//				new Bread("Wieloziarnisty", 199.50),
//				new Bread("Wieloziarnisty", 41.50),
//				new Bread("Wieloziarnisty", 4.50),
//				new Bread("Wieloziarnisty", 43.50),
//				new Bread("Wieloziarnisty", 46.50),
//				new Bread("Wieloziarnisty", 42.50),
//				new Bread("Wieloziarnisty", 43.50)
//		);
//
//		Set<Bread> expensiveBreads= breads
//				.stream()
//				.filter(p -> p.getPrice() > 40)
//				.collect(Collectors.toSet());
//
//		System.out.println(expensiveBreads);
//	}

}
