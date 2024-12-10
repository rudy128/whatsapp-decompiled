package androidx.compose.foundation.text.selection;

import X.AnonymousClass000;
import X.AnonymousClass0QV;
import X.AnonymousClass0XW;
import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C03220Hc;
import X.C16630sk;
import X.C16850tK;
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

@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", f = "SelectionGestures.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class SelectionGesturesKt$selectionGestureInput$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C16630sk $mouseSelectionObserver;
    public final /* synthetic */ C16850tK $textDragObserver;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$selectionGestureInput$1(C16850tK r2, C16630sk r3, C30391dr r4) {
        super(2, r4);
        this.$mouseSelectionObserver = r3;
        this.$textDragObserver = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C17730v8 r3, C30391dr r4) {
        return ((SelectionGesturesKt$selectionGestureInput$1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        SelectionGesturesKt$selectionGestureInput$1 selectionGesturesKt$selectionGestureInput$1 = new SelectionGesturesKt$selectionGestureInput$1(this.$textDragObserver, this.$mouseSelectionObserver, r5);
        selectionGesturesKt$selectionGestureInput$1.L$0 = obj;
        return selectionGesturesKt$selectionGestureInput$1;
    }

    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", i = {0}, l = {100, 106, 108}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C71433Fg implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C17750vA r3, C30391dr r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r6) {
            C16630sk r3 = r3;
            AnonymousClass1 r0 = new AnonymousClass1(r2, r4, r3, r6);
            r0.L$0 = obj;
            return r0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                X.1g4 r5 = X.AnonymousClass3F6.A03()
                int r1 = r9.label
                r8 = 3
                r7 = 2
                r0 = 1
                if (r1 == 0) goto L_0x0016
                if (r1 == r0) goto L_0x0028
                if (r1 == r7) goto L_0x0076
                if (r1 == r8) goto L_0x0076
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x0016:
                X.C30691eM.A01(r10)
                java.lang.Object r6 = r9.L$0
                X.0vA r6 = (X.C17750vA) r6
                r9.L$0 = r6
                r9.label = r0
                java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A06(r6, r9)
                if (r10 != r5) goto L_0x002f
                return r5
            L_0x0028:
                java.lang.Object r6 = r9.L$0
                X.0vA r6 = (X.C17750vA) r6
                X.C30691eM.A01(r10)
            L_0x002f:
                X.0Hm r10 = (X.AnonymousClass0Hm) r10
                boolean r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A08(r10)
                r4 = 0
                if (r0 == 0) goto L_0x0063
                int r0 = r10.A01
                r0 = r0 & 33
                if (r0 == 0) goto L_0x0063
                java.util.List r3 = r10.A03
                int r2 = r3.size()
                r1 = 0
            L_0x0045:
                if (r1 >= r2) goto L_0x0056
                X.0KX r0 = X.AnonymousClass000.A0f(r3, r1)
                boolean r0 = r0.A02()
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0063
                int r1 = r1 + 1
                goto L_0x0045
            L_0x0056:
                X.0sk r1 = r3
                X.0Hc r0 = r4
                r9.L$0 = r4
                r9.label = r7
                java.lang.Object r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A04(r0, r1, r6, r10, r9)
                goto L_0x0073
            L_0x0063:
                boolean r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A08(r10)
                if (r0 != 0) goto L_0x0079
                X.0tK r0 = r2
                r9.L$0 = r4
                r9.label = r8
                java.lang.Object r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A02(r0, r6, r10, r9)
            L_0x0073:
                if (r0 != r5) goto L_0x0079
                return r5
            L_0x0076:
                X.C30691eM.A01(r10)
            L_0x0079:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C17730v8 r5 = (C17730v8) this.L$0;
            final C03220Hc r4 = new C03220Hc(AnonymousClass0QV.A03((AnonymousClass0XW) r5).A09);
            final C16630sk r3 = this.$mouseSelectionObserver;
            final C16850tK r2 = this.$textDragObserver;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (ForEachGestureKt.A01(r5, this, r0) == A03) {
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
