package X;

import android.view.View;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.6Ji  reason: invalid class name and case insensitive filesystem */
public final class C121356Ji extends AnonymousClass6KO {
    public final WDSSectionHeader A00;

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
            if (r0 == 0) goto L_0x0025
            java.util.List r0 = r4.A00
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0025
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x0025
        L_0x0018:
            com.whatsapp.wds.components.list.header.WDSSectionHeader r0 = r3.A00
            if (r1 != 0) goto L_0x001e
            r2 = 8
        L_0x001e:
            r0.setVisibility(r2)
            super.A0D(r4)
            return
        L_0x0025:
            r1 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121356Ji.A0D(X.6JR):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121356Ji(View view, C131416l3 r4, C37451pZ r5, AnonymousClass1c4 r6, UpdatesFragment updatesFragment) {
        super(view, r4, r5, r6, updatesFragment);
        C18070vi.A0j(r6, r4);
        WDSSectionHeader wDSSectionHeader = (WDSSectionHeader) AnonymousClass3MX.A0C(view, 2131435885);
        this.A00 = wDSSectionHeader;
        wDSSectionHeader.setAddOnType(AnonymousClass6Pj.A00);
    }
}
