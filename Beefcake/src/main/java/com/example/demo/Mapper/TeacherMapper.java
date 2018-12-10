package com.example.demo.Mapper;

import com.example.demo.Entity.QuestionEntity;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface TeacherMapper {
    public List<QuestionEntity> extractQuestion(@Param("seminarId")Long seminarId, @Param("presentId")Long presentId);

    public Boolean scoreQuestion(@Param("seminarId")Long seminarId,@Param("presentId")Long presentId,@Param("studentId")Long studentId,@Param("score")BigDecimal score);
}
