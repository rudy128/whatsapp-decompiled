package X;

/* renamed from: X.2lg  reason: invalid class name and case insensitive filesystem */
public final class C59052lg {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59052lg) {
                C59052lg r8 = (C59052lg) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0I(this.A01) * 31);
    }

    public C59052lg(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterEditMetaNode(newsletterOriginalMessageMs=");
        A10.append(this.A01);
        A10.append(", newsletterMessageEditMs=");
        return C17900vP.A0E(A10, this.A00);
    }
}
