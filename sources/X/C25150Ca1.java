package X;

import android.content.ComponentName;

/* renamed from: X.Ca1  reason: case insensitive filesystem */
public final class C25150Ca1 {
    public final C25148CZz A00;
    public final C25148CZz A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.window.embedding.SplitPairFilter");
                C25150Ca1 ca1 = (C25150Ca1) obj;
                if (!C18070vi.A18(this.A00, ca1.A00) || !C18070vi.A18(this.A01, ca1.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C25150Ca1(ComponentName componentName, ComponentName componentName2) {
        C18070vi.A0j(componentName, componentName2);
        C25148CZz cZz = new C25148CZz(componentName);
        C25148CZz cZz2 = new C25148CZz(componentName2);
        this.A00 = cZz;
        this.A01 = cZz2;
        C26129Csr.A00(cZz.A01, cZz.A00);
        C26129Csr.A00(cZz2.A01, cZz2.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SplitPairFilter{primaryActivityName=");
        C25148CZz cZz = this.A00;
        A10.append(new ComponentName(cZz.A01, cZz.A00));
        A10.append(", secondaryActivityName=");
        C25148CZz cZz2 = this.A01;
        A10.append(new ComponentName(cZz2.A01, cZz2.A00));
        C108975cc.A17(A10, ", secondaryActivityAction=");
        return C17890vO.A0b(A10);
    }
}
