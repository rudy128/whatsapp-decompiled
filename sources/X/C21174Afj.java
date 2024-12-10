package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Afj  reason: case insensitive filesystem */
public final class C21174Afj implements C22470B9c {
    public static final C21174Afj A00 = new C21174Afj();

    public final Object BCF(C29621ca r19, C62672rm r20) {
        C29621ca A0m;
        C29621ca r11 = r19;
        C62672rm r10 = r20;
        int A17 = C18070vi.A17(r11, r10);
        if (!r10.A09(r11, "card")) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "binding-type";
        Class<String> cls = String.class;
        if (r10.A05(r11, cls, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), (Object) null, strArr, false) == null) {
            return null;
        }
        String[] strArr2 = new String[2];
        strArr2[0] = "0";
        List A0O = C18070vi.A0O("1", strArr2, A17);
        String[] strArr3 = new String[A17];
        strArr3[0] = "needs-device-binding";
        if (r10.A07(r11, A0O, strArr3) == null) {
            return null;
        }
        String[] strArr4 = new String[6];
        strArr4[0] = "ACTIVE";
        strArr4[A17] = "DELETED";
        strArr4[2] = "INACTIVE";
        strArr4[3] = "NEEDS_RETOKENIZATION";
        strArr4[4] = "NEEDS_RETOKENIZATION_DELETED";
        List A0O2 = C18070vi.A0O("SUSPENDED", strArr4, 5);
        String[] strArr5 = new String[A17];
        strArr5[0] = "state";
        r10.A07(r11, A0O2, strArr5);
        List A0o = AnonymousClass8BX.A0o("0", "1", 2, A17);
        String[] strArr6 = new String[A17];
        strArr6[0] = "automatic-binding";
        r10.A07(r11, A0o, strArr6);
        String[] strArr7 = new String[A17];
        strArr7[0] = "image-content-id";
        Long A0X = C108975cc.A0X();
        if (r10.A05(r11, cls, A0X, AnonymousClass8BV.A0j(), (Object) null, strArr7, false) == null) {
            return null;
        }
        String[] strArr8 = new String[A17];
        strArr8[0] = "bank-name";
        r10.A05(r11, cls, A0X, AnonymousClass8BV.A0f(), (Object) null, strArr8, false);
        String[] strArr9 = new String[A17];
        strArr9[0] = "bank-phone-number";
        r10.A05(r11, cls, A0X, AnonymousClass8BV.A0c(), (Object) null, strArr9, false);
        C178249Cj A01 = A6w.A01(r11, r10);
        if (A01 == null) {
            return null;
        }
        AnonymousClass9DG r12 = null;
        if (r10.A09(r11, "card")) {
            List A0o2 = AnonymousClass8BX.A0o("0", "1", 2, A17);
            String[] strArr10 = new String[2];
            strArr10[0] = "capabilities";
            strArr10[A17] = "p2m-credit-eligible";
            String A07 = r10.A07(r11, A0o2, strArr10);
            if (A07 != null) {
                List A0o3 = AnonymousClass8BX.A0o("0", "1", 2, A17);
                String[] strArr11 = new String[2];
                strArr11[0] = "capabilities";
                strArr11[A17] = "p2m-debit-eligible";
                String A072 = r10.A07(r11, A0o3, strArr11);
                if (A072 != null) {
                    String[] strArr12 = new String[A17];
                    strArr12[0] = "capabilities";
                    ArrayList A0u = AnonymousClass8BU.A0u(r11, r10, new C21287AhY(11), strArr12);
                    if (!(A0u == null || (A0m = AnonymousClass8BR.A0m(A0u, 0)) == null)) {
                        r12 = new AnonymousClass9DG(A0m, r11, A07, A072, 16);
                    }
                }
            }
        }
        return new C178539Dm(r11, r12, A01);
    }
}
