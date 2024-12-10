package X;

/* renamed from: X.9qW  reason: invalid class name and case insensitive filesystem */
public final class C193699qW {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193699qW) {
                C193699qW r8 = (C193699qW) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, C17880vN.A03(this.A01));
    }

    public C193699qW(String str, long j) {
        this.A01 = str;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallResponsiveData(callId=");
        A10.append(this.A01);
        A10.append(", durationMs=");
        return C17900vP.A0E(A10, this.A00);
    }
}
