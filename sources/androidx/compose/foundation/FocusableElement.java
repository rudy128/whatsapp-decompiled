package androidx.compose.foundation;

import X.AnonymousClass001;
import X.AnonymousClass0AZ;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C17210uI;
import X.C18070vi;

public final class FocusableElement extends AnonymousClass0WA {
    public final C17210uI A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusableElement) && C18070vi.A18(this.A00, ((FocusableElement) obj).A00));
    }

    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        return new AnonymousClass0AZ(this.A00);
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r3) {
        ((AnonymousClass0AZ) r3).A01.A0N(this.A00);
    }

    public int hashCode() {
        return AnonymousClass001.A0l(this.A00);
    }

    public FocusableElement(C17210uI r1) {
        this.A00 = r1;
    }
}
