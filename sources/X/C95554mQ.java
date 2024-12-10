package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4mQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95554mQ implements C107305Ze {
    public final /* synthetic */ AnonymousClass4aY A00;
    public final /* synthetic */ String A01;

    public final void Bkp() {
        AnonymousClass4aY r4 = this.A00;
        String str = this.A01;
        C88654aI.A03(C88444Zs.A00(r4), AnonymousClass3MW.A0j(r4), (String) null, 9, true);
        UserJid userJid = (UserJid) r4.A3R;
        if (!TextUtils.isEmpty(str) && r4.A35.A0C()) {
            if (C18020vd.A05(C18040vf.A02, r4.A3F, 9568)) {
                A4F.A01((A4F) r4.A5L.get(), userJid, 6);
            }
        }
        r4.A2Q.getBusinessProfileManager().A0D(new C92834hz(userJid, r4, 2), userJid);
    }

    public /* synthetic */ C95554mQ(AnonymousClass4aY r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
