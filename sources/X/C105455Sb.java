package X;

import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.group.GroupPermissionsLayout;

/* renamed from: X.5Sb  reason: invalid class name and case insensitive filesystem */
public final class C105455Sb extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105455Sb(GroupPermissionsActivity groupPermissionsActivity) {
        super(1);
        this.this$0 = groupPermissionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        boolean A1Y = AnonymousClass000.A1Y(obj);
        GroupPermissionsLayout groupPermissionsLayout = this.this$0.A04;
        if (groupPermissionsLayout == null) {
            str = "groupPermissionsLayout";
        } else {
            int A07 = C72453Mb.A07(A1Y ? 1 : 0);
            ListItemWithLeftIcon listItemWithLeftIcon = groupPermissionsLayout.A06;
            if (listItemWithLeftIcon == null) {
                str = "announcementGroupSetting";
            } else {
                listItemWithLeftIcon.setVisibility(A07);
                return C27621Wu.A00;
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
