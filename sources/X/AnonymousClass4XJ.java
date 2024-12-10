package X;

import java.util.Map;

/* renamed from: X.4XJ  reason: invalid class name */
public class AnonymousClass4XJ {
    public final Map A00;
    public final /* synthetic */ AnonymousClass4PL A01;
    public final /* synthetic */ AnonymousClass4aY A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass4XJ(AnonymousClass4PL r1, AnonymousClass4aY r2) {
        this();
        this.A02 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A3F, 4579) != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0184, code lost:
        if (X.C40811vJ.A0F(r0.A1O, r0.A3F) != false) goto L_0x0186;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C98524rI A00(java.lang.Class r25) {
        /*
            r24 = this;
            r8 = r24
            java.util.Map r2 = r8.A00
            r1 = r25
            java.lang.Object r10 = r2.get(r1)
            if (r10 != 0) goto L_0x0040
            X.4aY r0 = r8.A02
            com.whatsapp.jid.UserJid r19 = X.AnonymousClass3MW.A0j(r0)
            java.lang.Class<X.3rw> r3 = X.C77993rw.class
            if (r1 != r3) goto L_0x0047
            X.4X5 r3 = X.AnonymousClass3Ma.A0Y(r0)
            X.4JU r3 = r3.A05
            X.5cQ r12 = r0.A2Q
            X.1E7 r14 = r0.A35
            com.whatsapp.KeyboardPopupLayout r11 = r0.A1M
            X.1K2 r0 = r3.A00
            X.10E r0 = r0.A01
            X.1LU r15 = X.AnonymousClass3MY.A0Z(r0)
            X.1CJ r13 = X.AnonymousClass3Ma.A0d(r0)
            X.00S r0 = r0.A7A
            java.lang.Object r0 = r0.get()
            X.4Rq r0 = (X.C86444Rq) r0
            X.3rw r10 = new X.3rw
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
        L_0x003d:
            r2.put(r1, r10)
        L_0x0040:
            java.lang.Object r0 = r1.cast(r10)
            X.4rI r0 = (X.C98524rI) r0
            return r0
        L_0x0047:
            java.lang.Class<X.3rq> r3 = X.C77933rq.class
            if (r1 != r3) goto L_0x006d
            X.5cQ r13 = r0.A2Q
            X.1bI r15 = r0.A4N
            X.1E7 r14 = r0.A35
            X.10I r16 = r13.getWaWorkers()
            X.5cQ r3 = r0.A2Q
            X.1L9 r11 = r3.getActivityUtils()
            X.5cQ r3 = r0.A2Q
            X.1M9 r12 = r3.getContactManager()
            X.0ve r0 = r0.A3F
            boolean r17 = X.AnonymousClass1J8.A02(r0)
            X.3rq r10 = new X.3rq
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x003d
        L_0x006d:
            java.lang.Class<X.3rt> r3 = X.C77963rt.class
            if (r1 != r3) goto L_0x008d
            X.1E7 r3 = r0.A35
            if (r3 == 0) goto L_0x02c2
            X.1CJ r4 = r0.A2w
            com.whatsapp.jid.GroupJid r3 = X.AnonymousClass3MY.A0a(r3)
            int r3 = r4.A06(r3)
            if (r3 != 0) goto L_0x02c2
            X.0ve r5 = r0.A3F
            r4 = 4579(0x11e3, float:6.417E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r5, r4)
            if (r3 == 0) goto L_0x02c2
        L_0x008d:
            java.lang.Class<X.3ru> r3 = X.C77973ru.class
            if (r1 != r3) goto L_0x00dd
            X.5cQ r9 = r0.A2Q
            X.0ve r8 = r0.A3F
            X.00H r3 = r0.A5q
            java.lang.Object r3 = r3.get()
            X.2cB r3 = (X.C53222cB) r3
            X.00H r3 = r3.A00
            java.lang.Object r7 = r3.get()
            X.4XQ r7 = (X.AnonymousClass4XQ) r7
            X.00H r3 = r0.A5q
            java.lang.Object r3 = r3.get()
            X.2cB r3 = (X.C53222cB) r3
            X.00H r3 = r3.A01
            java.lang.Object r6 = r3.get()
            X.3w6 r6 = (X.C79833w6) r6
            X.00H r3 = r0.A4o
            java.lang.Object r3 = r3.get()
            X.2c9 r3 = (X.C53202c9) r3
            X.4MM r5 = r3.A01
            X.1It r4 = X.C72463Mc.A0U(r0)
            java.lang.Class<com.whatsapp.pininchat.banner.PinInChatBannerViewModel> r3 = com.whatsapp.pininchat.banner.PinInChatBannerViewModel.class
            X.1J2 r3 = r4.A00(r3)
            com.whatsapp.pininchat.banner.PinInChatBannerViewModel r3 = (com.whatsapp.pininchat.banner.PinInChatBannerViewModel) r3
            X.1bI r0 = r0.A4N
            X.3ru r10 = new X.3ru
            r11 = r9
            r12 = r5
            r13 = r6
            r14 = r8
            r15 = r3
            r16 = r7
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x003d
        L_0x00dd:
            java.lang.Class<X.3ry> r3 = X.C78013ry.class
            if (r1 != r3) goto L_0x011e
            if (r19 == 0) goto L_0x011e
            X.4JH r6 = r0.A13
            X.5cQ r15 = r0.A2Q
            X.1E7 r4 = r0.A35
            com.whatsapp.KeyboardPopupLayout r11 = r0.A1M
            boolean r3 = r0.A6n
            boolean r5 = r0.A6o
            X.1K2 r0 = r6.A00
            X.10E r0 = r0.A01
            X.11S r12 = X.AnonymousClass10E.A17(r0)
            X.1LU r18 = X.AnonymousClass3MY.A0Z(r0)
            X.10I r20 = X.AnonymousClass10E.AL1(r0)
            X.1M9 r13 = X.AnonymousClass10E.A4z(r0)
            X.1Me r14 = X.AnonymousClass3MZ.A0g(r0)
            X.00S r0 = r0.A20
            java.lang.Object r0 = r0.get()
            X.1SG r0 = (X.AnonymousClass1SG) r0
            X.3ry r10 = new X.3ry
            r16 = r0
            r17 = r4
            r21 = r3
            r22 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x003d
        L_0x011e:
            java.lang.Class<X.3rv> r3 = X.C77983rv.class
            if (r1 != r3) goto L_0x016a
            if (r19 == 0) goto L_0x016a
            X.1E7 r3 = r0.A35
            if (r3 == 0) goto L_0x016a
            boolean r3 = r3.A0C()
            if (r3 == 0) goto L_0x016a
            X.5cQ r9 = r0.A2Q
            com.whatsapp.KeyboardPopupLayout r8 = r0.A1M
            X.00H r3 = r0.A5v
            java.lang.Object r7 = r3.get()
            X.1o6 r7 = (X.C36561o6) r7
            X.00H r3 = r0.A66
            java.lang.Object r6 = r3.get()
            X.9lF r6 = (X.C190619lF) r6
            X.10I r5 = r0.A4c
            X.00H r3 = r0.A68
            java.lang.Object r4 = r3.get()
            X.A6O r4 = (X.A6O) r4
            X.0ve r3 = r0.A3F
            X.00H r0 = r0.A67
            java.lang.Object r0 = r0.get()
            X.44e r0 = (X.AnonymousClass44e) r0
            X.3rv r10 = new X.3rv
            r11 = r8
            r12 = r9
            r13 = r3
            r14 = r6
            r15 = r4
            r16 = r0
            r17 = r19
            r18 = r5
            r19 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x003d
        L_0x016a:
            java.lang.Class<X.3s0> r3 = X.AnonymousClass3s0.class
            if (r1 != r3) goto L_0x01d5
            boolean r3 = r0.A6n
            if (r3 == 0) goto L_0x01d5
            X.0ve r4 = r0.A3F
            X.11S r3 = r0.A1O
            boolean r3 = X.C40811vJ.A0C(r3, r4)
            if (r3 != 0) goto L_0x0186
            X.0ve r4 = r0.A3F
            X.11S r3 = r0.A1O
            boolean r3 = X.C40811vJ.A0F(r3, r4)
            if (r3 == 0) goto L_0x01d5
        L_0x0186:
            X.4JL r5 = r0.A1H
            X.5cQ r4 = r0.A2Q
            X.1E7 r3 = r0.A35
            com.whatsapp.KeyboardPopupLayout r11 = r0.A1M
            X.4PL r0 = r8.A01
            boolean r0 = r0.A0c
            r23 = 9
            if (r0 == 0) goto L_0x0198
            r23 = 1
        L_0x0198:
            X.1K2 r0 = r5.A00
            X.10E r5 = r0.A01
            X.0ve r20 = X.AnonymousClass10E.A8r(r5)
            X.11S r12 = X.AnonymousClass10E.A17(r5)
            X.10I r21 = X.AnonymousClass10E.AL1(r5)
            X.1Me r16 = X.AnonymousClass3MZ.A0g(r5)
            X.1M9 r15 = X.AnonymousClass10E.A4z(r5)
            X.1VP r14 = X.AnonymousClass3MZ.A0W(r5)
            X.00S r0 = r5.A99
            java.lang.Object r13 = r0.get()
            X.1HQ r13 = (X.AnonymousClass1HQ) r13
            X.00S r0 = r5.A1X
            java.lang.Object r0 = r0.get()
            X.1VT r0 = (X.AnonymousClass1VT) r0
            X.1MZ r18 = X.AnonymousClass3MY.A0V(r5)
            X.3s0 r10 = new X.3s0
            r17 = r4
            r19 = r3
            r22 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x003d
        L_0x01d5:
            java.lang.Class<X.3rr> r3 = X.C77943rr.class
            if (r1 != r3) goto L_0x0216
            boolean r3 = X.AnonymousClass4aY.A1x(r0)
            if (r3 == 0) goto L_0x0216
            X.0ve r5 = X.AnonymousClass3MX.A0h(r0)
            r4 = 9932(0x26cc, float:1.3918E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r5, r4)
            if (r3 == 0) goto L_0x0216
            X.4JK r3 = r0.A1F
            X.5cQ r12 = r0.A2Q
            X.1bI r4 = r0.A4N
            X.1K2 r0 = r3.A00
            X.10E r3 = r0.A01
            X.11P r13 = X.AnonymousClass10E.A6O(r3)
            X.0ve r15 = X.AnonymousClass10E.A8r(r3)
            X.10G r0 = r3.A00
            X.1np r16 = X.AnonymousClass3MY.A0e(r0)
            X.0z4 r14 = X.AnonymousClass3Ma.A0c(r3)
            X.1o3 r11 = X.AnonymousClass3Ma.A0T(r3)
            X.3rr r10 = new X.3rr
            r17 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x003d
        L_0x0216:
            java.lang.Class<X.3rx> r3 = X.C78003rx.class
            if (r1 != r3) goto L_0x0251
            X.1BI r3 = r0.A3R
            boolean r3 = r3 instanceof X.AnonymousClass1EC
            if (r3 == 0) goto L_0x0251
            X.5cQ r3 = r0.A2Q
            X.1kb r4 = r3.getCommunityChatManager()
            X.1BI r3 = r0.A3R
            X.1EC r3 = (X.AnonymousClass1EC) r3
            X.1EC r15 = r4.A05(r3)
            if (r15 == 0) goto L_0x02bf
            X.4JM r3 = r0.A1I
            X.5cQ r14 = r0.A2Q
            com.whatsapp.KeyboardPopupLayout r11 = r0.A1M
            X.1K2 r0 = r3.A00
            X.10E r3 = r0.A01
            X.1M9 r13 = X.AnonymousClass10E.A4z(r3)
            X.00S r0 = r3.A2M
            java.lang.Object r12 = r0.get()
            X.1gf r12 = (X.C32111gf) r12
            X.10I r16 = X.AnonymousClass10E.AL1(r3)
            X.3rx r10 = new X.3rx
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x003d
        L_0x0251:
            java.lang.Class<X.3rs> r3 = X.C77953rs.class
            if (r1 != r3) goto L_0x02bf
            X.3Ub r3 = r0.A2X
            X.9Ig r4 = r3.A0T()
            X.9Ig r3 = X.C179509Ig.SUBSCRIBED
            if (r4 != r3) goto L_0x02bf
            X.0ve r5 = r0.A3F
            r4 = 7472(0x1d30, float:1.047E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r5, r4)
            if (r3 == 0) goto L_0x02bf
            X.4X5 r3 = X.AnonymousClass3Ma.A0Y(r0)
            X.4JS r4 = r3.A03
            X.5cQ r14 = r0.A2Q
            X.1bI r6 = r0.A4N
            X.440 r7 = r0.A3c
            X.4a2 r3 = r14.getConversationRowInflater()
            X.1FY r0 = r14.CFa()
            X.1pZ r13 = r3.A04(r0)
            X.4oi r5 = new X.4oi
            r5.<init>(r8)
            X.1K2 r0 = r4.A00
            X.10E r3 = r0.A01
            X.0ve r15 = X.AnonymousClass10E.A8r(r3)
            X.1Lf r12 = X.AnonymousClass3Ma.A0S(r3)
            X.10G r8 = r3.A00
            X.00S r0 = r8.A3T
            java.lang.Object r4 = r0.get()
            X.4mD r4 = (X.C95424mD) r4
            X.00S r0 = r3.A7M
            java.lang.Object r3 = r0.get()
            X.74D r3 = (X.AnonymousClass74D) r3
            X.00S r0 = r8.A1x
            java.lang.Object r11 = r0.get()
            X.6l3 r11 = (X.C131416l3) r11
            X.3rs r10 = new X.3rs
            r16 = r4
            r17 = r3
            r18 = r5
            r19 = r7
            r20 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x003d
        L_0x02bf:
            r10 = 0
            goto L_0x0040
        L_0x02c2:
            X.5cQ r12 = r0.A2Q
            X.1np r20 = r12.getLinkifier()
            X.1CJ r6 = r0.A2w
            X.1Co r15 = r0.A2u
            X.1KW r18 = r12.getEmojiLoader()
            X.5cQ r3 = r0.A2Q
            X.18O r11 = r3.getServerProps()
            X.5cQ r3 = r0.A2Q
            X.11C r14 = r3.getSystemServices()
            X.0vc r5 = r0.A3x
            X.00H r3 = r0.A4o
            java.lang.Object r3 = r3.get()
            X.2c9 r3 = (X.C53202c9) r3
            X.4MM r13 = r3.A01
            X.1E7 r4 = r0.A35
            X.1bI r3 = r0.A4N
            boolean r0 = r0.A6n
            X.3rt r10 = new X.3rt
            r16 = r6
            r17 = r4
            r19 = r5
            r21 = r3
            r22 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XJ.A00(java.lang.Class):X.4rI");
    }

    public AnonymousClass4XJ() {
        this.A00 = C17880vN.A13();
    }
}
