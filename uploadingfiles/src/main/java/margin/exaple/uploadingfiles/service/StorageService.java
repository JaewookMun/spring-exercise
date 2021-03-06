package margin.exaple.uploadingfiles.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

    void init();

    void store(MultipartFile multipartFile);

    Stream<Path> loadAll();

    Path load(String fileName);

    Resource loadAsResource(String fileName);

    void deleteAll();
}
