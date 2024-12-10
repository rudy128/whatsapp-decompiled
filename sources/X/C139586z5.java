package X;

import android.view.View;

/* renamed from: X.6z5  reason: invalid class name and case insensitive filesystem */
public final class C139586z5 {
    public C127766et A00;
    public C123476Up A01;
    public final C30141dS A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18100vl A05 = AnonymousClass1DF.A01(new C153647pr(this));
    public final Integer A06;

    public final void A02(Integer num) {
        Integer num2 = this.A06;
        C18070vi.A0d(num2, 1);
        int i = 2;
        if (num.intValue() != 1) {
            i = 3;
        } else {
            int intValue = num2.intValue();
            if (!(intValue == 0 || intValue == 1)) {
                i = 4;
            }
        }
        C56092gt r0 = ((C32741hg) this.A04.get()).A00;
        if (r0 != null) {
            r0.A00 = i;
        }
    }

    public static final void A00(C139586z5 r3) {
        boolean z;
        C127766et r0 = r3.A00;
        if (r0 != null) {
            C123476Up A012 = r3.A01();
            AnonymousClass7M6 r2 = r0.A01;
            View view = r2.A01;
            if (view != null && (z = A012.A04) != C108995ce.A1U(view)) {
                AnonymousClass7M6.A00(r2, z, A012.A03);
            }
        }
    }

    public final C123476Up A01() {
        C123476Up r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("crossPostingViewModelState");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.6Up, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
        if (X.AnonymousClass000.A1a(((X.AnonymousClass7FX) r5.A03.get()).A01()) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r4 == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C139586z5(X.C30141dS r6, X.AnonymousClass00H r7, X.AnonymousClass00H r8, java.lang.Integer r9, boolean r10) {
        /*
            r5 = this;
            X.C18070vi.A0p(r6, r7, r8)
            r5.<init>()
            r5.A02 = r6
            r5.A03 = r7
            r5.A04 = r8
            r5.A06 = r9
            X.7pr r0 = new X.7pr
            r0.<init>(r5)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            r5.A05 = r0
            boolean r0 = r6.A00()
            if (r0 != 0) goto L_0x0038
            boolean r0 = X.C108985cd.A1Y(r6)
            if (r0 != 0) goto L_0x0038
            X.00H r0 = r5.A03
            java.lang.Object r0 = r0.get()
            X.7FX r0 = (X.AnonymousClass7FX) r0
            X.1IX r0 = r0.A01()
            boolean r0 = X.AnonymousClass000.A1a(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            if (r10 != 0) goto L_0x003e
            r3 = 1
            if (r4 != 0) goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            X.6Rr r2 = X.C122726Rr.HIDE
            r1 = 0
            X.6Up r0 = new X.6Up
            r0.<init>()
            r0.A04 = r4
            r0.A03 = r3
            r0.A00 = r2
            r0.A01 = r2
            r0.A02 = r1
            r0.A06 = r1
            r0.A05 = r1
            r5.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139586z5.<init>(X.1dS, X.00H, X.00H, java.lang.Integer, boolean):void");
    }
}
