package androidx.compose.foundation.layout;

import X.AnonymousClass093;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.AnonymousClass0tB;
import X.C18070vi;
import X.C22821Di;

public final class PaddingValuesElement extends AnonymousClass0WA {
    public final AnonymousClass0tB A00;
    public final C22821Di A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0XW, X.093] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        AnonymousClass0tB r1 = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A00 = r1;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        ((AnonymousClass093) r2).A00 = this.A00;
    }

    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if (!(obj instanceof PaddingValuesElement) || (paddingValuesElement = (PaddingValuesElement) obj) == null) {
            return false;
        }
        return C18070vi.A18(this.A00, paddingValuesElement.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public PaddingValuesElement(AnonymousClass0tB r1, C22821Di r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
