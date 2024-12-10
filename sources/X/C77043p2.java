package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.community.CommunityNavigationActivity;

/* renamed from: X.3p2  reason: invalid class name and case insensitive filesystem */
public class C77043p2 extends C40341uY {
    public final /* synthetic */ CommunityNavigationActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77043p2(Context context, C19880zA r2, CommunityNavigationActivity communityNavigationActivity, C203411t r4) {
        super(context, r2, r4);
        this.A00 = communityNavigationActivity;
    }

    public View.OnCreateContextMenuListener BVh() {
        return new C90114dY(this);
    }

    public boolean BxV(C42071xZ r2, C42071xZ r3, AnonymousClass1BI r4, int i) {
        this.A00.A0W = r4;
        return false;
    }
}
