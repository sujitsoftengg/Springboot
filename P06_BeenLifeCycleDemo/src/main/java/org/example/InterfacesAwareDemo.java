package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// Interface Aware Stage - It is also BeenLifeCycle part

@Component
public class InterfacesAwareDemo implements BeanNameAware, ApplicationContextAware {


    @Override
    public void setBeanName(String name) {
        System.out.println("Been Name : " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context is name : " + applicationContext.getClass());
    }

}
