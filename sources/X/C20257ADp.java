package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.ADp  reason: case insensitive filesystem */
public final class C20257ADp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final BigDecimal A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20257ADp) {
                C20257ADp aDp = (C20257ADp) obj;
                if (!C18070vi.A18(this.A00, aDp.A00) || this.A02 != aDp.A02 || !C18070vi.A18(this.A01, aDp.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeSerializable(this.A01);
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(C17900vP.A00(this.A00) * 31, this.A02) + C17880vN.A02(this.A01);
    }

    public C20257ADp(String str, BigDecimal bigDecimal, boolean z) {
        this.A00 = str;
        this.A02 = z;
        this.A01 = bigDecimal;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductVariantListingDetails(description=");
        A10.append(this.A00);
        A10.append(", multiPrice=");
        A10.append(this.A02);
        A10.append(", lowestPrice=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
