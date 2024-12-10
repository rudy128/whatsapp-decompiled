package X;

import com.whatsapp.util.Log;

/* renamed from: X.9jD  reason: invalid class name and case insensitive filesystem */
public class C189419jD {
    public final /* synthetic */ AnonymousClass8GZ A00;

    public C189419jD(AnonymousClass8GZ r1) {
        this.A00 = r1;
    }

    public void A00(int i) {
        String str;
        AnonymousClass126 r1;
        int i2;
        AnonymousClass8GZ r3 = this.A00;
        AnonymousClass1E7 r0 = r3.A02;
        if (r0 != null) {
            AnonymousClass3MY.A1M(r3.A0E, C62822s3.A02(r0));
            r3.A0S.A0G(r3.A04, C62822s3.A02(r3.A02));
        }
        if (i != 0) {
            if (i == 403) {
                r1 = r3.A0T;
                i2 = 3024;
            } else if (i == 423) {
                r1 = r3.A0T;
                i2 = 3025;
            } else if (i == 429 || i == 500) {
                r1 = r3.A0T;
                i2 = 3012;
            } else if (i == 400) {
                str = "bad request when setting member add mode";
            } else if (i == 401) {
                r1 = r3.A0T;
                i2 = 3023;
            } else {
                return;
            }
            r1.A0O(i2, (Object) null);
            return;
        }
        str = "unknown error when setting member add mode";
        Log.e(str);
    }
}
