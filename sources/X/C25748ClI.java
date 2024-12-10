package X;

/* renamed from: X.ClI  reason: case insensitive filesystem */
public class C25748ClI {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public static long A00(int i, long j) {
        if (i == 0) {
            return 0;
        }
        return (((j - 1) / 1024) + 1) * 1024;
    }

    public C23840Bqx A01() {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        C23840Bqx bqx = new C23840Bqx();
        bqx.A01 = C17880vN.A0j();
        bqx.A00 = Integer.valueOf(C1409973w.A01(this.A00, 0, false));
        Long l5 = this.A0C;
        if (l5 == null || (l4 = this.A0B) == null) {
            l = null;
        } else {
            l = C108945cZ.A1B(l4.longValue(), l5.longValue());
        }
        bqx.A0B = l;
        Long l6 = this.A0A;
        if (l6 == null || (l3 = this.A09) == null) {
            l2 = null;
        } else {
            l2 = C108945cZ.A1B(l3.longValue(), l6.longValue());
        }
        bqx.A02 = l2;
        bqx.A09 = Long.valueOf(this.A07);
        bqx.A0A = Long.valueOf(this.A08);
        bqx.A06 = Long.valueOf(this.A04);
        long j = this.A01;
        bqx.A03 = Long.valueOf(A00((j > 0 ? 1 : (j == 0 ? 0 : -1)), j));
        bqx.A07 = Long.valueOf(this.A05);
        long j2 = this.A02;
        bqx.A04 = Long.valueOf(A00((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
        bqx.A08 = Long.valueOf(this.A06);
        long j3 = this.A03;
        bqx.A05 = Long.valueOf(A00((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j3));
        return bqx;
    }

    public String toString() {
        return A01().toString();
    }
}
