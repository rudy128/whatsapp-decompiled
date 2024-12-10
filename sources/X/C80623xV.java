package X;

/* renamed from: X.3xV  reason: invalid class name and case insensitive filesystem */
public class C80623xV extends C88344Zh {
    public boolean A00;

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && this.A00 == ((C80623xV) obj).A00;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, super.hashCode());
        return AnonymousClass000.A0P(Boolean.valueOf(this.A00), A1b, 1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(super.toString());
        A10.append(", isSyncing: ");
        return AnonymousClass3MY.A0r(A10, this.A00);
    }
}
