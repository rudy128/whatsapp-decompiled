package androidx.compose.ui.draw;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WA;
import X.C014408m;
import X.C06320Xv;
import X.C18070vi;
import X.C22821Di;

public final class DrawWithCacheElement extends AnonymousClass0WA {
    public final C22821Di A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DrawWithCacheElement) && C18070vi.A18(this.A00, ((DrawWithCacheElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    /* renamed from: A03 */
    public C014408m A01() {
        return new C014408m(new C06320Xv(), this.A00);
    }

    /* renamed from: A04 */
    public void A02(C014408m r2) {
        r2.A0O(this.A00);
    }

    public DrawWithCacheElement(C22821Di r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DrawWithCacheElement(onBuildDrawCache=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
