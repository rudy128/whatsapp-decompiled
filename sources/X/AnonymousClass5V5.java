package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.product.newsletterenforcements.disputesettlement.NewsletterSeeOptionsFragment;

/* renamed from: X.5V5  reason: invalid class name */
public final class AnonymousClass5V5 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass4UN $data;
    public final /* synthetic */ NewsletterSeeOptionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5V5(NewsletterSeeOptionsFragment newsletterSeeOptionsFragment, AnonymousClass4UN r3) {
        super(1);
        this.$data = r3;
        this.this$0 = newsletterSeeOptionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4UN r0 = this.$data;
        C89364cL r3 = new C89364cL(r0.A00, r0.A01);
        this.this$0.A26();
        Context A14 = this.this$0.A14();
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(A14.getPackageName(), "com.whatsapp.product.newsletterenforcements.integrityappeals.NewsletterRequestReviewActivity");
        A0A.putExtra("appeal-request", r3);
        this.this$0.A1k(A0A);
        return C27621Wu.A00;
    }
}
