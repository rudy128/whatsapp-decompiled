package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class AES implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public boolean A01;
    public final AEV A02;
    public final String A03;
    public final List A04;

    public AES(AEV aev, String str, List list, int i, boolean z) {
        C18070vi.A0d(str, 1);
        this.A03 = str;
        this.A04 = list;
        this.A02 = aev;
        this.A00 = i;
        this.A01 = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AES) {
                AES aes = (AES) obj;
                if (!C18070vi.A18(this.A03, aes.A03) || !C18070vi.A18(this.A04, aes.A04) || !C18070vi.A18(this.A02, aes.A02) || this.A00 != aes.A00 || this.A01 != aes.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A03);
        List list = this.A04;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r = C108985cd.A0r(parcel, list);
            while (A0r.hasNext()) {
                ((AEV) A0r.next()).writeToParcel(parcel, i);
            }
        }
        AEV aev = this.A02;
        if (aev == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aev.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final AEV A00() {
        List<AEV> list = this.A04;
        if (list == null) {
            return null;
        }
        AEV aev = this.A02;
        if (aev != null) {
            return aev;
        }
        int i = 0;
        for (AEV aev2 : list) {
            int i2 = i + 1;
            int i3 = this.A00;
            if (i3 != -1 && i == i3) {
                return aev2;
            }
            i = i2;
        }
        for (AEV aev3 : list) {
            if (aev3.A0B) {
                return aev3;
            }
        }
        return (AEV) C29431cG.A0c(list);
    }

    public int hashCode() {
        return C17880vN.A01((((((C17880vN.A03(this.A03) + AnonymousClass001.A0k(this.A04)) * 31) + C17880vN.A02(this.A02)) * 31) + this.A00) * 31, this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShippingInfo(country=");
        A10.append(this.A03);
        A10.append(", addressDataList=");
        A10.append(this.A04);
        A10.append(", selectedAddress=");
        A10.append(this.A02);
        A10.append(", selectedAddressId=");
        A10.append(this.A00);
        A10.append(", showError=");
        return C17900vP.A0F(A10, this.A01);
    }
}
