package X;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2;

public class DKL implements E5X {
    public final int A00;
    public final Object A01;

    public DKL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BnV() {
        LatLng latLng;
        if (this.A00 != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) this.A01;
            if (locationPicker2.A0V.A09.getVisibility() == 0) {
                locationPicker2.A0V.A09.setVisibility(8);
                locationPicker2.A0V.A0A.startAnimation(AnonymousClass8BY.A0D(-locationPicker2.A0V.A09.getHeight()));
            }
            C25284Ccm ccm = locationPicker2.A02;
            C17960vV.A07(ccm);
            CameraPosition A02 = ccm.A02();
            if (A02 != null && (latLng = A02.A03) != null) {
                locationPicker2.A0V.A0Q(latLng.A00, latLng.A01);
                return;
            }
            return;
        }
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A01;
        C25284Ccm ccm2 = groupChatLiveLocationsActivity2.A06;
        C17960vV.A07(ccm2);
        CameraPosition A022 = ccm2.A02();
        if (A022 != null) {
            int i = (int) (groupChatLiveLocationsActivity2.A00 * 5.0f);
            float f = A022.A02;
            if (i != ((int) (5.0f * f))) {
                groupChatLiveLocationsActivity2.A00 = f;
                GroupChatLiveLocationsActivity2.A0c(groupChatLiveLocationsActivity2);
            }
            C143087By r1 = groupChatLiveLocationsActivity2.A0O;
            if (r1.A0L != null) {
                r1.A0a((Float) null);
            }
            C143087By r0 = groupChatLiveLocationsActivity2.A0O;
            C139086yC r12 = r0.A0N;
            if (r12 != null && r0.A0V && GroupChatLiveLocationsActivity2.A0r(r12.A00(), groupChatLiveLocationsActivity2)) {
                groupChatLiveLocationsActivity2.A0O.A0N();
            }
        }
    }
}
