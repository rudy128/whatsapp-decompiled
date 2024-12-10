package com.google.android.recaptcha.internal;

import X.BE7;
import java.io.IOException;

public final class zzhf extends IOException {
    public zzhf(String str, Throwable th) {
        super(BE7.A0m("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
    }

    public zzhf(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    public zzhf() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
