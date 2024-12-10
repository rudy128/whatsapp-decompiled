package X;

import com.whatsapp.community.CommunitySpamReportDialogFragment;
import java.util.List;

/* renamed from: X.4rS  reason: invalid class name and case insensitive filesystem */
public class C98624rS implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public C98624rS(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A05 = z;
        this.A03 = obj3;
    }

    public final void run() {
        if (this.A00 != 0) {
            boolean z = this.A05;
            AnonymousClass1MU.A01((AnonymousClass1MU) this.A01, (AnonymousClass1E9) this.A02, this.A04, (C18090vk) this.A03, z);
            return;
        }
        CommunitySpamReportDialogFragment communitySpamReportDialogFragment = (CommunitySpamReportDialogFragment) this.A01;
        String str = this.A04;
        boolean z2 = this.A05;
        Object obj = this.A03;
        communitySpamReportDialogFragment.A02.A02((AnonymousClass1E7) this.A02, str, (List) null);
        communitySpamReportDialogFragment.A00.A04();
        communitySpamReportDialogFragment.A00.A0J(new AnonymousClass7RF(communitySpamReportDialogFragment, obj, 23, z2));
    }
}
