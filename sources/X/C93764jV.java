package X;

import android.view.View;
import com.whatsapp.community.CommunityNavigationActivity;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.4jV  reason: invalid class name and case insensitive filesystem */
public class C93764jV implements C34241kA {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C93764jV(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void C3e(AnonymousClass4YL r7) {
        if (this.A00 != 0) {
            ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
            AnonymousClass1FY r3 = (AnonymousClass1FY) this.A02;
            Integer num = r7.A02;
            if (num == AnonymousClass00R.A00) {
                C41421wM r4 = conversationsFragment.A1Q;
                r4.setOnLockedClickListener((View.OnClickListener) null);
                AnonymousClass3MX.A0a(conversationsFragment.A2w).A01(0, 1);
                r4.A03(new C98714rb(conversationsFragment, r3, r4, 37));
            } else if (num == AnonymousClass00R.A0C) {
                AnonymousClass3MW.A0Y(conversationsFragment.A2x).A06();
                C31191fA A0Y = AnonymousClass3MW.A0Y(conversationsFragment.A2x);
                C18070vi.A0d(r3, 0);
                A0Y.A0D(r3, r7, (C72213Lb) null, (AnonymousClass1BI) null);
            }
        } else {
            CommunityNavigationActivity communityNavigationActivity = (CommunityNavigationActivity) this.A01;
            AnonymousClass1BI r5 = (AnonymousClass1BI) this.A02;
            Integer num2 = r7.A02;
            if (num2 == AnonymousClass00R.A00) {
                boolean z = !C17880vN.A1X(communityNavigationActivity.A0R.A01);
                AnonymousClass3MW.A0Y(communityNavigationActivity.A0d).A0F(r5, true);
                if (z) {
                    AnonymousClass3MW.A0Y(communityNavigationActivity.A0d).A08(communityNavigationActivity);
                }
            } else if (num2 == AnonymousClass00R.A0C) {
                AnonymousClass3MW.A0Y(communityNavigationActivity.A0d).A0E(communityNavigationActivity, r5);
            }
            if (num2 != AnonymousClass00R.A0Y) {
                AnonymousClass3MW.A0Y(communityNavigationActivity.A0d).A00 = false;
            }
        }
    }
}
