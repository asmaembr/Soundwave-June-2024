package ma.soundwave.catalogcontext.application.dto;

import ma.soundwave.catalogcontext.application.vo.SongAuthorVO;
import ma.soundwave.catalogcontext.application.vo.SongTitleVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record SaveSongDTO(@Valid SongTitleVO title,
                          @Valid SongAuthorVO author,
                          @NotNull byte[] cover,
                          @NotNull String coverContentType,
                          @NotNull byte[] file,
                          @NotNull String fileContentType) {
}
