package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

public class ADV implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public A6S A01;
    public BigDecimal A02;
    public final int A03;
    public final AE6 A04;
    public final C20246ADe A05;
    public final String A06;
    public final String A07;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            ADV adv = (ADV) obj;
            if (this.A00 != adv.A00 || this.A03 != adv.A03 || !C18070vi.A18(this.A07, adv.A07) || !C18070vi.A18(this.A06, adv.A06) || !C42171xk.A00(this.A02, adv.A02) || !C42171xk.A00(this.A01, adv.A01) || !C42171xk.A00(this.A05, adv.A05) || !C42171xk.A00(this.A04, adv.A04)) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeSerializable(this.A02);
        A6S a6s = this.A01;
        if (a6s != null) {
            str = a6s.A00;
        } else {
            str = null;
        }
        parcel.writeString(str);
        C20246ADe aDe = this.A05;
        if (aDe == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aDe.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeParcelable(this.A04, i);
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A07;
        objArr[1] = this.A06;
        objArr[2] = this.A02;
        objArr[3] = this.A01;
        objArr[4] = this.A05;
        AnonymousClass3Ma.A1U(objArr, this.A00);
        C17890vO.A1H(objArr, this.A03);
        return AnonymousClass000.A0P(this.A04, objArr, 7);
    }

    public ADV(AE6 ae6, C20246ADe aDe, A6S a6s, String str, String str2, BigDecimal bigDecimal, int i, int i2) {
        C18070vi.A0j(str, str2);
        this.A07 = str;
        this.A06 = str2;
        this.A02 = bigDecimal;
        this.A01 = a6s;
        this.A05 = aDe;
        this.A00 = i;
        this.A03 = i2;
        this.A04 = ae6;
    }
}
