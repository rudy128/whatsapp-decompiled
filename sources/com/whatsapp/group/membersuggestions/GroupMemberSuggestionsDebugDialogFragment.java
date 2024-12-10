package com.whatsapp.group.membersuggestions;

import X.AnonymousClass00R;
import X.AnonymousClass11P;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1KB;
import X.AnonymousClass1MZ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.C18600wl;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.whatsapp.WaTextView;

public final class GroupMemberSuggestionsDebugDialogFragment extends Hilt_GroupMemberSuggestionsDebugDialogFragment {
    public int A00 = 89;
    public LinearLayout A01;
    public AnonymousClass1KB A02;
    public AnonymousClass11P A03;
    public AnonymousClass1CJ A04;
    public AnonymousClass1MZ A05;
    public GroupMemberSuggestionsViewModel A06;
    public AnonymousClass1EC A07;
    public C18600wl A08;
    public ScrollView A09;

    public static final void A00(GroupMemberSuggestionsDebugDialogFragment groupMemberSuggestionsDebugDialogFragment, String str) {
        LinearLayout linearLayout = groupMemberSuggestionsDebugDialogFragment.A01;
        if (linearLayout != null) {
            WaTextView waTextView = new WaTextView(groupMemberSuggestionsDebugDialogFragment.A14());
            waTextView.setPadding(20, 20, 20, 20);
            waTextView.setText(str);
            waTextView.setTextAlignment(4);
            linearLayout.addView(waTextView);
        }
    }

    public static final void A01(GroupMemberSuggestionsDebugDialogFragment groupMemberSuggestionsDebugDialogFragment, String str) {
        LinearLayout linearLayout = groupMemberSuggestionsDebugDialogFragment.A01;
        if (linearLayout != null) {
            WaTextView waTextView = new WaTextView(groupMemberSuggestionsDebugDialogFragment.A14());
            waTextView.setPadding(40, 40, 40, 20);
            waTextView.setText(str);
            waTextView.A0J();
            linearLayout.addView(waTextView);
        }
    }

    public void A1r() {
        super.A1r();
        this.A09 = null;
    }

    public Dialog A27(Bundle bundle) {
        this.A06 = (GroupMemberSuggestionsViewModel) AnonymousClass3MW.A0N(this).A00(GroupMemberSuggestionsViewModel.class);
        LinearLayout linearLayout = new LinearLayout(A14());
        linearLayout.setId(16908298);
        linearLayout.setOrientation(1);
        this.A01 = linearLayout;
        ScrollView scrollView = new ScrollView(A14());
        scrollView.addView(this.A01);
        this.A09 = scrollView;
        C37581pm A0H = AnonymousClass3MZ.A0H(this);
        C18600wl r3 = this.A08;
        if (r3 != null) {
            C30451dy.A02(AnonymousClass00R.A00, r3, new GroupMemberSuggestionsDebugDialogFragment$onCreateDialog$3(this, (C30391dr) null), A0H);
            C73203Rj A032 = AnonymousClass4a6.A03(this);
            A032.A0c(this.A09);
            return AnonymousClass3MY.A0L(A032);
        }
        AnonymousClass3MW.A1K();
        throw null;
    }
}
