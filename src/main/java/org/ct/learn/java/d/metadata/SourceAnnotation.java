/**
 * 
 */
package org.ct.learn.java.d.metadata;

import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(SOURCE)
@Target(LOCAL_VARIABLE)
/**
 * @author lenovo
 *
 */
public @interface SourceAnnotation {

}
