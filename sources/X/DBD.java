package X;

import android.util.Log;

public class DBD implements EAY {
    public static final DBD A01 = new Object();
    public int A00;

    public void Bhz(String str) {
        Log.println(5, "BKS::debugLog", str);
    }

    public void CJT() {
        this.A00 = 5;
    }

    public int BUz() {
        return this.A00;
    }

    public boolean BfN(int i) {
        return BE8.A1U(this.A00, i);
    }

    public void BHz(String str, String str2) {
        Log.d(str, str2);
    }

    public void BJn(String str, String str2) {
        Log.e(str, str2);
    }

    public void Bd1(String str, String str2) {
        Log.i(str, str2);
    }

    public void CRf(String str, String str2) {
        Log.v(str, str2);
    }

    public void CRu(String str, String str2) {
        Log.w(str, str2);
    }

    public void CSX(String str, String str2) {
        Log.e(str, str2);
    }

    public void BI0(String str, String str2, Throwable th) {
        Log.d(str, str2, th);
    }

    public void BJo(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public void CRv(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    public void CSY(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }
}
