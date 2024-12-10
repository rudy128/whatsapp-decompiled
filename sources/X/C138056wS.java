package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.usercontrol.view.controls.UCOffersAndAnnouncementsFragment;

/* renamed from: X.6wS  reason: invalid class name and case insensitive filesystem */
public final class C138056wS {
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    public static final void A00(Context context, UserJid userJid, String str, boolean z) {
        AnonymousClass1FU r4;
        C18070vi.A0d(context, 0);
        Activity A002 = AnonymousClass1L9.A00(context);
        if ((A002 instanceof AnonymousClass1FU) && (r4 = (AnonymousClass1FU) A002) != null) {
            UCOffersAndAnnouncementsFragment uCOffersAndAnnouncementsFragment = new UCOffersAndAnnouncementsFragment();
            Bundle A0D = C17880vN.A0D();
            A0D.putString("extra_business_jid", userJid.getRawString());
            A0D.putString("extra_entry_point", str);
            A0D.putBoolean("extra_opt_out_state", z);
            uCOffersAndAnnouncementsFragment.A1R(A0D);
            r4.CMk(uCOffersAndAnnouncementsFragment, "UCOffersAndAnnouncementsFragment");
        }
    }

    public C138056wS(C18030ve r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
