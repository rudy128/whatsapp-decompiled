package com.whatsapp.newsletterenforcements.repository;

import X.AnonymousClass000;
import X.AnonymousClass121;
import X.AnonymousClass122;
import X.AnonymousClass1CJ;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.AnonymousClass3MZ;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C27621Wu;
import X.C29681ch;
import X.C29691ci;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C57722jX;
import X.C86274Qz;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.repository.NewsletterMessageEnforcementRepo$setMessageEnforcementIds$2", f = "NewsletterMessageEnforcementRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterMessageEnforcementRepo$setMessageEnforcementIds$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $messageIds;
    public final /* synthetic */ C29681ch $newsletterJid;
    public int label;
    public final /* synthetic */ C86274Qz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterMessageEnforcementRepo$setMessageEnforcementIds$2(C29681ch r2, C86274Qz r3, List list, C30391dr r5) {
        super(2, r5);
        this.$messageIds = list;
        this.this$0 = r3;
        this.$newsletterJid = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        List list = this.$messageIds;
        return new NewsletterMessageEnforcementRepo$setMessageEnforcementIds$2(this.$newsletterJid, this.this$0, list, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            List list = this.$messageIds;
            C86274Qz r5 = this.this$0;
            C29681ch r4 = this.$newsletterJid;
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass206 A03 = C17880vN.A0c(((AnonymousClass122) ((AnonymousClass121) r5.A01.get())).A1E).A03(r4, C17890vO.A07(it));
                if (A03 != null) {
                    A13.add(A03);
                }
            }
            C86274Qz r8 = this.this$0;
            C29681ch r7 = this.$newsletterJid;
            C18070vi.A0d(r7, 0);
            C29691ci A00 = AnonymousClass1CJ.A00(r8.A00, r7);
            if (A00 == null) {
                Log.e("NewsletterMessageEnforcementUpdater/Unexpectedly couldn't find newsletter to update");
            } else {
                ArrayList A002 = ((C57722jX) r8.A02.get()).A00(A00);
                ArrayList A132 = AnonymousClass000.A13();
                Iterator it2 = A002.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    AnonymousClass206 r3 = (AnonymousClass206) next;
                    if (!(A13 instanceof Collection) || !A13.isEmpty()) {
                        Iterator it3 = A13.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (C18070vi.A18(AnonymousClass3MZ.A10(it3), r3.A0v)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    A132.add(next);
                }
                r8.A00(r7, A13, A132);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterMessageEnforcementRepo$setMessageEnforcementIds$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
