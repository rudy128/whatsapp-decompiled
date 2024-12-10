package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass1GP;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.AnonymousClass4bB;
import X.C1411874q;
import X.C18070vi;
import X.C34001jj;
import X.C43251zV;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment;
import com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseMessageDialogFragment extends Hilt_BaseMessageDialogFragment {
    public void A2C(AnonymousClass1GP r2, String str) {
        C18070vi.A0d(r2, 0);
        C34001jj r0 = new C34001jj(r2);
        r0.A0B(this, str);
        r0.A02();
    }

    public final String A2H(String str, String str2, String str3) {
        Object obj;
        int i = A15().getInt(str);
        if (i == 0) {
            return null;
        }
        AbstractList stringArrayList = A15().getStringArrayList(str2);
        if (stringArrayList == null) {
            return A1H(i);
        }
        ArrayList<Integer> integerArrayList = A15().getIntegerArrayList(str3);
        if (integerArrayList == null || integerArrayList.size() != stringArrayList.size()) {
            throw AnonymousClass000.A0k("Failed requirement.");
        }
        int size = stringArrayList.size();
        Object[] objArr = new Object[size];
        int size2 = stringArrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Number number = integerArrayList.get(i2);
            if (number == null || number.intValue() != 1) {
                obj = stringArrayList.get(i2);
            } else {
                Object obj2 = stringArrayList.get(i2);
                C18070vi.A0X(obj2);
                obj = Long.valueOf(Long.parseLong((String) obj2));
            }
            objArr[i2] = obj;
        }
        return A1I(i, Arrays.copyOf(objArr, size));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass1FU r3;
        MediaViewBaseFragment mediaViewBaseFragment;
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        Fragment fragment = this.A0E;
        if (!(fragment instanceof MediaViewFragment) || (mediaViewBaseFragment = (MediaViewBaseFragment) fragment) == null || A15().getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, -1) != 101) {
            AnonymousClass1FL A1B = A1B();
            if ((A1B instanceof AnonymousClass1FU) && (r3 = (AnonymousClass1FU) A1B) != null) {
                r3.A3h(A15().getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, -1));
                return;
            }
            return;
        }
        mediaViewBaseFragment.A2D();
    }

    public void A1v() {
        if (A15().getInt("secondary_action_color_res", -1) != -1) {
            this.A00 = A15().getInt("secondary_action_color_res", -1);
        }
        super.A1v();
    }

    public final Dialog A27(Bundle bundle) {
        CharSequence charSequence;
        int i;
        int i2;
        C73203Rj A04 = AnonymousClass4a6.A04(this);
        A04.A0T(true);
        if (this instanceof LegacyMessageDialogFragment) {
            CharSequence charSequence2 = A15().getCharSequence("title");
            if (charSequence2 == null) {
                charSequence2 = A2H("title_res", "title_params_values", "title_params_types");
            }
            A04.setTitle(charSequence2);
            LegacyMessageDialogFragment legacyMessageDialogFragment = (LegacyMessageDialogFragment) this;
            int i3 = legacyMessageDialogFragment.A15().getInt("message_view_id");
            if (i3 != 0) {
                A04.A0F(i3);
            } else {
                CharSequence charSequence3 = legacyMessageDialogFragment.A15().getCharSequence("message");
                if (charSequence3 == null) {
                    charSequence3 = legacyMessageDialogFragment.A2H("message_res", "message_params_values", "message_params_types");
                }
                charSequence = C43251zV.A03(legacyMessageDialogFragment.A14(), (Paint) null, legacyMessageDialogFragment.A02, charSequence3);
                A04.A0S(charSequence);
            }
        } else {
            if (A15().getInt("title_res") != 0) {
                A04.A0E(A15().getInt("title_res"));
            }
            if (A15().getInt("message_res") != 0) {
                charSequence = A2H("message_res", "message_params_values", "message_params_types");
                A04.A0S(charSequence);
            }
        }
        if (this instanceof ReportToAdminDialogFragment) {
            AnonymousClass4bB.A00(A04, this, 34, 2131895226);
            i = 2131898766;
            i2 = 32;
        } else if (this instanceof DeleteEnforcedMessageDialogFragment) {
            AnonymousClass4bB.A00(A04, this, 33, 2131898874);
            i = 2131898766;
            i2 = 31;
        } else {
            LegacyMessageDialogFragment legacyMessageDialogFragment2 = (LegacyMessageDialogFragment) this;
            if (legacyMessageDialogFragment2.A15().getInt("primary_action_text_id_res") == 0 || legacyMessageDialogFragment2.A00 == null) {
                A04.setPositiveButton(2131899286, new AnonymousClass4aq(legacyMessageDialogFragment2, 1));
                return AnonymousClass3MY.A0L(A04);
            }
            A04.setPositiveButton(legacyMessageDialogFragment2.A15().getInt("primary_action_text_id_res"), legacyMessageDialogFragment2.A00);
            if (!(legacyMessageDialogFragment2.A15().getInt("secondary_action_text_res") == 0 || legacyMessageDialogFragment2.A01 == null)) {
                A04.setNegativeButton(legacyMessageDialogFragment2.A15().getInt("secondary_action_text_res"), legacyMessageDialogFragment2.A01);
            }
            return AnonymousClass3MY.A0L(A04);
        }
        A04.setNegativeButton(i, new C1411874q(i2));
        return AnonymousClass3MY.A0L(A04);
    }
}
