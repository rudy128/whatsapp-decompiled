package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass0AV;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1", f = "Scrollable.kt", i = {}, l = {669}, m = "invokeSuspend", n = {}, s = {})
public final class MouseWheelScrollNode$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass0AV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollNode$1(AnonymousClass0AV r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C17730v8 r3, C30391dr r4) {
        return ((MouseWheelScrollNode$1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        MouseWheelScrollNode$1 mouseWheelScrollNode$1 = new MouseWheelScrollNode$1(this.this$0, r4);
        mouseWheelScrollNode$1.L$0 = obj;
        return mouseWheelScrollNode$1;
    }

    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1", f = "Scrollable.kt", i = {0}, l = {671}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1  reason: invalid class name */
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
        /* JADX WARNING: Removed duplicated region for block: B:15:0x006b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x002d A[EDGE_INSN: B:19:0x002d->B:9:0x002d ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                X.1g4 r10 = X.AnonymousClass3F6.A03()
                int r0 = r11.label
                r9 = 1
                if (r0 == 0) goto L_0x005a
                if (r0 != r9) goto L_0x006c
                java.lang.Object r8 = r11.L$0
                X.0vA r8 = (X.C17750vA) r8
                X.C30691eM.A01(r12)
            L_0x0012:
                X.0Hm r12 = (X.AnonymousClass0Hm) r12
                java.util.List r7 = r12.A03
                int r2 = r7.size()
                r6 = 0
                r1 = 0
            L_0x001c:
                if (r1 >= r2) goto L_0x002d
                X.0KX r0 = X.AnonymousClass000.A0f(r7, r1)
                boolean r0 = r0.A02()
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0061
                int r1 = r1 + 1
                goto L_0x001c
            L_0x002d:
                X.0AV r0 = X.AnonymousClass0AV.this
                X.0rh r0 = r0.A00
                X.C18070vi.A0b(r0)
                X.0AV r1 = X.AnonymousClass0AV.this
                long r4 = r0.BDt(r12, r8)
                androidx.compose.foundation.gestures.ScrollingLogic r0 = r1.A01
                X.1OX r3 = r1.A0B()
                r2 = 0
                androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1 r1 = new androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1
                r1.<init>(r0, r2, r4)
                r0 = 3
                X.AnonymousClass4Z4.A02(r2, r2, r1, r3, r0)
                int r1 = r7.size()
            L_0x004e:
                if (r6 >= r1) goto L_0x0061
                X.0KX r0 = X.AnonymousClass000.A0f(r7, r6)
                r0.A01()
                int r6 = r6 + 1
                goto L_0x004e
            L_0x005a:
                X.C30691eM.A01(r12)
                java.lang.Object r8 = r11.L$0
                X.0vA r8 = (X.C17750vA) r8
            L_0x0061:
                r11.L$0 = r8
                r11.label = r9
                java.lang.Object r12 = androidx.compose.foundation.gestures.ScrollableKt.A02(r8, r11)
                if (r12 != r10) goto L_0x0012
                return r10
            L_0x006c:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass0AV r2 = this.this$0;
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
