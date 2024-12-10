package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.PlaceInfo;
import java.util.List;

public class DA9 implements E45 {
    public final int A00;
    public final Object A01;

    public DA9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BxY(C20269AEc aEc) {
        if (this.A00 != 0) {
            LocationPicker locationPicker = (LocationPicker) this.A01;
            PlaceInfo placeInfo = locationPicker.A0O.A0U;
            if (placeInfo != null) {
                Object obj = placeInfo.A0D;
                if (obj != null) {
                    ((BPT) obj).A0C(locationPicker.A05);
                }
                AnonymousClass75M r1 = locationPicker.A0O;
                r1.A0U = null;
                AnonymousClass75M.A0B(r1);
            }
            AnonymousClass75M r12 = locationPicker.A0O;
            if (r12.A0e) {
                r12.A0B.setVisibility(0);
            }
            locationPicker.A0O.A08.setVisibility(8);
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A01;
        C143087By r6 = groupChatLiveLocationsActivity.A0N;
        if (r6.A0N != null) {
            r6.A0N();
            return;
        }
        C139086yC A0J = r6.A0J(new LatLng(aEc.A00, aEc.A01));
        if (A0J != null) {
            List list = A0J.A04;
            if (list.size() == 1) {
                groupChatLiveLocationsActivity.A0N.A0X(A0J, true);
                ((BPT) groupChatLiveLocationsActivity.A0V.get(A0J.A03)).A0A();
            } else if (groupChatLiveLocationsActivity.A05.A02().A02 >= 16.0f) {
                groupChatLiveLocationsActivity.A0N.A0X(A0J, true);
            } else {
                GroupChatLiveLocationsActivity.A0d(groupChatLiveLocationsActivity, list, true);
                groupChatLiveLocationsActivity.A0N.A0L = new C127346eC(list, groupChatLiveLocationsActivity.A05.A02().A02);
            }
        }
    }
}
