package X;

import com.whatsapp.util.Log;

/* renamed from: X.6Oq  reason: invalid class name and case insensitive filesystem */
public class C122276Oq extends AnonymousClass2SG {
    public final int A00;
    public final Object A01;

    public void A03(String str, int i, int i2, int i3, int i4, long j) {
        String str2 = str;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        long j2 = j;
        if (this.A00 != 0) {
            super.A03(str2, i5, i6, i7, i8, j2);
            return;
        }
        C19951A0i a0i = (C19951A0i) this.A01;
        int i9 = 1;
        if (i5 == 1) {
            i9 = 2;
        } else if (i5 != 2) {
            i9 = -1;
            if (i5 == 3) {
                if (i6 == 6) {
                    i9 = 13;
                } else if (i6 == 23) {
                    i9 = 10;
                } else if (i6 == 32) {
                    i9 = 14;
                } else if (i6 == 8) {
                    i9 = 12;
                } else if (i6 == 9) {
                    i9 = 11;
                }
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("WamsysRegistrationWrapper/send-device-confirmation-status-unspecified; response-status ");
            A10.append(i5);
            C17900vP.A0i(" failure-reason ", A10, i6);
        }
        boolean A1T = AnonymousClass000.A1T(i7, 1);
        boolean A1T2 = AnonymousClass000.A1T(i8, 1);
        a0i.A02(new C136256tW(str, String.valueOf(j2), i9, i6, A1T, A1T2));
    }

    public C122276Oq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r6 != 32) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.lang.String r19, int r20, int r21, int r22, long r23, boolean r25) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A00
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r10 = r25
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0018
            super.A04(r4, r5, r6, r7, r8, r10)
            return
        L_0x0018:
            java.lang.Object r3 = r3.A01
            X.A0i r3 = (X.C19951A0i) r3
            r2 = 1
            if (r5 == r2) goto L_0x0061
            r0 = 3
            if (r5 != r0) goto L_0x0031
            if (r6 == r2) goto L_0x005e
            r0 = 6
            if (r6 == r0) goto L_0x005b
            r0 = 23
            if (r6 == r0) goto L_0x0058
            r0 = 32
            r14 = 13
            if (r6 == r0) goto L_0x0043
        L_0x0031:
            r14 = -1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WamsysRegistrationWrapper/fetch-device-confirmation-status-unspecified; response-status "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " failure-reason "
            X.C17900vP.A0i(r0, r1, r6)
        L_0x0043:
            boolean r16 = X.AnonymousClass000.A1T(r7, r2)
            java.lang.String r13 = java.lang.String.valueOf(r8)
            X.6tX r11 = new X.6tX
            r12 = r4
            r15 = r6
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r3.A02(r11)
            return
        L_0x0058:
            r14 = 11
            goto L_0x0043
        L_0x005b:
            r14 = 12
            goto L_0x0043
        L_0x005e:
            r14 = 10
            goto L_0x0043
        L_0x0061:
            r14 = 1
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122276Oq.A04(java.lang.String, int, int, int, long, boolean):void");
    }

    public void A07(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z) {
        boolean z2 = z;
        int i7 = i6;
        int i8 = i5;
        int i9 = i4;
        int i10 = i3;
        int i11 = i2;
        switch (this.A00) {
            case 2:
                Log.i("WamsysRegistrationWrapper/makeConsentRequest/consentResponseHandler");
                if (str == null) {
                    Log.e("WamsysRegistrationWrapper/makeConsentRequest/consentResponseHandler jid is null!");
                }
                C19951A0i a0i = (C19951A0i) this.A01;
                C130846k6 r9 = new C130846k6(C20100A7d.A01(i, i11));
                String str5 = "https://whatsapp.com/parent_consent/";
                if (str2 != null) {
                    str5 = C17900vP.A0A(str5, str2);
                }
                r9.A05 = str5;
                r9.A04 = str;
                if (str3 == null) {
                    str3 = "parent_verification";
                }
                r9.A06 = str3;
                r9.A00 = i8;
                r9.A01 = i7;
                boolean z3 = false;
                r9.A09 = AnonymousClass000.A1T(i10, 1);
                if (i9 == 1) {
                    z3 = true;
                }
                r9.A08 = z3;
                r9.A07 = z2;
                r9.A03 = str4;
                a0i.A02(r9);
                return;
            case 3:
                if (str == null) {
                    Log.e("WamsysRegistrationWrapper/sendConsentResult/consentResponseHandler jid is null!");
                }
                C19951A0i a0i2 = (C19951A0i) this.A01;
                C130846k6 r3 = new C130846k6(C20100A7d.A01(i, i11));
                r3.A04 = str;
                boolean z4 = false;
                r3.A09 = AnonymousClass000.A1T(i10, 1);
                if (i9 == 1) {
                    z4 = true;
                }
                r3.A08 = z4;
                r3.A07 = z2;
                r3.A00 = i8;
                r3.A01 = i7;
                r3.A03 = str4;
                a0i2.A02(r3);
                return;
            default:
                super.A07(str, str2, str3, str4, i, i2, i3, i4, i5, i6, j, z);
                return;
        }
    }
}
