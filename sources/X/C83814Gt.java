package X;

import android.os.Bundle;
import com.whatsapp.group.newgroup.GroupVisibilitySettingDialog;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.4Gt  reason: invalid class name and case insensitive filesystem */
public abstract class C83814Gt {
    public static final GroupVisibilitySettingDialog A00(GroupJid groupJid, boolean z) {
        GroupVisibilitySettingDialog groupVisibilitySettingDialog = new GroupVisibilitySettingDialog();
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("is_hidden_subgroup_initial", z);
        if (groupJid != null) {
            AnonymousClass3MY.A15(A0D, groupJid, "group_jid_raw_key");
        }
        groupVisibilitySettingDialog.A1R(A0D);
        return groupVisibilitySettingDialog;
    }
}
