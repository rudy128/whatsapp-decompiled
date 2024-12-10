package androidx.compose.ui.input.pointer;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09P;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C16990tY;
import X.C18070vi;

public final class PointerHoverIconModifierElement extends AnonymousClass0WA {
    public final C16990tY A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PointerHoverIconModifierElement) && C18070vi.A18(this.A00, ((PointerHoverIconModifierElement) obj).A00));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0XW, X.09P] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        C16990tY r1 = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A00 = r1;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        ((AnonymousClass09P) r2).A0N(this.A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + 1237;
    }

    public PointerHoverIconModifierElement(C16990tY r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PointerHoverIconModifierElement(icon=");
        A10.append(this.A00);
        A10.append(", overrideDescendants=");
        A10.append(false);
        return AnonymousClass001.A1J(A10);
    }
}
