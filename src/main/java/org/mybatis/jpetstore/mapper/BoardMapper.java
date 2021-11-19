package org.mybatis.jpetstore.mapper;

import org.mybatis.jpetstore.domain.BoardElement;

import java.util.List;

public interface BoardMapper {
    List<BoardElement> getBoardElementList();
    String getLastId();
    BoardElement getBoardElementById(String id);
    void insertBoardElement(BoardElement boardElement);
}
