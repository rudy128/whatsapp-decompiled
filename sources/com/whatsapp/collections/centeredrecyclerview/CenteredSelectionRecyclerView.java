package com.whatsapp.collections.centeredrecyclerview;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1KB;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass7RP;
import X.BE6;
import X.BE9;
import X.BL0;
import X.BM9;
import X.BMF;
import X.BMS;
import X.C111725kK;
import X.C112515lb;
import X.C18000vb;
import X.C18070vi;
import X.C26405Cz6;
import X.C26582D4w;
import X.C26583D4x;
import X.C27741Xj;
import X.C38251qy;
import X.C42011xT;
import X.D73;
import X.E8D;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class CenteredSelectionRecyclerView extends RecyclerView implements AnonymousClass009 {
    public AnonymousClass1KB A00;
    public C18000vb A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public final BMS A04;
    public final BMF A05;
    public final C111725kK A06;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.5kK, X.BM9] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CenteredSelectionRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A00 = AnonymousClass10E.A13(A0O);
            this.A01 = AnonymousClass10E.A6R(A0O);
        }
        if (getLayoutManager() == null) {
            setLayoutManager(new LinearLayoutManager(context, attributeSet, i, 0));
        }
        A0r(new C112515lb(getWhatsAppLocale()));
        ? bm9 = new BM9();
        this.A06 = bm9;
        bm9.A08(this);
        BMF bmf = new BMF(bm9);
        this.A05 = bmf;
        A0t(bmf);
        this.A12.add(new D73(context, bmf, bm9));
        BMS bms = new BMS(this, bmf, bm9);
        this.A04 = bms;
        setAccessibilityDelegateCompat(bms);
    }

    public void A0f(int i) {
        addOnLayoutChangeListener(new C26582D4w(this, i, 1));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return AnonymousClass000.A1T(motionEvent.getAction(), 2);
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public static final void A04(CenteredSelectionRecyclerView centeredSelectionRecyclerView, int i) {
        centeredSelectionRecyclerView.A05.A03 = true;
        super.A0f(i);
        centeredSelectionRecyclerView.addOnLayoutChangeListener(new C26582D4w(centeredSelectionRecyclerView, i, 0));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final int getCenteredItem() {
        return BE9.A0C(this.A05.A05(this));
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("globalUI");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("whatsAppLocale");
        throw null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof BL0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(((C27741Xj) parcelable).A00);
        addOnLayoutChangeListener(new C26583D4x(parcelable, this, 0));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Xj, android.os.Parcelable, X.BL0] */
    public Parcelable onSaveInstanceState() {
        C26405Cz6 cz6 = BL0.CREATOR;
        ? r1 = new C27741Xj(super.onSaveInstanceState());
        r1.A00 = -1;
        A0c();
        r1.A00 = getCenteredItem();
        return r1;
    }

    public final void setAllowScrollForAccessibility(boolean z) {
        this.A04.A00 = z;
    }

    public final void setCenteredSelectionListener(E8D e8d) {
        this.A05.A02 = e8d;
    }

    public void setLayoutManager(C38251qy r2) {
        if (r2 == null || !(r2 instanceof LinearLayoutManager)) {
            throw AnonymousClass000.A0k("Layout manager needs to be non-null and an instance of LinearLayoutManager");
        }
        super.setLayoutManager(r2);
    }

    public static final void A05(CenteredSelectionRecyclerView centeredSelectionRecyclerView, int i, boolean z) {
        View view;
        C38251qy layoutManager = centeredSelectionRecyclerView.getLayoutManager();
        if (layoutManager != null) {
            C42011xT A0O = centeredSelectionRecyclerView.A0O(i);
            if (A0O == null || (view = A0O.A0H) == null) {
                if (z) {
                    view = centeredSelectionRecyclerView.A06.A05(layoutManager);
                    if (view == null) {
                        return;
                    }
                } else {
                    centeredSelectionRecyclerView.getGlobalUI().A0J(new AnonymousClass7RP(centeredSelectionRecyclerView, i, 38));
                    return;
                }
            }
            int[] A0A = centeredSelectionRecyclerView.A06.A0A(view, layoutManager);
            int A0I = BE6.A0I(A0A);
            if (Math.abs(A0I) > 1 || Math.abs(A0A[1]) > 1) {
                centeredSelectionRecyclerView.A05.A03 = true;
                centeredSelectionRecyclerView.scrollBy(A0I, A0A[1]);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CenteredSelectionRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 2130970923 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CenteredSelectionRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970923);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CenteredSelectionRecyclerView(Context context) {
        this(context, (AttributeSet) null, 2130970923);
        C18070vi.A0d(context, 1);
    }
}
