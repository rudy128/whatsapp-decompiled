package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass74Q;
import X.AnonymousClass757;
import X.C108945cZ;
import X.C112025ko;
import X.C1410374a;
import X.C18070vi;
import X.C72453Mb;
import X.C73193Ri;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import java.util.List;
import java.util.Map;

public abstract class SelectedListContactPickerFragment extends ContactPickerFragment {
    public RelativeLayout A00;
    public RecyclerView A01;
    public WaTextView A02;
    public C112025ko A03;
    public boolean A04;
    public ValueAnimator A05;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub A0F;
        C18070vi.A0d(layoutInflater, 0);
        View A1q = super.A1q(bundle, layoutInflater, viewGroup);
        RecyclerView recyclerView = null;
        if (!(A1q == null || (A0F = AnonymousClass3MW.A0F(A1q, 2131435105)) == null)) {
            View inflate = A0F.inflate();
            C18070vi.A0z(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            RelativeLayout relativeLayout = (RelativeLayout) inflate;
            this.A00 = relativeLayout;
            if (relativeLayout != null) {
                recyclerView = AnonymousClass3MX.A0Q(relativeLayout, 2131435110);
            }
            this.A01 = recyclerView;
            A01(A1q, true);
        }
        WaTextView waTextView = this.A02;
        if (waTextView != null) {
            waTextView.setVisibility(C72453Mb.A07(this.A4G.isEmpty() ? 1 : 0));
        }
        return A1q;
    }

    public void A2U(View view, AnonymousClass1E7 r3) {
        C18070vi.A0d(view, 1);
        super.A2U(view, r3);
        A32().A0U(r3);
    }

