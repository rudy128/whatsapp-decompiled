package X;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.MenuItem;
import com.whatsapp.community.CommunityHomeActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.4cq  reason: invalid class name and case insensitive filesystem */
public class C89674cq implements MenuItem.OnMenuItemClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C89674cq(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        String str;
        AnonymousClass1EC r3;
        AnonymousClass1FY r7;
        AnonymousClass4XU r6;
        UserJid userJid;
        boolean z;
        switch (this.A00) {
            case 0:
                r6 = (AnonymousClass4XU) this.A01;
                r7 = (AnonymousClass1FY) this.A02;
                userJid = (UserJid) this.A03;
                z = true;
                break;
            case 1:
                r6 = (AnonymousClass4XU) this.A01;
                r7 = (AnonymousClass1FY) this.A02;
                userJid = (UserJid) this.A03;
                z = false;
                break;
            case 2:
                AnonymousClass4P7 r2 = (AnonymousClass4P7) this.A02;
                Jid jid = (Jid) this.A03;
                C18070vi.A0d(r2, 1);
                AnonymousClass1E7 r1 = ((AnonymousClass4SF) this.A01).A02;
                if (r1 != null) {
                    str = r2.A08.A0I(r1);
                } else {
                    str = null;
                }
                AnonymousClass1FY r4 = r2.A04;
                C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.community.CommunityHomeActivity");
                CommunityHomeActivity communityHomeActivity = (CommunityHomeActivity) r4;
                if (str == null || (r3 = communityHomeActivity.A0j) == null) {
                    Log.e("CommunityHomeActivity/openTransferOwnershipConfirmation/missing info");
                    return true;
                }
                Intent A0A = C17880vN.A0A();
                A0A.setClassName(communityHomeActivity.getPackageName(), "com.whatsapp.community.TransferCommunityOwnershipActivity");
                AnonymousClass3MY.A12(A0A, r3, "transfer_ownership_parent_jid");
                AnonymousClass3MY.A12(A0A, jid, "transfer_ownership_admin_jid");
                A0A.putExtra("transfer_ownership_admin_short_name", str);
                communityHomeActivity.startActivityForResult(A0A, 11);
                return true;
            case 3:
                Intent intent = (Intent) this.A01;
                C135766sj r0 = (C135766sj) this.A02;
                intent.setComponent(new ComponentName(r0.A03, r0.A02));
                ((AnonymousClass1FP) this.A03).startActivityForResult(intent, 91);
                return false;
            default:
                return false;
        }
        C18070vi.A0d(userJid, 2);
        try {
            r7.startActivityForResult(r6.A03.A02(r6.A01.A0H(userJid), userJid, z), 10);
            AnonymousClass3MW.A0m(r6.A04).A06(z, 8);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("BaseMemberContextMenuHelper/startAddOrEditContact Exception while launching add to contacts", e);
            r6.A00.A08(2131886448, 0);
            return true;
        }
    }
}
