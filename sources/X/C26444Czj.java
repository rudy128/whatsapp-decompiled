package X;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czj  reason: case insensitive filesystem */
public final class C26444Czj implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.D3G] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        ? obj = new Object();
        obj.A00 = new Messenger(readStrongBinder);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new D3G[i];
    }
}
