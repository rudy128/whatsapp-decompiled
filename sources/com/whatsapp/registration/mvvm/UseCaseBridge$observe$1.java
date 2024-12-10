package com.whatsapp.registration.mvvm;

import X.AnonymousClass000;
import X.AnonymousClass1F9;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass2SS;
import X.AnonymousClass4WB;
import X.AnonymousClass5WO;
import X.C22851Dl;
import X.C23381Fv;
import X.C23401Fx;
import X.C23761Hn;
import X.C27183DXs;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C86374Rj;
import X.C87334Ve;
import X.C88604aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.mvvm.UseCaseBridge$observe$1", f = "UseCaseBridge.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
public final class UseCaseBridge$observe$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1F9 $lifecycleOwner;
    public final /* synthetic */ C22851Dl $observer;
    public int label;
    public final /* synthetic */ C86374Rj this$0;

    @DebugMetadata(c = "com.whatsapp.registration.mvvm.UseCaseBridge$observe$1$1", f = "UseCaseBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.registration.mvvm.UseCaseBridge$observe$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r3, r2, r4, r6);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass5WO A01 = AnonymousClass4WB.A01(r4.A00);
                final C22851Dl r2 = r2;
                C88604aC.A03(AnonymousClass1OW.A03(C23761Hn.A00().A01, AnonymousClass2SS.A00(r3)), new C27183DXs((AnonymousClass1OS) new AnonymousClass1OS((C30391dr) null) {
                    public /* synthetic */ Object L$0;
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r4) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public UseCaseBridge$observe$1(AnonymousClass1F9 r2, C22851Dl r3, C86374Rj r4, C30391dr r5) {
                            super(2, r5);
                            this.$lifecycleOwner = r2;
                            this.this$0 = r4;
                            this.$observer = r3;
                        }

                        public final C30391dr create(Object obj, C30391dr r6) {
                            return new UseCaseBridge$observe$1(this.$lifecycleOwner, this.$observer, this.this$0, r6);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                C23381Fv lifecycle = this.$lifecycleOwner.getLifecycle();
                                C23401Fx r5 = C23401Fx.CREATED;
                                final C86374Rj r4 = this.this$0;
                                final AnonymousClass1F9 r3 = this.$lifecycleOwner;
                                final C22851Dl r2 = this.$observer;
                                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                this.label = 1;
                                if (C87334Ve.A00(r5, lifecycle, this, r0) == r8) {
                                    return r8;
                                }
                            } else if (i == 1) {
                                C30691eM.A01(obj);
                            } else {
                                throw AnonymousClass000.A0l();
                            }
                            return C27621Wu.A00;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return ((UseCaseBridge$observe$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
                        }
                    }
