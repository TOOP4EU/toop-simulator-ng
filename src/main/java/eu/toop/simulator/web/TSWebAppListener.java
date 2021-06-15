/**
 * Copyright 2021 - TOOP Project
 *
 * This file and its contents are licensed under the EUPL, Version 1.2
 * or – as soon they will be approved by the European Commission – subsequent
 * versions of the EUPL (the "Licence");
 *
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 *       https://joinup.ec.europa.eu/collection/eupl/eupl-text-eupl-12
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package eu.toop.simulator.web;

import javax.annotation.Nonnull;
import javax.servlet.ServletContext;

import com.helger.photon.api.IAPIRegistry;
import com.helger.photon.core.servlet.WebAppListener;

import eu.toop.connector.app.TCInit;
import eu.toop.connector.webapi.TCAPIInit;

/**
 * Global startup etc. listener.
 * 
 * @author yerlibilgin
 */
public class TSWebAppListener extends WebAppListener
{
  @Override
  protected void afterContextInitialized (final ServletContext aSC)
  {
    TCInit.initGlobally (aSC);
  }

  @Override
  protected void initAPI (@Nonnull final IAPIRegistry aAPIRegistry)
  {
    System.out.println("Init api");
    TCAPIInit.initAPI (aAPIRegistry);
  }

  @Override
  protected void beforeContextDestroyed (final ServletContext aSC)
  {
    TCInit.shutdownGlobally (aSC);
  }
}
