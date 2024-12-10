package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class AE6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final ADW A00;
    public final C20257ADp A01;
    public final List A02;
    public final List A03;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AE6) {
                AE6 ae6 = (AE6) obj;
                if (!C18070vi.A18(this.A03, ae6.A03) || !C18070vi.A18(this.A02, ae6.A02) || !C18070vi.A18(this.A01, ae6.A01) || !C18070vi.A18(this.A00, ae6.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r = C108985cd.A0r(parcel, list);
            while (A0r.hasNext()) {
                AnonymousClass8BU.A14(parcel, A0r, i);
            }
        }
        List list2 = this.A02;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r2 = C108985cd.A0r(parcel, list2);
            while (A0r2.hasNext()) {
                ((C20245ADd) A0r2.next()).writeToParcel(parcel, i);
            }
        }
        C20257ADp aDp = this.A01;
        if (aDp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aDp.writeToParcel(parcel, i);
        }
        ADW adw = this.A00;
        if (adw == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        adw.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return (((((AnonymousClass001.A0k(this.A03) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A00);
    }

    public AE6(ADW adw, C20257ADp aDp, List list, List list2) {
        this.A03 = list;
        this.A02 = list2;
        this.A01 = aDp;
        this.A00 = adw;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductVariantInfo(types=");
        A10.append(this.A03);
        A10.append(", properties=");
        A10.append(this.A02);
        A10.append(", listingDetails=");
        A10.append(this.A01);
        A10.append(", availability=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
