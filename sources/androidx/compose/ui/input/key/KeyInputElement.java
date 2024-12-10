package androidx.compose.ui.input.key;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WA;
import X.C014808q;
import X.C18070vi;
import X.C22821Di;

public final class KeyInputElement extends AnonymousClass0WA {
    public final C22821Di A00;
    public final C22821Di A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KeyInputElement) {
                KeyInputElement keyInputElement = (KeyInputElement) obj;
                if (!C18070vi.A18(this.A00, keyInputElement.A00) || !C18070vi.A18(this.A01, keyInputElement.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: A03 */
    public C014808q A01() {
        return new C014808q(this.A00, this.A01);
    }

    /* renamed from: A04 */
    public void A02(C014808q r2) {
        r2.A0N(this.A00);
        r2.A0O(this.A01);
    }

    public int hashCode() {
        int i = 0;
        int A0k = AnonymousClass001.A0k(this.A00) * 31;
        C22821Di r0 = this.A01;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return A0k + i;
    }

    public KeyInputElement(C22821Di r1, C22821Di r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("KeyInputElement(onKeyEvent=");
        A10.append(this.A00);
        A10.append(", onPreKeyEvent=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
