package androidx.compose.ui.draw;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WA;
import X.C015608z;
import X.C18070vi;
import X.C22821Di;

public final class DrawWithContentElement extends AnonymousClass0WA {
    public final C22821Di A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DrawWithContentElement) && C18070vi.A18(this.A00, ((DrawWithContentElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    /* renamed from: A03 */
    public C015608z A01() {
        return new C015608z(this.A00);
    }

    /* renamed from: A04 */
    public void A02(C015608z r2) {
        r2.A0N(this.A00);
    }

    public DrawWithContentElement(C22821Di r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DrawWithContentElement(onDraw=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
