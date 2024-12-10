package X;

import java.util.List;

/* renamed from: X.0Jt  reason: invalid class name */
public final class AnonymousClass0Jt {
    public final AnonymousClass0sU A00;
    public final Object A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0Jt) {
                AnonymousClass0Jt r5 = (AnonymousClass0Jt) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0k = ((AnonymousClass001.A0k(this.A00) * 31) + AnonymousClass001.A0k(this.A01)) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return A0k + i;
    }

    public AnonymousClass0Jt(AnonymousClass0sU r1, Object obj, List list) {
        this.A00 = r1;
        this.A01 = obj;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ResolveResult(resolvedNode=");
        A10.append(this.A00);
        A10.append(", resolvedState=");
        A10.append(this.A01);
        A10.append(", appliedStateUpdates=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
