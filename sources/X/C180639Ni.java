package X;

/* renamed from: X.9Ni  reason: invalid class name and case insensitive filesystem */
public abstract class C180639Ni {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C22526BBj r28, java.util.Map r29) {
        /*
            r27 = this;
            r6 = r27
            boolean r2 = r6 instanceof X.AnonymousClass9C2
            r1 = r28
            r0 = r29
            if (r2 == 0) goto L_0x0123
            X.9C2 r6 = (X.AnonymousClass9C2) r6
            X.00H r2 = r6.A02     // Catch:{ Exception -> 0x011e }
            r2.get()     // Catch:{ Exception -> 0x011e }
            javax.crypto.SecretKey r15 = X.AnonymousClass8BX.A0q()     // Catch:{ Exception -> 0x011e }
            r2 = 16
            byte[] r23 = X.AnonymousClass8BV.A1a(r2)     // Catch:{ Exception -> 0x011e }
            X.C18070vi.A0b(r15)     // Catch:{ Exception -> 0x011e }
            r9 = 1
            X.C18070vi.A0d(r15, r9)     // Catch:{ Exception -> 0x011e }
            r13 = 2
            java.lang.String r2 = "action_payload"
            java.lang.Object r3 = r0.get(r2)     // Catch:{ Exception -> 0x011e }
            boolean r2 = r3 instanceof java.util.Map     // Catch:{ Exception -> 0x011e }
            if (r2 == 0) goto L_0x00fd
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ Exception -> 0x011e }
            if (r3 == 0) goto L_0x00fd
            java.lang.String r2 = "business_payload"
            java.lang.Object r10 = r3.get(r2)     // Catch:{ Exception -> 0x011e }
        L_0x0037:
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.C18070vi.A0z(r10, r2)     // Catch:{ Exception -> 0x011e }
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ Exception -> 0x011e }
            java.lang.String r8 = "data"
            java.lang.Object r3 = r10.get(r8)     // Catch:{ Exception -> 0x011e }
            boolean r2 = r3 instanceof java.util.Map     // Catch:{ Exception -> 0x011e }
            if (r2 == 0) goto L_0x004c
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ Exception -> 0x011e }
            if (r3 != 0) goto L_0x0050
        L_0x004c:
            X.1CQ r3 = X.AnonymousClass1D7.A0I()     // Catch:{ Exception -> 0x011e }
        L_0x0050:
            java.lang.String r11 = "error"
            java.lang.Object r12 = r3.get(r11)     // Catch:{ Exception -> 0x011e }
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r12, r4)     // Catch:{ Exception -> 0x011e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x011e }
            java.lang.String r7 = "error_message"
            java.lang.Object r5 = X.AnonymousClass8BS.A0X(r7, r4, r3)     // Catch:{ Exception -> 0x011e }
            X.1D6[] r3 = new X.AnonymousClass1D6[r13]     // Catch:{ Exception -> 0x011e }
            r2 = 0
            X.AnonymousClass1D6.A03(r11, r12, r3, r2)     // Catch:{ Exception -> 0x011e }
            X.AnonymousClass1D6.A03(r7, r5, r3, r9)     // Catch:{ Exception -> 0x011e }
            java.util.LinkedHashMap r3 = X.AnonymousClass1D7.A0B(r3)     // Catch:{ Exception -> 0x011e }
            java.util.LinkedHashMap r2 = X.C17880vN.A13()     // Catch:{ Exception -> 0x011e }
            r2.putAll(r10)     // Catch:{ Exception -> 0x011e }
            r2.put(r8, r3)     // Catch:{ Exception -> 0x011e }
            java.lang.String r3 = "flow_message_version"
            java.lang.String r13 = X.AnonymousClass8BU.A0p(r3, r0)     // Catch:{ Exception -> 0x011e }
            java.lang.String r3 = "extension_id"
            java.lang.String r8 = X.AnonymousClass8BU.A0p(r3, r0)     // Catch:{ Exception -> 0x011e }
            java.lang.String r3 = "business_jid"
            java.lang.String r16 = X.AnonymousClass8BU.A0p(r3, r0)     // Catch:{ Exception -> 0x011e }
            java.lang.String r10 = "user_locale"
            java.lang.Object r7 = X.AnonymousClass8BS.A0X(r10, r4, r0)     // Catch:{ Exception -> 0x011e }
            java.lang.String r5 = "flow_token"
            java.lang.Object r4 = X.AnonymousClass8BS.A0X(r5, r4, r0)     // Catch:{ Exception -> 0x011e }
            java.lang.String r3 = "version"
            java.lang.Object r11 = r0.get(r3)     // Catch:{ Exception -> 0x011e }
            boolean r0 = r11 instanceof java.lang.String     // Catch:{ Exception -> 0x011e }
            if (r0 == 0) goto L_0x00fb
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x011e }
        L_0x00a4:
            X.9iq r14 = r6.A00     // Catch:{ Exception -> 0x011e }
            X.ATx r0 = new X.ATx     // Catch:{ Exception -> 0x011e }
            r0.<init>(r6, r12)     // Catch:{ Exception -> 0x011e }
            X.B1B r12 = new X.B1B     // Catch:{ Exception -> 0x011e }
            r12.<init>(r1, r6)     // Catch:{ Exception -> 0x011e }
            X.AS4 r17 = r14.A00(r0, r13, r8, r12)     // Catch:{ Exception -> 0x011e }
            com.whatsapp.jid.UserJid r18 = X.AnonymousClass8BR.A0X(r16)     // Catch:{ Exception -> 0x011e }
            java.util.LinkedHashMap r12 = X.C17880vN.A13()     // Catch:{ Exception -> 0x011e }
            r12.putAll(r2)     // Catch:{ Exception -> 0x011e }
            X.0ve r2 = r6.A01     // Catch:{ Exception -> 0x011e }
            r1 = 5374(0x14fe, float:7.53E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x011e }
            boolean r1 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ Exception -> 0x011e }
            java.lang.String r0 = "100"
            if (r1 == 0) goto L_0x00d3
            boolean r1 = r0.equalsIgnoreCase(r11)     // Catch:{ Exception -> 0x011e }
            if (r1 == 0) goto L_0x00d6
        L_0x00d3:
            r12.put(r10, r7)     // Catch:{ Exception -> 0x011e }
        L_0x00d6:
            r12.put(r5, r4)     // Catch:{ Exception -> 0x011e }
            java.lang.String r1 = X.C181319Qa.A00(r11)     // Catch:{ Exception -> 0x011e }
            r12.put(r3, r1)     // Catch:{ Exception -> 0x011e }
            boolean r0 = r0.equalsIgnoreCase(r11)     // Catch:{ Exception -> 0x011e }
            if (r0 != 0) goto L_0x0100
            r0 = 16
            r3 = 16
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x011e }
            r1 = 0
        L_0x00ed:
            byte r0 = r23[r1]     // Catch:{ Exception -> 0x011e }
            r0 = r0 ^ -1
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x011e }
            r2[r1] = r0     // Catch:{ Exception -> 0x011e }
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x00ed
            r23 = r2
            goto L_0x0100
        L_0x00fb:
            r11 = 0
            goto L_0x00a4
        L_0x00fd:
            r10 = 0
            goto L_0x0037
        L_0x0100:
            X.00H r0 = r6.A04     // Catch:{ Exception -> 0x011e }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x011e }
            X.9ng r0 = (X.C192049ng) r0     // Catch:{ Exception -> 0x011e }
            java.lang.String r19 = X.AnonymousClass8BW.A0m(r12)     // Catch:{ Exception -> 0x011e }
            r24 = 0
            r21 = r8
            r22 = r15
            r25 = r9
            r26 = r24
            r20 = r13
            r16 = r0
            r16.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x011e }
            return
        L_0x011e:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        L_0x0123:
            boolean r2 = r6 instanceof X.AnonymousClass9C0
            if (r2 == 0) goto L_0x012b
            r1.BAi(r0)
            return
        L_0x012b:
            X.9C1 r6 = (X.AnonymousClass9C1) r6
            java.lang.String r2 = "extension_id"
            java.lang.Object r10 = r0.get(r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r10, r2)
            java.lang.String r10 = (java.lang.String) r10
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r2 = "business_jid"
            java.lang.String r2 = X.AnonymousClass8BU.A0p(r2, r0)
            com.whatsapp.jid.UserJid r9 = X.C22941Dw.A03(r2)
            java.lang.String r2 = "message_id"
            java.lang.Object r11 = r0.get(r2)
            boolean r2 = r11 instanceof java.lang.String
            r5 = 0
            if (r2 == 0) goto L_0x019e
            java.lang.String r11 = (java.lang.String) r11
        L_0x0153:
            java.lang.String r2 = "session_id"
            java.lang.String r12 = X.AnonymousClass8BW.A0f(r2, r0)
            java.lang.String r2 = "current_screen"
            java.lang.Object r3 = r0.get(r2)
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L_0x0166
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
        L_0x0166:
            X.00H r8 = r6.A03
            X.A6h r4 = X.AnonymousClass8BR.A0V(r8)
            int r7 = r10.hashCode()
            r3 = r5
            if (r5 != 0) goto L_0x0175
            java.lang.String r3 = "UNKNOWN"
        L_0x0175:
            java.lang.String r2 = "source_screen_id"
            r4.A06(r7, r2, r3)
            X.A6h r4 = X.AnonymousClass8BR.A0V(r8)
            java.lang.String r3 = "SUCCESS"
            java.lang.String r2 = "destination_screen_id"
            r4.A06(r7, r2, r3)
            X.A6h r4 = X.AnonymousClass8BR.A0V(r8)
            r3 = 0
            java.lang.String r2 = "data_channel_navigation"
            r4.A07(r7, r2, r3)
            X.00H r2 = r6.A02
            X.A5U r8 = X.AnonymousClass8BR.A0S(r2)
            X.B3e r13 = new X.B3e
            r13.<init>(r1, r6, r5, r0)
            r8.A06(r9, r10, r11, r12, r13)
            return
        L_0x019e:
            r11 = r5
            goto L_0x0153
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180639Ni.A00(X.BBj, java.util.Map):void");
    }
}
