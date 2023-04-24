package pl.sda.OrangeJavaPL2;

import org.assertj.core.util.Sets;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.entity.BreadType;

import java.math.BigDecimal;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootTest
class OrangeJavaPl2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testTest() {
        Set<Bread> breads = Sets.set(
                new Bread("Bułka z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(4.50)),
                new Bread("Bułka z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(2.50)),
                new Bread("Bułka z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(1.50)),
                new Bread("Bułka z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(5.50)),
                new Bread("Kajzerka", BreadType.PSZENNE, BigDecimal.valueOf(199.5)),
                new Bread("Kajzerka", BreadType.PSZENNE, BigDecimal.valueOf(41.50)),
                new Bread("Kajzerka", BreadType.PSZENNE, BigDecimal.valueOf(4.50)),
                new Bread("Kajzerka", BreadType.PSZENNE, BigDecimal.valueOf(43.50)),
                new Bread("Kajzerka", BreadType.PSZENNE, BigDecimal.valueOf(46.50)),
                new Bread("Kajzerka", BreadType.PSZENNE, BigDecimal.valueOf(42.50)),
                new Bread("Kajzerka", BreadType.PSZENNE, BigDecimal.valueOf(43.50))
        );


        // filtering kajzerki
        Set<Bread> kajzerkaBread = breads.stream()
                .filter(bread -> bread.getName().equals("Kajzerka"))
                .collect(Collectors.toSet());

        System.out.println(kajzerkaBread);
        System.out.println("-----------------------------");

        // Printing all kajzerka
        breads.stream()
                .filter(bread -> bread.getName().equals("Kajzerka"))
                .forEach(System.out::println);
        System.out.println("-----------------------------");

        // Printing all sweets
        Set<Bread> sweetBreads = breads.stream()
                .filter(b -> b.getBreadType().equals(BreadType.SLODKIE))
                .collect(Collectors.toSet());
        System.out.println(sweetBreads.size());
    }


    @Test
    void bigDecimalTest() {


        BigDecimal decimal = new BigDecimal(19.12345678901);
        BigDecimal bigDecimal = BigDecimal.valueOf(19.12345678901);

        System.out.println("-------------new------------");
        System.out.println(decimal);
        System.out.println("-------------valueOf------------");
        System.out.println(bigDecimal);

    }


}
