package br.com.uol.pagseguro.api.common.domain.xml;

import javax.xml.bind.annotation.XmlElement;

import br.com.uol.pagseguro.api.common.domain.SenderDocument;

/**
 *
 * @author Alexandre Afonso.
 */
public class SenderDocumentXML implements SenderDocument {

  private String type;

  private String value;

  @XmlElement
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String getType() {
    return type;
  }

  @XmlElement
  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "SenderDocumentXML{" +
        "type='" + type + '\'' +
        ", value=" + value +
        '}';
  }
}
