package X;

/* renamed from: X.3AR  reason: invalid class name */
public class AnonymousClass3AR implements C38531rR {
    public final int A00;
    public final Object A01;

    public AnonymousClass3AR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x016b, code lost:
        com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A04(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x016e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        if (r1 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r3.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bvu(android.view.View r22) {
        /*
            r21 = this;
            r3 = r22
            r1 = r21
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x018d;
                case 1: goto L_0x016f;
                case 2: goto L_0x0128;
                case 3: goto L_0x00e0;
                case 4: goto L_0x00a5;
                case 5: goto L_0x0022;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r1.A01
            X.1rT r1 = (X.C38551rT) r1
            r0 = 2131429654(0x7f0b0916, float:1.8480987E38)
            android.view.View r3 = r3.findViewById(r0)
            X.C18070vi.A0b(r3)
            boolean r1 = r1.A05
        L_0x0019:
            r0 = 8
            if (r1 == 0) goto L_0x001e
            r0 = 0
        L_0x001e:
            r3.setVisibility(r0)
            return
        L_0x0022:
            java.lang.Object r2 = r1.A01
            X.1rQ r2 = (X.C38521rQ) r2
            r0 = 2131429648(0x7f0b0910, float:1.8480975E38)
            android.view.View r4 = r3.findViewById(r0)
            com.whatsapp.WaTextView r4 = (com.whatsapp.WaTextView) r4
            android.content.Context r1 = r2.A00
            r0 = 2131890509(0x7f12114d, float:1.9415712E38)
            java.lang.String r5 = X.C18070vi.A0F(r1, r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131895845(0x7f122625, float:1.9426535E38)
            java.lang.String r10 = X.C18070vi.A0F(r1, r0)
            r1 = 1
            r11 = 4
            r14 = 0
            r12 = 0
            r18 = 1
            r13 = -1
            X.1x1 r9 = new X.1x1
            r16 = r14
            r20 = r1
            r9.<init>(r10, r11, r12, r13, r14, r16, r18, r20)
            X.1np r8 = r2.A05
            android.content.Context r7 = r3.getContext()
            r0 = 42
            X.4rb r6 = new X.4rb
            r6.<init>(r2, r3, r9, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r12] = r5
            java.lang.String r5 = "<a href='link'>%s</a>"
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = X.AnonymousClass1EG.A0K(r0)
            java.lang.String r1 = java.lang.String.format(r1, r5, r0)
            java.lang.String r0 = "link"
            android.text.SpannableStringBuilder r0 = r8.A05(r7, r6, r1, r0)
            r4.setText(r0)
            X.11C r1 = r2.A02
            X.1t2 r0 = new X.1t2
            r0.<init>(r4, r1)
            r4.setAccessibilityHelper(r0)
            r1 = 2
            X.BJf r0 = new X.BJf
            r0.<init>(r1)
            X.AnonymousClass1HF.A0f(r4, r0)
            X.0ve r1 = r2.A03
            X.1t5 r0 = new X.1t5
            r0.<init>(r1)
            r4.setMovementMethod(r0)
            r0 = 2131429597(0x7f0b08dd, float:1.8480871E38)
            android.view.View r3 = r3.findViewById(r0)
            X.C18070vi.A0b(r3)
            boolean r1 = r2.A07
            goto L_0x0019
        L_0x00a5:
            java.lang.Object r6 = r1.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r6 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragment) r6
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.content.Context r0 = r6.A1n()
            com.whatsapp.EmptyTellAFriendView r5 = new com.whatsapp.EmptyTellAFriendView
            r5.<init>(r0)
            r0 = 2131428766(0x7f0b059e, float:1.8479186E38)
            r5.setId(r0)
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r5, r0)
            int r2 = r4.getPaddingLeft()
            r1 = 0
            int r0 = r4.getPaddingRight()
            r4.setPadding(r2, r1, r0, r1)
            r3.addView(r5)
            r1 = 30
            X.4dA r0 = new X.4dA
            r0.<init>(r6, r1)
            r5.setInviteButtonClickListener(r0)
            boolean r0 = X.C22891Dp.A02
            r6.A0v = r0
            goto L_0x016b
        L_0x00e0:
            java.lang.Object r4 = r1.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r4 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragment) r4
            r0 = 2131430237(0x7f0b0b5d, float:1.848217E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r3, r0)
            com.whatsapp.TextEmojiLabel r3 = (com.whatsapp.TextEmojiLabel) r3
            r0 = 2131894505(0x7f1220e9, float:1.9423817E38)
            java.lang.String r8 = r4.A1H(r0)
            X.1np r5 = r4.A0X
            android.content.Context r6 = r3.getContext()
            android.content.Context r2 = r3.getContext()
            r1 = 2130968627(0x7f040033, float:1.7545913E38)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r10 = X.AnonymousClass1YL.A00(r2, r1, r0)
            java.lang.Runnable r7 = r4.A18
            java.lang.String r9 = "%s"
            android.text.SpannableStringBuilder r0 = r5.A06(r6, r7, r8, r9, r10)
            r3.setText(r0)
            X.11C r1 = r4.A0L
            X.1t2 r0 = new X.1t2
            r0.<init>(r3, r1)
            r3.setAccessibilityHelper(r0)
            X.0ve r1 = r4.A0T
            X.1t5 r0 = new X.1t5
            r0.<init>(r1)
            r3.setLinkHandler(r0)
            return
        L_0x0128:
            java.lang.Object r6 = r1.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r6 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragment) r6
            r0 = 2131437064(0x7f0b2608, float:1.8496016E38)
            android.view.View r7 = X.AnonymousClass1HF.A06(r3, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            X.1FL r1 = r6.A1D()
            r0 = 2131898526(0x7f12309e, float:1.9431972E38)
            java.lang.String r5 = r1.getString(r0)
            android.content.Context r4 = r6.A14()
            X.0ve r2 = r6.A0T
            r1 = 5370(0x14fa, float:7.525E-42)
            X.0vf r0 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r0, r2, r1)
            r0 = 1
            r1 = 2131231649(0x7f0803a1, float:1.8079385E38)
            if (r2 != r0) goto L_0x0157
            r1 = 2131233191(0x7f0809a7, float:1.8082513E38)
        L_0x0157:
            r0 = 2131101222(0x7f060626, float:1.7814848E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A02(r4, r1, r0)
            android.text.TextPaint r1 = r7.getPaint()
            java.lang.String r0 = "%s"
            android.text.SpannableStringBuilder r0 = X.C72813Np.A02(r1, r2, r5, r0)
            r7.setText(r0)
        L_0x016b:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A04(r3, r6)
            return
        L_0x016f:
            r0 = 2131434939(0x7f0b1dbb, float:1.8491706E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r3, r0)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r3)
            r0 = 2131168571(0x7f070d3b, float:1.7951448E38)
            int r2 = r1.getDimensionPixelSize(r0)
            int r1 = r3.getPaddingLeft()
            int r0 = r3.getPaddingRight()
            r3.setPadding(r1, r2, r0, r2)
            return
        L_0x018d:
            java.lang.Object r4 = r1.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r4 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragment) r4
            r0 = 2131428611(0x7f0b0503, float:1.8478871E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r3, r0)
            r1 = 17
            X.48l r0 = new X.48l
            r0.<init>(r4, r1)
            r2.setOnClickListener(r0)
            r0 = 2131430373(0x7f0b0be5, float:1.8482445E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r3, r0)
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A04(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AR.Bvu(android.view.View):void");
    }
}
