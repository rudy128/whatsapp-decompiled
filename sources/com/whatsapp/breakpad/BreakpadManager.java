package com.whatsapp.breakpad;

import X.C17930vS;
import X.C17960vV;
import X.C17970vW;
import X.C223919s;
import X.C22491Af;
import android.content.Context;
import android.os.Build;
import java.io.File;

public class BreakpadManager {
    public static File A00;

    public static native boolean setUpBreakpad(String str, String str2, String str3, String str4, int i, String str5);

    public static synchronized void A00(Context context, C17930vS r10) {
        synchronized (BreakpadManager.class) {
            boolean z = false;
            if (A00 == null) {
                z = true;
            }
            C17960vV.A0F(z, "breakpad/initialized more than once");
            File A002 = C22491Af.A00(r10);
            Boolean bool = C17970vW.A03;
            setUpBreakpad(A002.getAbsolutePath(), context.getPackageCodePath(), new File(r10.A01(), "decompressed/libs.spo").getAbsolutePath(), C223919s.A00, 1536000, Build.FINGERPRINT);
            A00 = A002;
        }
    }
}
