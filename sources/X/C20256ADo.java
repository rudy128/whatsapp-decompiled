package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ADo  reason: case insensitive filesystem */
public final class C20256ADo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C20256ADo(String str, List list, boolean z) {
        C18070vi.A0d(str, 2);
        this.A02 = z;
        this.A00 = str;
        this.A01 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20256ADo) {
                C20256ADo aDo = (C20256ADo) obj;
                if (this.A02 != aDo.A02 || !C18070vi.A18(this.A00, aDo.A00) || !C18070vi.A18(this.A01, aDo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeString(this.A00);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0r = C108985cd.A0r(parcel, list);
        while (A0r.hasNext()) {
            ((C20245ADd) A0r.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return C17890vO.A02(this.A00, AnonymousClass3MX.A03(this.A02)) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductVariantAvailabilityListing(isAvailable=");
        A10.append(this.A02);
        A10.append(", productId=");
        A10.append(this.A00);
        A10.append(", options=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
