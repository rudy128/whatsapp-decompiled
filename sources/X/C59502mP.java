package X;

/* renamed from: X.2mP  reason: invalid class name and case insensitive filesystem */
public final class C59502mP {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59502mP) {
                C59502mP r8 = (C59502mP) obj;
                if (!(this.A00 == r8.A00 && this.A03 == r8.A03 && this.A01 == r8.A01 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A02, AnonymousClass001.A0K(this.A01, AnonymousClass001.A0K(this.A03, AnonymousClass000.A0I(this.A00) * 31)));
    }

    public C59502mP(long j, long j2, long j3, long j4) {
        this.A00 = j;
        this.A03 = j2;
        this.A01 = j3;
        this.A02 = j4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GoogleBackupStats(mediaSize=");
        A10.append(this.A00);
        A10.append(", timestamp=");
        A10.append(this.A03);
        A10.append(", messageRowId=");
        A10.append(this.A01);
        A10.append(", premiumMessageRowId=");
        return C17900vP.A0E(A10, this.A02);
    }
}
