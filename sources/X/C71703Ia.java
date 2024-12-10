package X;

import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.3Ia  reason: invalid class name and case insensitive filesystem */
public final class C71703Ia extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UpdatesViewModel $updatesViewModel;
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71703Ia(UpdatesFragment updatesFragment, UpdatesViewModel updatesViewModel) {
        super(1);
        this.this$0 = updatesFragment;
        this.$updatesViewModel = updatesViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r4 < 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            com.whatsapp.updates.ui.UpdatesFragment r0 = r8.this$0
            X.1FL r7 = r0.A1B()
            boolean r0 = r7 instanceof X.C23311Fn
            if (r0 == 0) goto L_0x0063
            X.1Fn r7 = (X.C23311Fn) r7
            if (r7 == 0) goto L_0x0063
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r8.$updatesViewModel
            java.util.List r1 = com.whatsapp.updates.viewmodels.UpdatesViewModel.A05(r0)
            boolean r0 = r1 instanceof java.util.Collection
            r6 = 0
            if (r0 == 0) goto L_0x006c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x006c
        L_0x001f:
            com.whatsapp.HomeActivity r7 = (com.whatsapp.HomeActivity) r7
            int r0 = r7.A01
            int r4 = r6 - r0
            int r0 = r7.A00
            r3 = 300(0x12c, float:4.2E-43)
            if (r0 == r3) goto L_0x0068
            X.00H r0 = r7.A1g
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            X.0ve r2 = r0.A02
            r1 = 10994(0x2af2, float:1.5406E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0063
            X.0z4 r0 = r7.A0A
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "newsletter_message_received"
            boolean r2 = X.C17880vN.A1W(r1, r0)
            X.1bB r1 = r7.A0b
            int r0 = com.whatsapp.HomeActivity.A0c(r3)
            X.1bC r1 = r1.A0J(r0)
            if (r2 == 0) goto L_0x0066
            if (r4 <= 0) goto L_0x0066
            int r0 = r1.A00
            int r0 = r0 + r4
            r1.A00 = r0
            r7.A01 = r6
            r7.A4h()
        L_0x0063:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0066:
            if (r4 >= 0) goto L_0x0063
        L_0x0068:
            com.whatsapp.HomeActivity.A1A(r7)
            goto L_0x0063
        L_0x006c:
            java.util.Iterator r5 = r1.iterator()
        L_0x0070:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r5.next()
            X.6Jh r0 = (X.C121346Jh) r0
            long r3 = r0.A09
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0070
            int r6 = r6 + 1
            if (r6 >= 0) goto L_0x0070
            X.AnonymousClass1ZU.A0A()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71703Ia.invoke(java.lang.Object):java.lang.Object");
    }
}
