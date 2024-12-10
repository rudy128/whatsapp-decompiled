package X;

import com.whatsapp.community.NewCommunityActivity;
import com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity;

/* renamed from: X.4gg  reason: invalid class name and case insensitive filesystem */
public class C92054gg implements C72033Kj {
    public final int A00;
    public final Object A01;

    public C92054gg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bom() {
        if (this.A00 != 0) {
            DeactivateCommunityDisclaimerActivity.A03((DeactivateCommunityDisclaimerActivity) this.A01);
        } else {
            NewCommunityActivity.A0Q((NewCommunityActivity) this.A01);
        }
    }
}
