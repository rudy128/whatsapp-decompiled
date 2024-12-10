package X;

/* renamed from: X.5Rw  reason: invalid class name and case insensitive filesystem */
public final class C105405Rw extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C78953tz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105405Rw(C78953tz r2) {
        super(1);
        this.this$0 = r2;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [X.4EV] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r5 = r19
            java.util.List r5 = (java.util.List) r5
            r1 = r18
            X.3tz r2 = r1.this$0
            X.C18070vi.A0b(r5)
            boolean r0 = r2 instanceof X.C78583t7
            if (r0 == 0) goto L_0x015a
            X.3t7 r2 = (X.C78583t7) r2
            r7 = 0
            X.C18070vi.A0d(r5, r7)
            X.0ve r3 = r2.A0F
            r0 = 8313(0x2079, float:1.1649E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r16 = X.C18020vd.A05(r10, r3, r0)
            if (r16 == 0) goto L_0x0024
            r2.A2n()
        L_0x0024:
            java.util.Iterator r15 = r5.iterator()
            r9 = 0
            r14 = r9
            r13 = r9
            r5 = r9
            r12 = 0
        L_0x002d:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r4 = r15.next()
            X.4EV r4 = (X.AnonymousClass4EV) r4
            boolean r0 = r4 instanceof X.AnonymousClass400
            r11 = 1
            if (r0 == 0) goto L_0x0050
            android.content.res.Resources r8 = r2.getResources()
            r6 = 2131890486(0x7f121136, float:1.9415665E38)
            java.lang.Object[] r3 = new java.lang.Object[r11]
            X.400 r4 = (X.AnonymousClass400) r4
            java.lang.String r0 = r4.A00
            java.lang.String r9 = X.AnonymousClass3MW.A0x(r8, r0, r3, r7, r6)
            goto L_0x002d
        L_0x0050:
            boolean r0 = r4 instanceof X.AnonymousClass403
            if (r0 == 0) goto L_0x007d
            X.403 r4 = (X.AnonymousClass403) r4
            int r0 = r4.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x006c
            int r0 = r4.A01
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L_0x006c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002d
            int r0 = r4.A01
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            goto L_0x002d
        L_0x007d:
            boolean r0 = r4 instanceof X.AnonymousClass402
            if (r0 == 0) goto L_0x0086
            X.402 r4 = (X.AnonymousClass402) r4
            java.lang.String r5 = r4.A00
            goto L_0x002d
        L_0x0086:
            boolean r0 = r4 instanceof X.C81873zy
            if (r0 == 0) goto L_0x002d
            X.3zy r4 = (X.C81873zy) r4
            X.9tc r0 = r4.A00
            java.lang.String r3 = "SUSPICIOUS"
            java.lang.String r0 = r0.A08
            boolean r12 = r3.equals(r0)
            goto L_0x002d
        L_0x0097:
            r8 = 8
            if (r12 == 0) goto L_0x00c5
            X.00H r0 = r2.A1e
            java.lang.Object r6 = r0.get()
            X.A1E r6 = (X.A1E) r6
            X.1E7 r4 = r2.A03
            X.C18070vi.A0d(r4, r7)
            X.9aH r0 = r6.A02
            X.0ve r3 = r0.A01
            r0 = 11083(0x2b4b, float:1.553E-41)
            boolean r0 = X.C18020vd.A05(r10, r3, r0)
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L_0x00c5
            boolean r0 = X.A1E.A00(r6, r4)
            if (r0 == 0) goto L_0x00c5
            com.whatsapp.WaTextView r0 = r2.A09
            r0.setVisibility(r8)
        L_0x00c5:
            java.lang.String r6 = ""
            if (r12 != 0) goto L_0x0158
            if (r16 == 0) goto L_0x00d3
            X.1E7 r0 = r2.A03
            boolean r0 = r0.A0O()
            if (r0 != 0) goto L_0x0158
        L_0x00d3:
            android.content.res.Resources r3 = r2.getResources()
            r0 = 2131887564(0x7f1205cc, float:1.9409739E38)
            java.lang.String r3 = X.AnonymousClass3MY.A0m(r3, r0)
        L_0x00de:
            java.lang.String r4 = " • "
            if (r9 == 0) goto L_0x00f1
            boolean r0 = r3.equals(r6)
            if (r0 != 0) goto L_0x00f0
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r9, r4, r3)
            java.lang.String r9 = r0.toString()
        L_0x00f0:
            r3 = r9
        L_0x00f1:
            android.text.SpannableStringBuilder r9 = X.AnonymousClass3MW.A09(r3)
            if (r14 == 0) goto L_0x0101
            int r3 = r14.intValue()
            r0 = 2131232205(0x7f0805cd, float:1.8080513E38)
            X.C78583t7.A04(r9, r2, r3, r0)
        L_0x0101:
            if (r13 == 0) goto L_0x010d
            int r3 = r13.intValue()
            r0 = 2131232208(0x7f0805d0, float:1.8080519E38)
            X.C78583t7.A04(r9, r2, r3, r0)
        L_0x010d:
            if (r5 == 0) goto L_0x011f
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x011c
            android.text.SpannableStringBuilder r0 = X.AnonymousClass3MW.A09(r4)
            r9.append(r0)
        L_0x011c:
            r9.append(r5)
        L_0x011f:
            if (r14 != 0) goto L_0x0123
            if (r13 == 0) goto L_0x0136
        L_0x0123:
            X.206 r0 = r2.A0I
            X.205 r0 = r0.A0v
            X.1BI r6 = r0.A00
            if (r6 == 0) goto L_0x0136
            X.4VE r5 = r2.A0E
            java.lang.String r4 = "pref_fmx_card_view_trust_signal_fb_ig_pending_chats"
            X.3UR r3 = r2.A0F
            r0 = 10
            r5.A01(r3, r6, r4, r0)
        L_0x0136:
            com.whatsapp.TextEmojiLabel r3 = r2.A0D
            r3.setText(r9)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A0C
            r0.A04()
            r0.setVisibility(r8)
            r3.setVisibility(r7)
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A0H
            r0.setVisibility(r8)
            X.0vb r4 = r2.A0D
            int r8 = X.C72463Mc.A08(r2)
            r5 = r7
            r6 = r7
            X.C27641Ww.A07(r3, r4, r5, r6, r7, r8)
            goto L_0x0289
        L_0x0158:
            r3 = r6
            goto L_0x00de
        L_0x015a:
            r14 = 0
            X.C18070vi.A0d(r5, r14)
            android.content.res.Resources r3 = r2.getResources()
            r0 = 2131890487(0x7f121137, float:1.9415667E38)
            java.lang.String r4 = X.AnonymousClass3MY.A0m(r3, r0)
            java.util.Iterator r10 = r5.iterator()
            r6 = 0
            r5 = r6
        L_0x016f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x020f
            java.lang.Object r8 = r10.next()
            X.4EV r8 = (X.AnonymousClass4EV) r8
            boolean r0 = r8 instanceof X.AnonymousClass401
            if (r0 == 0) goto L_0x018d
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x016f
            com.whatsapp.WaTextView r3 = r2.A09
            X.401 r8 = (X.AnonymousClass401) r8
            java.lang.String r0 = r8.A00
            r3.setText(r0)
            goto L_0x016f
        L_0x018d:
            boolean r0 = r8 instanceof X.AnonymousClass400
            r9 = 1
            if (r0 == 0) goto L_0x01a4
            android.content.res.Resources r7 = r2.getResources()
            r6 = 2131890486(0x7f121136, float:1.9415665E38)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            X.400 r8 = (X.AnonymousClass400) r8
            java.lang.String r0 = r8.A00
            java.lang.String r6 = X.AnonymousClass3MW.A0x(r7, r0, r3, r14, r6)
            goto L_0x016f
        L_0x01a4:
            boolean r0 = r8 instanceof X.C81883zz
            if (r0 == 0) goto L_0x016f
            r5 = r8
            X.3zz r5 = (X.C81883zz) r5
            X.9rc r8 = r5.A00
            X.2ml r0 = r8.A02
            java.lang.String r3 = r0.A03
            X.4VE r0 = r2.A0E
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x01fd
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x01fd
            int r0 = r8.A00
            if (r0 != r9) goto L_0x01e3
            android.content.res.Resources r7 = r2.getResources()
            r4 = 2131896155(0x7f12275b, float:1.9427163E38)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            X.2ml r0 = r8.A02
            java.lang.String r0 = r0.A03
            r3[r14] = r0
        L_0x01d0:
            java.lang.String r4 = r7.getString(r4, r3)
            X.C18070vi.A0X(r4)
        L_0x01d7:
            int r0 = r8.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 9
            X.C78953tz.A05(r2, r3, r0)
            goto L_0x016f
        L_0x01e3:
            if (r0 <= r9) goto L_0x01d7
            android.content.res.Resources r7 = r2.getResources()
            r4 = 2131892344(0x7f121878, float:1.9419434E38)
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1b()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r14] = r0
            X.2ml r0 = r8.A02
            java.lang.String r0 = r0.A03
            r3[r9] = r0
            goto L_0x01d0
        L_0x01fd:
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131755047(0x7f100027, float:1.9140962E38)
            int r0 = r8.A00
            java.lang.String r4 = X.C72473Md.A0k(r4, r0, r3)
            X.C18070vi.A0X(r4)
            goto L_0x016f
        L_0x020f:
            android.content.res.Resources r3 = r2.getResources()
            r0 = 2131890488(0x7f121138, float:1.941567E38)
            java.lang.String r0 = X.AnonymousClass3MY.A0m(r3, r0)
            java.lang.String r3 = " • "
            if (r6 == 0) goto L_0x0226
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r6, r3, r0)
            java.lang.String r0 = r0.toString()
        L_0x0226:
            r2.A08 = r0
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r0, r3, r4)
            java.lang.String r0 = r0.toString()
            r2.A08 = r0
            r3 = 8
            com.whatsapp.TextEmojiLabel r12 = r2.A0D
            if (r5 == 0) goto L_0x02a7
            X.1np r6 = r2.A1R
            android.content.Context r7 = r12.getContext()
            java.lang.String r9 = r2.A08
            android.content.Context r5 = r2.getContext()
            r4 = 2130971977(0x7f040d49, float:1.7552708E38)
            r0 = 2131103150(0x7f060dae, float:1.7818758E38)
            int r11 = X.AnonymousClass1YL.A00(r5, r4, r0)
            r0 = 7
            X.4ri r8 = new X.4ri
            r8.<init>((java.lang.Object) r2, (int) r0)
            java.lang.String r10 = "common-group"
            android.text.SpannableStringBuilder r0 = r6.A06(r7, r8, r9, r10, r11)
            r12.setText(r0)
            X.11C r0 = r2.A0C
            X.AnonymousClass3Ma.A1K(r12, r0)
            X.0ve r0 = r2.A0F
            X.AnonymousClass3Ma.A1I(r12, r0)
            X.4VE r0 = r2.A0E
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x027e
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A0H
            r0.setVisibility(r3)
            X.0vb r13 = r2.A0D
            int r17 = X.C72463Mc.A08(r2)
            r16 = r14
            r15 = r14
            X.C27641Ww.A07(r12, r13, r14, r15, r16, r17)
        L_0x027e:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A0C
            r0.A04()
            r0.setVisibility(r3)
            r12.setVisibility(r14)
        L_0x0289:
            X.3tz r1 = r1.this$0
            boolean r0 = r1.A0A
            if (r0 != 0) goto L_0x02a4
            r0 = 1
            r1.A0A = r0
            X.206 r0 = r1.A0I
            X.205 r0 = r0.A0v
            X.1BI r4 = r0.A00
            if (r4 == 0) goto L_0x02a4
            X.4VE r3 = r1.A0E
            java.lang.String r2 = "fmx_card_view_pending_chats"
            X.3UR r1 = r1.A0F
            r0 = 7
            r3.A01(r1, r4, r2, r0)
        L_0x02a4:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x02a7:
            r12.setText(r0)
            goto L_0x027e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105405Rw.invoke(java.lang.Object):java.lang.Object");
    }
}
