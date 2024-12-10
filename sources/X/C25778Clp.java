package X;

import android.content.res.TypedArray;

/* renamed from: X.Clp  reason: case insensitive filesystem */
public final class C25778Clp {
    public final int A00;
    public final Integer A01;

    public static C25778Clp A00(TypedArray typedArray, int i, int i2, int i3) {
        return new C25778Clp(typedArray.getInt(i2, i3), Integer.valueOf(typedArray.getInt(i, 0)));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25778Clp) {
                C25778Clp clp = (C25778Clp) obj;
                if (!C18070vi.A18(this.A01, clp.A01) || this.A00 != clp.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A01) * 31) + this.A00;
    }

    public C25778Clp(int i, Integer num) {
        this.A01 = num;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("QuickActionIcon(icon=");
        A10.append(this.A01);
        A10.append(", tintColor=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
