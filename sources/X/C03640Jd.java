package X;

/* renamed from: X.0Jd  reason: invalid class name and case insensitive filesystem */
public final class C03640Jd {
    public final Object A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C03640Jd) {
                C03640Jd r5 = (C03640Jd) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0l;
        int hashCode;
        Object obj = this.A00;
        if (obj instanceof Enum) {
            A0l = ((Enum) obj).ordinal();
        } else {
            A0l = AnonymousClass001.A0l(obj);
        }
        int i = A0l * 31;
        Object obj2 = this.A01;
        if (obj2 instanceof Enum) {
            hashCode = ((Enum) obj2).ordinal();
        } else {
            hashCode = obj2.hashCode();
        }
        return i + hashCode;
    }

    public C03640Jd(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("JoinedKey(left=");
        A10.append(this.A00);
        A10.append(", right=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
