package com.whatsapp.calling.banner.view;

import X.AnonymousClass000;
import X.AnonymousClass1F9;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3RI;
import X.AnonymousClass5AR;
import X.C18020vd;
import X.C18040vf;
import X.C23401Fx;
import X.C23421Fz;
import X.C27183DXs;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C61182pG;
import X.C87334Ve;
import X.C99454sq;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.banner.view.MinimizedCallBanner$onAttach$1", f = "MinimizedCallBanner.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
public final class MinimizedCallBanner$onAttach$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1F9 $lifecycleOwner;
    public int label;
    public final /* synthetic */ AnonymousClass3RI this$0;

    @DebugMetadata(c = "com.whatsapp.calling.banner.view.MinimizedCallBanner$onAttach$1$1", f = "MinimizedCallBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.banner.view.MinimizedCallBanner$onAttach$1$1  reason: invalid class name */
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
                final AnonymousClass1OX r5 = (AnonymousClass1OX) this.L$0;
                MinimizedCallBannerViewModel viewModel = AnonymousClass3RI.this.getViewModel();
                if (!viewModel.A03.A01() || !(!C61182pG.A00((C61182pG) viewModel.A05.get()))) {
                    AnonymousClass3RI.A05(AnonymousClass3RI.this, false);
                }
                boolean A05 = C18020vd.A05(C18040vf.A01, AnonymousClass3RI.this.getAbProps(), 8329);
                C23421Fz r6 = AnonymousClass3RI.this.getViewModel().A07;
                if (!A05) {
                    r6 = new C99454sq(new AnonymousClass5AR((C30391dr) null, r6, 100), 14);
                }
                final AnonymousClass3RI r0 = AnonymousClass3RI.this;
                C27183DXs dXs = new C27183DXs((AnonymousClass1OS) new AnonymousClass1OS((C30391dr) null) {
                    public /* synthetic */ Object L$0;
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r5) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public MinimizedCallBanner$onAttach$1(AnonymousClass1F9 r2, AnonymousClass3RI r3, C30391dr r4) {
                            super(2, r4);
                            this.$lifecycleOwner = r2;
                            this.this$0 = r3;
                        }

                        public final C30391dr create(Object obj, C30391dr r5) {
                            return new MinimizedCallBanner$onAttach$1(this.$lifecycleOwner, this.this$0, r5);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                AnonymousClass1F9 r4 = this.$lifecycleOwner;
                                C23401Fx r3 = C23401Fx.STARTED;
                                final AnonymousClass3RI r2 = this.this$0;
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
                            return ((MinimizedCallBanner$onAttach$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
                        }
                    }
