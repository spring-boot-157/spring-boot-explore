import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example<T> {

    @RequestMapping("/")
    public ResponseEntity<List<Integer>> home() {
    	List<Integer> testList =  new ArrayList<Integer>();
    	testList.add(10);
    	testList.add(11);

    	testList.add(13);

    	testList.add(6);

    	testList.add(13);

    	testList.add(10);

        return ResponseEntity.ok(testList.stream().filter(s->s>6).collect(Collectors.toList()));
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
