package X;

import android.view.View;

/* renamed from: X.78i  reason: invalid class name and case insensitive filesystem */
public class C1421478i implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;

    public C1421478i(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnLongClickListener(new C1421478i(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01bd, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c1, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c8, code lost:
        r0 = X.C111225jD.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01cc, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d0, code lost:
        if (r0.A00 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d2, code lost:
        X.AnonymousClass3MY.A1L(r1.A0Q, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x01e3;
                case 1: goto L_0x01da;
                case 2: goto L_0x01b3;
                case 3: goto L_0x01c2;
                case 4: goto L_0x01a0;
                case 5: goto L_0x0197;
                case 6: goto L_0x0175;
                case 7: goto L_0x0142;
                case 8: goto L_0x00ed;
                case 9: goto L_0x0092;
                case 10: goto L_0x0215;
                case 11: goto L_0x0051;
                case 12: goto L_0x0012;
                case 13: goto L_0x0204;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r8.A01
            android.widget.EditText r1 = (android.widget.EditText) r1
            int r0 = X.AnonymousClass3Ma.A03(r1)
            r1.setSelection(r0)
        L_0x0010:
            r0 = 1
            return r0
        L_0x0012:
            java.lang.Object r6 = r8.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r6 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r6
            int r2 = r6.A01
            int[] r5 = X.AnonymousClass74F.A02
            r4 = 8
            r1 = 0
        L_0x001d:
            r0 = r5[r1]
            if (r0 != r2) goto L_0x0049
            if (r1 <= 0) goto L_0x004e
        L_0x0023:
            int r0 = r1 + -1
            r0 = r5[r0]
            r6.A01 = r0
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0I(r6)
            int r0 = r6.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0M(r6, r0)
            int[] r3 = com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A1R
            int r2 = r6.A01
            r1 = 0
        L_0x0036:
            r0 = r5[r1]
            if (r0 == r2) goto L_0x003f
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x0036
            r1 = -1
        L_0x003f:
            r0 = r3[r1]
            java.lang.String r0 = X.AnonymousClass3MY.A0n(r6, r0)
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0e(r6, r0)
            goto L_0x0010
        L_0x0049:
            int r1 = r1 + 1
            if (r1 >= r4) goto L_0x004e
            goto L_0x001d
        L_0x004e:
            r1 = 8
            goto L_0x0023
        L_0x0051:
            java.lang.Object r6 = r8.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r6 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r6
            int r2 = r6.A00
            int[] r5 = X.AnonymousClass74F.A01
            r4 = 21
            r1 = 0
        L_0x005c:
            r0 = r5[r1]
            if (r0 != r2) goto L_0x008a
            if (r1 <= 0) goto L_0x008f
        L_0x0062:
            int r0 = r1 + -1
            r0 = r5[r0]
            r6.A00 = r0
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0G(r6)
            int[] r3 = com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A1Q
            int r2 = r6.A00
            r1 = 0
        L_0x0070:
            r0 = r5[r1]
            if (r0 == r2) goto L_0x0079
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x0070
            r1 = -1
        L_0x0079:
            r0 = r3[r1]
            java.lang.String r0 = X.AnonymousClass3MY.A0n(r6, r0)
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0e(r6, r0)
            X.1hg r0 = r6.A26()
            r0.A03()
            goto L_0x0010
        L_0x008a:
            int r1 = r1 + 1
            if (r1 >= r4) goto L_0x008f
            goto L_0x005c
        L_0x008f:
            r1 = 21
            goto L_0x0062
        L_0x0092:
            java.lang.Object r4 = r8.A01
            X.6uj r4 = (X.C136986uj) r4
            r5 = 0
            X.C18070vi.A0d(r4, r5)
            X.7JF r0 = r4.A05
            if (r0 == 0) goto L_0x0010
            X.6ud r0 = r4.A04
            if (r0 == 0) goto L_0x0010
            X.A4v r2 = r4.A0J
            X.7JS r0 = r4.A0G
            int r1 = r0.A06()
            r0 = 57
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 4
            r2.A02(r0, r3, r1)
            X.7JF r2 = r4.A05
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r2.A0P
            X.70N r0 = r1.A0M
            r0.A05()
            X.73x r0 = r1.A0J
            r0.A06()
            r0.A07()
            X.6yX r0 = r2.A0R
            r0.A02 = r5
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r2.A0L
            r0.A05(r5)
            X.6ud r0 = r2.A0J
            r0.A00()
            X.6uj r0 = r2.A0W
            r0.A07(r5)
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r4.A0I
            android.widget.ImageView r0 = r0.A0C
            if (r0 == 0) goto L_0x00e1
            r0.setVisibility(r3)
        L_0x00e1:
            X.6ud r0 = r4.A04
            r0.A03()
            X.7JF r0 = r4.A05
            X.AnonymousClass7JF.A05(r0)
            goto L_0x0010
        L_0x00ed:
            java.lang.Object r4 = r8.A01
            X.6uj r4 = (X.C136986uj) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.6c7 r0 = r4.A0H
            com.whatsapp.mediacomposer.MediaComposerActivity r5 = r0.A00
            X.6uj r0 = X.C108955ca.A0U(r5)
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0I
            boolean r0 = r0.A0e
            if (r0 != 0) goto L_0x0120
            X.3Rj r1 = X.AnonymousClass4a6.A00(r5)
            r0 = 2131891941(0x7f1216e5, float:1.9418616E38)
            r1.A0E(r0)
            r0 = 2131891940(0x7f1216e4, float:1.9418614E38)
            r1.A0D(r0)
            X.C73203Rj.A06(r1)
            X.AnonymousClass3MY.A1G(r1)
        L_0x0119:
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r4.A0I
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.A01(r0)
            goto L_0x0010
        L_0x0120:
            X.A4v r3 = X.C108965cb.A0f(r5)
            X.7JS r0 = r5.A0X
            int r2 = r0.A06()
            boolean r1 = com.whatsapp.mediacomposer.MediaComposerActivity.A1H(r5)
            r0 = 31
            if (r1 != 0) goto L_0x0134
            r0 = 30
        L_0x0134:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 4
            r3.A02(r1, r0, r2)
            com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel r0 = r5.A0j
            r0.A0V()
            goto L_0x0119
        L_0x0142:
            java.lang.Object r0 = r8.A01
            X.5cz r0 = (X.C109205cz) r0
            X.6z9 r3 = r0.A08
            if (r3 != 0) goto L_0x014d
            java.lang.String r0 = "penDialogController"
            goto L_0x01bd
        L_0x014d:
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0010
            X.87P r0 = r3.A08
            r0.CFU()
            X.6m4 r2 = r3.A0B
            X.70N r1 = r2.A01
            X.6yr r0 = r1.A03
            java.util.List r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x016f
            r1.A05()
            X.73x r0 = r2.A00
            r0.A06()
            r0.A07()
        L_0x016f:
            r0 = 1
            X.C139616z9.A00(r3, r0)
            goto L_0x0010
        L_0x0175:
            java.lang.Object r1 = r8.A01
            X.5nM r1 = (X.C113605nM) r1
            r7 = 0
            X.7G8 r4 = new X.7G8
            r4.<init>(r1, r7)
            X.1KW r5 = r1.A04
            android.widget.ImageView r3 = r1.A02
            X.737 r0 = r1.A01
            int[] r6 = r0.A00
            X.5gg r2 = new X.5gg
            r2.<init>(r3, r4, r5, r6, r7)
            com.whatsapp.emoji.EmojiContainerView r0 = r1.A03
            android.view.View r0 = r0.getRootView()
            X.AnonymousClass72X.A01(r3, r0, r2)
            goto L_0x0010
        L_0x0197:
            java.lang.Object r0 = r8.A01
            X.8A5 r0 = (X.AnonymousClass8A5) r0
            r0.C5g()
            goto L_0x0010
        L_0x01a0:
            java.lang.Object r2 = r8.A01
            X.5wQ r2 = (X.C116115wQ) r2
            java.util.List r0 = X.C42011xT.A0I
            X.70A r1 = r2.A05
            if (r1 == 0) goto L_0x0010
            X.5bq r0 = r2.A00
            if (r0 == 0) goto L_0x0010
            r0.BxT(r1)
            goto L_0x0010
        L_0x01b3:
            java.lang.Object r0 = r8.A01
            com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet r0 = (com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet) r0
            X.5jD r1 = r0.A0J
            if (r1 != 0) goto L_0x01c8
            java.lang.String r0 = "viewModel"
        L_0x01bd:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x01c2:
            java.lang.Object r1 = r8.A01
            X.5jD r1 = (X.C111225jD) r1
            java.util.List r0 = X.C42011xT.A0I
        L_0x01c8:
            X.6jC r0 = X.C111225jD.A03(r1)
            if (r0 == 0) goto L_0x0010
            android.graphics.Bitmap r0 = r0.A00
            if (r0 == 0) goto L_0x0010
            X.1DT r1 = r1.A0Q
            r0 = 1
            X.AnonymousClass3MY.A1L(r1, r0)
            goto L_0x0010
        L_0x01da:
            java.lang.Object r0 = r8.A01
            X.73R r0 = (X.AnonymousClass73R) r0
            X.AnonymousClass73R.A02(r9, r0)
            goto L_0x0010
        L_0x01e3:
            java.lang.Object r2 = r8.A01
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            X.1bI r0 = r2.A0x
            if (r0 == 0) goto L_0x01f8
            X.00H r0 = r2.A14
            java.lang.Object r1 = r0.get()
            X.2mz r1 = (X.C59852mz) r1
            X.1bI r0 = r2.A0x
            r1.A02(r0)
        L_0x01f8:
            r1 = 0
            r0 = 8
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r0 = X.C83434Fc.A00(r1, r0)
            r2.CMl(r0)
            goto L_0x0010
        L_0x0204:
            java.lang.Object r1 = r8.A01
            X.5n5 r1 = (X.C113435n5) r1
            java.util.List r0 = X.C42011xT.A0I
            android.view.View$OnLongClickListener r0 = r1.A00
            if (r0 == 0) goto L_0x0213
            boolean r0 = r0.onLongClick(r9)
            return r0
        L_0x0213:
            r0 = 0
            return r0
        L_0x0215:
            java.lang.Object r0 = r8.A01
            X.6GW r0 = (X.AnonymousClass6GW) r0
            r0.A0C()
            java.lang.String r2 = r0.A04
            X.11C r1 = r0.A02
            X.1KB r0 = r0.A01
            boolean r0 = X.AnonymousClass73K.A02(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1421478i.onLongClick(android.view.View):boolean");
    }
}
