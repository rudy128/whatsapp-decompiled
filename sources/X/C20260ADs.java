package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ADs  reason: case insensitive filesystem */
public final class C20260ADs implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final List A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20260ADs) {
                C20260ADs aDs = (C20260ADs) obj;
                if (!C18070vi.A18(this.A01, aDs.A01) || !C18070vi.A18(this.A00, aDs.A00) || !C18070vi.A18(this.A02, aDs.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        Iterator A0r = C108985cd.A0r(parcel, this.A02);
        while (A0r.hasNext()) {
            ((AE8) A0r.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, ((C17900vP.A00(this.A01) * 31) + C108955ca.A06(this.A00)) * 31);
    }

    public C20260ADs(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessHoursConfig(timeZone=");
        A10.append(this.A01);
        A10.append(", note=");
        A10.append(this.A00);
        A10.append(", configs=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
