/**
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator;

import com.google.inject.Injector;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.util.XtextVersion;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.generator.IGuiceAwareGeneratorComponent;
import org.eclipse.xtext.xtext.generator.model.TypeReference;
import org.eclipse.xtext.xtext.generator.model.annotations.IClassAnnotation;

/**
 * Configuration object for generated code.
 */
@SuppressWarnings("all")
public class CodeConfig implements IGuiceAwareGeneratorComponent {
  private final static String FILE_HEADER_VAR_TIME = "${time}";
  
  private final static String FILE_HEADER_VAR_DATE = "${date}";
  
  private final static String FILE_HEADER_VAR_YEAR = "${year}";
  
  private final static String FILE_HEADER_VAR_USER = "${user}";
  
  private final static String FILE_HEADER_VAR_VERSION = "${version}";
  
  @Accessors
  private String encoding = Charset.defaultCharset().name();
  
  @Accessors
  private String lineDelimiter = Strings.newLine();
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String fileHeader;
  
  private String fileHeaderTemplate = "/*\n * generated by Xtext\n */";
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private final List<IClassAnnotation> classAnnotations = CollectionLiterals.<IClassAnnotation>newArrayList();
  
  @Accessors
  private boolean preferXtendStubs = true;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private XtextVersion xtextVersion;
  
  /**
   * Configure a template for file headers. The template can contain variables:
   * <ul>
   *   <li><code>${time}</code> - the current time of the day (hour:minute:second)</li>
   *   <li><code>${date}</code> - the current date (month day, year)</li>
   *   <li><code>${year}</code> - the current year</li>
   *   <li><code>${user}</code> - the content of the 'user.name' system property</li>
   *   <li><code>${version}</code> - the generator bundle version</li>
   * </ul>
   */
  public void setFileHeader(final String fileHeaderTemplate) {
    this.fileHeaderTemplate = fileHeaderTemplate;
  }
  
  /**
   * Class annotations are used to configure specific Java annotations to be added to each generated class.
   */
  public void addClassAnnotation(final IClassAnnotation annotation) {
    this.classAnnotations.add(annotation);
  }
  
  @Override
  public void initialize(final Injector injector) {
    injector.injectMembers(this);
    this.xtextVersion = XtextVersion.getCurrent();
    if ((this.lineDelimiter == null)) {
      this.lineDelimiter = "\n";
    }
    String fileHeader = this.fileHeaderTemplate;
    if ((fileHeader != null)) {
      boolean _contains = fileHeader.contains(CodeConfig.FILE_HEADER_VAR_TIME);
      if (_contains) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date _date = new Date();
        final String time = dateFormat.format(_date);
        fileHeader = fileHeader.replace(CodeConfig.FILE_HEADER_VAR_TIME, time);
      }
      boolean _contains_1 = fileHeader.contains(CodeConfig.FILE_HEADER_VAR_DATE);
      if (_contains_1) {
        final SimpleDateFormat dateFormat_1 = new SimpleDateFormat("MMM d, yyyy");
        Date _date_1 = new Date();
        final String date = dateFormat_1.format(_date_1);
        fileHeader = fileHeader.replace(CodeConfig.FILE_HEADER_VAR_DATE, date);
      }
      boolean _contains_2 = fileHeader.contains(CodeConfig.FILE_HEADER_VAR_YEAR);
      if (_contains_2) {
        final SimpleDateFormat dateFormat_2 = new SimpleDateFormat("yyyy");
        Date _date_2 = new Date();
        final String year = dateFormat_2.format(_date_2);
        fileHeader = fileHeader.replace(CodeConfig.FILE_HEADER_VAR_YEAR, year);
      }
      boolean _contains_3 = fileHeader.contains(CodeConfig.FILE_HEADER_VAR_USER);
      if (_contains_3) {
        final String user = System.getProperty("user.name");
        if ((user != null)) {
          fileHeader = fileHeader.replace(CodeConfig.FILE_HEADER_VAR_USER, user);
        }
      }
      boolean _contains_4 = fileHeader.contains(CodeConfig.FILE_HEADER_VAR_VERSION);
      if (_contains_4) {
        fileHeader = fileHeader.replace(CodeConfig.FILE_HEADER_VAR_VERSION, this.xtextVersion.toString());
      }
    }
    this.fileHeader = fileHeader;
  }
  
  public String getClassAnnotationsAsString() {
    boolean _isEmpty = this.classAnnotations.isEmpty();
    if (_isEmpty) {
      return null;
    }
    final StringBuilder stringBuilder = new StringBuilder();
    for (final IClassAnnotation annotation : this.classAnnotations) {
      stringBuilder.append(annotation.toString()).append(Strings.newLine());
    }
    return stringBuilder.toString();
  }
  
  public String getAnnotationImportsAsString() {
    boolean _isEmpty = this.classAnnotations.isEmpty();
    if (_isEmpty) {
      return null;
    }
    final StringBuilder stringBuilder = new StringBuilder();
    for (final IClassAnnotation annotation : this.classAnnotations) {
      {
        final TypeReference importString = annotation.getAnnotationImport();
        if ((importString != null)) {
          stringBuilder.append("import ").append(importString).append(";").append(Strings.newLine());
        }
      }
    }
    return stringBuilder.toString();
  }
  
  @Pure
  public String getEncoding() {
    return this.encoding;
  }
  
  public void setEncoding(final String encoding) {
    this.encoding = encoding;
  }
  
  @Pure
  public String getLineDelimiter() {
    return this.lineDelimiter;
  }
  
  public void setLineDelimiter(final String lineDelimiter) {
    this.lineDelimiter = lineDelimiter;
  }
  
  @Pure
  public String getFileHeader() {
    return this.fileHeader;
  }
  
  @Pure
  public List<IClassAnnotation> getClassAnnotations() {
    return this.classAnnotations;
  }
  
  @Pure
  public boolean isPreferXtendStubs() {
    return this.preferXtendStubs;
  }
  
  public void setPreferXtendStubs(final boolean preferXtendStubs) {
    this.preferXtendStubs = preferXtendStubs;
  }
  
  @Pure
  public XtextVersion getXtextVersion() {
    return this.xtextVersion;
  }
}
