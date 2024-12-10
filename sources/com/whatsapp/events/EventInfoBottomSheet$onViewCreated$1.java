package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C23391Fw;
import X.C23401Fx;
import X.C23421Fz;
import X.C26092CsA;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C73353Va;
import X.C87334Ve;
import X.C99234sU;
import X.C99614tB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoBottomSheet$onViewCreated$1", f = "EventInfoBottomSheet.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoBottomSheet$onViewCreated$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ EventInfoBottomSheet this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventInfoBottomSheet$onViewCreated$1$1", f = "EventInfoBottomSheet.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventInfoBottomSheet$onViewCreated$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                EventInfoBottomSheet eventInfoBottomSheet = EventInfoBottomSheet.this;
                C73353Va r0 = eventInfoBottomSheet.A04;
                if (r0 == null) {
                    C18070vi.A11("eventInfoViewModel");
                    throw null;
                }
                C23421Fz A00 = C26092CsA.A00(new C99234sU(18), C26092CsA.A00, r0.A0F);
                C99614tB A002 = C99614tB.A00(eventInfoBottomSheet, 23);
                this.label = 1;
                if (A00.BFC(this, A002) == r5) {
                    return r5;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoBottomSheet$onViewCreated$1(EventInfoBottomSheet eventInfoBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = eventInfoBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new EventInfoBottomSheet$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EventInfoBottomSheet$onViewCreated$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23391Fw r4 = this.this$0.A0L;
            C18070vi.A0X(r4);
            C23401Fx r3 = C23401Fx.CREATED;
            final EventInfoBottomSheet eventInfoBottomSheet = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A00(r3, r4, this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
