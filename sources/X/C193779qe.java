package X;

/* renamed from: X.9qe  reason: invalid class name and case insensitive filesystem */
public final class C193779qe {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193779qe) {
                C193779qe r8 = (C193779qe) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass8BV.A00(this.A00) + C17900vP.A00(this.A01);
    }

    public C193779qe(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReferencedFileData(rowId=");
        A10.append(this.A00);
        A10.append(", filePath=");
        return C17900vP.A0B(this.A01, A10);
    }
}
