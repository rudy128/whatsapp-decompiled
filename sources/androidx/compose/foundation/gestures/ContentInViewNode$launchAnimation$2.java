package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass092;
import X.AnonymousClass0CH;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C08480fA;
import X.C11120jW;
import X.C16100ri;
import X.C16840tJ;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62892sA;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
public final class ContentInViewNode$launchAnimation$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass092 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(AnonymousClass092 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((ContentInViewNode$launchAnimation$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, r4);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C16100ri r3, C30391dr r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r5) {
            AnonymousClass1 r0 = new AnonymousClass1(r5, A00);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 A03 = AnonymousClass3F6.A03();
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass092 r0 = AnonymousClass092.this;
                r0.A0B.A00 = AnonymousClass092.A00(r0);
                AnonymousClass092 r3 = AnonymousClass092.this;
                UpdatableAnimationState updatableAnimationState = r3.A0B;
                C11120jW r1 = new C11120jW(r3, (C16100ri) this.L$0, A00);
                C08480fA r02 = new C08480fA(r3);
                this.label = 1;
                if (updatableAnimationState.A00(this, r02, r1) == A03) {
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
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass1OB A00 = C62892sA.A00(((AnonymousClass1OX) this.L$0).getCoroutineContext());
            try {
                final AnonymousClass092 r2 = this.this$0;
                r2.A05 = true;
                C16840tJ r1 = r2.A03;
                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (r1.CH0(AnonymousClass0CH.Default, this, r0) == A03) {
                    return A03;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                AnonymousClass092 r12 = this.this$0;
                r12.A05 = false;
                r12.A0A.A01(e);
                this.this$0.A07 = false;
                throw th;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A0A.A00();
        AnonymousClass092 r13 = this.this$0;
        r13.A05 = false;
        r13.A0A.A01((Throwable) null);
        this.this$0.A07 = false;
        return C27621Wu.A00;
    }
}
