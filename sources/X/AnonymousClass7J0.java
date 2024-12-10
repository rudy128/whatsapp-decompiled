package X;

import android.content.Context;
import com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView;

/* renamed from: X.7J0  reason: invalid class name */
public final class AnonymousClass7J0 implements AnonymousClass8AQ {
    public Context A00;
    public boolean A01 = true;
    public final C24921Me A02;
    public final DefaultRecipientsView A03;
    public final AnonymousClass72B A04;

    public AnonymousClass7J0(C24921Me r3, DefaultRecipientsView defaultRecipientsView, AnonymousClass72B r5) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0k(r3, defaultRecipientsView);
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = defaultRecipientsView;
        this.A00 = AnonymousClass3MY.A04(defaultRecipientsView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d1, code lost:
        if (r9 < 1) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d4, code lost:
        if (r8 < 1) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0207, code lost:
        if (X.AnonymousClass716.A01(r7.A02).getInt("pref_xfamily_audience_tooltip", 0) < 1) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CKJ(X.AnonymousClass77K r14, java.util.List r15, boolean r16) {
        /*
            r13 = this;
            r4 = 0
            boolean r2 = X.C18070vi.A17(r15, r14)
            X.1BI r0 = X.C22971Dz.A01(r15)
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r1 = 1
        L_0x000d:
            X.1Me r0 = r13.A02
            android.content.Context r5 = r13.A00
            java.util.ArrayList r3 = r0.A0d(r5, r15)
            if (r1 == 0) goto L_0x0226
            java.lang.String r6 = X.AnonymousClass73K.A00(r5, r14)
            X.72B r0 = r13.A04
            X.6R1 r0 = r0.A02(r4)
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x020f
            r0 = 2
            if (r1 == r0) goto L_0x020f
            r0 = 3
            if (r1 != r0) goto L_0x0048
            boolean r9 = r14.A05
            if (r9 != 0) goto L_0x0035
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x0048
        L_0x0035:
            r7 = 2131167696(0x7f0709d0, float:1.7949673E38)
            r1 = 2130968699(0x7f04007b, float:1.754606E38)
            r0 = 2131099786(0x7f06008a, float:1.7811935E38)
            int r8 = X.AnonymousClass1YL.A00(r5, r1, r0)
            boolean r10 = r14.A06
            android.text.SpannableStringBuilder r6 = X.AnonymousClass74A.A00(r5, r6, r7, r8, r9, r10)
        L_0x0048:
            com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView r2 = r13.A03
            r2.setRecipientsChips(r3, r6)
            int r0 = r15.size()
            r2.setRecipientsContentDescription(r0)
            if (r6 == 0) goto L_0x020b
            X.6jh r5 = r2.A08
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x020b
            if (r16 == 0) goto L_0x0169
            X.72B r6 = r5.A02
            X.6R1 r1 = r6.A02(r4)
            X.6R1 r0 = X.AnonymousClass6R1.DISABLED
            if (r1 == r0) goto L_0x015e
            X.6R1 r3 = X.AnonymousClass6R1.WAFFLE_V3
            if (r1 != r3) goto L_0x01d8
            X.00H r0 = r5.A03
            java.lang.Object r7 = r0.get()
            X.7Oe r7 = (X.C146197Oe) r7
            X.00H r0 = r7.A00
            java.lang.Object r0 = r0.get()
            X.2mM r0 = (X.C59472mM) r0
            X.6zR r1 = r0.A00()
            X.00H r12 = r7.A01
            java.lang.Object r0 = r12.get()
            X.Cir r0 = (X.C25611Cir) r0
            android.content.SharedPreferences r0 = X.C25611Cir.A00(r0)
            java.lang.String r11 = "pref_waffle_sharing_to_fb_tooltip"
            int r9 = r0.getInt(r11, r4)
            java.lang.Object r0 = r12.get()
            X.Cir r0 = (X.C25611Cir) r0
            android.content.SharedPreferences r0 = X.C25611Cir.A00(r0)
            java.lang.String r10 = "pref_waffle_sharing_to_ig_tooltip"
            int r8 = r0.getInt(r10, r4)
            boolean r7 = r1.A00
            boolean r1 = r1.A01
            if (r7 != 0) goto L_0x00ba
            if (r9 <= 0) goto L_0x00ba
            java.lang.Object r0 = r12.get()
            X.Cir r0 = (X.C25611Cir) r0
            android.content.SharedPreferences$Editor r0 = X.C108965cb.A02(r0)
            X.C18070vi.A0X(r0)
            X.C17880vN.A1C(r0, r11, r4)
        L_0x00ba:
            if (r1 != 0) goto L_0x00ce
            if (r8 <= 0) goto L_0x00ce
            java.lang.Object r0 = r12.get()
            X.Cir r0 = (X.C25611Cir) r0
            android.content.SharedPreferences$Editor r0 = X.C108965cb.A02(r0)
            X.C18070vi.A0X(r0)
            X.C17880vN.A1C(r0, r10, r4)
        L_0x00ce:
            if (r7 == 0) goto L_0x01d1
            r0 = 1
            if (r9 >= r0) goto L_0x01d1
        L_0x00d3:
            X.6R1 r0 = r6.A02(r4)
            if (r0 != r3) goto L_0x01bb
            X.00H r0 = r5.A04
            X.6zR r1 = X.C108985cd.A0Q(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x01b7
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x01b3
            java.lang.Integer r9 = X.AnonymousClass00R.A0Y
        L_0x00e9:
            r0 = 1
            r5.A00 = r0
            X.6it r8 = r5.A01
            X.6c9 r3 = new X.6c9
            r3.<init>(r5)
            r7 = 1
            android.widget.PopupWindow r1 = r8.A02
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x00ff
            r1.dismiss()
        L_0x00ff:
            X.79Q r0 = new X.79Q
            r0.<init>(r3, r4)
            r1.setOnDismissListener(r0)
            r1.setOutsideTouchable(r7)
            com.whatsapp.WaTextView r0 = r8.A03
            r6 = 3
            X.C1422578t.A00(r0, r8, r3, r6)
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            r1 = 2
            X.790 r0 = new X.790
            r0.<init>(r8, r9, r2, r1)
            r3.addOnGlobalLayoutListener(r0)
            int r0 = r9.intValue()
            if (r0 == r4) goto L_0x017d
            if (r0 == r7) goto L_0x018e
            if (r0 == r1) goto L_0x0171
            if (r0 == r6) goto L_0x016a
            X.00H r1 = r5.A03
            java.lang.Object r0 = r1.get()
            X.7Oe r0 = (X.C146197Oe) r0
            r0.A00()
            java.lang.Object r0 = r1.get()
        L_0x0138:
            X.7Oe r0 = (X.C146197Oe) r0
            X.00H r3 = r0.A01
            java.lang.Object r0 = r3.get()
            X.Cir r0 = (X.C25611Cir) r0
            android.content.SharedPreferences r0 = X.C25611Cir.A00(r0)
            java.lang.String r5 = "pref_waffle_sharing_to_ig_tooltip"
            int r1 = r0.getInt(r5, r4)
            java.lang.Object r0 = r3.get()
            X.Cir r0 = (X.C25611Cir) r0
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r0 = X.C108965cb.A02(r0)
            X.C18070vi.A0X(r0)
        L_0x015b:
            X.C17880vN.A1C(r0, r5, r1)
        L_0x015e:
            boolean r0 = r15.isEmpty()
            int r0 = X.C72453Mb.A01(r0)
            r2.setVisibility(r0)
        L_0x0169:
            return
        L_0x016a:
            X.00H r0 = r5.A03
            java.lang.Object r0 = r0.get()
            goto L_0x0138
        L_0x0171:
            X.00H r0 = r5.A03
            java.lang.Object r0 = r0.get()
            X.7Oe r0 = (X.C146197Oe) r0
            r0.A00()
            goto L_0x015e
        L_0x017d:
            X.00H r0 = r5.A05
            java.lang.Object r0 = r0.get()
            X.6QF r0 = (X.AnonymousClass6QF) r0
            X.00H r3 = r0.A02
            android.content.SharedPreferences r0 = X.AnonymousClass716.A01(r3)
            java.lang.String r5 = "pref_xfamily_audience_tooltip"
            goto L_0x019e
        L_0x018e:
            X.00H r0 = r5.A05
            java.lang.Object r0 = r0.get()
            X.6QF r0 = (X.AnonymousClass6QF) r0
            X.00H r3 = r0.A02
            android.content.SharedPreferences r0 = X.AnonymousClass716.A01(r3)
            java.lang.String r5 = "pref_xfamily_sharing_to_fb_tooltip"
        L_0x019e:
            int r1 = r0.getInt(r5, r4)
            java.lang.Object r0 = r3.get()
            X.716 r0 = (X.AnonymousClass716) r0
            int r1 = r1 + 1
            android.content.SharedPreferences r0 = X.AnonymousClass716.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            goto L_0x015b
        L_0x01b3:
            java.lang.Integer r9 = X.AnonymousClass00R.A0C
            goto L_0x00e9
        L_0x01b7:
            java.lang.Integer r9 = X.AnonymousClass00R.A0N
            goto L_0x00e9
        L_0x01bb:
            X.00H r0 = r5.A05
            java.lang.Object r0 = r0.get()
            X.6QF r0 = (X.AnonymousClass6QF) r0
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x01cd
            java.lang.Integer r9 = X.AnonymousClass00R.A01
            goto L_0x00e9
        L_0x01cd:
            java.lang.Integer r9 = X.AnonymousClass00R.A00
            goto L_0x00e9
        L_0x01d1:
            if (r1 == 0) goto L_0x015e
            r0 = 1
            if (r8 >= r0) goto L_0x015e
            goto L_0x00d3
        L_0x01d8:
            X.00H r1 = r5.A05
            java.lang.Object r0 = r1.get()
            X.6QF r0 = (X.AnonymousClass6QF) r0
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x00d3
            java.lang.Object r7 = r1.get()
            X.6QF r7 = (X.AnonymousClass6QF) r7
            X.00H r0 = r7.A01
            X.1mM r1 = X.C108945cZ.A11(r0)
            java.lang.Integer r0 = X.AnonymousClass6QF.A03
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x015e
            X.00H r0 = r7.A02
            android.content.SharedPreferences r1 = X.AnonymousClass716.A01(r0)
            java.lang.String r0 = "pref_xfamily_audience_tooltip"
            int r1 = r1.getInt(r0, r4)
            r0 = 1
            if (r1 >= r0) goto L_0x015e
            goto L_0x00d3
        L_0x020b:
            if (r16 == 0) goto L_0x0169
            goto L_0x015e
        L_0x020f:
            boolean r0 = r14.A05
            if (r0 == 0) goto L_0x0048
            r2 = 2131167696(0x7f0709d0, float:1.7949673E38)
            r1 = 2130968699(0x7f04007b, float:1.754606E38)
            r0 = 2131099786(0x7f06008a, float:1.7811935E38)
            int r0 = X.AnonymousClass1YL.A00(r5, r1, r0)
            android.text.SpannableStringBuilder r6 = X.AnonymousClass74B.A00(r5, r6, r2, r0)
            goto L_0x0048
        L_0x0226:
            r6 = 0
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7J0.CKJ(X.77K, java.util.List, boolean):void");
    }

    public void BIj() {
        DefaultRecipientsView defaultRecipientsView = this.A03;
        defaultRecipientsView.A05 = false;
        defaultRecipientsView.A00 = 2131099784;
    }

    public void CKK(B8E b8e) {
        this.A03.setRecipientsListener$app_product_mediacomposer_mediacomposer(b8e);
    }

    public boolean isEnabled() {
        return this.A01;
    }

    public void CIo(boolean z) {
        this.A01 = z;
    }
}
