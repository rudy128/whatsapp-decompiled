package com.whatsapp.lastseen;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass129;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1J8;
import X.AnonymousClass1UN;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C003401n;
import X.C146447Pd;
import X.C1604688p;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C26261Rl;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C86524Rz;
import X.C88554a7;
import X.C89954dI;
import X.C91014f0;
import X.C99154sM;
import X.C99164sN;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.wds.components.banners.WDSBanner;
import com.whatsapp.wds.components.list.footer.WDSSectionFooter;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

public final class PresencePrivacyActivity extends AnonymousClass1FY implements C1604688p {
    public C26261Rl A00;
    public AnonymousClass1UN A01;
    public AnonymousClass129 A02;
    public WDSBanner A03;
    public AnonymousClass00H A04;
    public boolean A05;
    public final C86524Rz A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C86524Rz A0D;

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.4Rz] */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.4Rz] */
    public PresencePrivacyActivity() {
        this(0);
        this.A07 = C99154sM.A01(this, 46);
        this.A08 = C99154sM.A01(this, 47);
        this.A09 = C99154sM.A01(this, 48);
        this.A0A = C99154sM.A01(this, 49);
        this.A0B = C99164sN.A01(this, 0);
        this.A0C = C99164sN.A01(this, 1);
        this.A0D = new Object();
        this.A06 = new Object();
    }

    public /* synthetic */ void C5C(String str, String str2) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r5 == 6) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(android.widget.RadioButton r4, int r5, int r6, boolean r7) {
        /*
            r3 = this;
            if (r5 != r6) goto L_0x000a
            if (r7 == 0) goto L_0x000a
            X.4Rz r0 = r3.A0D
            r0.A01(r4)
        L_0x0009:
            return
        L_0x000a:
            boolean r0 = X.AnonymousClass000.A1T(r5, r6)
            r4.setChecked(r0)
            r0 = 1
            if (r5 == r0) goto L_0x001b
            r0 = 3
            if (r5 == r0) goto L_0x001b
            r0 = 6
            r2 = 1
            if (r5 != r0) goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            com.whatsapp.wds.components.banners.WDSBanner r1 = r3.A03
            if (r1 == 0) goto L_0x0009
            r0 = 0
            if (r2 == 0) goto L_0x0025
            r0 = 8
        L_0x0025:
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lastseen.PresencePrivacyActivity.A03(android.widget.RadioButton, int, int, boolean):void");
    }

    public static final void A0Q(PresencePrivacyActivity presencePrivacyActivity) {
        boolean z;
        boolean z2;
        C26261Rl r0 = presencePrivacyActivity.A00;
        if (r0 != null) {
            boolean z3 = true;
            boolean z4 = true;
            if (r0.A06.get("last") == null) {
                z4 = false;
                presencePrivacyActivity.A0D.A00();
            }
            C26261Rl r02 = presencePrivacyActivity.A00;
            if (r02 != null) {
                int A002 = r02.A00("last");
                presencePrivacyActivity.A03((RadioButton) AnonymousClass3MX.A14(presencePrivacyActivity.A08), A002, 1, z4);
                presencePrivacyActivity.A03((RadioButton) AnonymousClass3MX.A14(presencePrivacyActivity.A07), A002, 0, z4);
                presencePrivacyActivity.A03((RadioButton) AnonymousClass3MX.A14(presencePrivacyActivity.A0A), A002, 2, z4);
                presencePrivacyActivity.A03((RadioButton) AnonymousClass3MX.A14(presencePrivacyActivity.A09), A002, 3, z4);
                C26261Rl r03 = presencePrivacyActivity.A00;
                if (r03 != null) {
                    if (r03.A06.get("online") == null) {
                        z3 = false;
                        presencePrivacyActivity.A06.A00();
                    }
                    C26261Rl r04 = presencePrivacyActivity.A00;
                    if (r04 != null) {
                        int A003 = r04.A00("online");
                        RadioButton radioButton = (RadioButton) AnonymousClass3MX.A14(presencePrivacyActivity.A0B);
                        if (A003 != 0) {
                            z = false;
                            radioButton.setChecked(z);
                        } else if (z3) {
                            presencePrivacyActivity.A06.A01(radioButton);
                        } else {
                            z = true;
                            radioButton.setChecked(z);
                        }
                        RadioButton radioButton2 = (RadioButton) AnonymousClass3MX.A14(presencePrivacyActivity.A0C);
                        if (A003 != 4) {
                            z2 = false;
                        } else if (z3) {
                            presencePrivacyActivity.A06.A01(radioButton2);
                            return;
                        } else {
                            z2 = true;
                        }
                        radioButton2.setChecked(z2);
                        return;
                    }
                }
            }
        }
        C18070vi.A11("privacySettingManager");
        throw null;
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A02 = AnonymousClass3Ma.A0t(A0L);
            this.A01 = (AnonymousClass1UN) A0L.A72.get();
            this.A00 = (C26261Rl) A0L.A8j.get();
            this.A04 = AnonymousClass3MW.A0s(A0L);
        }
    }

    public void C5L() {
        this.A05.A0J(new C146447Pd(this, 39));
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C26261Rl r0 = this.A00;
        if (r0 != null) {
            r0.observeUntilDestroy(this, this);
            setContentView(2131626610);
            AnonymousClass1UN r02 = this.A01;
            if (r02 != null) {
                if (!r02.A02()) {
                    this.A03 = null;
                } else {
                    WDSBanner wDSBanner = (WDSBanner) AnonymousClass3MY.A0G((ViewStub) AnonymousClass3MY.A0C(this, 2131437009), 2131624145).findViewById(2131428058);
                    this.A03 = wDSBanner;
                    if (wDSBanner != null) {
                        C88554a7.A03(this, wDSBanner, 2131893407);
                        C89954dI.A00(wDSBanner, this, 42);
                    }
                }
                ViewStub viewStub = (ViewStub) AnonymousClass3MY.A0C(this, 2131431358);
                int i = 2131626611;
                if (AnonymousClass1J8.A06(this.A0E)) {
                    i = 2131627597;
                }
                View A0G = AnonymousClass3MY.A0G(viewStub, i);
                if (A0G instanceof WDSSectionHeader) {
                    ((WDSSectionHeader) A0G).setHeaderText(2131896026);
                }
                ViewStub viewStub2 = (ViewStub) AnonymousClass3MY.A0C(this, 2131433290);
                int i2 = 2131626613;
                if (AnonymousClass1J8.A06(this.A0E)) {
                    i2 = 2131627597;
                }
                View A0G2 = AnonymousClass3MY.A0G(viewStub2, i2);
                if (A0G2 instanceof WDSSectionHeader) {
                    ((WDSSectionHeader) A0G2).setHeaderText(2131896027);
                }
                C003401n supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.A0W(true);
                    supportActionBar.A0M(2131896030);
                    ViewStub viewStub3 = (ViewStub) AnonymousClass3MY.A0C(this, 2131434406);
                    if (AnonymousClass1J8.A06(this.A0E)) {
                        View A0G3 = AnonymousClass3MY.A0G(viewStub3, 2131627594);
                        C18070vi.A0z(A0G3, "null cannot be cast to non-null type com.whatsapp.wds.components.list.footer.WDSSectionFooter");
                        ((WDSSectionFooter) A0G3).setFooterText(2131896028);
                    } else {
                        View A0G4 = AnonymousClass3MY.A0G(viewStub3, 2131626612);
                        C18070vi.A0z(A0G4, "null cannot be cast to non-null type android.widget.TextView");
                        ((TextView) A0G4).setText(2131896028);
                    }
                    C18100vl r7 = this.A08;
                    C72453Mb.A0X(r7).setText(2131894757);
                    C18100vl r6 = this.A07;
                    C72453Mb.A0X(r6).setText(2131894759);
                    C18100vl r5 = this.A09;
                    C72453Mb.A0X(r5).setText(2131890879);
                    C18100vl r4 = this.A0A;
                    C72453Mb.A0X(r4).setText(2131894760);
                    C18100vl r3 = this.A0B;
                    C72453Mb.A0X(r3).setText(2131894759);
                    C18100vl r2 = this.A0C;
                    C72453Mb.A0X(r2).setText(2131896029);
                    C89954dI.A00(C72453Mb.A0T(r7), this, 43);
                    C89954dI.A00(C72453Mb.A0T(r6), this, 44);
                    C89954dI.A00(C72453Mb.A0T(r5), this, 38);
                    C89954dI.A00(C72453Mb.A0T(r4), this, 39);
                    C89954dI.A00(C72453Mb.A0T(r3), this, 40);
                    C89954dI.A00(C72453Mb.A0T(r2), this, 41);
                    return;
                }
                throw C17880vN.A0g();
            }
            str = "nativeContactGateKeeper";
        } else {
            str = "privacySettingManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onResume() {
        super.onResume();
        A0Q(this);
    }

    public PresencePrivacyActivity(int i) {
        this.A05 = false;
        C91014f0.A00(this, 38);
    }
}
