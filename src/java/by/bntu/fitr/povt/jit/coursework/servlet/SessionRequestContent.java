package by.bntu.fitr.povt.jit.coursework.servlet;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;

public class SessionRequestContent {

    private HashMap<String, Object> requestAttributes;
    private HashMap<String, String[]> requestParameters;
    private HashMap<String, Object> sessionAttributes;

    public SessionRequestContent() {
    }

    public SessionRequestContent(HashMap<String, Object> requestAttributes, HashMap<String, String[]> requestParameters, HashMap<String, Object> sessionAttributes) {
        this.requestAttributes = requestAttributes;
        this.requestParameters = requestParameters;
        this.sessionAttributes = sessionAttributes;
    }
// конструкторы
// метод извлечения информации из запроса
    public void extractValues(HttpServletRequest request) {
        
    }
    
// метод добавления в запрос данных для передачи в jsp
    public void insertAttributes(HttpServletRequest request) {
// реализация
    }
// some methods
}
