package X;

import android.content.Intent;
import android.media.MediaDescription;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;

/* renamed from: X.0R8  reason: invalid class name */
public class AnonymousClass0R8 implements Parcelable.Creator {
    public final int A00;

    public static C005702m A00(Parcel parcel) {
        Intent intent;
        C18070vi.A0d(parcel, 0);
        int readInt = parcel.readInt();
        if (parcel.readInt() == 0) {
            intent = null;
        } else {
            intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
        }
        return new C005702m(readInt, intent);
    }

    public static AnonymousClass0RL A01(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new AnonymousClass0RL(parcel);
    }

    public AnonymousClass0R8(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.view.View$BaseSavedState, X.057, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.0RC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v7, types: [X.0RA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.0RP, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v10, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v18, types: [X.08Z, X.0W5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v22, types: [X.0Ig, X.08c] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C17160uD r1;
        switch (this.A00) {
            case 0:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 1:
                return MediaDescriptionCompat.A00(MediaDescription.CREATOR.createFromParcel(parcel));
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new MediaSessionCompat$QueueItem(parcel);
            case 5:
                ? obj = new Object();
                obj.A00 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return obj;
            case 6:
                return new MediaSessionCompat$Token(parcel.readParcelable((ClassLoader) null));
            case 7:
                ? obj2 = new Object();
                obj2.A04 = parcel.readInt();
                obj2.A01 = parcel.readInt();
                obj2.A03 = parcel.readInt();
                obj2.A02 = parcel.readInt();
                obj2.A00 = parcel.readInt();
                return obj2;
            case 8:
                return new PlaybackStateCompat(parcel);
            case 9:
                return new PlaybackStateCompat.CustomAction(parcel);
            case 10:
                ? obj3 = new Object();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    r1 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C17160uD.A00);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C17160uD)) {
                        ? obj4 = new Object();
                        obj4.A00 = readStrongBinder;
                        r1 = obj4;
                    } else {
                        r1 = (C17160uD) queryLocalInterface;
                    }
                }
                obj3.A00 = r1;
                return obj3;
            case 11:
                return A00(parcel);
            case 12:
                return A01(parcel);
            case 13:
                ? obj5 = new Object();
                obj5.A00 = parcel.readInt();
                return obj5;
            case 14:
                ? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.A00 = AnonymousClass000.A1O(parcel.readByte());
                return baseSavedState;
            case 15:
                return new AnonymousClass0RK(parcel.readInt());
            case 16:
                return new AnonymousClass08X(parcel.readFloat());
            case 17:
                return new AnonymousClass08Y(parcel.readInt());
            default:
                long readLong = parcel.readLong();
                ? r2 = new AnonymousClass0W5();
                ? r0 = new C03460Ig();
                r0.A00 = readLong;
                r2.A00 = r0;
                return r2;
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i];
            case 1:
                return new MediaDescriptionCompat[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new MediaSessionCompat$QueueItem[i];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 6:
                return new MediaSessionCompat$Token[i];
            case 7:
                return new ParcelableVolumeInfo[i];
            case 8:
                return new PlaybackStateCompat[i];
            case 9:
                return new PlaybackStateCompat.CustomAction[i];
            case 10:
                return new AnonymousClass0RA[i];
            case 11:
                return new C005702m[i];
            case 12:
                return new AnonymousClass0RL[i];
            case 13:
                return new AnonymousClass0RC[i];
            case 14:
                return new AnonymousClass057[i];
            case 15:
                return new AnonymousClass0RK[i];
            case 16:
                return new AnonymousClass08X[i];
            case 17:
                return new AnonymousClass08Y[i];
            default:
                return new AnonymousClass08Z[i];
        }
    }
}
