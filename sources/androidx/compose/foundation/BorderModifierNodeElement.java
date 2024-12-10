package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0AT;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C03380Hv;
import X.C16370s9;
import X.C18070vi;
import X.DSH;

public final class BorderModifierNodeElement extends AnonymousClass0WA {
    public final float A00;
    public final C03380Hv A01;
    public final C16370s9 A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BorderModifierNodeElement) {
                BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
                if (!AnonymousClass000.A1P(Float.compare(this.A00, borderModifierNodeElement.A00)) || !C18070vi.A18(this.A01, borderModifierNodeElement.A01) || !C18070vi.A18(this.A02, borderModifierNodeElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        return new AnonymousClass0AT(this.A01, this.A02, this.A00);
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r3) {
        AnonymousClass0AT r32 = (AnonymousClass0AT) r3;
        float f = this.A00;
        if (!AnonymousClass000.A1P(Float.compare(r32.A00, f))) {
            r32.A00 = f;
            r32.A04.Bdm();
        }
        r32.A0O(this.A01);
        r32.A0P(this.A02);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A05(this.A00)));
    }

    public BorderModifierNodeElement(C03380Hv r1, C16370s9 r2, float f) {
        this.A00 = f;
        this.A01 = r1;
        this.A02 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BorderModifierNodeElement(width=");
        A10.append(DSH.A01(this.A00));
        A10.append(", brush=");
        A10.append(this.A01);
        A10.append(", shape=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
