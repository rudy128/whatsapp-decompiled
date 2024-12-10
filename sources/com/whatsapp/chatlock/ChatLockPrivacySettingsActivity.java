package com.whatsapp.chatlock;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass3MY;
import X.AnonymousClass4R5;
import X.AnonymousClass4aq;
import X.C000200d;
import X.C18070vi;
import X.C31191fA;
import X.C34241kA;
import X.C38541rS;
import X.C72473Md;
import X.C72483Me;
import X.C90004dN;
import X.C90994ey;
import X.C93754jU;
import X.C98754rf;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.whatsapp.WaTextView;
import com.whatsapp.settings.SettingsRowIconText;
import com.whatsapp.util.Log;

public final class ChatLockPrivacySettingsActivity extends AnonymousClass1FY {
    public AnonymousClass4R5 A00;
    public C31191fA A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public boolean A04;
    public final C34241kA A05;

    public ChatLockPrivacySettingsActivity() {
        this(0);
        this.A05 = new C93754jU(this, 3);
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = (AnonymousClass4R5) A0L.AH7.get();
            this.A02 = C000200d.A00(A0L.A24);
            this.A01 = AnonymousClass3MY.A0S(A0L);
            this.A03 = C000200d.A00(A0L.A5j);
        }
    }

    public void onCreate(Bundle bundle) {
        Log.i("ChatLockPrivacySettingsActivity/onCreate");
        super.onCreate(bundle);
        AnonymousClass3MY.A0t(this, 2131888157);
        C72473Md.A18(this);
        setContentView(2131624029);
        C18070vi.A0X(AnonymousClass1HF.A06(this.A00, 2131429044));
        AnonymousClass4aq r4 = new AnonymousClass4aq(this, 42);
        SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(2131436510);
        settingsRowIconText.setIcon((Drawable) null);
        settingsRowIconText.A01((Drawable) null, false);
        C90004dN.A00(settingsRowIconText, this, r4, 4);
        WaTextView waTextView = (WaTextView) findViewById(2131429043);
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            waTextView.setText(((C38541rS) r0.get()).A04(AnonymousClass3MY.A04(waTextView), new C98754rf(this, 4), C18070vi.A0F(this, 2131888167), "learn-more", 2131103158));
            C72473Md.A1C(waTextView);
            C72473Md.A1D(waTextView);
            return;
        }
        C18070vi.A11("linkifierUtils");
        throw null;
    }

    public ChatLockPrivacySettingsActivity(int i) {
        this.A04 = false;
        C90994ey.A00(this, 40);
    }
}
