package X;

/* renamed from: X.0U4  reason: invalid class name */
public final class AnonymousClass0U4 implements C16580sf {
    public final Object A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (obj instanceof C16580sf) {
            C16580sf r3 = (C16580sf) obj;
            if (!C18070vi.A18(this.A00, r3.BSw()) || !C18070vi.A18(this.A01, r3.BaC())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int A0l = AnonymousClass001.A0l(this.A00) * 31;
        Object obj = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        }
        return A0l + i;
    }

    public AnonymousClass0U4(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public Object BSw() {
        return this.A00;
    }

    public Object BaC() {
        return this.A01;
    }
}
