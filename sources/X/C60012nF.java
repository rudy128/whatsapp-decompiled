package X;

/* renamed from: X.2nF  reason: invalid class name and case insensitive filesystem */
public class C60012nF {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C60012nF r5 = (C60012nF) obj;
            if (this.A03 != r5.A03 || this.A00 != r5.A00 || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = Boolean.valueOf(this.A03);
        AnonymousClass000.A1M(objArr, this.A00);
        objArr[2] = this.A01;
        return AnonymousClass000.A0P(this.A02, objArr, 3);
    }

    public void A00() {
        if (!this.A03) {
            throw new SecurityException(toString());
        }
    }

    public String toString() {
        String str;
        boolean z = this.A03;
        StringBuilder A10 = AnonymousClass000.A10();
        if (z) {
            str = "Trusted callers: uid=";
        } else {
            str = "Untrusted caller: uid=";
        }
        A10.append(str);
        A10.append(this.A00);
        A10.append(", package=");
        A10.append(this.A01);
        A10.append(", signature=");
        return AnonymousClass000.A0y(this.A02, A10);
    }

    public C60012nF(String str, String str2, int i, boolean z) {
        this.A03 = z;
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
