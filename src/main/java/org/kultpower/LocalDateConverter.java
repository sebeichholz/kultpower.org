package org.kultpower;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

   @Override
   public java.sql.Date convertToDatabaseColumn(java.time.LocalDate attribute) {
      return attribute == null ? null : java.sql.Date.valueOf(attribute);
   }

   @Override
   public java.time.LocalDate convertToEntityAttribute(java.sql.Date dbData) {
    return dbData == null ? null : dbData.toLocalDate();
   }
}