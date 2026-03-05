package guru.springframework;

import guru.springframework.domain.Person;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

public interface PersonRepository {
    Mono<Person> getById(Integer id);
    Flux<Person> getAll();
}
