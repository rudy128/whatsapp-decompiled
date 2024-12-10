package androidx.compose.animation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09D;
import X.AnonymousClass0KK;
import X.AnonymousClass0KL;
import X.AnonymousClass0Q5;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C15980rW;
import X.C18070vi;

public final class EnterExitTransitionElement extends AnonymousClass0WA {
    public AnonymousClass0KK A00;
    public AnonymousClass0KL A01;
    public C15980rW A02;
    public final AnonymousClass0Q5 A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EnterExitTransitionElement) {
                EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
                if (!C18070vi.A18(this.A03, enterExitTransitionElement.A03) || !C18070vi.A18(this.A00, enterExitTransitionElement.A00) || !C18070vi.A18(this.A01, enterExitTransitionElement.A01) || !C18070vi.A18(this.A02, enterExitTransitionElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        return new AnonymousClass09D(this.A00, this.A01, this.A02, this.A03);
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        AnonymousClass09D r22 = (AnonymousClass09D) r2;
        r22.A03 = this.A03;
        r22.A00 = this.A00;
        r22.A01 = this.A01;
        r22.A02 = this.A02;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A03) * 31 * 31 * 31)));
    }

    public EnterExitTransitionElement(AnonymousClass0KK r1, AnonymousClass0KL r2, C15980rW r3, AnonymousClass0Q5 r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EnterExitTransitionElement(transition=");
        A10.append(this.A03);
        AnonymousClass000.A1G(A10, ", sizeAnimation=");
        AnonymousClass000.A1G(A10, ", offsetAnimation=");
        AnonymousClass000.A1G(A10, ", slideAnimation=");
        A10.append(", enter=");
        A10.append(this.A00);
        A10.append(", exit=");
        A10.append(this.A01);
        A10.append(", graphicsLayerBlock=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
