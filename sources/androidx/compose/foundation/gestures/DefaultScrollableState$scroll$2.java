package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass0CH;
import X.AnonymousClass0UZ;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C04320Ms;
import X.C16100ri;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
public final class DefaultScrollableState$scroll$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $block;
    public final /* synthetic */ AnonymousClass0CH $scrollPriority;
    public int label;
    public final /* synthetic */ AnonymousClass0UZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultScrollableState$scroll$2(AnonymousClass0CH r2, AnonymousClass0UZ r3, C30391dr r4, AnonymousClass1OS r5) {
        super(2, r4);
        this.this$0 = r3;
        this.$scrollPriority = r2;
        this.$block = r5;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((DefaultScrollableState$scroll$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new DefaultScrollableState$scroll$2(this.$scrollPriority, this.this$0, r6, this.$block);
    }

    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C16100ri r3, C30391dr r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r5) {
            AnonymousClass1 r0 = new AnonymousClass1(r5, r2);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 A03 = AnonymousClass3F6.A03();
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                Object obj2 = this.L$0;
                AnonymousClass000.A1C(AnonymousClass0UZ.this.A02, true);
                AnonymousClass1OS r0 = r2;
                this.label = 1;
                if (r0.invoke(obj2, this) == A03) {
                    return A03;
                }
            } else if (i == 1) {
                try {
                    C30691eM.A01(obj);
                } catch (Throwable th) {
                    AnonymousClass000.A1C(AnonymousClass0UZ.this.A02, false);
                    throw th;
                }
            } else {
                throw AnonymousClass000.A0l();
            }
            AnonymousClass000.A1C(AnonymousClass0UZ.this.A02, false);
            return C27621Wu.A00;
        }
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass0UZ r6 = this.this$0;
            C04320Ms r5 = r6.A00;
            C16100ri r4 = r6.A01;
            AnonymousClass0CH r3 = this.$scrollPriority;
            final AnonymousClass1OS r2 = this.$block;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (r5.A01(r3, r4, this, r0) == A03) {
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
