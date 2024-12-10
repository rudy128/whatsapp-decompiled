package X;

import com.whatsapp.util.Log;

/* renamed from: X.9Q5  reason: invalid class name */
public abstract class AnonymousClass9Q5 {
    public static final int A00(C42741yf r3) {
        if (r3 != null) {
            boolean A01 = r3.A01();
            boolean A02 = r3.A02();
            if (A01) {
                if (A02) {
                    return 4;
                }
                Log.w("NFMWamUtils/getBizPlatform: unexpected combination of isCloudApi and isEnterprise results");
            } else if (A02) {
                return 3;
            } else {
                if (r3.A03()) {
                    return 2;
                }
            }
        }
        return 1;
    }
}
