package X;

public abstract class CD0 {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17130tn r22, X.C17090tj r23, com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r24, X.C36711oL r25, X.C18090vk r26, X.C22821Di r27, int r28, int r29, boolean r30) {
        /*
            r8 = r23
            r0 = 0
            r5 = r24
            X.C18070vi.A0d(r5, r0)
            r1 = 1
            r2 = r27
            X.C18070vi.A0d(r2, r1)
            r1 = 2
            r3 = r26
            X.C18070vi.A0d(r3, r1)
            r1 = -2028517032(0xffffffff87174958, float:-1.1381531E-34)
            r6 = r22
            r6.COC(r1)
            r4 = r29 & 1
            r1 = r28
            if (r4 == 0) goto L_0x0157
            r7 = r28 | 6
        L_0x0024:
            r4 = r29 & 2
            if (r4 == 0) goto L_0x014c
            r7 = r7 | 48
        L_0x002a:
            r4 = r29 & 4
            if (r4 == 0) goto L_0x0141
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0030:
            r11 = r29 & 8
            if (r11 == 0) goto L_0x0136
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0036:
            r4 = r29 & 16
            r15 = r30
            if (r4 == 0) goto L_0x0127
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x003e:
            r10 = r29 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            r4 = r25
            if (r10 != 0) goto L_0x004e
            r9 = r28 & r9
            if (r9 != 0) goto L_0x004f
            int r9 = X.AnonymousClass001.A0e(r6, r4)
        L_0x004e:
            r7 = r7 | r9
        L_0x004f:
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r7
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r9) goto L_0x007d
            boolean r9 = r6.BZO()
            if (r9 == 0) goto L_0x007d
            r6.CNR()
        L_0x0061:
            X.0Vf r6 = r6.BKF()
            if (r6 == 0) goto L_0x007c
            X.DtE r0 = new X.DtE
            r22 = r0
            r23 = r8
            r24 = r5
            r25 = r4
            r26 = r3
            r27 = r2
            r28 = r1
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            r6.A06 = r0
        L_0x007c:
            return
        L_0x007d:
            if (r11 == 0) goto L_0x0081
            X.0WC r8 = X.C17090tj.A00
        L_0x0081:
            X.1DS r9 = r5.A07
            X.1Fz r23 = X.C87324Vd.A01(r9)
            X.0wS r21 = X.C18460wS.A00
            r17 = 0
            r14 = 32
            r9 = -1485997211(0xffffffffa76d7b65, float:-3.295725E-15)
            r6.COB(r9)
            X.07W r9 = X.AnonymousClass0PK.A03
            java.lang.Object r9 = r6.BFh(r9)
            X.1F9 r9 = (X.AnonymousClass1F9) r9
            X.1Fx r19 = X.C23401Fx.STARTED
            X.1OR r22 = X.AnonymousClass1OR.A00
            X.1Fv r20 = r9.getLifecycle()
            r18 = r6
            X.0uU r12 = X.C25298Cd2.A00(r18, r19, r20, r21, r22, r23)
            r11 = r6
            X.0VR r11 = (X.AnonymousClass0VR) r11
            X.AnonymousClass0VR.A0R(r11, r0)
            androidx.compose.foundation.lazy.LazyListState r13 = X.C03970Li.A00(r6)
            r9 = -109318588(0xfffffffff97bee44, float:-8.1756195E34)
            r6.COB(r9)
            if (r25 == 0) goto L_0x00c6
            int r9 = r7 >> 9
            r9 = r9 & 896(0x380, float:1.256E-42)
            r10 = r9 | 48
            r9 = 12
            X.C25350Ce9.A00(r13, r6, r4, r9, r10)
        L_0x00c6:
            X.AnonymousClass0VR.A0R(r11, r0)
            androidx.compose.foundation.layout.FillElement r9 = X.C05130Qo.A00
            X.0tj r23 = r8.CP5(r9)
            r9 = -109309284(0xfffffffff97c129c, float:-8.1802266E34)
            r6.COB(r9)
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r7
            r9 = 16384(0x4000, float:2.2959E-41)
            boolean r16 = X.AnonymousClass000.A1T(r10, r9)
            r10 = r7 & 896(0x380, float:1.256E-42)
            r9 = 256(0x100, float:3.59E-43)
            boolean r9 = X.AnonymousClass000.A1T(r10, r9)
            r16 = r16 | r9
            boolean r9 = r6.BEf(r12)
            r16 = r16 | r9
            r7 = r7 & 112(0x70, float:1.57E-43)
            boolean r9 = X.AnonymousClass000.A1T(r7, r14)
            r9 = r9 | r16
            java.lang.Object r7 = r6.CER()
            if (r9 != 0) goto L_0x0101
            java.lang.Object r9 = X.AnonymousClass0MH.A00
            if (r7 != r9) goto L_0x0109
        L_0x0101:
            X.Dqz r7 = new X.Dqz
            r7.<init>(r12, r3, r2, r15)
            r6.CRH(r7)
        L_0x0109:
            X.1Di r7 = (X.C22821Di) r7
            X.AnonymousClass0VR.A0R(r11, r0)
            r26 = 252(0xfc, float:3.53E-43)
            r19 = r17
            r22 = r17
            r28 = r0
            r25 = r0
            r18 = r17
            r27 = r0
            r20 = r13
            r21 = r6
            r24 = r7
            X.C02290Dl.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0061
        L_0x0127:
            r4 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x003e
            boolean r4 = r6.BEg(r15)
            int r4 = X.AnonymousClass000.A08(r4)
            r7 = r7 | r4
            goto L_0x003e
        L_0x0136:
            r4 = r1 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0036
            int r4 = X.AnonymousClass001.A0T(r6, r8)
            r7 = r7 | r4
            goto L_0x0036
        L_0x0141:
            r4 = r1 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0030
            int r4 = X.AnonymousClass001.A0c(r6, r3)
            r7 = r7 | r4
            goto L_0x0030
        L_0x014c:
            r4 = r28 & 48
            if (r4 != 0) goto L_0x002a
            int r4 = X.AnonymousClass001.A0b(r6, r2)
            r7 = r7 | r4
            goto L_0x002a
        L_0x0157:
            r4 = r28 & 6
            if (r4 != 0) goto L_0x0167
            boolean r4 = r6.BEh(r5)
            int r7 = X.AnonymousClass000.A09(r4)
            r7 = r7 | r28
            goto L_0x0024
        L_0x0167:
            r7 = r1
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CD0.A00(X.0tn, X.0tj, com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel, X.1oL, X.0vk, X.1Di, int, int, boolean):void");
    }
}
