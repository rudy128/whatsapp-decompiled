package X;

import com.whatsapp.util.Log;

/* renamed from: X.9iK  reason: invalid class name and case insensitive filesystem */
public final class C188989iK {
    public void A00(String str, String str2, Throwable th, boolean z) {
        C18070vi.A0d(str2, 1);
        StringBuilder A0K = C18070vi.A0K(str);
        A0K.append("ArdAssetManagerErrorReporter/");
        A0K.append(str);
        A0K.append(' ');
        A0K.append(str2);
        A0K.append("; Fail Harder = ");
        A0K.append(z);
        Log.e(AnonymousClass001.A1I("; Sample Frequency = ", A0K, -1), th);
    }
}
