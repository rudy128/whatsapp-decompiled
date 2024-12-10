package X;

import android.graphics.Point;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

public class DA4 implements E7P {
    public final int A00;
    public final Object A01;

    public DA4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bnj() {
        if (2 - this.A00 == 0) {
            ((GroupChatLiveLocationsActivity) this.A01).A0Z = false;
        }
    }

    public void Buc() {
        switch (this.A00) {
            case 2:
                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A01;
                groupChatLiveLocationsActivity.A0Z = false;
                DAE dae = groupChatLiveLocationsActivity.A05;
                C17960vV.A07(dae);
                C143087By r1 = groupChatLiveLocationsActivity.A0N;
                C60072nL r0 = r1.A0Q;
                if (r0 != null) {
                    C20269AEc aEc = new C20269AEc(r0.A00, r0.A01);
                    Point A04 = dae.A0R.A04(aEc);
                    int i = A04.x;
                    if (i <= 0 || A04.y <= 0 || i >= groupChatLiveLocationsActivity.A0M.getWidth() || A04.y >= groupChatLiveLocationsActivity.A0M.getHeight()) {
                        groupChatLiveLocationsActivity.A0Z = true;
                        groupChatLiveLocationsActivity.A05.A0A(C25306CdA.A01(aEc, groupChatLiveLocationsActivity.A00 * 2.0f), this, 1500);
                        return;
                    }
                    return;
                } else if (!r1.A0W && groupChatLiveLocationsActivity.A0a) {
                    groupChatLiveLocationsActivity.A0a = false;
                    GroupChatLiveLocationsActivity.A0q(groupChatLiveLocationsActivity, true);
                    return;
                } else {
                    return;
                }
            case 3:
                return;
            default:
                double d = BIS.A0n;
                ((BIS) this.A01).A0S.CHV("zoom");
                return;
        }
    }
}
