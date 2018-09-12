/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauravdahal.control;

import org.openide.modules.OnStart;
import org.openide.windows.WindowManager;
import org.openide.windows.WindowSystemEvent;
import org.openide.windows.WindowSystemListener;

/**
 *
 * @author Saurav Dahal <saurav@mekonginstitute.org>
 */
@OnStart
public class Installer implements Runnable, WindowSystemListener {
  @Override
  public void run(){
      WindowManager.getDefault().addWindowSystemListener(this);
  }
  
  @Override
  public void beforeLoad(WindowSystemEvent wse){
      WindowManager.getDefault().setRole("modules");
      WindowManager.getDefault().setRole("welcome");
      WindowManager.getDefault().removeWindowSystemListener(this);
  }
  
  @Override
  public void afterLoad(WindowSystemEvent wse){
      
  }
  
  @Override
  public void beforeSave(WindowSystemEvent wse){
      
  }
  
  @Override
  public void afterSave(WindowSystemEvent wse){
      
  }
}
