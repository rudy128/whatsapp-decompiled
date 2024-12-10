package X;

import com.whatsapp.util.Log;

/* renamed from: X.297  reason: invalid class name */
public final class AnonymousClass297 extends A5Z {
    public void A02(String str) {
        C18070vi.A0d(str, 0);
    }

    public void A04(String str, String str2) {
        C18070vi.A0h(str, str2);
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0d("work-manager-log/", str, A10);
        C17890vO.A19(A10, str2);
    }

    public void A05(String str, String str2) {
        C18070vi.A0h(str, str2);
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0d("work-manager-log/", str, A10);
        C17890vO.A1A(A10, str2);
    }

    public void A06(String str, String str2) {
        C18070vi.A0h(str, str2);
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0d("work-manager-log/", str, A10);
        C17890vO.A1B(A10, str2);
    }

    public void A08(String str, String str2, Throwable th) {
        C18070vi.A0h(str, str2);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("work-manager-log/");
        A10.append(str);
        Log.e(C17890vO.A0Z(str2, A10, '/'), th);
    }

    public void A09(String str, String str2, Throwable th) {
        C18070vi.A0h(str, str2);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("work-manager-log/");
        A10.append(str);
        Log.i(C17890vO.A0Z(str2, A10, '/'), th);
    }

    public void A0A(String str, String str2, Throwable th) {
        StringBuilder A0K = C18070vi.A0K(str);
        C17900vP.A0d("work-manager-log/", str, A0K);
        C17890vO.A13(str2, A0K, th);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WaLoggerBridge");
        return C17880vN.A0t(A10, hashCode());
    }

    public void A03(String str, String str2) {
        C18070vi.A0h(str, str2);
    }

    public void A07(String str, String str2, Throwable th) {
        C18070vi.A0h(str, str2);
    }
}
