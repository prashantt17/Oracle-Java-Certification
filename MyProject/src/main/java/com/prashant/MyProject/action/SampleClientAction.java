package com.prashant.MyProject.action;

import org.springframework.stereotype.Component;
import pl.bristleback.server.bristle.api.action.SendCondition;
import pl.bristleback.server.bristle.api.annotations.ClientAction;
import pl.bristleback.server.bristle.api.annotations.ClientActionClass;
import pl.bristleback.server.bristle.security.authorisation.conditions.AllUsersCondition;

@ClientActionClass
@Component
public class SampleClientAction {

  @ClientAction
  public SendCondition sayHello(String helloWorld) {
    return AllUsersCondition.getInstance();
  }
}
