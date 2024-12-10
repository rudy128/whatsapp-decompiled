package com.whatsapp.areffects.tray;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3WK;
import X.AnonymousClass4S8;
import X.AnonymousClass4VF;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C37801q9;
import X.C87334Ve;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.tray.ArEffectsTrayFragment$onViewCreated$2", f = "ArEffectsTrayFragment.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsTrayFragment$onViewCreated$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass3WK $adapter;
    public final /* synthetic */ AnonymousClass4VF $configuration;
    public final /* synthetic */ CenteredSelectionRecyclerView $recyclerView;
    public final /* synthetic */ CircularProgressBar $selectedCircle;
    public final /* synthetic */ FrameLayout $selectedTextContainer;
    public final /* synthetic */ TextView $textView;
    public int label;
    public final /* synthetic */ ArEffectsTrayFragment this$0;

    @DebugMetadata(c = "com.whatsapp.areffects.tray.ArEffectsTrayFragment$onViewCreated$2$1", f = "ArEffectsTrayFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.areffects.tray.ArEffectsTrayFragment$onViewCreated$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r11) {
            ArEffectsTrayFragment arEffectsTrayFragment = arEffectsTrayFragment;
            AnonymousClass3WK r4 = r8;
            CenteredSelectionRecyclerView centeredSelectionRecyclerView = centeredSelectionRecyclerView;
            TextView textView = textView;
            AnonymousClass1 r0 = new AnonymousClass1(frameLayout, textView, circularProgressBar, r4, arEffectsTrayFragment, r10, centeredSelectionRecyclerView, r11);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass1OX r0 = (AnonymousClass1OX) this.L$0;
                final AnonymousClass4S8 r9 = (AnonymousClass4S8) AnonymousClass3MW.A12(AnonymousClass3MX.A0Y(arEffectsTrayFragment.A05).A0J).get(arEffectsTrayFragment.A04.getValue());
                if (r9 != null) {
                    final AnonymousClass3WK r1 = r8;
                    AnonymousClass1 r2 = new AnonymousClass1OS((C30391dr) null) {
                        public int label;

                        public final C30391dr create(Object obj, C30391dr r5) {
                            return 

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public ArEffectsTrayFragment$onViewCreated$2(FrameLayout frameLayout, TextView textView, CircularProgressBar circularProgressBar, AnonymousClass3WK r5, ArEffectsTrayFragment arEffectsTrayFragment, AnonymousClass4VF r7, CenteredSelectionRecyclerView centeredSelectionRecyclerView, C30391dr r9) {
                                super(2, r9);
                                this.this$0 = arEffectsTrayFragment;
                                this.$adapter = r5;
                                this.$recyclerView = centeredSelectionRecyclerView;
                                this.$textView = textView;
                                this.$selectedTextContainer = frameLayout;
                                this.$configuration = r7;
                                this.$selectedCircle = circularProgressBar;
                            }

                            public final C30391dr create(Object obj, C30391dr r11) {
                                ArEffectsTrayFragment arEffectsTrayFragment = this.this$0;
                                AnonymousClass3WK r4 = this.$adapter;
                                CenteredSelectionRecyclerView centeredSelectionRecyclerView = this.$recyclerView;
                                TextView textView = this.$textView;
                                return new ArEffectsTrayFragment$onViewCreated$2(this.$selectedTextContainer, textView, this.$selectedCircle, r4, arEffectsTrayFragment, this.$configuration, centeredSelectionRecyclerView, r11);
                            }

                            public final Object invokeSuspend(Object obj) {
                                C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
                                int i = this.label;
                                if (i == 0) {
                                    C30691eM.A01(obj);
                                    C37801q9 A1G = this.this$0.A1G();
                                    C23401Fx r0 = C23401Fx.STARTED;
                                    final ArEffectsTrayFragment arEffectsTrayFragment = this.this$0;
                                    final AnonymousClass3WK r8 = this.$adapter;
                                    final CenteredSelectionRecyclerView centeredSelectionRecyclerView = this.$recyclerView;
                                    final TextView textView = this.$textView;
                                    final FrameLayout frameLayout = this.$selectedTextContainer;
                                    final AnonymousClass4VF r10 = this.$configuration;
                                    final CircularProgressBar circularProgressBar = this.$selectedCircle;
                                    AnonymousClass1 r4 = new AnonymousClass1((C30391dr) null);
                                    this.label = 1;
                                    if (C87334Ve.A01(r0, A1G, this, r4) == r3) {
                                        return r3;
                                    }
                                } else if (i == 1) {
                                    C30691eM.A01(obj);
                                } else {
                                    throw AnonymousClass000.A0l();
                                }
                                return C27621Wu.A00;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return ((ArEffectsTrayFragment$onViewCreated$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
                            }
                        }
