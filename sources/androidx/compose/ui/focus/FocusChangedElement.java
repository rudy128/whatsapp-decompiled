package androidx.compose.ui.focus;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WA;
import X.C014508n;
import X.C18070vi;
import X.C22821Di;

public final class FocusChangedElement extends AnonymousClass0WA {
    public final C22821Di A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusChangedElement) && C18070vi.A18(this.A00, ((FocusChangedElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    /* renamed from: A03 */
    public C014508n A01() {
        return new C014508n(this.A00);
    }

    /* renamed from: A04 */
    public void A02(C014508n r2) {
        r2.A0N(this.A00);
    }

    public FocusChangedElement(C22821Di r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FocusChangedElement(onFocusChanged=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
