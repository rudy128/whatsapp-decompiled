package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.contact.contactform.ContactFormActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;
import com.whatsapp.status.StatusConfirmMuteDialogFragment;
import com.whatsapp.status.StatusConfirmUnmuteDialogFragment;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.74v  reason: invalid class name and case insensitive filesystem */
public class C1412374v implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1412374v(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.1LU, java.lang.Object] */
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                Activity A002 = AnonymousClass1L9.A00((Context) this.A02);
                C18070vi.A0z(A002, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ((AnonymousClass4R5) ((C31191fA) this.A01).A09.get()).A00((AnonymousClass1FL) A002);
                return;
            case 1:
                ContactFormActivity contactFormActivity = (ContactFormActivity) this.A01;
                AnonymousClass1E7 r1 = (AnonymousClass1E7) this.A02;
                if (contactFormActivity.A08 == null) {
                    C18070vi.A11("contactFormContactOnWhatsAppController");
                    throw null;
                } else if (r1.A0H != null) {
                    contactFormActivity.startActivity(new Object().A1u(contactFormActivity, r1));
                    return;
                } else {
                    return;
                }
            case 2:
                C133246oP r2 = (C133246oP) this.A01;
                View view = (View) this.A02;
                if (view instanceof WaEditText) {
                    ((TextView) view).setText(r2.A00.name);
                    return;
                }
                return;
            case 3:
                Object obj = this.A01;
                C116665yQ r3 = (C116665yQ) this.A02;
                if (obj != null) {
                    r3.A0D.CGF(new C98704ra(r3, obj, 18));
                    return;
                }
                return;
            case 4:
                C116665yQ r12 = (C116665yQ) this.A01;
                Activity activity = (Activity) this.A02;
                if (AnonymousClass112.A09()) {
                    C19830z4 r22 = r12.A08;
                    if (!r22.A2a("android.permission.POST_NOTIFICATIONS")) {
                        String[] A1b = C108975cc.A1b("android.permission.POST_NOTIFICATIONS");
                        AnonymousClass74O.A0H(r22, A1b);
                        C110885hR.A0B(activity, A1b, 100);
                        return;
                    }
                }
                if (AnonymousClass112.A03()) {
                    AnonymousClass4aU.A06(activity);
                    return;
                } else {
                    AnonymousClass4aU.A05(activity);
                    return;
                }
            case 5:
                Runnable runnable = (Runnable) this.A02;
                ExportMigrationActivity.A03((ExportMigrationActivity) this.A01, 0);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                StatusConfirmMuteDialogFragment.A00((UserJid) this.A01, (StatusConfirmMuteDialogFragment) this.A02);
                return;
            case 7:
                StatusConfirmUnmuteDialogFragment.A00((UserJid) this.A01, (StatusConfirmUnmuteDialogFragment) this.A02);
                return;
            default:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A01;
                AnonymousClass3MW.A0V(messageReplyActivity.A1F).A0I(messageReplyActivity, (UserJid) C72453Mb.A0m((AnonymousClass1E7) this.A02));
                AnonymousClass4Yv.A00(messageReplyActivity, 106);
                messageReplyActivity.A0k.A0I(true);
                return;
        }
    }
}
