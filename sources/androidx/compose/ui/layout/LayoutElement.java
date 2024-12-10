package androidx.compose.ui.layout;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass098;
import X.AnonymousClass0WA;
import X.C18070vi;
import X.C36001nB;

public final class LayoutElement extends AnonymousClass0WA {
    public final C36001nB A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LayoutElement) && C18070vi.A18(this.A00, ((LayoutElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    /* renamed from: A03 */
    public AnonymousClass098 A01() {
        return new AnonymousClass098(this.A00);
    }

    /* renamed from: A04 */
    public void A02(AnonymousClass098 r2) {
        r2.A0N(this.A00);
    }

    public LayoutElement(C36001nB r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LayoutElement(measure=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
