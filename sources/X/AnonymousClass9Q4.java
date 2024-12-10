package X;

/* renamed from: X.9Q4  reason: invalid class name */
public abstract class AnonymousClass9Q4 {
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        if (r1.size() >= 3) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass3uP r11, X.C108875cR r12, com.whatsapp.conversation.conversationrow.DynamicButtonsLayout r13, com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout r14, X.C18000vb r15, X.C194599rz r16) {
        /*
            r8 = 0
            r7 = 1
            X.C18070vi.A0d(r13, r7)
            r0 = 2
            r10 = r14
            X.C18070vi.A0d(r14, r0)
            r0 = 4
            r9 = r15
            X.C18070vi.A0d(r15, r0)
            r0 = r16
            if (r16 == 0) goto L_0x004d
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.List r3 = r0.A02
            java.util.Iterator r2 = r3.iterator()
        L_0x001d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r1 = r2.next()
            X.9t8 r1 = (X.C195309t8) r1
            X.AEe r0 = r1.A02
            if (r0 != 0) goto L_0x001d
            r4.add(r1)
            goto L_0x001d
        L_0x0031:
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r3.iterator()
        L_0x0039:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r2 = r3.next()
            X.9t8 r2 = (X.C195309t8) r2
            X.AEe r0 = r2.A02
            if (r0 == 0) goto L_0x0039
            r1.add(r2)
            goto L_0x0039
        L_0x004d:
            r4 = 0
            r1 = r4
        L_0x004f:
            r3 = 8
            if (r12 == 0) goto L_0x018c
            boolean r0 = r12.CMM()
            if (r0 != r7) goto L_0x018c
            if (r4 == 0) goto L_0x018c
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x018c
            X.4Pl r0 = r11.A2u
            r13.A05(r0, r4)
            r13.setVisibility(r8)
        L_0x0069:
            if (r1 == 0) goto L_0x0195
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0195
            int r0 = r1.size()
            r12 = 0
            if (r0 <= 0) goto L_0x0080
            int r4 = r1.size()
            r2 = 3
            r0 = 1
            if (r4 < r2) goto L_0x0081
        L_0x0080:
            r0 = 0
        L_0x0081:
            X.C17960vV.A0C(r0)
            com.whatsapp.TextEmojiLabel[] r6 = r14.A08
            r0 = r6[r8]
            r0.setVisibility(r3)
            android.view.View[] r5 = r14.A07
            r0 = r5[r8]
            r0.setVisibility(r3)
            r0 = r6[r7]
            r0.setVisibility(r3)
            r0 = r5[r7]
            r0.setVisibility(r3)
            android.view.View r13 = r14.A03
            r13.setVisibility(r3)
            android.view.View r2 = r14.A04
            r2.setVisibility(r3)
            java.util.List r4 = r14.A06
            r4.clear()
            r4.addAll(r1)
            r1 = 0
            java.lang.Object r0 = r4.get(r8)
            X.9t8 r0 = (X.C195309t8) r0
            X.AEe r0 = r0.A02
            if (r0 == 0) goto L_0x00c8
            X.00H r14 = r14.A00
            java.lang.Object r15 = r14.get()
            X.1l7 r15 = (X.C34811l7) r15
            java.lang.String r14 = r0.A02
            java.lang.String r0 = r0.A00
            r15.A02(r14, r0)
        L_0x00c8:
            r15 = -2
            android.widget.LinearLayout r0 = r10.A05
            r0.setOrientation(r7)
            r0 = -1
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r0, r15)
            r0 = r5[r8]
            r0.setLayoutParams(r14)
            r0 = r5[r7]
            r0.setLayoutParams(r14)
            int r0 = r4.size()
            if (r0 > r7) goto L_0x00e6
            r1 = 8
        L_0x00e6:
            r13.setVisibility(r1)
            r2.setVisibility(r3)
        L_0x00ec:
            int r0 = r4.size()
            if (r12 >= r0) goto L_0x0191
            java.lang.Object r13 = r4.get(r12)
            X.9t8 r13 = (X.C195309t8) r13
            X.C17960vV.A07(r13)
            X.AEe r15 = r13.A02
            if (r15 == 0) goto L_0x0189
            X.00H r0 = r10.A00
            java.lang.Object r2 = r0.get()
            X.1l7 r2 = (X.C34811l7) r2
            java.lang.String r1 = r15.A02
            java.lang.String r0 = r15.A00
            X.9ul r16 = r2.A02(r1, r0)
        L_0x010f:
            r14 = r6[r12]
            r3 = r5[r12]
            r14.setVisibility(r8)
            float r0 = r11.getTextFontSize()
            r14.setTextSize(r0)
            r3.setVisibility(r8)
            X.C17960vV.A07(r15)
            X.00H r0 = r10.A00
            java.lang.Object r2 = r0.get()
            X.1l7 r2 = (X.C34811l7) r2
            java.lang.String r1 = r15.A02
            java.lang.String r0 = r15.A00
            X.9ul r1 = r2.A02(r1, r0)
            r2 = 0
            if (r1 == 0) goto L_0x013e
            android.content.Context r0 = r10.getContext()
            java.lang.String r2 = r1.A09(r0, r2, r15)
        L_0x013e:
            r14.setText(r2)
            boolean r0 = r13.A00
            r14.setSelected(r0)
            if (r16 == 0) goto L_0x015d
            int r1 = r16.A04()
            r0 = -1
            if (r1 == r0) goto L_0x015d
            android.content.Context r0 = r10.getContext()
            X.3cP r1 = X.AnonymousClass3NL.A00(r0, r9, r1)
            r0 = 2131165569(0x7f070181, float:1.7945359E38)
            r14.A0P(r1, r0)
        L_0x015d:
            boolean r0 = r13.A00
            if (r0 == 0) goto L_0x017b
            r3.setClickable(r8)
        L_0x0164:
            r3.setContentDescription(r2)
            java.lang.String r0 = "Button"
            X.AnonymousClass1Y5.A07(r3, r0)
            r3.setLongClickable(r7)
            X.5hT r0 = new X.5hT
            r0.<init>(r7, r2, r10)
            X.AnonymousClass1HF.A0f(r3, r0)
            int r12 = r12 + 1
            goto L_0x00ec
        L_0x017b:
            r3.setClickable(r7)
            r1 = 10
            X.78T r0 = new X.78T
            r0.<init>(r13, r12, r1, r11)
            r3.setOnClickListener(r0)
            goto L_0x0164
        L_0x0189:
            r16 = 0
            goto L_0x010f
        L_0x018c:
            r13.setVisibility(r3)
            goto L_0x0069
        L_0x0191:
            r10.setVisibility(r8)
            return
        L_0x0195:
            r14.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Q4.A00(X.3uP, X.5cR, com.whatsapp.conversation.conversationrow.DynamicButtonsLayout, com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout, X.0vb, X.9rz):void");
    }
}
