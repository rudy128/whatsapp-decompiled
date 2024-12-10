package com.whatsapp.newsletterenforcements.repository;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1CJ;
import X.AnonymousClass1OS;
import X.AnonymousClass4NT;
import X.C17880vN;
import X.C18070vi;
import X.C18460wS;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C29681ch;
import X.C29691ci;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C32991i5;
import X.C46162Dk;
import X.C86354Rh;
import X.C86444Rq;
import X.C86674Sp;
import X.C86684Sq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.repository.NewsletterGeosuspensionRepo$setGeosuspensions$2", f = "NewsletterGeosuspensionRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterGeosuspensionRepo$setGeosuspensions$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $geoStates;
    public final /* synthetic */ C29681ch $newsletterJid;
    public int label;
    public final /* synthetic */ AnonymousClass4NT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterGeosuspensionRepo$setGeosuspensions$2(C29681ch r2, AnonymousClass4NT r3, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$newsletterJid = r2;
        this.$geoStates = list;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new NewsletterGeosuspensionRepo$setGeosuspensions$2(this.$newsletterJid, this.this$0, this.$geoStates, r6);
    }

    public final Object invokeSuspend(Object obj) {
        List<C86674Sp> list;
        C46162Dk r3;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C86354Rh r2 = (C86354Rh) this.this$0.A01.get();
            C29681ch r1 = this.$newsletterJid;
            synchronized (r2) {
                C18070vi.A0d(r1, 0);
                C86684Sq A00 = r2.A00(r1);
                if (A00 != null) {
                    list = C29431cG.A0t(A00.A00);
                } else {
                    list = C18460wS.A00;
                }
            }
            ArrayList A0D = C29351c6.A0D(list);
            for (C86674Sp r0 : list) {
                A0D.add(r0.A00);
            }
            if (!C29431cG.A14(C29431cG.A12(this.$geoStates), C29431cG.A12(A0D)).isEmpty()) {
                ((C86444Rq) this.this$0.A00.get()).A01(this.$newsletterJid, AnonymousClass00R.A0C);
            }
            if (this.$geoStates.isEmpty()) {
                C86444Rq r4 = (C86444Rq) this.this$0.A00.get();
                C29681ch r12 = this.$newsletterJid;
                C18070vi.A0d(r12, 0);
                C29691ci A002 = AnonymousClass1CJ.A00(r4.A00, r12);
                if ((A002 instanceof C46162Dk) && (r3 = (C46162Dk) A002) != null) {
                    ((C32991i5) r4.A01.get()).A08(r3.A0M(), ((1 << 2) ^ -1) & r3.A01);
                }
            }
            C86354Rh r5 = (C86354Rh) this.this$0.A01.get();
            C29681ch r42 = this.$newsletterJid;
            List list2 = this.$geoStates;
            synchronized (r5) {
                C18070vi.A0h(r42, list2);
                ArrayList A0D2 = C29351c6.A0D(list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    A0D2.add(new C86674Sp(C17880vN.A0v(it)));
                }
                r5.A01(r42, new C86684Sq(C29431cG.A12(A0D2)));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterGeosuspensionRepo$setGeosuspensions$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
