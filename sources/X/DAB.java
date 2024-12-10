package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.LocationPicker;

public class DAB implements E46 {
    public final int A00;
    public final Object A01;

    public DAB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bxa(DAE dae) {
        DAE dae2;
        CXL cxl;
        switch (this.A00) {
            case 0:
                C20327AGj aGj = (C20327AGj) this.A01;
                if (dae != null) {
                    C65 c65 = dae.A0S;
                    if (c65 != null) {
                        c65.A01 = false;
                        c65.A00();
                    }
                    dae.A0B = aGj.A01;
                    return;
                }
                return;
            case 1:
                C24000Bth bth = (C24000Bth) this.A01;
                if (bth.A06 == null) {
                    bth.A06 = dae;
                    bth.setLocationMode(bth.A02);
                    return;
                }
                return;
            case 2:
                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A01;
                if (groupChatLiveLocationsActivity.A05 == null) {
                    groupChatLiveLocationsActivity.A05 = dae;
                    if (dae != null) {
                        dae.A07(0, 0, groupChatLiveLocationsActivity.A01);
                        groupChatLiveLocationsActivity.A01 = 0;
                        DAE dae3 = groupChatLiveLocationsActivity.A05;
                        C17960vV.A07(dae3);
                        DAE dae4 = dae3.A0S.A00;
                        if (dae4.A0E == null) {
                            BPQ bpq = new BPQ(dae4);
                            dae4.A0E = bpq;
                            dae4.A0B(bpq);
                        }
                        C65 c652 = groupChatLiveLocationsActivity.A05.A0S;
                        c652.A01 = false;
                        c652.A00();
                        groupChatLiveLocationsActivity.A05.A08 = new DA5(groupChatLiveLocationsActivity);
                        DAE dae5 = groupChatLiveLocationsActivity.A05;
                        dae5.A0C = new DAA(groupChatLiveLocationsActivity, 0);
                        dae5.A09 = new DA7(groupChatLiveLocationsActivity, 0);
                        dae5.A0B = new DA9(groupChatLiveLocationsActivity, 0);
                        dae5.A0A = new DA8(groupChatLiveLocationsActivity, 0);
                        GroupChatLiveLocationsActivity.A0c(groupChatLiveLocationsActivity);
                        Bundle bundle = groupChatLiveLocationsActivity.A02;
                        if (bundle != null) {
                            groupChatLiveLocationsActivity.A0M.setLocationMode(bundle.getInt("map_location_mode", 2));
                            if (groupChatLiveLocationsActivity.A02.containsKey("camera_zoom")) {
                                groupChatLiveLocationsActivity.A05.A09(C25306CdA.A01(new C20269AEc(groupChatLiveLocationsActivity.A02.getDouble("camera_lat"), groupChatLiveLocationsActivity.A02.getDouble("camera_lng")), groupChatLiveLocationsActivity.A02.getFloat("camera_zoom")));
                            }
                            groupChatLiveLocationsActivity.A02 = null;
                            return;
                        } else if (groupChatLiveLocationsActivity.A0W.isEmpty()) {
                            SharedPreferences A05 = groupChatLiveLocationsActivity.A0R.A05(C19620yd.A09);
                            C20269AEc aEc = new C20269AEc((double) A05.getFloat("live_location_lat", 37.389805f), (double) A05.getFloat("live_location_lng", -122.08141f));
                            DAE dae6 = groupChatLiveLocationsActivity.A05;
                            CXL cxl2 = new CXL();
                            cxl2.A06 = aEc;
                            dae6.A09(cxl2);
                            dae2 = groupChatLiveLocationsActivity.A05;
                            cxl = new CXL();
                            cxl.A01 = A05.getFloat("live_location_zoom", 16.0f) - 0.2f;
                            break;
                        } else {
                            GroupChatLiveLocationsActivity.A0q(groupChatLiveLocationsActivity, false);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                LocationPicker locationPicker = (LocationPicker) this.A01;
                if (locationPicker.A03 == null) {
                    locationPicker.A03 = dae;
                    if (dae != null) {
                        C17960vV.A07(dae);
                        if (locationPicker.A0H.A06() && !locationPicker.A0O.A0i) {
                            locationPicker.A03.A0D(true);
                        }
                        DAE dae7 = locationPicker.A03;
                        AnonymousClass75M r0 = locationPicker.A0O;
                        dae7.A07(0, 0, Math.max(r0.A00, r0.A01));
                        C65 c653 = locationPicker.A03.A0S;
                        c653.A01 = false;
                        c653.A00();
                        locationPicker.A03.A08 = new DA6(locationPicker);
                        DAE dae8 = locationPicker.A03;
                        dae8.A0C = new DAA(locationPicker, 1);
                        dae8.A0A = new DA8(locationPicker, 1);
                        dae8.A0B = new DA9(locationPicker, 1);
                        dae8.A09 = new DA7(locationPicker, 1);
                        locationPicker.A0O.A0X((Float) null, false);
                        C20283AEr aEr = locationPicker.A0O.A0V;
                        if (aEr != null && !aEr.A0D.isEmpty()) {
                            locationPicker.A0O.A0N();
                        }
                        Bundle bundle2 = locationPicker.A02;
                        if (bundle2 == null) {
                            SharedPreferences A052 = locationPicker.A0S.A05(C19620yd.A09);
                            C20269AEc aEc2 = new C20269AEc((double) A052.getFloat("share_location_lat", 37.389805f), (double) A052.getFloat("share_location_lon", -122.08141f));
                            dae2 = locationPicker.A03;
                            cxl = C25306CdA.A01(aEc2, A052.getFloat("share_location_zoom", 15.0f) - 0.2f);
                            break;
                        } else {
                            locationPicker.A0N.setLocationMode(bundle2.getInt("map_location_mode", 2));
                            if (locationPicker.A02.containsKey("camera_zoom")) {
                                locationPicker.A03.A09(C25306CdA.A01(new C20269AEc(locationPicker.A02.getDouble("camera_lat"), locationPicker.A02.getDouble("camera_lng")), locationPicker.A02.getFloat("camera_zoom")));
                            }
                            locationPicker.A02 = null;
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
        dae2.A09(cxl);
    }
}
