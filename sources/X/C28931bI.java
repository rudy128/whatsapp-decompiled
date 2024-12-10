package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.LinkedHashMap;

/* renamed from: X.1bI  reason: invalid class name and case insensitive filesystem */
public final class C28931bI {
    public View A00;
    public ViewStub A01;
    public View.OnClickListener A02;
    public C38531rR A03;
    public LinkedHashMap A04;

    public int A01() {
        View view = this.A00;
        if (view == null) {
            return 8;
        }
        return view.getVisibility();
    }

    public View A02() {
        View view;
        ViewStub viewStub;
        View view2 = this.A00;
        if (view2 == null && (viewStub = this.A01) != null) {
            view2 = viewStub.inflate();
            this.A00 = view2;
            this.A01 = null;
        }
        C17960vV.A08(view2, "View must be inflated in ViewStubHolder.getView()");
        C38531rR r0 = this.A03;
        if (!(r0 == null || view2 == null)) {
            r0.Bvu(view2);
            this.A03 = null;
        }
        LinkedHashMap linkedHashMap = this.A04;
        if (!(linkedHashMap == null || this.A00 == null)) {
            for (C38531rR Bvu : linkedHashMap.values()) {
                Bvu.Bvu(this.A00);
            }
            this.A04 = null;
        }
        View.OnClickListener onClickListener = this.A02;
        if (!(onClickListener == null || (view = this.A00) == null)) {
            view.setOnClickListener(onClickListener);
            this.A02 = null;
        }
        return this.A00;
    }

    public ViewGroup.LayoutParams A03() {
        View view = this.A01;
        if (view != null || (view = this.A00) != null) {
            return view.getLayoutParams();
        }
        throw new IllegalStateException("Either viewStub or view should exist");
    }

    public void A04(int i) {
        View A022;
        if (i == 8) {
            A022 = this.A00;
            if (A022 == null) {
                return;
            }
        } else {
            A022 = A02();
        }
        A022.setVisibility(i);
    }

    public void A05(View.OnClickListener onClickListener) {
        View view = this.A00;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        } else {
            this.A02 = onClickListener;
        }
    }

    public void A06(ViewGroup.LayoutParams layoutParams) {
        View view = this.A01;
        if (view == null && (view = this.A00) == null) {
            throw new IllegalStateException("Either viewStub or view should exist");
        }
        view.setLayoutParams(layoutParams);
    }

    public void A07(C38531rR r2) {
        View view = this.A00;
        if (view != null) {
            r2.Bvu(view);
        } else {
            this.A03 = r2;
        }
    }

    public void A08(C38531rR r2, String str) {
        View view = this.A00;
        if (view != null) {
            r2.Bvu(view);
            return;
        }
        LinkedHashMap linkedHashMap = this.A04;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.A04 = linkedHashMap;
        }
        if (linkedHashMap.containsKey(str)) {
            this.A04.remove(str);
        }
        this.A04.put(str, r2);
    }

    public void A09(boolean z) {
        View view = this.A00;
        if (view != null) {
            view.setEnabled(z);
        } else if (z) {
            A02().setEnabled(true);
        }
    }

    public boolean A0A() {
        if (this.A00 != null) {
            return true;
        }
        return false;
    }

    public C28931bI(View view) {
        C17960vV.A05(view);
        if (view instanceof ViewStub) {
            this.A01 = (ViewStub) view;
        } else {
            this.A00 = view;
        }
    }

    public static C28931bI A00(View view, int i) {
        return new C28931bI(AnonymousClass1HF.A06(view, i));
    }
}
