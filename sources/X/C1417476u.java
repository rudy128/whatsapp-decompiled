package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76u  reason: invalid class name and case insensitive filesystem */
public final class C1417476u implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Integer A04;
    public final String A05;
    public final String A06;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        if (this.A04.intValue() != 0) {
            str = "VIDEO";
        } else {
            str = "VOICE";
        }
        parcel.writeString(str);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public final boolean A00() {
        return AnonymousClass000.A1Z(this.A04, AnonymousClass00R.A01);
    }

    public C1417476u(Integer num, String str, String str2, int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A06 = str;
        this.A04 = num;
        this.A05 = str2;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }
}
