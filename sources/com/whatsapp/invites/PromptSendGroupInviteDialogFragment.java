package com.whatsapp.invites;

import X.AnonymousClass1EC;
import X.AnonymousClass1FL;
import X.AnonymousClass1PU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.AnonymousClass4b5;
import X.C010105w;
import X.C17880vN;
import X.C18000vb;
import X.C24921Me;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;

public class PromptSendGroupInviteDialogFragment extends Hilt_PromptSendGroupInviteDialogFragment {
    public C24921Me A00;
    public AnonymousClass1PU A01;

    public Dialog A27(Bundle bundle) {
        String str;
        int i;
        int i2;
        Bundle A15 = A15();
        AnonymousClass1FL A1D = A1D();
        ArrayList A1A = AnonymousClass3MZ.A1A(A15, UserJid.class, "jids");
        Intent intent = (Intent) A15.getParcelable("invite_intent");
        int i3 = A15.getInt("invite_intent_code");
        boolean z = A15.getBoolean("is_cag_and_community_add");
        ArrayList<String> arrayList = null;
        if (intent != null) {
            str = intent.getStringExtra("group_jid");
        } else {
            str = null;
        }
        AnonymousClass1EC A02 = AnonymousClass1EC.A01.A02(str);
        boolean A03 = this.A01.A03(A02);
        if (intent != null) {
            arrayList = intent.getStringArrayListExtra("sms_invites_jids");
        }
        if (intent != null) {
            i = intent.getIntExtra("invite_trigger_source", 0);
        } else {
            i = 0;
        }
        AnonymousClass4b5 r11 = new AnonymousClass4b5(intent, this, A02, arrayList, i3, i);
        C73203Rj A002 = AnonymousClass4a6.A00(A1D);
        C18000vb r9 = this.A01;
        if (A03) {
            i2 = 2131755309;
        } else {
            i2 = 2131755160;
            if (z) {
                i2 = 2131755053;
            }
        }
        long size = (long) A1A.size();
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = r9.A0F(this.A00.A0Z(A1A, 3));
        A002.A0S(r9.A0K(A1a, i2, size));
        int i4 = 2131887593;
        if (A03) {
            i4 = 2131887594;
        }
        A002.setPositiveButton(i4, r11);
        C010105w A0N = AnonymousClass3MX.A0N(r11, A002, 2131898766);
        A0N.setCanceledOnTouchOutside(false);
        return A0N;
    }

    public static Bundle A00(Intent intent, Collection collection, boolean z) {
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A17(A0D, "jids", collection);
        A0D.putParcelable("invite_intent", intent);
        A0D.putBoolean("is_cag_and_community_add", z);
        return A0D;
    }
}
