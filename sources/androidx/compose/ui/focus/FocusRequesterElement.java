package androidx.compose.ui.focus;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C014708p;
import X.C04310Mr;
import X.C18070vi;

public final class FocusRequesterElement extends AnonymousClass0WA {
    public final C04310Mr A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusRequesterElement) && C18070vi.A18(this.A00, ((FocusRequesterElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0XW, X.08p] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        C04310Mr r1 = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A00 = r1;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        C014708p r22 = (C014708p) r2;
        r22.A00.A00.A0H(r22);
        C04310Mr r0 = this.A00;
        r22.A00 = r0;
        r0.A00.A0F(r22);
    }

    public FocusRequesterElement(C04310Mr r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FocusRequesterElement(focusRequester=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
