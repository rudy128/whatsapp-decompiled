package X;

import java.util.List;

/* renamed from: X.9No  reason: invalid class name and case insensitive filesystem */
public class C180699No {
    public int A00;
    public AF0 A01;
    public String A02;
    public String A03;

    public void A00(int i, List list) {
        String str = null;
        String str2 = null;
        if (i > 0) {
            str2 = ((AF0) list.get(i - 1)).A0H;
        }
        this.A03 = str2;
        if (i < AnonymousClass3MX.A01(list)) {
            str = ((AF0) list.get(i + 1)).A0H;
        }
        this.A02 = str;
    }
}
