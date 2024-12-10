package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ADx  reason: case insensitive filesystem */
public final class C20265ADx implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final List A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20265ADx) {
                C20265ADx aDx = (C20265ADx) obj;
                if (!C18070vi.A18(this.A02, aDx.A02) || !C18070vi.A18(this.A00, aDx.A00) || !C18070vi.A18(this.A01, aDx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        Iterator A0r = C108985cd.A0r(parcel, this.A01);
        while (A0r.hasNext()) {
            ((C20264ADw) A0r.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, C17890vO.A02(this.A00, C17880vN.A03(this.A02)));
    }

    public C20265ADx(String str, String str2, List list) {
        C18070vi.A0j(str, str2);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InstallmentOptions(paymentMethod=");
        A10.append(this.A02);
        A10.append(", cardNetwork=");
        A10.append(this.A00);
        A10.append(", installments=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
