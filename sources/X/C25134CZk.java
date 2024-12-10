package X;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.CZk  reason: case insensitive filesystem */
public final class C25134CZk {
    public final IProjectionDelegate A00;

    public C25134CZk(IProjectionDelegate iProjectionDelegate) {
        this.A00 = iProjectionDelegate;
    }

    public LatLng A01(Point point) {
        Parcelable parcelable;
        try {
            C26399Cyz cyz = (C26399Cyz) this.A00;
            Parcel A05 = cyz.A05(1, C26399Cyz.A00(new C23228Bde(point), cyz));
            Parcelable.Creator creator = LatLng.CREATOR;
            if (A05.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A05);
            }
            LatLng latLng = (LatLng) parcelable;
            A05.recycle();
            return latLng;
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public C23164BcK A02() {
        Parcelable parcelable;
        try {
            Parcel A02 = C26399Cyz.A02((C26399Cyz) this.A00, 3);
            Parcelable.Creator creator = C23164BcK.CREATOR;
            if (A02.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A02);
            }
            C23164BcK bcK = (C23164BcK) parcelable;
            A02.recycle();
            return bcK;
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public Point A00(LatLng latLng) {
        C18210vx.A00(latLng);
        try {
            C26399Cyz cyz = (C26399Cyz) this.A00;
            return (Point) C23228Bde.A00(C23331BfJ.A02(C26399Cyz.A01(latLng, cyz), cyz, 2));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }
}
