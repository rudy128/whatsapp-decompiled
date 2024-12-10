package com.whatsapp.chatlock;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4EF;
import X.C000200d;
import X.C18070vi;
import X.C18100vl;
import X.C31191fA;
import X.C72473Md;
import X.C72483Me;
import X.C76873oZ;
import X.C76893ob;
import X.C89884dB;
import X.C90994ey;
import X.C93754jU;
import X.C99144sL;
import android.content.Intent;
import android.os.Bundle;

public final class ChatLockRequestAuthInterstitialActivity extends AnonymousClass1FY {
    public AnonymousClass00H A00;
    public boolean A01;
    public final C18100vl A02;
    public final C93754jU A03;

    public ChatLockRequestAuthInterstitialActivity() {
        this(0);
        this.A02 = C99144sL.A01(this, 32);
        this.A03 = new C93754jU(this, 4);
    }

    public static final void A0Q(ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity) {
        AnonymousClass00H r0 = chatLockRequestAuthInterstitialActivity.A00;
        if (r0 != null) {
            AnonymousClass3MW.A0Y(r0).A02 = true;
            chatLockRequestAuthInterstitialActivity.setResult(0);
            return;
        }
        C18070vi.A11("chatLockManagerLazy");
        throw null;
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = C000200d.A00(A0L.A25);
        }
    }

    public void onDestroy() {
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            AnonymousClass3MW.A0Y(r0).A00 = false;
            super.onDestroy();
            return;
        }
        C18070vi.A11("chatLockManagerLazy");
        throw null;
    }

    public static final void A03(ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity) {
        AnonymousClass4EF r5;
        int i;
        boolean A1a = AnonymousClass3MY.A1a(chatLockRequestAuthInterstitialActivity.getIntent(), "extra_open_chat_directly");
        AnonymousClass1BI A0m = AnonymousClass3MX.A0m(chatLockRequestAuthInterstitialActivity.A02);
        if (A0m != null) {
            r5 = new C76873oZ(A0m, A1a);
        } else {
            r5 = C76893ob.A00;
        }
        AnonymousClass00H r0 = chatLockRequestAuthInterstitialActivity.A00;
        if (r0 != null) {
            C31191fA A0Y = AnonymousClass3MW.A0Y(r0);
            Intent intent = chatLockRequestAuthInterstitialActivity.getIntent();
            int i2 = 8;
            if (intent != null && intent.hasExtra("extra_unlock_entry_point")) {
                i2 = chatLockRequestAuthInterstitialActivity.getIntent().getIntExtra("extra_unlock_entry_point", 8);
                i = 4;
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = 2;
                    } else if (i2 == 2) {
                        i = 6;
                    }
                }
                A0Y.A0A(chatLockRequestAuthInterstitialActivity, r5, chatLockRequestAuthInterstitialActivity.A03, i);
                return;
            }
            if (i2 != 3) {
                i = 0;
                if (i2 != 4) {
                    i = 5;
                    if (i2 == 5) {
                        i = 3;
                    } else if (i2 == 7) {
                        i = 8;
                    } else if (i2 == 9) {
                        i = 9;
                    }
                }
            } else {
                i = 7;
            }
            A0Y.A0A(chatLockRequestAuthInterstitialActivity, r5, chatLockRequestAuthInterstitialActivity.A03, i);
            return;
        }
        C18070vi.A11("chatLockManagerLazy");
        throw null;
    }

    public void onBackPressed() {
        A0Q(this);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624028);
        C89884dB.A00(findViewById(2131428013), this, 46);
        C89884dB.A00(findViewById(2131436511), this, 47);
        A03(this);
    }

    public ChatLockRequestAuthInterstitialActivity(int i) {
        this.A01 = false;
        C90994ey.A00(this, 41);
    }
}
