package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.75s  reason: invalid class name and case insensitive filesystem */
public final class C1414675s implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        int A0A = C72453Mb.A0A(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (readString2.equals("VOICE")) {
            num = AnonymousClass00R.A00;
        } else if (readString2.equals("VIDEO")) {
            num = AnonymousClass00R.A01;
        } else {
            throw AnonymousClass000.A0k(readString2);
        }
        return new C1417476u(num, readString, parcel.readString(), A0A, parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1417476u[i];
    }
}
