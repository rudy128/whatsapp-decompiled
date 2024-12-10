package com.whatsapp.areffects;

import X.AnonymousClass000;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3R4;
import X.AnonymousClass4V6;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C37801q9;
import X.C85404Ng;
import X.C87334Ve;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.ArEffectsButtonHeaderFragment$onViewCreated$2", f = "ArEffectsButtonHeaderFragment.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsButtonHeaderFragment$onViewCreated$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $allButtons;
    public final /* synthetic */ Map $buttonMap;
    public final /* synthetic */ Map $configMap;
    public final /* synthetic */ WDSButton $removeAllEffectsButton;
    public int label;
    public final /* synthetic */ ArEffectsButtonHeaderFragment this$0;

    @DebugMetadata(c = "com.whatsapp.areffects.ArEffectsButtonHeaderFragment$onViewCreated$2$1", f = "ArEffectsButtonHeaderFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.areffects.ArEffectsButtonHeaderFragment$onViewCreated$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r9) {
            AnonymousClass1 r0 = new AnonymousClass1(wDSButton, list, map, map2, r9);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass1OX r5 = (AnonymousClass1OX) this.L$0;
                Map A12 = AnonymousClass3MW.A12(AnonymousClass3MX.A0Y(ArEffectsButtonHeaderFragment.this.A02).A0E);
                Map map = map;
                Map map2 = map2;
                ArEffectsButtonHeaderFragment arEffectsButtonHeaderFragment = ArEffectsButtonHeaderFragment.this;
                Iterator A15 = AnonymousClass000.A15(A12);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    Object key = A16.getKey();
                    C85404Ng r11 = (C85404Ng) A16.getValue();
                    Object obj2 = map.get(key);
                    if (obj2 != null) {
                        AnonymousClass3R4 r9 = (AnonymousClass3R4) obj2;
                        Object obj3 = map2.get(key);
                        if (obj3 != null) {
                            AnonymousClass4V6 r10 = (AnonymousClass4V6) obj3;
                            ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$1 arEffectsButtonHeaderFragment$onViewCreated$2$1$1$1 = new ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$1(arEffectsButtonHeaderFragment, r9, r10, r11, (C30391dr) null);
                            AnonymousClass1OR r2 = AnonymousClass1OR.A00;
                            Integer A0w = AnonymousClass3MW.A0w(r2, arEffectsButtonHeaderFragment$onViewCreated$2$1$1$1, r5);
                            if (r10.A06) {
                                C30451dy.A02(A0w, r2, new ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$2(r9, r11, (C30391dr) null), r5);
                            }
                        } else {
                            throw AnonymousClass000.A0n("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass000.A0n("Required value was null.");
                    }
                }
                final ArEffectsButtonHeaderFragment arEffectsButtonHeaderFragment2 = ArEffectsButtonHeaderFragment.this;
                final WDSButton wDSButton = wDSButton;
                AnonymousClass2 r0 = new AnonymousClass1OS((C30391dr) null) {
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r5) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public ArEffectsButtonHeaderFragment$onViewCreated$2(ArEffectsButtonHeaderFragment arEffectsButtonHeaderFragment, WDSButton wDSButton, List list, Map map, Map map2, C30391dr r7) {
                            super(2, r7);
                            this.this$0 = arEffectsButtonHeaderFragment;
                            this.$buttonMap = map;
                            this.$configMap = map2;
                            this.$removeAllEffectsButton = wDSButton;
                            this.$allButtons = list;
                        }

                        public final C30391dr create(Object obj, C30391dr r9) {
                            return new ArEffectsButtonHeaderFragment$onViewCreated$2(this.this$0, this.$removeAllEffectsButton, this.$allButtons, this.$buttonMap, this.$configMap, r9);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                C37801q9 A1G = this.this$0.A1G();
                                C23401Fx r0 = C23401Fx.STARTED;
                                final ArEffectsButtonHeaderFragment arEffectsButtonHeaderFragment = this.this$0;
                                final Map map = this.$buttonMap;
                                final Map map2 = this.$configMap;
                                final WDSButton wDSButton = this.$removeAllEffectsButton;
                                final List list = this.$allButtons;
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
                            return ((ArEffectsButtonHeaderFragment$onViewCreated$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
                        }
                    }
