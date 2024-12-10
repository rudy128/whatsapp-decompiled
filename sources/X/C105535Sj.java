package X;

import android.text.Html;
import android.text.Spanned;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.group.GroupPermissionsLayout;

/* renamed from: X.5Sj  reason: invalid class name and case insensitive filesystem */
public final class C105535Sj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105535Sj(GroupPermissionsActivity groupPermissionsActivity) {
        super(1);
        this.this$0 = groupPermissionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Spanned spanned;
        AnonymousClass4UJ r15 = (AnonymousClass4UJ) obj;
        C18070vi.A0d(r15, 0);
        GroupPermissionsActivity groupPermissionsActivity = this.this$0;
        GroupPermissionsLayout groupPermissionsLayout = groupPermissionsActivity.A04;
        if (groupPermissionsLayout == null) {
            C18070vi.A11("groupPermissionsLayout");
            throw null;
        }
        AnonymousClass1EC r5 = groupPermissionsActivity.A07;
        boolean z = r15.A01;
        char c = !z;
        char c2 = !r15.A00;
        if (!r15.A02 || r5 == null) {
            spanned = null;
        } else if (z) {
            spanned = groupPermissionsLayout.getLinkifier().A06(groupPermissionsLayout.getContext(), new C146507Pj(groupPermissionsLayout, r5, 3), groupPermissionsLayout.getContext().getString(GroupPermissionsLayout.A0N[c][c2]), "", C72473Md.A05(groupPermissionsLayout));
        } else {
            spanned = Html.fromHtml(groupPermissionsLayout.getContext().getString(GroupPermissionsLayout.A0N[c][c2]));
        }
        ListItemWithLeftIcon listItemWithLeftIcon = groupPermissionsLayout.A09;
        if (listItemWithLeftIcon == null) {
            C18070vi.A11("memberAddModeSetting");
            throw null;
        }
        listItemWithLeftIcon.A07(spanned, z);
        return C27621Wu.A00;
    }
}
