package X;

public abstract class BJP extends AnonymousClass27N {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public int A06 = 0;
    public int A07 = 0;
    public C38941sE A08 = new Object();
    public C39101sU A09 = null;
    public boolean A0A = false;

    public void A0J(C38871s3 r4, Integer num, Integer num2, int i, int i2) {
        C39101sU r2;
        C38871s3 r0;
        while (true) {
            r2 = this.A09;
            if (r2 != null || (r0 = this.A0Z) == null) {
                C38941sE r1 = this.A08;
                r1.A05 = num;
                r1.A06 = num2;
                r1.A00 = i;
                r1.A04 = i2;
                r2.BjX(r4, r1);
                r4.A0A(r1.A03);
                r4.A09(r1.A02);
                r4.A0h = r1.A07;
                int i3 = r1.A01;
                r4.A07 = i3;
                r4.A0h = AnonymousClass000.A1R(i3);
            } else {
                this.A09 = ((C38891s5) r0).A05;
            }
        }
        C38941sE r12 = this.A08;
        r12.A05 = num;
        r12.A06 = num2;
        r12.A00 = i;
        r12.A04 = i2;
        r2.BjX(r4, r12);
        r4.A0A(r12.A03);
        r4.A09(r12.A02);
        r4.A0h = r12.A07;
        int i32 = r12.A01;
        r4.A07 = i32;
        r4.A0h = AnonymousClass000.A1R(i32);
    }
}
