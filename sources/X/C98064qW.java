package X;

import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4qW  reason: invalid class name and case insensitive filesystem */
public class C98064qW implements C108165bE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GroupChatInfoActivity A01;

    public C98064qW(GroupChatInfoActivity groupChatInfoActivity, int i) {
        this.A01 = groupChatInfoActivity;
        this.A00 = i;
    }

    public void Byx() {
        AnonymousClass4Yv.A00(this.A01, 1);
    }

    public void C11(boolean z) {
        Runnable ajp;
        Log.i("GroupChatInfoActivity/onclick_deleteGroup");
        int i = this.A00;
        GroupChatInfoActivity groupChatInfoActivity = this.A01;
        if (i == 8) {
            ajp = new C70813Cp(8, (Object) groupChatInfoActivity, z);
        } else if (!AnonymousClass3MZ.A1a(groupChatInfoActivity)) {
            C17890vO.A0u(new AnonymousClass49Y(groupChatInfoActivity, groupChatInfoActivity.A04, groupChatInfoActivity.A1K, z), groupChatInfoActivity.A05);
            return;
        } else {
            ajp = new C21422Ajp(20);
        }
        if (AnonymousClass3MW.A1Y(groupChatInfoActivity)) {
            groupChatInfoActivity.CNB(2131893532, 2131895077);
            groupChatInfoActivity.A1C.A0D(new AnonymousClass40i(groupChatInfoActivity.A0I, groupChatInfoActivity, groupChatInfoActivity.A1A, groupChatInfoActivity.A1K, ajp));
            return;
        }
        groupChatInfoActivity.A05.A08(2131890316, 0);
    }
}
