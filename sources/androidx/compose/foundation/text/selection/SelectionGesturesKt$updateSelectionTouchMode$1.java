package androidx.compose.foundation.text.selection;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C17730v8;
import X.C17750vA;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C71433Fg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1", f = "SelectionGestures.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
public final class SelectionGesturesKt$updateSelectionTouchMode$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $updateTouchMode;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$updateSelectionTouchMode$1(C30391dr r2, C22821Di r3) {
        super(2, r2);
        this.$updateTouchMode = r3;
    }

    /* renamed from: A00 */
    public final Object invoke(C17730v8 r3, C30391dr r4) {
        return ((SelectionGesturesKt$updateSelectionTouchMode$1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        SelectionGesturesKt$updateSelectionTouchMode$1 selectionGesturesKt$updateSelectionTouchMode$1 = new SelectionGesturesKt$updateSelectionTouchMode$1(r4, this.$updateTouchMode);
        selectionGesturesKt$updateSelectionTouchMode$1.L$0 = obj;
        return selectionGesturesKt$updateSelectionTouchMode$1;
    }

    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", i = {0}, l = {88}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C71433Fg implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C17750vA r3, C30391dr r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4, r2);
            r0.L$0 = obj;
            return r0;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002f A[RETURN] */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                X.1g4 r4 = X.AnonymousClass3F6.A03()
                int r0 = r5.label
                r3 = 1
                if (r0 == 0) goto L_0x0030
                if (r0 != r3) goto L_0x0038
                java.lang.Object r2 = r5.L$0
                X.0vA r2 = (X.C17750vA) r2
                X.C30691eM.A01(r6)
            L_0x0012:
                X.0Hm r6 = (X.AnonymousClass0Hm) r6
                X.1Di r1 = r2
                boolean r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A08(r6)
                r0 = r0 ^ 1
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.invoke(r0)
            L_0x0023:
                X.0CQ r0 = X.AnonymousClass0CQ.Initial
                r5.L$0 = r2
                r5.label = r3
                java.lang.Object r6 = r2.BCq(r0, r5)
                if (r6 != r4) goto L_0x0012
                return r4
            L_0x0030:
                X.C30691eM.A01(r6)
                java.lang.Object r2 = r5.L$0
                X.0vA r2 = (X.C17750vA) r2
                goto L_0x0023
            L_0x0038:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C22821Di r2 = this.$updateTouchMode;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (((C17730v8) this.L$0).BCr(this, r0) == A03) {
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
