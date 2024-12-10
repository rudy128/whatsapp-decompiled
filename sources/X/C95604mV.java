package X;

import android.view.View;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.4mV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95604mV implements C107305Ze {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C92884i4 A01;
    public final /* synthetic */ C20287AEv A02;
    public final /* synthetic */ C20287AEv A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public final void Bkp() {
        C92884i4 r0 = this.A01;
        View view = this.A00;
        UserJid userJid = this.A04;
        C20287AEv aEv = this.A02;
        boolean z = this.A06;
        C20287AEv aEv2 = this.A03;
        String str = this.A05;
        C92874i3 r3 = r0.A00;
        if (view.getTag(2131432150) == null) {
            return;
        }
        if (aEv2 == null) {
            r3.A0V.A08(2131887973, 0);
            Log.w("CatalogMediaCard/MediaThumbnailOnClick/product no longer exists");
            return;
        }
        C92874i3.A03(r3, 7);
        int thumbnailPixelSize = r3.A09.A07.getThumbnailPixelSize();
        boolean A0O = r3.A0X.A0O(userJid);
        String A002 = r3.A0Z.A00(r3.A0G);
        if ("UNBLOCKED".equals(A002)) {
            ContactInfoActivity contactInfoActivity = r3.A0l;
            String str2 = aEv.A0H;
            int i = 5;
            if (str == null) {
                i = 4;
            }
            Integer valueOf = Integer.valueOf(thumbnailPixelSize);
            C20057A5g.A03(contactInfoActivity, r3.A0b, r3.A0e, userJid, valueOf, valueOf, str2, i, A0O, A0O, z);
            return;
        }
        r3.A0e.A02(r3.A0l, A002);
    }

    public /* synthetic */ C95604mV(View view, C92884i4 r2, C20287AEv aEv, C20287AEv aEv2, UserJid userJid, String str, boolean z) {
        this.A01 = r2;
        this.A00 = view;
        this.A04 = userJid;
        this.A02 = aEv;
        this.A06 = z;
        this.A03 = aEv2;
        this.A05 = str;
    }
}
