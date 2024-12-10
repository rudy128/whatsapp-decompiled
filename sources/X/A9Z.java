package X;

import android.content.Context;
import android.content.DialogInterface;

public class A9Z implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    public A9Z(Object obj, int i, int i2, boolean z) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9NW, java.lang.Object] */
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            AnonymousClass91y r2 = (AnonymousClass91y) this.A02;
            int i2 = this.A01;
            boolean z = this.A03;
            AnonymousClass4Yv.A00(r2, i2);
            r2.A4d(z);
            return;
        }
        C1763191m r1 = (C1763191m) this.A02;
        int i3 = this.A01;
        boolean z2 = this.A03;
        AnonymousClass4Yv.A00(r1, i3);
        AnonymousClass8G9 r0 = r1.A01;
        ? obj = new Object();
        obj.A01 = 5;
        obj.A05 = true;
        obj.A02 = 2131895077;
        r0.A03.A0F(obj);
        AXN axn = new AXN(r0, 8);
        if (z2) {
            Context context = r0.A0C.A00;
            AnonymousClass1KB r4 = r0.A09;
            AnonymousClass10I r12 = r0.A0Q;
            C30931ek r11 = r0.A0O;
            AnonymousClass1QS r10 = r0.A0N;
            new C192839p4(context, r4, r0.A0D, r0.A0H, r0.A0J, r0.A0K, r0.A0L, r10, r11, r12).A00(axn);
            return;
        }
        AnonymousClass11P r5 = r0.A0B;
        AnonymousClass1KB r3 = r0.A09;
        AnonymousClass11S r42 = r0.A0A;
        AnonymousClass1OZ r7 = r0.A0G;
        AnonymousClass118 r6 = r0.A0C;
        AnonymousClass10I r112 = r0.A0Q;
        new C191749n7(r3, r42, r5, r6, r7, r0.A0H, r0.A0I, r0.A0N, r112).A00(axn);
    }
}
