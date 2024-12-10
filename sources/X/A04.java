package X;

import java.util.Iterator;
import java.util.List;

public final class A04 {
    public final AnonymousClass11C A00;
    public final C19830z4 A01;
    public final AnonymousClass19D A02;
    public final AnonymousClass1CM A03;
    public final C192319oA A04;

    public static final Integer A00(List list, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            switch (A0v.hashCode()) {
                case -795576526:
                    if (AnonymousClass8BR.A1W(A0v) && z) {
                        i = 2;
                        break;
                    }
                case 114009:
                    if (AnonymousClass8BR.A1U(A0v)) {
                        i = 5;
                        break;
                    } else {
                        continue;
                    }
                case 97513456:
                    if (AnonymousClass8BR.A1V(A0v) && z4) {
                        i = 4;
                        break;
                    }
                case 112386354:
                    if (A0v.equals("voice")) {
                        i = 7;
                        break;
                    } else {
                        continue;
                    }
                case 1247787042:
                    if (A0v.equals("send_sms") && z3) {
                        i = 11;
                        break;
                    }
                case 2120743944:
                    if (AnonymousClass8BR.A1X(A0v) && z2) {
                        i = 3;
                        break;
                    }
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        if (r6.A03() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r6.A00(false) != 22) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
        if (r13 == 1) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c4, code lost:
        if (r13 == 1) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        r0 = 9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A01(int r12, int r13, int r14) {
        /*
            r11 = this;
            X.0z4 r1 = r11.A01
            java.util.ArrayList r10 = r1.A0u()
            r6 = 1
            if (r12 == r6) goto L_0x000d
            r0 = 3
            if (r12 == r0) goto L_0x000d
            r6 = 0
        L_0x000d:
            X.00H r9 = r1.A00
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r9)
            java.lang.String r8 = "pref_email_otp_eligibility"
            r7 = 0
            int r1 = r0.getInt(r8, r7)
            java.lang.Boolean r0 = X.C17970vW.A01
            boolean r2 = X.C17890vO.A1R(r1)
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r9)
            java.lang.String r0 = "pref_send_sms_eligibility"
            int r0 = r1.getInt(r0, r7)
            boolean r1 = X.C17890vO.A1R(r0)
            X.11C r5 = r11.A00
            X.19D r4 = r11.A02
            X.9oA r3 = r11.A04
            boolean r0 = X.C181699Rm.A00(r5, r4, r3, r14)
            java.lang.Integer r10 = A00(r10, r6, r2, r1, r0)
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x006e
            if (r10 == 0) goto L_0x006e
            X.1CM r6 = r11.A03
            boolean r0 = r6.A02()
            r2 = 1
            if (r0 != 0) goto L_0x0054
            boolean r0 = r6.A03()
            r1 = 0
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            r1 = 1
        L_0x0055:
            boolean r0 = r6.A05()
            if (r1 != 0) goto L_0x00ba
            if (r0 != 0) goto L_0x006d
            int r1 = r6.A00(r7)
            r0 = 31
            if (r1 == r0) goto L_0x006d
            int r1 = r6.A00(r7)
            r0 = 22
            if (r1 != r0) goto L_0x006e
        L_0x006d:
            return r10
        L_0x006e:
            X.1CM r6 = r11.A03
            boolean r0 = r6.A02()
            java.lang.Integer r10 = X.C17880vN.A0k()
            java.lang.Integer r2 = X.C108955ca.A0e()
            if (r0 != 0) goto L_0x009c
            boolean r0 = r6.A03()
            if (r0 != 0) goto L_0x009c
            int r1 = r6.A00(r7)
            r0 = 31
            if (r1 == r0) goto L_0x009c
            boolean r0 = r6.A05()
            if (r0 != 0) goto L_0x00b1
            int r1 = r6.A00(r7)
            r0 = 8
            if (r1 == r0) goto L_0x009b
            r2 = 0
        L_0x009b:
            return r2
        L_0x009c:
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r9)
            int r0 = r0.getInt(r8, r7)
            r1 = 1
            if (r0 != r1) goto L_0x00a9
            r0 = 3
            goto L_0x00c8
        L_0x00a9:
            if (r12 == r1) goto L_0x00b8
            r0 = 3
            if (r12 == r0) goto L_0x00b8
            if (r13 != r1) goto L_0x00b1
            goto L_0x00c6
        L_0x00b1:
            boolean r0 = X.C181699Rm.A00(r5, r4, r3, r14)
            if (r0 == 0) goto L_0x009b
            return r10
        L_0x00b8:
            r0 = 2
            goto L_0x00c8
        L_0x00ba:
            int r1 = r10.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x006d
            r0 = 2
            if (r1 == r0) goto L_0x006d
            if (r13 != r2) goto L_0x006d
        L_0x00c6:
            r0 = 9
        L_0x00c8:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A04.A01(int, int, int):java.lang.Integer");
    }

    public A04(AnonymousClass11C r1, C19830z4 r2, AnonymousClass19D r3, AnonymousClass1CM r4, C192319oA r5) {
        C18070vi.A0s(r4, r2, r1, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
    }
}
