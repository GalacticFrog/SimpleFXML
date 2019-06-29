package edu.unsch.jfxtest;

import edu.unsch.simplefxml.AbstractFxmlView;
import edu.unsch.simplefxml.FXView;

@FXView (value = "/i_do_not_exist.fxml", bundle = "testview", css = "style.css")
public class SampleIncorrectView extends AbstractFxmlView {

}
