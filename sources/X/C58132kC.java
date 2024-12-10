package X;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.2kC  reason: invalid class name and case insensitive filesystem */
public class C58132kC {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.2kC, java.lang.Object] */
    public static C58132kC A00(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        String[] split = str.split(",");
        Long A052 = C63782tg.A05(split, 0);
        int length = split.length;
        if (length > 1) {
            z = Boolean.parseBoolean(split[1]);
            if (length > 2) {
                z2 = Boolean.parseBoolean(split[2]);
            }
            z2 = false;
        } else {
            z = false;
            z2 = false;
        }
        Long A053 = C63782tg.A05(split, 3);
        if (length > 4) {
            z3 = Boolean.parseBoolean(split[4]);
        } else {
            z3 = false;
        }
        Long A054 = C63782tg.A05(split, 5);
        Long A055 = C63782tg.A05(split, 6);
        Long A056 = C63782tg.A05(split, 7);
        Long A057 = C63782tg.A05(split, 8);
        Long A058 = C63782tg.A05(split, 9);
        ? obj = new Object();
        obj.A06 = A052;
        obj.A07 = z;
        obj.A09 = z2;
        obj.A03 = A053;
        obj.A08 = z3;
        obj.A05 = A054;
        obj.A04 = A055;
        obj.A02 = A056;
        obj.A01 = A057;
        obj.A00 = A058;
        return obj;
    }

    public String toString() {
        return TextUtils.join(",", Arrays.asList(new Serializable[]{this.A06, Boolean.valueOf(this.A07), Boolean.valueOf(this.A09), this.A03, Boolean.valueOf(this.A08), this.A05, this.A04, this.A02, this.A01, this.A00}));
    }
}
