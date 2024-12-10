package X;

/* renamed from: X.4sE  reason: invalid class name and case insensitive filesystem */
public class C99074sE implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;

    public C99074sE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0151, code lost:
        return X.C27621Wu.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x0015;
                case 2: goto L_0x0025;
                case 3: goto L_0x0051;
                case 4: goto L_0x012c;
                case 5: goto L_0x0035;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r14.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131103368(0x7f060e88, float:1.78192E38)
            int r0 = X.C19740yt.A00(r1, r0)
        L_0x0010:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0015:
            java.lang.Object r0 = r14.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131169420(0x7f07108c, float:1.795317E38)
            int r0 = r1.getDimensionPixelSize(r0)
            goto L_0x0010
        L_0x0025:
            java.lang.Object r0 = r14.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131169421(0x7f07108d, float:1.7953172E38)
            int r0 = r1.getDimensionPixelSize(r0)
            goto L_0x0010
        L_0x0035:
            java.lang.Object r2 = r14.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2130971877(0x7f040ce5, float:1.7552505E38)
            r0 = 2131103027(0x7f060d33, float:1.7818509E38)
            int r0 = X.AnonymousClass3Ma.A00(r2, r1, r0)
            goto L_0x0010
        L_0x0044:
            java.lang.Object r1 = r14.A01
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 2
            X.5yZ r2 = new X.5yZ
            r2.<init>(r1, r0)
            return r2
        L_0x0051:
            java.lang.Object r5 = r14.A01
            com.whatsapp.wds.components.textlayout.WDSTextLayout r5 = (com.whatsapp.wds.components.textlayout.WDSTextLayout) r5
            X.4CN r0 = r5.getLayoutStyle()
            if (r0 == 0) goto L_0x014f
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x00c9
            r0 = 1
            if (r1 != r0) goto L_0x0122
            X.4Cg r0 = r5.getLayoutSize()
            if (r0 != 0) goto L_0x006d
            X.4Cg r0 = X.C82834Cg.MEDIUM
        L_0x006d:
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x00c6
            r0 = 1
            if (r1 != r0) goto L_0x011d
            X.4Ce r3 = X.C82814Ce.MEDIUM
        L_0x0079:
            android.graphics.drawable.Drawable r2 = r5.getHeaderImage()
            java.lang.CharSequence r1 = r5.getHeadlineText()
            java.lang.CharSequence r0 = r5.getDescriptionText()
            X.4Uk r10 = new X.4Uk
            r10.<init>(r2, r3, r1, r0)
            X.4Cf r11 = r5.getFootnotePosition()
            if (r11 != 0) goto L_0x0092
            X.4Cf r11 = X.C82824Cf.CONTENT_END
        L_0x0092:
            X.4F6 r12 = r5.getContent()
            java.lang.CharSequence r13 = r5.getFootnoteText()
            java.lang.String r1 = r5.getPrimaryButtonText()
            android.view.View$OnClickListener r0 = r5.getPrimaryButtonClickListener()
            if (r1 == 0) goto L_0x00c4
            X.4Tx r8 = new X.4Tx
            r8.<init>(r0, r1)
        L_0x00a9:
            java.lang.String r1 = r5.getSecondaryButtonText()
            android.view.View$OnClickListener r0 = r5.getSecondaryButtonClickListener()
            if (r1 == 0) goto L_0x00c2
            X.4Tx r9 = new X.4Tx
            r9.<init>(r0, r1)
        L_0x00b8:
            X.4CI r7 = new X.4CI
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x00bd:
            r5.setTextLayoutViewState(r7)
            goto L_0x014f
        L_0x00c2:
            r9 = 0
            goto L_0x00b8
        L_0x00c4:
            r8 = 0
            goto L_0x00a9
        L_0x00c6:
            X.4Ce r3 = X.C82814Ce.SMALL
            goto L_0x0079
        L_0x00c9:
            X.4Cg r0 = r5.getLayoutSize()
            if (r0 != 0) goto L_0x00d1
            X.4Cg r0 = X.C82834Cg.MEDIUM
        L_0x00d1:
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x011a
            r0 = 1
            if (r1 != r0) goto L_0x0127
            X.4Ce r3 = X.C82814Ce.MEDIUM
        L_0x00dd:
            android.graphics.drawable.Drawable r2 = r5.getHeaderImage()
            java.lang.CharSequence r1 = r5.getHeadlineText()
            java.lang.CharSequence r0 = r5.getDescriptionText()
            X.4Uk r6 = new X.4Uk
            r6.<init>(r2, r3, r1, r0)
            java.lang.CharSequence r4 = r5.getFootnoteText()
            java.lang.String r1 = r5.getPrimaryButtonText()
            android.view.View$OnClickListener r0 = r5.getPrimaryButtonClickListener()
            if (r1 == 0) goto L_0x0118
            X.4Tx r3 = new X.4Tx
            r3.<init>(r0, r1)
        L_0x0101:
            java.lang.String r2 = r5.getSecondaryButtonText()
            android.view.View$OnClickListener r1 = r5.getSecondaryButtonClickListener()
            if (r2 == 0) goto L_0x0116
            X.4Tx r0 = new X.4Tx
            r0.<init>(r1, r2)
        L_0x0110:
            X.4CH r7 = new X.4CH
            r7.<init>(r3, r0, r6, r4)
            goto L_0x00bd
        L_0x0116:
            r0 = 0
            goto L_0x0110
        L_0x0118:
            r3 = 0
            goto L_0x0101
        L_0x011a:
            X.4Ce r3 = X.C82814Ce.SMALL
            goto L_0x00dd
        L_0x011d:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0122:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0127:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x012c:
            java.lang.Object r2 = r14.A01
            X.3S9 r2 = (X.AnonymousClass3S9) r2
            androidx.core.widget.NestedScrollView r1 = r2.A04
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 != 0) goto L_0x0152
            r0 = -1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 != 0) goto L_0x0152
            X.0vl r0 = r2.A09
            int r0 = X.C72453Mb.A0I(r0)
        L_0x014a:
            android.view.View r1 = r2.A01
            r1.setBackgroundColor(r0)
        L_0x014f:
            X.1Wu r2 = X.C27621Wu.A00
            return r2
        L_0x0152:
            X.0vl r0 = r2.A08
            int r0 = X.C72453Mb.A0I(r0)
            goto L_0x014a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99074sE.invoke():java.lang.Object");
    }
}
