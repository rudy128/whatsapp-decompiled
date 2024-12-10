package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.ADh  reason: case insensitive filesystem */
public final class C20249ADh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String[] A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20249ADh) {
                C20249ADh aDh = (C20249ADh) obj;
                if (!C18070vi.A18(this.A00, aDh.A00) || !C18070vi.A18(this.A01, aDh.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeStringArray(this.A01);
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + Arrays.hashCode(this.A01);
    }

    public C20249ADh(String str, String[] strArr) {
        C18070vi.A0j(str, strArr);
        this.A00 = str;
        this.A01 = strArr;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentPredefinedFilter(query=");
        A10.append(this.A00);
        A10.append(", params=");
        return C17900vP.A0B(Arrays.toString(this.A01), A10);
    }
}
