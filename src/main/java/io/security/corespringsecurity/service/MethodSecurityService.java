package io.security.corespringsecurity.service;

import java.lang.reflect.InvocationTargetException;

public interface MethodSecurityService {

    void addMethodSecured(String className, String roleName) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, Exception;

    void removeMethodSecured(String className) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, Exception;
}