    public boolean A2z(View view, AnonymousClass1E7 r7) {
        C18070vi.A0d(view, 1);
        boolean A2z = super.A2z(view, r7);
        if (A2z) {
            C112025ko A32 = A32();
            List list = A32.A00;
            list.add(r7);
            A32.A0H(AnonymousClass3MX.A01(list));
            RelativeLayout relativeLayout = this.A00;
            int i = 8;
            if (relativeLayout == null || relativeLayout.getVisibility() != 8 || this.A04) {
                A35();
            } else {
                A03(this, 0, AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168600));
            }
            A2N();
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                Map map = this.A4G;
                C18070vi.A0W(map);
                recyclerView.setVisibility(C72453Mb.A07(map.isEmpty() ^ true ? 1 : 0));
            }
            WaTextView waTextView = this.A02;
            if (waTextView != null) {
                if (this.A4G.isEmpty()) {
                    i = 0;
                }
                waTextView.setVisibility(i);
            }
        }
        return A2z;
    }

    public abstract void A35();

    public void A36(AnonymousClass1E7 r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r6.A04 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            java.util.Map r2 = r6.A4G
            X.C18070vi.A0W(r2)
            boolean r0 = r2.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            r5 = 0
            if (r0 != 0) goto L_0x001b
            if (r8 == 0) goto L_0x00d4
            java.util.List r0 = r6.A38
            if (r0 == 0) goto L_0x00d4
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != r1) goto L_0x00d4
        L_0x001b:
            r4 = 1
        L_0x001c:
            android.widget.RelativeLayout r3 = r6.A00
            if (r3 == 0) goto L_0x002c
            if (r4 != 0) goto L_0x0028
            boolean r1 = r6.A04
            r0 = 8
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r3.setVisibility(r0)
        L_0x002c:
            if (r4 != 0) goto L_0x0032
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x003d
        L_0x0032:
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r6)
            r0 = 2131168600(0x7f070d58, float:1.7951506E38)
            int r5 = r1.getDimensionPixelSize(r0)
        L_0x003d:
            android.widget.ListView r0 = r6.A0D
            if (r0 != 0) goto L_0x004a
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r7, r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
        L_0x004a:
            X.C18070vi.A0b(r0)
            A02(r0, r6, r5)
            X.5ko r0 = r6.A03
            if (r0 != 0) goto L_0x005b
            X.5ko r0 = new X.5ko
            r0.<init>(r6)
            r6.A03 = r0
        L_0x005b:
            X.5ko r0 = r6.A32()
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0074
            X.5ko r0 = r6.A32()
            java.util.List r1 = r0.A00
            java.util.Collection r0 = r2.values()
            r1.addAll(r0)
        L_0x0074:
            androidx.recyclerview.widget.RecyclerView r4 = r6.A01
            r3 = 0
            if (r4 == 0) goto L_0x00b3
            int r0 = r4.getPaddingTop()
            X.C72463Mc.A14(r4, r3, r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168605(0x7f070d5d, float:1.7951517E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.5lq r0 = new X.5lq
            r0.<init>(r1, r3)
            r4.A0r(r0)
            android.content.Context r1 = r4.getContext()
            com.whatsapp.filter.SmoothScrollLinearLayoutManager r0 = new com.whatsapp.filter.SmoothScrollLinearLayoutManager
            r0.<init>(r1, r3, r3)
            r0.A1Z(r3)
            r4.setLayoutManager(r0)
            X.5ko r0 = r6.A32()
            r4.setAdapter(r0)
            X.5nX r0 = new X.5nX
            r0.<init>()
            r0.A00 = r6
            r4.setItemAnimator(r0)
        L_0x00b3:
            androidx.recyclerview.widget.RecyclerView r1 = r6.A01
            if (r1 == 0) goto L_0x00c4
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
        L_0x00c4:
            com.whatsapp.WaTextView r1 = r6.A02
            if (r1 == 0) goto L_0x00d3
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00d0
            r3 = 8
        L_0x00d0:
            r1.setVisibility(r3)
        L_0x00d3:
            return
        L_0x00d4:
            r4 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.SelectedListContactPickerFragment.A01(android.view.View, boolean):void");
    }

    public static final void A03(SelectedListContactPickerFragment selectedListContactPickerFragment, int i, int i2) {
        ValueAnimator valueAnimator;
        RecyclerView recyclerView = selectedListContactPickerFragment.A01;
        if (recyclerView != null) {
            recyclerView.clearAnimation();
        }
        ValueAnimator valueAnimator2 = selectedListContactPickerFragment.A05;
        if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = selectedListContactPickerFragment.A05) == null)) {
            valueAnimator.end();
        }
        int[] A1W = C108945cZ.A1W();
        A1W[0] = i;
        A1W[1] = i2;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1W);
        ofInt.addUpdateListener(new C1410374a(selectedListContactPickerFragment));
        ofInt.addListener(new AnonymousClass74Q(selectedListContactPickerFragment));
        ofInt.setDuration(240);
        ofInt.start();
        selectedListContactPickerFragment.A05 = ofInt;
    }

    public final C112025ko A32() {
        C112025ko r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("selectedContactsAdapter");
        throw null;
    }

    public void A33() {
        RecyclerView recyclerView = this.A01;
        int i = 0;
        if (recyclerView != null) {
            Map map = this.A4G;
            C18070vi.A0W(map);
            recyclerView.setVisibility(C72453Mb.A07(map.isEmpty() ^ true ? 1 : 0));
        }
        WaTextView waTextView = this.A02;
        if (waTextView != null) {
            if (!this.A4G.isEmpty()) {
                i = 8;
            }
            waTextView.setVisibility(i);
        }
    }

    public static final void A02(ListView listView, SelectedListContactPickerFragment selectedListContactPickerFragment, int i) {
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            listView.setLayoutParams(marginLayoutParams);
            RelativeLayout relativeLayout = selectedListContactPickerFragment.A00;
            if (relativeLayout != null) {
                ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = i;
                    relativeLayout.setLayoutParams(layoutParams2);
                    return;
                }
                throw AnonymousClass3MY.A0k();
            }
            return;
        }
        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public void A2I() {
        super.A2I();
        ListView listView = this.A0D;
        C18070vi.A0W(listView);
        A01(listView, false);
        ListView listView2 = this.A0D;
        if (listView2 != null) {
            listView2.setFastScrollAlwaysVisible(false);
            listView2.setFastScrollEnabled(false);
        }
    }

    public final void A34() {
        C73193Ri A002 = C73193Ri.A00(A1D());
        A002.A0U(2131886768);
        A002.A0W(AnonymousClass757.A00(this, 37), 2131886767);
        A002.A0X((DialogInterface.OnClickListener) null, 2131886771);
        AnonymousClass3MY.A1G(A002);
    }
}
