package com.whatsapp.bridge.wfs.ui;

import X.A8V;
import X.A9B;
import X.AFM;
import X.AGB;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass11V;
import X.AnonymousClass181;
import X.AnonymousClass19D;
import X.AnonymousClass1D6;
import X.AnonymousClass1DC;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1MH;
import X.AnonymousClass2Df;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.AnonymousClass5a6;
import X.AnonymousClass782;
import X.AnonymousClass8BT;
import X.AnonymousClass8BV;
import X.AnonymousClass8BX;
import X.BAU;
import X.C000200d;
import X.C108965cb;
import X.C108975cc;
import X.C110885hR;
import X.C137116uw;
import X.C139576z4;
import X.C166988f1;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C191869nK;
import X.C193029pQ;
import X.C19830z4;
import X.C198509yS;
import X.C198779yt;
import X.C21434Ak1;
import X.C219017v;
import X.C22881Do;
import X.C25351CeA;
import X.C26166Ctg;
import X.C26302CxJ;
import X.C30101dO;
import X.C30391dr;
import X.C33841jT;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import X.C72463Mc;
import X.C72933Og;
import X.C825248h;
import X.C86154Qk;
import X.C86284Ra;
import X.C95294m0;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bridge.wfs.WfsManager$startWfs$1;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class LinkedUsersActivity extends RegisterPhone implements BAU, AnonymousClass5a6 {
    public AnonymousClass181 A00;
    public AnonymousClass1LU A01;
    public C86154Qk A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public Map A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass11V A08;

    public void CAY(Integer num, String str, String str2, String str3, String str4, String str5, String str6, AnonymousClass1D6 r27, int i) {
        String str7;
        String str8;
        AnonymousClass1D6 r7 = r27;
        C18070vi.A0d(r7, 3);
        Map map = this.A05;
        if (map != null) {
            Object A0w = AnonymousClass000.A0w(map, 551495536);
            if (A0w != null) {
                C30101dO r3 = (C30101dO) A0w;
                AnonymousClass19D r2 = this.A00;
                C18070vi.A0W(r2);
                if (C18020vd.A05(C18040vf.A02, r2, 4972)) {
                    this.A0A.A1t((String) r7.first, (String) r7.second);
                    r3.A04("PRECHAT_TEST");
                    A8V A0e = AnonymousClass8BT.A0e(this);
                    int i2 = i;
                    if (i2 == 2) {
                        str8 = "wfs_ig";
                    } else {
                        str8 = "wfs_fb";
                    }
                    A0e.A0H("wfs", str8);
                    getIntent().putExtra("should_show_notif", true);
                    super.A4q();
                    getIntent().removeExtra("should_show_notif");
                    CEx();
                    ((ViewStub) C110885hR.A0A(this, 2131437072)).inflate();
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MY.A0C(this, 2131436315);
                    HashMap A11 = C17880vN.A11();
                    A11.put("privacy-policy", this.A03.A01("https://www.whatsapp.com/legal/privacy-policy", false, false, false));
                    A11.put("terms-and-privacy-policy", this.A03.A01("https://www.whatsapp.com/legal/terms-of-service", false, false, false));
                    C18030ve r4 = this.A0E;
                    AnonymousClass1KB r32 = this.A05;
                    AnonymousClass1L9 r22 = this.A01;
                    AnonymousClass1L9 r11 = r22;
                    AnonymousClass1KB r12 = r32;
                    C26302CxJ.A0M(this, r11, r12, textEmojiLabel, this.A08, r4, getString(2131898565), A11);
                    textEmojiLabel.setHighlightColor(0);
                    TextView textView = (TextView) AnonymousClass3MY.A0H(this, 2131431938);
                    textView.setText(C26166Ctg.A01(C25351CeA.A01(Locale.getDefault())));
                    textView.setOnClickListener(new C825248h(textView, this, 12));
                    AnonymousClass4aX.A0E(textView, AnonymousClass3Ma.A01(this, getResources(), 2130971979, 2131103154));
                    C19830z4 r0 = this.A0A;
                    C17880vN.A1D(C19830z4.A00(r0), "eula_accepted_time", System.currentTimeMillis());
                    String str9 = str4;
                    if (!(str4 == null || str9.length() == 0)) {
                        ImageView imageView = (ImageView) C110885hR.A0A(this, 2131432059);
                        AnonymousClass10I r5 = this.A05;
                        AnonymousClass1KB r42 = this.A05;
                        AnonymousClass181 r33 = this.A00;
                        if (r33 != null) {
                            AnonymousClass1KB r122 = r42;
                            AnonymousClass181 r13 = r33;
                            new C86284Ra(r122, r13, this.A0Q, r5, C17880vN.A0e(imageView.getContext().getCacheDir(), "linked_user_cache"), "linked_user_image").A00().A03(imageView, str9);
                        } else {
                            str7 = "statistics";
                        }
                    }
                    AnonymousClass3MW.A0I(this, 2131433229).setText(A9B.A0H((String) r7.first, (String) r7.second));
                    C110885hR.A0A(this, 2131432058).setOnClickListener(new AFM(this, num, str, str2, str3, str5, str6, r7, i2));
                    C110885hR.A0A(this, 2131432057).setOnClickListener(new AnonymousClass782(this, 49));
                    return;
                }
                r3.A04("PRECHAT_CONTROL");
                r3.A00();
                A11(this);
                return;
            }
            throw C17880vN.A0g();
        }
        str7 = "xFamilyUserFlowLoggers";
        C18070vi.A11(str7);
        throw null;
    }

    public void CAZ(C198509yS r6, String str, String str2) {
        boolean A17 = C18070vi.A17(str, str2);
        this.A0A.A1t(str, str2);
        this.A0A.A23(r6.A04);
        this.A0A.A22(false);
        this.A0A.A2B(false);
        C33841jT r0 = this.A0I;
        String str3 = r6.A02;
        r0.A0D(str, str2, str3);
        C33841jT.A03(this.A0I, 2, A17);
        ((C22881Do) this.A0V.get()).A00(false, 0);
        this.A0I.A05();
        super.A4k(str, str2, str3);
    }

    public void onCreate(Bundle bundle) {
        String str;
        getIntent().putExtra("should_show_notif", false);
        super.onCreate(bundle);
        getIntent().removeExtra("should_show_notif");
        setContentView(2131627619);
        CNB(0, 2131891797);
        this.A06 = false;
        C18000vb r0 = this.A00;
        r0.A09.add(this.A08);
        AnonymousClass00H r02 = this.A03;
        if (r02 != null) {
            C191869nK A0J = AnonymousClass8BX.A0J(r02);
            C18070vi.A0X(A0J);
            boolean z = A0J.A01;
            AnonymousClass00H r03 = this.A04;
            if (z) {
                if (r03 != null) {
                    C198779yt r4 = (C198779yt) r03.get();
                    C193029pQ r3 = A0J.A00;
                    if (r3 != null) {
                        r4.A08.CGN(new C21434Ak1(r4, r3, this, 11));
                        return;
                    }
                    throw C17880vN.A0g();
                }
            } else if (r03 != null) {
                C198779yt r7 = (C198779yt) r03.get();
                C139576z4 r8 = this.A0E;
                C18070vi.A0W(r8);
                AnonymousClass3MW.A1X(r7.A0H, new WfsManager$startWfs$1(this, this, r7, r8, (C30391dr) null), r7.A0I);
                return;
            }
            str = "wfsManager";
        } else {
            str = "wfsBridgeFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A11(LinkedUsersActivity linkedUsersActivity) {
        String str;
        AnonymousClass00H r0 = linkedUsersActivity.A03;
        if (r0 != null) {
            AnonymousClass8BX.A0J(r0).A03 = false;
            C33841jT.A03(linkedUsersActivity.A0I, 0, true);
            if (linkedUsersActivity.A01 != null) {
                linkedUsersActivity.startActivity(AnonymousClass1LU.A01(linkedUsersActivity));
                linkedUsersActivity.finish();
                return;
            }
            str = "waIntents";
        } else {
            str = "wfsBridgeFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A00 = C72463Mc.A0e(r2);
            this.A00 = AnonymousClass1K1.A1f(A002);
            this.A07 = C72453Mb.A0d(r2);
            C166988f1.A0t(r2, r1, AnonymousClass3MZ.A0l(r2), this);
            C166988f1.A0r(A002, r2, r1, this, r2.A03);
            C166988f1.A0u(r2, r1, this);
            this.A0E = AnonymousClass8BV.A0A(r2);
            C166988f1.A0v(r2, AnonymousClass3MY.A0Z(r2), this);
            this.A0f = C108975cc.A0O(r2);
            this.A0S = (C219017v) r2.A6S.get();
            this.A0U = AnonymousClass3MZ.A0z(r2);
            this.A0O = (AnonymousClass1MH) r2.A0a.get();
            this.A0I = (AnonymousClass2Df) r1.A5Y.get();
            C166988f1.A0s(A002, r2, this, r2.A2E.get());
            C166988f1.A0q(A002, r2, r1, AnonymousClass3Ma.A0r(r2), this);
            this.A02 = (C86154Qk) r1.ACm.get();
            this.A00 = C108965cb.A0H(r2);
            this.A01 = AnonymousClass3MY.A0Z(r2);
            this.A03 = C000200d.A00(r1.A5E);
            this.A04 = C000200d.A00(r1.AJL);
            this.A05 = r1.A0A();
        }
    }

    public C72933Og BMY() {
        C18000vb r4 = this.A00;
        C18070vi.A0W(r4);
        AnonymousClass11S r3 = this.A02;
        C18070vi.A0W(r3);
        AnonymousClass11C r2 = this.A08;
        C18070vi.A0W(r2);
        AnonymousClass1DC r1 = this.A04;
        C18070vi.A0W(r1);
        C18000vb r0 = this.A00;
        C18070vi.A0W(r0);
        return new C72933Og(this, r4, C26166Ctg.A02(r3, r2, r0, r1), C26166Ctg.A04());
    }

    public void onDestroy() {
        C18000vb r0 = this.A00;
        r0.A09.remove(this.A08);
        super.onDestroy();
    }

    public LinkedUsersActivity(int i) {
        this.A07 = false;
        AGB.A00(this, 26);
    }

    public LinkedUsersActivity() {
        this(0);
        this.A08 = new C95294m0(this, 1);
    }
}
