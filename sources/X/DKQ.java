package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2;

public class DKQ implements C28516E5a {
    public final int A00;
    public final Object A01;

    public DKQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bxb(C25284Ccm ccm) {
        C25284Ccm ccm2;
        C23031Ba7 A002;
        switch (this.A00) {
            case 0:
                ((DirectorySetLocationMapActivity) this.A01).A4b(ccm);
                return;
            case 1:
                C24001Bti bti = (C24001Bti) this.A01;
                if (bti.A08 == null) {
                    bti.A08 = ccm;
                    bti.setLocationMode(bti.A03);
                    return;
                }
                return;
            case 2:
                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A01;
                if (groupChatLiveLocationsActivity2.A06 == null) {
                    groupChatLiveLocationsActivity2.A06 = ccm;
                    ccm.A07(0, 0, 0, groupChatLiveLocationsActivity2.A01);
                    groupChatLiveLocationsActivity2.A01 = 0;
                    C17960vV.A07(groupChatLiveLocationsActivity2.A06);
                    C18010vc r0 = groupChatLiveLocationsActivity2.A0S;
                    String str = C19620yd.A09;
                    int i = 0;
                    boolean z = r0.A05(str).getBoolean("live_location_show_traffic", false);
                    groupChatLiveLocationsActivity2.A06.A0L(z);
                    MenuItem menuItem = groupChatLiveLocationsActivity2.A03;
                    if (menuItem != null) {
                        menuItem.setChecked(z);
                    }
                    groupChatLiveLocationsActivity2.A06.A06(groupChatLiveLocationsActivity2.A0S.A05(str).getInt("live_location_map_type", 1));
                    groupChatLiveLocationsActivity2.A06.A0J(true);
                    try {
                        C26399Cyz cyz = (C26399Cyz) groupChatLiveLocationsActivity2.A06.A01().A00;
                        Parcel A04 = cyz.A04();
                        A04.writeInt(1);
                        cyz.A06(2, A04);
                        try {
                            C26399Cyz cyz2 = (C26399Cyz) groupChatLiveLocationsActivity2.A06.A01().A00;
                            Parcel A042 = cyz2.A04();
                            A042.writeInt(0);
                            cyz2.A06(1, A042);
                            groupChatLiveLocationsActivity2.A06.A01().A00();
                            groupChatLiveLocationsActivity2.A06.A0C(new DKJ(groupChatLiveLocationsActivity2));
                            groupChatLiveLocationsActivity2.A06.A0H(new DKP(groupChatLiveLocationsActivity2, 0));
                            groupChatLiveLocationsActivity2.A06.A0E(new DKM(groupChatLiveLocationsActivity2, 0));
                            groupChatLiveLocationsActivity2.A06.A0D(new DKL(groupChatLiveLocationsActivity2, 0));
                            groupChatLiveLocationsActivity2.A06.A0G(new DKO(groupChatLiveLocationsActivity2, 0));
                            groupChatLiveLocationsActivity2.A06.A0F(new DKN(groupChatLiveLocationsActivity2, 0));
                            GroupChatLiveLocationsActivity2.A0c(groupChatLiveLocationsActivity2);
                            if (groupChatLiveLocationsActivity2.A02 != null) {
                                C143087By r2 = groupChatLiveLocationsActivity2.A0O;
                                View view = r2.A0C;
                                if (!r2.A0W || r2.A0O != null) {
                                    i = 8;
                                }
                                view.setVisibility(i);
                                groupChatLiveLocationsActivity2.A0N.setLocationMode(groupChatLiveLocationsActivity2.A02.getInt("map_location_mode", 2));
                                if (groupChatLiveLocationsActivity2.A02.containsKey("camera_zoom")) {
                                    groupChatLiveLocationsActivity2.A06.A09(C26080Crv.A02(new LatLng(groupChatLiveLocationsActivity2.A02.getDouble("camera_lat"), groupChatLiveLocationsActivity2.A02.getDouble("camera_lng")), groupChatLiveLocationsActivity2.A02.getFloat("camera_zoom")));
                                }
                                groupChatLiveLocationsActivity2.A02 = null;
                            } else if (groupChatLiveLocationsActivity2.A0X.isEmpty()) {
                                SharedPreferences A05 = groupChatLiveLocationsActivity2.A0S.A05(str);
                                groupChatLiveLocationsActivity2.A06.A09(C26080Crv.A01(new LatLng((double) A05.getFloat("live_location_lat", 37.389805f), (double) A05.getFloat("live_location_lng", -122.08141f))));
                                C25284Ccm ccm3 = groupChatLiveLocationsActivity2.A06;
                                float f = A05.getFloat("live_location_zoom", 16.0f) - 0.2f;
                                try {
                                    ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = C26080Crv.A00;
                                    C18210vx.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
                                    C26399Cyz cyz3 = (C26399Cyz) iCameraUpdateFactoryDelegate;
                                    Parcel A043 = cyz3.A04();
                                    A043.writeFloat(f);
                                    ccm3.A09(new CLK(C23331BfJ.A02(A043, cyz3, 4)));
                                } catch (RemoteException e) {
                                    throw C27226Da5.A00(e);
                                }
                            } else {
                                GroupChatLiveLocationsActivity2.A0q(groupChatLiveLocationsActivity2, false);
                            }
                            if (C28281Zt.A0B(groupChatLiveLocationsActivity2)) {
                                ccm2 = groupChatLiveLocationsActivity2.A06;
                                A002 = C23031Ba7.A00(groupChatLiveLocationsActivity2, 2132017211);
                                break;
                            } else {
                                return;
                            }
                        } catch (RemoteException e2) {
                            throw C27226Da5.A00(e2);
                        }
                    } catch (RemoteException e3) {
                        throw C27226Da5.A00(e3);
                    }
                } else {
                    return;
                }
            default:
                LocationPicker2 locationPicker2 = (LocationPicker2) this.A01;
                if (locationPicker2.A02 == null) {
                    locationPicker2.A02 = ccm;
                    C17960vV.A07(ccm);
                    locationPicker2.A0T = new CLr(ccm);
                    ccm.A0L(false);
                    locationPicker2.A02.A0J(true);
                    if (locationPicker2.A0M.A06() && !locationPicker2.A0V.A0i) {
                        locationPicker2.A02.A0K(true);
                    }
                    C25284Ccm ccm4 = locationPicker2.A02;
                    AnonymousClass75M r02 = locationPicker2.A0V;
                    ccm4.A07(0, 0, 0, Math.max(r02.A00, r02.A01));
                    locationPicker2.A02.A01().A00();
                    locationPicker2.A02.A0C(new DKK(locationPicker2));
                    locationPicker2.A02.A0H(new DKP(locationPicker2, 1));
                    locationPicker2.A02.A0F(new DKN(locationPicker2, 1));
                    locationPicker2.A02.A0G(new DKO(locationPicker2, 1));
                    locationPicker2.A02.A0E(new DKM(locationPicker2, 1));
                    locationPicker2.A02.A0D(new DKL(locationPicker2, 1));
                    locationPicker2.A0V.A0X((Float) null, false);
                    C20283AEr aEr = locationPicker2.A0V.A0V;
                    if (aEr != null && !aEr.A0D.isEmpty()) {
                        locationPicker2.A0V.A0N();
                    }
                    Bundle bundle = locationPicker2.A00;
                    if (bundle != null) {
                        locationPicker2.A0U.setLocationMode(bundle.getInt("map_location_mode", 2));
                        if (locationPicker2.A00.containsKey("camera_zoom")) {
                            locationPicker2.A02.A09(C26080Crv.A02(new LatLng(locationPicker2.A00.getDouble("camera_lat"), locationPicker2.A00.getDouble("camera_lng")), locationPicker2.A00.getFloat("camera_zoom")));
                        }
                        locationPicker2.A00 = null;
                    } else {
                        SharedPreferences A052 = locationPicker2.A0Z.A05(C19620yd.A09);
                        locationPicker2.A02.A09(C26080Crv.A02(new LatLng((double) A052.getFloat("share_location_lat", 37.389805f), (double) A052.getFloat("share_location_lon", -122.08141f)), A052.getFloat("share_location_zoom", 15.0f) - 0.2f));
                    }
                    if (C28281Zt.A0B(locationPicker2)) {
                        ccm2 = locationPicker2.A02;
                        A002 = C23031Ba7.A00(locationPicker2, 2132017211);
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
        ccm2.A0I(A002);
    }
}
