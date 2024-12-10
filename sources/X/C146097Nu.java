package X;

import com.whatsapp.inappsupport.ui.SupportVideoActivity;

/* renamed from: X.7Nu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146097Nu implements AnonymousClass88Q {
    public final /* synthetic */ SupportVideoActivity A00;
    public final /* synthetic */ String A01;

    public final void BtC(String str, String str2, boolean z) {
        String str3;
        SupportVideoActivity supportVideoActivity = this.A00;
        String str4 = this.A01;
        C121996Mj r3 = supportVideoActivity.A05;
        if (r3 != null) {
            r3.setPlayControlVisibility(8);
            C121996Mj r0 = supportVideoActivity.A05;
            if (r0 != null) {
                r0.A04();
                boolean A09 = supportVideoActivity.A07.A09();
                C73203Rj A002 = AnonymousClass4a6.A00(supportVideoActivity);
                if (!A09) {
                    A002.A0D(2131892928);
                    A002.A0T(false);
                    A002.setPositiveButton(2131890172, AnonymousClass757.A00(supportVideoActivity, 45));
                    AnonymousClass3MY.A0L(A002).show();
                    str3 = "NETWORK_ERROR";
                } else {
                    A002.A0E(2131889562);
                    A002.A0D(2131896261);
                    A002.A0T(false);
                    A002.setPositiveButton(2131890172, AnonymousClass757.A00(supportVideoActivity, 44));
                    AnonymousClass3MY.A0L(A002).show();
                    str3 = "DOWNLOAD_FAILED";
                }
                AnonymousClass00H r02 = supportVideoActivity.A07;
                if (r02 != null) {
                    String str5 = supportVideoActivity.A09;
                    String str6 = supportVideoActivity.A0A;
                    C1185063s r1 = new C1185063s();
                    r1.A01 = C17880vN.A0k();
                    r1.A07 = str4;
                    r1.A05 = str3;
                    r1.A04 = str5;
                    r1.A06 = str6;
                    ((C35541mP) r02.get()).A00.CC4(r1);
                    return;
                }
                C18070vi.A11("supportLogging");
                throw null;
            }
        }
        C18070vi.A11("videoPlayerControllerView");
        throw null;
    }

    public /* synthetic */ C146097Nu(SupportVideoActivity supportVideoActivity, String str) {
        this.A00 = supportVideoActivity;
        this.A01 = str;
    }
}
