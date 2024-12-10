package androidx.compose.foundation.layout;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass099;
import X.AnonymousClass0WA;
import X.C18070vi;
import X.C22821Di;

public final class OffsetPxElement extends AnonymousClass0WA {
    public final C22821Di A00;
    public final C22821Di A01;

    public boolean equals(Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        return offsetPxElement != null && C18070vi.A18(this.A01, offsetPxElement.A01);
    }

    /* renamed from: A03 */
    public AnonymousClass099 A01() {
        return new AnonymousClass099(this.A01);
    }

    /* renamed from: A04 */
    public void A02(AnonymousClass099 r2) {
        r2.A0O(this.A01);
        r2.A00 = true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + 1231;
    }

    public OffsetPxElement(C22821Di r1, C22821Di r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OffsetPxModifier(offset=");
        A10.append(this.A01);
        A10.append(", rtlAware=");
        A10.append(true);
        return AnonymousClass001.A1J(A10);
    }
}
