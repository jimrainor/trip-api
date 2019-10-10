package jp.co.a7.trip.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JSONUtility {

  public static Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();

  public static ObjectMapper objectMapper = null;

  static {
    builder.featuresToEnable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    objectMapper = builder.build();
  }

  public static String serialize(Object object) {
    try {
      return objectMapper.writer().writeValueAsString(object);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  public static byte[] serializeToByte(Object object) {
    return serialize(object).getBytes(StandardCharsets.UTF_8);
  }

  public static <T> T deSerialize(byte[] json, Class<T> clazz) {
    return deSerialize(new String(json, StandardCharsets.UTF_8), clazz);
  }

  public static <T> T deSerialize(String json, Class<T> clazz) {
    try {
      return objectMapper.readValue(json, clazz);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static <T> List<T> deSerializeList(String json, Class<T> clazz) {
    try {
      JavaType listType = objectMapper.getTypeFactory().constructCollectionType(List.class, clazz);
      return objectMapper.readValue(json, listType);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static <T> List<T> deSerializeList(byte[] json, Class<T> clazz) {
    return deSerializeList(new String(json, StandardCharsets.UTF_8), clazz);
  }
}
