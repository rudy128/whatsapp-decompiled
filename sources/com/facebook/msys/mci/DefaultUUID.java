package com.facebook.msys.mci;

import X.C17890vO;

public class DefaultUUID implements UUID {
    public static final UUID mUUID = new Object();

    public static UUID get() {
        return mUUID;
    }

    public String createString() {
        return C17890vO.A0Q();
    }
}
