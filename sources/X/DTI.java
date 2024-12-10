package X;

public class DTI implements Runnable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Object A06;
    public final boolean A07;

    public DTI(Object obj, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.A00 = i6;
        this.A06 = obj;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = i4;
        this.A05 = i5;
        this.A07 = z;
    }

    public final void run() {
        int i = this.A00;
        Object obj = this.A06;
        if (i != 0) {
            BUN bun = (BUN) obj;
            int i2 = this.A01;
            int i3 = this.A02;
            int i4 = this.A03;
            int i5 = this.A04;
            int i6 = this.A05;
            boolean z = this.A07;
            boolean z2 = bun.A0B;
            int i7 = bun.A00;
            bun.A03 = i2;
            bun.A02 = i3;
            bun.A04 = i4;
            bun.A05 = i5;
            bun.A01 = i6;
            bun.A0C = z;
            bun.A0B = z2;
            bun.A00 = i7;
            BUN.A02(bun);
            return;
        }
        BUO buo = (BUO) obj;
        int i8 = this.A01;
        int i9 = this.A02;
        int i10 = this.A03;
        int i11 = this.A04;
        int i12 = this.A05;
        boolean z3 = this.A07;
        boolean z4 = buo.A0F;
        int i13 = buo.A00;
        buo.A03 = i8;
        buo.A02 = i9;
        buo.A06 = i10;
        buo.A07 = i11;
        buo.A01 = i12;
        buo.A0G = z3;
        buo.A0F = z4;
        buo.A00 = i13;
        BUO.A01(buo);
    }
}
