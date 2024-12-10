package X;

import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.LocationPicker;

public class DA7 implements E44 {
    public final int A00;
    public final Object A01;

    public DA7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BnN(D44 d44) {
        if (this.A00 != 0) {
            AnonymousClass75M r4 = ((LocationPicker) this.A01).A0O;
            C20269AEc aEc = d44.A03;
            r4.A0Q(aEc.A00, aEc.A01);
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A01;
        DAE dae = groupChatLiveLocationsActivity.A05;
        C17960vV.A07(dae);
        if (((int) (groupChatLiveLocationsActivity.A00 * 5.0f)) != ((int) (dae.A02().A02 * 5.0f))) {
            groupChatLiveLocationsActivity.A00 = groupChatLiveLocationsActivity.A05.A02().A02;
            GroupChatLiveLocationsActivity.A0c(groupChatLiveLocationsActivity);
        }
    }
}
