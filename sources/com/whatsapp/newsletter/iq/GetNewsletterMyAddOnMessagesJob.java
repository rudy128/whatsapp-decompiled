package com.whatsapp.newsletter.iq;

import X.AnonymousClass10E;
import X.AnonymousClass1OZ;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.C000100c;
import X.C19830z4;
import X.C29681ch;
import X.C32991i5;
import X.C35321m3;
import X.C35681md;
import android.content.Context;

public final class GetNewsletterMyAddOnMessagesJob extends BaseNewslettersJob {
    public transient C19830z4 A00;
    public transient C32991i5 A01;
    public transient AnonymousClass1OZ A02;
    public transient C35681md A03;
    public transient C35321m3 A04;
    public final long count;
    public final C29681ch newsletterJid;

    public GetNewsletterMyAddOnMessagesJob(C29681ch r2, long j) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r2;
        this.count = j;
    }

    public void CIZ(Context context) {
        C000100c A0H = AnonymousClass8BX.A0H(context);
        this.A02 = A0H.BAA();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A01 = AnonymousClass8BU.A0G(r1);
        this.A03 = (C35681md) r1.A7N.get();
        this.A00 = A0H.CRw();
        this.A04 = (C35321m3) r1.A7J.get();
    }
}
