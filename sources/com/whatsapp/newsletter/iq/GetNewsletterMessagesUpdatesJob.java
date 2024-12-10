package com.whatsapp.newsletter.iq;

import X.AW1;
import X.AnonymousClass10E;
import X.AnonymousClass190;
import X.AnonymousClass1OZ;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.C000100c;
import X.C18070vi;
import X.C22821Di;
import X.C29681ch;
import X.C32991i5;
import X.C35681md;
import android.content.Context;

public final class GetNewsletterMessagesUpdatesJob extends BaseNewslettersJob {
    public transient AnonymousClass190 A00;
    public transient C32991i5 A01;
    public transient AnonymousClass1OZ A02;
    public transient C35681md A03;
    public transient AW1 A04;
    public final Long afterServerId;
    public final Long beforeServerId;
    public final C22821Di callback;
    public final long count;
    public final C29681ch newsletterJid;
    public final long sinceMs;
    public final String token;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetNewsletterMessagesUpdatesJob(C29681ch r2, Long l, Long l2, String str, C22821Di r6, long j, long j2) {
        super("GetNewsletterMetadataJob");
        C18070vi.A0d(str, 6);
        this.newsletterJid = r2;
        this.count = j;
        this.beforeServerId = l;
        this.afterServerId = l2;
        this.sinceMs = j2;
        this.token = str;
        this.callback = r6;
    }

    public void CIZ(Context context) {
        C000100c A0H = AnonymousClass8BX.A0H(context);
        this.A00 = A0H.BG6();
        this.A02 = A0H.BAA();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A01 = AnonymousClass8BU.A0G(r1);
        this.A03 = (C35681md) r1.A7N.get();
        this.A04 = (AW1) r1.A7B.get();
    }
}
