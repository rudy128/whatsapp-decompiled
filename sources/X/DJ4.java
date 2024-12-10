package X;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.internal.IMapViewDelegate;

public final class DJ4 implements C28451E1r {
    public View A00;
    public final ViewGroup A01;
    public final IMapViewDelegate A02;

    public final void A00(C28516E5a e5a) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A02;
            cyz.A06(9, C26399Cyz.A00(new C23394BgL(e5a), cyz));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public DJ4(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
        this.A02 = iMapViewDelegate;
        C18210vx.A00(viewGroup);
        this.A01 = viewGroup;
    }
}
