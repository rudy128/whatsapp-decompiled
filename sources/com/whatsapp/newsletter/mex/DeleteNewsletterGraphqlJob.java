package com.whatsapp.newsletter.mex;

import X.AnonymousClass10E;
import X.AnonymousClass1PY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BX;
import X.C20131A8r;
import X.C22515BAy;
import X.C29681ch;
import X.C35681md;
import android.content.Context;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;

public final class DeleteNewsletterGraphqlJob extends BaseNewslettersJob {
    public transient AnonymousClass1PY A00;
    public transient C35681md A01;
    public transient C20131A8r A02;
    public C22515BAy callback;
    public final C29681ch newsletterJid;

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public DeleteNewsletterGraphqlJob(C29681ch r2, C22515BAy bAy) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r2;
        this.callback = bAy;
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) AnonymousClass8BX.A0H(context);
        this.A00 = AnonymousClass3Ma.A0l(r1);
        this.A01 = (C35681md) r1.A7N.get();
        this.A02 = AnonymousClass8BT.A0P(r1);
    }
}
