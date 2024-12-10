package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADg  reason: case insensitive filesystem */
public final class C20248ADg implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AEB A00;
    public final AEB A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20248ADg) {
                C20248ADg aDg = (C20248ADg) obj;
                if (!C18070vi.A18(this.A00, aDg.A00) || !C18070vi.A18(this.A01, aDg.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        AEB aeb = this.A00;
        if (aeb == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aeb.writeToParcel(parcel, i);
        }
        AEB aeb2 = this.A01;
        if (aeb2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        aeb2.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A00) * 31) + C17880vN.A02(this.A01);
    }

    public C20248ADg(AEB aeb, AEB aeb2) {
        this.A00 = aeb;
        this.A01 = aeb2;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkedAccounts:{'facebookPage'='");
        AEB aeb = this.A00;
        String str2 = null;
        if (aeb != null) {
            str = aeb.toString();
        } else {
            str = null;
        }
        A10.append(str);
        A10.append("', 'instagramPage'='");
        AEB aeb2 = this.A01;
        if (aeb2 != null) {
            str2 = aeb2.toString();
        }
        A10.append(str2);
        return AnonymousClass000.A0y("'}", A10);
    }
}
