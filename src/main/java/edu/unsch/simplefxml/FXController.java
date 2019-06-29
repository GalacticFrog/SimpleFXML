package edu.unsch.simplefxml;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.stereotype.Component;

/**
 * The annotation {@link FXController} is used to mark JavaFX controller
 * classes. Usage of this annotation happens besides registration of such within
 * fxml descriptors.
 *
 * @author Wilber Flores
 */
@Component
@Retention(RetentionPolicy.RUNTIME)
public @interface FXController {

}
