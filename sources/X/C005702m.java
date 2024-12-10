package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.02m  reason: invalid class name and case insensitive filesystem */
public final class C005702m implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(11);
    public final int A00;
    public final Intent A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
        Intent intent = this.A01;
        int i2 = 1;
        if (intent == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityResult{resultCode=");
        int i = this.A00;
        if (i == -1) {
            str = "RESULT_OK";
        } else if (i != 0) {
            str = String.valueOf(i);
        } else {
            str = "RESULT_CANCELED";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }

    public C005702m(int i, Intent intent) {
        this.A00 = i;
        this.A01 = intent;
    }
}
