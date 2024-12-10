package X;

/* renamed from: X.Adf  reason: case insensitive filesystem */
public class C21049Adf implements BCG {
    public int A00;
    public final C191779nA A01;
    public final long A02;

    public C191779nA BQ1() {
        int i;
        boolean z = this instanceof C1776099p;
        int i2 = this.A00;
        if (z) {
            i = 3;
        } else {
            i = 4;
        }
        if (i2 < i) {
            return this.A01;
        }
        return null;
    }

    public void Bt5(boolean z, int i) {
        this.A00++;
    }

    public C21049Adf(long j, String str, String str2) {
        this.A01 = new C191779nA(str, str, "", str2, (String) null, (String) null, "fallback", 0, false);
        this.A02 = j;
    }

    public long BNK() {
        return this.A02;
    }

    public C21049Adf(C191779nA r1, long j) {
        this.A02 = j;
        this.A01 = r1;
    }
}
