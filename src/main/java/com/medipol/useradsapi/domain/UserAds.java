package com.medipol.useradsapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_ads")
public class UserAds {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userId;
    @JsonProperty("ImageUrl")
    private String imageUrl;
    @Column(length=10485760)
    private String url;
    @Column(length=10485760)
    private String adUrl;
  //  private String iFrame;
   // private Instant date;
}
//     iFrame,
//             AElement,
//             AdUrl: AElement.href,
//             ImageUrl,
//             userId,
//             url