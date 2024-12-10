package X;

/* renamed from: X.6qs  reason: invalid class name and case insensitive filesystem */
public final class C134616qs {
    public final int A00;
    public final String A01;

    public C134616qs(int i, String str) {
        C18070vi.A0d(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134616qs) {
                C134616qs r5 = (C134616qs) obj;
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImagineIntentsParams(numImages=");
        A10.append(this.A00);
        A10.append(", prompt=");
        return C17900vP.A0B(this.A01, A10);
    }
}
