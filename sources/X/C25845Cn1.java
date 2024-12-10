package X;

import com.whatsapp.util.Log;

/* renamed from: X.Cn1  reason: case insensitive filesystem */
public final class C25845Cn1 {
    public final void A04(String str, String str2, Throwable th) {
        C25095CXk cXk = C24712CGy.A00;
        String A00 = A00(str);
        if (cXk instanceof BYC) {
            StringBuilder A0K = C18070vi.A0K(A00);
            A0K.append(A00);
            A0K.append(' ');
            C108985cd.A1M(str2, A0K, th);
            return;
        }
        C18070vi.A0d(A00, 0);
        C26294Cx6.A09(A00, str2, th);
    }

    public static final String A00(String str) {
        if (!AnonymousClass1YE.A0A(str, "sup:", false)) {
            return C17900vP.A0A("sup:", str);
        }
        return str;
    }

    public final void A01(String str, String str2) {
        C24712CGy.A00.A00(A00(str), str2);
    }

    public final void A02(String str, String str2) {
        C24712CGy.A00.A01(A00(str), str2);
    }

    public final void A05(String str, String str2, Throwable th) {
        C25095CXk cXk = C24712CGy.A00;
        String A00 = A00(str);
        if (cXk instanceof BYC) {
            StringBuilder A0K = C18070vi.A0K(A00);
            A0K.append(A00);
            A0K.append(' ');
            C108985cd.A1M(str2, A0K, th);
            return;
        }
        C18070vi.A0d(A00, 0);
        C26294Cx6.A0A(A00, str2, th);
    }

    public final void A06(String str, String str2, Throwable th) {
        C25095CXk cXk = C24712CGy.A00;
        String A00 = A00(str);
        if (cXk instanceof BYC) {
            StringBuilder A0K = C18070vi.A0K(A00);
            A0K.append(A00);
            Log.w(C17890vO.A0Z(str2, A0K, ' '), th);
            return;
        }
        C18070vi.A0d(A00, 0);
        C26294Cx6.A0B(A00, str2, th);
    }

    public final void A07(String str, String str2, Throwable th) {
        C25095CXk cXk = C24712CGy.A00;
        String A00 = A00(str);
        if (cXk instanceof BYC) {
            StringBuilder A0K = C18070vi.A0K(A00);
            A0K.append(A00);
            Log.w(C17890vO.A0Z(str2, A0K, ' '), th);
            return;
        }
        C18070vi.A0d(A00, 0);
        if (C26294Cx6.A01.BfN(5)) {
            C26294Cx6.A01.CRv(A00, str2, th);
        }
    }

    public final void A03(String str, String str2) {
        C18070vi.A0h(str, str2);
        C25095CXk cXk = C24712CGy.A00;
        String A00 = A00(str);
        if (cXk instanceof BYC) {
            C18070vi.A0d(A00, 0);
            return;
        }
        C18070vi.A0d(A00, 0);
        if (C26294Cx6.A01.BfN(2)) {
            C26294Cx6.A01.CRf(A00, str2);
        }
    }
}
