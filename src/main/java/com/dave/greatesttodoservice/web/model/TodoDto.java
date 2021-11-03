package com.dave.greatesttodoservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoDto {

    @Null
    private UUID id;

    @Null
    private OffsetDateTime createdDate;

    @Null
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    @Size(min = 3, max = 100)
    private String todoName;

    @NotBlank
    @Size(min = 3, max = 100)
    private String doerName;

    @NotNull
    private TodoStatusEnum status;

    @NotBlank
    @Size(min = 3, max = 100)
    private String note;
}
