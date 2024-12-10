package X;

import java.util.List;

/* renamed from: X.9rW  reason: invalid class name and case insensitive filesystem */
public final class C194309rW {
    public final List A00;
    public final boolean A01;
    public final C63572tK A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194309rW) {
                C194309rW r5 = (C194309rW) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A00)), this.A01);
    }

    public C194309rW(C63572tK r1, List list, boolean z) {
        this.A00 = list;
        this.A02 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CheckoutButtonsConfiguration(buttonConfigurationList=");
        A10.append(this.A00);
        A10.append(", paymentCountry=");
        A10.append(this.A02);
        A10.append(", displayVerticalButtons=");
        return C17900vP.A0F(A10, this.A01);
    }
}
