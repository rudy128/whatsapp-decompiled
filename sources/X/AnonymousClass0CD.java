package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0CD  reason: invalid class name */
public final class AnonymousClass0CD extends AEQ {
    public static final Parcelable.Creator CREATOR = new Object();
    public Integer A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0CD(Integer num, String str, String str2, String str3) {
        super(str, str2);
        C18070vi.A0d(str3, 3);
        this.A01 = str3;
        this.A00 = num;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        A00(parcel, this);
    }

    public static void A00(Parcel parcel, AnonymousClass0CD r2) {
        int i;
        r2.A01(parcel);
        parcel.writeString(r2.A01);
        Integer num = r2.A00;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        parcel.writeInt(i);
    }
}
