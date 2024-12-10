package X;

import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.group.GroupPermissionsLayout;

/* renamed from: X.5Sh  reason: invalid class name and case insensitive filesystem */
public final class C105515Sh extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105515Sh(GroupPermissionsActivity groupPermissionsActivity) {
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
            SwitchCompat switchCompat = groupPermissionsLayout.A02;
            if (switchCompat == null) {
                str = "membershipApprovalRequiredSwitch";
            } else {
                switchCompat.setChecked(A1Y);
                SwitchCompat switchCompat2 = groupPermissionsLayout.A01;
                if (switchCompat2 == null) {
                    C18070vi.A11("memberAddModeSwitch");
                    throw null;
                }
                switchCompat2.jumpDrawablesToCurrentState();
                return C27621Wu.A00;
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
