package X;

import android.util.SparseIntArray;

/* renamed from: X.4jx  reason: invalid class name and case insensitive filesystem */
public final class C94044jx implements AnonymousClass5XE {
    public final SparseIntArray A00;
    public final C22821Di A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94044jx) {
                C94044jx r5 = (C94044jx) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C94044jx(SparseIntArray sparseIntArray, C22821Di r2) {
        this.A00 = sparseIntArray;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaFilterTokenList(tokens=");
        A10.append(this.A00);
        A10.append(", onTokenClick=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
