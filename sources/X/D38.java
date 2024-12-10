package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D38 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        boolean A1R = C72473Md.A1R(parcel);
        return new D4C(A00(parcel.readString()), A00(parcel.readString()), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), A1R);
    }

    public static Integer A00(String str) {
        if (str.equals("NONE")) {
            return AnonymousClass00R.A00;
        }
        if (str.equals("INPUT")) {
            return AnonymousClass00R.A01;
        }
        if (str.equals("MODEL")) {
            return AnonymousClass00R.A0C;
        }
        if (str.equals("INPUT_AND_MODEL")) {
            return AnonymousClass00R.A0N;
        }
        throw AnonymousClass000.A0k(str);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new D4C[i];
    }
}
