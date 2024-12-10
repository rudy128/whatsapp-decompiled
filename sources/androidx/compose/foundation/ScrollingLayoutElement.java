package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass096;
import X.AnonymousClass0DV;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C05400Ua;
import X.C18070vi;

public final class ScrollingLayoutElement extends AnonymousClass0WA {
    public final C05400Ua A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0XW, X.096] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        C05400Ua r3 = this.A00;
        boolean z = this.A01;
        boolean z2 = this.A02;
        ? r0 = new AnonymousClass0XW();
        r0.A00 = r3;
        r0.A01 = z;
        r0.A02 = z2;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        AnonymousClass096 r22 = (AnonymousClass096) r2;
        r22.A00 = this.A00;
        r22.A01 = this.A01;
        r22.A02 = this.A02;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (C18070vi.A18(this.A00, scrollingLayoutElement.A00) && this.A01 == scrollingLayoutElement.A01 && this.A02 == scrollingLayoutElement.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int A002 = AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A01);
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return A002 + i;
    }

    public ScrollingLayoutElement(C05400Ua r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }
}
