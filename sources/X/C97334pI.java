package X;

import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel;
import java.util.Map;

/* renamed from: X.4pI  reason: invalid class name and case insensitive filesystem */
public class C97334pI implements AnonymousClass8B1 {
    public final /* synthetic */ ProfileInfoActivity A00;

    public /* synthetic */ void Bla(String str) {
    }

    public /* synthetic */ void Blz() {
    }

    public /* synthetic */ void Bm0(String str) {
    }

    public /* synthetic */ void Bm2(String str, Map map) {
    }

    public /* synthetic */ void BpC() {
    }

    public C97334pI(ProfileInfoActivity profileInfoActivity) {
        this.A00 = profileInfoActivity;
    }

    public void Bly(String str) {
        ProfileInfoActivity profileInfoActivity = this.A00;
        if (C72453Mb.A1V(profileInfoActivity)) {
            profileInfoActivity.A04.setVisibility(8);
            profileInfoActivity.A06.setVisibility(0);
            profileInfoActivity.A00 = null;
        }
    }

    public void Bm4(boolean z, boolean z2) {
        CoinFlipProfilePicViewModel coinFlipProfilePicViewModel;
        ProfileInfoActivity profileInfoActivity = this.A00;
        if (C72453Mb.A1V(profileInfoActivity) && !z && (coinFlipProfilePicViewModel = profileInfoActivity.A0R) != null && coinFlipProfilePicViewModel.A04.A06()) {
            profileInfoActivity.A0L.setVisibility(8);
            profileInfoActivity.A07.setVisibility(0);
        }
    }
}
