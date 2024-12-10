package X;

/* renamed from: X.9sg  reason: invalid class name and case insensitive filesystem */
public final class C195029sg {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195029sg) {
                C195029sg r8 = (C195029sg) obj;
                if (!C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A02, r8.A02) || this.A01 != r8.A01 || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass001.A0K(this.A01, C17890vO.A02(this.A02, C17880vN.A03(this.A03))));
    }

    public C195029sg(long j, String str, long j2, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InternationalPaymentState(credentialId=");
        A10.append(this.A03);
        A10.append(", activationStatus=");
        A10.append(this.A02);
        A10.append(", startTime=");
        A10.append(this.A01);
        A10.append(", endTime=");
        return C17900vP.A0E(A10, this.A00);
    }
}
