package vn.edu.iuh.fit.www_tuan06_20002975_nguyenvanlong.backend.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_tuan06_20002975_nguyenvanlong.backend.models.Post;
import vn.edu.iuh.fit.www_tuan06_20002975_nguyenvanlong.backend.models.User;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    Page<Post> findAllByPublished(boolean published, Pageable pageable);

    List<Post> findAllByAuthorAndPublished(User author, boolean published);
}