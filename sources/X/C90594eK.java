package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4eK  reason: invalid class name and case insensitive filesystem */
public final class C90594eK implements ViewTreeObserver.OnGlobalLayoutListener {
    public final AnonymousClass1GC A00;
    public final C23520Bik A01;
    public final List A02;
    public final C23381Fv A03;
    public final C114375qh A04;
    public final AnonymousClass11C A05;
    public final boolean A06;

    public C90594eK(AnonymousClass1F9 r5, C23520Bik bik, AnonymousClass11C r7, List list, boolean z) {
        C18070vi.A0d(r7, 3);
        this.A01 = bik;
        this.A02 = list;
        this.A05 = r7;
        this.A06 = z;
        this.A04 = new C74523bs(this, 1);
        C91424ff r3 = new C91424ff(this, 3);
        this.A00 = r3;
        C23381Fv lifecycle = r5.getLifecycle();
        this.A03 = lifecycle;
        C17960vV.A0D(AnonymousClass3Ma.A1Z(((C23391Fw) lifecycle).A02, C23401Fx.DESTROYED));
        lifecycle.A05(r3);
    }

    public final void A02() {
        TextView textView;
        BIE bie = this.A01.A0J;
        C18070vi.A0X(bie);
        View findViewById = bie.findViewById(2131435508);
        if ((findViewById instanceof TextView) && (textView = (TextView) findViewById) != null) {
            textView.setMaxLines(3);
        }
    }

    public static final void A00(C90594eK r3, int i) {
        Iterator it = C29431cG.A0q(r3.A02).iterator();
        while (it.hasNext()) {
            AnonymousClass3MX.A0E(it).animate().translationY((float) i).setDuration(250).setInterpolator(new AnonymousClass1YX()).start();
        }
    }

    public final void A01() {
        this.A01.A09(3);
        this.A03.A06(this.A00);
    }

    public final void A03() {
        if (((C23391Fw) this.A03).A02.A00(C23401Fx.STARTED)) {
            C23520Bik bik = this.A01;
            BIE bie = bik.A0J;
            C18070vi.A0X(bie);
            bie.getViewTreeObserver().addOnGlobalLayoutListener(this);
            bik.A0C(this.A04);
            bik.A08();
        }
    }

    public final void A04(int i) {
        BIE bie = this.A01.A0J;
        C18070vi.A0X(bie);
        AnonymousClass3Ma.A0E(bie, 2131435507).setTextColor(i);
    }

    public final void A05(int i) {
        A04(C19740yt.A00(this.A01.A0G, i));
    }

    public final void A06(View.OnClickListener onClickListener, int i) {
        C23520Bik bik = this.A01;
        bik.A0G(C18070vi.A0F(bik.A0G, i), onClickListener);
    }

    public final void A07(Runnable runnable) {
        this.A01.A0C(new C74523bs(runnable, 0));
    }

    public void onGlobalLayout() {
        BIE bie = this.A01.A0J;
        C18070vi.A0X(bie);
        AnonymousClass3MY.A1D(bie, this);
        A00(this, -bie.getHeight());
        if (this.A06) {
            AnonymousClass4a5.A01(bie, this.A05);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C90594eK(View view, AnonymousClass1F9 r8, AnonymousClass11C r9, String str, List list, int i, boolean z) {
        this(r8, C23520Bik.A02(view, str, i), r9, list, z);
        C18070vi.A0j(view, str);
        C18070vi.A0g(list, 4, r9);
        C18070vi.A0d(r8, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90594eK(android.view.View r7, X.AnonymousClass1F9 r8, X.AnonymousClass11C r9, java.util.List r10, int r11, int r12, boolean r13) {
        /*
            r6 = this;
            r0 = 1
            r3 = r9
            r4 = r10
            X.C72473Md.A1M(r7, r10, r9, r0)
            X.Bik r2 = X.C23520Bik.A01(r7, r11, r12)
            r0 = r6
            r1 = r8
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90594eK.<init>(android.view.View, X.1F9, X.11C, java.util.List, int, int, boolean):void");
    }
}
