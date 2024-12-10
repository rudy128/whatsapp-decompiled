package X;

import android.net.Uri;

/* renamed from: X.4X7  reason: invalid class name */
public final class AnonymousClass4X7 {
    public static final Uri.Builder A00(String str) {
        Uri.Builder path = new Uri.Builder().scheme("https").authority("www.google.com").path("gasearch");
        byte[] bytes = C18070vi.A0H(path.build()).getBytes(C26571Sq.A05);
        C18070vi.A0X(bytes);
        String A01 = C60382nw.A01(str, (2000 - bytes.length) - 3);
        if (A01 == null) {
            return null;
        }
        return path.appendQueryParameter("q", A01).appendQueryParameter("ctx", "wa1");
    }

    public final Uri A01(AnonymousClass46p r4) {
        Uri.Builder appendQueryParameter;
        Uri.Builder appendQueryParameter2;
        StringBuilder A0K = C18070vi.A0K(r4);
        A0K.append("About ");
        Uri.Builder A00 = A00(AnonymousClass000.A0y(r4.A00, A0K));
        if (A00 == null || (appendQueryParameter = A00.appendQueryParameter("tbm", "ilp")) == null || (appendQueryParameter2 = appendQueryParameter.appendQueryParameter("gsas", "1")) == null) {
            return null;
        }
        return appendQueryParameter2.build();
    }
}
