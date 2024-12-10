package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;
import java.util.List;

public class DKO implements E5Z {
    public final int A00;
    public final Object A01;

    public DKO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BxZ(LatLng latLng) {
        if (this.A00 != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) this.A01;
            PlaceInfo placeInfo = locationPicker2.A0V.A0U;
            if (placeInfo != null) {
                Object obj = placeInfo.A0D;
                if (obj != null) {
                    ((C25280Ccd) obj).A04(locationPicker2.A03);
                }
                AnonymousClass75M r1 = locationPicker2.A0V;
                r1.A0U = null;
                AnonymousClass75M.A0B(r1);
            }
            AnonymousClass75M r12 = locationPicker2.A0V;
            if (r12.A0e) {
                r12.A0B.setVisibility(0);
            }
            locationPicker2.A0V.A08.setVisibility(8);
            return;
        }
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A01;
        C143087By r13 = groupChatLiveLocationsActivity2.A0O;
        if (r13.A0N != null) {
            r13.A0N();
            return;
        }
        C139086yC A0J = r13.A0J(latLng);
        if (A0J != null) {
            List list = A0J.A04;
            if (list.size() == 1) {
                groupChatLiveLocationsActivity2.A0O.A0X(A0J, true);
                ((C25280Ccd) groupChatLiveLocationsActivity2.A0W.get(A0J.A03)).A03();
            } else if (groupChatLiveLocationsActivity2.A06.A02().A02 >= 16.0f) {
                groupChatLiveLocationsActivity2.A0O.A0X(A0J, true);
            } else {
                GroupChatLiveLocationsActivity2.A0d(groupChatLiveLocationsActivity2, list, true);
                groupChatLiveLocationsActivity2.A0O.A0L = new C127346eC(list, groupChatLiveLocationsActivity2.A06.A02().A02);
            }
        }
    }
}
