package X;

import android.os.Bundle;
import com.whatsapp.product.reporttoadmin.Hilt_ReportToAdminDialogFragment;
import com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment;

/* renamed from: X.4ma  reason: invalid class name and case insensitive filesystem */
public final class C95654ma implements C201511a {
    /* JADX WARNING: type inference failed for: r6v0, types: [com.whatsapp.product.reporttoadmin.Hilt_ReportToAdminDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment] */
    public ReportToAdminDialogFragment A00(AnonymousClass206 r9) {
        AnonymousClass205 r7 = r9.A0v;
        C18070vi.A0W(r7);
        ? hilt_ReportToAdminDialogFragment = new Hilt_ReportToAdminDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("title_res", 2131895221);
        A0D.putInt("message_res", 2131895220);
        A0D.putInt("primary_action_text_id_res", 2131895226);
        A0D.putInt("secondary_action_text_res", 2131898766);
        hilt_ReportToAdminDialogFragment.A1R(A0D);
        AnonymousClass4aU.A0A(hilt_ReportToAdminDialogFragment.A15(), r7);
        return hilt_ReportToAdminDialogFragment;
    }
}
