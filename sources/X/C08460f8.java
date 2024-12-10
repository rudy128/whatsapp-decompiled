package X;

import android.view.View;

/* renamed from: X.0f8  reason: invalid class name and case insensitive filesystem */
public final class C08460f8 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass09V this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08460f8(AnonymousClass09V r2) {
        super(0);
        this.this$0 = r2;
    }

    public final void A00() {
        AnonymousClass09V r1 = this.this$0;
        View view = r1.A01;
        Object A00 = C02690Ez.A00(AnonymousClass0PK.A04, r1);
        AnonymousClass09V r12 = this.this$0;
        View view2 = (View) A00;
        r12.A01 = view2;
        C28644ECa A002 = r12.A08;
        Object A003 = C02690Ez.A00(AnonymousClass0OD.A01, r12);
        AnonymousClass09V r0 = this.this$0;
        C28644ECa eCa = (C28644ECa) A003;
        r0.A08 = eCa;
        if (r0.A02 == null || !C18070vi.A18(view2, view) || !C18070vi.A18(eCa, A002)) {
            AnonymousClass09V.A02(this.this$0);
        }
        AnonymousClass09V.A03(this.this$0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        A00();
        return C27621Wu.A00;
    }
}
