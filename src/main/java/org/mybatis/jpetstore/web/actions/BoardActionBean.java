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
package org.mybatis.jpetstore.web.actions;

import java.sql.Timestamp;
import java.util.List;

import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;

import org.mybatis.jpetstore.domain.BoardElement;
import org.mybatis.jpetstore.service.BoardService;

@SessionScope
public class BoardActionBean extends AbstractActionBean {

  private static final long serialVersionUID = -7439243557023842447L;

  private static final String VIEW_BOARD = "/WEB-INF/jsp/board/Board.jsp";
  private static final String VIEW_BOARD_ELEMENT = "/WEB-INF/jsp/board/BoardElement.jsp";
  private static final String VIEW_NEW_BOARD_ELEMENT_FORM = "/WEB-INF/jsp/board/NewBoardElementForm.jsp";

  @SpringBean
  private transient BoardService boardService;

  private BoardElement boardElement = new BoardElement();
  private String boardId;
  private List<BoardElement> boardElementList;

  public void setBoardElementList(List<BoardElement> boardElementList) {
    this.boardElementList = boardElementList;
  }

  public void setBoardElement(BoardElement boardElement) {
    this.boardElement = boardElement;
  }

  public void setTitle(String title) {
    this.boardElement.setTitle(title);
  }

  public void setWriter(String writer) {
    this.boardElement.setWriter(writer);
  }

  public void setText(String text) {
    this.boardElement.setText(text);
  }

  public void setBoardId(String id){
    this.boardId = id;
  }

  public String getTitle() {
    return this.boardElement.getTitle();
  }

  public Timestamp getDate() {
    return this.boardElement.getDate();
  }

  public String getWriter() {
    return this.boardElement.getWriter();
  }

  public String getText() {
    return this.boardElement.getText();
  }

  public List<BoardElement> getBoardElementList() {
    return boardElementList;
  }

  public BoardElement getBoardElement() {
    return this.boardElement;
  }

  public String getBoardId() {
    return this.boardId;
  }

  public ForwardResolution viewBoard() {
    boardElementList = boardService.getAll();
    return new ForwardResolution(VIEW_BOARD);
  }

  public ForwardResolution viewBoardElement() {
    if (boardId != null) {
      boardElement = boardService.getBoardElementById(boardId);
    }
    return new ForwardResolution(VIEW_BOARD_ELEMENT);
  }

  public ForwardResolution viewNewBoardElementForm() {
    boardElement.setDate(new Timestamp(System.currentTimeMillis()));
    return new ForwardResolution(VIEW_NEW_BOARD_ELEMENT_FORM);
  }

  public RedirectResolution insertBoardElement() {
    boardElement.setId(makeId());
    boardService.insertBoardElement(boardElement);
    boardElement = boardService.getBoardElementById(boardElement.getId());
    return new RedirectResolution(BoardActionBean.class, "viewBoard");
  }

  public String makeId() {
    String newId = null;
    String lastId = null;
    lastId = boardService.getLastId();
    if (lastId == null) {
      newId = "B00000001";
    } else {
      int order = Integer.parseInt(lastId.substring(1)) + 1;
      newId = "B" + String.format("%08d", order);
    }
    return newId;
  }

  public void clear() {
    boardElementList = null;
  }
}
