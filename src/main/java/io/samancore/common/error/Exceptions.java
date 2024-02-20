package io.samancore.common.error;

import java.io.Serializable;

public interface Exceptions extends Serializable {

    int getValue();

    String getDescription();
}
