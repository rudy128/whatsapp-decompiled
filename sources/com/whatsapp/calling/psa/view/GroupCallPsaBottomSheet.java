package com.whatsapp.calling.psa.view;

import X.AnonymousClass1HF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3X0;
import X.AnonymousClass4AI;
import X.AnonymousClass5ED;
import X.AnonymousClass5EE;
import X.C103895Mb;
import X.C139436yq;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C30391dr;
import X.C84724Kp;
import X.C99274sY;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel;

public final class GroupCallPsaBottomSheet extends Hilt_GroupCallPsaBottomSheet {
    public TextView A00;
    public AnonymousClass3X0 A01;
    public C18090vk A02;
    public RecyclerView A03;
    public final C18100vl A04;
    public final int A05 = 2131625481;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A00 = AnonymousClass3MW.A0J(view, 2131434228);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass1HF.A06(view, 2131431292);
        this.A03 = recyclerView;
        if (recyclerView != null) {
            AnonymousClass3X0 r0 = this.A01;
            if (r0 != null) {
                recyclerView.setAdapter(r0);
            }
            AnonymousClass3MW.A1B();
            throw null;
        }
        AnonymousClass3X0 r1 = this.A01;
        if (r1 != null) {
            r1.A00 = new C84724Kp(this);
            RecyclerView recyclerView2 = this.A03;
            if (recyclerView2 != null) {
                AnonymousClass3Ma.A15(A14(), recyclerView2);
            }
            AnonymousClass3MX.A1Q(new GroupCallPsaBottomSheet$onViewCreated$2(this, (C30391dr) null), AnonymousClass3MZ.A0G(this));
            return;
        }
        AnonymousClass3MW.A1B();
        throw null;
    }

    public void A2I(C139436yq r2) {
        C18070vi.A0d(r2, 0);
        r2.A01(true);
        r2.A00(AnonymousClass4AI.A00);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C18090vk r0 = this.A02;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public int A2F() {
        return this.A05;
    }

    public GroupCallPsaBottomSheet() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(GroupCallPsaViewModel.class);
        this.A04 = C99274sY.A00(new AnonymousClass5ED(this), new AnonymousClass5EE(this), new C103895Mb(this), A15);
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
        this.A03 = null;
    }
}
