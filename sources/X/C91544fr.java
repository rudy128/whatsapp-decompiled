package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.Hilt_LegacyMessageDialogFragment;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.community.CommunityExitDialogFragment;
import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;

/* renamed from: X.4fr  reason: invalid class name and case insensitive filesystem */
public class C91544fr implements C22851Dl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C91544fr(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj4;
        this.A03 = obj;
        this.A04 = obj3;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [com.whatsapp.LegacyMessageDialogFragment, com.whatsapp.Hilt_LegacyMessageDialogFragment, androidx.fragment.app.Fragment] */
    public final void Bo9(Object obj) {
        WaDialogFragment waDialogFragment;
        String str;
        int i;
        if (this.A00 != 0) {
            GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment = (GroupMembershipApprovalRequestsFragment) this.A03;
            TextView textView = (TextView) this.A04;
            int A0M = AnonymousClass000.A0M(obj);
            ((View) this.A01).setVisibility(0);
            ((View) this.A02).setVisibility(8);
            groupMembershipApprovalRequestsFragment.A1Z(false);
            C36401np r4 = groupMembershipApprovalRequestsFragment.A08;
            if (r4 != null) {
                textView.setText(r4.A05(textView.getContext(), new C21355Aik(groupMembershipApprovalRequestsFragment, 26), groupMembershipApprovalRequestsFragment.A1H(A0M), ""));
                return;
            }
            C18070vi.A11("linkifer");
            throw null;
        }
        C34511kb r6 = (C34511kb) this.A01;
        C107465Zu r5 = (C107465Zu) this.A02;
        Context context = (Context) this.A03;
        Object obj2 = this.A04;
        Number number = (Number) obj;
        if (number != null) {
            int intValue = number.intValue();
            if (intValue == 1) {
                waDialogFragment = CommunityExitDialogFragment.A00(r5.BM7(), r6.A08(r5.BM7()), false);
            } else if (intValue != 2) {
                if (intValue == 3) {
                    str = context.getString(2131890187);
                    i = 8;
                } else if (intValue == 4) {
                    str = context.getString(2131890185);
                    i = 11;
                } else if (intValue == 5) {
                    waDialogFragment = CommunityExitDialogFragment.A00(r5.BM7(), r6.A08(r5.BM7()), true);
                } else {
                    return;
                }
                AnonymousClass4bB r52 = new AnonymousClass4bB(obj2, i);
                ? hilt_LegacyMessageDialogFragment = new Hilt_LegacyMessageDialogFragment();
                Bundle A0D = C17880vN.A0D();
                A0D.putInt("primary_action_text_id_res", 2131899286);
                if (str != null) {
                    A0D.putCharSequence("message", str);
                }
                hilt_LegacyMessageDialogFragment.A00 = r52;
                hilt_LegacyMessageDialogFragment.A1R(A0D);
                waDialogFragment = hilt_LegacyMessageDialogFragment;
            } else {
                waDialogFragment = AnonymousClass4FY.A00(new AnonymousClass4bB(obj2, 9), new AnonymousClass4bB(obj2, 10), context.getString(2131890186), (Object[]) null, (Object[]) null, -1, 0, 2131895332, 2131898766, 0);
            }
            ((AnonymousClass1FU) AnonymousClass1L9.A00(context)).CMk(waDialogFragment, number.toString());
        }
    }
}
