package X;

/* renamed from: X.D8x  reason: case insensitive filesystem */
public class C26674D8x implements E8W {
    public final long A00;
    public final C25155Ca6 A01;

    public boolean BgN() {
        return false;
    }

    public long BR1() {
        return this.A00;
    }

    public C26674D8x(long j, long j2) {
        C25781Cls cls;
        this.A00 = j;
        if (j2 == 0) {
            cls = C25781Cls.A02;
        } else {
            cls = new C25781Cls(0, j2);
        }
        this.A01 = new C25155Ca6(cls, cls);
    }

    public C25155Ca6 BYo(long j) {
        return this.A01;
    }
}
