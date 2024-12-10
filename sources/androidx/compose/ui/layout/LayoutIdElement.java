package androidx.compose.ui.layout;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09N;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C18070vi;

public final class LayoutIdElement extends AnonymousClass0WA {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LayoutIdElement) && C18070vi.A18(this.A00, ((LayoutIdElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.09N, X.0XW] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        Object obj = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A00 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        ((AnonymousClass09N) r2).A00 = this.A00;
    }

    public LayoutIdElement(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LayoutIdElement(layoutId=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
