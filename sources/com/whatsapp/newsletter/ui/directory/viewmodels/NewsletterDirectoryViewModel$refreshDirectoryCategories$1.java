package com.whatsapp.newsletter.ui.directory.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass7KE;
import X.C107095Yj;
import X.C111285jR;
import X.C179619Ir;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C198349yC;
import X.C25001Mm;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C35681md;
import com.whatsapp.newsletter.mex.NewsletterDirectoryCategoriesPreviewGQLJob;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.ui.directory.viewmodels.NewsletterDirectoryViewModel$refreshDirectoryCategories$1", f = "NewsletterDirectoryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterDirectoryViewModel$refreshDirectoryCategories$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C111285jR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterDirectoryViewModel$refreshDirectoryCategories$1(C111285jR r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new NewsletterDirectoryViewModel$refreshDirectoryCategories$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterDirectoryViewModel$refreshDirectoryCategories$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass7KE r6 = this.this$0.A02;
            C107095Yj r0 = r6.A00;
            if (r0 != null) {
                r0.cancel();
            }
            C35681md r3 = r6.A06;
            List<C179619Ir> A11 = AnonymousClass3MW.A11(r6.A05.A01);
            ArrayList A0D = C29351c6.A0D(A11);
            for (C179619Ir name : A11) {
                A0D.add(name.name());
            }
            String str = r6.A01;
            if (C18070vi.A18(str, "Global")) {
                str = null;
            }
            NewsletterDirectoryCategoriesPreviewGQLJob newsletterDirectoryCategoriesPreviewGQLJob = new NewsletterDirectoryCategoriesPreviewGQLJob((C198349yC) r3.A0Q.get(), r6, str, A0D, C18020vd.A00(C18040vf.A02, r3.A0F, 7986));
            ((C25001Mm) r3.A0Z.get()).A01(newsletterDirectoryCategoriesPreviewGQLJob);
            r6.A00 = newsletterDirectoryCategoriesPreviewGQLJob;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
