package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;

/* renamed from: X.7Qb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146647Qb implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ Resources A04;
    public final /* synthetic */ ImageView A05;
    public final /* synthetic */ C134866rH A06;
    public final /* synthetic */ C132666nJ A07;
    public final /* synthetic */ C88284Zb A08;
    public final /* synthetic */ Integer A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        if (r2 != 2) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r0 = r20
            X.6nJ r15 = r0.A07
            int r10 = r0.A00
            java.lang.String r3 = r0.A0A
            java.lang.String r7 = r0.A0B
            int r9 = r0.A01
            int r2 = r0.A02
            android.content.res.Resources r4 = r0.A04
            X.6rH r5 = r0.A06
            android.widget.ImageView r13 = r0.A05
            java.lang.Integer r8 = r0.A09
            X.4Zb r11 = r0.A08
            android.content.Context r14 = r0.A03
            X.00H r1 = r15.A00
            java.lang.Object r0 = r1.get()
            X.2iJ r0 = (X.C56962iJ) r0
            java.io.File r0 = r0.A00(r3, r10)
            if (r0 == 0) goto L_0x008a
            boolean r0 = r0.exists()
        L_0x002c:
            java.lang.String r6 = "lottie"
            if (r0 == 0) goto L_0x008c
            boolean r0 = X.C18070vi.A18(r7, r6)
            java.lang.Object r1 = r1.get()
            X.2iJ r1 = (X.C56962iJ) r1
            if (r0 == 0) goto L_0x0061
            java.io.File r0 = r1.A00(r3, r10)
            java.io.FileInputStream r2 = X.C108945cZ.A18(r0)
            r0 = 1024(0x400, float:1.435E-42)
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r2, r0)
            r0 = 0
            X.1yu r0 = X.C39771tc.A04(r1, r0)
            java.lang.Object r2 = r0.A00
            if (r2 == 0) goto L_0x008c
            X.0wl r1 = r15.A02
            r0 = 11
            X.3C5 r10 = new X.3C5
            r10.<init>(r13, r2, r8, r0)
        L_0x005d:
            r1.A0D(r10, r1)
            return
        L_0x0061:
            X.C18070vi.A0b(r4)
            r0 = 4
            X.C18070vi.A0d(r4, r0)
            java.io.File r1 = r1.A00(r3, r10)
            if (r1 == 0) goto L_0x008c
            X.25O r0 = new X.25O
            r0.<init>(r9, r2)
            X.25P r0 = X.AnonymousClass204.A0A(r0, r1)
            android.graphics.Bitmap r0 = r0.A02
            if (r0 == 0) goto L_0x008c
            android.graphics.drawable.BitmapDrawable r12 = new android.graphics.drawable.BitmapDrawable
            r12.<init>(r4, r0)
            X.0wl r1 = r15.A02
            r15 = 14
            X.7Py r10 = new X.7Py
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x005d
        L_0x008a:
            r0 = 0
            goto L_0x002c
        L_0x008c:
            boolean r0 = X.C18070vi.A18(r7, r6)
            if (r0 != 0) goto L_0x00c5
            java.lang.Integer r1 = r5.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x00c5
            X.C18070vi.A0b(r4)
            int r2 = r5.A00
            if (r2 == 0) goto L_0x00a8
            r0 = 1
            if (r2 == r0) goto L_0x00c1
            r0 = 2
            r1 = 2131232297(0x7f080629, float:1.80807E38)
            if (r2 == r0) goto L_0x00ab
        L_0x00a8:
            r1 = 2131232228(0x7f0805e4, float:1.808056E38)
        L_0x00ab:
            r0 = 0
            android.graphics.drawable.Drawable r17 = X.C40501uo.A00(r0, r4, r1)
            X.0wl r0 = r15.A02
            r19 = 40
            X.AkN r14 = new X.AkN
            r16 = r13
            r18 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            r0.A0D(r14, r0)
            return
        L_0x00c1:
            r1 = 2131232416(0x7f0806a0, float:1.808094E38)
            goto L_0x00ab
        L_0x00c5:
            X.0wl r2 = r15.A02
            r1 = 35
            X.AkF r0 = new X.AkF
            r0.<init>(r13, r1)
            r2.A0D(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146647Qb.run():void");
    }

    public /* synthetic */ C146647Qb(Context context, Resources resources, ImageView imageView, C134866rH r4, C132666nJ r5, C88284Zb r6, Integer num, String str, String str2, int i, int i2, int i3) {
        this.A07 = r5;
        this.A00 = i;
        this.A0A = str;
        this.A0B = str2;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = resources;
        this.A06 = r4;
        this.A05 = imageView;
        this.A09 = num;
        this.A08 = r6;
        this.A03 = context;
    }
}
