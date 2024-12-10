package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4be  reason: invalid class name and case insensitive filesystem */
public final class C88964be implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        Integer num2;
        int A0A = C72453Mb.A0A(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (readString2.equals("ONBOARDING")) {
            num = AnonymousClass00R.A00;
        } else if (readString2.equals("ACTIVE")) {
            num = AnonymousClass00R.A01;
        } else if (readString2.equals("REMOVED")) {
            num = AnonymousClass00R.A0C;
        } else {
            throw AnonymousClass000.A0k(readString2);
        }
        String readString3 = parcel.readString();
        boolean A1R = C72473Md.A1R(parcel);
        String readString4 = parcel.readString();
        if (readString4.equals("USERNAME")) {
            num2 = AnonymousClass00R.A00;
        } else if (readString4.equals("PHONE")) {
            num2 = AnonymousClass00R.A01;
        } else if (readString4.equals("EMAIL")) {
            num2 = AnonymousClass00R.A0C;
        } else {
            throw AnonymousClass000.A0k(readString4);
        }
        return new C89514ca(num, num2, readString, readString3, A0A, A1R);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C89514ca[i];
    }
}
