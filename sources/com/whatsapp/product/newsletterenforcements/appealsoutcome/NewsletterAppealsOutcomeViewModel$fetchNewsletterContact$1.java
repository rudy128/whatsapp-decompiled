package com.whatsapp.product.newsletterenforcements.appealsoutcome;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C73273Tk;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1", f = "NewsletterAppealsOutcomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C73273Tk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1(C73273Tk r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C73273Tk r0 = this.this$0;
            r0.A00.A0E(r0.A02.A0E(r0.A03));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
