package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3VY;
import X.AnonymousClass4GU;
import X.C18070vi;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$6", f = "EventCreateOrEditFragment.kt", i = {}, l = {417}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditFragment$onViewCreated$6 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ EventCreateOrEditFragment this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$6$1", f = "EventCreateOrEditFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$6$1  reason: invalid class name */
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
                AnonymousClass1OX r4 = (AnonymousClass1OX) this.L$0;
                final EventCreateOrEditFragment eventCreateOrEditFragment = EventCreateOrEditFragment.this;
                AnonymousClass3VY r0 = eventCreateOrEditFragment.A0M;
                if (r0 == null) {
                    C18070vi.A11("eventCreateOrEditViewModel");
                    throw null;
                }
                AnonymousClass4GU.A00(r0.A08, new AnonymousClass1OS((C30391dr) null) {
                    public /* synthetic */ Object L$0;
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r4) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public EventCreateOrEditFragment$onViewCreated$6(EventCreateOrEditFragment eventCreateOrEditFragment, C30391dr r3) {
                            super(2, r3);
                            this.this$0 = eventCreateOrEditFragment;
                        }

                        public final C30391dr create(Object obj, C30391dr r4) {
                            return new EventCreateOrEditFragment$onViewCreated$6(this.this$0, r4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return new EventCreateOrEditFragment$onViewCreated$6(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                final EventCreateOrEditFragment eventCreateOrEditFragment = this.this$0;
                                C23401Fx r2 = C23401Fx.STARTED;
                                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                this.label = 1;
                                if (C87334Ve.A01(r2, eventCreateOrEditFragment, this, r0) == r5) {
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
