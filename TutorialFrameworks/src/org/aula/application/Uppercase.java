package org.aula.application;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.cbsoft.framework.FormatterImplementation;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@FormatterImplementation(UppercaseFormatter.class)
public @interface Uppercase {

}
