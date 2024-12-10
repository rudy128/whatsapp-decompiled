package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.group.Hilt_GroupMembershipApprovalRequestsFragment;
import com.whatsapp.group.Hilt_NonAdminGJRFragment;

/* renamed from: X.8Eq  reason: invalid class name and case insensitive filesystem */
public class C161478Eq extends C28861b9 {
    public final Context A00;
    public final String A01;
    public final boolean A02;

    public C161478Eq(Context context, AnonymousClass1GP r3, String str, boolean z) {
        super(r3, 0);
        this.A00 = context;
        this.A01 = str;
        this.A02 = z;
    }

    public CharSequence A0C(int i) {
        return C18070vi.A0F(this.A00, 2131891123);
    }

    public Fragment A0I(int i) {
        Fragment hilt_NonAdminGJRFragment;
        boolean z = this.A02;
        String str = this.A01;
        Bundle A0D = C17880vN.A0D();
        if (z) {
            A0D.putString("gid", str);
            hilt_NonAdminGJRFragment = new Hilt_GroupMembershipApprovalRequestsFragment();
        } else {
            A0D.putString("gid", str);
            hilt_NonAdminGJRFragment = new Hilt_NonAdminGJRFragment();
        }
        hilt_NonAdminGJRFragment.A1R(A0D);
        return hilt_NonAdminGJRFragment;
    }

    public int A0E() {
        return 1;
    }
}
