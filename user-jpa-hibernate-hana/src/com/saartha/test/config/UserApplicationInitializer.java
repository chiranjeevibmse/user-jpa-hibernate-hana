/*
 * Copyright (c) 2015, Saartha and/or its affiliates. All rights reserved.
 * Saartha Labs PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */
package com.saartha.test.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Chiranjeevi
 * @CreatedOn May 10, 2016
 * @ModifiedBy Chiranjeevi
 * @ModifiedOn May 10, 2016
 * @since 0.0.1
 */
public class UserApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[] { SpringAppConfig.class,HibernateConfig.class};
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return null;
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }
}
