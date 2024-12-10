package X;

/* renamed from: X.DTb  reason: case insensitive filesystem */
public class C27077DTb implements Runnable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    public C27077DTb(C679831p r1, byte[] bArr, int i, int i2, int i3, int i4) {
        this.A00 = i4;
        this.A04 = r1;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = bArr;
        this.A03 = i3;
    }

    public final void run() {
        switch (this.A00) {
            case 0:
                BUO buo = (BUO) this.A04;
                Object obj = this.A05;
                int i = this.A01;
                int i2 = this.A02;
                int i3 = this.A03;
                BUO.A00((E8l) obj, buo, i);
                boolean z = buo.A0F;
                int i4 = buo.A00;
                buo.A03 = i2;
                buo.A02 = i3;
                buo.A06 = 0;
                buo.A07 = 0;
                buo.A01 = 0;
                buo.A0G = false;
                buo.A0F = z;
                buo.A00 = i4;
                BUO.A01(buo);
                return;
            case 1:
                BUN bun = (BUN) this.A04;
                Object obj2 = this.A05;
                int i5 = this.A01;
                int i6 = this.A02;
                int i7 = this.A03;
                synchronized (bun.A0N) {
                    BUN.A01((E8l) obj2, bun, i5);
                }
                boolean z2 = bun.A0B;
                int i8 = bun.A00;
                bun.A03 = i6;
                bun.A02 = i7;
                bun.A04 = 0;
                bun.A05 = 0;
                bun.A01 = 0;
                bun.A0C = false;
                bun.A0B = z2;
                bun.A00 = i8;
                BUN.A02(bun);
                return;
            case 2:
                C679831p r5 = (C679831p) this.A04;
                int i9 = this.A01;
                int i10 = this.A02;
                byte[] bArr = (byte[]) this.A05;
                int i11 = this.A03;
                if (i9 == 1) {
                    if (C679831p.A0E(r5)) {
                        r5.A07.A04(bArr, i10, i11);
                        r5.A07.A03((Integer) null);
                        C679831p.A07(r5);
                        return;
                    }
                    return;
                } else if (C679831p.A0B(r5)) {
                    r5.A08.A04(bArr, i10, i11);
                    r5.A08.A03((Integer) null);
                    C679831p.A08(r5, i10, false);
                    r5.A01.A03();
                    return;
                } else {
                    return;
                }
            default:
                C679831p r3 = (C679831p) this.A04;
                int i12 = this.A01;
                int i13 = this.A02;
                byte[] bArr2 = (byte[]) this.A05;
                int i14 = this.A03;
                if (i12 == 2) {
                    if (C679831p.A0D(r3)) {
                        if (!r3.A0Z) {
                            r3.A0L.A06(C24311Jr.A00(), (String) null);
                            r3.A0Z = true;
                        }
                        r3.A06.A04(bArr2, i13, i14);
                        r3.A06.A03((Integer) null);
                        C679831p.A06(r3);
                        return;
                    }
                    return;
                } else if (C679831p.A0C(r3)) {
                    if (!r3.A0Z) {
                        r3.A0L.A06(C24311Jr.A00(), (String) null);
                        r3.A0Z = true;
                    }
                    r3.A05.A04(bArr2, i13, i14);
                    r3.A05.A03((Integer) null);
                    C679831p.A05(r3);
                    return;
                } else {
                    return;
                }
        }
    }

    public C27077DTb(BUN bun, Object obj, int i, int i2, int i3) {
        this.A00 = 1;
        this.A04 = bun;
        this.A05 = obj;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    public C27077DTb(BUO buo, Object obj, int i, int i2, int i3) {
        this.A00 = 0;
        this.A04 = buo;
        this.A05 = obj;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }
}
