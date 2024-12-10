package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass11T;
import X.AnonymousClass17K;
import X.AnonymousClass1E7;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4bC;
import X.C010105w;
import X.C1411874q;
import X.C1412674y;
import X.C17880vN;
import X.C17890vO;
import X.C22941Dw;
import X.C23231Ff;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

public class ChangeNumberNotificationDialogFragment extends Hilt_ChangeNumberNotificationDialogFragment {
    public AnonymousClass1M9 A00;
    public C23231Ff A01;
    public AnonymousClass11P A02;
    public AnonymousClass1LU A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.conversation.Hilt_ChangeNumberNotificationDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.conversation.ChangeNumberNotificationDialogFragment] */
    public static ChangeNumberNotificationDialogFragment A00(UserJid userJid, UserJid userJid2, String str) {
        ? hilt_ChangeNumberNotificationDialogFragment = new Hilt_ChangeNumberNotificationDialogFragment();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D, userJid, "convo_jid");
        AnonymousClass3MY.A15(A0D, userJid2, "new_jid");
        A0D.putString("old_display_name", str);
        hilt_ChangeNumberNotificationDialogFragment.A1R(A0D);
        return hilt_ChangeNumberNotificationDialogFragment;
    }

    public void A1x(Context context) {
        super.A1x(context);
        try {
            this.A01 = (C23231Ff) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(AnonymousClass000.A0y(" must implement ChangeNumberNotificationDialogListener", C17890vO.A0f(context)));
        }
    }

    public Dialog A27(Bundle bundle) {
        Bundle A15 = A15();
        try {
            String string = A15.getString("convo_jid");
            C22941Dw r0 = UserJid.Companion;
            UserJid A032 = C22941Dw.A03(string);
            UserJid A033 = C22941Dw.A03(A15.getString("new_jid"));
            String string2 = A15.getString("old_display_name");
            if (TextUtils.isEmpty(string2)) {
                string2 = "UNKNOWN";
            }
            AnonymousClass1E7 A0H = this.A00.A0H(A033);
            boolean A1W = AnonymousClass000.A1W(A0H.A0H);
            C73203Rj A002 = AnonymousClass4a6.A00(A1n());
            C1411874q r6 = new C1411874q(17);
            AnonymousClass4bC r7 = new AnonymousClass4bC((Object) this, (Object) A0H, 10);
            C1412674y r3 = new C1412674y(this, A0H, 1, A1W);
            if (A032.equals(A033)) {
                if (A1W) {
                    A002.A0S(AnonymousClass3MX.A16(this, this.A01.A0G(AnonymousClass17K.A02(A0H)), new Object[1], 0, 2131888043));
                    A002.setPositiveButton(2131893144, r6);
                } else {
                    A002.A0S(AnonymousClass3MX.A16(this, AnonymousClass17K.A02(A0H), AnonymousClass3MX.A1b(string2, 0), 1, 2131888053));
                    A002.setNegativeButton(2131898766, r6);
                    A002.setPositiveButton(2131898687, r3);
                }
            } else if (A1W) {
                A002.A0S(AnonymousClass3MX.A16(this, this.A01.A0G(AnonymousClass17K.A02(A0H)), new Object[1], 0, 2131888043));
                A002.setPositiveButton(2131890837, r6);
                A002.A0Y(r7, 2131888045);
            } else {
                A002.A0S(AnonymousClass3MY.A0o(this, string2, 0, 2131888054));
                A002.A0Y(r7, 2131895709);
                A002.setPositiveButton(2131898687, r3);
                A002.setNegativeButton(2131898766, r6);
            }
            C010105w create = A002.create();
            create.setCanceledOnTouchOutside(true);
            return create;
        } catch (AnonymousClass11T e) {
            throw new RuntimeException(e);
        }
    }
}
