package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.product.newsletterenforcements.disputesettlement.NewsletterSeeOptionsFragment;

/* renamed from: X.5V3  reason: invalid class name */
public final class AnonymousClass5V3 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass4UN $data;
    public final /* synthetic */ NewsletterSeeOptionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5V3(NewsletterSeeOptionsFragment newsletterSeeOptionsFragment, AnonymousClass4UN r3) {
        super(1);
        this.this$0 = newsletterSeeOptionsFragment;
        this.$data = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A26();
        Context A14 = this.this$0.A14();
        AnonymousClass4UN r0 = this.$data;
        C29681ch r4 = r0.A00;
        C89494cY r3 = r0.A01;
        Intent A0G = C72463Mc.A0G(A14);
        A0G.setClassName(A14.getPackageName(), "com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity");
        AnonymousClass3MY.A13(A0G, r4, "jid");
        A0G.putExtra("newsletter-appeal-data", r3);
        this.this$0.A1k(A0G);
        return C27621Wu.A00;
    }
}
