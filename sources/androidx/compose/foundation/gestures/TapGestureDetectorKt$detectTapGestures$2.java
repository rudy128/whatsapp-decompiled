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

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class TapGestureDetectorKt$detectTapGestures$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $onDoubleTap;
    public final /* synthetic */ C22821Di $onLongPress;
    public final /* synthetic */ C36001nB $onPress;
    public final /* synthetic */ C22821Di $onTap;
    public final /* synthetic */ C17730v8 $this_detectTapGestures;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {100, 114, 129, 141, 156, 178}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "secondDown"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C71433Fg implements AnonymousClass1OS {
        public long J$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C17750vA r3, C30391dr r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r10) {
            AnonymousClass1OX r7 = r10;
            C36001nB r6 = r9;
            AnonymousClass1 r0 = new AnonymousClass1(pressGestureScopeImpl, r10, r6, r7, r8, r6, r7);
            r0.L$0 = obj;
            return r0;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
            if (r2 == r4) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x011c, code lost:
            if (r2 != null) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x011e, code lost:
            r2.invoke(X.AnonymousClass000.A0e(((X.AnonymousClass0KX) r5).A06));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x014e, code lost:
            r6 = (X.AnonymousClass0KX) r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0151, code lost:
            if (r6 != null) goto L_0x015a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0153, code lost:
            r2 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0155, code lost:
            if (r2 == null) goto L_0x01d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0157, code lost:
            r5 = r13.element;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x015a, code lost:
            r7 = r10;
            r5 = r4;
            X.AnonymousClass4Z4.A02((java.lang.Integer) null, (X.C18560wh) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass7((X.C30391dr) null), r7, 3);
            r8 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x016d, code lost:
            if (r8 == androidx.compose.foundation.gestures.TapGestureDetectorKt.A00) goto L_0x017b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x016f, code lost:
            r7 = r10;
            r5 = r4;
            X.AnonymousClass4Z4.A02((java.lang.Integer) null, (X.C18560wh) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass8((X.C30391dr) null), r7, 3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
            r14 = r10;
            r11 = r7;
            r12 = r8;
            r9 = r4;
            r8 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass9((X.C30391dr) null);
            r15.L$0 = r3;
            r15.L$1 = r13;
            r15.L$2 = r6;
            r15.label = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0195, code lost:
            if (r3.CSF(r15, r8, r0) != r4) goto L_0x01d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0197, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c9, code lost:
            r2 = r10;
            r0 = r4;
            X.AnonymousClass4Z4.A02((java.lang.Integer) null, (X.C18560wh) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass10((X.C30391dr) null), r2, 3);
         */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00da  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00f6 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0116  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                r15 = this;
                r2 = r16
                X.1g4 r4 = X.AnonymousClass3F6.A03()
                int r0 = r15.label
                r10 = 0
                switch(r0) {
                    case 0: goto L_0x003b;
                    case 1: goto L_0x004f;
                    case 2: goto L_0x0022;
                    case 3: goto L_0x00f7;
                    case 4: goto L_0x0141;
                    case 5: goto L_0x0011;
                    case 6: goto L_0x01c6;
                    default: goto L_0x000c;
                }
            L_0x000c:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x0011:
                java.lang.Object r6 = r15.L$2
                X.0KX r6 = (X.AnonymousClass0KX) r6
                java.lang.Object r13 = r15.L$1
                X.4rF r13 = (X.C98494rF) r13
                java.lang.Object r3 = r15.L$0
                X.0vA r3 = (X.C17750vA) r3
                X.C30691eM.A01(r2)     // Catch:{ 0af -> 0x0198 }
                goto L_0x01d6
            L_0x0022:
                long r0 = r15.J$0
                java.lang.Object r8 = r15.L$3
                X.4rF r8 = (X.C98494rF) r8
                java.lang.Object r13 = r15.L$2
                X.4rF r13 = (X.C98494rF) r13
                java.lang.Object r9 = r15.L$1
                X.0KX r9 = (X.AnonymousClass0KX) r9
                java.lang.Object r3 = r15.L$0
                X.0vA r3 = (X.C17750vA) r3
                X.C30691eM.A01(r2)     // Catch:{ 0af -> 0x0038 }
                goto L_0x00ae
            L_0x0038:
                r8 = r13
                goto L_0x00d6
            L_0x003b:
                X.C30691eM.A01(r2)
                java.lang.Object r3 = r15.L$0
                X.0vA r3 = (X.C17750vA) r3
                r15.L$0 = r3
                r0 = 1
                r15.label = r0
                r0 = 3
                java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A07(r3, r15, r0)
                if (r2 != r4) goto L_0x0056
            L_0x004e:
                return r4
            L_0x004f:
                java.lang.Object r3 = r15.L$0
                X.0vA r3 = (X.C17750vA) r3
                X.C30691eM.A01(r2)
            L_0x0056:
                r9 = r2
                X.0KX r9 = (X.AnonymousClass0KX) r9
                r9.A01()
                X.1OX r2 = r10
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1
                r0.<init>(r10)
                r6 = 3
                X.AnonymousClass4Z4.A02(r10, r10, r0, r2, r6)
                X.1nB r5 = r9
                X.1nB r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
                if (r5 == r0) goto L_0x007d
                X.1OX r2 = r10
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2
                r0.<init>(r1, r9, r10, r5)
                X.AnonymousClass4Z4.A02(r10, r10, r0, r2, r6)
            L_0x007d:
                X.1Di r0 = r6
                if (r0 == 0) goto L_0x008f
                X.0tN r0 = r3.getViewConfiguration()
                long r0 = r0.BUE()
            L_0x0089:
                X.4rF r8 = new X.4rF
                r8.<init>()
                goto L_0x0095
            L_0x008f:
                r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
                goto L_0x0089
            L_0x0095:
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3 r5 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3     // Catch:{ 0af -> 0x00d6 }
                r5.<init>(r10)     // Catch:{ 0af -> 0x00d6 }
                r15.L$0 = r3     // Catch:{ 0af -> 0x00d6 }
                r15.L$1 = r9     // Catch:{ 0af -> 0x00d6 }
                r15.L$2 = r8     // Catch:{ 0af -> 0x00d6 }
                r15.L$3 = r8     // Catch:{ 0af -> 0x00d6 }
                r15.J$0 = r0     // Catch:{ 0af -> 0x00d6 }
                r2 = 2
                r15.label = r2     // Catch:{ 0af -> 0x00d6 }
                java.lang.Object r2 = r3.CSF(r15, r5, r0)     // Catch:{ 0af -> 0x00d6 }
                if (r2 == r4) goto L_0x004e
                r13 = r8
            L_0x00ae:
                r8.element = r2     // Catch:{ 0af -> 0x00d5 }
                java.lang.Object r2 = r13.element     // Catch:{ 0af -> 0x00d5 }
                if (r2 != 0) goto L_0x00c2
                X.1OX r6 = r10     // Catch:{ 0af -> 0x00d5 }
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r4     // Catch:{ 0af -> 0x00d5 }
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4 r5 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4     // Catch:{ 0af -> 0x00d5 }
                r5.<init>(r10)     // Catch:{ 0af -> 0x00d5 }
                r2 = 3
                X.AnonymousClass4Z4.A02(r10, r10, r5, r6, r2)     // Catch:{ 0af -> 0x00d5 }
                goto L_0x0112
            L_0x00c2:
                X.0KX r2 = (X.AnonymousClass0KX) r2     // Catch:{ 0af -> 0x00d5 }
                r2.A01()     // Catch:{ 0af -> 0x00d5 }
                X.1OX r6 = r10     // Catch:{ 0af -> 0x00d5 }
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r4     // Catch:{ 0af -> 0x00d5 }
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5 r5 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5     // Catch:{ 0af -> 0x00d5 }
                r5.<init>(r10)     // Catch:{ 0af -> 0x00d5 }
                r2 = 3
                X.AnonymousClass4Z4.A02(r10, r10, r5, r6, r2)     // Catch:{ 0af -> 0x00d5 }
                goto L_0x0112
            L_0x00d5:
                r8 = r13
            L_0x00d6:
                X.1Di r7 = r6
                if (r7 == 0) goto L_0x00e3
                long r5 = r9.A06
                X.0QY r2 = X.AnonymousClass000.A0e(r5)
                r7.invoke(r2)
            L_0x00e3:
                r15.L$0 = r3
                r15.L$1 = r8
                r15.L$2 = r10
                r15.L$3 = r10
                r15.J$0 = r0
                r2 = 3
                r15.label = r2
                java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r3, r15)
                if (r2 != r4) goto L_0x0104
                return r4
            L_0x00f7:
                long r0 = r15.J$0
                java.lang.Object r8 = r15.L$1
                X.4rF r8 = (X.C98494rF) r8
                java.lang.Object r3 = r15.L$0
                X.0vA r3 = (X.C17750vA) r3
                X.C30691eM.A01(r2)
            L_0x0104:
                X.1OX r6 = r10
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6 r5 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6
                r5.<init>(r10)
                r2 = 3
                X.AnonymousClass4Z4.A02(r10, r10, r5, r6, r2)
                r13 = r8
            L_0x0112:
                java.lang.Object r5 = r13.element
                if (r5 == 0) goto L_0x01d6
                X.1Di r2 = r7
                if (r2 != 0) goto L_0x012b
                X.1Di r2 = r8
                if (r2 == 0) goto L_0x01d6
            L_0x011e:
                X.0KX r5 = (X.AnonymousClass0KX) r5
                long r0 = r5.A06
                X.0QY r0 = X.AnonymousClass000.A0e(r0)
                r2.invoke(r0)
                goto L_0x01d6
            L_0x012b:
                X.0KX r5 = (X.AnonymousClass0KX) r5
                r15.L$0 = r3
                r15.L$1 = r13
                r15.L$2 = r10
                r15.L$3 = r10
                r15.J$0 = r0
                r2 = 4
                r15.label = r2
                java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A02(r3, r5, r15)
                if (r2 != r4) goto L_0x014e
                return r4
            L_0x0141:
                long r0 = r15.J$0
                java.lang.Object r13 = r15.L$1
                X.4rF r13 = (X.C98494rF) r13
                java.lang.Object r3 = r15.L$0
                X.0vA r3 = (X.C17750vA) r3
                X.C30691eM.A01(r2)
            L_0x014e:
                r6 = r2
                X.0KX r6 = (X.AnonymousClass0KX) r6
                if (r6 != 0) goto L_0x015a
                X.1Di r2 = r8
                if (r2 == 0) goto L_0x01d6
                java.lang.Object r5 = r13.element
                goto L_0x011e
            L_0x015a:
                X.1OX r7 = r10
                androidx.compose.foundation.gestures.PressGestureScopeImpl r5 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7
                r2.<init>(r10)
                r9 = 3
                X.AnonymousClass4Z4.A02(r10, r10, r2, r7, r9)
                X.1nB r8 = r9
                X.1nB r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
                if (r8 == r2) goto L_0x017b
                X.1OX r7 = r10
                androidx.compose.foundation.gestures.PressGestureScopeImpl r5 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8
                r2.<init>(r5, r6, r10, r8)
                X.AnonymousClass4Z4.A02(r10, r10, r2, r7, r9)
            L_0x017b:
                X.1OX r14 = r10     // Catch:{ 0af -> 0x0198 }
                X.1Di r11 = r7     // Catch:{ 0af -> 0x0198 }
                X.1Di r12 = r8     // Catch:{ 0af -> 0x0198 }
                androidx.compose.foundation.gestures.PressGestureScopeImpl r9 = r4     // Catch:{ 0af -> 0x0198 }
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9 r8 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9     // Catch:{ 0af -> 0x0198 }
                r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ 0af -> 0x0198 }
                r15.L$0 = r3     // Catch:{ 0af -> 0x0198 }
                r15.L$1 = r13     // Catch:{ 0af -> 0x0198 }
                r15.L$2 = r6     // Catch:{ 0af -> 0x0198 }
                r2 = 5
                r15.label = r2     // Catch:{ 0af -> 0x0198 }
                java.lang.Object r0 = r3.CSF(r15, r8, r0)     // Catch:{ 0af -> 0x0198 }
                if (r0 != r4) goto L_0x01d6
                return r4
            L_0x0198:
                X.1Di r2 = r8
                if (r2 == 0) goto L_0x01a9
                java.lang.Object r0 = r13.element
                X.0KX r0 = (X.AnonymousClass0KX) r0
                long r0 = r0.A06
                X.0QY r0 = X.AnonymousClass000.A0e(r0)
                r2.invoke(r0)
            L_0x01a9:
                X.1Di r2 = r6
                if (r2 == 0) goto L_0x01b6
                long r0 = r6.A06
                X.0QY r0 = X.AnonymousClass000.A0e(r0)
                r2.invoke(r0)
            L_0x01b6:
                r15.L$0 = r10
                r15.L$1 = r10
                r15.L$2 = r10
                r0 = 6
                r15.label = r0
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r3, r15)
                if (r0 != r4) goto L_0x01c9
                return r4
            L_0x01c6:
                X.C30691eM.A01(r2)
            L_0x01c9:
                X.1OX r2 = r10
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10 r1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10
                r1.<init>(r10)
                r0 = 3
                X.AnonymousClass4Z4.A02(r10, r10, r1, r2, r0)
            L_0x01d6:
                X.1Wu r4 = X.C27621Wu.A00
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2(C17730v8 r2, C30391dr r3, C22821Di r4, C22821Di r5, C22821Di r6, C36001nB r7) {
        super(2, r3);
        this.$this_detectTapGestures = r2;
        this.$onPress = r7;
        this.$onLongPress = r4;
        this.$onDoubleTap = r5;
        this.$onTap = r6;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C30391dr r2 = r9;
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, r2, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$onPress);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass1OX r10 = (AnonymousClass1OX) this.L$0;
            final PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
            C17730v8 r0 = this.$this_detectTapGestures;
            final C36001nB r9 = this.$onPress;
            final C22821Di r6 = this.$onLongPress;
            final C22821Di r7 = this.$onDoubleTap;
            final C22821Di r8 = this.$onTap;
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
