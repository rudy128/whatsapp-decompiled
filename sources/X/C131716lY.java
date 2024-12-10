package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity;

/* renamed from: X.6lY  reason: invalid class name and case insensitive filesystem */
public final class C131716lY {
    public final /* synthetic */ ThunderstormConnectionsInfoActivity A00;

    public C131716lY(ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity) {
        this.A00 = thunderstormConnectionsInfoActivity;
    }

    public void A00() {
        Intent A0G = C108945cZ.A0G("android.intent.action.VIEW");
        A0G.setType("image/*");
        A0G.setFlags(268435457);
        try {
            this.A00.startActivity(A0G);
        } catch (ActivityNotFoundException e) {
            C108995ce.A1M("thunderstorm_logs: ThunderstormConnectionsInfoActivity/ viewInGallery start activity exception: ", AnonymousClass000.A10(), e);
        }
        ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity = this.A00;
        thunderstormConnectionsInfoActivity.A08.run();
        thunderstormConnectionsInfoActivity.A0I.removeCallbacks(thunderstormConnectionsInfoActivity.A08);
    }
}
