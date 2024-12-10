package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.2uz  reason: invalid class name and case insensitive filesystem */
public final class C64572uz implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64572uz) {
                C64572uz r5 = (C64572uz) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A03 != r5.A03) {
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
        parcel.writeString(this.A01);
        List<C64552ux> list = this.A02;
        parcel.writeInt(list.size());
        for (C64552ux writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public int hashCode() {
        int i = 0;
        int A002 = C17900vP.A00(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return C17880vN.A01(AnonymousClass000.A0N(this.A02, (A002 + i) * 31), this.A03);
    }

    public C64572uz(String str, String str2, List list, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessAccountSettings:{'intent'='");
        A10.append(this.A00);
        A10.append("', 'status'='");
        A10.append(this.A01);
        A10.append("', 'issues'='");
        A10.append(this.A02);
        A10.append("', 'isProfileEditDisabled'='");
        A10.append(this.A03);
        return AnonymousClass000.A0y("'}", A10);
    }
}
