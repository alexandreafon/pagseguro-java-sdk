package br.com.uol.pagseguro.api.common.domain;

import java.math.BigDecimal;

/**
 *
 * @author Alexandre Afonso.
 */
public interface SenderDocument {

  String getType();

  String getValue();
}
