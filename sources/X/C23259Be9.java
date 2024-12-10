package X;

import android.content.Context;

/* renamed from: X.Be9  reason: case insensitive filesystem */
public final class C23259Be9 extends C24431C3g {
    public final Context A00;
    public final E5L A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C24431C3g) {
                C23259Be9 be9 = (C23259Be9) ((C24431C3g) obj);
                if (!this.A00.equals(be9.A00) || !this.A01.equals(be9.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        String obj = this.A00.toString();
        String obj2 = this.A01.toString();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlagsContext{context=");
        A10.append(obj);
        A10.append(", hermeticFileOverrides=");
        return BEA.A0n(obj2, A10);
    }

    public C23259Be9(Context context, E5L e5l) {
        this.A00 = context;
        this.A01 = e5l;
    }
}
