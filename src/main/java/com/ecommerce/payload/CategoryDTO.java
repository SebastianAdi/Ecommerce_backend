package com.ecommerce.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CategoryDTO {
    private Long categoryId;

    @NotBlank(message = "Category name can not be blank")
    @Size(min = 5, message = "Category name must be at least 5 characters long")
    private String categoryName;
}
