package androidx.compose.foundation.relocation;

import X.AnonymousClass07M;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C015308w;
import X.C16200rs;
import X.C18070vi;

public final class BringIntoViewRequesterElement extends AnonymousClass0WA {
    public final C16200rs A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.08w, X.0XW, X.07M] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        C16200rs r1 = this.A00;
        ? r0 = new C015308w();
        r0.A00 = r1;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r3) {
        AnonymousClass07M r32 = (AnonymousClass07M) r3;
        C16200rs r1 = this.A00;
        AnonymousClass07M.A00(r32);
        if (r1 instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) r1).A00.A0F(r32);
        }
        r32.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BringIntoViewRequesterElement) || !C18070vi.A18(this.A00, ((BringIntoViewRequesterElement) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public BringIntoViewRequesterElement(C16200rs r1) {
        this.A00 = r1;
    }
}
