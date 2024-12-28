package lms.mvctest.mvc;

public interface HandlerMapping {
    Object findHandler(HandlerKey handlerKey);
}