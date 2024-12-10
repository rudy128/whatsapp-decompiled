package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.4rO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98584rO implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ContactInfoActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public final void run() {
        ContactInfoActivity contactInfoActivity = this.A01;
        boolean z = this.A03;
        int i = this.A00;
        String str = this.A02;
        View A0A = C110885hR.A0A(contactInfoActivity, 2131432130);
        TextView A0I = AnonymousClass3MW.A0I(contactInfoActivity, 2131432136);
        if (i != 0 || z) {
            A0A.setVisibility(0);
            if (!z || i != 0) {
                int i2 = 2131888778;
                if (z) {
                    i2 = 2131888779;
                }
                AnonymousClass3MY.A0y(contactInfoActivity, A0I, new Object[]{str}, i2);
                return;
            }
            A0I.setText(2131888780);
            return;
        }
        A0A.setVisibility(8);
    }

    public /* synthetic */ C98584rO(ContactInfoActivity contactInfoActivity, String str, int i, boolean z) {
        this.A01 = contactInfoActivity;
        this.A03 = z;
        this.A00 = i;
        this.A02 = str;
    }
}
