package androidx.compose.ui.node;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C18070vi;

public final class ForceUpdateElement extends AnonymousClass0WA {
    public final AnonymousClass0WA A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ForceUpdateElement) && C18070vi.A18(this.A00, ((ForceUpdateElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass0XW A01() {
        throw AnonymousClass000.A0n("Shouldn't be called");
    }

    public void A02(AnonymousClass0XW r2) {
        throw AnonymousClass000.A0n("Shouldn't be called");
    }

    public ForceUpdateElement(AnonymousClass0WA r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ForceUpdateElement(original=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
