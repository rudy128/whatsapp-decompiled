package androidx.compose.ui.layout;

import X.AnonymousClass091;
import X.AnonymousClass0WA;
import X.C18070vi;
import X.C22821Di;

public final class OnGloballyPositionedElement extends AnonymousClass0WA {
    public final C22821Di A00;

    /* renamed from: A03 */
    public AnonymousClass091 A01() {
        return new AnonymousClass091(this.A00);
    }

    /* renamed from: A04 */
    public void A02(AnonymousClass091 r2) {
        r2.A0N(this.A00);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedElement)) {
            return false;
        }
        return C18070vi.A18(this.A00, ((OnGloballyPositionedElement) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public OnGloballyPositionedElement(C22821Di r1) {
        this.A00 = r1;
    }
}
