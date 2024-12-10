package com.whatsapp.ctwa.icebreaker;

import X.AnonymousClass000;
import X.AnonymousClass3MX;
import X.AnonymousClass3WL;
import X.AnonymousClass4DV;
import X.C106835Xj;
import X.C18070vi;
import X.C38391rD;
import X.C77913rm;
import X.C80583xR;
import X.C86334Rf;
import X.C89294cE;
import X.C90204dh;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class IceBreakerPickerView extends C77913rm {
    public boolean A00;
    public LinearLayoutManager A01;
    public RecyclerView A02;
    public AnonymousClass3WL A03;
    public List A04;
    public final AnonymousClass4DV A05;

    public boolean BEB() {
        return true;
    }

    public void CMX() {
        C38391rD r0;
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null && (r0 = recyclerView.A0B) != null) {
            A07(r0.A0Q() / 2, getResources().getDimensionPixelSize(2131167010));
        }
    }

    public View getContentView() {
        RecyclerView recyclerView = this.A02;
        C18070vi.A0z(recyclerView, "null cannot be cast to non-null type android.view.View");
        return recyclerView;
    }

    public AnonymousClass4DV getType() {
        return this.A05;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IceBreakerPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0j(context, attributeSet);
        A04();
        this.A05 = AnonymousClass4DV.BOT_COMMANDS;
    }

    public final void setData(List list, C106835Xj r7) {
        this.A04 = AnonymousClass000.A13();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C80583xR r1 = new C80583xR((C89294cE) list.get(i), r7);
                List list2 = this.A04;
                if (list2 != null) {
                    list2.add(r1);
                }
                List list3 = this.A04;
                if (list3 != null) {
                    list3.add(new C86334Rf(3));
                }
            }
        }
        AnonymousClass3WL r12 = this.A03;
        if (r12 != null) {
            r12.A0W(this.A04);
        }
    }

    public final void setupView(View view) {
        this.A02 = AnonymousClass3MX.A0Q(this, 2131431490);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        this.A01 = linearLayoutManager;
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        AnonymousClass3WL r1 = new AnonymousClass3WL();
        this.A03 = r1;
        RecyclerView recyclerView2 = this.A02;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(r1);
        }
        setVisibility(8);
        if (view != null) {
            setAnchorWidthView(view);
            view.addOnLayoutChangeListener(new C90204dh(view, this, 6));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IceBreakerPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0j(context, attributeSet);
        A04();
        A04();
        this.A05 = AnonymousClass4DV.BOT_COMMANDS;
    }

    public IceBreakerPickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A04();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IceBreakerPickerView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A04();
        A04();
        this.A05 = AnonymousClass4DV.BOT_COMMANDS;
    }
}
