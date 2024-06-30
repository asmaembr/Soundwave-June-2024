package ma.soundwave.catalogcontext.application.mapper;
import ma.soundwave.catalogcontext.application.dto.SaveSongDTO;
import ma.soundwave.catalogcontext.application.dto.SongContentDTO;
import ma.soundwave.catalogcontext.domain.SongContent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SongContentMapper {

    @Mapping(source = "song.publicId", target = "publicId")
    SongContentDTO songContentToSongContentDTO(SongContent songContent);

    SongContent saveSongDTOToSong(SaveSongDTO songDTO);
}
