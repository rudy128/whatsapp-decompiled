package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1OS;
import X.AnonymousClass3C3;
import X.AnonymousClass3MW;
import X.AnonymousClass3VY;
import X.AnonymousClass4YY;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C33251iW;
import X.C445823z;
import X.C86794Tc;
import X.C88184Yq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditViewModel$onSendEventCreateOrEdit$3", f = "EventCreateOrEditViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditViewModel$onSendEventCreateOrEdit$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $hasMadeEventMessageEdits;
    public final /* synthetic */ C445823z $newEventMessage;
    public int label;
    public final /* synthetic */ AnonymousClass3VY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditViewModel$onSendEventCreateOrEdit$3(C445823z r2, AnonymousClass3VY r3, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = r3;
        this.$newEventMessage = r2;
        this.$hasMadeEventMessageEdits = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new EventCreateOrEditViewModel$onSendEventCreateOrEdit$3(this.$newEventMessage, this.this$0, r6, this.$hasMadeEventMessageEdits);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass3VY r3 = this.this$0;
            int intValue = r3.A0I.intValue();
            if (intValue == 0) {
                C445823z r6 = this.$newEventMessage;
                ((C88184Yq) r3.A0H.get()).A03(18);
                C33251iW r5 = r3.A03;
                long j = r3.A00;
                if (AnonymousClass3MW.A0d(r5.A1K).A05(r6.A0v.A00)) {
                    if (j > 0) {
                        r5.A19.CGF(new AnonymousClass3C3(r5, r6, 1, j));
                    } else {
                        r5.A0b(r6);
                        r5.A0U.BBY(r6);
                    }
                }
                if (AnonymousClass3VY.A08(r3)) {
                    AnonymousClass3VY.A03(r6, r3);
                }
            } else if (intValue == 1) {
                C445823z r52 = this.$newEventMessage;
                boolean z = this.$hasMadeEventMessageEdits;
                C445823z A0T = r3.A0T();
                if (A0T != null) {
                    if (A0T.A08 || ((AnonymousClass4YY) r3.A0O.getValue()).A03 == AnonymousClass00R.A0C) {
                        AnonymousClass3VY.A00(A0T, r3);
                    } else {
                        if (z) {
                            C33251iW r2 = r3.A03;
                            r52.A0b(536870912);
                            C33251iW.A0B(r2, A0T, r52);
                        }
                        if (AnonymousClass3VY.A08(r3)) {
                            AnonymousClass3VY.A03(A0T, r3);
                        }
                    }
                }
                return C27621Wu.A00;
            } else {
                throw AnonymousClass3MW.A14();
            }
            AnonymousClass3VY.A04(new C86794Tc(AnonymousClass00R.A00, (Integer) null), r3);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventCreateOrEditViewModel$onSendEventCreateOrEdit$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
