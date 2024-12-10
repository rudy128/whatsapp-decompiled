package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C17730v8;
import X.C17750vA;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import X.C71433Fg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
public final class TapGestureDetectorKt$detectTapAndPress$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C36001nB $onPress;
    public final /* synthetic */ C22821Di $onTap;
    public final /* synthetic */ PressGestureScopeImpl $pressScope;
    public final /* synthetic */ C17730v8 $this_detectTapAndPress;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2(PressGestureScopeImpl pressGestureScopeImpl, C17730v8 r3, C30391dr r4, C22821Di r5, C36001nB r6) {
        super(2, r4);
        this.$this_detectTapAndPress = r3;
        this.$onPress = r6;
        this.$onTap = r5;
        this.$pressScope = pressGestureScopeImpl;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C17730v8 r2 = this.$this_detectTapAndPress;
        C36001nB r5 = this.$onPress;
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$pressScope, r2, r8, this.$onTap, r5);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {0}, l = {237, 245}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C71433Fg implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C17750vA r3, C30391dr r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r8) {
            AnonymousClass1OX r5 = r8;
            C36001nB r4 = r7;
            AnonymousClass1 r0 = new AnonymousClass1(pressGestureScopeImpl, r8, r6, r4, r5);
            r0.L$0 = obj;
            return r0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x008e A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.1g4 r7 = X.AnonymousClass3F6.A03()
                int r0 = r8.label
                r6 = 2
                r3 = 1
                r5 = 0
                if (r0 == 0) goto L_0x0044
                if (r0 == r3) goto L_0x0063
                if (r0 != r6) goto L_0x008f
                X.C30691eM.A01(r9)
            L_0x0012:
                X.0KX r9 = (X.AnonymousClass0KX) r9
                if (r9 != 0) goto L_0x0026
                X.1OX r2 = r8
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                r1.<init>(r5)
                r0 = 3
                X.AnonymousClass4Z4.A02(r5, r5, r1, r2, r0)
            L_0x0023:
                X.1Wu r7 = X.C27621Wu.A00
                return r7
            L_0x0026:
                r9.A01()
                X.1OX r2 = r8
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4 r1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4
                r1.<init>(r5)
                r0 = 3
                X.AnonymousClass4Z4.A02(r5, r5, r1, r2, r0)
                X.1Di r2 = r6
                if (r2 == 0) goto L_0x0023
                long r0 = r9.A06
                X.0QY r0 = X.AnonymousClass000.A0e(r0)
                r2.invoke(r0)
                goto L_0x0023
            L_0x0044:
                X.C30691eM.A01(r9)
                java.lang.Object r4 = r8.L$0
                X.0vA r4 = (X.C17750vA) r4
                X.1OX r2 = r8
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                r1.<init>(r5)
                r0 = 3
                X.AnonymousClass4Z4.A02(r5, r5, r1, r2, r0)
                r8.L$0 = r4
                r8.label = r3
                java.lang.Object r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A07(r4, r8, r0)
                if (r9 != r7) goto L_0x006a
                return r7
            L_0x0063:
                java.lang.Object r4 = r8.L$0
                X.0vA r4 = (X.C17750vA) r4
                X.C30691eM.A01(r9)
            L_0x006a:
                X.0KX r9 = (X.AnonymousClass0KX) r9
                r9.A01()
                X.1nB r3 = r7
                X.1nB r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
                if (r3 == r0) goto L_0x0084
                X.1OX r2 = r8
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                r1.<init>(r0, r9, r5, r3)
                r0 = 3
                X.AnonymousClass4Z4.A02(r5, r5, r1, r2, r0)
            L_0x0084:
                r8.L$0 = r5
                r8.label = r6
                java.lang.Object r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(r4, X.AnonymousClass0CQ.Main, r8)
                if (r9 != r7) goto L_0x0012
                return r7
            L_0x008f:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass1OX r8 = (AnonymousClass1OX) this.L$0;
            C17730v8 r0 = this.$this_detectTapAndPress;
            final C36001nB r7 = this.$onPress;
            final C22821Di r6 = this.$onTap;
            final PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (ForEachGestureKt.A01(r0, this, r3) == A03) {
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
