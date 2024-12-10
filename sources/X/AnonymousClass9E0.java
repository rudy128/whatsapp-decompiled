package X;

/* renamed from: X.9E0  reason: invalid class name */
public class AnonymousClass9E0 extends C198999zG implements C22476B9i, C22477B9j, C22478B9k, C22527BBk {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    public AnonymousClass9E0(C29621ca r1, String str, int i, long j) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = j;
        this.A02 = r1;
        this.A00 = r1;
    }

    public void BAa(C197649x2 r4) {
        int i;
        int i2 = this.A00;
        C18070vi.A0d(r4, 0);
        AnonymousClass1GV r1 = r4.A00;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 2;
        }
        r1.accept(Integer.valueOf(i));
    }

    public long BOr() {
        return this.A01;
    }

    public String BaG() {
        return this.A03;
    }
}
