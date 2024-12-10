package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4SP  reason: invalid class name */
public class AnonymousClass4SP {
    public final int A00;
    public final UserJid A01;
    public final AnonymousClass206 A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4SP r5 = (AnonymousClass4SP) obj;
            if (!(this.A07 == r5.A07 && this.A09 == r5.A09 && this.A04 == r5.A04 && this.A06 == r5.A06 && this.A08 == r5.A08 && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A02.equals(r5.A02) && C42171xk.A00(this.A01, r5.A01) && this.A05 == r5.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[12];
        objArr[0] = this.A02;
        objArr[1] = Boolean.valueOf(this.A07);
        objArr[2] = Boolean.valueOf(this.A09);
        objArr[3] = Boolean.valueOf(this.A04);
        AnonymousClass3Ma.A1T(objArr, -1);
        objArr[5] = Boolean.valueOf(this.A06);
        objArr[6] = Boolean.valueOf(this.A08);
        objArr[7] = Boolean.valueOf(this.A03);
        objArr[8] = AnonymousClass000.A0h();
        objArr[9] = Integer.valueOf(this.A00);
        objArr[10] = this.A01;
        return AnonymousClass000.A0P(Boolean.valueOf(this.A05), objArr, 11);
    }

    public AnonymousClass4SP(UserJid userJid, AnonymousClass206 r2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A02 = r2;
        this.A07 = z;
        this.A09 = z2;
        this.A04 = z3;
        this.A06 = z4;
        this.A08 = z5;
        this.A03 = z6;
        this.A00 = i;
        this.A01 = userJid;
        this.A05 = z7;
    }
}
