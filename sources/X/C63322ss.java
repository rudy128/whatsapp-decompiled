package X;

/* renamed from: X.2ss  reason: invalid class name and case insensitive filesystem */
public class C63322ss {
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass206 A05;

    public C63322ss(AnonymousClass206 r6) {
        this.A05 = r6;
        this.A04 = null;
        this.A00 = 0;
        this.A01 = Long.MAX_VALUE;
        this.A03 = null;
        this.A02 = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63322ss)) {
            return false;
        }
        C63322ss r7 = (C63322ss) obj;
        return C42171xk.A00(this.A05, r7.A05) && C42171xk.A00(this.A04, r7.A04) && this.A00 == r7.A00 && this.A01 == r7.A01 && C42171xk.A00(this.A03, r7.A03) && C42171xk.A00(this.A02, r7.A02);
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A05;
        objArr[1] = this.A04;
        C17890vO.A1N(objArr, this.A00);
        C17890vO.A1O(objArr, this.A01);
        objArr[4] = this.A03;
        return AnonymousClass000.A0P(this.A02, objArr, 5);
    }

    public boolean A00() {
        String str;
        AnonymousClass206 r1 = this.A05;
        if (r1 instanceof AnonymousClass21V) {
            str = ((AnonymousClass21V) r1).A07;
        } else {
            str = null;
        }
        if (AnonymousClass21V.A0A(str) || this.A04 != null) {
            return false;
        }
        return true;
    }

    public boolean A01(long j) {
        long j2 = this.A01;
        if (j2 == Long.MAX_VALUE) {
            if (j > this.A00) {
                return true;
            }
            return false;
        } else if (j2 + 86400000 < j) {
            return true;
        } else {
            return false;
        }
    }

    public C63322ss(AnonymousClass206 r3, String str, String str2, String str3, long j) {
        this.A05 = r3;
        this.A04 = str;
        this.A00 = j;
        this.A01 = Long.MAX_VALUE;
        this.A03 = str2;
        this.A02 = str3;
    }

    public C63322ss(AnonymousClass206 r4, String str, long j) {
        this.A05 = r4;
        this.A04 = str;
        this.A00 = j;
        this.A01 = Long.MAX_VALUE;
        this.A03 = null;
        this.A02 = null;
    }
}
