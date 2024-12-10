package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.6KE  reason: invalid class name */
public final class AnonymousClass6KE extends C113585nK {
    public final TextEmojiLabel A00;
    public final AnonymousClass1VW A01;
    public final C37451pZ A02;
    public final AQC A03;
    public final C34551kg A04;
    public final WDSProfilePhoto A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6KE(View view, AnonymousClass1VW r4, C37451pZ r5, AQC aqc, C34551kg r7) {
        super(view);
        C72473Md.A1M(view, aqc, r4, 2);
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = aqc;
        this.A01 = r4;
        WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) view.findViewById(2131437028);
        wDSProfilePhoto.setProfileBadge(C124266Xr.A00());
        this.A05 = wDSProfilePhoto;
        this.A00 = AnonymousClass3MX.A0W(view, 2131429428);
        AnonymousClass3Ma.A1E(view, this, 32);
    }
}
