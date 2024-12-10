package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;

/* renamed from: X.3t7  reason: invalid class name and case insensitive filesystem */
public final class C78583t7 extends C78953tz {
    public static final void A04(SpannableStringBuilder spannableStringBuilder, C78583t7 r9, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("# ");
        spannableStringBuilder2.append(new SpannableString(AnonymousClass000.A0y(r9.getLargeNumberFormatterUtil().A02(AnonymousClass3MX.A05(r9), Integer.valueOf(i), true), A10)));
        Drawable A0B = AnonymousClass3MZ.A0B(r9, i2);
        C17960vV.A07(A0B);
        C72813Np.A04(r9.A0D.getPaint(), AnonymousClass4aX.A08(A0B, C19740yt.A00(r9.getContext(), 2131101222)), spannableStringBuilder2, -1, 0, 1);
        spannableStringBuilder.append(AnonymousClass3MW.A09(" • ")).append(spannableStringBuilder2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (X.A1E.A00(r4, r3) == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2q() {
        /*
            r6 = this;
            super.A2q()
            X.1Me r1 = r6.A0l
            X.1E7 r0 = r6.A03
            java.lang.String r3 = r1.A0I(r0)
            X.1Me r2 = r6.A0l
            X.1E7 r1 = r6.A03
            r0 = -1
            boolean r0 = r2.A0j(r1, r0)
            if (r0 == 0) goto L_0x0024
            X.1E7 r0 = r6.A03
            java.lang.String r0 = r0.A0L()
            if (r0 == 0) goto L_0x0058
            X.1E7 r0 = r6.A03
            java.lang.String r3 = r0.A0L()
        L_0x0024:
            com.whatsapp.WaTextView r5 = r6.A09
            r5.setText(r3)
            X.00H r0 = r6.A1e
            java.lang.Object r4 = r0.get()
            X.A1E r4 = (X.A1E) r4
            X.1E7 r3 = r6.A03
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.9aH r0 = r4.A02
            X.0ve r2 = r0.A01
            r1 = 11083(0x2b4b, float:1.553E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0053
            boolean r0 = r3.A0G()
            if (r0 == 0) goto L_0x0053
            boolean r1 = X.A1E.A00(r4, r3)
            r0 = 8
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            r5.setVisibility(r0)
            return
        L_0x0058:
            X.1E7 r1 = r6.A03
            java.lang.String r0 = r1.A0c
            if (r0 == 0) goto L_0x0024
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0024
            X.1Me r0 = r6.A0l
            java.lang.String r3 = X.AnonymousClass3MX.A17(r0, r1)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78583t7.A2q():void");
    }
}
