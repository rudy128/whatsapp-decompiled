package android.support.v4.media;

import X.AnonymousClass000;
import X.AnonymousClass0R8;
import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(3);
    public final float A00;
    public final int A01;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }

    public RatingCompat(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }

    public int describeContents() {
        return this.A01;
    }

    public String toString() {
        String valueOf;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Rating:style=");
        A10.append(this.A01);
        A10.append(" rating=");
        float f = this.A00;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        return AnonymousClass000.A0y(valueOf, A10);
    }
}
