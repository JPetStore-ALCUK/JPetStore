package org.mybatis.jpetstore.service;

import java.util.List;

import org.mybatis.jpetstore.domain.BoardElement;
import org.mybatis.jpetstore.mapper.BoardMapper;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<BoardElement> getBoardElementList() {
        return boardMapper.getBoardElementList();
    }
    public String getLastId(){
        return boardMapper.getLastId();
    }
    public BoardElement getBoardElementById(String id){
        return boardMapper.getBoardElementById(id);
    }
    public void insertBoardElement(BoardElement boardElement){
        boardMapper.insertBoardElement(boardElement);
    }
}
