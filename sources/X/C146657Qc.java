package X;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: X.7Qc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146657Qc implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ Bitmap A03;
    public final /* synthetic */ AnonymousClass7PX A04;
    public final /* synthetic */ AnonymousClass1E7 A05;
    public final /* synthetic */ C127686el A06;
    public final /* synthetic */ C127696em A07;
    public final /* synthetic */ C113525nE A08;
    public final /* synthetic */ C112235l9 A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0050, code lost:
        if (X.C18070vi.A18(r12.A05, r4.A05) == false) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            X.5l9 r5 = r1.A09
            X.7PX r4 = r1.A04
            boolean r7 = r1.A0B
            int r0 = r1.A00
            r17 = r0
            android.content.Context r0 = r1.A02
            r22 = r0
            X.1E7 r0 = r1.A05
            r21 = r0
            int r0 = r1.A01
            r20 = r0
            X.5nE r6 = r1.A08
            X.6el r10 = r1.A06
            X.6em r9 = r1.A07
            android.graphics.Bitmap r0 = r1.A03
            r19 = r0
            java.lang.String r0 = r1.A0A
            r18 = r0
            r8 = 8
            r1 = 10
            r0 = r19
            X.C18070vi.A0d(r0, r1)
            X.0ve r2 = r5.A07
            r1 = 10563(0x2943, float:1.4802E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r11 = 0
            if (r0 == 0) goto L_0x0178
            X.5j4 r3 = r5.A09
            X.11S r0 = r5.A02
            X.7PX r12 = r3.A0T(r0)
            if (r12 == 0) goto L_0x0052
            java.lang.String r1 = r12.A05
            java.lang.String r0 = r4.A05
            boolean r0 = X.C18070vi.A18(r1, r0)
            r16 = 1
            if (r0 != 0) goto L_0x0054
        L_0x0052:
            r16 = 0
        L_0x0054:
            java.lang.String r2 = r4.A05
            X.C18070vi.A0b(r22)
            if (r7 == 0) goto L_0x0138
            r1 = 2131894923(0x7f12228b, float:1.9424664E38)
            r0 = r22
            java.lang.String r13 = r0.getString(r1)
            r0 = 2131102342(0x7f060a86, float:1.781712E38)
        L_0x0067:
            X.6em r1 = new X.6em
            r1.<init>(r13, r0)
        L_0x006c:
            java.lang.String r0 = r10.A00
            java.lang.String r14 = r1.A01
            int r1 = r9.A00
            if (r7 != 0) goto L_0x011f
            boolean r9 = r3.A0A
            if (r9 == 0) goto L_0x011f
            r13 = r11
        L_0x0079:
            java.lang.String r9 = r10.A01
            android.widget.TextView r2 = r6.A01
            r2.setText(r0)
            android.widget.TextView r12 = r6.A02
            r12.setText(r14)
            if (r1 == 0) goto L_0x008e
            android.content.Context r0 = r12.getContext()
            X.AnonymousClass3MX.A1C(r0, r12, r1)
        L_0x008e:
            com.whatsapp.TextEmojiLabel r10 = r6.A03
            r2 = 0
            r1 = 0
            r0 = r18
            r10.A0S(r0, r2, r1, r1)
            if (r14 != 0) goto L_0x009b
            r1 = 8
        L_0x009b:
            r12.setVisibility(r1)
            android.widget.ImageView r1 = r6.A00
            r0 = r19
            r1.setImageBitmap(r0)
            if (r7 == 0) goto L_0x0114
            android.view.View r0 = r6.A0H
            r0.setOnClickListener(r13)
        L_0x00ac:
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.view.View r7 = r6.A0H
            android.content.res.Resources$Theme r2 = X.AnonymousClass3Ma.A06(r7)
            r1 = 16843534(0x101030e, float:2.369575E-38)
            r0 = 1
            r2.resolveAttribute(r1, r10, r0)
            int r0 = r10.resourceId
            r7.setBackgroundResource(r0)
            r7.setContentDescription(r9)
        L_0x00c6:
            boolean r0 = r6 instanceof X.C120606Ek
            if (r0 == 0) goto L_0x0108
            r10 = r6
            X.6Ek r10 = (X.C120606Ek) r10
            android.widget.ImageView r7 = r10.A00
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            long r0 = r4.A00
            X.206 r11 = X.C111215j4.A00(r3, r0)
            boolean r0 = r11 instanceof X.AnonymousClass21V
            r9 = 0
            if (r0 == 0) goto L_0x0112
            if (r11 == 0) goto L_0x0112
            X.1DT r9 = X.C108945cZ.A0S()
            X.1gV r2 = r3.A05
            r1 = 2
            X.7NG r0 = new X.7NG
            r0.<init>(r7, r9, r1)
            r2.A0D(r7, r11, r0)
            r11 = 0
        L_0x00f0:
            com.whatsapp.TextEmojiLabel r3 = r10.A01
            r2 = 0
            r1 = 0
            r0 = r18
            r3.A0S(r0, r2, r1, r1)
            if (r11 == 0) goto L_0x0109
            r3.setVisibility(r1)
            com.whatsapp.TextEmojiLabel r0 = r10.A03
            r0.setVisibility(r8)
        L_0x0103:
            if (r9 != 0) goto L_0x019c
            r7.setVisibility(r8)
        L_0x0108:
            return
        L_0x0109:
            r3.setVisibility(r8)
            com.whatsapp.TextEmojiLabel r0 = r10.A03
            r0.setVisibility(r1)
            goto L_0x0103
        L_0x0112:
            r11 = 1
            goto L_0x00f0
        L_0x0114:
            if (r13 == 0) goto L_0x00ac
            r1.setOnClickListener(r13)
            android.view.View r0 = r6.A0H
            r0.setOnClickListener(r11)
            goto L_0x00ac
        L_0x011f:
            r9 = 3
            X.789 r13 = new X.789
            r13.<init>(r5, r4, r9, r7)
            if (r12 == 0) goto L_0x012f
            java.lang.String r9 = r12.A05
            boolean r2 = X.C18070vi.A18(r9, r2)
            if (r2 != 0) goto L_0x0079
        L_0x012f:
            r2 = 24
            X.4dP r11 = new X.4dP
            r11.<init>(r5, r4, r2)
            goto L_0x0079
        L_0x0138:
            r1 = r21
            r0 = r20
            X.1yg r0 = X.C112235l9.A00(r1, r5, r0)
            java.lang.Integer r0 = r0.A00
            r13 = r0
            X.1Me r0 = r5.A05
            r1 = r0
            X.1BI r0 = r3.A02
            r15 = r1
            r14 = r13
            r13 = r0
            r1 = r21
            r0 = r20
            java.lang.String r13 = r15.A0V(r1, r13, r14, r0)
            if (r13 == 0) goto L_0x0160
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0160
            r0 = 2131102340(0x7f060a84, float:1.7817115E38)
            goto L_0x0067
        L_0x0160:
            r14 = 0
            if (r17 > 0) goto L_0x0176
            if (r16 != 0) goto L_0x0176
            r13 = 2131894922(0x7f12228a, float:1.9424662E38)
            r1 = 1
            r0 = r22
            java.lang.String r0 = X.C17890vO.A0R(r0, r2, r1, r14, r13)
        L_0x016f:
            X.6em r1 = new X.6em
            r1.<init>(r0, r14)
            goto L_0x006c
        L_0x0176:
            r0 = 0
            goto L_0x016f
        L_0x0178:
            java.lang.String r12 = r10.A00
            java.lang.String r2 = r9.A01
            int r1 = r9.A00
            X.5j4 r3 = r5.A09
            if (r7 != 0) goto L_0x0186
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x018c
        L_0x0186:
            r0 = 4
            X.789 r11 = new X.789
            r11.<init>(r5, r4, r0, r7)
        L_0x018c:
            java.lang.String r0 = r10.A01
            r9 = r6
            r10 = r19
            r13 = r2
            r14 = r18
            r15 = r0
            r16 = r1
            r9.A0B(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00c6
        L_0x019c:
            X.1F9 r1 = r5.A00
            r0 = 31
            X.AnonymousClass7AQ.A01(r1, r9, r6, r0)
            r0 = 20
            X.AnonymousClass3MY.A1E(r7, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146657Qc.run():void");
    }

    public /* synthetic */ C146657Qc(Context context, Bitmap bitmap, AnonymousClass7PX r3, AnonymousClass1E7 r4, C127686el r5, C127696em r6, C113525nE r7, C112235l9 r8, String str, int i, int i2, boolean z) {
        this.A09 = r8;
        this.A04 = r3;
        this.A0B = z;
        this.A00 = i;
        this.A02 = context;
        this.A05 = r4;
        this.A01 = i2;
        this.A08 = r7;
        this.A06 = r5;
        this.A07 = r6;
        this.A03 = bitmap;
        this.A0A = str;
    }
}
