package X;

import java.util.Random;

public class A17 {
    public Integer A00 = null;
    public String A01;
    public Random A02;
    public final C18030ve A03;
    public final AnonymousClass18K A04;

    public void A02(long j, int i, long j2) {
        Integer num;
        if (i == 1 || (num = this.A00) == null || num.intValue() != 4) {
            C171608rz r1 = new C171608rz();
            r1.A01 = 4;
            r1.A06 = Long.valueOf(j);
            r1.A08 = Long.valueOf(j2);
            r1.A04 = Integer.valueOf(i);
            A00(r1, this);
        }
    }

    public void A01(int i) {
        C171608rz r1 = new C171608rz();
        r1.A01 = Integer.valueOf(i);
        r1.A03 = AnonymousClass3MY.A0f();
        A00(r1, this);
    }

    public A17(C18030ve r2, AnonymousClass18K r3) {
        this.A04 = r3;
        this.A03 = r2;
    }

    public static void A00(C171608rz r1, A17 a17) {
        r1.A02 = AnonymousClass3MY.A0f();
        r1.A0A = a17.A01;
        a17.A04.CC7(r1);
        a17.A00 = r1.A01;
    }
}
