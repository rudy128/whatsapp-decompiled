package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.registration.sendsmstowa.SendSmsToWa;
import com.whatsapp.util.DocumentWarningDialogFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.789  reason: invalid class name */
public class AnonymousClass789 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public AnonymousClass789(Object obj, Object obj2, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = obj2;
    }

    public final void onClick(View view) {
        DialogFragment A002;
        String str;
        AnonymousClass21V r11;
        switch (this.A00) {
            case 0:
                AnonymousClass1FU r2 = (AnonymousClass1FU) this.A01;
                boolean z = this.A03;
                AnonymousClass1BI r0 = (AnonymousClass1BI) this.A02;
                Integer num = AnonymousClass00R.A0Y;
                if (z) {
                    A002 = AnonymousClass4GY.A00((AnonymousClass1BI) null, (Boolean) null, num, (Integer) null, (Integer) null, false);
                } else {
                    A002 = AnonymousClass4GZ.A00(r0, num);
                }
                r2.CMk(A002, (String) null);
                return;
            case 1:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A01;
                CompoundButton compoundButton = (CompoundButton) this.A02;
                boolean z2 = this.A03;
                if (compoundButton != null) {
                    compoundButton.toggle();
                }
                UserJid A4l = contactInfoActivity.A4l();
                C18070vi.A0d(A4l, 1);
                C138056wS.A00(contactInfoActivity, A4l, "profile_view", ((C35771mm) ((C138056wS) contactInfoActivity.A23.get()).A01.get()).A08(A4l));
                ((C35761ml) contactInfoActivity.A24.get()).A01(contactInfoActivity.A4l(), (AnonymousClass206) null, "profile_view", (String) null, z2 ? 1 : 0, true, false);
                return;
            case 2:
                boolean z3 = this.A03;
                C198789yu r1 = new C198789yu(103);
                r1.A05 = (AW0) this.A02;
                r1.A0L = z3;
                ((C161588Gc) this.A01).A08.A0F(r1);
                return;
            case 5:
                boolean z4 = this.A03;
                SendSmsToWa sendSmsToWa = (SendSmsToWa) this.A02;
                ((Dialog) this.A01).dismiss();
                A8V A0N = C108975cc.A0N(sendSmsToWa);
                if (z4) {
                    A0N.A0I("send_sms_to_wa_no_received_dialog", "try_again");
                    sendSmsToWa.A4d(sendSmsToWa.A0U, sendSmsToWa.A0T);
                    return;
                }
                A0N.A0I("send_sms_to_wa_no_received_dialog", "verify_another_way");
                C21014Ad6 ad6 = sendSmsToWa.A0C;
                if (ad6 == null) {
                    str = "dynamicBottomSheetNavigator";
                    break;
                } else {
                    ad6.A04();
                    return;
                }
            case 6:
                C120856Fr r4 = (C120856Fr) this.A01;
                boolean z5 = this.A03;
                AnonymousClass77E r22 = (AnonymousClass77E) this.A02;
                List list = C42011xT.A0I;
                C139976zk r12 = r4.A02;
                r12.A03(z5);
                r12.A02(AnonymousClass00R.A00, z5);
                AnonymousClass73Z r13 = r4.A01;
                String str2 = r22.A03;
                r13.A06(new C115945w6(AnonymousClass6R7.TYPEAHEAD, str2, r22.A02, 2, true), r4.A00.A00(str2));
                return;
            case 7:
                boolean z6 = this.A03;
                ((C35771mm) ((C138056wS) this.A01).A01.get()).A06((UserJid) this.A02, (String) null, "suspicious_chat_banner", z6 ? 1 : 0);
                return;
            case 8:
                boolean z7 = this.A03;
                DocumentWarningDialogFragment documentWarningDialogFragment = (DocumentWarningDialogFragment) this.A01;
                if (z7) {
                    AnonymousClass206 A2H = documentWarningDialogFragment.A2H(documentWarningDialogFragment.A15().getLong("message_id"));
                    if (!(A2H instanceof C438921i) || (r11 = (AnonymousClass21V) A2H) == null) {
                        AnonymousClass1KB r23 = documentWarningDialogFragment.A03;
                        if (r23 != null) {
                            r23.A09(2131892052, 0);
                        }
                    } else {
                        C62572rc r5 = r11.A02;
                        if (r5 != null) {
                            AnonymousClass1KB r10 = documentWarningDialogFragment.A03;
                            if (r10 != null) {
                                AnonymousClass190 r7 = documentWarningDialogFragment.A02;
                                if (r7 == null) {
                                    str = "crashLogs";
                                    break;
                                } else {
                                    AnonymousClass10I r6 = documentWarningDialogFragment.A04;
                                    C18070vi.A0W(r6);
                                    C32211gp r24 = documentWarningDialogFragment.A06;
                                    if (r24 == null) {
                                        str = "sharedMediaIdsStore";
                                        break;
                                    } else {
                                        Context A14 = documentWarningDialogFragment.A14();
                                        AnonymousClass1L9 r9 = documentWarningDialogFragment.A01;
                                        if (r9 == null) {
                                            str = "activityUtils";
                                            break;
                                        } else {
                                            WeakReference A0z = AnonymousClass3MW.A0z(A14);
                                            r10.A07(0, 2131891797);
                                            C145977Ni r8 = new C145977Ni(r9, r10, r11, A0z, 3);
                                            C45792Br r14 = new C45792Br(r7, r24, r11);
                                            r14.A0A(r8, r10.A05);
                                            r6.CGF(r14);
                                            r5.A07 = 2;
                                            AnonymousClass121 r02 = documentWarningDialogFragment.A05;
                                            if (r02 == null) {
                                                str = "coreMessageStore";
                                                break;
                                            } else {
                                                r02.CQw(A2H);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        documentWarningDialogFragment.A04.CGF(new C146877Qy(A2H, 1, 1, documentWarningDialogFragment));
                    }
                    str = "globalUI";
                    break;
                }
                C010105w r03 = documentWarningDialogFragment.A00;
                if (r03 != null) {
                    r03.dismiss();
                }
                documentWarningDialogFragment.A00 = null;
                return;
            default:
                AnonymousClass7PX r52 = (AnonymousClass7PX) this.A02;
                boolean z8 = this.A03;
                C111215j4 r42 = ((C112235l9) this.A01).A09;
                if (z8) {
                    r42.A09.CGF(new AnonymousClass3C5(r42, r52, AnonymousClass00R.A0N, 32));
                    r42.A0U(r52);
                    return;
                }
                r42.A08.A0F(r52.A04);
                return;
        }
        C18070vi.A11(str);
        throw null;
    }
}
