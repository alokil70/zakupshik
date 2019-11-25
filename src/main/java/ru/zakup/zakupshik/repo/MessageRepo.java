package ru.zakup.zakupshik.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zakup.zakupshik.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
