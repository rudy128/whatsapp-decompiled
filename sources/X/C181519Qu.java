package X;

import android.os.Bundle;
import com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog;
import java.util.List;

/* renamed from: X.9Qu  reason: invalid class name and case insensitive filesystem */
public abstract class C181519Qu {
    public static final AdminInviteErrorDialog A00(AnonymousClass9IF r4, String str, String str2, List list) {
        C18070vi.A0d(list, 1);
        AdminInviteErrorDialog adminInviteErrorDialog = new AdminInviteErrorDialog();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("arg_dialog_message", str);
        A0D.putStringArrayList("invitee_jids", C22971Dz.A0B(list));
        A0D.putString("arg_caption", str2);
        A0D.putString("arg_action", r4.toString());
        adminInviteErrorDialog.A1R(A0D);
        return adminInviteErrorDialog;
    }
}
