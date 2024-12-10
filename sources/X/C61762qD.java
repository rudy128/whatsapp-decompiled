package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2qD  reason: invalid class name and case insensitive filesystem */
public class C61762qD {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final AtomicInteger A0B;

    public C61762qD(Integer num, String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z) {
        this.A00 = -1;
        this.A09 = str;
        this.A01 = str2;
        this.A0A = str3;
        this.A07 = i;
        this.A04 = z;
        this.A06 = i2;
        this.A08 = num;
        this.A0B = new AtomicInteger(i3);
        this.A02 = str4;
    }

    public C61762qD(String str, String str2, String str3, int i, int i2) {
        this((Integer) null, str, str2, str3, (String) null, i, i2, 0, false);
    }
}
