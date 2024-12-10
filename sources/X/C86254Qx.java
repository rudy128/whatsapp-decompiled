package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.4Qx  reason: invalid class name and case insensitive filesystem */
public final class C86254Qx {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public final void A00(Context context, AnonymousClass5a4 r10) {
        AnonymousClass00H r0 = this.A03;
        r0.get();
        if (!((C39541tF) r0.get()).A01()) {
            Log.w("InteropOptinManager: interop is not enabled, stop");
            return;
        }
        Context context2 = context;
        if (C72463Mc.A1X(this.A01)) {
            Intent A06 = AnonymousClass3MZ.A06(this.A04);
            A06.setClassName(context.getPackageName(), "com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsActivity");
            context.startActivity(A06);
            return;
        }
        ((C37291pH) this.A02.get()).A02(context2, C138126wZ.A05, new C97124ox(context, this, r10), 20240306, (String) null);
    }

    public C86254Qx(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A02 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = r4;
        this.A04 = r5;
    }
}
