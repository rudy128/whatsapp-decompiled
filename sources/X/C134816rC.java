package X;

/* renamed from: X.6rC  reason: invalid class name and case insensitive filesystem */
public final class C134816rC {
    public final C134806rB A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134816rC) {
                C134816rC r5 = (C134816rC) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A00) * 31) + C108955ca.A06(this.A01);
    }

    public C134816rC(C134806rB r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserContent(caption=");
        A10.append(this.A00);
        A10.append(", otid=");
        return C17900vP.A0B(this.A01, A10);
    }
}
