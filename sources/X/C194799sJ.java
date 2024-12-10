package X;

/* renamed from: X.9sJ  reason: invalid class name and case insensitive filesystem */
public final class C194799sJ {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194799sJ) {
                C194799sJ r8 = (C194799sJ) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03) || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, C17890vO.A02(this.A03, C17890vO.A02(this.A02, AnonymousClass8BV.A00(this.A00))));
    }

    public C194799sJ(long j, String str, long j2, String str2) {
        this.A00 = j;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DbBackupData(id=");
        A10.append(this.A00);
        A10.append(", accountName=");
        A10.append(this.A02);
        A10.append(", jidUser=");
        A10.append(this.A03);
        A10.append(", updateTime=");
        return C17900vP.A0E(A10, this.A01);
    }
}
