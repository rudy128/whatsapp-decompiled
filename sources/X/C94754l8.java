package X;

import android.content.Context;

/* renamed from: X.4l8  reason: invalid class name and case insensitive filesystem */
public class C94754l8 implements AnonymousClass5ZR {
    public final int A00;
    public final Object A01;

    public C94754l8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass3QQ BGr(Context context, AnonymousClass4CV r9, AnonymousClass1EC r10) {
        AnonymousClass5ZQ r2;
        AnonymousClass5XS r5;
        AnonymousClass00S A3B;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass10G r1 = ((AnonymousClass10H) obj).A00.A00;
            r2 = (AnonymousClass5ZQ) r1.AAm.get();
            r5 = (AnonymousClass5XS) r1.AAn.get();
            A3B = r1.AAo;
        } else {
            AnonymousClass1K1 r12 = ((AnonymousClass1K2) obj).A00;
            r2 = (AnonymousClass5ZQ) r12.A7M.get();
            r5 = (AnonymousClass5XS) r12.A7N.get();
            A3B = r12.A7O;
        }
        return new AnonymousClass3QQ(context, r2, r9, (AnonymousClass5ZS) A3B.get(), r5, r10);
    }
}
