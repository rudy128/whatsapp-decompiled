package X;

/* renamed from: X.9sI  reason: invalid class name and case insensitive filesystem */
public final class C194789sI {
    public final C19990A2d A00;
    public final C179529Ii A01;
    public final String A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194789sI) {
                C194789sI r8 = (C194789sI) obj;
                if (!C18070vi.A18(this.A00, r8.A00) || this.A03 != r8.A03 || this.A01 != r8.A01 || !C18070vi.A18(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, AnonymousClass001.A0K(this.A03, AnonymousClass000.A0L(this.A00))) + C17900vP.A00(this.A02);
    }

    public C194789sI(C19990A2d a2d, C179529Ii r2, String str, long j) {
        this.A00 = a2d;
        this.A03 = j;
        this.A01 = r2;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CachedRemoteFile(remoteFile=");
        A10.append(this.A00);
        A10.append(", backupId=");
        A10.append(this.A03);
        A10.append(", state=");
        A10.append(this.A01);
        A10.append(", transactionId=");
        return C17900vP.A0B(this.A02, A10);
    }
}
