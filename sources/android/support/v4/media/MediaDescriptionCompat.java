package android.support.v4.media;

import X.AnonymousClass000;
import X.AnonymousClass0R8;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(1);
    public MediaDescription A00;
    public final Bitmap A01;
    public final Uri A02;
    public final Uri A03;
    public final Bundle A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final String A08;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat A00(java.lang.Object r14) {
        /*
            r9 = 0
            if (r14 == 0) goto L_0x005d
            r8 = 0
            android.media.MediaDescription r14 = (android.media.MediaDescription) r14
            java.lang.String r13 = r14.getMediaId()
            java.lang.CharSequence r10 = r14.getTitle()
            java.lang.CharSequence r11 = r14.getSubtitle()
            java.lang.CharSequence r12 = r14.getDescription()
            android.graphics.Bitmap r6 = r14.getIconBitmap()
            android.net.Uri r7 = r14.getIconUri()
            android.os.Bundle r5 = r14.getExtras()
            if (r5 == 0) goto L_0x0039
            java.lang.Class<X.0Ca> r0 = X.C01940Ca.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r5.setClassLoader(r0)
            r5.isEmpty()     // Catch:{ BadParcelableException -> 0x0031 }
            goto L_0x0039
        L_0x0031:
            java.lang.String r1 = "MediaSessionCompat"
            java.lang.String r0 = "Could not unparcel the data."
            android.util.Log.e(r1, r0)
            r5 = r9
        L_0x0039:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r5 == 0) goto L_0x005e
            android.os.Parcelable r3 = r5.getParcelable(r4)
            android.net.Uri r3 = (android.net.Uri) r3
            if (r3 == 0) goto L_0x0066
            java.lang.String r2 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L_0x0060
            int r1 = r5.size()
            r0 = 2
            if (r1 != r0) goto L_0x0060
        L_0x0054:
            r8 = r3
        L_0x0055:
            android.support.v4.media.MediaDescriptionCompat r5 = new android.support.v4.media.MediaDescriptionCompat
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r9 = r5
            r5.A00 = r14
        L_0x005d:
            return r9
        L_0x005e:
            r3 = r9
            goto L_0x0066
        L_0x0060:
            r5.remove(r4)
            r5.remove(r2)
        L_0x0066:
            r9 = r5
            if (r3 != 0) goto L_0x0054
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0055
            android.net.Uri r8 = r14.getMediaUri()
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.A00(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Uri uri;
        MediaDescription mediaDescription = this.A00;
        if (mediaDescription == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.A08);
            builder.setTitle(this.A07);
            builder.setSubtitle(this.A06);
            builder.setDescription(this.A05);
            builder.setIconBitmap(this.A01);
            builder.setIconUri(this.A02);
            Bundle bundle = this.A04;
            if (Build.VERSION.SDK_INT < 23 && (uri = this.A03) != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            }
            builder.setExtras(bundle);
            if (Build.VERSION.SDK_INT >= 23) {
                builder.setMediaUri(this.A03);
            }
            mediaDescription = builder.build();
            this.A00 = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }

    public MediaDescriptionCompat(Bitmap bitmap, Uri uri, Uri uri2, Bundle bundle, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str) {
        this.A08 = str;
        this.A07 = charSequence;
        this.A06 = charSequence2;
        this.A05 = charSequence3;
        this.A01 = bitmap;
        this.A02 = uri;
        this.A04 = bundle;
        this.A03 = uri2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A07);
        A10.append(", ");
        A10.append(this.A06);
        A10.append(", ");
        A10.append(this.A05);
        return A10.toString();
    }
}
