package X;

import android.content.Context;

/* renamed from: X.4l1  reason: invalid class name and case insensitive filesystem */
public class C94684l1 implements AnonymousClass5ZO {
    public final int A00;
    public final Object A01;

    public C94684l1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass3QP BGN(Context context, C436420i r4) {
        AnonymousClass10E r0;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r0 = ((AnonymousClass10H) obj).A00;
        } else {
            r0 = ((AnonymousClass1K2) obj).A01;
        }
        return new AnonymousClass3QP(context, (C32191gn) r0.AAo.get(), r4);
    }
}
