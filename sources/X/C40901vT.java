package X;

import android.graphics.PointF;

/* renamed from: X.1vT  reason: invalid class name and case insensitive filesystem */
public class C40901vT implements C40301uU {
    public static final C40901vT A00 = new Object();

    public /* bridge */ /* synthetic */ Object CB7(C39941tt r5, float f) {
        Integer A0B = r5.A0B();
        if (A0B == AnonymousClass00R.A00 || A0B == AnonymousClass00R.A0C) {
            return C40491un.A02(r5, f);
        }
        if (A0B == AnonymousClass00R.A0u) {
            PointF pointF = new PointF(((float) r5.A07()) * f, ((float) r5.A07()) * f);
            while (r5.A0M()) {
                r5.A0K();
            }
            return pointF;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot convert json to point. Next token is ");
        sb.append(C24513C7h.A00(A0B));
        throw new IllegalArgumentException(sb.toString());
    }
}
