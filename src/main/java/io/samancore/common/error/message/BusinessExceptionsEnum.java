package io.samancore.common.error.message;

import io.samancore.common.error.Exceptions;

import java.util.Arrays;
import java.util.Optional;

public enum BusinessExceptionsEnum implements Exceptions {
    NOT_SPECIFIED_ERROR(40000, "Not specified error"),
    HCAPTCHA_CODE_INVALID(40001, "Hcaptcha code specified is invalid error"),
    CODE_DUE_DATE_EXPIRED(40002, "The code specified is invalid because has expired"),
    USER_IS_NOT_ENABLED(40003, "The user request is not enabled"),
    USER_WITHOUT_FAMILY_MEMBER(40004, "User family without family member"),
    USER_WITHOUT_HEAD_FAMILY(40005, "User family without head family"),
    PROGRAM_INVALID(40006, "Program not exist"),
    REQUEST_PROGRAM_REPEATED(40007, "Program repeated for this request"),
    REQUEST_REACHED_QUANTITY_PROGRAMS_ALLOWED(40008, "Program reached quantity programs alloweb"),
    AVV_HAS_NOT_QUANTITY_FAMILY_HEADS_ALLOWED(40009, "Avv has not quantity family heads allowed"),
    FAMILY_HEAD_HAS_AVV_INVITATION_ACCEPTED(40010, "Family head has a Avv invitation accepted "),
    USER_HAS_REQUEST_HOUSING_CREATED(40011, "User has a request housing created"),
    USER_DOES_NOT_HAS_ROLE(40012, "User does not have role allowed to apply request"),
    TRANSITION_IS_NOT_ALLOWED(40013, "The transition sent cant be apply because is not allowed to request status"),
    FILE_TYPE_NOT_ALLOWED(40014, "File type not allowed"),
    FILE_SIZE_NOT_ALLOWED(40015, "File size not allowed"),
    LOAD_FILE_ERROR(40016, "Could not load file correctly"),
    FILE_IS_MANDATORY(40017, "File is mandatory"),
    FAMILY_SHOULD_ONLY_HAVE_ONE_FAMILY_HEAD(40018, "Family should only have one family head"),
    FAMILY_WAS_COMPLETED_BEFORE(40019, "Family was completed before"),
    USER_IS_NOT_OWNER_REQUEST(40020, "User is not owner of this request"),
    CONDITION_VALIDATE_ERROR(40021, "There are some validate conditions with error ");;

    private final int value;
    private final String description;

    BusinessExceptionsEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public static Optional<BusinessExceptionsEnum> valueOf(final int value) {
        return Arrays.stream(values())
                .filter(exceptionsEnum -> exceptionsEnum.value == value)
                .findFirst();
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
