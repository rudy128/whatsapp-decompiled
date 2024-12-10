package com.whatsapp.messagetranslation;

import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.C18070vi;
import X.C197759xD;
import X.E8F;

public final class TranslationMLProcessor implements E8F {
    public final AnonymousClass118 A00;
    public final AnonymousClass00H A01;
    public final C197759xD A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0084, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0087, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C173708vb r9, X.C183529Yp r10, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.String r7 = r9.A02
            java.lang.String r3 = r9.A03
            X.00H r0 = r8.A01
            java.lang.Object r2 = r0.get()
            X.9jG r2 = (X.C189449jG) r2
            X.206 r5 = r9.A01
            long r0 = r5.A0x
            X.1Cd r2 = r2.A00
            X.1au r4 = r2.A05()
            r2 = 4
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0081 }
            r6.<init>(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "message_row_id"
            X.C17880vN.A19(r6, r2, r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "source_lang"
            r6.put(r0, r7)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "target_lang"
            r6.put(r0, r3)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "status"
            int r0 = r10.A00     // Catch:{ all -> 0x0081 }
            X.C17880vN.A18(r6, r1, r0)     // Catch:{ all -> 0x0081 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0081 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "message_translation_request"
            java.lang.String r1 = "INSERT_OR_UPDATE_MESSAGE_TRANSLATION_REQUEST_METADATA"
            r0 = 5
            r3.A09(r2, r1, r6, r0)     // Catch:{ all -> 0x0081 }
            r4.close()
            java.util.Set r0 = X.AnonymousClass4IG.A00
            r0.remove(r5)
            X.97R r0 = X.AnonymousClass97R.A00
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0060
            X.00H r0 = r8.A05
            X.1KB r4 = X.C108945cZ.A0a(r0)
            r0 = 31
            X.3Br r3 = new X.3Br
            r3.<init>(r8, r0)
        L_0x005c:
            r4.A0J(r3)
            return
        L_0x0060:
            r5.A0k(r11)
            X.00H r0 = r8.A06
            java.lang.Object r1 = r0.get()
            X.1N3 r1 = (X.AnonymousClass1N3) r1
            r0 = 0
            r1.A04(r5, r0)
            X.00H r0 = r8.A05
            X.00H r2 = r8.A07
            X.00H r1 = r8.A03
            X.1KB r4 = X.C108945cZ.A0a(r0)
            r0 = 35
            X.7R0 r3 = new X.7R0
            r3.<init>(r2, r5, r1, r0)
            goto L_0x005c
        L_0x0081:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messagetranslation.TranslationMLProcessor.A00(X.8vb, X.9Yp, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x038e A[Catch:{ Exception -> 0x03a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* renamed from: A01 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object CCX(X.C173708vb r26, X.C30391dr r27) {
        /*
            r25 = this;
            r3 = r27
            r5 = r26
            boolean r0 = r3 instanceof X.C21684AoD
            r4 = r25
            if (r0 == 0) goto L_0x002d
            r6 = r3
            X.AoD r6 = (X.C21684AoD) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r6.label = r2
        L_0x0018:
            java.lang.Object r1 = r6.result
            X.1g4 r24 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 != r7) goto L_0x0033
            java.lang.Object r5 = r6.L$1
            X.8vb r5 = (X.C173708vb) r5
            java.lang.Object r4 = r6.L$0
            com.whatsapp.messagetranslation.TranslationMLProcessor r4 = (com.whatsapp.messagetranslation.TranslationMLProcessor) r4
            goto L_0x038f
        L_0x002d:
            X.AoD r6 = new X.AoD
            r6.<init>(r4, r3)
            goto L_0x0018
        L_0x0033:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0038:
            X.C30691eM.A01(r1)
            X.206 r3 = r5.A01
            X.00H r0 = r4.A04
            X.1W6 r2 = X.C17880vN.A0c(r0)
            long r0 = r3.A0x
            X.1W2 r2 = r2.A01
            X.206 r0 = r2.A03(r0)
            if (r0 != 0) goto L_0x0069
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "TranslationManager/process/message not found. row_id: "
            X.AnonymousClass206.A06(r3, r0, r1)
            X.AnonymousClass8BT.A1M(r1)
            X.00H r0 = r4.A01
            java.lang.Object r2 = r0.get()
            X.9jG r2 = (X.C189449jG) r2
            long r0 = r3.A0x
            r2.A00(r0)
        L_0x0066:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0069:
            X.9xD r8 = r4.A02     // Catch:{ Exception -> 0x03a2 }
            X.6Rq r1 = r5.A00     // Catch:{ Exception -> 0x03a2 }
            r6.L$0 = r4     // Catch:{ Exception -> 0x03a2 }
            r6.L$1 = r5     // Catch:{ Exception -> 0x03a2 }
            r6.label = r7     // Catch:{ Exception -> 0x03a2 }
            X.3Dp r2 = X.C108975cc.A0k(r6)     // Catch:{ Exception -> 0x03a2 }
            r6 = 0
            java.lang.String r0 = "TranslationEngine/translate"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x03a2 }
            X.73b r0 = r8.A00     // Catch:{ Exception -> 0x03a2 }
            java.lang.String r1 = r0.A04(r1)     // Catch:{ Exception -> 0x03a2 }
            if (r1 == 0) goto L_0x039d
            boolean r0 = r3 instanceof X.AnonymousClass210     // Catch:{ Exception -> 0x03a2 }
            r23 = 0
            if (r0 == 0) goto L_0x0090
            java.lang.String r8 = r3.A0P()     // Catch:{ Exception -> 0x03a2 }
            goto L_0x00a5
        L_0x0090:
            boolean r0 = r3 instanceof X.C438921i     // Catch:{ Exception -> 0x03a2 }
            if (r0 == 0) goto L_0x009a
            r0 = r3
            X.21i r0 = (X.C438921i) r0     // Catch:{ Exception -> 0x03a2 }
            java.lang.String r8 = r0.A01     // Catch:{ Exception -> 0x03a2 }
            goto L_0x00a5
        L_0x009a:
            boolean r0 = r3 instanceof X.AnonymousClass21V     // Catch:{ Exception -> 0x03a2 }
            if (r0 == 0) goto L_0x0378
            r0 = r3
            X.21V r0 = (X.AnonymousClass21V) r0     // Catch:{ Exception -> 0x03a2 }
            java.lang.String r8 = r0.A18()     // Catch:{ Exception -> 0x03a2 }
        L_0x00a5:
            if (r8 == 0) goto L_0x0378
            int r0 = r8.length()     // Catch:{ Exception -> 0x03a2 }
            if (r0 == 0) goto L_0x0378
            com.whatsapp.messagetranslation.UnityMessageTranslation r22 = new com.whatsapp.messagetranslation.UnityMessageTranslation     // Catch:{ Exception -> 0x03a2 }
            r0 = r22
            r0.<init>(r1)     // Catch:{ Exception -> 0x03a2 }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0373 }
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = java.lang.System.lineSeparator()     // Catch:{ all -> 0x0373 }
            r1[r6] = r0     // Catch:{ all -> 0x0373 }
            java.util.List r0 = X.AnonymousClass1YF.A0S(r8, r1, r6)     // Catch:{ all -> 0x0373 }
            java.util.ArrayList r21 = X.AnonymousClass000.A14(r0)     // Catch:{ all -> 0x0373 }
            java.util.Iterator r20 = r0.iterator()     // Catch:{ all -> 0x0373 }
        L_0x00cc:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x0341
            java.lang.String r1 = X.C17880vN.A0v(r20)     // Catch:{ all -> 0x0373 }
            X.1wr r0 = X.C197759xD.A01     // Catch:{ all -> 0x0373 }
            java.lang.String r9 = " "
            java.lang.String r1 = r0.A00(r1, r9)     // Catch:{ all -> 0x0373 }
            X.1wr r0 = X.C197759xD.A03     // Catch:{ all -> 0x0373 }
            java.lang.String r11 = r0.A00(r1, r9)     // Catch:{ all -> 0x0373 }
            java.util.LinkedHashSet r19 = X.C17880vN.A14()     // Catch:{ all -> 0x0373 }
            X.1wr[] r13 = X.C197759xD.A05     // Catch:{ all -> 0x0373 }
            r12 = 3
            r10 = 0
        L_0x00ec:
            r0 = r13[r10]     // Catch:{ all -> 0x0373 }
            X.6pE r8 = r0.A02(r11, r6)     // Catch:{ all -> 0x0373 }
        L_0x00f2:
            if (r8 == 0) goto L_0x0111
            java.util.regex.Matcher r1 = r8.A00     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = r1.group()     // Catch:{ all -> 0x0373 }
            int r0 = X.AnonymousClass8BS.A00(r0)     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x0111
            java.lang.String r1 = r1.group()     // Catch:{ all -> 0x0373 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0373 }
            r0 = r19
            r0.add(r1)     // Catch:{ all -> 0x0373 }
            X.6pE r8 = r8.A01()     // Catch:{ all -> 0x0373 }
            goto L_0x00f2
        L_0x0111:
            int r10 = r10 + 1
            if (r10 < r12) goto L_0x00ec
            java.util.Iterator r13 = r19.iterator()     // Catch:{ all -> 0x0373 }
            r12 = 0
        L_0x011a:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x0136
            int r10 = r12 + 1
            java.lang.String r8 = X.C17880vN.A0v(r13)     // Catch:{ all -> 0x0373 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = "tg"
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r12)     // Catch:{ all -> 0x0373 }
            java.lang.String r11 = X.AnonymousClass1YE.A07(r11, r8, r0, r6)     // Catch:{ all -> 0x0373 }
            r12 = r10
            goto L_0x011a
        L_0x0136:
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0373 }
            X.1wr r0 = X.C197759xD.A02     // Catch:{ all -> 0x0373 }
            X.6pE r1 = r0.A02(r11, r6)     // Catch:{ all -> 0x0373 }
        L_0x0140:
            if (r1 == 0) goto L_0x015f
            java.util.regex.Matcher r0 = r1.A00     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = r0.group()     // Catch:{ all -> 0x0373 }
            int r0 = X.AnonymousClass8BS.A00(r0)     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x015f
            java.util.regex.Matcher r0 = r1.A00     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = r0.group()     // Catch:{ all -> 0x0373 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0373 }
            r13.add(r0)     // Catch:{ all -> 0x0373 }
            X.6pE r1 = r1.A01()     // Catch:{ all -> 0x0373 }
            goto L_0x0140
        L_0x015f:
            java.util.Iterator r8 = r13.iterator()     // Catch:{ all -> 0x0373 }
        L_0x0163:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x0174
            java.lang.String r1 = X.C17880vN.A0v(r8)     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = "@IGNORE"
            java.lang.String r11 = X.AnonymousClass1YE.A07(r11, r1, r0, r6)     // Catch:{ all -> 0x0373 }
            goto L_0x0163
        L_0x0174:
            java.util.ArrayList r12 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0373 }
            X.1wr r0 = X.C197759xD.A04     // Catch:{ all -> 0x0373 }
            X.6pE r1 = r0.A02(r11, r6)     // Catch:{ all -> 0x0373 }
        L_0x017e:
            if (r1 == 0) goto L_0x019d
            java.util.regex.Matcher r0 = r1.A00     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = r0.group()     // Catch:{ all -> 0x0373 }
            int r0 = X.AnonymousClass8BS.A00(r0)     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x019d
            java.util.regex.Matcher r0 = r1.A00     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = r0.group()     // Catch:{ all -> 0x0373 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0373 }
            r12.add(r0)     // Catch:{ all -> 0x0373 }
            X.6pE r1 = r1.A01()     // Catch:{ all -> 0x0373 }
            goto L_0x017e
        L_0x019d:
            java.util.Iterator r8 = r12.iterator()     // Catch:{ all -> 0x0373 }
        L_0x01a1:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x01b2
            java.lang.String r1 = X.C17880vN.A0v(r8)     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = "@STOP"
            java.lang.String r11 = X.AnonymousClass1YE.A07(r11, r1, r0, r6)     // Catch:{ all -> 0x0373 }
            goto L_0x01a1
        L_0x01b2:
            java.util.ArrayList r14 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0373 }
            r15 = 0
            r10 = 0
        L_0x01b8:
            r0 = -1
            if (r15 == r0) goto L_0x01f1
            if (r10 == r0) goto L_0x01f1
            java.lang.String r1 = "@STOP"
            int r15 = X.AnonymousClass1YF.A0F(r11, r1, r10, r6)     // Catch:{ all -> 0x0373 }
            if (r15 == r0) goto L_0x01ea
            int r0 = r15 + 5
            java.lang.String r1 = X.C108955ca.A0q(r10, r0, r11)     // Catch:{ all -> 0x0373 }
            r14.add(r1)     // Catch:{ all -> 0x0373 }
            java.lang.String r11 = X.C29361c9.A0D(r11, r0)     // Catch:{ all -> 0x0373 }
            int r8 = r11.length()     // Catch:{ all -> 0x0373 }
            r10 = 0
        L_0x01d7:
            if (r10 >= r8) goto L_0x01e8
            char r1 = r11.charAt(r10)     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = " \t\n"
            int r0 = X.AnonymousClass1YF.A0C(r0, r1, r6, r6)     // Catch:{ all -> 0x0373 }
            if (r0 < 0) goto L_0x01b8
            int r10 = r10 + 1
            goto L_0x01d7
        L_0x01e8:
            r10 = -1
            goto L_0x01b8
        L_0x01ea:
            java.lang.String r0 = X.C108955ca.A0z(r11, r10)     // Catch:{ all -> 0x0373 }
            r14.add(r0)     // Catch:{ all -> 0x0373 }
        L_0x01f1:
            java.util.ArrayList r11 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0373 }
            java.util.Iterator r15 = r14.iterator()     // Catch:{ all -> 0x0373 }
        L_0x01f9:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x0245
            java.lang.String r10 = X.C17880vN.A0v(r15)     // Catch:{ all -> 0x0373 }
            java.lang.String r1 = "@IGNORE"
            java.util.Iterator r14 = r13.iterator()     // Catch:{ all -> 0x0373 }
        L_0x0209:
            int r8 = X.AnonymousClass1YF.A0F(r10, r1, r6, r6)     // Catch:{ all -> 0x0373 }
            r0 = -1
            if (r8 == r0) goto L_0x0222
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x0222
            java.lang.String r0 = X.C17880vN.A0v(r14)     // Catch:{ all -> 0x0373 }
            java.lang.String r10 = X.AnonymousClass1YE.A06(r10, r1, r0)     // Catch:{ all -> 0x0373 }
            r14.remove()     // Catch:{ all -> 0x0373 }
            goto L_0x0209
        L_0x0222:
            java.lang.String r8 = "@STOP"
            java.util.Iterator r14 = r12.iterator()     // Catch:{ all -> 0x0373 }
        L_0x0228:
            int r1 = X.AnonymousClass1YF.A0F(r10, r8, r6, r6)     // Catch:{ all -> 0x0373 }
            r0 = -1
            if (r1 == r0) goto L_0x0241
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x0241
            java.lang.String r0 = X.C17880vN.A0v(r14)     // Catch:{ all -> 0x0373 }
            java.lang.String r10 = X.AnonymousClass1YE.A06(r10, r8, r0)     // Catch:{ all -> 0x0373 }
            r14.remove()     // Catch:{ all -> 0x0373 }
            goto L_0x0228
        L_0x0241:
            r11.add(r10)     // Catch:{ all -> 0x0373 }
            goto L_0x01f9
        L_0x0245:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0373 }
            java.util.Iterator r16 = r11.iterator()     // Catch:{ all -> 0x0373 }
        L_0x024d:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x02c6
            java.lang.String r1 = X.C17880vN.A0v(r16)     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = "\\s+"
            java.util.List r15 = X.C108965cb.A0v(r1, r0, r6)     // Catch:{ all -> 0x0373 }
            r0 = 2
            X.Alc r11 = new X.Alc     // Catch:{ all -> 0x0373 }
            r11.<init>(r0)     // Catch:{ all -> 0x0373 }
            r13 = 10
            boolean r0 = r15 instanceof java.util.RandomAccess     // Catch:{ all -> 0x0373 }
            r8 = 1
            if (r0 == 0) goto L_0x02a4
            int r14 = r15.size()     // Catch:{ all -> 0x0373 }
            int r1 = r14 / r13
            int r0 = r14 % r13
            r12 = 0
            if (r0 != 0) goto L_0x0276
            r8 = 0
        L_0x0276:
            int r1 = r1 + r8
            java.util.ArrayList r8 = X.C17880vN.A0z(r1)     // Catch:{ all -> 0x0373 }
            X.An2 r1 = new X.An2     // Catch:{ all -> 0x0373 }
            r1.<init>(r15)     // Catch:{ all -> 0x0373 }
        L_0x0280:
            if (r12 >= r14) goto L_0x02c2
            int r0 = r14 - r12
            r15 = 10
            if (r13 <= r0) goto L_0x0289
            r15 = r0
        L_0x0289:
            int r15 = r15 + r12
            java.util.List r0 = r1.A02     // Catch:{ all -> 0x0373 }
            int r0 = r0.size()     // Catch:{ all -> 0x0373 }
            X.C29761cp.A04(r12, r15, r0)     // Catch:{ all -> 0x0373 }
            r1.A01 = r12     // Catch:{ all -> 0x0373 }
            int r15 = r15 - r12
            r1.A00 = r15     // Catch:{ all -> 0x0373 }
            java.lang.Object r0 = r11.invoke(r1)     // Catch:{ all -> 0x0373 }
            r8.add(r0)     // Catch:{ all -> 0x0373 }
            int r12 = r12 + 10
            if (r12 < 0) goto L_0x02c2
            goto L_0x0280
        L_0x02a4:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0373 }
            java.util.Iterator r0 = r15.iterator()     // Catch:{ all -> 0x0373 }
            java.util.Iterator r1 = X.C181839Sa.A00(r0, r13, r13, r7)     // Catch:{ all -> 0x0373 }
        L_0x02b0:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x02c2
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0373 }
            java.lang.Object r0 = r11.invoke(r0)     // Catch:{ all -> 0x0373 }
            r8.add(r0)     // Catch:{ all -> 0x0373 }
            goto L_0x02b0
        L_0x02c2:
            r10.addAll(r8)     // Catch:{ all -> 0x0373 }
            goto L_0x024d
        L_0x02c6:
            r0 = r19
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r10)     // Catch:{ all -> 0x0373 }
            java.lang.Object r8 = r0.first     // Catch:{ all -> 0x0373 }
            java.util.Set r8 = (java.util.Set) r8     // Catch:{ all -> 0x0373 }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x0373 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0373 }
            r0 = r22
            com.whatsapp.unity.UnityTranslationResult r1 = r0.translate(r1)     // Catch:{ all -> 0x0373 }
            if (r1 == 0) goto L_0x0332
            int r0 = r1.errorCode     // Catch:{ all -> 0x0373 }
            if (r0 != 0) goto L_0x0332
            java.lang.String[] r0 = r1.translation     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x0323
            java.lang.String r11 = ""
            java.lang.String r10 = X.C200410p.A0I(r9, r11, r11, r0)     // Catch:{ all -> 0x0373 }
            boolean r0 = X.C108945cZ.A1U(r8)     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x0311
            java.util.Iterator r13 = r8.iterator()     // Catch:{ all -> 0x0373 }
            r12 = 0
        L_0x02f5:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x0311
            int r9 = r12 + 1
            java.lang.String r8 = X.C17880vN.A0v(r13)     // Catch:{ all -> 0x0373 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = "tg"
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r12)     // Catch:{ all -> 0x0373 }
            java.lang.String r10 = X.AnonymousClass1YE.A07(r10, r0, r8, r6)     // Catch:{ all -> 0x0373 }
            r12 = r9
            goto L_0x02f5
        L_0x0311:
            java.lang.String r1 = "@TAG|<unk>"
            X.1wr r0 = new X.1wr     // Catch:{ all -> 0x0373 }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0373 }
            java.lang.String r1 = r0.A00(r10, r11)     // Catch:{ all -> 0x0373 }
            r0 = r21
            r0.add(r1)     // Catch:{ all -> 0x0373 }
            goto L_0x00cc
        L_0x0323:
            X.97O r1 = X.AnonymousClass97O.A00     // Catch:{ all -> 0x0373 }
            X.9L0 r0 = new X.9L0     // Catch:{ all -> 0x0373 }
            r0.<init>(r1)     // Catch:{ all -> 0x0373 }
            X.1IU r0 = X.C30691eM.A00(r0)     // Catch:{ all -> 0x0373 }
            r2.resumeWith(r0)     // Catch:{ all -> 0x0373 }
            goto L_0x036f
        L_0x0332:
            X.97P r1 = X.AnonymousClass97P.A00     // Catch:{ all -> 0x0373 }
            X.9L0 r0 = new X.9L0     // Catch:{ all -> 0x0373 }
            r0.<init>(r1)     // Catch:{ all -> 0x0373 }
            X.1IU r0 = X.C30691eM.A00(r0)     // Catch:{ all -> 0x0373 }
            r2.resumeWith(r0)     // Catch:{ all -> 0x0373 }
            goto L_0x036f
        L_0x0341:
            java.lang.String r6 = java.lang.System.lineSeparator()     // Catch:{ all -> 0x0373 }
            X.C18070vi.A0X(r6)     // Catch:{ all -> 0x0373 }
            r1 = r21
            r0 = r23
            java.lang.String r9 = X.C29431cG.A0h(r6, r1, r0)     // Catch:{ all -> 0x0373 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0373 }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0373 }
            java.lang.String r6 = "TranslationEngine/time to translate: "
            r8.append(r6)     // Catch:{ all -> 0x0373 }
            long r0 = r0 - r17
            r8.append(r0)     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = "ms"
            X.C17890vO.A1A(r8, r0)     // Catch:{ all -> 0x0373 }
            X.9qo r0 = new X.9qo     // Catch:{ all -> 0x0373 }
            r0.<init>(r3, r9)     // Catch:{ all -> 0x0373 }
            r2.resumeWith(r0)     // Catch:{ all -> 0x0373 }
        L_0x036f:
            r22.release()     // Catch:{ Exception -> 0x03a2 }
            goto L_0x0386
        L_0x0373:
            r0 = move-exception
            r22.release()     // Catch:{ Exception -> 0x03a2 }
            goto L_0x03a1
        L_0x0378:
            X.97P r1 = X.AnonymousClass97P.A00     // Catch:{ Exception -> 0x03a2 }
            X.9L0 r0 = new X.9L0     // Catch:{ Exception -> 0x03a2 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x03a2 }
            X.1IU r0 = X.C30691eM.A00(r0)     // Catch:{ Exception -> 0x03a2 }
            r2.resumeWith(r0)     // Catch:{ Exception -> 0x03a2 }
        L_0x0386:
            java.lang.Object r1 = r2.A00()     // Catch:{ Exception -> 0x03a2 }
            r0 = r24
            if (r1 != r0) goto L_0x0392
            goto L_0x03c4
        L_0x038f:
            X.C30691eM.A01(r1)     // Catch:{ Exception -> 0x03a2 }
        L_0x0392:
            X.9qo r1 = (X.C193879qo) r1     // Catch:{ Exception -> 0x03a2 }
            java.lang.String r1 = r1.A00     // Catch:{ Exception -> 0x03a2 }
            X.97R r0 = X.AnonymousClass97R.A00     // Catch:{ Exception -> 0x03a2 }
            r4.A00(r5, r0, r1)     // Catch:{ Exception -> 0x03a2 }
            goto L_0x0066
        L_0x039d:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()     // Catch:{ Exception -> 0x03a2 }
        L_0x03a1:
            throw r0     // Catch:{ Exception -> 0x03a2 }
        L_0x03a2:
            r6 = move-exception
            boolean r0 = r6 instanceof X.AnonymousClass9L0
            r3 = 0
            if (r0 == 0) goto L_0x03b1
            r0 = r6
            X.9L0 r0 = (X.AnonymousClass9L0) r0
            if (r0 == 0) goto L_0x03b1
            X.97Q r2 = r0.reason
            if (r2 != 0) goto L_0x03b6
        L_0x03b1:
            X.97N r2 = new X.97N
            r2.<init>(r7)
        L_0x03b6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "TranslationManager/process/translation failed, status = "
            X.C108995ce.A1J(r2, r0, r1, r6)
            r4.A00(r5, r2, r3)
            goto L_0x0066
        L_0x03c4:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messagetranslation.TranslationMLProcessor.CCX(X.8vb, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void C4P(X.C24489C6h r9) {
        /*
            r8 = this;
            X.8vb r9 = (X.C173708vb) r9
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            java.lang.String r7 = r9.A02
            java.lang.String r6 = r9.A03
            X.00H r0 = r8.A01
            java.lang.Object r3 = r0.get()
            X.9jG r3 = (X.C189449jG) r3
            X.206 r0 = r9.A01
            long r1 = r0.A0x
            X.1Cd r0 = r3.A00
            X.1au r5 = r0.A05()
            r0 = 4
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0048 }
            r4.<init>(r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "message_row_id"
            X.C17880vN.A19(r4, r0, r1)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "source_lang"
            r4.put(r0, r7)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "target_lang"
            r4.put(r0, r6)     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "status"
            r0 = -1
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x0048 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0048 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = "message_translation_request"
            java.lang.String r1 = "INSERT_OR_UPDATE_MESSAGE_TRANSLATION_REQUEST_METADATA"
            r0 = 5
            r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x0048 }
            r5.close()
            return
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messagetranslation.TranslationMLProcessor.C4P(X.C6h):void");
    }

    public TranslationMLProcessor(AnonymousClass118 r1, C197759xD r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r1, r3, r4, r5, r6);
        C18070vi.A0q(r2, r7, r8);
        this.A00 = r1;
        this.A05 = r3;
        this.A07 = r4;
        this.A04 = r5;
        this.A06 = r6;
        this.A02 = r2;
        this.A03 = r7;
        this.A01 = r8;
    }
}
