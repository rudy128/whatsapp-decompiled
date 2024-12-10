package X;

/* renamed from: X.9rq  reason: invalid class name and case insensitive filesystem */
public final class C194509rq {
    public final long A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194509rq) {
                C194509rq r8 = (C194509rq) obj;
                if (!(this.A01 == r8.A01 && C18070vi.A18(this.A02, r8.A02) && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, (AnonymousClass8BV.A00(this.A01) + C17900vP.A00(this.A02)) * 31);
    }

    public C194509rq(long j, String str, long j2) {
        this.A01 = j;
        this.A02 = str;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PictureProcessingHelper(pictureId=");
        A10.append(this.A01);
        A10.append(", pictureDirectPath=");
        A10.append(this.A02);
        A10.append(", photoIdForWaContact=");
        return C17900vP.A0E(A10, this.A00);
    }
}
