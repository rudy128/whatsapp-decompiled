package X;

import android.os.Build;
import android.os.Looper;
import java.util.Map;

/* renamed from: X.9xf  reason: invalid class name and case insensitive filesystem */
public class C198029xf {
    public static final Map A02 = C17880vN.A11();
    public static final boolean A03;
    public static final boolean A04;
    public static final boolean A05;
    public static final String[] A06 = {"huawei", "honor"};
    public static final String[] A07 = {"xiaomi", "redmi", "poco", "mi", "blackshark"};
    public static final String[] A08 = {"oppo", "realme", "oneplus"};
    public final Looper A00;
    public final C22550BCh A01;

    static {
        int i = Build.VERSION.SDK_INT;
        A03 = C108975cc.A1C(i, 29);
        A05 = C108975cc.A1C(i, 31);
        A04 = C108975cc.A1C(i, 30);
    }

    public C198029xf(Looper looper, C22550BCh bCh, C197589ww r6) {
        this.A00 = looper;
        this.A01 = bCh;
        C185279cK r0 = C185279cK.A02;
        if (r0 == null) {
            r0 = new C185279cK();
            C185279cK.A02 = r0;
        }
        r0.A00.post(new C21471Akc((Object) this, (Object) r6, 48));
    }
}
