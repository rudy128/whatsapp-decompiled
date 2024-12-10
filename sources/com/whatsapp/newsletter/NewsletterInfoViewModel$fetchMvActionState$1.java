package com.whatsapp.newsletter;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C19880zA;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C76823oU;
import X.C82774Ca;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.NewsletterInfoViewModel$fetchMvActionState$1", f = "NewsletterInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterInfoViewModel$fetchMvActionState$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C76823oU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterInfoViewModel$fetchMvActionState$1(C76823oU r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new NewsletterInfoViewModel$fetchMvActionState$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterInfoViewModel$fetchMvActionState$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C76823oU r2 = this.this$0;
            C19880zA r1 = r2.A09;
            if (r1.A07()) {
                r1.A03();
                throw AnonymousClass000.A0s("isMetaVerifiedSubscriptionActive");
            }
            r2.A06.A0E(C82774Ca.None);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
