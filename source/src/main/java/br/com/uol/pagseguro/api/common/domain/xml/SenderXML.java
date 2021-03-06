/*
 * 2007-2016 [PagSeguro Internet Ltda.]
 *
 * NOTICE OF LICENSE
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright: 2007-2016 PagSeguro Internet Ltda.
 * Licence: http://www.apache.org/licenses/LICENSE-2.0
 */
package br.com.uol.pagseguro.api.common.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.uol.pagseguro.api.common.domain.Sender;

/**
 * Implementation of {@code Sender}
 *
 * @author PagSeguro Internet Ltda.
 */
public class SenderXML implements Sender {

  private String name;

  private String email;

  private PhoneXML phone;

  private AddressXML address;

  private String cpf;

  private String hash;

  private List<SenderDocumentXML> documents; // Alexandre Afonso

  SenderXML() {
  }

  @Override
  public String getName() {
    return name;
  }

  @XmlElement
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getEmail() {
    return email;
  }

  @XmlElement
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public PhoneXML getPhone() {
    return phone;
  }

  @XmlElement
  public void setPhone(PhoneXML phone) {
    this.phone = phone;
  }

  @Override
  public AddressXML getAddress() {
    return address;
  }

  @XmlElement
  public void setAddress(AddressXML address) {
    this.address = address;
  }

  @Override
  public String getCpf() {
    return this.cpf;
  }

  @XmlElement(name = "cpf")
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public String getHash() {
    return hash;
  }

  @XmlElement
  public void setHash(String hash) {
    this.hash = hash;
  }

  @XmlElement(name = "document")
  @XmlElementWrapper(name = "documents")
  public void setDocuments(List<SenderDocumentXML> documents) {
    this.documents = documents;
  }

  @Override
  public List<SenderDocumentXML> getDocuments() {
    return documents;
  }

  @Override
  public String toString() {
    return "SenderXML{" +
        "name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", phone=" + phone +
        ", address=" + address +
        ", cpf='" + cpf + '\'' +
        ", hash='" + hash + '\'' +
        ", documents='" + documents + '\'' +
        '}';
  }
}
