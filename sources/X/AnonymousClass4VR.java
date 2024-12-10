package X;

import android.app.Activity;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.ctwa.icebreaker.IceBreakerPickerView;

/* renamed from: X.4VR  reason: invalid class name */
public class AnonymousClass4VR {
    public int A00;
    public View A01;
    public ViewGroup A02;
    public ListView A03;
    public TextView A04;
    public C21470Akb A05;
    public ShimmerFrameLayout A06;
    public C85704Ok A07;
    public AnonymousClass4LS A08;
    public IceBreakerPickerView A09;
    public C74323Zj A0A;
    public AnonymousClass1BI A0B;
    public AnonymousClass1L4 A0C;
    public C28931bI A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final int A0I;
    public final Activity A0J;
    public final TextWatcher A0K = new AnonymousClass48E(this, 8);
    public final AnonymousClass1KB A0L;
    public final AnonymousClass181 A0M;
    public final C108355bZ A0N;
    public final C86434Rp A0O;
    public final AnonymousClass3TA A0P;
    public final C87814Xd A0Q;
    public final AnonymousClass4XK A0R;
    public final AnonymousClass4TX A0S;
    public final C18030ve A0T;
    public final C32011gU A0U;
    public final AnonymousClass1PU A0V;
    public final boolean A0W;
    public final C84884Lf A0X;

