package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.wearable.applinks.AppLinkLinkInfoResponse;
import com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback;

/* renamed from: X.BFq  reason: case insensitive filesystem */
public abstract class C22610BFq extends Binder implements IAppLinkLinkInfoResponseCallback {
    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object obj;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback");
                if (i == 2) {
                    Parcelable.Creator creator = AppLinkLinkInfoResponse.CREATOR;
                    if (parcel.readInt() != 0) {
                        obj = creator.createFromParcel(parcel);
                    } else {
                        obj = null;
                    }
                    C3b((AppLinkLinkInfoResponse) obj);
                    return true;
                } else if (i == 3) {
                    Bsn(parcel.readInt(), parcel.readString());
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback");
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public C22610BFq() {
        attachInterface(this, "com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback");
    }
}
