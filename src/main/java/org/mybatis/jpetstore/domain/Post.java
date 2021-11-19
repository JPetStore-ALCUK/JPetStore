/*
 *    Copyright 2010-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.jpetstore.domain;

import java.util.Date;

public class Post {
  private String title;
  private Date date;
  private String writer;
  private String text;
  private String id;

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setId(String id){this.id = id;}

  public String getTitle() {
    return this.title;
  }

  public Date getDate() {
    return this.date;
  }

  public String getWriter() {
    return this.writer;
  }

  public String getText() {
    return this.text;
  }

  public String getId(){return this.id;};

}
