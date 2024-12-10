package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import com.whatsapp.calling.views.PermissionDialogFragment;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.group.SelectOrCreateCommunityBottomSheetFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.48Z  reason: invalid class name */
public class AnonymousClass48Z extends C38471rL {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public AnonymousClass48Z(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public void A04(View view) {
        AnonymousClass1FR r3;
        View A0A;
        DialogFragment A002;
        String str;
        switch (this.A00) {
            case 0:
                Log.i("UserNoticeBanner/update/banner dismissed");
                if (!this.A02) {
                    ((C91934gU) this.A01).A04.A0C();
                }
                C91934gU r32 = (C91934gU) this.A01;
                C26106CsQ.A00(r32.A03, 10);
                C72453Mb.A1A(r32.A00);
                r32.A04.A0B();
                C18140vp r2 = r32.A05;
                if (r2.get() != null) {
                    r32.A01.A0f((C195759tr) r2.get());
                    return;
                }
                return;
            case 1:
                CallLogActivity.A0c((CallLogActivity) this.A01, this.A02);
                return;
            case 2:
                boolean z = this.A02;
                PermissionDialogFragment permissionDialogFragment = (PermissionDialogFragment) this.A01;
                if (z) {
                    permissionDialogFragment.A0B = true;
                    AnonymousClass4aU.A05(permissionDialogFragment.A1D());
                    return;
                }
                permissionDialogFragment.A01.dismiss();
                AnonymousClass74O.A0G(permissionDialogFragment, permissionDialogFragment.A08, permissionDialogFragment.A0E);
                return;
            case 3:
                AnonymousClass4RZ r5 = (AnonymousClass4RZ) this.A01;
                r5.A04.invoke();
                if (this.A02) {
                    Context context = r5.A00;
                    C33251iW r33 = r5.A01;
                    AnonymousClass1FP r1 = r5.A02;
                    if (r1 instanceof AnonymousClass1FU) {
                        A0A = ((AnonymousClass1FU) r1).A00;
                    } else {
                        A0A = C110885hR.A0A(r1, 16908290);
                    }
                    AnonymousClass1Q0.A01(context, A0A, r33, r5.A03, C17880vN.A0i());
                    return;
                }
                AnonymousClass1FP r34 = r5.A02;
                if ((r34 instanceof AnonymousClass1FR) && (r3 = (AnonymousClass1FR) r34) != null) {
                    r3.CMk(AnonymousClass4Z1.A01(r5.A03, C32961i2.CONTACT_INFO), (String) null);
                    return;
                }
                return;
            case 4:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A01;
                if (AnonymousClass3MZ.A1X(groupChatInfoActivity.A0u)) {
                    C83784Gq.A00(groupChatInfoActivity, 1, 2131886480);
                    return;
                } else if (!this.A02 || !AnonymousClass3MW.A10(groupChatInfoActivity.A1G.A0C).contains(AnonymousClass4CX.LINK_TO_COMMUNITY)) {
                    groupChatInfoActivity.A0a.CNv(groupChatInfoActivity, groupChatInfoActivity.A1K, 8, 3);
                    return;
                } else {
                    AnonymousClass1EC r35 = groupChatInfoActivity.A1K;
                    C18070vi.A0d(r35, 0);
                    SelectOrCreateCommunityBottomSheetFragment selectOrCreateCommunityBottomSheetFragment = new SelectOrCreateCommunityBottomSheetFragment();
                    C72463Mc.A11(C17880vN.A0D(), selectOrCreateCommunityBottomSheetFragment, r35, "ARGUMENT_GROUP_JID");
                    groupChatInfoActivity.CMl(selectOrCreateCommunityBottomSheetFragment);
                    return;
                }
            case 5:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A01;
                C72453Mb.A1P(quickContactActivity.A0x);
                AnonymousClass1E7 r12 = quickContactActivity.A0S;
                UserJid A003 = C22941Dw.A00(r12.A0J);
                if (r12.A0F()) {
                    if (C18020vd.A05(C18040vf.A02, quickContactActivity.A0U, 7175)) {
                        AnonymousClass3MW.A0c(quickContactActivity.A0r).A01(AnonymousClass17W.class);
                        boolean z2 = this.A02;
                        AnonymousClass1EC r13 = (AnonymousClass1EC) AnonymousClass3Ma.A0m(quickContactActivity.A0S);
                        C18070vi.A0d(r13, 1);
                        A002 = C87384Vj.A01(r13, 7, z2);
                        str = "CallConfirmationSheet";
                        quickContactActivity.CMk(A002, str);
                        return;
                    }
                }
                if (A003 == null || !new C63852tn((AnonymousClass1PM) quickContactActivity.A0w.get(), (C25491Ok) quickContactActivity.A0n.get(), A003).A03()) {
                    C19830z4 r22 = quickContactActivity.A0A;
                    AnonymousClass1E7 r14 = quickContactActivity.A0S;
                    boolean z3 = this.A02;
                    if (!CallConfirmationFragment.A04(quickContactActivity, r22, r14, 7, z3)) {
                        AnonymousClass1VP r4 = quickContactActivity.A0D;
                        AnonymousClass1E7 r36 = quickContactActivity.A0S;
                        if (r4.CNy(quickContactActivity, quickContactActivity.A0a, C63982u1.A04(quickContactActivity.A02, quickContactActivity.A0H, quickContactActivity.A0P, r36), 7, z3) == 0) {
                            QuickContactActivity.A0V(quickContactActivity, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                AnonymousClass3MW.A0c(quickContactActivity.A0r).A01(AnonymousClass17Y.class);
                A002 = AnonymousClass4Fv.A00(A003, 7);
                str = "CapiCallingConfirmationBottomSheetDialogFragment";
                quickContactActivity.CMk(A002, str);
                return;
            default:
                AnonymousClass6GW r42 = (AnonymousClass6GW) this.A01;
                r42.A0E();
                r42.A02 = C17880vN.A0h();
                r42.A0C.A00(5);
                String str2 = r42.A04;
                if (str2 != null) {
                    boolean z4 = this.A02;
                    Context A0J = r42.A05.A00.A0J();
                    String str3 = r42.A0E.A0v.A01;
                    C18070vi.A0X(str3);
                    AnonymousClass1L8 r37 = r42.A00;
                    boolean z5 = true;
                    if (r42.A0A.A0E(Uri.parse(str2)) == 1) {
                        z5 = false;
                    }
                    C137406vP.A00(A0J, r37, r42, str2, str3, (Set) null, z4, z5);
                    return;
                }
                return;
        }
    }
}
