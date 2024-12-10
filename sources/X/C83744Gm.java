package X;

import android.os.Bundle;
import com.whatsapp.group.AddMembersRouter;
import java.util.Collection;

/* renamed from: X.4Gm  reason: invalid class name and case insensitive filesystem */
public abstract class C83744Gm {
    public static final void A00(AnonymousClass1GP r6, AnonymousClass1F9 r7, AnonymousClass1EC r8, AnonymousClass1EC r9, Collection collection, C18090vk r11, C22821Di r12, int i, int i2, boolean z) {
        C18070vi.A0d(r6, 0);
        C18070vi.A0d(r8, 2);
        C18070vi.A0d(collection, 5);
        C34001jj r2 = new C34001jj(r6);
        AddMembersRouter addMembersRouter = new AddMembersRouter();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D, r8, "group");
        A0D.putString("parent_group", C72463Mc.A0n(r9));
        AnonymousClass3MY.A17(A0D, "jids", collection);
        A0D.putInt("request_invite_members", i);
        A0D.putBoolean("is_cag_and_community_add", z);
        A0D.putInt("entry_point", i2);
        addMembersRouter.A1R(A0D);
        r2.A0B(addMembersRouter, "tag");
        r2.A04();
        r6.A0t(new C91374fa(r11, 18), r7, "AddMembersRouter");
        r6.A0t(new C91374fa(r12, 19), r7, "AddMembersSuccess");
    }
}
