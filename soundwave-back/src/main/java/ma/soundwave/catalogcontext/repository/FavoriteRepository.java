package ma.soundwave.catalogcontext.repository;

import ma.soundwave.catalogcontext.domain.Favorite;
import ma.soundwave.catalogcontext.domain.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
    List<Favorite> findAllByUserEmailAndSongPublicIdIn(String email, List<UUID> songPublicIds);

    void deleteBySongPublicId(UUID publicId);

}
