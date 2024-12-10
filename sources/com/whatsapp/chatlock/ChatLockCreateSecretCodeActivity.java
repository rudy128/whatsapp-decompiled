package com.whatsapp.chatlock;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C000200d;
import X.C18070vi;
import X.C72473Md;
import X.C72483Me;
import X.C75093dz;
import X.C90994ey;
import X.C99184sP;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager;

public final class ChatLockCreateSecretCodeActivity extends C75093dz {
    public int A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;

    public ChatLockCreateSecretCodeActivity() {
        this(0);
        this.A00 = 1;
    }

    public static final void A03(ChatLockCreateSecretCodeActivity chatLockCreateSecretCodeActivity, boolean z) {
        AnonymousClass00H r0 = chatLockCreateSecretCodeActivity.A05;
        if (r0 != null) {
            ((ChatLockPasscodeManager) r0.get()).A05(new C99184sP(1, chatLockCreateSecretCodeActivity, z));
        } else {
            C18070vi.A11("passcodeManager");
            throw null;
        }
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A02 = AnonymousClass3MY.A0S(A0L);
            this.A05 = C000200d.A00(A0L.A26);
            this.A01 = C000200d.A00(A0L.A24);
            this.A02 = AnonymousClass3MW.A0s(A0L);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        int i;
        this.A00 = getIntent().getIntExtra("entrypoint", 1);
        super.onCreate(bundle);
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            if (ChatLockPasscodeManager.A01(r0)) {
                setTitle(2131888096);
                if (this.A00 == 0) {
                    A4b().requestFocus();
                }
                i = 3;
            } else {
                setTitle(2131889096);
                A4b().requestFocus();
                i = 0;
            }
            AnonymousClass00H r02 = this.A01;
            if (r02 != null) {
                AnonymousClass3MX.A0a(r02).A05(Integer.valueOf(i), Integer.valueOf(this.A00));
                A4b().setHelperText(getString(2131895540));
                return;
            }
            str = "chatLockLogger";
        } else {
            str = "passcodeManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public ChatLockCreateSecretCodeActivity(int i) {
        this.A03 = false;
        C90994ey.A00(this, 39);
    }
}
