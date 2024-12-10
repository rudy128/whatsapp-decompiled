package com.facebook.common.util;

import X.AnonymousClass000;
import X.AnonymousClass3Ma;
import X.BEA;

public enum TriState {
    YES,
    NO,
    UNSET;

    public static TriState fromDbValue(int i) {
        if (i == 1) {
            return YES;
        }
        if (i != 2) {
            return UNSET;
        }
        return NO;
    }

    public static TriState valueOf(Boolean bool) {
        if (bool != null) {
            return valueOf(bool.booleanValue());
        }
        return UNSET;
    }

    public boolean isSet() {
        return AnonymousClass3Ma.A1Z(this, UNSET);
    }

    public boolean asBoolean(boolean z) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return z;
        }
        throw BEA.A0c(this, "Unrecognized TriState value: ", AnonymousClass000.A10());
    }

    public Boolean asBooleanObject() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return Boolean.TRUE;
        }
        if (ordinal == 1) {
            return Boolean.FALSE;
        }
        if (ordinal == 2) {
            return null;
        }
        throw BEA.A0c(this, "Unrecognized TriState value: ", AnonymousClass000.A10());
    }

    public int getDbValue() {
        int ordinal = ordinal();
        int i = 1;
        if (ordinal != 0) {
            i = 2;
            if (ordinal != 1) {
                return 3;
            }
        }
        return i;
    }

    public boolean asBoolean() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal != 2) {
            throw BEA.A0c(this, "Unrecognized TriState value: ", AnonymousClass000.A10());
        }
        throw AnonymousClass000.A0n("No boolean equivalent for UNSET");
    }

    public static TriState valueOf(boolean z) {
        if (z) {
            return YES;
        }
        return NO;
    }
}
