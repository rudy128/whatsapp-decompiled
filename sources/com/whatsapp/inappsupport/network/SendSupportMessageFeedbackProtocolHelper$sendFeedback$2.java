package com.whatsapp.inappsupport.network;

import X.AnonymousClass000;
import X.AnonymousClass1O9;
import X.AnonymousClass1OS;
import X.AnonymousClass1OZ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BY;
import X.AnonymousClass9F7;
import X.AnonymousClass9MQ;
import X.C108945cZ;
import X.C173538vF;
import X.C173548vG;
import X.C178699Ec;
import X.C17890vO;
import X.C18070vi;
import X.C185959dQ;
import X.C193859qm;
import X.C197389wc;
import X.C21289Aha;
import X.C27621Wu;
import X.C29621ca;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C35541mP;
import X.C60482o6;
import X.C62672rm;
import X.C72453Mb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappsupport.network.SendSupportMessageFeedbackProtocolHelper$sendFeedback$2", f = "SendSupportMessageFeedbackProtocolHelper.kt", i = {0}, l = {50}, m = "invokeSuspend", n = {"sendFeedbackRequest"}, s = {"L$0"})
public final class SendSupportMessageFeedbackProtocolHelper$sendFeedback$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C193859qm $supportMessageFeedback;
    public Object L$0;
    public int label;
    public final /* synthetic */ C185959dQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendSupportMessageFeedbackProtocolHelper$sendFeedback$2(C193859qm r2, C185959dQ r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$supportMessageFeedback = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new SendSupportMessageFeedbackProtocolHelper$sendFeedback$2(this.$supportMessageFeedback, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass9F7 r1;
        String str;
        C35541mP r12;
        int i;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            String A0T = C17890vO.A0T(this.this$0.A00);
            C193859qm r0 = this.$supportMessageFeedback;
            String str2 = r0.A00;
            List list = r0.A01;
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int A0H = C72453Mb.A0H(it);
                if (A0H == 0) {
                    str = "positive";
                } else if (A0H == 1) {
                    str = "negative_irrelevant";
                } else if (A0H == 2) {
                    str = "negative_inaccurate";
                } else if (A0H == 3) {
                    str = "negative_repetitive";
                } else if (A0H == 4) {
                    str = "negative_harmful";
                } else if (A0H == 5) {
                    str = "negative_other";
                }
                A13.add(new C178699Ec(str, 4));
            }
            r1 = new AnonymousClass9F7(A0T, str2, (List) A13);
            this.L$0 = r1;
            this.label = 1;
            obj = ((AnonymousClass1OZ) C18070vi.A0E(this.this$0.A00)).A0A((C29621ca) r1.A00, A0T, this, 441, 32000, false);
            if (obj == r4) {
                return r4;
            }
        } else if (i2 == 1) {
            r1 = (AnonymousClass9F7) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass9MQ r15 = (AnonymousClass9MQ) obj;
        if (r15 instanceof C173548vG) {
            C29621ca r7 = ((C173548vG) r15).A00;
            C18070vi.A0d(r1, 2);
            C108945cZ.A1N(r7);
            Object obj2 = r1.A00;
            C62672rm A0s = AnonymousClass8BR.A0s();
            if (AnonymousClass8BY.A0W(r7, A0s, "Success", new String[]{"result", "status"}, false) == null) {
                throw AnonymousClass1O9.A00(A0s);
            } else if (C21289Aha.A01(r7, A0s, obj2, C197389wc.A00, 27) != null) {
                r12 = (C35541mP) this.this$0.A01.get();
                i = 14;
            } else {
                throw AnonymousClass1O9.A00(A0s);
            }
        } else {
            if (r15 instanceof C173538vF) {
                C60482o6.A01(((C173538vF) r15).A00);
                r12 = (C35541mP) this.this$0.A01.get();
                i = 13;
            }
            return C27621Wu.A00;
        }
        r12.A01(i);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SendSupportMessageFeedbackProtocolHelper$sendFeedback$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
