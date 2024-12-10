package com.whatsapp.newsletter.mex;

import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass1PY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BX;
import X.AnonymousClass9IV;
import X.B8Q;
import X.C000100c;
import X.C192799p0;
import X.C20131A8r;
import X.C24751Ln;
import X.C29681ch;
import android.content.Context;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;

public final class NewsletterFollowersGraphqlJob extends BaseNewslettersJob {
    public transient AnonymousClass11P A00;
    public transient C24751Ln A01;
    public transient AnonymousClass1PY A02;
    public transient C192799p0 A03;
    public transient C20131A8r A04;
    public B8Q callback;
    public final C29681ch newsletterJid;
    public final AnonymousClass9IV typeOfFetch;

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public NewsletterFollowersGraphqlJob(AnonymousClass9IV r2, C29681ch r3, B8Q b8q) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r3;
        this.typeOfFetch = r2;
        this.callback = b8q;
    }

    public void CIZ(Context context) {
        C000100c A0H = AnonymousClass8BX.A0H(context);
        this.A00 = A0H.CP7();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A02 = AnonymousClass3Ma.A0l(r1);
        this.A01 = AnonymousClass3MZ.A0q(r1);
        this.A04 = AnonymousClass8BT.A0P(r1);
        this.A03 = (C192799p0) r1.A7F.get();
    }
}
