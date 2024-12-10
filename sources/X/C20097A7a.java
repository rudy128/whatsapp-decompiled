package X;

import android.text.TextUtils;

/* renamed from: X.A7a  reason: case insensitive filesystem */
public abstract class C20097A7a {
    public static String A02(AnonymousClass206 r1) {
        C194599rz A0i;
        if (!r1.A0z(8) || (A0i = AnonymousClass8BR.A0i(r1)) == null) {
            return null;
        }
        String str = A0i.A00;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return null;
    }

    public static void A04(C163728Wc r6, C194599rz r7) {
        C179729Jr r0;
        if (r7 != null) {
            String str = r7.A00;
            if (str != null) {
                C165858bs r1 = (C165858bs) C17880vN.A0G(r6);
                int i = C165858bs.BUTTONS_FIELD_NUMBER;
                r1.bitField0_ |= 32;
                r1.contentText_ = str;
            }
            String str2 = r7.A01;
            if (str2 != null) {
                C165858bs r12 = (C165858bs) C17880vN.A0G(r6);
                int i2 = C165858bs.BUTTONS_FIELD_NUMBER;
                r12.bitField0_ |= 64;
                r12.footerText_ = str2;
            }
            for (C195309t8 r2 : r7.A02) {
                C23624Bmt A0N = C165228an.DEFAULT_INSTANCE.A0N();
                String str3 = r2.A04;
                C165228an r13 = (C165228an) C17880vN.A0G(A0N);
                r13.bitField0_ |= 1;
                r13.buttonId_ = str3;
                int i3 = r2.A01;
                if (i3 == 2) {
                    r0 = C179729Jr.NATIVE_FLOW;
                } else if (i3 == 1) {
                    r0 = C179729Jr.RESPONSE;
                } else {
                    r0 = C179729Jr.UNKNOWN;
                }
                C165228an r14 = (C165228an) C17880vN.A0G(A0N);
                r14.type_ = r0.value;
                r14.bitField0_ |= 4;
                C23624Bmt A0N2 = AnonymousClass8XY.DEFAULT_INSTANCE.A0N();
                String str4 = r2.A03;
                AnonymousClass8XY r15 = (AnonymousClass8XY) C17880vN.A0G(A0N2);
                str4.getClass();
                r15.bitField0_ |= 1;
                r15.displayText_ = str4;
                AnonymousClass8XY r02 = (AnonymousClass8XY) A0N2.A0C();
                C165228an r16 = (C165228an) C17880vN.A0G(A0N);
                r02.getClass();
                r16.buttonText_ = r02;
                r16.bitField0_ |= 2;
                C23577Bm6 A09 = AnonymousClass8BS.A09(A0N, r6);
                C165858bs r22 = (C165858bs) r6.A00;
                int i4 = C165858bs.BUTTONS_FIELD_NUMBER;
                A09.getClass();
                EE9 ee9 = r22.buttons_;
                if (!((C27296DbR) ee9).A00) {
                    ee9 = C23577Bm6.A09(ee9);
                    r22.buttons_ = ee9;
                }
                ee9.add(A09);
            }
        }
    }

    public static boolean A05(AnonymousClass206 r1) {
        if (!r1.A0z(8) || AnonymousClass8BR.A0i(r1) == null) {
            return false;
        }
        return true;
    }

    public static C165858bs A00(C23624Bmt bmt, C163728Wc r2, AnonymousClass206 r3) {
        A04(r2, r3.A0L().A00);
        r2.A0E();
        C165858bs r22 = (C165858bs) r2.A00;
        C23577Bm6 A0C = bmt.A0C();
        int i = C165858bs.BUTTONS_FIELD_NUMBER;
        A0C.getClass();
        r22.header_ = A0C;
        return r22;
    }

    public static String A01(AnonymousClass206 r3) {
        String A02 = A02(r3);
        if (TextUtils.isEmpty(A02)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(A02);
        String str = AnonymousClass8BR.A0i(r3).A01;
        if (!TextUtils.isEmpty(str)) {
            sb.append("\n");
            sb.append(str);
        }
        return sb.toString();
    }

    public static String A03(C194599rz r4, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        if (r4 != null) {
            if (!TextUtils.isEmpty(str)) {
                A10.append(str);
            }
            String str2 = r4.A00;
            if (!TextUtils.isEmpty(str2)) {
                if (A10.length() > 0) {
                    A10.append("\n");
                }
                A10.append(str2);
            }
            String str3 = r4.A01;
            if (!TextUtils.isEmpty(str3)) {
                if (A10.length() > 0) {
                    A10.append("\n");
                }
                A10.append(str3);
            }
        }
        return A10.toString();
    }
}
