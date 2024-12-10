package X;

import android.view.View;
import java.util.List;

/* renamed from: X.6Cs  reason: invalid class name and case insensitive filesystem */
public final class C120186Cs extends C134066px {
    public AnonymousClass24P A00;
    public final AnonymousClass00H A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120186Cs(View view, AnonymousClass11C r3, C18000vb r4, AnonymousClass1KW r5, C18010vc r6, AnonymousClass00H r7) {
        super(view, r3, r4, r5, r6);
        C18070vi.A0w(r4, r5, r3, r6, r7);
        C18070vi.A0d(view, 6);
        this.A01 = r7;
    }

    public final void A04(C59152lq r5, AnonymousClass24P r6, List list, int i) {
        boolean A1Z = C72453Mb.A1Z(r5);
        this.A00 = r6;
        A03(r5.A01, list);
        int i2 = (int) r5.A00;
        this.A01.setText(((AnonymousClass4XM) this.A01.get()).A01(i2));
        A02(i2, i, r6.A0v.A02, A1Z);
    }
}
