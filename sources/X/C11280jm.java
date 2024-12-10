package X;

import android.view.DragEvent;

/* renamed from: X.0jm  reason: invalid class name and case insensitive filesystem */
public final class C11280jm extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0HB $event$inlined;
    public final /* synthetic */ C98494rF $match;
    public final /* synthetic */ AnonymousClass09W this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11280jm(AnonymousClass0HB r2, AnonymousClass09W r3, C98494rF r4) {
        super(1);
        this.$match = r4;
        this.this$0 = r3;
        this.$event$inlined = r2;
    }

    /* renamed from: A00 */
    public final AnonymousClass0CR invoke(C17700v5 r6) {
        if (r6 instanceof C17460uh) {
            C17460uh r4 = (C17460uh) r6;
            if (AnonymousClass0QV.A05(this.this$0).getDragAndDropManager().BfA(r4)) {
                DragEvent dragEvent = this.$event$inlined.A00;
                long A0p = AnonymousClass001.A0p(dragEvent.getX(), dragEvent.getY());
                long j = AnonymousClass0QY.A03;
                if (AnonymousClass0EY.A00(r4, A0p)) {
                    this.$match.element = r6;
                    return AnonymousClass0CR.CancelTraversal;
                }
            }
        }
        return AnonymousClass0CR.ContinueTraversal;
    }
}
