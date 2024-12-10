package X;

import android.content.Intent;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6xn  reason: invalid class name and case insensitive filesystem */
public final class C138846xn {
    public static final List A01;
    public static final List A02;
    public final ConcurrentHashMap A00 = new ConcurrentHashMap(5);

    static {
        String[] strArr = new String[2];
        strArr[0] = "com.whatsapp.w4b";
        A01 = C18070vi.A0O("com.android.contacts", strArr, 1);
        String[] strArr2 = new String[3];
        strArr2[0] = "com.android.contacts";
        strArr2[1] = "com.facebook.katana";
        A02 = C18070vi.A0O("com.instagram.android", strArr2, 2);
    }

    public final void A00(String str) {
        C18070vi.A0d(str, 0);
        if (A01.contains(str)) {
            this.A00.put(str, new C134286qL((Intent) null));
        }
    }
}
