package X;

import java.util.NoSuchElementException;

/* renamed from: X.An4  reason: case insensitive filesystem */
public final class C21615An4 extends AnonymousClass3D7 {
    public long A00;
    public boolean A01;
    public final long A02;
    public final long A03 = 1;

    public C21615An4(long j, long j2) {
        this.A02 = j2;
        boolean z = j > j2 ? false : true;
        this.A01 = z;
        this.A00 = !z ? j2 : j;
    }

    public long A00() {
        long j = this.A00;
        if (j != this.A02) {
            this.A00 = this.A03 + j;
            return j;
        } else if (this.A01) {
            this.A01 = false;
            return j;
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        return this.A01;
    }
}
