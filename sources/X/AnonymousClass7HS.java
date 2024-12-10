package X;

import java.util.List;

/* renamed from: X.7HS  reason: invalid class name */
public final class AnonymousClass7HS implements AnonymousClass8A9 {
    public final C24641Lc A00;
    public final C32741hg A01;
    public final C58572ku A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r5 == 21) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C136156tM r8, X.AnonymousClass7HS r9) {
        /*
            X.1FL r4 = r8.A02
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r1 = "camera_picker_origin"
            r0 = 25
            int r5 = r2.getIntExtra(r1, r0)
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r1 = "status_creation_entrypoint"
            r0 = 12
            int r3 = r2.getIntExtra(r1, r0)
            r0 = 4
            if (r5 == r0) goto L_0x0023
            r0 = 21
            r7 = 24
            if (r5 != r0) goto L_0x0025
        L_0x0023:
            r7 = 32
        L_0x0025:
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r1 = "message_media_origin"
            r0 = 5
            int r6 = r2.getIntExtra(r1, r0)
            X.1hg r0 = r9.A01
            X.2tc r2 = X.C108965cb.A0Y(r0)
            boolean r0 = X.C63742tc.A03(r2)
            if (r0 == 0) goto L_0x0053
            X.2HA r1 = X.C63742tc.A00(r2)
            r0 = 36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A02 = r0
            X.18K r0 = r2.A01
            r0.CC7(r1)
        L_0x0053:
            androidx.fragment.app.Fragment r2 = r8.A01
            X.2ku r3 = r9.A02
            r8 = 9
            android.content.Intent r1 = r3.A01(r4, r5, r6, r7, r8)
            r0 = 104(0x68, float:1.46E-43)
            r2.startActivityForResult(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HS.A00(X.6tM, X.7HS):void");
    }

    public boolean BED() {
        return !AnonymousClass000.A1T(C18020vd.A00(C18040vf.A02, this.A00.A01, 12557), 3);
    }

    public List BS7() {
        if (C18020vd.A00(C18040vf.A02, this.A00.A01, 12557) != 3) {
            return C18460wS.A00;
        }
        C135256ru[] r4 = new C135256ru[2];
        r4[0] = new C135256ru(new AnonymousClass81C(this), 2131232194, 2131890625);
        return C18070vi.A0O(new C135256ru(new AnonymousClass81D(this), 2131233460, 2131890626), r4, 1);
    }

    public C22821Di BnW() {
        return new AnonymousClass81E(this);
    }

    public AnonymousClass7HS(C24641Lc r1, C32741hg r2, C58572ku r3) {
        C18070vi.A0o(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Integer BaU() {
        return null;
    }
}
