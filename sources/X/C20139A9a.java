package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.whatsapp.PhoneHyperLinkDialogFragment;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.A9a  reason: case insensitive filesystem */
public class C20139A9a implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C20139A9a(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent A1x;
        Runnable runnable;
        Activity activity;
        switch (this.A00) {
            case 0:
                PhoneHyperLinkDialogFragment phoneHyperLinkDialogFragment = (PhoneHyperLinkDialogFragment) this.A02;
                List list = (List) this.A03;
                int i2 = this.A01;
                if (((C189849jx) list.get(i)).A00 == 1) {
                    phoneHyperLinkDialogFragment.A08.A00(Boolean.valueOf(phoneHyperLinkDialogFragment.A0H), Boolean.valueOf(phoneHyperLinkDialogFragment.A0I), 6);
                    AnonymousClass1LU r2 = phoneHyperLinkDialogFragment.A09;
                    Context A14 = phoneHyperLinkDialogFragment.A14();
                    UserJid userJid = phoneHyperLinkDialogFragment.A0A;
                    C17960vV.A07(userJid);
                    A1x = AnonymousClass3MY.A06(A14, r2, userJid);
                    A1x.putExtra("args_conversation_screen_entry_point", 7);
                    A1x.putExtra("isWAAccount", phoneHyperLinkDialogFragment.A0I);
                    A1x.putExtra("isPhoneNumberOwner", phoneHyperLinkDialogFragment.A0H);
                    A1x.putExtra("entry_point_conversion_source", "phone_number_hyperlink");
                    A1x.putExtra("entry_point_conversion_app", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME);
                } else if (((C189849jx) list.get(i)).A00 == 4) {
                    if (!phoneHyperLinkDialogFragment.A0G) {
                        A1x = phoneHyperLinkDialogFragment.A09.A1x(phoneHyperLinkDialogFragment.A14(), phoneHyperLinkDialogFragment.A0A, 0);
                        A1x.putExtra("ctc_deeplink_option", "CHAT");
                    } else {
                        ((C195199sx) phoneHyperLinkDialogFragment.A0D.get()).A01();
                        phoneHyperLinkDialogFragment.A08.A00(Boolean.valueOf(phoneHyperLinkDialogFragment.A0H), Boolean.valueOf(phoneHyperLinkDialogFragment.A0I), 10);
                        ((C194859sP) phoneHyperLinkDialogFragment.A0C.get()).A02(16, Integer.valueOf(i2), 2);
                        AnonymousClass1M9 r1 = phoneHyperLinkDialogFragment.A05;
                        UserJid userJid2 = phoneHyperLinkDialogFragment.A0A;
                        C17960vV.A07(userJid2);
                        phoneHyperLinkDialogFragment.A04.CNw(phoneHyperLinkDialogFragment.A14(), r1.A0H(userJid2), 33, false);
                        return;
                    }
                } else if (((C189849jx) list.get(i)).A00 == 2) {
                    phoneHyperLinkDialogFragment.A08.A00(Boolean.valueOf(phoneHyperLinkDialogFragment.A0H), Boolean.valueOf(phoneHyperLinkDialogFragment.A0I), 4);
                    phoneHyperLinkDialogFragment.A02.CGU(phoneHyperLinkDialogFragment.A14(), Uri.parse(phoneHyperLinkDialogFragment.A0F), (AnonymousClass206) null);
                    return;
                } else if (((C189849jx) list.get(i)).A00 == 3) {
                    phoneHyperLinkDialogFragment.A08.A00(Boolean.valueOf(phoneHyperLinkDialogFragment.A0H), Boolean.valueOf(phoneHyperLinkDialogFragment.A0I), 5);
                    Intent A002 = C36451nu.A00(phoneHyperLinkDialogFragment.A0B, phoneHyperLinkDialogFragment.A0E, (String) null, true, false);
                    A002.putExtra("finishActivityOnSaveCompleted", true);
                    try {
                        phoneHyperLinkDialogFragment.startActivityForResult(A002, 1000);
                        return;
                    } catch (ActivityNotFoundException unused) {
                        phoneHyperLinkDialogFragment.A01.A08(2131886448, 0);
                        return;
                    }
                } else if (((C189849jx) list.get(i)).A00 == 5) {
                    phoneHyperLinkDialogFragment.A08.A00(Boolean.valueOf(phoneHyperLinkDialogFragment.A0H), Boolean.valueOf(phoneHyperLinkDialogFragment.A0I), 11);
                    phoneHyperLinkDialogFragment.A06.A04(phoneHyperLinkDialogFragment.A14(), 41, phoneHyperLinkDialogFragment.A0E, "sms:");
                    return;
                } else {
                    return;
                }
                phoneHyperLinkDialogFragment.A00.A0B(phoneHyperLinkDialogFragment.A14(), A1x, "PhoneHyperLinkDialogFragment");
                return;
            case 1:
                activity = (Activity) this.A02;
                int i3 = this.A01;
                runnable = (Runnable) this.A03;
                AnonymousClass4Yv.A00(activity, i3);
                if (runnable == null) {
                    return;
                }
                break;
            case 2:
                activity = (Activity) this.A02;
                int i4 = this.A01;
                runnable = (Runnable) this.A03;
                AnonymousClass4Yv.A00(activity, i4);
                break;
            default:
                A0R a0r = (A0R) this.A02;
                AnonymousClass1FU r22 = (AnonymousClass1FU) this.A03;
                AnonymousClass4Yv.A00(r22, this.A01);
                r22.CNA(2131895077);
                a0r.A0E.A00(new AXO(a0r, r22, 6));
                return;
        }
        new Handler(activity.getMainLooper()).post(runnable);
    }
}
