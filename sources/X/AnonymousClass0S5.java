package X;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.CarAppPermissionActivity;
import androidx.car.app.IOnRequestPermissionsListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0S5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0S5 implements AnonymousClass02j {
    public final /* synthetic */ CarAppPermissionActivity A00;
    public final /* synthetic */ IOnRequestPermissionsListener A01;

    public final void Bkx(Object obj) {
        CarAppPermissionActivity carAppPermissionActivity = this.A00;
        IOnRequestPermissionsListener iOnRequestPermissionsListener = this.A01;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        Iterator A15 = AnonymousClass000.A15((Map) obj);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Boolean bool = (Boolean) A16.getValue();
            if (bool == null || !bool.booleanValue()) {
                A132.add(A16.getKey());
            } else {
                A13.add(A16.getKey());
            }
        }
        try {
            iOnRequestPermissionsListener.onRequestPermissionsResult((String[]) A13.toArray(new String[0]), (String[]) A132.toArray(new String[0]));
        } catch (RemoteException e) {
            Log.e("CarApp", "CarAppService dead when accepting/rejecting permissions", e);
        }
        carAppPermissionActivity.finish();
    }

    public /* synthetic */ AnonymousClass0S5(CarAppPermissionActivity carAppPermissionActivity, IOnRequestPermissionsListener iOnRequestPermissionsListener) {
        this.A00 = carAppPermissionActivity;
        this.A01 = iOnRequestPermissionsListener;
    }
}
