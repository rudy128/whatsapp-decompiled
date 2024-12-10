package X;

/* renamed from: X.9px  reason: invalid class name and case insensitive filesystem */
public final class C193359px {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193359px) {
                C193359px r5 = (C193359px) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, this.A00 * 31);
    }

    public C193359px(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PackageDownloadResponse(revision=");
        A10.append(this.A00);
        A10.append(", cdnUri=");
        return C17900vP.A0B(this.A01, A10);
    }
}
