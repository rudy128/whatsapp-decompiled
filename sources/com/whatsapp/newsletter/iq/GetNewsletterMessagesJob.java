package com.whatsapp.newsletter.iq;

import X.AW1;
import X.AnonymousClass10E;
import X.AnonymousClass190;
import X.AnonymousClass1CJ;
import X.AnonymousClass1OZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.B8R;
import X.C000100c;
import X.C18070vi;
import X.C29681ch;
import X.C32991i5;
import X.C35681md;
import android.content.Context;

public final class GetNewsletterMessagesJob extends BaseNewslettersJob {
    public transient AnonymousClass190 A00;
    public transient AnonymousClass1CJ A01;
    public transient C32991i5 A02;
    public transient AnonymousClass1OZ A03;
    public transient C35681md A04;
    public transient AW1 A05;
    public final Long afterServerId;
    public final Long beforeServerId;
    public final B8R callback;
    public final long count;
    public final boolean fetchingForGaps;
    public final C29681ch newsletterJid;
    public final String token;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetNewsletterMessagesJob(C29681ch r2, B8R b8r, Long l, Long l2, String str, long j, boolean z) {
        super("GetNewsletterMetadataJob");
        C18070vi.A0d(str, 6);
        this.newsletterJid = r2;
        this.count = j;
        this.beforeServerId = l;
        this.afterServerId = l2;
        this.fetchingForGaps = z;
        this.token = str;
        this.callback = b8r;
    }

    public void CIZ(Context context) {
        C000100c A0H = AnonymousClass8BX.A0H(context);
        this.A00 = A0H.BG6();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A01 = AnonymousClass3Ma.A0d(r1);
        this.A03 = A0H.BAA();
        this.A02 = AnonymousClass8BU.A0G(r1);
        this.A04 = (C35681md) r1.A7N.get();
        this.A05 = (AW1) r1.A7B.get();
    }
}
