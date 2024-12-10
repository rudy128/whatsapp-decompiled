package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.491  reason: invalid class name */
public class AnonymousClass491 extends A34 {
    public final AnonymousClass1SG A00;
    public final UserJid A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass1SG r1 = this.A00;
        UserJid userJid = this.A01;
        C17960vV.A07(userJid);
        return r1.A00(userJid);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        UserJid userJid;
        C78013ry r4;
        AnonymousClass2MN r6 = (AnonymousClass2MN) obj;
        UserJid userJid2 = null;
        if (r6 != null) {
            UserJid userJid3 = r6.A00;
            userJid = this.A01;
            if (userJid3 == null || userJid == null) {
                Log.e("ChangeNumberNotificationBanner/GetChangeNumberMessageTask trying to show change number message for non-user jids");
            } else {
                userJid2 = userJid3;
                r4 = (C78013ry) this.A02.get();
                if (r4 != null && userJid2 != null && userJid != null) {
                    r4.A02 = userJid2;
                    r4.A03 = userJid;
                    boolean A08 = r4.A08();
                    boolean A09 = r4.A09();
                    if (A08) {
                        if (A09) {
                            C78013ry.A00(r4);
                            return;
                        } else {
                            r4.A04.postDelayed(new C98774rh(r4, 30), 500);
                            return;
                        }
                    } else if (A09) {
                        r4.A06(true);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        userJid = null;
        r4 = (C78013ry) this.A02.get();
        if (r4 != null) {
        }
    }

    public AnonymousClass491(C78013ry r2, AnonymousClass1SG r3, UserJid userJid) {
        this.A01 = userJid;
        this.A00 = r3;
        this.A02 = AnonymousClass3MW.A0z(r2);
    }
}
