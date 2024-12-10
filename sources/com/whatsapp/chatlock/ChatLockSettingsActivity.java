package com.whatsapp.chatlock;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1TK;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C000200d;
import X.C18070vi;
import X.C31191fA;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C89884dB;
import X.C89894dC;
import X.C90994ey;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.WaTextView;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager;

public final class ChatLockSettingsActivity extends AnonymousClass1FY {
    public LinearLayout A00;
    public SwitchCompat A01;
    public C31191fA A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public WaTextView A06;
    public boolean A07;

    public ChatLockSettingsActivity() {
        this(0);
    }

    private final void A03() {
        String str;
        WaTextView waTextView = this.A06;
        if (waTextView == null) {
            str = "secretCodeState";
        } else {
            AnonymousClass00H r0 = this.A04;
            if (r0 != null) {
                boolean A012 = ChatLockPasscodeManager.A01(r0);
                int i = 2131895543;
                if (A012) {
                    i = 2131895544;
                }
                waTextView.setText(i);
                return;
            }
            str = "passcodeManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A03 = C000200d.A00(A0L.A24);
            this.A02 = AnonymousClass3MY.A0S(A0L);
            this.A04 = C000200d.A00(A0L.A26);
            this.A05 = AnonymousClass3MW.A0s(A0L);
        }
    }

    public final C31191fA A4b() {
        C31191fA r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chatLockManager");
        throw null;
    }

    public static final void A0Q(ChatLockSettingsActivity chatLockSettingsActivity, boolean z) {
        String str;
        if (z != ((AnonymousClass1TK) chatLockSettingsActivity.A4b().A0B.get()).A04()) {
            AnonymousClass00H r0 = chatLockSettingsActivity.A03;
            if (r0 != null) {
                AnonymousClass3MX.A0a(r0).A00(C72453Mb.A04(z ? 1 : 0));
            } else {
                str = "chatLockLogger";
                C18070vi.A11(str);
                throw null;
            }
        }
        chatLockSettingsActivity.A4b().A0J(z);
        SwitchCompat switchCompat = chatLockSettingsActivity.A01;
        if (switchCompat == null) {
            str = "hideLockedChatsSwitch";
            C18070vi.A11(str);
            throw null;
        }
        switchCompat.setChecked(((AnonymousClass1TK) chatLockSettingsActivity.A4b().A0B.get()).A04());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        View view;
        Resources A0H;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            if (i == 2) {
                if (i2 == 3) {
                    A4b();
                    view = this.A00;
                    A0H = C72463Mc.A0H(this, view);
                    i3 = 2131891211;
                } else if (i2 == 4) {
                    A4b();
                    view = this.A00;
                    A0H = C72463Mc.A0H(this, view);
                    i3 = 2131891215;
                }
                C31191fA.A00(A0H, view, i3);
                A0Q(this, true);
            }
        } else if (i2 == -1) {
            A4b();
            View view2 = this.A00;
            C31191fA.A00(C72463Mc.A0H(this, view2), view2, 2131895545);
        } else if (i2 == 2) {
            A4b();
            View view3 = this.A00;
            C31191fA.A00(C72463Mc.A0H(this, view3), view3, 2131895555);
            A0Q(this, false);
        }
        A03();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        AnonymousClass3MY.A0t(this, 2131888177);
        C72473Md.A18(this);
        setContentView(2131624031);
        AnonymousClass3MX.A0L(this, 2131435014).setText(2131895548);
        C89884dB.A00(findViewById(2131435013), this, 49);
        this.A00 = (LinearLayout) findViewById(2131431454);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(2131431455);
        this.A01 = switchCompat;
        if (switchCompat == null) {
            str = "hideLockedChatsSwitch";
        } else {
            switchCompat.setChecked(((AnonymousClass1TK) A4b().A0B.get()).A04());
            LinearLayout linearLayout = this.A00;
            if (linearLayout == null) {
                str = "hideLockedChatsSettingView";
            } else {
                C89894dC.A00(linearLayout, this, 0);
                this.A06 = (WaTextView) findViewById(2131435016);
                A03();
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public ChatLockSettingsActivity(int i) {
        this.A07 = false;
        C90994ey.A00(this, 42);
    }
}
