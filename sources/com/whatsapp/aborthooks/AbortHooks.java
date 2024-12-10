package com.whatsapp.aborthooks;

public final class AbortHooks {
    public static final AbortHooks INSTANCE = new Object();

    public static final native boolean init();
}
