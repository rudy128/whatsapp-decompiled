package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.3C1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3C1 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C679831p A02;

    public final void run() {
        int i;
        C679831p r0 = this.A02;
        Context context = this.A01;
        int i2 = this.A00;
        AnonymousClass185 r12 = r0.A0N;
        r12.A0c();
        File A0e = C17880vN.A0e(context.getFilesDir(), "wam.wam");
        AnonymousClass11N r8 = r0.A0H;
        C25847Cn3 cn3 = new C25847Cn3(r8, (C19830z4) null, (C18030ve) null, (AnonymousClass182) null, r12, A0e, 3, i2, 0, false);
        r0.A01 = cn3;
        AnonymousClass189 r2 = r0.A0M;
        AnonymousClass182 r1 = r0.A0L;
        r0.A08 = new C25831Cmk(r8, r1, r2, cn3);
        r0.A0Q.countDown();
        AnonymousClass11N r17 = r8;
        AnonymousClass185 r21 = r12;
        int i3 = i2;
        C25847Cn3 cn32 = new C25847Cn3(r17, (C19830z4) null, (C18030ve) null, (AnonymousClass182) null, r21, C17880vN.A0e(context.getFilesDir(), "wamrealtime.wam"), 8, i3, 1, false);
        r0.A04 = cn32;
        r0.A07 = new C25831Cmk(r8, r1, r2, cn32);
        r0.A0T.countDown();
        C18030ve r6 = r0.A0J;
        C18040vf r5 = C18040vf.A02;
        if (C18020vd.A05(r5, r6, 3271)) {
            i = C18020vd.A00(r5, r6, 4290);
        } else {
            i = 2;
        }
        File A0e2 = C17880vN.A0e(context.getFilesDir(), "wamdit3.wam");
        C19830z4 r18 = r0.A0I;
        C18030ve r19 = r6;
        AnonymousClass182 r20 = r1;
        C25847Cn3 cn33 = new C25847Cn3(r17, r18, r19, r20, r21, A0e2, i, i3, 2, true);
        r0.A03 = cn33;
        r0.A06 = new C25831Cmk(r8, r1, r2, cn33);
        r0.A0S.countDown();
        C25847Cn3 cn34 = new C25847Cn3(r17, r18, r19, r20, r21, C17880vN.A0e(context.getFilesDir(), "wamditrt3.wam"), i, i3, 3, true);
        r0.A02 = cn34;
        r0.A05 = new C25831Cmk(r8, r1, r2, cn34);
        r0.A0R.countDown();
    }

    public /* synthetic */ AnonymousClass3C1(Context context, C679831p r2, int i) {
        this.A02 = r2;
        this.A01 = context;
        this.A00 = i;
    }
}
