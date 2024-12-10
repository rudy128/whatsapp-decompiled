package X;

import com.whatsapp.community.communityInfo.CAGInfoViewModel;
import com.whatsapp.group.GroupChatInfoActivity;

/* renamed from: X.4nT  reason: invalid class name and case insensitive filesystem */
public class C96204nT implements C107475Zv {
    public final int A00;
    public final Object A01;

    public C96204nT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C9c() {
        if (this.A00 != 0) {
            GroupChatInfoActivity.A1D((GroupChatInfoActivity) this.A01);
        } else {
            CAGInfoViewModel.A04((CAGInfoViewModel) this.A01);
        }
    }
}
