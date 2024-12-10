package X;

import java.util.ArrayList;

/* renamed from: X.Cb0  reason: case insensitive filesystem */
public final class C25207Cb0 {
    public final C25765Clc A00;
    public final A2U A01;
    public final String A02;
    public final ArrayList A03;

    public C25207Cb0(C25765Clc clc, A2U a2u, String str, ArrayList arrayList) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A03 = arrayList;
        this.A01 = a2u;
        this.A00 = clc;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25207Cb0) {
                C25207Cb0 cb0 = (C25207Cb0) obj;
                if (!C18070vi.A18(this.A02, cb0.A02) || !C18070vi.A18(this.A03, cb0.A03) || !C18070vi.A18(this.A01, cb0.A01) || !C18070vi.A18(this.A00, cb0.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C17880vN.A03(this.A02) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoErrorValue(message=");
        A10.append(this.A02);
        A10.append(", locations=");
        A10.append(this.A03);
        A10.append(", path=");
        A10.append(this.A01);
        A10.append(", extensions=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
