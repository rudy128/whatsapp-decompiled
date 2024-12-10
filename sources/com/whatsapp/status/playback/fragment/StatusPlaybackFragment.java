package com.whatsapp.status.playback.fragment;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass6Gp;
import X.AnonymousClass70K;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import android.content.res.Configuration;
import android.graphics.Rect;
import com.whatsapp.jid.UserJid;

public abstract class StatusPlaybackFragment extends Hilt_StatusPlaybackFragment {
    public boolean A00;
    public final Rect A01 = AnonymousClass3MW.A07();

    public String A26() {
        UserJid userJid = ((StatusPlaybackContactFragment) this).A0N;
        if (userJid != null) {
            return userJid.getRawString();
        }
        throw C17890vO.A0K();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r4.A10 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A27() {
        /*
            r5 = this;
            r4 = r5
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r4 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r4
            X.00z r0 = r4.A17
            java.util.LinkedHashMap r0 = r0.A06()
            java.util.Iterator r3 = X.C17890vO.A0l(r0)
        L_0x000d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r2 = r3.next()
            X.70K r2 = (X.AnonymousClass70K) r2
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x0026
            boolean r0 = r4.A11
            if (r0 != 0) goto L_0x0026
            boolean r1 = r4.A10
            r0 = 0
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            r2.A02 = r0
            X.6Gp r2 = (X.AnonymousClass6Gp) r2
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0033
            r2.A0P()
            goto L_0x000d
        L_0x0033:
            r2.A0N()
            goto L_0x000d
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackFragment.A27():void");
    }

    public void A28() {
        this.A00 = true;
        C17900vP.A0Y(this, "StatusPlaybackFragment/onViewActive ", AnonymousClass000.A10());
    }

    public void A29() {
        this.A00 = false;
        C17900vP.A0Y(this, "StatusPlaybackFragment/onViewInactive ", AnonymousClass000.A10());
    }

    public void A2A(int i) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this;
        if (statusPlaybackContactFragment.A0w == null) {
            statusPlaybackContactFragment.A01 = i;
            return;
        }
        AnonymousClass70K A012 = StatusPlaybackContactFragment.A01(statusPlaybackContactFragment);
        if (A012 != null && (!A012.A05)) {
            AnonymousClass6Gp r1 = (AnonymousClass6Gp) A012;
            r1.A05 = true;
            r1.A0T(i, r1.A09);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        C17900vP.A0Y(this, "StatusPlaybackFragment/onConfigurationChanged ", AnonymousClass000.A10());
    }

    public void A2B(Rect rect) {
        this.A01.set(rect);
    }

    public void A1r() {
        super.A1r();
        C17900vP.A0Y(this, "StatusPlaybackFragment/onDestroy ", AnonymousClass000.A10());
    }

    public void A1t() {
        super.A1t();
        C17900vP.A0Y(this, "StatusPlaybackFragment/onPause ", AnonymousClass000.A10());
    }

    public void A1u() {
        super.A1u();
        C17900vP.A0Y(this, "StatusPlaybackFragment/onResume ", AnonymousClass000.A10());
    }
}
