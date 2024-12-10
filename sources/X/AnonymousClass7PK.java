package X;

import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.List;

/* renamed from: X.7PK  reason: invalid class name */
public class AnonymousClass7PK implements C1604188j {
    public final int A00;
    public final Object A01;

    public AnonymousClass7PK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C6Y(List list) {
        if (this.A00 != 0) {
            StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A01;
            StatusPlaybackContactFragment.A08(statusPlaybackContactFragment);
            statusPlaybackContactFragment.A10 = false;
            statusPlaybackContactFragment.A27();
            return;
        }
        MyStatusesActivity.A0z((MyStatusesActivity) this.A01);
    }
}
