package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.Ae4  reason: case insensitive filesystem */
public final /* synthetic */ class C21074Ae4 implements C107705aS {
    public final /* synthetic */ C20287AEv A00;
    public final /* synthetic */ C20508ANt A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ boolean A03;

    public final void Bp3(View view) {
        C20508ANt aNt = this.A01;
        C20287AEv aEv = this.A00;
        UserJid userJid = this.A02;
        boolean z = this.A03;
        C22364B4s b4s = aNt.A01.A04;
        View view2 = view;
        if (b4s != null) {
            C92884i4 r4 = (C92884i4) b4s;
            View view3 = view2;
            C92874i3.A05(r4.A00, new C95604mV(view3, r4, aEv, aNt.A0D.A0A((UserJid) null, aEv.A0H), userJid, aNt.A03, z), AnonymousClass00R.A0D);
        } else if (view2.getTag(2131432150) != null) {
            C20114A7x a7x = aNt.A0D;
            String str = aEv.A0H;
            if (a7x.A0A((UserJid) null, str) == null) {
                aNt.A08.A08(2131887973, 0);
                Log.w("CatalogMediaCard/MediaThumbnailOnClick/product no longer exists");
                return;
            }
            int thumbnailPixelSize = aNt.A01.A07.getThumbnailPixelSize();
            boolean A0O = aNt.A09.A0O(userJid);
            String A002 = aNt.A0A.A00(aNt.A02);
            if ("UNBLOCKED".equals(A002)) {
                Context context = aNt.A00;
                int i = 5;
                if (aNt.A03 == null) {
                    i = 4;
                }
                Integer valueOf = Integer.valueOf(thumbnailPixelSize);
                C20057A5g.A03(context, aNt.A0C, aNt.A0E, userJid, valueOf, valueOf, str, i, A0O, A0O, z);
                return;
            }
            aNt.A0E.A02(aNt.A00, A002);
        }
    }

    public /* synthetic */ C21074Ae4(C20287AEv aEv, C20508ANt aNt, UserJid userJid, boolean z) {
        this.A01 = aNt;
        this.A00 = aEv;
        this.A02 = userJid;
        this.A03 = z;
    }
}
