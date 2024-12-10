package X;

import android.os.Bundle;
import com.whatsapp.group.ExitGroupsDialogFragment;
import com.whatsapp.group.Hilt_ExitGroupsDialogFragment;
import com.whatsapp.jid.Jid;
import java.util.Set;

/* renamed from: X.4Gn  reason: invalid class name and case insensitive filesystem */
public abstract class C83754Gn {
    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.fragment.app.Fragment, com.whatsapp.group.ExitGroupsDialogFragment, com.whatsapp.group.Hilt_ExitGroupsDialogFragment] */
    public static final ExitGroupsDialogFragment A00(AnonymousClass1EC r3, String str, Set set, int i, int i2, boolean z, boolean z2) {
        Bundle A0J = C72463Mc.A0J(set);
        if (set.size() == 1) {
            A0J.putString("jid", ((Jid) C29431cG.A0X(set)).getRawString());
        } else {
            A0J.putStringArrayList("selection_jids", C22971Dz.A0B(set));
        }
        if (r3 != null) {
            AnonymousClass3MY.A15(A0J, r3, "parent_of_last_subgroup_jid");
        }
        A0J.putInt("unsent_count", i);
        A0J.putBoolean("report_upsell", z);
        A0J.putString("block_spam_flow", str);
        A0J.putInt("leave_group_action", i2);
        A0J.putBoolean("show_neutral_button", z2);
        ? hilt_ExitGroupsDialogFragment = new Hilt_ExitGroupsDialogFragment();
        hilt_ExitGroupsDialogFragment.A1R(A0J);
        return hilt_ExitGroupsDialogFragment;
    }
}
