package X;

import android.content.ComponentName;

/* renamed from: X.CZc  reason: case insensitive filesystem */
public final class C25129CZc {
    public final C25148CZz A00;

    public C25129CZc(ComponentName componentName) {
        C18070vi.A0d(componentName, 1);
        C25148CZz cZz = new C25148CZz(componentName);
        this.A00 = cZz;
        C26129Csr.A00(cZz.A01, cZz.A00);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25129CZc) && C18070vi.A18(this.A00, ((C25129CZc) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ActivityFilter(componentName=");
        A10.append(this.A00);
        A10.append(", intentAction=");
        return C17900vP.A0B((String) null, A10);
    }
}
