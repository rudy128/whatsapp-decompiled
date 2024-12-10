package androidx.compose.foundation.layout;

import X.AnonymousClass000;
import X.AnonymousClass09A;
import X.AnonymousClass0WA;
import X.AnonymousClass1OS;
import X.C18070vi;

public final class WrapContentElement extends AnonymousClass0WA {
    public final Integer A00;
    public final Object A01;
    public final AnonymousClass1OS A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                WrapContentElement wrapContentElement = (WrapContentElement) obj;
                if (this.A00 != wrapContentElement.A00 || !C18070vi.A18(this.A01, wrapContentElement.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: A03 */
    public AnonymousClass09A A01() {
        return new AnonymousClass09A(this.A00, this.A02);
    }

    /* renamed from: A04 */
    public void A02(AnonymousClass09A r2) {
        r2.A00 = this.A00;
        r2.A0O(this.A02);
    }

    public int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "Vertical";
                break;
            case 1:
                str = "Horizontal";
                break;
            default:
                str = "Both";
                break;
        }
        return AnonymousClass000.A0O(this.A01, (((str.hashCode() + intValue) * 31) + 1237) * 31);
    }

    public WrapContentElement(Integer num, Object obj, AnonymousClass1OS r3) {
        this.A00 = num;
        this.A02 = r3;
        this.A01 = obj;
    }
}
