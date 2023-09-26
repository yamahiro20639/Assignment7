package restapi.Assignment7;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.awt.*;

@RestController
public class BirthDayController {
    @GetMapping("/birthdays")
    public List<BirthdayResponse> getBirthDay() {
        //List<BirthdayResponse>はリスト型
        List<BirthdayResponse> birthday = List.of(
                new BirthdayResponse("sasaki", 6, 21),
                new BirthdayResponse("aoki", 3, 12),
                new BirthdayResponse("namiki", 4, 1),
                new BirthdayResponse("saezima", 10, 22)
        );
        return birthday;
    }

    @GetMapping("/persons")
    public List<PersonName> getName() {
        //PersonNameはクラス型
        PersonName person1 = new PersonName("Jhon", 22);
        PersonName person2 = new PersonName("mike", 34);

        List<PersonName> persons = List.of(
                person1, person2
        );
        return persons;
    }

    @PostMapping("/persons")
    public String createName(@RequestBody PersonNameRequest personNameRequest) {
        return "Post完了しました！";
    }
}

