package X;

import android.util.Log;

public class DBE implements EAY {
    public static final DBE A00 = new Object();

    public void BHz(String str, String str2) {
        A00(3, str, str2);
    }

    public void BI0(String str, String str2, Throwable th) {
        A01(str, str2, th, 3);
    }

    public void BJn(String str, String str2) {
        A00(6, str, str2);
    }

    public void BJo(String str, String str2, Throwable th) {
        A01(str, str2, th, 6);
    }

    public void Bd1(String str, String str2) {
        A00(4, str, str2);
    }

    public boolean BfN(int i) {
        return BE8.A1U(5, i);
    }

    public void Bhz(String str) {
        A00(5, "BKS::debugLog", str);
    }

    public void CRf(String str, String str2) {
        A00(2, str, str2);
    }

    public void CRu(String str, String str2) {
        A00(5, str, str2);
    }

    public void CRv(String str, String str2, Throwable th) {
        A01(str, str2, th, 5);
    }

    public void CSX(String str, String str2) {
        A00(6, str, str2);
    }

    public void CSY(String str, String str2, Throwable th) {
        A01(str, str2, th, 6);
    }

    private void A00(int i, String str, String str2) {
        Log.println(i, AnonymousClass001.A1H(":", str, AnonymousClass000.A11("unknown")), str2);
    }

    private void A01(String str, String str2, Throwable th, int i) {
        String stackTraceString;
        String A1H = AnonymousClass001.A1H(":", str, AnonymousClass000.A11("unknown"));
        StringBuilder A11 = AnonymousClass000.A11(str2);
        A11.append(10);
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
        }
        Log.println(i, A1H, AnonymousClass000.A0y(stackTraceString, A11));
    }

    public int BUz() {
        return 5;
    }

    public void CJT() {
    }
}
