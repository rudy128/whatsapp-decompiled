package X;

/* renamed from: X.6rS  reason: invalid class name and case insensitive filesystem */
public final class C134976rS {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134976rS) {
                C134976rS r5 = (C134976rS) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17880vN.A03(this.A00) * 31) + C108955ca.A06(this.A01);
    }

    public C134976rS(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LottieUnzipResult(animation=");
        A10.append(this.A00);
        C108975cc.A17(A10, ", trustToken=");
        A10.append(", metadata=");
        return C17900vP.A0B(this.A01, A10);
    }
}