    public void A00() {
        if (this.A0G) {
            int i = this.A00;
            if (i == 2 || i == 3) {
                C85704Ok r0 = this.A07;
                if (r0 != null) {
                    r0.A04.setVisibility(8);
                }
                View view = this.A01;
                C17960vV.A05(view);
                view.setVisibility(0);
                ShimmerFrameLayout shimmerFrameLayout = this.A06;
                C17960vV.A05(shimmerFrameLayout);
                shimmerFrameLayout.A03();
                return;
            }
            C28931bI r02 = this.A0D;
            C17960vV.A07(r02);
            ViewGroup viewGroup = (ViewGroup) r02.A02();
            viewGroup.removeAllViews();
            ((ShimmerFrameLayout) AnonymousClass1HF.A06(AnonymousClass3MX.A0A(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624743), 2131435408)).A03();
            viewGroup.setVisibility(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r4.isEmpty() != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass4VG r9, X.C85834Ox r10, java.lang.String r11) {
        /*
            r8 = this;
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x0054
            java.util.List r4 = r9.A0A
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0013
            if (r4 == 0) goto L_0x0013
            boolean r0 = r4.isEmpty()
            r3 = 1
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            int r1 = r8.A00
            r0 = 3
            if (r1 != r0) goto L_0x0055
            com.whatsapp.ctwa.icebreaker.IceBreakerPickerView r1 = r8.A09
            X.C17960vV.A05(r1)
            X.4m8 r0 = new X.4m8
            r0.<init>(r8)
            r1.setData(r4, r0)
            com.whatsapp.ctwa.icebreaker.IceBreakerPickerView r0 = r8.A09
            X.C17960vV.A05(r0)
            r0.A06()
            android.view.View r1 = r8.A01
            r0 = 8
            r1.setVisibility(r0)
        L_0x0035:
            X.4XK r5 = r8.A0R
            X.1BI r0 = r8.A0B
            java.lang.String r4 = r0.getRawString()
            java.util.Map r2 = r5.A01
            boolean r0 = r2.containsKey(r4)
            if (r0 != 0) goto L_0x0054
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r4, r0)
            r0 = 0
            X.AnonymousClass4XK.A00(r5, r4, r0, r3)
        L_0x0054:
            return
        L_0x0055:
            r0 = 2
            if (r1 != r0) goto L_0x00cb
            X.4Lf r0 = r8.A0X
            X.0ve r2 = r0.A00
            r1 = 2087(0x827, float:2.925E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0073
            X.3Zj r0 = r8.A0A
            if (r0 == 0) goto L_0x0073
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 22
            X.C90584eJ.A00(r1, r8, r0)
        L_0x0073:
            X.3Zj r1 = r8.A0A
            X.C17960vV.A05(r1)
            X.4m8 r0 = new X.4m8
            r0.<init>(r8)
            r1.setData(r11, r4, r0)
            boolean r0 = r8.A0E
            if (r0 != 0) goto L_0x0035
            int r1 = r8.A00
            r0 = 2
            if (r1 != r0) goto L_0x0035
            r0 = 1
            r8.A0E = r0
            r0 = 0
            r8.A0H = r0
            android.view.ViewGroup r0 = r8.A02
            int r1 = r0.getHeight()
            X.4Ok r0 = r8.A07
            if (r0 == 0) goto L_0x00c9
            com.whatsapp.webpagepreview.WebPagePreviewView r9 = r0.A04
        L_0x009b:
            X.3Zj r7 = r8.A0A
            X.C17960vV.A05(r7)
            android.view.View r5 = r8.A01
            X.C17960vV.A05(r5)
            r0 = 1
            X.4eP r6 = new X.4eP
            r6.<init>(r7, r1, r0, r8)
            r10 = 3
            X.3Mk r4 = new X.3Mk
            r4.<init>(r5, r6, r7, r8, r9, r10)
            android.view.ViewPropertyAnimator r1 = r5.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 100
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r4)
            r0.start()
            goto L_0x0035
        L_0x00c9:
            r9 = 0
            goto L_0x009b
        L_0x00cb:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x0035
            X.1bI r0 = r8.A0D
            X.C17960vV.A07(r0)
            android.view.View r7 = r0.A02()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r0 = 16
            X.4dO r6 = new X.4dO
            r6.<init>(r8, r9, r0)
            r7.removeAllViews()
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r7)
            r0 = 2131624740(0x7f0e0324, float:1.8876668E38)
            android.view.View r5 = X.AnonymousClass3MX.A0A(r1, r7, r0)
            r0 = 2131432664(0x7f0b14d8, float:1.8487092E38)
            android.widget.TextView r4 = X.AnonymousClass3MW.A0J(r5, r0)
            r4.setText(r11)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131167011(0x7f070723, float:1.7948284E38)
            int r0 = X.AnonymousClass3MW.A01(r1, r0)
            r2 = 0
            if (r3 == 0) goto L_0x010a
            r0 = 0
        L_0x010a:
            r4.setPadding(r2, r2, r2, r0)
            r0 = 2131431493(0x7f0b1045, float:1.8484717E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r5, r0)
            int r0 = X.C72453Mb.A0J(r3)
            r1.setVisibility(r0)
            r1.setOnClickListener(r6)
            r7.setVisibility(r2)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VR.A01(X.4VG, X.4Ox, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r3 = this;
            boolean r0 = r3.A0G
            r2 = 0
            if (r0 == 0) goto L_0x0016
            int r1 = r3.A00
            r0 = 3
            if (r1 != r0) goto L_0x0017
            com.whatsapp.ctwa.icebreaker.IceBreakerPickerView r0 = r3.A09
        L_0x000c:
            X.C17960vV.A05(r0)
            int r0 = r0.getVisibility()
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            r2 = 1
        L_0x0016:
            return r2
        L_0x0017:
            r0 = 2
            if (r1 != r0) goto L_0x001d
            X.3Zj r0 = r3.A0A
            goto L_0x000c
        L_0x001d:
            X.1bI r0 = r3.A0D
            X.C17960vV.A07(r0)
            int r0 = r0.A01()
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VR.A02():boolean");
    }

    public boolean A03() {
        if (this.A0G && this.A00 == 2) {
            C74323Zj r2 = this.A0A;
            C17960vV.A05(r2);
            for (int i = 0; i < this.A02.getChildCount(); i++) {
                if (this.A02.getChildAt(i) == r2 && r2.getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass4VR(Activity activity, AnonymousClass1KB r6, AnonymousClass181 r7, C108355bZ r8, C86434Rp r9, AnonymousClass3TA r10, C87814Xd r11, AnonymousClass4XK r12, C84884Lf r13, AnonymousClass4TX r14, C18030ve r15, C32011gU r16, AnonymousClass1PU r17, AnonymousClass1L4 r18) {
        this.A0C = r18;
        this.A0J = activity;
        this.A0L = r6;
        this.A0G = false;
        this.A0T = r15;
        this.A0U = r16;
        this.A0M = r7;
        this.A0X = r13;
        this.A0N = r8;
        this.A0V = r17;
        this.A0Q = r11;
        this.A0R = r12;
        this.A0P = r10;
        this.A0I = 2131431492;
        C18030ve r2 = r13.A00;
        C18040vf r1 = C18040vf.A02;
        this.A0W = C18020vd.A05(r1, r2, 863);
        this.A00 = C72453Mb.A03(C18020vd.A05(r1, r2, 1293) ? 1 : 0);
        this.A0S = r14;
        this.A0O = r9;
    }
}
