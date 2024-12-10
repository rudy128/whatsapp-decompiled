package com.whatsapp.fieldstats.helper.sharecontentjourney;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass4P8;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18600wl;
import X.C22821Di;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import X.C81733zi;
import X.C86814Te;
import X.C87894Xm;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.fieldstats.helper.sharecontentjourney.ShareContentUserJourneyLogger$logAction$queueingResult$1", f = "ShareContentUserJourneyLogger.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
public final class ShareContentUserJourneyLogger$logAction$queueingResult$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass4P8 $builder;
    public final /* synthetic */ C22821Di $initBlock;
    public int label;
    public final /* synthetic */ C87894Xm this$0;

    @DebugMetadata(c = "com.whatsapp.fieldstats.helper.sharecontentjourney.ShareContentUserJourneyLogger$logAction$queueingResult$1$1", f = "ShareContentUserJourneyLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.fieldstats.helper.sharecontentjourney.ShareContentUserJourneyLogger$logAction$queueingResult$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r2, r5, r3);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                r3.invoke(r2);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareContentUserJourneyLogger$logAction$queueingResult$1(AnonymousClass4P8 r2, C87894Xm r3, C30391dr r4, C22821Di r5) {
        super(2, r4);
        this.this$0 = r3;
        this.$builder = r2;
        this.$initBlock = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ShareContentUserJourneyLogger$logAction$queueingResult$1(this.$builder, this.this$0, r6, this.$initBlock);
    }

    public final Object invokeSuspend(Object obj) {
        Long l;
        Long l2;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C18600wl r4 = this.this$0.A07;
            final C22821Di r3 = this.$initBlock;
            final AnonymousClass4P8 r2 = this.$builder;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r4, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass4P8 r22 = this.$builder;
        long j = r22.A09;
        int i2 = r22.A08;
        Integer num = r22.A05;
        int i3 = r22.A00;
        Integer num2 = r22.A07;
        Integer num3 = r22.A06;
        Boolean bool = r22.A02;
        Boolean bool2 = r22.A04;
        Boolean bool3 = r22.A03;
        Boolean bool4 = r22.A01;
        if (!C29431cG.A18(C87894Xm.A09, num)) {
            C87894Xm r42 = this.this$0;
            if (i3 == 9) {
                C86814Te r15 = r42.A00;
                if (r15 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C81733zi r23 = new C81733zi();
                    r23.A0A = Long.valueOf(currentTimeMillis);
                    r23.A0C = r15.A01;
                    r23.A0B = (String) AnonymousClass3MX.A14(r42.A05);
                    r23.A07 = Integer.valueOf(i2);
                    r23.A06 = null;
                    r23.A05 = C17880vN.A0m();
                    r23.A09 = null;
                    r23.A08 = null;
                    r23.A02 = null;
                    r23.A04 = null;
                    r23.A03 = null;
                    r23.A01 = null;
                    r23.A00 = null;
                    r42.A04.CC4(r23);
                    r42.A00 = null;
                }
                String A0Q = C17890vO.A0Q();
                C18070vi.A0X(A0Q);
                r42.A00 = new C86814Te(A0Q, (Boolean) null);
            }
            C86814Te r43 = r42.A00;
            if (r43 != null) {
                C87894Xm r32 = this.this$0;
                C81733zi r24 = new C81733zi();
                r24.A0A = Long.valueOf(j);
                r24.A0C = r43.A01;
                r24.A0B = (String) AnonymousClass3MX.A14(r32.A05);
                r24.A07 = Integer.valueOf(i2);
                r24.A06 = num;
                r24.A05 = Integer.valueOf(i3);
                Boolean bool5 = null;
                if (num2 != null) {
                    l = C17890vO.A0N(num2);
                } else {
                    l = null;
                }
                r24.A09 = l;
                if (num3 != null) {
                    l2 = C17890vO.A0N(num3);
                } else {
                    l2 = null;
                }
                r24.A08 = l2;
                r24.A02 = bool;
                r24.A04 = bool2;
                r24.A03 = bool3;
                r24.A01 = bool4;
                if (i3 == 4) {
                    bool5 = Boolean.valueOf(C72453Mb.A1Y(r43.A00));
                }
                r24.A00 = bool5;
                r32.A04.CC4(r24);
                if (i3 == 4 || i3 == 5 || i3 == 6) {
                    r32.A00 = null;
                }
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ShareContentUserJourneyLogger$logAction$queueingResult$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
