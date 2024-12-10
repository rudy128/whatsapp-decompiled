package X;

import java.util.List;

/* renamed from: X.2lF  reason: invalid class name and case insensitive filesystem */
public class C58782lF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass4ZN A04;
    public AnonymousClass4ZN A05;
    public AnonymousClass4ZN A06;
    public AnonymousClass4ZN A07;
    public AnonymousClass4ZN A08;
    public String A09 = "";
    public List A0A = AnonymousClass000.A13();
    public List A0B = AnonymousClass000.A13();
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C58782lF r5 = (C58782lF) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A0D == r5.A0D && this.A0E == r5.A0E && this.A0F == r5.A0F && C42171xk.A00(this.A07, r5.A07) && C42171xk.A00(this.A0A, r5.A0A) && C42171xk.A00(this.A05, r5.A05) && C42171xk.A00(this.A04, r5.A04) && C42171xk.A00(this.A0B, r5.A0B) && C42171xk.A00(this.A06, r5.A06) && C42171xk.A00(this.A08, r5.A08) && C42171xk.A00(this.A09, r5.A09) && this.A03 == r5.A03 && this.A0G == r5.A0G && this.A0C == r5.A0C)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[17];
        AnonymousClass000.A1L(objArr, this.A00);
        AnonymousClass000.A1M(objArr, this.A01);
        objArr[2] = this.A0A;
        C17890vO.A1G(objArr, this.A02);
        objArr[4] = this.A05;
        objArr[5] = this.A04;
        objArr[6] = Boolean.valueOf(this.A0D);
        objArr[7] = Boolean.valueOf(this.A0E);
        objArr[8] = Boolean.valueOf(this.A0F);
        objArr[9] = this.A07;
        objArr[10] = this.A0B;
        objArr[11] = this.A08;
        objArr[12] = this.A06;
        objArr[13] = this.A09;
        objArr[14] = Integer.valueOf(this.A03);
        objArr[15] = Boolean.valueOf(this.A0G);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A0C), objArr, 16);
    }
}
