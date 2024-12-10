package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C17210uI;
import X.C18070vi;

public final class HoverableElement extends AnonymousClass0WA {
    public final C17210uI A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HoverableElement) && C18070vi.A18(((HoverableElement) obj).A00, this.A00));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.HoverableNode, X.0XW] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        C17210uI r1 = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A00 = r1;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        ((HoverableNode) r2).A0Q(this.A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00);
    }

    public HoverableElement(C17210uI r1) {
        this.A00 = r1;
    }
}
