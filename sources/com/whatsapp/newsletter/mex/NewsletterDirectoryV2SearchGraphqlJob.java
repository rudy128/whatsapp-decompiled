package com.whatsapp.newsletter.mex;

import X.BCA;
import X.C179619Ir;

public final class NewsletterDirectoryV2SearchGraphqlJob extends BaseNewsletterDirectoryV2GraphqlJob {
    public final C179619Ir directoryCategory;
    public final int limit;
    public final String query;
    public final String startCursor;

    public NewsletterDirectoryV2SearchGraphqlJob(C179619Ir r2, BCA bca, String str, String str2, int i) {
        super("NewsletterDirectoryV2SearchJob");
        this.callback = bca;
        this.query = str;
        this.limit = i;
        this.startCursor = str2;
        this.directoryCategory = r2;
    }
}
