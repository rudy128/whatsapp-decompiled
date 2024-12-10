package com.whatsapp.camera.areffects;

import X.AnonymousClass000;
import X.AnonymousClass1F9;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.C23401Fx;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C75393hQ;
import X.C87334Ve;
import X.C88604aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.camera.areffects.CameraArEffectsBannerCoordinator$1", f = "CameraArEffectsBannerCoordinator.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class CameraArEffectsBannerCoordinator$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1F9 $lifecycleOwner;
    public int label;
    public final /* synthetic */ C75393hQ this$0;

    @DebugMetadata(c = "com.whatsapp.camera.areffects.CameraArEffectsBannerCoordinator$1$1", f = "CameraArEffectsBannerCoordinator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.camera.areffects.CameraArEffectsBannerCoordinator$1$1  reason: invalid class name */
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
                C23421Fz A18 = AnonymousClass3MX.A18(C75393hQ.this.A00.A0B);
                final C75393hQ r2 = C75393hQ.this;
                C88604aC.A04(new AnonymousClass1OS((C30391dr) null) {
                    public /* synthetic */ Object L$0;
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r4) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public CameraArEffectsBannerCoordinator$1(AnonymousClass1F9 r2, C75393hQ r3, C30391dr r4) {
                            super(2, r4);
                            this.$lifecycleOwner = r2;
                            this.this$0 = r3;
                        }

                        public final C30391dr create(Object obj, C30391dr r5) {
                            return new CameraArEffectsBannerCoordinator$1(this.$lifecycleOwner, this.this$0, r5);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                AnonymousClass1F9 r4 = this.$lifecycleOwner;
                                C23401Fx r3 = C23401Fx.STARTED;
                                final C75393hQ r2 = this.this$0;
                                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                this.label = 1;
                                if (C87334Ve.A01(r3, r4, this, r0) == r6) {
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
                            return ((CameraArEffectsBannerCoordinator$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
                        }
                    }
