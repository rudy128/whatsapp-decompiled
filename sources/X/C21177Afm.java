package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Afm  reason: case insensitive filesystem */
public final class C21177Afm implements C22470B9c {
    public static final C21177Afm A00 = new C21177Afm();

    public final Object BCF(C29621ca r30, C62672rm r31) {
        C29621ca r0 = r30;
        C62672rm r2 = r31;
        int A17 = C18070vi.A17(r0, r2);
        if (r2.A09(r0, "pay")) {
            String[] strArr = new String[A17];
            C29621ca A0Z = AnonymousClass8BT.A0Z(r0, "merchant", strArr);
            if (A0Z == null) {
                AnonymousClass8BY.A11(r0, r2, strArr, 0);
            } else if (r2.A09(A0Z, "merchant")) {
                List A0O = C18070vi.A0O("SOFT_BLOCKED", AnonymousClass8BY.A1Z(A17), 8);
                String[] strArr2 = new String[A17];
                strArr2[0] = "display-state";
                if (r2.A07(A0Z, A0O, strArr2) != null) {
                    String[] strArr3 = new String[A17];
                    strArr3[0] = "gateway-name";
                    Class<String> cls = String.class;
                    Long A0X = C108975cc.A0X();
                    Long A0g = AnonymousClass8BV.A0g();
                    r2.A05(A0Z, cls, A0X, A0g, (Object) null, strArr3, false);
                    String[] strArr4 = new String[A17];
                    strArr4[0] = "dashboard-url";
                    C62672rm r21 = r2;
                    C29621ca r22 = A0Z;
                    Class<String> cls2 = cls;
                    Long l = A0X;
                    r21.A05(r22, cls2, l, 3000L, (Object) null, strArr4, false);
                    String[] strArr5 = new String[A17];
                    strArr5[0] = "logo-uri";
                    r21.A05(r22, cls2, l, 3000L, (Object) null, strArr5, false);
                    String[] strArr6 = new String[A17];
                    strArr6[0] = "max_installment_count";
                    Long l2 = (Long) r21.A05(r22, Long.TYPE, C17890vO.A0L(), AnonymousClass8BV.A0e(), (Object) null, strArr6, false);
                    String[] strArr7 = new String[A17];
                    strArr7[0] = "payout";
                    ArrayList A0k = AnonymousClass8BX.A0k(A0Z, r2, new C21287AhY(10), strArr7);
                    if (A0k != null && r2.A09(A0Z, "merchant")) {
                        String[] strArr8 = new String[2];
                        strArr8[0] = "0";
                        List A0O2 = C18070vi.A0O("1", strArr8, A17);
                        String[] strArr9 = new String[A17];
                        strArr9[0] = "can-sell";
                        String A07 = r2.A07(A0Z, A0O2, strArr9);
                        if (A07 != null) {
                            List A0o = AnonymousClass8BX.A0o("0", "1", 2, A17);
                            String[] strArr10 = new String[A17];
                            strArr10[0] = "can-payout";
                            String A072 = r2.A07(A0Z, A0o, strArr10);
                            if (A072 != null) {
                                List A0o2 = AnonymousClass8BX.A0o("0", "1", 2, A17);
                                String[] strArr11 = new String[A17];
                                strArr11[0] = "can-add-payout";
                                String A073 = r2.A07(A0Z, A0o2, strArr11);
                                if (A073 != null) {
                                    String[] strArr12 = new String[A17];
                                    strArr12[0] = "merchant-id";
                                    Class<String> cls3 = cls;
                                    Long l3 = A0X;
                                    String str = (String) r21.A05(r22, cls3, l3, AnonymousClass8BV.A0f(), (Object) null, strArr12, false);
                                    if (str != null) {
                                        String[] strArr13 = new String[A17];
                                        strArr13[0] = "business-name";
                                        String str2 = (String) r21.A05(r22, cls3, l3, A0g, (Object) null, strArr13, false);
                                        String[] strArr14 = new String[A17];
                                        strArr14[0] = "support-phone-number";
                                        String str3 = (String) r2.A05(A0Z, cls, A0X, AnonymousClass8BV.A0c(), (Object) null, strArr14, false);
                                        AnonymousClass9CZ A002 = A6w.A00(A0Z, r2);
                                        if (A002 != null) {
                                            return new C178559Do(r0, new AnonymousClass9D7(A0Z, new AnonymousClass9DA(A0Z, A002, A07, A072, A073, str, str2, str3, 2), l2, (List) A0k));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
