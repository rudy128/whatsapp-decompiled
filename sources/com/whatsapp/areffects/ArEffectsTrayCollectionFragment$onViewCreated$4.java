package com.whatsapp.areffects;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C37801q9;
import X.C87334Ve;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.ArEffectsTrayCollectionFragment$onViewCreated$4", f = "ArEffectsTrayCollectionFragment.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsTrayCollectionFragment$onViewCreated$4 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $accessoryButtons;
    public final /* synthetic */ ShimmerFrameLayout $shimmerLayout;
    public int label;
    public final /* synthetic */ ArEffectsTrayCollectionFragment this$0;

    @DebugMetadata(c = "com.whatsapp.areffects.ArEffectsTrayCollectionFragment$onViewCreated$4$1", f = "ArEffectsTrayCollectionFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.areffects.ArEffectsTrayCollectionFragment$onViewCreated$4$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            AnonymousClass1 r0 = new AnonymousClass1(shimmerFrameLayout, arEffectsTrayCollectionFragment, list, r6);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass1OX r6 = (AnonymousClass1OX) this.L$0;
                final ArEffectsTrayCollectionFragment arEffectsTrayCollectionFragment = arEffectsTrayCollectionFragment;
                AnonymousClass1 r0 = new AnonymousClass1OS((C30391dr) null) {
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r4) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public ArEffectsTrayCollectionFragment$onViewCreated$4(ShimmerFrameLayout shimmerFrameLayout, ArEffectsTrayCollectionFragment arEffectsTrayCollectionFragment, List list, C30391dr r5) {
                            super(2, r5);
                            this.this$0 = arEffectsTrayCollectionFragment;
                            this.$shimmerLayout = shimmerFrameLayout;
                            this.$accessoryButtons = list;
                        }

                        public final C30391dr create(Object obj, C30391dr r6) {
                            return new ArEffectsTrayCollectionFragment$onViewCreated$4(this.$shimmerLayout, this.this$0, this.$accessoryButtons, r6);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                C37801q9 A1G = this.this$0.A1G();
                                C23401Fx r5 = C23401Fx.STARTED;
                                final ArEffectsTrayCollectionFragment arEffectsTrayCollectionFragment = this.this$0;
                                final ShimmerFrameLayout shimmerFrameLayout = this.$shimmerLayout;
                                final List list = this.$accessoryButtons;
                                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                this.label = 1;
                                if (C87334Ve.A01(r5, A1G, this, r0) == r8) {
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
                            return ((ArEffectsTrayCollectionFragment$onViewCreated$4) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
                        }
                    }
