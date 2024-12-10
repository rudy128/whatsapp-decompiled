package androidx.compose.ui.input.pointer;

import X.AnonymousClass001;
import X.AnonymousClass09X;
import X.AnonymousClass0WA;
import X.AnonymousClass1OS;
import X.C18070vi;

public final class SuspendPointerInputElement extends AnonymousClass0WA {
    public final Object A00;
    public final Object A01;
    public final AnonymousClass1OS A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SuspendPointerInputElement) {
                SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
                if (!C18070vi.A18(this.A00, suspendPointerInputElement.A00) || !C18070vi.A18(this.A01, suspendPointerInputElement.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: A03 */
    public AnonymousClass09X A01() {
        return new AnonymousClass09X(this.A02);
    }

    /* renamed from: A04 */
    public void A02(AnonymousClass09X r2) {
        r2.A0P(this.A02);
    }

    public int hashCode() {
        return ((AnonymousClass001.A0l(this.A00) * 31) + AnonymousClass001.A0l(this.A01)) * 31;
    }

    public SuspendPointerInputElement(Object obj, Object obj2, AnonymousClass1OS r3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = r3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, AnonymousClass1OS r5, int i) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, r5);
    }
}
