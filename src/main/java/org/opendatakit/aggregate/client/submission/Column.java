/*
 * Copyright (C) 2011 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.aggregate.client.submission;

import java.io.Serializable;

import org.opendatakit.aggregate.constants.common.UIDisplayType;

public class Column implements Serializable {
  /**
   * Serialization Identifier
   */
  private static final long serialVersionUID = -5276405259406410364L;
  
  private String displayHeader;
  private String columnEncoding;
  private Long geopointColumnCode;
  private UIDisplayType uiDisplayType;

  public Column() {
	  uiDisplayType = UIDisplayType.TEXT;
  }
  
  public Column(String displayHeader, String columnName, UIDisplayType displayType) {
    this.displayHeader = displayHeader;
    this.columnEncoding = columnName;
    uiDisplayType = displayType;
  }

  public Column(String displayHeader, String columnName, Long geopointColumnCode) {
    this.displayHeader = displayHeader;
    this.columnEncoding = columnName;
    this.geopointColumnCode = geopointColumnCode;
    uiDisplayType = UIDisplayType.TEXT;
  }
  
  public String getDisplayHeader() {
    return displayHeader;
  }

  public String getColumnEncoding() {
    return columnEncoding;
  }
  
  public Long getGeopointColumnCode() {
    return geopointColumnCode;
  }
  
  public UIDisplayType getUiDisplayType() {
	return uiDisplayType;
  }
  
  /**
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Column)) {
      return false;
    }
    
    
    Column other = (Column) obj;
    return (displayHeader == null ? (other.displayHeader == null) : (displayHeader.equals(other.displayHeader)))
        && (columnEncoding == null ? (other.columnEncoding == null) : (columnEncoding.equals(other.columnEncoding)))
        && (geopointColumnCode == null ? (other.geopointColumnCode == null) : (geopointColumnCode.equals(other.geopointColumnCode)))
        && (uiDisplayType == null ? (other.uiDisplayType == null) : (uiDisplayType.equals(other.uiDisplayType)));
  }

  /**
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    int hashCode = 11;
    if (displayHeader != null)
      hashCode += displayHeader.hashCode();
    if (columnEncoding != null)
      hashCode += columnEncoding.hashCode();
    if (geopointColumnCode != null)
      hashCode += geopointColumnCode.hashCode();
    if(uiDisplayType != null)
      hashCode += uiDisplayType.hashCode();
    return hashCode;
  }
}