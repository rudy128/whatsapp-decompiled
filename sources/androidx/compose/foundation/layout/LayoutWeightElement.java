package androidx.compose.foundation.layout;

import X.AnonymousClass000;
import X.AnonymousClass09M;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;

public final class LayoutWeightElement extends AnonymousClass0WA {
    public final float A00 = 1.0f;

    public boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        return layoutWeightElement != null && this.A00 == layoutWeightElement.A00;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.09M, X.0XW] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        float f = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A00 = f;
        r0.A01 = true;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        AnonymousClass09M r22 = (AnonymousClass09M) r2;
        r22.A00 = this.A00;
        r22.A01 = true;
    }

    public int hashCode() {
        return AnonymousClass000.A05(this.A00) + 1231;
    }
}
