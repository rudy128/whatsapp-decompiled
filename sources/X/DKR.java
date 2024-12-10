package X;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.WaMapView;

public final /* synthetic */ class DKR implements C28516E5a {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ String A01;

    public final void Bxb(C25284Ccm ccm) {
        LatLng latLng = this.A00;
        String str = this.A01;
        CLL cll = WaMapView.A04;
        if (cll == null) {
            try {
                C28634EBo eBo = CFF.A00;
                C18210vx.A02(eBo, "IBitmapDescriptorFactory is not initialized");
                C26399Cyz cyz = (C26399Cyz) eBo;
                Parcel A04 = cyz.A04();
                A04.writeInt(2131232085);
                cll = new CLL(C23331BfJ.A02(A04, cyz, 1));
                WaMapView.A04 = cll;
            } catch (RemoteException e) {
                throw C27226Da5.A00(e);
            }
        }
        C23100BbF bbF = new C23100BbF();
        bbF.A08 = latLng;
        bbF.A07 = cll;
        bbF.A09 = str;
        try {
            C26399Cyz.A03((C26399Cyz) ccm.A01, 14);
            ccm.A03(bbF);
        } catch (RemoteException e2) {
            throw C27226Da5.A00(e2);
        }
    }

    public /* synthetic */ DKR(LatLng latLng, String str) {
        this.A00 = latLng;
        this.A01 = str;
    }
}
