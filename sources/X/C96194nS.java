package X;

import com.whatsapp.community.CommunityHomeActivity;
import com.whatsapp.community.CommunityNavigationActivity;

/* renamed from: X.4nS  reason: invalid class name and case insensitive filesystem */
public class C96194nS implements C107465Zu {
    public final int A00;
    public final Object A01;

    public C96194nS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final AnonymousClass1EC BM7() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                return ((CommunityHomeActivity) obj).A0j;
            case 1:
                return ((CommunityNavigationActivity) obj).A0X;
            default:
                return (AnonymousClass1EC) obj;
        }
    }
}
