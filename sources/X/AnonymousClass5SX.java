package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.group.GroupPermissionsLayout;
import java.util.List;

/* renamed from: X.5SX  reason: invalid class name */
public final class AnonymousClass5SX extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SX(GroupPermissionsActivity groupPermissionsActivity) {
        super(1);
        this.this$0 = groupPermissionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        GroupPermissionsLayout groupPermissionsLayout = this.this$0.A04;
        if (groupPermissionsLayout == null) {
            C18070vi.A11("groupPermissionsLayout");
        } else {
            ListItemWithLeftIcon listItemWithLeftIcon = groupPermissionsLayout.A07;
            if (listItemWithLeftIcon != null) {
                listItemWithLeftIcon.setDescription((CharSequence) C60592oI.A00(groupPermissionsLayout.getWaLocale(), list, true));
                ListItemWithLeftIcon listItemWithLeftIcon2 = groupPermissionsLayout.A07;
                if (listItemWithLeftIcon2 != null) {
                    TextView A0W = C72453Mb.A0W(listItemWithLeftIcon2, 2131432091);
                    A0W.setMaxLines(1);
                    A0W.setEllipsize(TextUtils.TruncateAt.END);
                    return C27621Wu.A00;
                }
            }
            C18070vi.A11("manageAdminsView");
        }
        throw null;
    }
}
