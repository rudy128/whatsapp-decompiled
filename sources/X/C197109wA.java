package X;

import java.util.Map;

/* renamed from: X.9wA  reason: invalid class name and case insensitive filesystem */
public abstract class C197109wA {
    public static final Map A00;

    static {
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
        C72463Mc.A1H("mkv", "video/x-matroska", r2);
        C108985cd.A1G("glb", "model/gltf-binary", r2);
        A00 = AnonymousClass1D7.A0B(r2);
    }

    public static final String A00(String str) {
        C18070vi.A0d(str, 0);
        int length = str.length() - 1;
        int A0B = AnonymousClass1YF.A0B(str, '.', length);
        if (A0B < 0 || A0B == length) {
            return null;
        }
        String A0i = AnonymousClass8BW.A0i(C108955ca.A0z(str, A0B + 1));
        String A0s = C17880vN.A0s(A0i, AnonymousClass9U2.A01);
        if (A0s != null) {
            return A0s;
        }
        String mimeTypeFromExtension = AnonymousClass9U2.A00.getMimeTypeFromExtension(A0i);
        if (mimeTypeFromExtension == null) {
            return C17880vN.A0s(A0i, A00);
        }
        return mimeTypeFromExtension;
    }
}
