package ru.tinkoff.scrapper.repository;

import org.springframework.stereotype.Repository;
import ru.tinkoff.scrapper.enyity.LinkEntity;

import java.util.List;

@Repository
public interface LinkRepository {

    List<LinkEntity> findAll();

    List<LinkEntity> findLinkById(Long id);

    List<LinkEntity> findAllOrderByDate();

    List<LinkEntity> findByURI(String link);

    Long add(String link);

    List<LinkEntity> findTrackedLinks(Long chatId);

    void addLinkToChat(Long chatId, Long linkId);

    boolean isRecordExistsByLinkIdAndTgChatId(Long linkId, Long chatId);

    void updateLinksDateTimeToNow(List<LinkEntity> links);
}
