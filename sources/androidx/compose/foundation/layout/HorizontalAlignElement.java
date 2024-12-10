package androidx.compose.foundation.layout;

import X.AnonymousClass09L;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C16330s5;
import X.C18070vi;

public final class HorizontalAlignElement extends AnonymousClass0WA {
    public final C16330s5 A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.09L, X.0XW] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        C16330s5 r1 = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A00 = r1;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        ((AnonymousClass09L) r2).A00 = this.A00;
    }

    public boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalAlignElement) || (horizontalAlignElement = (HorizontalAlignElement) obj) == null) {
            return false;
        }
        return C18070vi.A18(this.A00, horizontalAlignElement.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public HorizontalAlignElement(C16330s5 r1) {
        this.A00 = r1;
    }
}
