package X;

import com.whatsapp.util.Log;

/* renamed from: X.1cM  reason: invalid class name and case insensitive filesystem */
public final class C29481cM {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public C29481cM(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    public int A00() {
        AnonymousClass00H r5 = this.A01;
        if (((AnonymousClass11Z) r5.get()).A02() < C31141f5.A01((AnonymousClass11Z) r5.get(), (C18030ve) this.A00.get())) {
            StringBuilder sb = new StringBuilder();
            sb.append("AccountSwitcherBridgeImpl/shouldAllowSwitchingAccounts/low on storage; available storage = ");
            sb.append(((AnonymousClass11Z) r5.get()).A02());
            Log.i(sb.toString());
            return 1;
        } else if (((AnonymousClass1HS) this.A03.get()).A01()) {
            Log.i("AccountSwitcherBridgeImpl/shouldAllowSwitchingAccounts/call in progress");
            return 2;
        } else if (!((C36801oU) this.A02.get()).A0P.get()) {
            return 0;
        } else {
            Log.i("AccountSwitcherBridgeImpl/shouldAllowSwitchingAccounts/backup in progress");
            return 3;
        }
    }
}
