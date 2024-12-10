package X;

import android.os.Process;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.CWw  reason: case insensitive filesystem */
public final class C25086CWw {
    public final long A00 = System.currentTimeMillis();
    public final String A01;
    public final String A02;
    public final String A03;
    public final Object[] A04;

    public String toString() {
        try {
            JSONObject A15 = C17880vN.A15();
            StringBuilder A10 = AnonymousClass000.A10();
            String str = this.A02;
            if (str.length() != 0) {
                BE7.A1N(A10, str);
            }
            Object[] objArr = this.A04;
            Locale locale = Locale.ROOT;
            String str2 = this.A01;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            A10.append(C108955ca.A12(locale, str2, Arrays.copyOf(copyOf, copyOf.length)));
            A15.put("content", A10.toString());
            A15.put("time", this.A00);
            A15.put("thread", this.A03);
            A15.put("process", Process.myPid());
            String obj = A15.toString();
            C18070vi.A0b(obj);
            return obj;
        } catch (Exception e) {
            Locale locale2 = Locale.ROOT;
            Object[] objArr2 = new Object[1];
            BE6.A1M(e, objArr2, 0);
            return C108955ca.A12(locale2, "Invalid log: %s", Arrays.copyOf(objArr2, 1));
        }
    }

    public C25086CWw(String str, String str2, Object[] objArr) {
        this.A02 = str;
        this.A01 = str2;
        this.A04 = objArr;
        String name = Thread.currentThread().getName();
        C18070vi.A0X(name);
        this.A03 = name;
    }
}
