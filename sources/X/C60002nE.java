package X;

/* renamed from: X.2nE  reason: invalid class name and case insensitive filesystem */
public class C60002nE {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;

    public String[] A00() {
        return new String[]{this.A03, String.valueOf(this.A01), String.valueOf(this.A00)};
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C60002nE)) {
            return false;
        }
        C60002nE r4 = (C60002nE) obj;
        return this.A03.equals(r4.A03) && this.A01 == r4.A01 && this.A00 == r4.A00 && this.A02 == r4.A02;
    }

    public int hashCode() {
        String str;
        int A032 = (((C17880vN.A03(this.A03) + this.A00) * 31) + this.A01) * 31;
        int intValue = this.A02.intValue();
        if (1 != intValue) {
            str = "REGULAR";
        } else {
            str = "ADVANCED";
        }
        return A032 + str.hashCode() + intValue;
    }

    public C60002nE(Integer num, String str, int i, int i2) {
        this.A03 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = num;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(AnonymousClass1EG.A0B(this.A03, 4));
        A10.append(":");
        A10.append(this.A00);
        A10.append(":");
        A10.append(this.A01);
        A10.append(":");
        Integer num = this.A02;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "REGULAR";
        } else {
            str = "ADVANCED";
        }
        return AnonymousClass000.A0y(str, A10);
    }
}
