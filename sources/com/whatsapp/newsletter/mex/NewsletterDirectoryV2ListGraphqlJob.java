package com.whatsapp.newsletter.mex;

import X.AWY;
import X.AnonymousClass6RR;
import X.BCA;
import X.C179619Ir;
import X.C198139xq;

public final class NewsletterDirectoryV2ListGraphqlJob extends BaseNewsletterDirectoryV2GraphqlJob {
    public C198139xq cache;
    public final String countryCode;
    public final C179619Ir directoryCategory;
    public final int limit;
    public final BCA originalCallback;
    public final String startCursor;
    public final AnonymousClass6RR type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterDirectoryV2ListGraphqlJob(C198139xq r9, C179619Ir r10, AnonymousClass6RR r11, BCA bca, String str, String str2, int i) {
        super("NewsletterDirectoryV2ListJob");
        String str3;
        if (r10 != null) {
            str3 = r10.name();
        } else {
            str3 = null;
        }
        AWY awy = new AWY(r9, r11, bca, str, str3, str2);
        this.callback = awy;
        this.type = r11;
        this.directoryCategory = r10;
        this.countryCode = str;
        this.limit = i;
        this.startCursor = str2;
        this.cache = r9;
        this.originalCallback = bca;
    }

    public void cancel() {
        super.cancel();
        this.callback = null;
    }
}
