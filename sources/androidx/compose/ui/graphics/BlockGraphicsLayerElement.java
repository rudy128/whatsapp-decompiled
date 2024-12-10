package androidx.compose.ui.graphics;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09B;
import X.AnonymousClass0WA;
import X.C18070vi;
import X.C22821Di;

public final class BlockGraphicsLayerElement extends AnonymousClass0WA {
    public final C22821Di A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BlockGraphicsLayerElement) && C18070vi.A18(this.A00, ((BlockGraphicsLayerElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    /* renamed from: A03 */
    public AnonymousClass09B A01() {
        return new AnonymousClass09B(this.A00);
    }

    /* renamed from: A04 */
    public void A02(AnonymousClass09B r2) {
        r2.A0P(this.A00);
        r2.A0O();
    }

    public BlockGraphicsLayerElement(C22821Di r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BlockGraphicsLayerElement(block=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
