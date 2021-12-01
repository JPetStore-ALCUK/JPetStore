/*
 *    Copyright 2010-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.jpetstore.service;

import java.util.List;

import org.mybatis.jpetstore.domain.BoardElement;
import org.mybatis.jpetstore.mapper.BoardMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardService {
    private final BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<BoardElement> getAll() {
        return boardMapper.getAll();
    }

    public String getLastId() {
        return boardMapper.getLastId();
    }

    public BoardElement getBoardElementById(String id) {
        return boardMapper.getBoardElementById(id);
    }

    @Transactional
    public void insertBoardElement(BoardElement boardElement) {
        boardMapper.insertBoardElement(boardElement);
    }
}