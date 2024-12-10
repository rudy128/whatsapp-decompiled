package X;

import android.view.View;
import com.whatsapp.WaTextView;
import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.6Jj  reason: invalid class name and case insensitive filesystem */
public final class C121366Jj extends AnonymousClass6KO {
    public final View A00;
    public final WaTextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121366Jj(View view, C131416l3 r11, C37451pZ r12, C18000vb r13, AnonymousClass1c4 r14, UpdatesFragment updatesFragment) {
        super(view, r11, r12, r14, updatesFragment);
        C18070vi.A0o(r14, r13, r11);
        WaTextView A0U = AnonymousClass3MW.A0U(view, 2131435885);
        this.A01 = A0U;
        View findViewById = view.findViewById(2131435059);
        this.A00 = findViewById;
        C18070vi.A0X(findViewById);
        findViewById.setVisibility(8);
        C43421zm.A04(C17880vN.A0E(view, 2131435061));
        C43421zm.A04(A0U);
        AnonymousClass3NL.A01(view.getContext(), AnonymousClass3MW.A0H(view, 2131429091), r13, 2131233242);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r4.A03 == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass6JR r4) {
        /*
            r3 = this;
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            boolean r0 = r4.A01
            r2 = 0
            if (r0 == 0) goto L_0x0028
            java.util.List r0 = r4.A00
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0028
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x0028
        L_0x0018:
            com.whatsapp.WaTextView r0 = r3.A01
            X.C18070vi.A0W(r0)
            if (r1 != 0) goto L_0x0021
            r2 = 8
        L_0x0021:
            r0.setVisibility(r2)
            super.A0D(r4)
            return
        L_0x0028:
            r1 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121366Jj.A0D(X.6JR):void");
    }
}
