package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.whatsapp.HomeActivity;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.27l  reason: invalid class name and case insensitive filesystem */
public class C451527l extends C27461We {
    public final int A00;
    public final Object A01;

    public C451527l(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A04(Fragment fragment) {
        if (this.A00 == 0) {
            HomeActivity homeActivity = (HomeActivity) this.A01;
            if (HomeActivity.A0r(homeActivity) instanceof ConversationsFragment) {
                ((ConversationsFragment) HomeActivity.A0r(homeActivity)).A2G("FAVORITES_FILTER");
            }
            homeActivity.A03.A00.A03.A0p(this);
        }
    }

    public void A06(Fragment fragment, AnonymousClass1GP r3) {
        if (1 - this.A00 == 0) {
            AnonymousClass1GR r0 = r3.A0U;
            r0.A04();
            if (r0.A04().isEmpty()) {
                ((Activity) this.A01).finish();
            }
        }
    }
}
