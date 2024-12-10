package com.whatsapp.notification;

import X.AnonymousClass000;
import X.AnonymousClass112;
import X.AnonymousClass18K;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1Nb;
import X.AnonymousClass1OS;
import X.AnonymousClass2UI;
import X.C17880vN;
import X.C17890vO;
import X.C194379rd;
import X.C217217d;
import X.C25161Nd;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30271df;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C47142Hg;
import X.C55402fi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.notification.BadgeNotificationApplicationStateObserver$onAppForegrounded$1", f = "BadgeNotificationApplicationStateObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BadgeNotificationApplicationStateObserver$onAppForegrounded$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C30271df this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeNotificationApplicationStateObserver$onAppForegrounded$1(C30271df r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new BadgeNotificationApplicationStateObserver$onAppForegrounded$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BadgeNotificationApplicationStateObserver$onAppForegrounded$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Long valueOf;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C30271df r3 = this.this$0;
            HashSet A0E = ((C25161Nd) r3.A04.get()).A0E();
            ArrayList A0d = ((AnonymousClass1Nb) r3.A03.get()).A0d(false);
            ArrayList A0D = C29351c6.A0D(A0d);
            Iterator it = A0d.iterator();
            while (it.hasNext()) {
                A0D.add(((C194379rd) it.next()).A01);
            }
            A0E.removeAll(C29431cG.A12(A0D));
            C47142Hg r2 = new C47142Hg();
            r2.A00 = 0;
            r2.A04 = C17880vN.A0n(A0E.size());
            Long A0L = C17890vO.A0L();
            Iterator it2 = A0E.iterator();
            while (it2.hasNext()) {
                AnonymousClass1BI A0Q = C17880vN.A0Q(it2);
                A0L = C17880vN.A0o((long) ((AnonymousClass1CJ) r3.A00.get()).A03(A0Q), A0L.longValue());
            }
            r2.A03 = A0L;
            C217217d r1 = (C217217d) r3.A05.get();
            if (!AnonymousClass112.A01()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(AnonymousClass2UI.A00(r1));
            }
            r2.A02 = valueOf;
            r2.A01 = Integer.valueOf(r3.A01.A01() ? 1 : 0);
            ((AnonymousClass18K) r3.A06.get()).CC7(r2);
            C55402fi r22 = (C55402fi) r3.A02.get();
            if (r22.A03.A01()) {
                r22.A01.A0E(true);
                r22.A02.A05();
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
