package com.whatsapp.payments.ui;

import X.AFQ;
import X.AH2;
import X.AnonymousClass00H;
import X.AnonymousClass1MD;
import X.AnonymousClass1QD;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8GX;
import X.AnonymousClass8RC;
import X.C110885hR;
import X.C166888eG;
import X.C173438v4;
import X.C17880vN;
import X.C17890vO;
import X.C189759jn;
import X.C19880zA;
import X.C20113A7w;
import X.C20338AGu;
import X.C20989Ach;
import X.C29621ca;
import X.C30931ek;
import X.C31061ex;
import X.C40751vD;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.Jid;
import com.whatsapp.wds.components.button.WDSButton;

public class ViralityLinkVerifierActivity extends C166888eG {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public C19880zA A05;
    public C40751vD A06;
    public WaTextView A07;
    public WaTextView A08;
    public AnonymousClass1QD A09;
    public C31061ex A0A;
    public AnonymousClass1QO A0B;
    public AnonymousClass1QS A0C;
    public AnonymousClass8GX A0D;
    public C30931ek A0E;
    public C189759jn A0F;
    public WDSButton A0G;
    public WDSButton A0H;
    public AnonymousClass00H A0I;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0D = (AnonymousClass8GX) AnonymousClass8BR.A0C(new AH2(AnonymousClass8BT.A06(this), this, 6), this).A00(AnonymousClass8GX.class);
        setContentView(2131627443);
        AFQ.A00(C110885hR.A0A(this, 2131436841), this, 31);
        this.A02 = C110885hR.A0A(this, 2131427545);
        this.A04 = C110885hR.A0A(this, 2131436844);
        this.A03 = C110885hR.A0A(this, 2131434187);
        this.A08 = AnonymousClass3MW.A0T(this.A04, 2131433533);
        this.A07 = AnonymousClass3MW.A0T(this.A04, 2131436843);
        WDSButton wDSButton = (WDSButton) C110885hR.A0A(this, 2131430126);
        this.A0G = wDSButton;
        AFQ.A00(wDSButton, this, 32);
        WDSButton wDSButton2 = (WDSButton) C110885hR.A0A(this, 2131431155);
        this.A0H = wDSButton2;
        AFQ.A00(wDSButton2, this, 33);
        this.A03.setVisibility(0);
        this.A04.setVisibility(8);
        this.A02.setVisibility(8);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(C110885hR.A0A(this, 2131436842));
        A022.A0V(0);
        A022.A0W(3);
        A022.A0a(new AnonymousClass8RC(this, 1));
        AnonymousClass8BW.A0y(this);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(AnonymousClass3Ma.A00(this, 2130968798, 2131099872));
        AnonymousClass8GX r4 = this.A0D;
        String str = r4.A09;
        if (str != null) {
            C31061ex r3 = r4.A04;
            String A012 = r4.A08.A01();
            if (A012 == null) {
                A012 = "";
            }
            AnonymousClass1MD[] r7 = new AnonymousClass1MD[2];
            boolean A1W = C17890vO.A1W("action", "verify-deep-link", r7);
            C17880vN.A1Q("device-id", A012, r7, 1);
            AnonymousClass1MD[] r1 = new AnonymousClass1MD[1];
            C17880vN.A1Q("payload", str, r1, A1W ? 1 : 0);
            C29621ca r6 = new C29621ca(AnonymousClass8BR.A0k("link", r1), "account", r7);
            C20989Ach ach = new C20989Ach(r4, 6);
            AnonymousClass00H r42 = r3.A0H;
            String A0T = C17890vO.A0T(r42);
            AnonymousClass1MD[] r32 = new AnonymousClass1MD[4];
            r32[0] = new AnonymousClass1MD((Jid) C173438v4.A00, "to");
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r32, 1);
            C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T, r32);
            AnonymousClass8BV.A1O("xmlns", "w:pay", r32);
            C17880vN.A0U(r42).A0J(ach, AnonymousClass8BT.A0a(r6, r32), A0T, 204, C20113A7w.A0L);
        }
        C20338AGu.A00(this, this.A0D.A00, 2);
    }
}
