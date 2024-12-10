package X;

/* renamed from: X.6rm  reason: invalid class name and case insensitive filesystem */
public final class C135176rm {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135176rm) {
                C135176rm r5 = (C135176rm) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C135176rm(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public int hashCode() {
        return ((((38161 + C17900vP.A00(this.A00)) * 31) + C17900vP.A00(this.A01)) * 31) + C108955ca.A06(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A16(A10, "DeeplinkMetadataResponse(success=");
        A10.append(", deeplink=");
        A10.append(this.A00);
        A10.append(", fallback=");
        A10.append(this.A01);
        A10.append(", packageName=");
        return C17900vP.A0B(this.A02, A10);
    }
}
