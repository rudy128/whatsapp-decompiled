package androidx.compose.foundation.layout;

import X.AnonymousClass000;
import X.AnonymousClass09K;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C18070vi;
import X.C22821Di;
import androidx.compose.ui.Alignment;

public final class BoxChildDataElement extends AnonymousClass0WA {
    public final Alignment A00;
    public final C22821Di A01;

    public boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildDataElement) {
            boxChildDataElement = (BoxChildDataElement) obj;
        } else {
            boxChildDataElement = null;
        }
        return boxChildDataElement != null && C18070vi.A18(this.A00, boxChildDataElement.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.09K, X.0XW] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        Alignment alignment = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A00 = alignment;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        ((AnonymousClass09K) r2).A00 = this.A00;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + 1237;
    }

    public BoxChildDataElement(Alignment alignment, C22821Di r2) {
        this.A00 = alignment;
        this.A01 = r2;
    }
}
