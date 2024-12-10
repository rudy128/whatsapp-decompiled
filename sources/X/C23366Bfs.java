package X;

import java.util.Arrays;

/* renamed from: X.Bfs  reason: case insensitive filesystem */
public final class C23366Bfs extends DSA {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((C23366Bfs) obj).A00);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        DSA dsa = (DSA) obj;
        int A01 = A01();
        int A012 = dsa.A01();
        if (A01 != A012) {
            return A01 - A012;
        }
        long abs = Math.abs(this.A00);
        long abs2 = Math.abs(((C23366Bfs) dsa).A00);
        if (abs < abs2) {
            return -1;
        }
        return AnonymousClass000.A1R((abs > abs2 ? 1 : (abs == abs2 ? 0 : -1))) ? 1 : 0;
    }

    public final String toString() {
        return Long.toString(this.A00);
    }

    public C23366Bfs(long j) {
        this.A00 = j;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, A01());
        C17890vO.A1M(A1b, this.A00);
        return Arrays.hashCode(A1b);
    }
}
