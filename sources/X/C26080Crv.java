package X;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.Crv  reason: case insensitive filesystem */
public abstract class C26080Crv {
    public static ICameraUpdateFactoryDelegate A00;

    public static CLK A00(CameraPosition cameraPosition) {
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            C18210vx.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C26399Cyz cyz = (C26399Cyz) iCameraUpdateFactoryDelegate;
            return new CLK(C23331BfJ.A02(C26399Cyz.A01(cameraPosition, cyz), cyz, 7));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public static CLK A01(LatLng latLng) {
        C18210vx.A02(latLng, "latLng must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            C18210vx.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C26399Cyz cyz = (C26399Cyz) iCameraUpdateFactoryDelegate;
            return new CLK(C23331BfJ.A02(C26399Cyz.A01(latLng, cyz), cyz, 8));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public static CLK A02(LatLng latLng, float f) {
        C18210vx.A02(latLng, "latLng must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            C18210vx.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C26399Cyz cyz = (C26399Cyz) iCameraUpdateFactoryDelegate;
            Parcel A01 = C26399Cyz.A01(latLng, cyz);
            A01.writeFloat(f);
            return new CLK(C23331BfJ.A02(A01, cyz, 9));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public static CLK A03(LatLngBounds latLngBounds, int i) {
        C18210vx.A02(latLngBounds, "bounds must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            C18210vx.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C26399Cyz cyz = (C26399Cyz) iCameraUpdateFactoryDelegate;
            Parcel A01 = C26399Cyz.A01(latLngBounds, cyz);
            A01.writeInt(i);
            return new CLK(C23331BfJ.A02(A01, cyz, 10));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }
}
