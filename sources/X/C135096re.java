package X;

import android.graphics.Rect;

/* renamed from: X.6re  reason: invalid class name and case insensitive filesystem */
public final class C135096re {
    public final Rect A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135096re) {
                C135096re r5 = (C135096re) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass3MX.A03(this.A01));
    }

    public C135096re(Rect rect, boolean z) {
        this.A01 = z;
        this.A00 = rect;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LeafData(isVisible=");
        A10.append(this.A01);
        A10.append(", boundsOnScreen=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
