package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3VY;
import X.C18070vi;
import X.C23391Fw;
import X.C23401Fx;
import X.C23421Fz;
import X.C26092CsA;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C99234sU;
import X.C99574t7;
import android.os.Bundle;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$3", f = "EventCreateOrEditFragment.kt", i = {}, l = {380}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditFragment$onViewCreated$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Bundle $savedInstanceState;
    public int label;
    public final /* synthetic */ EventCreateOrEditFragment this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$3$1", f = "EventCreateOrEditFragment.kt", i = {}, l = {383}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$3$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(bundle, eventCreateOrEditFragment, r5);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                EventCreateOrEditFragment eventCreateOrEditFragment = eventCreateOrEditFragment;
                AnonymousClass3VY r0 = eventCreateOrEditFragment.A0M;
                if (r0 == null) {
                    C18070vi.A11("eventCreateOrEditViewModel");
                    throw null;
                }
                C23421Fz A00 = C26092CsA.A00(new C99234sU(16), C26092CsA.A00, r0.A0O);
                C99574t7 r02 = new C99574t7(bundle, eventCreateOrEditFragment, 17);
                this.label = 1;
                if (A00.BFC(this, r02) == r6) {
                    return r6;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditFragment$onViewCreated$3(Bundle bundle, EventCreateOrEditFragment eventCreateOrEditFragment, C30391dr r4) {
        super(2, r4);
        this.this$0 = eventCreateOrEditFragment;
        this.$savedInstanceState = bundle;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EventCreateOrEditFragment$onViewCreated$3(this.$savedInstanceState, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23391Fw r5 = this.this$0.A0L;
            C18070vi.A0X(r5);
            C23401Fx r4 = C23401Fx.CREATED;
            final EventCreateOrEditFragment eventCreateOrEditFragment = this.this$0;
            final Bundle bundle = this.$savedInstanceState;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A00(r4, r5, this, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventCreateOrEditFragment$onViewCreated$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
