package X;

/* renamed from: X.CbH  reason: case insensitive filesystem */
public final class C25221CbH {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25221CbH)) {
            return false;
        }
        C25221CbH cbH = (C25221CbH) obj;
        return this.A00 == cbH.A00 && this.A04 == cbH.A04 && this.A03.equals(cbH.A03) && this.A02.equals(cbH.A02) && this.A01.equals(cbH.A01);
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = 0;
        if (this.A04) {
            i2 = 64;
        }
        return i + i2 + (this.A03.hashCode() * this.A02.hashCode() * this.A01.hashCode());
    }

    public String toString() {
        String str;
        String str2 = this.A03;
        String str3 = this.A02;
        String str4 = this.A01;
        int i = this.A00;
        if (this.A04) {
            str = " itf";
        } else {
            str = "";
        }
        StringBuilder A11 = AnonymousClass000.A11(str2);
        C17890vO.A10(".", str3, str4, A11);
        AnonymousClass000.A1E(" (", str, A11, i);
        return AnonymousClass8BU.A0q(A11);
    }

    public C25221CbH(String str, String str2, String str3, int i, boolean z) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = z;
    }
}
