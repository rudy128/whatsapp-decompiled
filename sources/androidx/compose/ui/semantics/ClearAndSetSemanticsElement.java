package androidx.compose.ui.semantics;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09S;
import X.AnonymousClass0WA;
import X.C06370Yb;
import X.C17420ud;
import X.C18070vi;
import X.C22821Di;

public final class ClearAndSetSemanticsElement extends AnonymousClass0WA implements C17420ud {
    public final C22821Di A00;

    /* renamed from: A03 */
    public AnonymousClass09S A01() {
        return new AnonymousClass09S(this.A00, false, true);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ClearAndSetSemanticsElement) && C18070vi.A18(this.A00, ((ClearAndSetSemanticsElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    /* renamed from: A04 */
    public void A02(AnonymousClass09S r2) {
        r2.A0N(this.A00);
    }

    public C06370Yb BYw() {
        C06370Yb r1 = new C06370Yb();
        r1.A07(false);
        r1.A06(true);
        this.A00.invoke(r1);
        return r1;
    }

    public ClearAndSetSemanticsElement(C22821Di r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ClearAndSetSemanticsElement(properties=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
