package android.support.v4.media.session;

import X.AnonymousClass000;
import X.AnonymousClass0R8;
import X.C01940Ca;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(8);
    public List A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final Bundle A09;
    public final CharSequence A0A;

    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(9);
        public final int A00;
        public final Bundle A01;
        public final CharSequence A02;
        public final String A03;

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A03);
            TextUtils.writeToParcel(this.A02, parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeBundle(this.A01);
        }

        public CustomAction(Parcel parcel) {
            this.A03 = parcel.readString();
            this.A02 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.A00 = parcel.readInt();
            this.A01 = parcel.readBundle(C01940Ca.class.getClassLoader());
        }

        public String toString() {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Action:mName='");
            A10.append(this.A02);
            A10.append(", mIcon=");
            A10.append(this.A00);
            A10.append(", mExtras=");
            A10.append(this.A01);
            return A10.toString();
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.A03);
        sb.append(", position=");
        sb.append(this.A07);
        sb.append(", buffered position=");
        sb.append(this.A06);
        sb.append(", speed=");
        sb.append(this.A01);
        sb.append(", updated=");
        sb.append(this.A08);
        sb.append(", actions=");
        sb.append(this.A04);
        sb.append(", error code=");
        sb.append(this.A02);
        sb.append(", error message=");
        sb.append(this.A0A);
        sb.append(", custom actions=");
        sb.append(this.A00);
        sb.append(", active item id=");
        sb.append(this.A05);
        return AnonymousClass000.A0y("}", sb);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A07);
        parcel.writeFloat(this.A01);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A04);
        TextUtils.writeToParcel(this.A0A, parcel, i);
        parcel.writeTypedList(this.A00);
        parcel.writeLong(this.A05);
        parcel.writeBundle(this.A09);
        parcel.writeInt(this.A02);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A01 = parcel.readFloat();
        this.A08 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A0A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A00 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.A05 = parcel.readLong();
        this.A09 = parcel.readBundle(C01940Ca.class.getClassLoader());
        this.A02 = parcel.readInt();
    }
}
