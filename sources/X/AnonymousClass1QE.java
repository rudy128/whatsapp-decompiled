package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1QE  reason: invalid class name */
public class AnonymousClass1QE {
    public final AnonymousClass1QF A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public void A04(String str) {
        A02(this, (String) null, str);
    }

    public void A05(String str) {
        String obj = A02(this, (String) null, str).toString();
        if (TextUtils.isEmpty(obj)) {
            Log.e((Throwable) null);
        } else {
            Log.e(obj);
        }
    }

    public void A06(String str) {
        A09((String) null, str, (AnonymousClass9NF[]) null);
    }

    public void A07(String str) {
        A02(this, (String) null, str);
    }

    public void A0A(String str, Throwable th) {
        String obj = A02(this, (String) null, str).toString();
        if (TextUtils.isEmpty(obj)) {
            Log.e(th);
        } else if (th == null) {
            Log.e(obj);
        } else {
            Log.e(obj, th);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.1QF] */
    public static AnonymousClass1QE A00(String str, String str2, String str3) {
        return new AnonymousClass1QE(new Object(), str, str2, str3);
    }

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("PAY: ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" - ");
        sb2.append(str);
        sb2.append(":");
        sb.append(sb2.toString());
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" ");
            sb3.append(str2);
            sb.append(sb3.toString());
        }
        return sb.toString();
    }

    public static StringBuilder A02(AnonymousClass1QE r4, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("PAY: ");
        String str3 = r4.A02;
        if (!TextUtils.isEmpty(str3)) {
            sb.append(String.format("[%s]", new Object[]{str3}));
        }
        if (TextUtils.isEmpty(str)) {
            str = r4.A03;
        }
        sb.append(String.format("[%s]", new Object[]{str}));
        sb.append(" - ");
        sb.append(r4.A01);
        sb.append(":");
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" ");
            sb.append(str2);
        }
        return sb;
    }

    public String A03(String str) {
        return A02(this, this.A03, str).toString();
    }

    public AnonymousClass1QE(AnonymousClass1QF r1, String str, String str2, String str3) {
        this.A00 = r1;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    public void A08(String str, String str2, Throwable th) {
        String obj = A02(this, str, str2).toString();
        if (TextUtils.isEmpty(obj)) {
            Log.e(th);
        } else if (th == null) {
            Log.e(obj);
        } else {
            Log.e(obj, th);
        }
    }

    public void A09(String str, String str2, AnonymousClass9NF[] r8) {
        int length;
        StringBuilder A022 = A02(this, str, str2);
        if (r8 != null && (length = r8.length) > 0) {
            A022.append(" [");
            int i = 0;
            do {
                AnonymousClass9NF r1 = r8[i];
                A022.append("{");
                A022.append(r1.A00);
                A022.append(" : ");
                A022.append(r1.A01);
                A022.append("}");
                if (i != length - 1) {
                    A022.append(",");
                }
                i++;
            } while (i < length);
            A022.append("]");
        }
        Log.i(A022.toString());
    }
}
