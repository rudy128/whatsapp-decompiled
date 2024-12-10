package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4GU;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C73353Va;
import X.C84854Lc;
import X.C87334Ve;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoFragment$onViewCreated$2", f = "EventInfoFragment.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoFragment$onViewCreated$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ EventInfoFragment this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventInfoFragment$onViewCreated$2$1", f = "EventInfoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventInfoFragment$onViewCreated$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C84854Lc r3 = ((C73353Va) EventInfoFragment.this.A0C.getValue()).A03;
                final EventInfoFragment eventInfoFragment = EventInfoFragment.this;
                AnonymousClass4GU.A00(r3, new AnonymousClass1OS((C30391dr) null) {
                    public /* synthetic */ int I$0;
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r4) {
                        AnonymousClass1 r1 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public EventInfoFragment$onViewCreated$2(EventInfoFragment eventInfoFragment, C30391dr r3) {
                            super(2, r3);
                            this.this$0 = eventInfoFragment;
                        }

                        public final C30391dr create(Object obj, C30391dr r4) {
                            return new EventInfoFragment$onViewCreated$2(this.this$0, r4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return new EventInfoFragment$onViewCreated$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                final EventInfoFragment eventInfoFragment = this.this$0;
                                C23401Fx r2 = C23401Fx.STARTED;
                                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                this.label = 1;
                                if (C87334Ve.A01(r2, eventInfoFragment, this, r0) == r5) {
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
