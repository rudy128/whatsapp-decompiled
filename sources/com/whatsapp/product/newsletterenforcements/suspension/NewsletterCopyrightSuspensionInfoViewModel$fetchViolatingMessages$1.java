package com.whatsapp.product.newsletterenforcements.suspension;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass1YD;
import X.AnonymousClass206;
import X.AnonymousClass23N;
import X.AnonymousClass3MZ;
import X.AnonymousClass445;
import X.C17890vO;
import X.C27621Wu;
import X.C29681ch;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C86994Tw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.suspension.NewsletterCopyrightSuspensionInfoViewModel$fetchViolatingMessages$1", f = "NewsletterCopyrightSuspensionInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterCopyrightSuspensionInfoViewModel$fetchViolatingMessages$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $enforcementList;
    public final /* synthetic */ C29681ch $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterCopyrightSuspensionInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterCopyrightSuspensionInfoViewModel$fetchViolatingMessages$1(C29681ch r2, NewsletterCopyrightSuspensionInfoViewModel newsletterCopyrightSuspensionInfoViewModel, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = newsletterCopyrightSuspensionInfoViewModel;
        this.$newsletterJid = r2;
        this.$enforcementList = list;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new NewsletterCopyrightSuspensionInfoViewModel$fetchViolatingMessages$1(this.$newsletterJid, this.this$0, this.$enforcementList, r6);
    }

    public final Object invokeSuspend(Object obj) {
        Long A04;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1E7 A0E = this.this$0.A01.A0E(this.$newsletterJid);
            List<AnonymousClass445> list = this.$enforcementList;
            ArrayList A13 = AnonymousClass000.A13();
            for (AnonymousClass445 r0 : list) {
                String str = r0.A07;
                if (!(str == null || (A04 = AnonymousClass1YD.A04(str)) == null)) {
                    A13.add(A04);
                }
            }
            NewsletterCopyrightSuspensionInfoViewModel newsletterCopyrightSuspensionInfoViewModel = this.this$0;
            C29681ch r6 = this.$newsletterJid;
            ArrayList A132 = AnonymousClass000.A13();
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                AnonymousClass206 A03 = newsletterCopyrightSuspensionInfoViewModel.A02.A03(r6, C17890vO.A07(it));
                if (A03 != null) {
                    A132.add(A03);
                }
            }
            ArrayList A133 = AnonymousClass000.A13();
            for (Object next : A132) {
                AnonymousClass3MZ.A1V(next, A133, next instanceof AnonymousClass23N ? 1 : 0);
            }
            this.this$0.A00.A0E(new C86994Tw(A0E, A133));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterCopyrightSuspensionInfoViewModel$fetchViolatingMessages$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
