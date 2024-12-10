package X;

import android.os.Bundle;
import com.whatsapp.group.newgroup.GroupVisibilitySettingDialog;

/* renamed from: X.5I1  reason: invalid class name */
public final class AnonymousClass5I1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ GroupVisibilitySettingDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5I1(GroupVisibilitySettingDialog groupVisibilitySettingDialog) {
        super(0);
        this.this$0 = groupVisibilitySettingDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle = this.this$0.A06;
        if (bundle != null) {
            return bundle.getString("group_jid_raw_key", (String) null);
        }
        return null;
    }
}
