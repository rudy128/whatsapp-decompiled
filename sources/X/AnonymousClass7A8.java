package X;

import android.os.Bundle;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerActivity;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.7A8  reason: invalid class name */
public class AnonymousClass7A8 implements AnonymousClass1XI {
    public final int A00;
    public final Object A01;

    public AnonymousClass7A8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity) {
        ((PrivacyDisclosureContainerViewModel) privacyDisclosureContainerActivity.A03.getValue()).A00++;
    }

    public final void Bv0(String str, Bundle bundle) {
        Integer num;
        int i;
        String str2;
        CallInfo A0Q;
        switch (this.A00) {
            case 0:
                C25811Ps.A00(bundle, (C125786bg) this.A01, str);
                return;
            case 1:
                AnonymousClass6BJ.A0s(bundle, (AnonymousClass6BJ) this.A01);
                return;
            case 2:
                PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity = (PrivacyDisclosureContainerActivity) this.A01;
                C18070vi.A0d(bundle, 2);
                String string = bundle.getString("result", (String) null);
                C18070vi.A0X(string);
                if (string.equals("RESULT_ACCEPT")) {
                    num = AnonymousClass00R.A00;
                } else if (string.equals("RESULT_OK")) {
                    num = AnonymousClass00R.A01;
                } else if (string.equals("RESULT_DENY")) {
                    num = AnonymousClass00R.A0C;
                } else if (string.equals("RESULT_BACK")) {
                    num = AnonymousClass00R.A0N;
                } else if (string.equals("RESULT_OPT_IN")) {
                    num = AnonymousClass00R.A0Y;
                } else if (string.equals("RESULT_OPT_OUT")) {
                    num = AnonymousClass00R.A0j;
                } else if (string.equals("RESULT_ERROR")) {
                    num = AnonymousClass00R.A0u;
                } else {
                    throw AnonymousClass000.A0k(string);
                }
                switch (num.intValue()) {
                    case 0:
                        A00(privacyDisclosureContainerActivity);
                        i = 5;
                        break;
                    case 1:
                        A00(privacyDisclosureContainerActivity);
                        i = 155;
                        break;
                    case 2:
                        i = 165;
                        ((PrivacyDisclosureContainerViewModel) privacyDisclosureContainerActivity.A03.getValue()).A0T(165);
                        break;
                    case 3:
                        PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel = (PrivacyDisclosureContainerViewModel) privacyDisclosureContainerActivity.A03.getValue();
                        privacyDisclosureContainerViewModel.A00--;
                        i = 145;
                        break;
                    case 4:
                        A00(privacyDisclosureContainerActivity);
                        i = 160;
                        break;
                    case 5:
                        A00(privacyDisclosureContainerActivity);
                        i = 162;
                        break;
                    default:
                        i = 499;
                        break;
                }
                if (PrivacyDisclosureContainerActivity.A0W(privacyDisclosureContainerActivity)) {
                    return;
                }
                PrivacyDisclosureContainerActivity.A0V(privacyDisclosureContainerActivity, i);
                return;
            default:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A01;
                switch (str.hashCode()) {
                    case 558227610:
                        if (!str.equals("switch_to_video_result")) {
                            return;
                        }
                        if (C108995ce.A1a(voipActivityV2)) {
                            Log.i("CallControlState/onUpgradeCallConfirmed");
                            AnonymousClass4aL.A03((AnonymousClass4aL) voipActivityV2.A1i.get());
                            return;
                        }
                        CallInfo A0Q2 = VoipActivityV2.A0Q(voipActivityV2);
                        if (A0Q2 != null && !A0Q2.isGroupCall && A0Q2.self.A08 == 0 && VoipActivityV2.A1w(C108955ca.A0T(A0Q2), voipActivityV2, 1, true)) {
                            A99 a99 = voipActivityV2.A0u;
                            C17960vV.A07(a99);
                            a99.A0b();
                            return;
                        }
                        return;
                    case 1613228019:
                        str2 = "more_menu_dismissed";
                        break;
                    case 1762316666:
                        str2 = "participant_list_request";
                        break;
                    case 1865632648:
                        if (str.equals("switch_result") && (A0Q = VoipActivityV2.A0Q(voipActivityV2)) != null && A0Q.getPeerJid() != null) {
                            VoipActivityV2.A1F(A0Q.getPeerJid(), voipActivityV2);
                            return;
                        }
                        return;
                    default:
                        return;
                }
                if (str.equals(str2) && !voipActivityV2.A2E) {
                    VoipActivityV2.A28(voipActivityV2);
                    return;
                }
                return;
        }
    }
}
