package com.whatsapp.chatlock;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1TK;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C000200d;
import X.C18070vi;
import X.C19740yt;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C75093dz;
import X.C90994ey;
import X.C99244sV;
import android.content.res.ColorStateList;
import android.os.Bundle;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager;

public final class ChatLockConfirmSecretCodeActivity extends C75093dz {
    public int A00;
    public AnonymousClass1TK A01;
    public AnonymousClass00H A02;
    public String A03;
    public boolean A04;

    public ChatLockConfirmSecretCodeActivity() {
        this(0);
        this.A00 = 1;
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A02 = AnonymousClass3MY.A0S(A0L);
            this.A05 = C000200d.A00(A0L.A26);
            this.A02 = C000200d.A00(A0L.A24);
            this.A01 = (AnonymousClass1TK) A0L.AH9.get();
        }
    }

    public static final void A03(ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity) {
        chatLockConfirmSecretCodeActivity.A4b().setEndIconMode(2);
        chatLockConfirmSecretCodeActivity.A4b().setEndIconTintList(ColorStateList.valueOf(C19740yt.A00(chatLockConfirmSecretCodeActivity, 2131101222)));
        chatLockConfirmSecretCodeActivity.A4b().setHelperText("");
        chatLockConfirmSecretCodeActivity.A4b().setHelperTextColor(C19740yt.A03(chatLockConfirmSecretCodeActivity, C72463Mc.A01(chatLockConfirmSecretCodeActivity)));
    }

    public static final void A0Q(ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity) {
        chatLockConfirmSecretCodeActivity.A4b().setError((CharSequence) null);
        chatLockConfirmSecretCodeActivity.A4b().setEndIconMode(-1);
        chatLockConfirmSecretCodeActivity.A4b().setEndIconDrawable(2131233239);
        chatLockConfirmSecretCodeActivity.A4b().setEndIconContentDescription(2131895556);
        chatLockConfirmSecretCodeActivity.A4b().setEndIconTintList(ColorStateList.valueOf(C19740yt.A00(chatLockConfirmSecretCodeActivity, 2131101098)));
        chatLockConfirmSecretCodeActivity.A4b().setHelperText(chatLockConfirmSecretCodeActivity.getResources().getString(2131888720));
        chatLockConfirmSecretCodeActivity.A4b().setHelperTextColor(C19740yt.A03(chatLockConfirmSecretCodeActivity, 2131101098));
    }

    public void A4e() {
        String str;
        super.A4e();
        String str2 = this.A03;
        if (str2 == null) {
            str = "correctSecretCode";
        } else if (str2.length() == 0) {
            AnonymousClass00H r0 = this.A05;
            if (r0 != null) {
                ((ChatLockPasscodeManager) r0.get()).A04(A4d(), C99244sV.A00(this, 5));
                return;
            }
            str = "passcodeManager";
        } else if (A4g()) {
            A0Q(this);
            return;
        } else {
            A03(this);
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCreate(Bundle bundle) {
        this.A00 = getIntent().getIntExtra("entrypoint", 1);
        super.onCreate(bundle);
        setTitle(2131888718);
        A4b().requestFocus();
        this.A03 = C72453Mb.A0x(getIntent(), "extra_secret_code");
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            AnonymousClass3MX.A0a(r0).A05(1, Integer.valueOf(this.A00));
        } else {
            C18070vi.A11("chatLockLogger");
            throw null;
        }
    }

    public ChatLockConfirmSecretCodeActivity(int i) {
        this.A04 = false;
        C90994ey.A00(this, 38);
    }
}
