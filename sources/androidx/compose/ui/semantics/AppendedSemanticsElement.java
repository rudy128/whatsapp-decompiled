package androidx.compose.ui.semantics;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09S;
import X.AnonymousClass0WA;
import X.C06370Yb;
import X.C17420ud;
import X.C18070vi;
import X.C22821Di;

public final class AppendedSemanticsElement extends AnonymousClass0WA implements C17420ud {
    public final C22821Di A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppendedSemanticsElement) {
                AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
                if (this.A01 != appendedSemanticsElement.A01 || !C18070vi.A18(this.A00, appendedSemanticsElement.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: A03 */
    public AnonymousClass09S A01() {
        return new AnonymousClass09S(this.A00, this.A01, false);
    }

    /* renamed from: A04 */
    public void A02(AnonymousClass09S r2) {
        r2.A00 = this.A01;
        r2.A0N(this.A00);
    }

    public C06370Yb BYw() {
        C06370Yb r1 = new C06370Yb();
        r1.A07(this.A01);
        this.A00.invoke(r1);
        return r1;
    }

    public int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return AnonymousClass000.A0O(this.A00, i * 31);
    }

    public AppendedSemanticsElement(C22821Di r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AppendedSemanticsElement(mergeDescendants=");
        A10.append(this.A01);
        A10.append(", properties=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
