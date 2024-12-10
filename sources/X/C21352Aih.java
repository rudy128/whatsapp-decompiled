package X;

import java.util.Iterator;

/* renamed from: X.Aih  reason: case insensitive filesystem */
public abstract class C21352Aih implements Iterable, C18450wR {
    public final long A00;
    public final long A01;

    public C21352Aih(long j, long j2) {
        this.A00 = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.A01 = j2;
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return new C21615An4(this.A00, this.A01);
    }
}
