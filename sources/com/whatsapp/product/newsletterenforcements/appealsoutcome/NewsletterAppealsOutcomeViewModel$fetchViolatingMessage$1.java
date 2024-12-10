package com.whatsapp.product.newsletterenforcements.appealsoutcome;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.AnonymousClass23N;
import X.C27621Wu;
import X.C29681ch;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C73273Tk;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1", f = "NewsletterAppealsOutcomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C29681ch $newsletterJid;
    public final /* synthetic */ long $serverMsdId;
    public int label;
    public final /* synthetic */ C73273Tk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1(C29681ch r2, C73273Tk r3, C30391dr r4, long j) {
        super(2, r4);
        this.this$0 = r3;
        this.$newsletterJid = r2;
        this.$serverMsdId = j;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1(this.$newsletterJid, this.this$0, r8, this.$serverMsdId);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass206 A03 = this.this$0.A04.A03(this.$newsletterJid, this.$serverMsdId);
            if (A03 != null) {
                C73273Tk r1 = this.this$0;
                if (!(A03 instanceof AnonymousClass23N)) {
                    r1.A01.A0E(A03);
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
