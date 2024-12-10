package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass0AS;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.AnonymousClass4Z4;
import X.C18560wh;
import X.C26199CuU;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollableGesturesNode$onDragStopped$1 extends C30431dv implements C36001nB {
    public /* synthetic */ long J$0;
    public int label;
    public final /* synthetic */ AnonymousClass0AS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableGesturesNode$onDragStopped$1(AnonymousClass0AS r2, C30391dr r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    public final Object A00(C30391dr r3, long j) {
        ScrollableGesturesNode$onDragStopped$1 scrollableGesturesNode$onDragStopped$1 = new ScrollableGesturesNode$onDragStopped$1(this.this$0, r3);
        scrollableGesturesNode$onDragStopped$1.J$0 = j;
        return scrollableGesturesNode$onDragStopped$1.invokeSuspend(C27621Wu.A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00((C30391dr) obj3, ((C26199CuU) obj2).A03());
    }

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1$1", f = "Scrollable.kt", i = {}, l = {612}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
            return ((AnonymousClass1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r6, j);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 A03 = AnonymousClass3F6.A03();
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                ScrollingLogic scrollingLogic = AnonymousClass0AS.this.A00;
                long j = j;
                this.label = 1;
                if (scrollingLogic.A06(this, j) == A03) {
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

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            final long j = this.J$0;
            AnonymousClass1OX A02 = this.this$0.A01.A02();
            final AnonymousClass0AS r0 = this.this$0;
            AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new AnonymousClass1((C30391dr) null), A02, 3);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
