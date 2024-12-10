package X;

/* renamed from: X.9s8  reason: invalid class name and case insensitive filesystem */
public final class C194689s8 {
    public final long A00;
    public final long A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194689s8) {
                C194689s8 r8 = (C194689s8) obj;
                if (!(this.A02 == r8.A02 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, AnonymousClass001.A0K(this.A00, AnonymousClass8BV.A00(this.A02)));
    }

    public C194689s8(long j, long j2, long j3) {
        this.A02 = j;
        this.A00 = j2;
        this.A01 = j3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SessionDuration(sessionTotalTime=");
        A10.append(this.A02);
        A10.append(", sessionBackgroundTime=");
        A10.append(this.A00);
        A10.append(", sessionForegroundTime=");
        return C17900vP.A0E(A10, this.A01);
    }
}
