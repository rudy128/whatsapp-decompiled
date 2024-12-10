package X;

import android.content.res.Resources;
import android.widget.TextView;
import com.whatsapp.group.GroupChatInfoActivity;
import java.util.List;

/* renamed from: X.4rQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98604rQ implements Runnable {
    public final /* synthetic */ GroupChatInfoActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public final void run() {
        TextView textView;
        Resources resources;
        int i;
        GroupChatInfoActivity groupChatInfoActivity = this.A00;
        boolean z = this.A03;
        boolean z2 = this.A04;
        List list = this.A02;
        String str = this.A01;
        if (!z || (list.isEmpty() && !z2)) {
            groupChatInfoActivity.A03.setVisibility(8);
            return;
        }
        groupChatInfoActivity.A03.setVisibility(0);
        if (!z2) {
            textView = groupChatInfoActivity.A0D;
            resources = groupChatInfoActivity.getResources();
            i = 2131755073;
        } else if (list.isEmpty()) {
            groupChatInfoActivity.A0D.setText(2131888780);
            return;
        } else if (list.size() == 1) {
            String A0F = groupChatInfoActivity.A0m.A0F(str);
            AnonymousClass3MY.A0y(groupChatInfoActivity, groupChatInfoActivity.A0D, new Object[]{A0F}, 2131888779);
            return;
        } else {
            textView = groupChatInfoActivity.A0D;
            resources = groupChatInfoActivity.getResources();
            i = 2131755074;
        }
        int size = list.size();
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, list.size(), 0);
        AnonymousClass3MX.A1E(resources, textView, objArr, i, size);
    }

    public /* synthetic */ C98604rQ(GroupChatInfoActivity groupChatInfoActivity, String str, List list, boolean z, boolean z2) {
        this.A00 = groupChatInfoActivity;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = list;
        this.A01 = str;
    }
}
