package com.whatsapp.calling.incallnotifbanner.view;

import X.AnonymousClass000;
import X.AnonymousClass1F9;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.C115065tL;
import X.C160968Au;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBannerCoordinator$bindViewModel$3", f = "VoipInCallNotifBannerCoordinator.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
public final class VoipInCallNotifBannerCoordinator$bindViewModel$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1F9 $lifecycleOwner;
    public final /* synthetic */ C160968Au $viewModel;
    public int label;
    public final /* synthetic */ C115065tL this$0;

    @DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBannerCoordinator$bindViewModel$3$1", f = "VoipInCallNotifBannerCoordinator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBannerCoordinator$bindViewModel$3$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            AnonymousClass1 r0 = new AnonymousClass1(r2, r3, r5);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                final C160968Au r3 = r3;
                final C115065tL r2 = r2;
                AnonymousClass3MX.A1Q(new AnonymousClass1OS((C30391dr) null) {
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r5) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public VoipInCallNotifBannerCoordinator$bindViewModel$3(AnonymousClass1F9 r2, C115065tL r3, C160968Au r4, C30391dr r5) {
                            super(2, r5);
                            this.$lifecycleOwner = r2;
                            this.$viewModel = r4;
                            this.this$0 = r3;
                        }

                        public final C30391dr create(Object obj, C30391dr r6) {
                            return new VoipInCallNotifBannerCoordinator$bindViewModel$3(this.$lifecycleOwner, this.this$0, this.$viewModel, r6);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                AnonymousClass1F9 r5 = this.$lifecycleOwner;
                                C23401Fx r4 = C23401Fx.STARTED;
                                final C160968Au r3 = this.$viewModel;
                                final C115065tL r2 = this.this$0;
                                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                this.label = 1;
                                if (C87334Ve.A01(r4, r5, this, r0) == r7) {
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
                            return ((VoipInCallNotifBannerCoordinator$bindViewModel$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
                        }
                    }
