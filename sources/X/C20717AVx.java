package X;

/* renamed from: X.AVx  reason: case insensitive filesystem */
public final class C20717AVx implements B5K {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20717AVx) {
                C20717AVx aVx = (C20717AVx) obj;
                if (!C18070vi.A18(this.A00, aVx.A00) || !C18070vi.A18(this.A01, aVx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17900vP.A00(this.A00) * 31) + C108955ca.A06(this.A01);
    }

    public C20717AVx(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingHsmValues(hsmCategory=");
        A10.append(this.A00);
        A10.append(", hsmTag=");
        return C17900vP.A0B(this.A01, A10);
    }
}
