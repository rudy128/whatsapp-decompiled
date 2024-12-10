package com.whatsapp.newsletter.mex;

import X.AnonymousClass10E;
import X.AnonymousClass1PY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BX;
import X.C133836pa;
import X.C20131A8r;
import X.C22516BAz;
import android.content.Context;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;

public final class GetDirectoryNewslettersGraphqlJob extends BaseNewslettersJob {
    public transient AnonymousClass1PY A00;
    public transient C133836pa A01;
    public transient C20131A8r A02;
    public C22516BAz callback;
    public final boolean isRecommended;
    public final int limit;
    public final String query;
    public final String sortField;
    public final String sortOrder;

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public GetDirectoryNewslettersGraphqlJob(C22516BAz bAz, int i, boolean z) {
        super("GetNewsletterMetadataJob");
        this.query = null;
        this.sortField = "SUBSCRIBER_COUNT";
        this.sortOrder = "DESCENDING";
        this.limit = i;
        this.isRecommended = z;
        this.callback = bAz;
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) AnonymousClass8BX.A0H(context);
        this.A00 = AnonymousClass3Ma.A0l(r1);
        this.A02 = AnonymousClass8BT.A0P(r1);
        this.A01 = (C133836pa) r1.A7D.get();
    }

    public GetDirectoryNewslettersGraphqlJob() {
        this((C22516BAz) null, 500, false);
    }
}
