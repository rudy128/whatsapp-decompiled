package androidx.compose.ui.draw;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WA;
import X.C015508y;
import X.C18070vi;
import X.C22821Di;

public final class DrawBehindElement extends AnonymousClass0WA {
    public final C22821Di A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DrawBehindElement) && C18070vi.A18(this.A00, ((DrawBehindElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    /* renamed from: A03 */
    public C015508y A01() {
        return new C015508y(this.A00);
    }

    /* renamed from: A04 */
    public void A02(C015508y r2) {
        r2.A0N(this.A00);
    }

    public DrawBehindElement(C22821Di r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DrawBehindElement(onDraw=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
