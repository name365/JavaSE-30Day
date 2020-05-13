package github;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
/**
 * @author subei
 * @create 2020-05-11 11:47
 */
@Inherited
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotation {

    String value() default "hello";

}
