package com.whatsapp.chatlock;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.C000200d;
import X.C18070vi;
import X.C72473Md;
import X.C72483Me;
import X.C89894dC;
import X.C90994ey;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager;
import com.whatsapp.wds.components.button.WDSButton;

public final class HideLockedChatsActivity extends AnonymousClass1FY {
    public WDSButton A00;
    public WDSButton A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public boolean A04;

    public HideLockedChatsActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A02 = C000200d.A00(A0L.A26);
            this.A03 = AnonymousClass3MW.A0s(A0L);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            if (i2 == -1) {
                i3 = 3;
            } else {
                return;
            }
        } else if (i == 1 && i2 == -1) {
            i3 = 4;
        } else {
            return;
        }
        setResult(i3);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624055);
        C72473Md.A18(this);
        setTitle(2131891210);
        this.A00 = (WDSButton) findViewById(2131429045);
        this.A01 = (WDSButton) findViewById(2131429047);
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            boolean A012 = ChatLockPasscodeManager.A01(r0);
            WDSButton wDSButton = this.A00;
            if (A012) {
                if (wDSButton != null) {
                    wDSButton.setText(2131897669);
                    WDSButton wDSButton2 = this.A00;
                    if (wDSButton2 != null) {
                        C89894dC.A00(wDSButton2, this, 1);
                        WDSButton wDSButton3 = this.A01;
                        if (wDSButton3 != null) {
                            wDSButton3.setText(2131888097);
                            WDSButton wDSButton4 = this.A01;
                            if (wDSButton4 != null) {
                                C89894dC.A00(wDSButton4, this, 2);
                                return;
                            }
                        }
                    }
                }
                C18070vi.A11("primaryButton");
            } else {
                if (wDSButton != null) {
                    wDSButton.setText(2131889097);
                    WDSButton wDSButton5 = this.A00;
                    if (wDSButton5 != null) {
                        C89894dC.A00(wDSButton5, this, 3);
                        WDSButton wDSButton6 = this.A01;
                        if (wDSButton6 != null) {
                            wDSButton6.setVisibility(8);
                            return;
                        }
                    }
                }
                C18070vi.A11("primaryButton");
            }
            C18070vi.A11("secondaryButton");
        } else {
            C18070vi.A11("passcodeManager");
        }
        throw null;
    }

    public HideLockedChatsActivity(int i) {
        this.A04 = false;
        C90994ey.A00(this, 43);
    }
}
