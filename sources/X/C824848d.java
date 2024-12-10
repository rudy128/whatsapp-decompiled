package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.permissions.RequestPermissionsBottomSheet;

/* renamed from: X.48d  reason: invalid class name and case insensitive filesystem */
public class C824848d extends C38471rL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C824848d(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    public void A04(View view) {
        String str;
        if (this.A00 != 0) {
            String str2 = this.A03;
            if (str2 != null) {
                AnonymousClass00H r0 = ((RequestPermissionsBottomSheet) this.A02).A06;
                if (r0 != null) {
                    ((A8V) r0.get()).A0I(str2, "continue");
                } else {
                    str = "funnelLogger";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            RequestPermissionsBottomSheet requestPermissionsBottomSheet = (RequestPermissionsBottomSheet) this.A02;
            requestPermissionsBottomSheet.A28();
            C19830z4 r6 = requestPermissionsBottomSheet.A04;
            if (r6 != null) {
                String[] strArr = (String[]) this.A01;
                for (String str3 : strArr) {
                    C17880vN.A1F(C19830z4.A00(r6), str3, true);
                    String[] strArr2 = C27091Ur.A09;
                    C18070vi.A0Z(strArr2);
                    if (C200410p.A0U(str3, strArr2)) {
                        r6.A24(true);
                        C17880vN.A1F(C19830z4.A00(r6), "nearby_location_new_user", true);
                    }
                }
                C110885hR.A0B(requestPermissionsBottomSheet.A1D(), strArr, 0);
                return;
            }
            str = "waSharedPreferences";
            C18070vi.A11(str);
            throw null;
        }
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A01;
        Jid jid = (Jid) acceptInviteLinkActivity.A0O.get();
        if (jid == null) {
            acceptInviteLinkActivity.A03.A0G("Group Jid should not be null in GroupAdminPickerActivity", (String) null, true);
        }
        String str4 = this.A03;
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(acceptInviteLinkActivity.getPackageName(), "com.whatsapp.group.GroupAdminPickerActivity");
        AnonymousClass3MY.A13(A0A, jid, "gid");
        A0A.putExtra("subgroup_subject", str4);
        A0A.putExtra("subgroup_request_message", (String) null);
        AnonymousClass3MY.A12(A0A, (Jid) this.A02, "parent_group_jid");
        acceptInviteLinkActivity.startActivity(A0A);
        acceptInviteLinkActivity.overridePendingTransition(0, 0);
        acceptInviteLinkActivity.finish();
    }
}
