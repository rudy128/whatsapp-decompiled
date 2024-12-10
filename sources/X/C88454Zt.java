package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Zt  reason: invalid class name and case insensitive filesystem */
public final class C88454Zt {
    public C010105w A00;
    public C95174lo A01;
    public final AnonymousClass4KM A02;
    public final AnonymousClass1M9 A03;
    public final C30801eX A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass00H A07;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r8.A00 != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.view.View r6, X.C88454Zt r7, X.C62602rf r8, java.lang.String r9) {
        /*
            if (r8 == 0) goto L_0x0009
            int r0 = r8.A00
            r5 = 2131887139(0x7f120423, float:1.9408877E38)
            if (r0 == 0) goto L_0x000c
        L_0x0009:
            r5 = 2131887136(0x7f120420, float:1.940887E38)
        L_0x000c:
            A02(r7)
            android.app.Activity r4 = X.AnonymousClass3Ma.A05(r6)
            android.content.Context r0 = X.AnonymousClass3MY.A04(r6)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            java.lang.String r2 = r4.getString(r0)
            X.1FB r4 = (X.AnonymousClass1FB) r4
            r1 = 0
            X.4fn r0 = new X.4fn
            r0.<init>(r6, r7, r9, r1)
            r3.A0i(r4, r0, r2)
            r0 = 2131887132(0x7f12041c, float:1.9408862E38)
            r3.A0E(r0)
            r3.A0D(r5)
            X.05w r0 = r3.create()
            r7.A00 = r0
            if (r0 == 0) goto L_0x0041
            r0.show()
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88454Zt.A00(android.view.View, X.4Zt, X.2rf, java.lang.String):void");
    }

    public static final void A02(C88454Zt r1) {
        C010105w r12 = r1.A00;
        if (r12 != null && !AnonymousClass1L9.A00(r12.getContext()).isFinishing()) {
            r12.cancel();
        }
    }

    public C88454Zt(AnonymousClass4KM r2, AnonymousClass1M9 r3, AnonymousClass11P r4, C30801eX r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r4, r6, r3, r5, r2);
        C18070vi.A0d(r7, 6);
        this.A06 = r4;
        this.A07 = r6;
        this.A03 = r3;
        this.A04 = r5;
        this.A02 = r2;
        this.A05 = r7;
    }

    public static final void A01(View view, C88454Zt r18, String str) {
        Activity A052 = AnonymousClass3Ma.A05(view);
        C88454Zt r4 = r18;
        String str2 = str;
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(str2);
        C17960vV.A07(A022);
        A052.startActivity(((AnonymousClass1LU) r4.A07.get()).A1u(A052, new AnonymousClass1E7(A022)).putExtra("user_actions_on_business_profile_common_fields", new C1417376t((Double) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, ((C195369tE) r4.A05.get()).A01(), -1.0d, -1, 0, 1)));
        C30801eX r0 = r4.A04;
        UserJid A023 = C22941Dw.A02(str2);
        C17960vV.A07(A023);
        r0.A05(A023, "business_search", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
