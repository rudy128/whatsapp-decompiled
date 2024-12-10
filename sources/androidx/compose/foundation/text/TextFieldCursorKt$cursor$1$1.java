package androidx.compose.foundation.text;

import X.AnonymousClass000;
import X.AnonymousClass0Q3;
import X.AnonymousClass0WF;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.AnonymousClass4Z4;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
public final class TextFieldCursorKt$cursor$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0Q3 $cursorAlpha;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldCursorKt$cursor$1$1(AnonymousClass0Q3 r2, C30391dr r3) {
        super(2, r3);
        this.$cursorAlpha = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((TextFieldCursorKt$cursor$1$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new TextFieldCursorKt$cursor$1$1(this.$cursorAlpha, r4);
    }

    @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", i = {}, l = {53, 55}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
            return ((AnonymousClass1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x003e A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.1g4 r5 = X.AnonymousClass3F6.A03()
                int r0 = r6.label
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L_0x0014
                if (r0 == r3) goto L_0x0029
                if (r0 != r4) goto L_0x003f
                X.C30691eM.A01(r7)
            L_0x0011:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x0014:
                X.C30691eM.A01(r7)
                X.0Q3 r2 = X.AnonymousClass0Q3.this
                r1 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r0 = new java.lang.Float
                r0.<init>(r1)
                r6.label = r3
                java.lang.Object r0 = r2.A07(r0, r6)
                if (r0 != r5) goto L_0x002c
                return r5
            L_0x0029:
                X.C30691eM.A01(r7)
            L_0x002c:
                X.0Q3 r2 = X.AnonymousClass0Q3.this
                r0 = 0
                java.lang.Float r1 = new java.lang.Float
                r1.<init>(r0)
                X.0rY r0 = X.C03990Lk.A00
                r6.label = r4
                java.lang.Object r0 = r2.A06(r0, r1, r2.A05(), r6)
                if (r0 != r5) goto L_0x0011
                return r5
            L_0x003f:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass0WF r3 = AnonymousClass0WF.A00;
            final AnonymousClass0Q3 r2 = this.$cursorAlpha;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (AnonymousClass4Z4.A00(this, r3, r0) == A03) {
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
