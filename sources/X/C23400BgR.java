package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.BgR  reason: case insensitive filesystem */
public abstract class C23400BgR extends C22603BFj implements C28636EBq {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.Cyz, X.EBq] */
    public static C28636EBq A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof C28636EBq) {
            return (C28636EBq) queryLocalInterface;
        }
        return new C26399Cyz(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }
}
