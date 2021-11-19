package org.mybatis.jpetstore.web.actions;

import java.util.List;

import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;

import org.mybatis.jpetstore.domain.BoardElement;
import org.mybatis.jpetstore.service.BoardService;

import javax.servlet.http.HttpSession;

@SessionScope
public class BoardActionBean extends AbstractActionBean {

    private static final long serialVersionUID = -7439243557023842447L;

    private static final String VIEW_BOARD = "/WEB-INF/jsp/board/Board.jsp";
    private static final String VIEW_BOARD_ELEMENT_FORM ="/WEB-INF/jsp/board/NewBoardElementForm.jsp";

    @SpringBean
    private transient BoardService boardService;

    private List<BoardElement> boardElementList;
    private BoardElement newBoardElement = new BoardElement();

    public List<BoardElement> getBoardElementList() {
        return boardElementList;
    }

    public ForwardResolution viewBoard() {
        System.out.println("*");
        boardElementList = boardService.getBoardElementList();
        return new ForwardResolution(VIEW_BOARD);
    }
    public ForwardResolution viewBoardElementForm(){
        return new ForwardResolution(VIEW_BOARD_ELEMENT_FORM);
    }

    //public Resolution insertBoardElement() {
    //  HttpSession session = context.getRequest().getSession();

        /*
        if (shippingAddressRequired) {
            shippingAddressRequired = false;
            return new ForwardResolution(SHIPPING);
        } else if (!isConfirmed()) {
            return new ForwardResolution(CONFIRM_ORDER);
        } else if (getOrder() != null) {
            orderService.insertOrder(order);
            CartActionBean cartBean = (CartActionBean) session.getAttribute("/actions/Cart.action");
            cartBean.clear();
            setMessage("Thank you, your order has been submitted.");
            return new ForwardResolution(VIEW_ORDER);
        } else {
            setMessage("An error occurred processing your order (order was null).");
            return new ForwardResolution(ERROR);
        }
        */
    //return new ForwardResolution();
    //}

    public void clear(){
        boardElementList = null;
    }
}
