package io.security.corespringsecurity.service;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.util.matcher.RequestMatcher;

import java.util.LinkedHashMap;
import java.util.List;

public interface SecurityResourceService {
    LinkedHashMap<RequestMatcher, List<ConfigAttribute>> getResourceList();
    LinkedHashMap<String, List<ConfigAttribute>> getMethodResourceList();
    LinkedHashMap<String, List<ConfigAttribute>> getPointcutResourceList();
    List<String> getAccessIpList();
}
