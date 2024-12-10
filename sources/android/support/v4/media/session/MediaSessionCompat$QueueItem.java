package android.support.v4.media.session;

import X.AnonymousClass000;
import X.AnonymousClass0R8;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(4);
    public final long A00;
    public final MediaDescriptionCompat A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.A01.writeToParcel(parcel, i);
        parcel.writeLong(this.A00);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readLong();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaSession.QueueItem {Description=");
        A10.append(this.A01);
        A10.append(", Id=");
        A10.append(this.A00);
        return AnonymousClass000.A0y(" }", A10);
    }
}
