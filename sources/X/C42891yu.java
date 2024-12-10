package X;

import java.util.Arrays;

/* renamed from: X.1yu  reason: invalid class name and case insensitive filesystem */
public final class C42891yu {
    public final Object A00;
    public final Throwable A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42891yu) {
                C42891yu r5 = (C42891yu) obj;
                Object obj2 = this.A00;
                if (obj2 == null || !obj2.equals(r5.A00)) {
                    Throwable th = this.A01;
                    if (!(th == null || r5.A01 == null)) {
                        return th.toString().equals(th.toString());
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public C42891yu(Object obj) {
        this.A00 = obj;
        this.A01 = null;
    }

    public C42891yu(Throwable th) {
        this.A01 = th;
        this.A00 = null;
    }
}
