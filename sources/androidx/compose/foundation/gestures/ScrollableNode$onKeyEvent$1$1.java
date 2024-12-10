package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass0CH;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C16100ri;
import X.C16840tJ;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollableNode$onKeyEvent$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $scrollAmount;
    public final /* synthetic */ ScrollingLogic $this_with;
    public int label;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C16100ri r3, C30391dr r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r6) {
            AnonymousClass1 r0 = new AnonymousClass1(r6, j);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                ScrollingLogic.this.A04((C16100ri) this.L$0, 4, j);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onKeyEvent$1$1(ScrollingLogic scrollingLogic, C30391dr r3, long j) {
        super(2, r3);
        this.$this_with = scrollingLogic;
        this.$scrollAmount = j;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((ScrollableNode$onKeyEvent$1$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ScrollableNode$onKeyEvent$1$1(this.$this_with, r6, this.$scrollAmount);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final ScrollingLogic scrollingLogic = this.$this_with;
            C16840tJ r5 = scrollingLogic.A03;
            AnonymousClass0CH r4 = AnonymousClass0CH.UserInput;
            final long j = this.$scrollAmount;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (r5.CH0(r4, this, r0) == A03) {
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
