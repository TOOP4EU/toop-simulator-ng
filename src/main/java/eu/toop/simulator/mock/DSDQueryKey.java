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
package eu.toop.simulator.mock;

import java.util.Objects;

/**
 * This class is used as a KEY for the DSD queries.
 */
public class DSDQueryKey {
  private String datasetType;
  private String countryCode;

  /**
   * Instantiates a new Dsd query key.
   */
  public DSDQueryKey() {
  }

  /**
   * Instantiates a new Dsd query key.
   *
   * @param datasetType the dataset type
   * @param countryCode the country code
   */
  public DSDQueryKey(String datasetType, String countryCode) {
    this.datasetType = datasetType;
    this.countryCode = countryCode;
  }

  /**
   * Gets dataset type.
   *
   * @return the dataset type
   */
  public String getDatasetType() {
    return datasetType;
  }

  /**
   * Sets dataset type.
   *
   * @param datasetType the dataset type
   */
  public void setDatasetType(String datasetType) {
    this.datasetType = datasetType;
  }

  /**
   * Gets country code.
   *
   * @return the country code
   */
  public String getCountryCode() {
    return countryCode;
  }

  /**
   * Sets country code.
   *
   * @param countryCode the country code
   */
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DSDQueryKey that = (DSDQueryKey) o;
    return Objects.equals(datasetType, that.datasetType) &&
        Objects.equals(countryCode, that.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetType, countryCode);
  }
}
