package X;

import android.os.Bundle;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.Hilt_DeleteEnforcedMessageDialogFragment;

/* renamed from: X.4HJ  reason: invalid class name */
public abstract class AnonymousClass4HJ {
    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.fragment.app.Fragment, com.whatsapp.product.newsletterenforcements.enforcedmessages.Hilt_DeleteEnforcedMessageDialogFragment, com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment] */
    public static final DeleteEnforcedMessageDialogFragment A00(AnonymousClass1BI r6, long j, boolean z) {
        C18070vi.A0d(r6, 0);
        ? hilt_DeleteEnforcedMessageDialogFragment = new Hilt_DeleteEnforcedMessageDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("message_res", 2131892592);
        A0D.putInt("primary_action_text_id_res", 2131898874);
        A0D.putInt("secondary_action_text_res", 2131898766);
        hilt_DeleteEnforcedMessageDialogFragment.A1R(A0D);
        AnonymousClass3MY.A15(hilt_DeleteEnforcedMessageDialogFragment.A15(), r6, "arg_jid");
        hilt_DeleteEnforcedMessageDialogFragment.A15().putLong("arg_server_sort_id", j);
        hilt_DeleteEnforcedMessageDialogFragment.A15().putBoolean("arg_finish_activity_on_dismiss", z);
        return hilt_DeleteEnforcedMessageDialogFragment;
    }
}
