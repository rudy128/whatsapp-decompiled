package androidx.compose.ui.input.rotary;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WA;
import X.C014908s;
import X.C18070vi;
import X.C22821Di;

public final class RotaryInputElement extends AnonymousClass0WA {
    public final C22821Di A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RotaryInputElement) && C18070vi.A18(this.A00, ((RotaryInputElement) obj).A00));
    }

    /* renamed from: A03 */
    public C014908s A01() {
        return new C014908s(this.A00);
    }

    /* renamed from: A04 */
    public void A02(C014908s r2) {
        r2.A0N(this.A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00);
    }

    public RotaryInputElement(C22821Di r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RotaryInputElement(onRotaryScrollEvent=");
        A10.append(this.A00);
        A10.append(", onPreRotaryScrollEvent=");
        return AnonymousClass001.A1F((Object) null, A10);
    }
}
