package com.whatsapp.contact.picker;

import X.AnonymousClass1HF;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3RX;
import X.AnonymousClass3WX;
import X.AnonymousClass4aX;
import X.AnonymousClass4aZ;
import X.C108435bh;
import X.C112585li;
import X.C113675nX;
import X.C146427Pb;
import X.C18000vb;
import X.C24921Me;
import X.C27641Ww;
import X.C38251qy;
import X.C72463Mc;
import X.C88684ac;
import X.C89874dA;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaImageButton;
import com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList;
import java.util.List;

public class SelectedContactsList extends AnonymousClass3RX {
    public int A00;
    public int A01;
    public AnimatorSet A02;
    public ValueAnimator A03;
    public View A04;
    public RecyclerView A05;
    public C24921Me A06;
    public AnonymousClass3WX A07;
    public C108435bh A08;
    public List A09;

    public SelectedContactsList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getSelectedContactsListLeftPadding() {
        return 0;
    }

    public static void A00(View view, View view2, SelectedContactsList selectedContactsList, boolean z) {
        int i;
        selectedContactsList.A02 = new AnimatorSet();
        if (z) {
            selectedContactsList.A08.CRZ();
        }
        ValueAnimator valueAnimator = selectedContactsList.A03;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            selectedContactsList.A03.end();
        }
        int[] iArr = new int[2];
        if (!z || view2.getVisibility() != 8) {
            i = 0;
        } else {
            i = view2.getMeasuredHeight();
        }
        iArr[0] = i;
        iArr[1] = selectedContactsList.A01;
        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
        ofInt.addUpdateListener(new C88684ac(view));
        ofInt.addListener(new AnonymousClass4aZ(selectedContactsList));
        ofInt.setDuration(240);
        selectedContactsList.A03(ofInt);
    }

    public void A02() {
        C38251qy layoutManager;
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int A0J = layoutManager.A0J();
            View A0P = recyclerView.getLayoutManager().A0P(0);
            if (A0J != 0 && A0P != null) {
                int width = recyclerView.getWidth();
                ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(A0P);
                int width2 = A0P.getWidth() + A0B.leftMargin + A0B.rightMargin;
                int paddingRight = recyclerView.getPaddingRight();
                if (A0J < this.A09.size()) {
                    int i = A0J * width2;
                    if (paddingRight == 0 && width >= i - A0B.leftMargin && width <= i + A0B.rightMargin) {
                        setSelectedContactsListRightPadding(width2 / 2);
                    }
                } else if (paddingRight > 0) {
                    setSelectedContactsListRightPadding(0);
                }
            }
        }
    }

    public void A03(Animator animator) {
        this.A02.play(animator);
        this.A02.start();
    }

    public void setSelectedContactsListRightPadding(int i) {
        RecyclerView recyclerView = this.A05;
        C72463Mc.A15(recyclerView, recyclerView.getPaddingLeft(), i);
    }

    public int getSelectedContactsLayoutHeight() {
        return getResources().getDimensionPixelSize(2131168600);
    }

    public void setCallback(C108435bh r1) {
        this.A08 = r1;
    }

    public void setSelectedContacts(List list) {
        this.A09 = list;
    }

    public int getSelectedContactsLayout() {
        return 2131626868;
    }

    public SelectedContactsList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        View.inflate(context, 2131626870, this);
        this.A00 = getResources().getDimensionPixelSize(2131168602);
        this.A04 = AnonymousClass1HF.A06(this, 2131435111);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass1HF.A06(this, 2131435110);
        this.A05 = recyclerView;
        recyclerView.setPadding(getSelectedContactsListLeftPadding(), this.A05.getPaddingTop(), this.A05.getPaddingRight(), this.A05.getPaddingBottom());
        boolean z = this instanceof GroupCallSelectedContactsList;
        if (z) {
            GroupCallSelectedContactsList groupCallSelectedContactsList = (GroupCallSelectedContactsList) this;
            RecyclerView recyclerView2 = groupCallSelectedContactsList.A05;
            ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(recyclerView2);
            int dimensionPixelSize = groupCallSelectedContactsList.getResources().getDimensionPixelSize(2131168596);
            if (AnonymousClass3MY.A1b(groupCallSelectedContactsList.A04)) {
                A0B.rightMargin = dimensionPixelSize;
            } else {
                A0B.leftMargin = dimensionPixelSize;
            }
            recyclerView2.setLayoutParams(A0B);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131168605);
        this.A05.A0r(new C112585li(this, dimensionPixelSize2, 1));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A1Z(0);
        this.A05.setLayoutManager(linearLayoutManager);
        this.A05.setItemAnimator(new C113675nX());
        int selectedContactsLayoutHeight = getSelectedContactsLayoutHeight();
        this.A01 = selectedContactsLayoutHeight;
        setLayoutParams(new RelativeLayout.LayoutParams(-1, selectedContactsLayoutHeight));
        setVisibility(4);
        AnonymousClass3WX r1 = new AnonymousClass3WX(this.A06, this);
        this.A07 = r1;
        this.A05.setAdapter(r1);
        if (z) {
            GroupCallSelectedContactsList groupCallSelectedContactsList2 = (GroupCallSelectedContactsList) this;
            groupCallSelectedContactsList2.A00 = groupCallSelectedContactsList2.getResources().getDimensionPixelSize(2131168607);
            groupCallSelectedContactsList2.A01 = groupCallSelectedContactsList2.getResources().getDimensionPixelSize(2131168608);
            groupCallSelectedContactsList2.A02 = (WaImageButton) AnonymousClass1HF.A06(groupCallSelectedContactsList2, 2131435113);
            groupCallSelectedContactsList2.A03 = (WaImageButton) AnonymousClass1HF.A06(groupCallSelectedContactsList2, 2131435114);
            groupCallSelectedContactsList2.A02.setVisibility(0);
            groupCallSelectedContactsList2.A03.setVisibility(0);
            AnonymousClass4aX.A0B(context, groupCallSelectedContactsList2.A02, 2131231742, AnonymousClass1YL.A00(context, 2130971758, 2131102887));
            AnonymousClass4aX.A0B(context, groupCallSelectedContactsList2.A03, 2131232399, AnonymousClass1YL.A00(context, 2130971758, 2131102887));
            AnonymousClass3MX.A1D(groupCallSelectedContactsList2.getResources(), groupCallSelectedContactsList2.A02, 2131898713);
            AnonymousClass3MX.A1D(groupCallSelectedContactsList2.getResources(), groupCallSelectedContactsList2.A03, 2131899576);
            C89874dA.A00(groupCallSelectedContactsList2.A02, groupCallSelectedContactsList2, 22);
            C89874dA.A00(groupCallSelectedContactsList2.A03, groupCallSelectedContactsList2, 23);
            C18000vb r6 = groupCallSelectedContactsList2.A04;
            WaImageButton waImageButton = groupCallSelectedContactsList2.A02;
            int i2 = -groupCallSelectedContactsList2.A00;
            int i3 = dimensionPixelSize2;
            C27641Ww.A06(waImageButton, r6, 0, dimensionPixelSize2, i2, i3);
            C27641Ww.A06(groupCallSelectedContactsList2.A03, groupCallSelectedContactsList2.A04, 0, dimensionPixelSize2, i2, i3);
            groupCallSelectedContactsList2.A05.postDelayed(new C146427Pb(groupCallSelectedContactsList2, 14), 200);
        }
    }

    public SelectedContactsList(Context context) {
        this(context, (AttributeSet) null);
    }
}
