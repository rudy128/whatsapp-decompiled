package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.0jp  reason: invalid class name and case insensitive filesystem */
public final class C11310jp extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $block;
    public final /* synthetic */ C22811Dh $clampingNeeded;
    public final /* synthetic */ C05780Vr $endState;
    public final /* synthetic */ AnonymousClass0Q3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11310jp(AnonymousClass0Q3 r2, C05780Vr r3, C22821Di r4, C22811Dh r5) {
        super(1);
        this.this$0 = r2;
        this.$endState = r3;
        this.$block = r4;
        this.$clampingNeeded = r5;
    }

    public final void A00(AnonymousClass0J2 r4) {
        SuspendAnimationKt.A08(r4, this.this$0.A04);
        AnonymousClass0Q3 r1 = this.this$0;
        C17330uU r2 = r4.A05;
        Object A02 = AnonymousClass0Q3.A02(r1, r2.getValue());
        if (!C18070vi.A18(A02, r2.getValue())) {
            this.this$0.A04.A05.setValue(A02);
            this.$endState.A05.setValue(A02);
            C22821Di r12 = this.$block;
            if (r12 != null) {
                r12.invoke(this.this$0);
            }
            r4.A01();
            this.$clampingNeeded.element = true;
            return;
        }
        C22821Di r13 = this.$block;
        if (r13 != null) {
            r13.invoke(this.this$0);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((AnonymousClass0J2) obj);
        return C27621Wu.A00;
    }
}
