package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkLinkInfoRequest;
import com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback;

/* renamed from: X.Cyl  reason: case insensitive filesystem */
public class C26385Cyl implements IInterface {
    public IBinder A00;

    public IBinder asBinder() {
        return this.A00;
    }

    public void A00(AppLinkLinkInfoRequest appLinkLinkInfoRequest, IAppLinkLinkInfoResponseCallback iAppLinkLinkInfoResponseCallback) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            boolean A1Y = BEB.A1Y(obtain, appLinkLinkInfoRequest);
            obtain.writeStrongInterface(iAppLinkLinkInfoResponseCallback);
            this.A00.transact(4, obtain, obtain2, A1Y ? 1 : 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
