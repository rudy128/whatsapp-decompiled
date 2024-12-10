package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class AEY implements Parcelable {
    public static final C20228ACm CREATOR = new Object();
    public final AnonymousClass1KJ A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeList(this.A03);
        AnonymousClass1KJ r1 = this.A00;
        AnonymousClass1KJ[] r0 = AnonymousClass1KI.A01;
        parcel.writeParcelable(r1, i);
    }

    public AEY(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        ArrayList A13 = AnonymousClass000.A13();
        this.A03 = A13;
        parcel.readList(A13, C20251ADj.class.getClassLoader());
        this.A00 = AnonymousClass1KI.A00(parcel);
    }

    public AEY(AnonymousClass1KJ r1, String str, String str2, List list) {
        this.A02 = str;
        this.A00 = r1;
        this.A01 = str2;
        this.A03 = list;
    }
}
