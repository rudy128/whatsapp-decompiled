package X;

import android.app.Activity;
import com.whatsapp.community.CommunityFragment;

/* renamed from: X.3IJ  reason: invalid class name */
public final class AnonymousClass3IJ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CommunityFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3IJ(CommunityFragment communityFragment) {
        super(1);
        this.this$0 = communityFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1EC r4 = (AnonymousClass1EC) obj;
        C18070vi.A0d(r4, 0);
        AnonymousClass00H r0 = this.this$0.A0I;
        if (r0 != null) {
            Activity A01 = AnonymousClass1L9.A01(this.this$0.A1n(), AnonymousClass01E.class);
            ((C32111gf) r0.get()).A0C.get();
            A01.startActivity(AnonymousClass1LU.A1A(A01, r4));
            return C27621Wu.A00;
        }
        C18070vi.A11("communityNavigator");
        throw null;
    }
}
