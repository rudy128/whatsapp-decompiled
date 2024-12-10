package com.whatsapp.newsletter.mex;

import X.AWZ;
import X.AnonymousClass10E;
import X.AnonymousClass1CJ;
import X.AnonymousClass1PY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.BB0;
import X.C198349yC;
import X.C20131A8r;
import X.C32991i5;
import android.content.Context;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;
import java.util.List;

public final class NewsletterDirectoryCategoriesPreviewGQLJob extends BaseNewslettersJob {
    public transient AnonymousClass1PY A00;
    public transient C20131A8r A01;
    public transient AnonymousClass1CJ A02;
    public transient C32991i5 A03;
    public C198349yC cache;
    public BB0 callback;
    public final List categories;
    public final String countryCode;
    public final int limit;

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public NewsletterDirectoryCategoriesPreviewGQLJob(C198349yC r2, BB0 bb0, String str, List list, int i) {
        super("NewsletterDirectoryCategoriesPreviewGQLJob");
        this.categories = list;
        this.countryCode = str;
        this.limit = i;
        this.cache = r2;
        this.callback = new AWZ(r2, bb0, str);
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) AnonymousClass8BX.A0H(context);
        this.A02 = AnonymousClass3Ma.A0d(r1);
        this.A00 = AnonymousClass3Ma.A0l(r1);
        this.A03 = AnonymousClass8BU.A0G(r1);
        this.A01 = AnonymousClass8BT.A0P(r1);
    }
}
