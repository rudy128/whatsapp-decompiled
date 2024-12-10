package X;

import android.text.TextUtils;

/* renamed from: X.Cl0  reason: case insensitive filesystem */
public class C25730Cl0 {
    public final C26006CqN A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public static int A00(int[] iArr, int i) {
        int i2 = Integer.MAX_VALUE;
        for (int i3 : iArr) {
            if (i3 >= 0) {
                i2 = Math.min(i2, i3);
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        return i;
    }

    public C25730Cl0(CST cst) {
        this.A04 = cst.A04;
        this.A00 = cst.A00;
        this.A02 = cst.A02;
        this.A03 = cst.A03;
        this.A01 = cst.A01;
    }

    public String A01() {
        StringBuilder A10 = AnonymousClass000.A10();
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            A10.append(str);
            A10.append(":");
        }
        C26006CqN cqN = this.A00;
        if (cqN != null) {
            A10.append("//");
            A10.append(cqN.A01());
        }
        String str2 = this.A02;
        if (!TextUtils.isEmpty(str2)) {
            A10.append(str2);
        }
        if (!TextUtils.isEmpty(this.A03)) {
            A10.append('?');
            A10.append("<REDACTED>");
        }
        if (!TextUtils.isEmpty(this.A01)) {
            A10.append('#');
            A10.append("<REDACTED>");
        }
        return A10.toString();
    }

    public String toString() {
        return A01();
    }
}
