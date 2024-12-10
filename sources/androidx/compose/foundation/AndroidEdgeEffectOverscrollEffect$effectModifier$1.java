package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C17730v8;
import X.C17750vA;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C71433Fg;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.android.kt", i = {}, l = {320}, m = "invokeSuspend", n = {}, s = {})
public final class AndroidEdgeEffectOverscrollEffect$effectModifier$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$effectModifier$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C30391dr r3) {
        super(2, r3);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    /* renamed from: A00 */
    public final Object invoke(C17730v8 r3, C30391dr r4) {
        return ((AndroidEdgeEffectOverscrollEffect$effectModifier$1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AndroidEdgeEffectOverscrollEffect$effectModifier$1 androidEdgeEffectOverscrollEffect$effectModifier$1 = new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this.this$0, r4);
        androidEdgeEffectOverscrollEffect$effectModifier$1.L$0 = obj;
        return androidEdgeEffectOverscrollEffect$effectModifier$1;
    }

    @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.android.kt", i = {0, 1}, l = {321, 325}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C71433Fg implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C17750vA r3, C30391dr r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0055 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                X.1g4 r7 = X.AnonymousClass3F6.A03()
                int r1 = r14.label
                r6 = 2
                r5 = 0
                r0 = 1
                if (r1 == 0) goto L_0x0084
                if (r1 == r0) goto L_0x0096
                if (r1 != r6) goto L_0x00bd
                java.lang.Object r4 = r14.L$0
                X.0vA r4 = (X.C17750vA) r4
                X.C30691eM.A01(r15)
            L_0x0016:
                X.0Hm r15 = (X.AnonymousClass0Hm) r15
                java.util.List r9 = r15.A03
                java.util.ArrayList r8 = X.AnonymousClass000.A14(r9)
                int r3 = r9.size()
                r13 = 0
                r2 = 0
            L_0x0024:
                if (r2 >= r3) goto L_0x0037
                java.lang.Object r1 = r9.get(r2)
                r0 = r1
                X.0KX r0 = (X.AnonymousClass0KX) r0
                boolean r0 = r0.A0B
                if (r0 == 0) goto L_0x0034
                r8.add(r1)
            L_0x0034:
                int r2 = r2 + 1
                goto L_0x0024
            L_0x0037:
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r12 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this
                int r11 = r8.size()
            L_0x003d:
                if (r13 >= r11) goto L_0x0055
                java.lang.Object r10 = r8.get(r13)
                r0 = r10
                X.0KX r0 = (X.AnonymousClass0KX) r0
                long r2 = r0.A05
                X.0JK r0 = r12.A02
                if (r0 == 0) goto L_0x0052
                long r0 = r0.A00
                int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r9 == 0) goto L_0x0056
            L_0x0052:
                int r13 = r13 + 1
                goto L_0x003d
            L_0x0055:
                r10 = r5
            L_0x0056:
                X.0KX r10 = (X.AnonymousClass0KX) r10
                if (r10 != 0) goto L_0x0062
                java.lang.Object r10 = X.C29431cG.A0c(r8)
                X.0KX r10 = (X.AnonymousClass0KX) r10
                if (r10 == 0) goto L_0x0075
            L_0x0062:
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r3 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this
                long r0 = r10.A05
                X.0JK r2 = new X.0JK
                r2.<init>(r0)
                r3.A02 = r2
                long r0 = r10.A06
                X.0QY r0 = X.AnonymousClass000.A0e(r0)
                r3.A01 = r0
            L_0x0075:
                boolean r0 = r8.isEmpty()
                r0 = r0 ^ 1
                if (r0 != 0) goto L_0x00b2
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r0 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this
                r0.A02 = r5
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x0084:
                X.C30691eM.A01(r15)
                java.lang.Object r4 = r14.L$0
                X.0vA r4 = (X.C17750vA) r4
                r14.L$0 = r4
                r14.label = r0
                java.lang.Object r15 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A07(r4, r14, r6)
                if (r15 != r7) goto L_0x009d
                return r7
            L_0x0096:
                java.lang.Object r4 = r14.L$0
                X.0vA r4 = (X.C17750vA) r4
                X.C30691eM.A01(r15)
            L_0x009d:
                X.0KX r15 = (X.AnonymousClass0KX) r15
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r3 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this
                long r0 = r15.A05
                X.0JK r2 = new X.0JK
                r2.<init>(r0)
                r3.A02 = r2
                long r0 = r15.A06
                X.0QY r0 = X.AnonymousClass000.A0e(r0)
                r3.A01 = r0
            L_0x00b2:
                r14.L$0 = r4
                r14.label = r6
                java.lang.Object r15 = r4.BCq(X.AnonymousClass0CQ.Main, r14)
                if (r15 != r7) goto L_0x0016
                return r7
            L_0x00bd:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (ForEachGestureKt.A01((C17730v8) this.L$0, this, r0) == A03) {
                return A03;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
