package X;

import androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1;
import java.util.concurrent.CancellationException;

/* renamed from: X.4fe  reason: invalid class name and case insensitive filesystem */
public final class C91414fe implements AnonymousClass1GC {
    public final /* synthetic */ C27581Wq A00;
    public final /* synthetic */ C27581Wq A01;
    public final /* synthetic */ AnonymousClass1OS A02;
    public final /* synthetic */ C98494rF A03;
    public final /* synthetic */ C31761g5 A04;
    public final /* synthetic */ AnonymousClass1OX A05;
    public final /* synthetic */ C35911n2 A06;

    public C91414fe(C27581Wq r1, C27581Wq r2, AnonymousClass1OS r3, C98494rF r4, C31761g5 r5, AnonymousClass1OX r6, C35911n2 r7) {
        this.A01 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = r2;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
    }

    public final void C6U(C27581Wq r7, AnonymousClass1F9 r8) {
        if (r7 == this.A01) {
            this.A03.element = AnonymousClass3MY.A0s(new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1((C30391dr) null, this.A02, this.A06), this.A05);
            return;
        }
        if (r7 == this.A00) {
            C98494rF r1 = this.A03;
            AnonymousClass1OB r0 = (AnonymousClass1OB) r1.element;
            if (r0 != null) {
                r0.BEM((CancellationException) null);
            }
            r1.element = null;
        }
        if (r7 == C27581Wq.ON_DESTROY) {
            this.A04.resumeWith(C27621Wu.A00);
        }
    }
}
