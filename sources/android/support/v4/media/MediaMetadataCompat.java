package android.support.v4.media;

import X.AnonymousClass00O;
import X.AnonymousClass00P;
import X.AnonymousClass0R8;
import X.C01940Ca;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaMetadataCompat implements Parcelable {
    public static final AnonymousClass00P A01;
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(2);
    public final Bundle A00;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.00O, X.00P] */
    static {
        ? r3 = new AnonymousClass00O(0);
        A01 = r3;
        r3.put("android.media.metadata.TITLE", 1);
        r3.put("android.media.metadata.ARTIST", 1);
        r3.put("android.media.metadata.DURATION", 0);
        r3.put("android.media.metadata.ALBUM", 1);
        r3.put("android.media.metadata.AUTHOR", 1);
        r3.put("android.media.metadata.WRITER", 1);
        r3.put("android.media.metadata.COMPOSER", 1);
        r3.put("android.media.metadata.COMPILATION", 1);
        r3.put("android.media.metadata.DATE", 1);
        r3.put("android.media.metadata.YEAR", 0);
        r3.put("android.media.metadata.GENRE", 1);
        r3.put("android.media.metadata.TRACK_NUMBER", 0);
        r3.put("android.media.metadata.NUM_TRACKS", 0);
        r3.put("android.media.metadata.DISC_NUMBER", 0);
        r3.put("android.media.metadata.ALBUM_ARTIST", 1);
        r3.put("android.media.metadata.ART", 2);
        r3.put("android.media.metadata.ART_URI", 1);
        r3.put("android.media.metadata.ALBUM_ART", 2);
        r3.put("android.media.metadata.ALBUM_ART_URI", 1);
        r3.put("android.media.metadata.USER_RATING", 3);
        r3.put("android.media.metadata.RATING", 3);
        r3.put("android.media.metadata.DISPLAY_TITLE", 1);
        r3.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        r3.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        r3.put("android.media.metadata.DISPLAY_ICON", 2);
        r3.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        r3.put("android.media.metadata.MEDIA_ID", 1);
        r3.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        r3.put("android.media.metadata.MEDIA_URI", 1);
        r3.put("android.media.metadata.ADVERTISEMENT", 0);
        r3.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.A00 = parcel.readBundle(C01940Ca.class.getClassLoader());
    }
}
