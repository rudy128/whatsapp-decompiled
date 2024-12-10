package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass0UX;
import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C10230i0;
import X.C16080rg;
import X.C16100ri;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C98484rE;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {844}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollingLogic$doFlingAnimation$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $available;
    public final /* synthetic */ C98484rE $result;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, C30391dr r3, C98484rE r4, long j) {
        super(2, r3);
        this.this$0 = scrollingLogic;
        this.$result = r4;
        this.$available = j;
    }

    /* renamed from: A00 */
    public final Object invoke(C16100ri r3, C30391dr r4) {
        return ((ScrollingLogic$doFlingAnimation$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, r8, this.$result, this.$available);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        C98484rE r11;
        long j;
        ScrollingLogic scrollingLogic2;
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            scrollingLogic = this.this$0;
            AnonymousClass0UX r7 = new AnonymousClass0UX(scrollingLogic, new C10230i0((C16100ri) this.L$0, scrollingLogic));
            r11 = this.$result;
            long j2 = this.$available;
            C16080rg r4 = scrollingLogic.A01;
            j = r11.element;
            float A00 = scrollingLogic.A00(j2);
            if (scrollingLogic.A05) {
                A00 *= -1.0f;
            }
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = r11;
            this.J$0 = j;
            this.label = 1;
            obj = r4.CBc(r7, this, A00);
            if (obj == A03) {
                return A03;
            }
            scrollingLogic2 = scrollingLogic;
        } else if (i == 1) {
            j = this.J$0;
            r11 = (C98484rE) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        float A04 = AnonymousClass000.A04(obj);
        if (scrollingLogic2.A05) {
            A04 *= -1.0f;
        }
        r11.element = scrollingLogic.A02(A04, j);
        return C27621Wu.A00;
    }
}
