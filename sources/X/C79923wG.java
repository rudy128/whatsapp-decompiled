package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.3wG  reason: invalid class name and case insensitive filesystem */
public final class C79923wG extends C196289ul {
    public final AnonymousClass11P A00;
    public final AnonymousClass121 A01;
    public final AnonymousClass1PQ A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public String A08(Context context, C20285AEt aEt, C20271AEe aEe) {
        String str;
        String optString;
        C18070vi.A0d(context, 0);
        if (aEe == null || (str = aEe.A00) == null || (optString = C17880vN.A16(str).optString("display_text_secondary")) == null || optString.length() == 0) {
            return AnonymousClass3MX.A15(context, 2131892389);
        }
        return optString;
    }

    public void A0B(Activity activity, AnonymousClass5XY r2, AnonymousClass206 r3, C20271AEe aEe, Class cls) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0j(aEe, r3);
        A0A(activity, r2, r3, aEe, 0);
    }

    public boolean A0F(C18030ve r3, C166418cr r4) {
        C18070vi.A0d(r3, 1);
        return !C18020vd.A05(C18040vf.A02, r3, 5075);
    }

    public String A07() {
        return "cta_cancel_reminder";
    }

    public C79923wG(AnonymousClass11P r1, AnonymousClass121 r2, AnonymousClass1PQ r3, AnonymousClass10I r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r1, r4, r5, r6, r3);
        C18070vi.A0q(r2, r7, r8);
        this.A00 = r1;
        this.A03 = r4;
        this.A05 = r5;
        this.A04 = r6;
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = r7;
        this.A07 = r8;
    }

    public void A0A(Activity activity, AnonymousClass5XY r6, AnonymousClass206 r7, C20271AEe aEe, int i) {
        C18070vi.A0i(activity, r7);
        C73203Rj A002 = AnonymousClass4a6.A00(activity);
        A002.A0E(2131892394);
        A002.A0D(2131892391);
        A002.A0Z(new AnonymousClass4bC((Object) this, (Object) r7, 15), 2131892393);
        C73203Rj.A07(A002, 18, 2131892392);
        AnonymousClass3MY.A1G(A002);
    }

    public int A04() {
        return 2131232146;
    }
}
