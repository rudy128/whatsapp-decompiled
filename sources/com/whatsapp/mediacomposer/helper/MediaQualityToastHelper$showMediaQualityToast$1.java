package com.whatsapp.mediacomposer.helper;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4XW;
import X.AnonymousClass73D;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.helper.MediaQualityToastHelper$showMediaQualityToast$1", f = "MediaQualityToastHelper.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
public final class MediaQualityToastHelper$showMediaQualityToast$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass73D $mediaParams;
    public final /* synthetic */ int $mediaQuality;
    public final /* synthetic */ Set $originalQualityItems;
    public int label;
    public final /* synthetic */ AnonymousClass4XW this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.helper.MediaQualityToastHelper$showMediaQualityToast$1$1", f = "MediaQualityToastHelper.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.helper.MediaQualityToastHelper$showMediaQualityToast$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            return new AnonymousClass1(r4, r5, set, r8, i2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c1 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r12.label
                r6 = 1
                if (r0 == 0) goto L_0x000f
                if (r0 != r6) goto L_0x00c8
                X.C30691eM.A01(r13)
            L_0x000c:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x000f:
                X.C30691eM.A01(r13)
                X.4XW r2 = r5
                X.73D r0 = r4
                java.util.Set r8 = r6
                int r7 = r8
                r1 = 3
                java.util.ArrayList r0 = r0.A04()
                if (r7 != r1) goto L_0x0047
                java.util.ArrayList r4 = X.AnonymousClass000.A13()
                java.util.Iterator r3 = r0.iterator()
            L_0x0029:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0042
                java.lang.Object r1 = r3.next()
                r0 = r1
                X.72S r0 = (X.AnonymousClass72S) r0
                android.net.Uri r0 = r0.A0X
                boolean r0 = r8.contains(r0)
                if (r0 == 0) goto L_0x0029
                r4.add(r1)
                goto L_0x0029
            L_0x0042:
                java.util.Map r11 = X.AnonymousClass4XW.A00(r2, r4)
                goto L_0x004b
            L_0x0047:
                java.util.Map r11 = X.AnonymousClass4XW.A00(r2, r0)
            L_0x004b:
                X.0vb r8 = r2.A03
                java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
                r7 = 0
                X.C18070vi.A0d(r11, r6)
                java.util.Set r0 = r11.keySet()
                int r9 = r0.size()
                java.util.Collection r0 = r11.values()
                int r4 = X.C29431cG.A0U(r0)
                java.util.Map r1 = r2.A05
                int r0 = X.C72463Mc.A0B(r10)
                java.lang.Object r3 = X.AnonymousClass000.A0w(r1, r0)
                java.lang.String r2 = "Required value was null."
                if (r3 == 0) goto L_0x00cd
                java.util.Map r3 = (java.util.Map) r3
                if (r9 != r6) goto L_0x008c
                java.util.Set r0 = r11.keySet()
                java.lang.Object r0 = X.C29431cG.A0X(r0)
            L_0x007f:
                java.lang.Object r0 = r3.get(r0)
                java.lang.Number r0 = (java.lang.Number) r0
                if (r0 != 0) goto L_0x009e
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r2)
                throw r0
            L_0x008c:
                if (r10 == 0) goto L_0x00c2
                int r1 = r10.intValue()
                r0 = 3
                if (r1 != r0) goto L_0x00c2
                if (r4 != 0) goto L_0x00c2
                r0 = 2131755241(0x7f1000e9, float:1.9141356E38)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            L_0x009e:
                int r3 = r0.intValue()
                long r1 = (long) r4
                java.lang.Object[] r0 = new java.lang.Object[r6]
                X.C17880vN.A1T(r0, r4, r7)
                java.lang.String r4 = r8.A0K(r0, r3, r1)
                X.C18070vi.A0X(r4)
                X.4XW r3 = r5
                X.0wl r2 = r3.A07
                r1 = 0
                com.whatsapp.mediacomposer.helper.MediaQualityToastHelper$showMediaQualityToast$1$1$1 r0 = new com.whatsapp.mediacomposer.helper.MediaQualityToastHelper$showMediaQualityToast$1$1$1
                r0.<init>(r4, r1)
                r12.label = r6
                java.lang.Object r0 = X.C30451dy.A00(r12, r2, r0)
                if (r0 != r5) goto L_0x000c
                return r5
            L_0x00c2:
                r0 = -1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L_0x007f
            L_0x00c8:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x00cd:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.helper.MediaQualityToastHelper$showMediaQualityToast$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaQualityToastHelper$showMediaQualityToast$1(AnonymousClass73D r2, AnonymousClass4XW r3, Set set, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = r3;
        this.$mediaParams = r2;
        this.$originalQualityItems = set;
        this.$mediaQuality = i;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new MediaQualityToastHelper$showMediaQualityToast$1(this.$mediaParams, this.this$0, this.$originalQualityItems, r8, this.$mediaQuality);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass4XW r5 = this.this$0;
            C18600wl r0 = r5.A06;
            final AnonymousClass73D r4 = this.$mediaParams;
            final Set set = this.$originalQualityItems;
            final int i2 = this.$mediaQuality;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaQualityToastHelper$showMediaQualityToast$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
