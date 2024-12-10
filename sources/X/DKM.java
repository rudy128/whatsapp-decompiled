package X;

import android.view.View;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;

public class DKM implements E5Y {
    public final int A00;
    public final Object A01;

    public DKM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bnb(int i) {
        if (this.A00 != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) this.A01;
            if (i == 1) {
                AnonymousClass75M r1 = locationPicker2.A0V;
                if (r1.A0i) {
                    r1.A0K.setImageResource(2131231146);
                    locationPicker2.A0V.A0h = false;
                } else {
                    PlaceInfo placeInfo = r1.A0U;
                    if (placeInfo != null) {
                        Object obj = placeInfo.A0D;
                        if (obj != null) {
                            C25280Ccd ccd = (C25280Ccd) obj;
                            ccd.A04(locationPicker2.A03);
                            ccd.A02();
                        }
                        AnonymousClass75M r12 = locationPicker2.A0V;
                        r12.A0U = null;
                        AnonymousClass75M.A0B(r12);
                    }
                    AnonymousClass75M r13 = locationPicker2.A0V;
                    if (r13.A0e) {
                        r13.A09.setVisibility(0);
                        locationPicker2.A0V.A0A.startAnimation(AnonymousClass8BY.A0D(locationPicker2.A0V.A09.getHeight()));
                        locationPicker2.A0V.A0B.setVisibility(0);
                        locationPicker2.A0V.A08.setVisibility(8);
                    }
                }
            }
            AnonymousClass75M r14 = locationPicker2.A0V;
            if (r14.A0h) {
                r14.A08.setVisibility(8);
            }
            View findViewById = locationPicker2.findViewById(2131432269);
            View findViewById2 = locationPicker2.findViewById(2131432180);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            if (findViewById2 != null && locationPicker2.A0V.A0e) {
                findViewById2.setVisibility(8);
                return;
            }
            return;
        }
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A01;
        if (i == 1) {
            C17960vV.A07(groupChatLiveLocationsActivity2.A06);
            C143087By r0 = groupChatLiveLocationsActivity2.A0O;
            r0.A0W = true;
            int i2 = 0;
            r0.A0U = false;
            View view = r0.A0C;
            if (r0.A0O != null) {
                i2 = 8;
            }
            view.setVisibility(i2);
            groupChatLiveLocationsActivity2.A06.A04();
            groupChatLiveLocationsActivity2.A0O.A0V = true;
        }
    }
}
