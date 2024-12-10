package com.whatsapp.newsletter.mex;

import X.AnonymousClass10E;
import X.AnonymousClass1CJ;
import X.AnonymousClass1PY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.C17890vO;
import X.C18070vi;
import X.C198699yl;
import X.C20131A8r;
import X.C22515BAy;
import X.C29681ch;
import X.C32991i5;
import X.C35681md;
import X.C58732lA;
import android.content.Context;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;

public class BaseMetadataNewsletterGraphqlJob extends BaseNewslettersJob {
    public transient AnonymousClass1CJ A00;
    public transient C32991i5 A01;
    public transient AnonymousClass1PY A02;
    public transient C58732lA A03;
    public transient C35681md A04;
    public transient C20131A8r A05;
    public C22515BAy callback;
    public final String handlerType;
    public final C198699yl metadataRequestFields;
    public final String newsletterHandle;
    public final C29681ch newsletterJid;

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        AnonymousClass10E r1 = (AnonymousClass10E) C17890vO.A0H(context);
        AnonymousClass1CJ A0d = AnonymousClass3Ma.A0d(r1);
        C18070vi.A0d(A0d, 0);
        this.A00 = A0d;
        AnonymousClass1PY A0l = AnonymousClass3Ma.A0l(r1);
        C18070vi.A0d(A0l, 0);
        this.A02 = A0l;
        C32991i5 A0G = AnonymousClass8BU.A0G(r1);
        C18070vi.A0d(A0G, 0);
        this.A01 = A0G;
        this.A04 = (C35681md) r1.A7N.get();
        C20131A8r A0P = AnonymousClass8BT.A0P(r1);
        C18070vi.A0d(A0P, 0);
        this.A05 = A0P;
        C58732lA r0 = (C58732lA) r1.A7U.get();
        C18070vi.A0d(r0, 0);
        this.A03 = r0;
    }

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public BaseMetadataNewsletterGraphqlJob(C29681ch r4, C22515BAy bAy, C198699yl r6) {
        super("GetNewsletterMetadataJob");
        this.newsletterHandle = null;
        this.newsletterJid = r4;
        this.handlerType = "JID";
        this.metadataRequestFields = r6;
        this.callback = bAy;
    }

    public BaseMetadataNewsletterGraphqlJob() {
        this((C29681ch) null, (C22515BAy) null, new C198699yl(true, true, true, true, true, true, true, true, true, true, true, true));
    }
}
