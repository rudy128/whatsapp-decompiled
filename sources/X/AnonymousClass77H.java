package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.77H  reason: invalid class name */
public final class AnonymousClass77H implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    public final boolean A00() {
        String str = this.A02;
        if (str != null && str.length() != 0) {
            return false;
        }
        String str2 = this.A01;
        if (str2 != null && str2.length() != 0) {
            return false;
        }
        String str3 = this.A04;
        if (str3 == null || str3.length() == 0) {
            return true;
        }
        return false;
    }

    public final byte[] A01() {
        String str = this.A04;
        if (!(str == null || str.length() == 0)) {
            try {
                return Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                Log.e((Throwable) e);
            }
        }
        return null;
    }

    public AnonymousClass77H(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    public String toString() {
        Object obj;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShopEntityMetaData(id='");
        A10.append(this.A00);
        A10.append("', title='");
        A10.append(this.A02);
        A10.append("', subTitle='");
        A10.append(this.A01);
        A10.append("', imageUrl='");
        A10.append(this.A03);
        A10.append("', thumbBase64Encoded='");
        String str = this.A04;
        if (str != null) {
            obj = Integer.valueOf(str.length());
        } else {
            obj = "null";
        }
        A10.append(obj);
        return AnonymousClass000.A0y("')", A10);
    }
}
