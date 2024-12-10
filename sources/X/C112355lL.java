package X;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.5lL  reason: invalid class name and case insensitive filesystem */
public class C112355lL extends C38391rD implements C40391ud {
    public RecyclerView A00;
    public String A01;
    public Map A02;
    public boolean A03;
    public final Activity A04;
    public final C23381Fv A05;
    public final C39711tW A06;
    public final C36491nz A07;
    public final C124986aJ A08;
    public final C124996aK A09;
    public final C125006aL A0A;
    public final C72043Kk A0B;
    public final C37551pj A0C;
    public final AnonymousClass73Z A0D;
    public final C130306jD A0E;
    public final C24921Me A0F;
    public final C37451pZ A0G;
    public final AnonymousClass733 A0H;
    public final C37471pb A0I;
    public final AnonymousClass11P A0J;
    public final AnonymousClass118 A0K;
    public final C18000vb A0L;
    public final C18030ve A0M;
    public final C32011gU A0N;
    public final C38581rX A0O;
    public final C36921og A0P;
    public final C142627Ae A0Q;
    public final C142617Ad A0R;
    public final C147387Sy A0S;
    public final C111295jU A0T;
    public final C138036wQ A0U;
    public final AnonymousClass68H A0V;
    public final HashSet A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final AnonymousClass190 A0Z;

    public static final Chip A00(Context context, AnonymousClass77M r5) {
        C18070vi.A0d(r5, 1);
        String A0F2 = C18070vi.A0F(context, r5.A04);
        if (r5.A06) {
            A0F2 = AnonymousClass000.A0y(" [Internal]", AnonymousClass000.A11(A0F2));
        }
        Chip chip = new Chip(context);
        chip.setText(A0F2);
        chip.setClickable(true);
        int i = r5.A02;
        if (i != 0) {
            AnonymousClass6F9.A02(context, chip, i, AnonymousClass1YL.A00(context, 2130971109, 2131102436));
        }
        chip.setChipIconTintResource(2131102435);
        C72463Mc.A0y(context, chip, 2130971109, 2131102436);
        chip.setChipBackgroundColorResource(AnonymousClass1YL.A00(context, 2130971087, 2131102418));
        return chip;
    }

    public void A0S(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        recyclerView.A0t(this.A06);
        recyclerView.A0t(this.A0Q.A04);
        this.A00 = recyclerView;
    }

    public void A0T(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        recyclerView.A0u(this.A06);
        C142627Ae r1 = this.A0Q;
        recyclerView.A0u(r1.A04);
        C142627Ae.A02(r1);
        this.A00 = null;
    }

    public boolean Bex(int i) {
        if (i == -1) {
            return false;
        }
        C147387Sy r1 = this.A0S;
        if (i < 0 || i >= r1.size()) {
            return false;
        }
        int A072 = C108955ca.A07(r1, i);
        if (A072 == 1 || A072 == 12 || A072 == 31) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void A0L(C42011xT r2) {
        C42061xY r22 = (C42061xY) r2;
        C18070vi.A0d(r22, 0);
        r22.A0C();
        this.A0W.remove(r22);
    }

    public /* bridge */ /* synthetic */ void A0N(C42011xT r2) {
        C42061xY r22 = (C42061xY) r2;
        C18070vi.A0d(r22, 0);
        r22.A0B();
        this.A0W.add(r22);
    }

    public int A0Q() {
        return this.A0S.size();
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r2) {
        C42061xY r22 = (C42061xY) r2;
        C18070vi.A0d(r22, 0);
        r22.A0D();
    }

    public int BSO(int i) {
        while (i >= 0) {
            if (Bex(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.6Fm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.66C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.6FP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.22n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.665} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: X.22p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: X.669} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.668} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: X.66D} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: X.66E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: X.22l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: X.666} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: X.66B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: X.21i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: X.667} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: X.66K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: X.5xG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: X.6FP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: X.66C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: X.6Fm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: X.665} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: X.665} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v96, resolved type: X.22n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: X.6FP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v97, resolved type: X.22n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v49, resolved type: X.6FP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: X.66C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v50, resolved type: X.6Fm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: X.66C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v51, resolved type: X.6Fm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: X.66C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: X.6Fm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v101, resolved type: X.22l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: X.66C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: X.6FR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v102, resolved type: X.22n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: X.665} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: X.6FP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v103, resolved type: X.22l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: X.66C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: X.6FQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v104, resolved type: X.22n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v88, resolved type: X.665} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: X.6FP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v105, resolved type: X.21V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v89, resolved type: X.66C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: X.6Fm} */
    /* JADX WARNING: type inference failed for: r0v61, types: [X.6FB, X.6FA, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x079d, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r7, 442) != false) goto L_0x079f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0116, code lost:
        if (X.C20135A8w.A0R.A03(r4.A0y) == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r4 != r2.A00) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x021a, code lost:
        if (X.C20135A8w.A0R.A03(r4.A0y) == false) goto L_0x021c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r34, int r35) {
        /*
            r33 = this;
            r0 = r34
            X.1xY r0 = (X.C42061xY) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            r3 = r33
            boolean r1 = r3.A03
            if (r1 != 0) goto L_0x001c
            X.7Ae r2 = r3.A0Q
            int r4 = r0.A05
            r1 = -1
            if (r4 != r1) goto L_0x0017
            int r4 = r0.A04
        L_0x0017:
            int r2 = r2.A00
            r1 = 1
            if (r4 == r2) goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            r0.A0F(r1)
            boolean r1 = r3.A03
            r0.A0E(r1)
            X.5jU r4 = r3.A0T     // Catch:{ ClassCastException -> 0x09ef }
            X.7Ej r1 = r4.A16     // Catch:{ ClassCastException -> 0x09ef }
            java.util.List r6 = r1.BXB()     // Catch:{ ClassCastException -> 0x09ef }
            X.7Sy r5 = r3.A0S     // Catch:{ ClassCastException -> 0x09ef }
            r2 = r35
            java.lang.Object r1 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            boolean r1 = r1 instanceof X.AnonymousClass206     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x006b
            X.6wQ r8 = r3.A0U     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r7 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r7 = (X.AnonymousClass206) r7     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 0
            X.C18070vi.A0d(r7, r1)     // Catch:{ ClassCastException -> 0x09ef }
            int r1 = r7.A0u     // Catch:{ ClassCastException -> 0x09ef }
            boolean r1 = X.C138036wQ.A00(r8, r1)     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x006b
            java.lang.Object r1 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r1 = (X.AnonymousClass206) r1     // Catch:{ ClassCastException -> 0x09ef }
            r0 = 1
            X.C18070vi.A0d(r1, r0)     // Catch:{ ClassCastException -> 0x09ef }
            int r1 = r1.A0u     // Catch:{ ClassCastException -> 0x09ef }
            boolean r0 = X.C138036wQ.A00(r8, r1)     // Catch:{ ClassCastException -> 0x09ef }
            if (r0 == 0) goto L_0x0a03
            X.0vl r0 = r8.A00     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r0 = r0.getValue()     // Catch:{ ClassCastException -> 0x09ef }
            X.20Z r0 = (X.AnonymousClass20Z) r0     // Catch:{ ClassCastException -> 0x09ef }
            r0.A00(r1)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x006b:
            boolean r1 = r0 instanceof X.AnonymousClass664     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0081
            X.664 r0 = (X.AnonymousClass664) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ ClassCastException -> 0x09ef }
            int r1 = r1.intValue()     // Catch:{ ClassCastException -> 0x09ef }
            com.whatsapp.WaTextView r0 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            r0.setText(r1)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x0081:
            boolean r1 = r0 instanceof X.AnonymousClass65v     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x00a1
            X.65v r0 = (X.AnonymousClass65v) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ ClassCastException -> 0x09ef }
            int r1 = r1.intValue()     // Catch:{ ClassCastException -> 0x09ef }
            X.5ff r4 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r0 = r4.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.String r2 = X.C18070vi.A0F(r0, r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 0
            r0 = 5
            r4.A00(r2, r1, r0)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x00a1:
            boolean r1 = r0 instanceof X.AnonymousClass65u     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x00c7
            X.65u r0 = (X.AnonymousClass65u) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r5 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 0
            X.C18070vi.A0d(r5, r4)     // Catch:{ ClassCastException -> 0x09ef }
            X.5ff r2 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = r5.first     // Catch:{ ClassCastException -> 0x09ef }
            X.C18070vi.A0W(r1)     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r0 = r5.second     // Catch:{ ClassCastException -> 0x09ef }
            X.C18070vi.A0W(r0)     // Catch:{ ClassCastException -> 0x09ef }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r2.A00(r1, r0, r4)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x00c7:
            boolean r1 = r0 instanceof X.C1189065y     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x00df
            X.65y r0 = (X.C1189065y) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.6ca r2 = (X.C126346ca) r2     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 0
            X.C18070vi.A0d(r2, r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.6F8 r1 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            java.util.List r0 = r2.A00     // Catch:{ ClassCastException -> 0x09ef }
            r1.A04(r4, r0)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x00df:
            boolean r1 = r0 instanceof X.C1189165z     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x01dc
            X.65z r0 = (X.C1189165z) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r9 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            android.util.SparseIntArray r9 = (android.util.SparseIntArray) r9     // Catch:{ ClassCastException -> 0x09ef }
            r6 = 0
            X.C18070vi.A0d(r9, r6)     // Catch:{ ClassCastException -> 0x09ef }
            X.6F6 r0 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            X.6cb r7 = new X.6cb     // Catch:{ ClassCastException -> 0x09ef }
            r7.<init>(r4)     // Catch:{ ClassCastException -> 0x09ef }
            X.6cc r5 = new X.6cc     // Catch:{ ClassCastException -> 0x09ef }
            r5.<init>(r4)     // Catch:{ ClassCastException -> 0x09ef }
            X.1Dg r2 = r4.A0g     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = r2.A06()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0118
            java.lang.String r1 = X.C108945cZ.A1F(r2)     // Catch:{ ClassCastException -> 0x09ef }
            boolean r1 = r1.isEmpty()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 != 0) goto L_0x0118
            X.0ve r2 = r4.A0y     // Catch:{ ClassCastException -> 0x09ef }
            X.A4o r1 = X.C20135A8w.A0R     // Catch:{ ClassCastException -> 0x09ef }
            boolean r1 = r1.A03(r2)     // Catch:{ ClassCastException -> 0x09ef }
            r15 = 1
            if (r1 != 0) goto L_0x0119
        L_0x0118:
            r15 = 0
        L_0x0119:
            com.google.android.material.chip.ChipGroup r8 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r8.removeAllViews()     // Catch:{ ClassCastException -> 0x09ef }
            if (r15 == 0) goto L_0x012e
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131168578(0x7f070d42, float:1.7951462E38)
            int r1 = r2.getDimensionPixelSize(r1)     // Catch:{ ClassCastException -> 0x09ef }
            r8.setChipSpacingVertical(r1)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x012e:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 0
        L_0x0133:
            int r1 = r9.size()     // Catch:{ ClassCastException -> 0x09ef }
            if (r4 >= r1) goto L_0x0155
            int r1 = r9.keyAt(r4)     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0152
            int r1 = r9.keyAt(r4)     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ ClassCastException -> 0x09ef }
            int r1 = r9.valueAt(r4)     // Catch:{ ClassCastException -> 0x09ef }
            android.util.Pair r1 = X.C17890vO.A0E(r2, r1)     // Catch:{ ClassCastException -> 0x09ef }
            r10.add(r1)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0152:
            int r4 = r4 + 1
            goto L_0x0133
        L_0x0155:
            r1 = 33
            X.C147027Rn.A01(r1, r10)     // Catch:{ ClassCastException -> 0x09ef }
            java.util.Iterator r14 = r10.iterator()     // Catch:{ ClassCastException -> 0x09ef }
        L_0x015e:
            boolean r1 = r14.hasNext()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0597
            java.lang.Object r11 = r14.next()     // Catch:{ ClassCastException -> 0x09ef }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = r11.first     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ ClassCastException -> 0x09ef }
            int r13 = r1.intValue()     // Catch:{ ClassCastException -> 0x09ef }
            android.util.SparseArray r1 = X.C137376vM.A00()     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r12 = r1.get(r13)     // Catch:{ ClassCastException -> 0x09ef }
            X.6iy r12 = (X.C130156iy) r12     // Catch:{ ClassCastException -> 0x09ef }
            if (r12 == 0) goto L_0x015e
            android.content.Context r1 = r0.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            com.google.android.material.chip.Chip r4 = new com.google.android.material.chip.Chip     // Catch:{ ClassCastException -> 0x09ef }
            r4.<init>(r1)     // Catch:{ ClassCastException -> 0x09ef }
            int r1 = r12.A05     // Catch:{ ClassCastException -> 0x09ef }
            r4.setText(r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 1
            r4.setClickable(r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 24
            X.AnonymousClass78T.A00(r4, r7, r5, r13, r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r2 = r0.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r1 = r0.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            r10 = 2130971109(0x7f0409e5, float:1.7550947E38)
            r9 = 2131102436(0x7f060ae4, float:1.781731E38)
            int r1 = X.AnonymousClass1YL.A00(r1, r10, r9)     // Catch:{ ClassCastException -> 0x09ef }
            X.C137376vM.A01(r2, r4, r13, r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131102435(0x7f060ae3, float:1.7817308E38)
            r4.setChipIconTintResource(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r2 = r0.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r1 = r0.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            X.C72463Mc.A0w(r1, r2, r4, r10, r9)     // Catch:{ ClassCastException -> 0x09ef }
            X.C108995ce.A16(r4)     // Catch:{ ClassCastException -> 0x09ef }
            int r1 = r12.A04     // Catch:{ ClassCastException -> 0x09ef }
            r4.setId(r1)     // Catch:{ ClassCastException -> 0x09ef }
            if (r15 == 0) goto L_0x01d8
            r4.setEnsureMinTouchTargetSize(r6)     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = r11.second     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ ClassCastException -> 0x09ef }
            int r2 = r1.intValue()     // Catch:{ ClassCastException -> 0x09ef }
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r1) goto L_0x01d8
            r1 = 4
            r4.setVisibility(r1)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x01d8:
            r8.addView(r4)     // Catch:{ ClassCastException -> 0x09ef }
            goto L_0x015e
        L_0x01dc:
            boolean r1 = r0 instanceof X.C1188865q     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x02cc
            X.65q r0 = (X.C1188865q) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r7 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.6sd r7 = (X.C135706sd) r7     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 0
            X.C18070vi.A0d(r7, r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.util.SparseIntArray r9 = r7.A00     // Catch:{ ClassCastException -> 0x09ef }
            if (r9 == 0) goto L_0x0220
            X.6FA r8 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 30
            X.7gh r6 = X.C108945cZ.A1K(r4, r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 10
            X.7gg r5 = new X.7gg     // Catch:{ ClassCastException -> 0x09ef }
            r5.<init>(r4, r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.1Dg r2 = r4.A0g     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = r2.A06()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x021c
            java.lang.String r1 = X.C108945cZ.A1F(r2)     // Catch:{ ClassCastException -> 0x09ef }
            boolean r1 = r1.isEmpty()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 != 0) goto L_0x021c
            X.0ve r2 = r4.A0y     // Catch:{ ClassCastException -> 0x09ef }
            X.A4o r1 = X.C20135A8w.A0R     // Catch:{ ClassCastException -> 0x09ef }
            boolean r2 = r1.A03(r2)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 1
            if (r2 != 0) goto L_0x021d
        L_0x021c:
            r1 = 0
        L_0x021d:
            r8.A01(r9, r5, r6, r1)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0220:
            java.util.List r2 = r7.A03     // Catch:{ ClassCastException -> 0x09ef }
            if (r2 == 0) goto L_0x0229
            X.6FA r1 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            r1.A02(r4, r2)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0229:
            java.util.List r1 = r7.A02     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0a03
            X.6FA r0 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            X.816 r5 = new X.816     // Catch:{ ClassCastException -> 0x09ef }
            r5.<init>(r4)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 1
            java.util.Iterator r8 = r1.iterator()     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0239:
            boolean r1 = r8.hasNext()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0597
            java.lang.Object r6 = r8.next()     // Catch:{ ClassCastException -> 0x09ef }
            X.77M r6 = (X.AnonymousClass77M) r6     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r1 = X.AnonymousClass3MY.A04(r0)     // Catch:{ ClassCastException -> 0x09ef }
            com.google.android.material.chip.Chip r2 = A00(r1, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 40
            X.C90024dP.A00(r2, r6, r5, r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.76v r6 = r6.A05     // Catch:{ ClassCastException -> 0x09ef }
            boolean r1 = r6.A02()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x02c5
            android.content.res.Resources r7 = X.AnonymousClass000.A0Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131893133(0x7f121b8d, float:1.9421034E38)
            java.lang.String r11 = r7.getString(r1)     // Catch:{ ClassCastException -> 0x09ef }
            r0.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            android.graphics.Typeface r10 = X.C43421zm.A00()     // Catch:{ ClassCastException -> 0x09ef }
            android.content.res.Resources r7 = X.AnonymousClass000.A0Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131103277(0x7f060e2d, float:1.7819016E38)
            int r12 = r7.getColor(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.res.Resources r7 = X.AnonymousClass000.A0Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131103394(0x7f060ea2, float:1.7819253E38)
            int r13 = r7.getColor(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.res.Resources r7 = X.AnonymousClass000.A0Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131169003(0x7f070eeb, float:1.7952324E38)
            int r14 = r7.getDimensionPixelSize(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.res.Resources r7 = X.AnonymousClass000.A0Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131168779(0x7f070e0b, float:1.795187E38)
            int r15 = r7.getDimensionPixelSize(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.res.Resources r7 = X.AnonymousClass000.A0Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131168786(0x7f070e12, float:1.7951884E38)
            int r16 = r7.getDimensionPixelSize(r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.5dS r9 = new X.5dS     // Catch:{ ClassCastException -> 0x09ef }
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ ClassCastException -> 0x09ef }
            r2.setCloseIconVisible((boolean) r4)     // Catch:{ ClassCastException -> 0x09ef }
            r2.setCloseIcon(r9)     // Catch:{ ClassCastException -> 0x09ef }
            int r1 = r9.A00     // Catch:{ ClassCastException -> 0x09ef }
            float r1 = (float) r1     // Catch:{ ClassCastException -> 0x09ef }
            r2.setCloseIconSize(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r7 = r0.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 1082130432(0x40800000, float:4.0)
            int r1 = X.C62762rw.A01(r7, r1)     // Catch:{ ClassCastException -> 0x09ef }
            float r1 = (float) r1     // Catch:{ ClassCastException -> 0x09ef }
            r2.setCloseIconEndPadding(r1)     // Catch:{ ClassCastException -> 0x09ef }
            r6.A01()     // Catch:{ ClassCastException -> 0x09ef }
        L_0x02c5:
            com.google.android.material.chip.ChipGroup r1 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r1.addView(r2)     // Catch:{ ClassCastException -> 0x09ef }
            goto L_0x0239
        L_0x02cc:
            boolean r1 = r0 instanceof X.AnonymousClass66G     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0467
            X.66G r0 = (X.AnonymousClass66G) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r7 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            java.util.List r7 = (java.util.List) r7     // Catch:{ ClassCastException -> 0x09ef }
            X.7Lx r25 = new X.7Lx     // Catch:{ ClassCastException -> 0x09ef }
            r1 = r25
            r1.<init>(r4)     // Catch:{ ClassCastException -> 0x09ef }
            X.0ve r4 = r3.A0M     // Catch:{ ClassCastException -> 0x09ef }
            r2 = 8407(0x20d7, float:1.1781E-41)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ ClassCastException -> 0x09ef }
            int r10 = X.C18020vd.A00(r1, r4, r2)     // Catch:{ ClassCastException -> 0x09ef }
            if (r7 == 0) goto L_0x0a03
            android.view.View r15 = r0.A0H     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131430389(0x7f0b0bf5, float:1.8482478E38)
            android.view.View r6 = X.AnonymousClass3MX.A0C(r15, r1)     // Catch:{ ClassCastException -> 0x09ef }
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6     // Catch:{ ClassCastException -> 0x09ef }
            X.1rD r1 = r6.A0B     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 != 0) goto L_0x0a03
            X.1qy r9 = r6.getLayoutManager()     // Catch:{ ClassCastException -> 0x09ef }
            boolean r1 = r9 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0426
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r9     // Catch:{ ClassCastException -> 0x09ef }
            if (r9 == 0) goto L_0x0426
            X.6id r8 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            X.7vC r24 = new X.7vC     // Catch:{ ClassCastException -> 0x09ef }
            r1 = r24
            r1.<init>(r9, r10)     // Catch:{ ClassCastException -> 0x09ef }
            r12 = 0
            X.00H r1 = r8.A03     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r2 = r1.get()     // Catch:{ ClassCastException -> 0x09ef }
            X.1rX r2 = (X.C38581rX) r2     // Catch:{ ClassCastException -> 0x09ef }
            boolean r1 = r2.A01()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0423
            X.0ve r4 = r2.A01     // Catch:{ ClassCastException -> 0x09ef }
            X.0vf r2 = X.C18040vf.A01     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 9767(0x2627, float:1.3686E-41)
            boolean r1 = X.C18020vd.A05(r2, r4, r1)     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0423
            X.00H r1 = r8.A02     // Catch:{ ClassCastException -> 0x09ef }
            r32 = r1
            java.lang.Object r1 = r32.get()     // Catch:{ ClassCastException -> 0x09ef }
            X.6fy r1 = (X.C128426fy) r1     // Catch:{ ClassCastException -> 0x09ef }
            X.0vl r1 = r1.A01     // Catch:{ ClassCastException -> 0x09ef }
            android.content.SharedPreferences r2 = X.C17880vN.A0C(r1)     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.String r1 = "ai_search_transparency_banner_permanently_seen"
            boolean r1 = r2.getBoolean(r1, r12)     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 != 0) goto L_0x0423
            java.lang.Object r1 = r32.get()     // Catch:{ ClassCastException -> 0x09ef }
            X.6fy r1 = (X.C128426fy) r1     // Catch:{ ClassCastException -> 0x09ef }
            X.0vl r1 = r1.A01     // Catch:{ ClassCastException -> 0x09ef }
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r1)     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.String r13 = "ai_search_transparency_banner_timestamp_ms"
            r4 = 0
            long r22 = r1.getLong(r13, r4)     // Catch:{ ClassCastException -> 0x09ef }
            X.00H r1 = r8.A04     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = r1.get()     // Catch:{ ClassCastException -> 0x09ef }
            X.11P r1 = (X.AnonymousClass11P) r1     // Catch:{ ClassCastException -> 0x09ef }
            long r1 = X.AnonymousClass11P.A01(r1)     // Catch:{ ClassCastException -> 0x09ef }
            r20 = 0
            int r11 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0373
            long r18 = r1 - r22
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 < 0) goto L_0x0373
            goto L_0x0423
        L_0x0373:
            r4 = 2131436438(0x7f0b2396, float:1.8494746E38)
            android.view.ViewStub r5 = X.AnonymousClass3MW.A0F(r15, r4)     // Catch:{ ClassCastException -> 0x09ef }
            if (r5 == 0) goto L_0x040f
            android.view.ViewParent r4 = r5.getParent()     // Catch:{ ClassCastException -> 0x09ef }
            if (r4 == 0) goto L_0x040f
            android.view.View r11 = r5.inflate()     // Catch:{ ClassCastException -> 0x09ef }
            if (r11 == 0) goto L_0x040f
            android.content.Context r14 = X.AnonymousClass3MY.A04(r11)     // Catch:{ ClassCastException -> 0x09ef }
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable     // Catch:{ ClassCastException -> 0x09ef }
            r10.<init>()     // Catch:{ ClassCastException -> 0x09ef }
            android.content.res.Resources r5 = r14.getResources()     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 2131169405(0x7f07107d, float:1.795314E38)
            float r4 = X.AnonymousClass3MW.A00(r5, r4)     // Catch:{ ClassCastException -> 0x09ef }
            r10.setCornerRadius(r4)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.res.Resources r5 = r14.getResources()     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 2131169335(0x7f071037, float:1.7952997E38)
            int r5 = r5.getDimensionPixelSize(r4)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 2131103166(0x7f060dbe, float:1.781879E38)
            int r4 = X.C19740yt.A00(r14, r4)     // Catch:{ ClassCastException -> 0x09ef }
            r10.setStroke(r5, r4)     // Catch:{ ClassCastException -> 0x09ef }
            r11.setBackground(r10)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            com.whatsapp.TextEmojiLabel r10 = X.AnonymousClass3MX.A0W(r11, r4)     // Catch:{ ClassCastException -> 0x09ef }
            X.0ve r4 = r10.getAbProps()     // Catch:{ ClassCastException -> 0x09ef }
            X.AnonymousClass3Ma.A1L(r4, r10)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r5 = X.AnonymousClass3MY.A04(r10)     // Catch:{ ClassCastException -> 0x09ef }
            X.00H r4 = r8.A01     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r4 = r4.get()     // Catch:{ ClassCastException -> 0x09ef }
            X.1np r4 = (X.C36401np) r4     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object[] r14 = X.AnonymousClass3MW.A1a()     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.String r30 = "learn-more"
            r14[r12] = r30     // Catch:{ ClassCastException -> 0x09ef }
            r12 = 2131886624(0x7f120220, float:1.9407832E38)
            java.lang.String r29 = r5.getString(r12, r14)     // Catch:{ ClassCastException -> 0x09ef }
            r31 = 2131103158(0x7f060db6, float:1.7818774E38)
            r14 = 40
            X.AkK r12 = new X.AkK     // Catch:{ ClassCastException -> 0x09ef }
            r12.<init>(r8, r5, r14)     // Catch:{ ClassCastException -> 0x09ef }
            r26 = r4
            r27 = r5
            r28 = r12
            android.text.SpannableStringBuilder r4 = r26.A06(r27, r28, r29, r30, r31)     // Catch:{ ClassCastException -> 0x09ef }
            r10.setText(r4)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 2131430060(0x7f0b0aac, float:1.848181E38)
            android.view.View r5 = r11.findViewById(r4)     // Catch:{ ClassCastException -> 0x09ef }
            r19 = 1
            X.78E r4 = new X.78E     // Catch:{ ClassCastException -> 0x09ef }
            r14 = r4
            r16 = r11
            r17 = r8
            r18 = r24
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ ClassCastException -> 0x09ef }
            r5.setOnClickListener(r4)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x040f:
            int r4 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r4 != 0) goto L_0x0422
            java.lang.Object r4 = r32.get()     // Catch:{ ClassCastException -> 0x09ef }
            X.6fy r4 = (X.C128426fy) r4     // Catch:{ ClassCastException -> 0x09ef }
            X.0vl r4 = r4.A01     // Catch:{ ClassCastException -> 0x09ef }
            android.content.SharedPreferences$Editor r4 = X.C17890vO.A0A(r4)     // Catch:{ ClassCastException -> 0x09ef }
            X.C17880vN.A1D(r4, r13, r1)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0422:
            r10 = 2
        L_0x0423:
            r9.A1T(r10)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0426:
            X.1UD r1 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            X.0ve r2 = r1.A00     // Catch:{ ClassCastException -> 0x09ef }
            X.0vf r10 = X.C18040vf.A01     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 11245(0x2bed, float:1.5758E-41)
            int r1 = X.C18020vd.A00(r10, r2, r1)     // Catch:{ ClassCastException -> 0x09ef }
            long r4 = (long) r1     // Catch:{ ClassCastException -> 0x09ef }
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0463
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ ClassCastException -> 0x09ef }
            long r1 = r1 + r4
            X.7vD r4 = new X.7vD     // Catch:{ ClassCastException -> 0x09ef }
            r4.<init>(r0, r1)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0443:
            X.0vk r4 = (X.C18090vk) r4     // Catch:{ ClassCastException -> 0x09ef }
            X.1rX r0 = r0.A03     // Catch:{ ClassCastException -> 0x09ef }
            X.0ve r1 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r0 = 12612(0x3144, float:1.7673E-41)
            int r0 = X.C18020vd.A00(r10, r1, r0)     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Integer r10 = X.AnonymousClass00R.A00     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassCastException -> 0x09ef }
            X.3Wm r0 = new X.3Wm     // Catch:{ ClassCastException -> 0x09ef }
            r8 = r0
            r9 = r25
            r12 = r7
            r13 = r4
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ ClassCastException -> 0x09ef }
            r6.setAdapter(r0)     // Catch:{ ClassCastException -> 0x09ef }
            goto L_0x0466
        L_0x0463:
            X.7xA r4 = X.AnonymousClass7xA.A00     // Catch:{ ClassCastException -> 0x09ef }
            goto L_0x0443
        L_0x0466:
            return
        L_0x0467:
            boolean r1 = r0 instanceof X.AnonymousClass660     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x04dd
            X.660 r0 = (X.AnonymousClass660) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            java.util.List r2 = (java.util.List) r2     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 0
            X.C18070vi.A0d(r2, r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.6F7 r9 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            com.google.android.material.chip.ChipGroup r8 = r9.A01     // Catch:{ ClassCastException -> 0x09ef }
            r8.removeAllViews()     // Catch:{ ClassCastException -> 0x09ef }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0482:
            boolean r0 = r10.hasNext()     // Catch:{ ClassCastException -> 0x09ef }
            if (r0 == 0) goto L_0x04d9
            java.lang.Object r1 = r10.next()     // Catch:{ ClassCastException -> 0x09ef }
            X.77Z r1 = (X.AnonymousClass77Z) r1     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r0 = r9.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            com.google.android.material.chip.Chip r7 = new com.google.android.material.chip.Chip     // Catch:{ ClassCastException -> 0x09ef }
            r7.<init>(r0)     // Catch:{ ClassCastException -> 0x09ef }
            int r0 = r1.A03     // Catch:{ ClassCastException -> 0x09ef }
            r7.setId(r0)     // Catch:{ ClassCastException -> 0x09ef }
            int r0 = r1.A02     // Catch:{ ClassCastException -> 0x09ef }
            r7.setText(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r0 = 1
            r7.setClickable(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r0 = 42
            X.C90024dP.A00(r7, r4, r1, r0)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r6 = r9.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            int r1 = r1.A00     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r0 = r9.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            r5 = 2130971109(0x7f0409e5, float:1.7550947E38)
            r2 = 2131102436(0x7f060ae4, float:1.781731E38)
            int r0 = X.AnonymousClass1YL.A00(r0, r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.AnonymousClass6F9.A02(r6, r7, r1, r0)     // Catch:{ ClassCastException -> 0x09ef }
            r0 = 2131102435(0x7f060ae3, float:1.7817308E38)
            r7.setChipIconTintResource(r0)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r1 = r9.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r0 = r9.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            X.C72463Mc.A0w(r0, r1, r7, r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.C108995ce.A16(r7)     // Catch:{ ClassCastException -> 0x09ef }
            r8.addView(r7)     // Catch:{ ClassCastException -> 0x09ef }
            goto L_0x0482
        L_0x04d9:
            X.C108995ce.A0u(r9)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x04dd:
            boolean r1 = r0 instanceof X.AnonymousClass65t     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x059b
            X.65t r0 = (X.AnonymousClass65t) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            java.util.List r2 = (java.util.List) r2     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 49
            X.7SB r6 = X.AnonymousClass7SB.A00(r3, r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 0
            X.C18070vi.A0d(r2, r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.5fL r0 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            X.6F3 r0 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            r7 = 1
            com.google.android.material.chip.ChipGroup r5 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r5.removeAllViews()     // Catch:{ ClassCastException -> 0x09ef }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0501:
            boolean r1 = r9.hasNext()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0597
            java.lang.Object r8 = r9.next()     // Catch:{ ClassCastException -> 0x09ef }
            X.77M r8 = (X.AnonymousClass77M) r8     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r1 = X.AnonymousClass3MY.A04(r0)     // Catch:{ ClassCastException -> 0x09ef }
            com.google.android.material.chip.Chip r4 = A00(r1, r8)     // Catch:{ ClassCastException -> 0x09ef }
            r2 = 23
            X.4dV r1 = new X.4dV     // Catch:{ ClassCastException -> 0x09ef }
            r1.<init>((java.lang.Object) r4, (java.lang.Object) r8, (java.lang.Object) r6, (int) r2)     // Catch:{ ClassCastException -> 0x09ef }
            r4.setOnClickListener(r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.76v r2 = r8.A05     // Catch:{ ClassCastException -> 0x09ef }
            boolean r1 = r2.A02()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0592
            android.content.res.Resources r8 = X.AnonymousClass000.A0Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131893133(0x7f121b8d, float:1.9421034E38)
            java.lang.String r12 = r8.getString(r1)     // Catch:{ ClassCastException -> 0x09ef }
            r0.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            android.graphics.Typeface r11 = X.C43421zm.A00()     // Catch:{ ClassCastException -> 0x09ef }
            android.content.res.Resources r8 = X.AnonymousClass000.A0Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131103277(0x7f060e2d, float:1.7819016E38)
            int r13 = r8.getColor(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.res.Resources r8 = X.AnonymousClass000.A0Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131103394(0x7f060ea2, float:1.7819253E38)
            int r14 = r8.getColor(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.res.Resources r8 = X.AnonymousClass000.A0Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131169003(0x7f070eeb, float:1.7952324E38)
            int r15 = r8.getDimensionPixelSize(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.res.Resources r8 = X.AnonymousClass000.A0Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131168779(0x7f070e0b, float:1.795187E38)
            int r16 = r8.getDimensionPixelSize(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.res.Resources r8 = X.AnonymousClass000.A0Y(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131168786(0x7f070e12, float:1.7951884E38)
            int r17 = r8.getDimensionPixelSize(r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.5dS r10 = new X.5dS     // Catch:{ ClassCastException -> 0x09ef }
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ ClassCastException -> 0x09ef }
            r4.setCloseIconVisible((boolean) r7)     // Catch:{ ClassCastException -> 0x09ef }
            r4.setCloseIcon(r10)     // Catch:{ ClassCastException -> 0x09ef }
            int r1 = r10.A00     // Catch:{ ClassCastException -> 0x09ef }
            float r1 = (float) r1     // Catch:{ ClassCastException -> 0x09ef }
            r4.setCloseIconSize(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r8 = r0.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 1082130432(0x40800000, float:4.0)
            int r1 = X.C62762rw.A01(r8, r1)     // Catch:{ ClassCastException -> 0x09ef }
            float r1 = (float) r1     // Catch:{ ClassCastException -> 0x09ef }
            r4.setCloseIconEndPadding(r1)     // Catch:{ ClassCastException -> 0x09ef }
            r2.A01()     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0592:
            r5.addView(r4)     // Catch:{ ClassCastException -> 0x09ef }
            goto L_0x0501
        L_0x0597:
            X.C108995ce.A0u(r0)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x059b:
            boolean r1 = r0 instanceof X.AnonymousClass663     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x061d
            X.663 r0 = (X.AnonymousClass663) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            java.util.List r2 = (java.util.List) r2     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 0
            X.C18070vi.A0d(r2, r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.5fM r1 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            X.6F5 r9 = r1.A01     // Catch:{ ClassCastException -> 0x09ef }
            com.google.android.material.chip.ChipGroup r8 = r9.A01     // Catch:{ ClassCastException -> 0x09ef }
            r8.removeAllViews()     // Catch:{ ClassCastException -> 0x09ef }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ ClassCastException -> 0x09ef }
        L_0x05b8:
            boolean r1 = r11.hasNext()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0612
            java.lang.Object r2 = r11.next()     // Catch:{ ClassCastException -> 0x09ef }
            X.4cQ r2 = (X.C89414cQ) r2     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r1 = r9.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            com.google.android.material.chip.Chip r7 = new com.google.android.material.chip.Chip     // Catch:{ ClassCastException -> 0x09ef }
            r7.<init>(r1)     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.String r1 = r2.A02     // Catch:{ ClassCastException -> 0x09ef }
            r7.setText(r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 1
            r7.setClickable(r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 38
            X.C90024dP.A00(r7, r2, r4, r1)     // Catch:{ ClassCastException -> 0x09ef }
            int r10 = r2.A00     // Catch:{ ClassCastException -> 0x09ef }
            if (r10 == 0) goto L_0x05f4
            android.content.Context r6 = r9.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r5 = r9.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            r2 = 2130971109(0x7f0409e5, float:1.7550947E38)
            r1 = 2131102436(0x7f060ae4, float:1.781731E38)
            int r1 = X.AnonymousClass1YL.A00(r5, r2, r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.AnonymousClass6F9.A02(r6, r7, r10, r1)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x05f4:
            r1 = 2131102435(0x7f060ae3, float:1.7817308E38)
            r7.setChipIconTintResource(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r6 = r9.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r5 = r9.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            r2 = 2130971109(0x7f0409e5, float:1.7550947E38)
            r1 = 2131102436(0x7f060ae4, float:1.781731E38)
            X.C72463Mc.A0w(r5, r6, r7, r2, r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.C108995ce.A16(r7)     // Catch:{ ClassCastException -> 0x09ef }
            r8.addView(r7)     // Catch:{ ClassCastException -> 0x09ef }
            goto L_0x05b8
        L_0x0612:
            X.C108995ce.A0u(r9)     // Catch:{ ClassCastException -> 0x09ef }
            X.1og r2 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 3
            r0 = 5
            r2.A00(r1, r0)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x061d:
            boolean r1 = r0 instanceof X.AnonymousClass66K     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0631
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.21V r2 = (X.AnonymousClass21V) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.66K r0 = (X.AnonymousClass66K) r0     // Catch:{ ClassCastException -> 0x09ef }
            X.5xG r5 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r5.setMessage(r2)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 0
            goto L_0x080c
        L_0x0631:
            boolean r1 = r0 instanceof X.AnonymousClass667     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0648
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.21i r2 = (X.C438921i) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.667 r0 = (X.AnonymousClass667) r0     // Catch:{ ClassCastException -> 0x09ef }
            X.6Fe r5 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r5.A0A(r2, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 49
            goto L_0x0812
        L_0x0648:
            boolean r1 = r0 instanceof X.AnonymousClass66B     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0661
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.22l r2 = (X.C441822l) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.66B r0 = (X.AnonymousClass66B) r0     // Catch:{ ClassCastException -> 0x09ef }
            X.C18070vi.A0h(r2, r6)     // Catch:{ ClassCastException -> 0x09ef }
            X.6FQ r5 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r5.A0A(r2, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 5
            goto L_0x080c
        L_0x0661:
            boolean r1 = r0 instanceof X.AnonymousClass666     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0678
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.22l r2 = (X.C441822l) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.666 r0 = (X.AnonymousClass666) r0     // Catch:{ ClassCastException -> 0x09ef }
            X.6FP r5 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r5.A0A(r2, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 48
            goto L_0x0812
        L_0x0678:
            boolean r1 = r0 instanceof X.AnonymousClass66E     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x068f
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.22l r2 = (X.C441822l) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.66E r0 = (X.AnonymousClass66E) r0     // Catch:{ ClassCastException -> 0x09ef }
            X.6FR r5 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r5.A0A(r2, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 8
            goto L_0x080c
        L_0x068f:
            boolean r1 = r0 instanceof X.AnonymousClass66A     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x06b0
            java.lang.Object r5 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r5 = (X.AnonymousClass206) r5     // Catch:{ ClassCastException -> 0x09ef }
            X.21V r5 = (X.AnonymousClass21V) r5     // Catch:{ ClassCastException -> 0x09ef }
            X.66A r0 = (X.AnonymousClass66A) r0     // Catch:{ ClassCastException -> 0x09ef }
            X.6Fk r4 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r4.A08(r5, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 3
            X.AnonymousClass3MZ.A1P(r4, r0, r5, r1)     // Catch:{ ClassCastException -> 0x09ef }
            r2 = 4
            X.786 r1 = new X.786     // Catch:{ ClassCastException -> 0x09ef }
            r1.<init>(r0, r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            r4.setThumbnailOnClickListener(r1)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x06b0:
            boolean r1 = r0 instanceof X.AnonymousClass66D     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x06c6
            X.66D r0 = (X.AnonymousClass66D) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.210 r2 = (X.AnonymousClass210) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.6Fa r5 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r5.A08(r2, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 7
            goto L_0x080c
        L_0x06c6:
            boolean r1 = r0 instanceof X.AnonymousClass668     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x06dc
            X.668 r0 = (X.AnonymousClass668) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.210 r2 = (X.AnonymousClass210) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.6Fl r5 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r5.A0A(r2, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 1
            goto L_0x080c
        L_0x06dc:
            boolean r1 = r0 instanceof X.AnonymousClass669     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x06f2
            X.669 r0 = (X.AnonymousClass669) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.218 r2 = (X.AnonymousClass218) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.6FS r5 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r5.A0A(r2, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 2
            goto L_0x080c
        L_0x06f2:
            boolean r1 = r0 instanceof X.AnonymousClass665     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x071e
            java.lang.Object r1 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r1 = (X.AnonymousClass206) r1     // Catch:{ ClassCastException -> 0x09ef }
            boolean r1 = r1 instanceof X.C442222p     // Catch:{ ClassCastException -> 0x09ef }
            X.665 r0 = (X.AnonymousClass665) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0713
            X.22p r2 = (X.C442222p) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.6FT r5 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r5.A0A(r2, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 46
            goto L_0x0812
        L_0x0713:
            X.22n r2 = (X.C442022n) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.6FT r5 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r5.A0B(r2, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 47
            goto L_0x0812
        L_0x071e:
            boolean r1 = r0 instanceof X.C1188965r     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x072c
            X.65r r0 = (X.C1188965r) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = r5.get(r2)     // Catch:{ ClassCastException -> 0x09ef }
            r0.A0H(r1, r6)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x072c:
            boolean r1 = r0 instanceof X.C42071xZ     // Catch:{ ClassCastException -> 0x09ef }
            r12 = 0
            if (r1 == 0) goto L_0x07aa
            android.app.Activity r1 = r3.A04     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0a03
            java.lang.Object r5 = r5.get(r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.1tN r5 = (X.C39621tN) r5     // Catch:{ ClassCastException -> 0x09ef }
            X.1BI r11 = r5.BTb()     // Catch:{ ClassCastException -> 0x09ef }
            boolean r1 = X.C22971Dz.A0d(r11)     // Catch:{ ClassCastException -> 0x09ef }
            r6 = 0
            if (r1 == 0) goto L_0x0770
            java.util.Map r1 = r3.A02     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0752
            java.lang.Object r6 = r1.get(r11)     // Catch:{ ClassCastException -> 0x09ef }
            X.6yE r6 = (X.C139106yE) r6     // Catch:{ ClassCastException -> 0x09ef }
            if (r6 != 0) goto L_0x0770
        L_0x0752:
            X.11P r10 = r3.A0J     // Catch:{ ClassCastException -> 0x09ef }
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11     // Catch:{ ClassCastException -> 0x09ef }
            X.AnonymousClass3Ma.A1N(r10, r12, r11)     // Catch:{ ClassCastException -> 0x09ef }
            r14 = 0
            r18 = r14
            r20 = r14
            r22 = r14
            r24 = r14
            X.2sx r9 = new X.2sx     // Catch:{ ClassCastException -> 0x09ef }
            r13 = r12
            r16 = r14
            r9.<init>(r10, r11, r12, r13, r14, r16, r18, r20, r22, r24)     // Catch:{ ClassCastException -> 0x09ef }
            X.6yE r6 = new X.6yE     // Catch:{ ClassCastException -> 0x09ef }
            r6.<init>(r9, r12)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0770:
            X.1xZ r0 = (X.C42071xZ) r0     // Catch:{ ClassCastException -> 0x09ef }
            X.0ve r7 = r3.A0M     // Catch:{ ClassCastException -> 0x09ef }
            X.6q8 r1 = r4.A14     // Catch:{ ClassCastException -> 0x09ef }
            X.1Dg r4 = r1.A02     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = r4.A06()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0794
            java.lang.Object r1 = r4.A06()     // Catch:{ ClassCastException -> 0x09ef }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = r1.second     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0794
            java.lang.Object r1 = r4.A06()     // Catch:{ ClassCastException -> 0x09ef }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ ClassCastException -> 0x09ef }
            int r1 = X.C108965cb.A00(r1)     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 > 0) goto L_0x079f
        L_0x0794:
            X.0vf r4 = X.C18040vf.A01     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 442(0x1ba, float:6.2E-43)
            boolean r1 = X.C18020vd.A05(r4, r7, r1)     // Catch:{ ClassCastException -> 0x09ef }
            r13 = 1
            if (r1 == 0) goto L_0x07a0
        L_0x079f:
            r13 = 0
        L_0x07a0:
            r9 = 0
            r11 = 0
            r7 = r0
            r8 = r5
            r10 = r6
            r12 = r2
            r7.A0I(r8, r9, r10, r11, r12, r13)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x07aa:
            boolean r1 = r0 instanceof X.AnonymousClass66J     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x07f8
            java.lang.Object r4 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ ClassCastException -> 0x09ef }
            X.1rX r6 = r3.A0O     // Catch:{ ClassCastException -> 0x09ef }
            X.0ve r5 = r6.A01     // Catch:{ ClassCastException -> 0x09ef }
            X.0vf r2 = X.C18040vf.A01     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 8294(0x2066, float:1.1622E-41)
            boolean r1 = X.C18020vd.A05(r2, r5, r1)     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x07c8
            boolean r1 = r6.A01()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 != 0) goto L_0x07e0
        L_0x07c8:
            r1 = 8211(0x2013, float:1.1506E-41)
            boolean r1 = X.C18020vd.A05(r2, r5, r1)     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x07d6
            boolean r1 = r6.A01()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 != 0) goto L_0x07e0
        L_0x07d6:
            X.66J r0 = (X.AnonymousClass66J) r0     // Catch:{ ClassCastException -> 0x09ef }
            int r2 = r4.intValue()     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2
            if (r2 != r1) goto L_0x07e6
            goto L_0x07e2
        L_0x07e0:
            r12 = 1
            goto L_0x07d6
        L_0x07e2:
            r2 = 2131895501(0x7f1224cd, float:1.9425837E38)
            goto L_0x07f0
        L_0x07e6:
            boolean r1 = r3.A0X     // Catch:{ ClassCastException -> 0x09ef }
            r2 = 2131895498(0x7f1224ca, float:1.942583E38)
            if (r1 == 0) goto L_0x07f0
            r2 = 2131895500(0x7f1224cc, float:1.9425835E38)
        L_0x07f0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ ClassCastException -> 0x09ef }
            r0.A0H(r4, r1, r12)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x07f8:
            boolean r1 = r0 instanceof X.AnonymousClass66C     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x081b
            X.66C r0 = (X.AnonymousClass66C) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r2 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.22H r2 = (X.AnonymousClass22H) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.6Fd r5 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r5.A0A(r2, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 6
        L_0x080c:
            X.786 r1 = new X.786     // Catch:{ ClassCastException -> 0x09ef }
            r1.<init>(r0, r2, r4)     // Catch:{ ClassCastException -> 0x09ef }
            goto L_0x0817
        L_0x0812:
            X.4dP r1 = new X.4dP     // Catch:{ ClassCastException -> 0x09ef }
            r1.<init>(r0, r2, r4)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0817:
            r5.setOnClickListener(r1)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x081b:
            boolean r1 = r0 instanceof X.AnonymousClass66I     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0868
            X.66I r0 = (X.AnonymousClass66I) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = r5.get(r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.6FF r1 = (X.AnonymousClass6FF) r1     // Catch:{ ClassCastException -> 0x09ef }
            X.0vk r5 = r1.A00     // Catch:{ ClassCastException -> 0x09ef }
            X.C18070vi.A0d(r5, r12)     // Catch:{ ClassCastException -> 0x09ef }
            android.view.View r4 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131432203(0x7f0b130b, float:1.8486157E38)
            com.whatsapp.WaTextView r1 = X.AnonymousClass3MW.A0T(r4, r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.C43421zm.A04(r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131432202(0x7f0b130a, float:1.8486155E38)
            android.view.View r2 = X.C18070vi.A05(r4, r1)     // Catch:{ ClassCastException -> 0x09ef }
            com.airbnb.lottie.LottieAnimationView r2 = (com.airbnb.lottie.LottieAnimationView) r2     // Catch:{ ClassCastException -> 0x09ef }
            X.C18070vi.A0d(r2, r12)     // Catch:{ ClassCastException -> 0x09ef }
            r0.A00 = r2     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2132017161(0x7f140009, float:1.9672593E38)
            r2.setAnimation((int) r1)     // Catch:{ ClassCastException -> 0x09ef }
            com.airbnb.lottie.LottieAnimationView r1 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0861
            r0 = 1060320051(0x3f333333, float:0.7)
            r1.setSpeed(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 15
            X.4dT r0 = new X.4dT     // Catch:{ ClassCastException -> 0x09ef }
            r0.<init>((java.lang.Object) r5, (int) r1)     // Catch:{ ClassCastException -> 0x09ef }
            r4.setOnClickListener(r0)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x0861:
            java.lang.String r0 = "animation"
            X.C18070vi.A11(r0)     // Catch:{ ClassCastException -> 0x09ef }
            r0 = 0
            throw r0     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0868:
            boolean r1 = r0 instanceof X.AnonymousClass66F     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x08b9
            java.lang.Object r5 = r5.get(r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.6FK r5 = (X.AnonymousClass6FK) r5     // Catch:{ ClassCastException -> 0x09ef }
            X.66F r0 = (X.AnonymousClass66F) r0     // Catch:{ ClassCastException -> 0x09ef }
            android.app.Activity r8 = r3.A04     // Catch:{ ClassCastException -> 0x09ef }
            X.0vb r7 = r3.A0L     // Catch:{ ClassCastException -> 0x09ef }
            X.733 r6 = r3.A0H     // Catch:{ ClassCastException -> 0x09ef }
            X.C18070vi.A0j(r7, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r9 = 26
            X.78E r4 = new X.78E     // Catch:{ ClassCastException -> 0x09ef }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ ClassCastException -> 0x09ef }
            X.1E7 r6 = r5.A00     // Catch:{ ClassCastException -> 0x09ef }
            android.view.View r5 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            r5.setOnClickListener(r4)     // Catch:{ ClassCastException -> 0x09ef }
            X.3Kk r2 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131432903(0x7f0b15c7, float:1.8487577E38)
            X.1xh r4 = X.C42141xh.A01(r5, r2, r1)     // Catch:{ ClassCastException -> 0x09ef }
            com.whatsapp.TextEmojiLabel r2 = r4.A01     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2
            r2.setImportantForAccessibility(r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.C43421zm.A04(r2)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = -1
            r4.A08(r6, r1)     // Catch:{ ClassCastException -> 0x09ef }
            boolean r0 = r0.A02     // Catch:{ ClassCastException -> 0x09ef }
            if (r0 == 0) goto L_0x0a03
            r0 = 2131431794(0x7f0b1172, float:1.8485327E38)
            android.view.View r1 = X.C18070vi.A05(r5, r0)     // Catch:{ ClassCastException -> 0x09ef }
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1     // Catch:{ ClassCastException -> 0x09ef }
            X.1Xz r0 = X.C27881Xz.OUTLINE     // Catch:{ ClassCastException -> 0x09ef }
            r1.setVariant(r0)     // Catch:{ ClassCastException -> 0x09ef }
            X.4D1 r0 = X.AnonymousClass4D1.SMALL     // Catch:{ ClassCastException -> 0x09ef }
            r1.setSize(r0)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x08b9:
            boolean r1 = r0 instanceof X.C120856Fr     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x08e6
            java.lang.Object r6 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.77E r6 = (X.AnonymousClass77E) r6     // Catch:{ ClassCastException -> 0x09ef }
            X.6Fr r0 = (X.C120856Fr) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ ClassCastException -> 0x09ef }
            X.1Dg r1 = r4.A0d     // Catch:{ ClassCastException -> 0x09ef }
            boolean r5 = X.C108965cb.A1W(r1, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.C18070vi.A0d(r6, r12)     // Catch:{ ClassCastException -> 0x09ef }
            android.widget.TextView r2 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.String r1 = r6.A03     // Catch:{ ClassCastException -> 0x09ef }
            r2.setText(r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.widget.LinearLayout r4 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            r2 = 6
            X.789 r1 = new X.789     // Catch:{ ClassCastException -> 0x09ef }
            r1.<init>(r0, r6, r2, r5)     // Catch:{ ClassCastException -> 0x09ef }
            r4.setOnClickListener(r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.C42491yG.A02(r4)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x08e6:
            boolean r1 = r0 instanceof X.AnonymousClass661     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x08fb
            X.661 r0 = (X.AnonymousClass661) r0     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.Object r1 = X.C108955ca.A0o(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.6sa r1 = (X.C135676sa) r1     // Catch:{ ClassCastException -> 0x09ef }
            X.C18070vi.A0d(r1, r12)     // Catch:{ ClassCastException -> 0x09ef }
            X.5gC r0 = r0.A00     // Catch:{ ClassCastException -> 0x09ef }
            r0.A00(r1)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x08fb:
            boolean r1 = r0 instanceof X.AnonymousClass66H     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 == 0) goto L_0x0a03
            java.lang.Object r1 = r5.get(r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.6FJ r1 = (X.AnonymousClass6FJ) r1     // Catch:{ ClassCastException -> 0x09ef }
            X.66H r0 = (X.AnonymousClass66H) r0     // Catch:{ ClassCastException -> 0x09ef }
            X.1E7 r8 = r1.A00     // Catch:{ ClassCastException -> 0x09ef }
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3MZ.A0x(r8)     // Catch:{ ClassCastException -> 0x09ef }
            if (r4 == 0) goto L_0x0a03
            X.3Kk r2 = r0.A02     // Catch:{ ClassCastException -> 0x09ef }
            android.view.View r9 = r0.A01     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131432903(0x7f0b15c7, float:1.8487577E38)
            X.1xh r2 = X.C42141xh.A01(r9, r2, r1)     // Catch:{ ClassCastException -> 0x09ef }
            com.whatsapp.TextEmojiLabel r11 = r2.A01     // Catch:{ ClassCastException -> 0x09ef }
            X.C43421zm.A04(r11)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = -1
            r2.A08(r8, r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 1
            X.1zB[] r6 = new X.C43061zB[r1]     // Catch:{ ClassCastException -> 0x09ef }
            r5 = 16
            r2 = 2131888887(0x7f120af7, float:1.9412422E38)
            X.1zB r1 = new X.1zB     // Catch:{ ClassCastException -> 0x09ef }
            r1.<init>(r5, r2)     // Catch:{ ClassCastException -> 0x09ef }
            r6[r12] = r1     // Catch:{ ClassCastException -> 0x09ef }
            X.AnonymousClass1Y5.A0B(r9, r6)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 43
            X.C90024dP.A00(r9, r0, r8, r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131433800(0x7f0b1948, float:1.8489396E38)
            android.view.View r6 = r9.findViewById(r1)     // Catch:{ ClassCastException -> 0x09ef }
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r6 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r6     // Catch:{ ClassCastException -> 0x09ef }
            r0.A00 = r6     // Catch:{ ClassCastException -> 0x09ef }
            r7 = 1
            if (r6 == 0) goto L_0x0988
            X.1pZ r1 = r0.A05     // Catch:{ ClassCastException -> 0x09ef }
            r1.A07(r6, r8)     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.String r1 = "com.whatsapp.conversationslist.ConversationsFragment"
            r2.append(r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.1BI r1 = r8.A0J     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.String r1 = X.C22971Dz.A06(r1)     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.String r1 = X.AnonymousClass000.A0y(r1, r2)     // Catch:{ ClassCastException -> 0x09ef }
            X.AnonymousClass1Xr.A04(r6, r1)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r10 = r6.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            r5 = 2131896787(0x7f1229d3, float:1.9428445E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.CharSequence r1 = r11.getText()     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.String r5 = X.C17880vN.A0q(r10, r1, r2, r12, r5)     // Catch:{ ClassCastException -> 0x09ef }
            android.content.Context r2 = r6.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131896788(0x7f1229d4, float:1.9428447E38)
            java.lang.String r2 = r2.getString(r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 0
            X.AnonymousClass1Y5.A08(r6, r5, r2, r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 44
            X.C90024dP.A00(r6, r8, r0, r1)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x0988:
            r1 = 2131429026(0x7f0b06a2, float:1.8479713E38)
            com.whatsapp.wds.components.button.WDSButton r5 = X.AnonymousClass3MW.A0r(r9, r1)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 2131435885(0x7f0b216d, float:1.8493625E38)
            android.widget.TextView r6 = X.C72453Mb.A0W(r9, r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.1pj r1 = r0.A03     // Catch:{ ClassCastException -> 0x09ef }
            boolean r1 = r1.A0P(r4)     // Catch:{ ClassCastException -> 0x09ef }
            r4 = 8
            if (r1 == 0) goto L_0x09b7
            android.content.Context r1 = r9.getContext()     // Catch:{ ClassCastException -> 0x09ef }
            r0 = 2131887210(0x7f12046a, float:1.940902E38)
            X.AnonymousClass3MY.A0x(r1, r6, r0)     // Catch:{ ClassCastException -> 0x09ef }
            r6.setSingleLine(r12)     // Catch:{ ClassCastException -> 0x09ef }
            r0 = 2
            r6.setMaxLines(r0)     // Catch:{ ClassCastException -> 0x09ef }
            if (r5 == 0) goto L_0x0a03
            r5.setVisibility(r4)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x09b7:
            X.1Me r1 = r0.A04     // Catch:{ ClassCastException -> 0x09ef }
            java.lang.String r2 = X.AnonymousClass3MX.A17(r1, r8)     // Catch:{ ClassCastException -> 0x09ef }
            X.C18070vi.A0X(r2)     // Catch:{ ClassCastException -> 0x09ef }
            int r1 = r2.length()     // Catch:{ ClassCastException -> 0x09ef }
            if (r1 <= 0) goto L_0x09d0
            r6.setText(r2)     // Catch:{ ClassCastException -> 0x09ef }
            r6.setSingleLine(r7)     // Catch:{ ClassCastException -> 0x09ef }
            r6.setMaxLines(r7)     // Catch:{ ClassCastException -> 0x09ef }
            goto L_0x09d3
        L_0x09d0:
            r6.setVisibility(r4)     // Catch:{ ClassCastException -> 0x09ef }
        L_0x09d3:
            if (r5 == 0) goto L_0x0a03
            r5.setVisibility(r12)     // Catch:{ ClassCastException -> 0x09ef }
            r1 = 45
            X.C90024dP.A00(r5, r0, r8, r1)     // Catch:{ ClassCastException -> 0x09ef }
            X.1zB[] r4 = new X.C43061zB[r7]     // Catch:{ ClassCastException -> 0x09ef }
            r2 = 16
            r1 = 2131888887(0x7f120af7, float:1.9412422E38)
            X.1zB r0 = new X.1zB     // Catch:{ ClassCastException -> 0x09ef }
            r0.<init>(r2, r1)     // Catch:{ ClassCastException -> 0x09ef }
            r4[r12] = r0     // Catch:{ ClassCastException -> 0x09ef }
            X.AnonymousClass1Y5.A0B(r5, r4)     // Catch:{ ClassCastException -> 0x09ef }
            return
        L_0x09ef:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00
            if (r0 == 0) goto L_0x0a03
            java.lang.String r0 = "SearchAdapter/Called notify on invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            androidx.recyclerview.widget.RecyclerView r2 = r3.A00
            r1 = 7
            X.7Qo r0 = new X.7Qo
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.post(r0)
        L_0x0a03:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112355lL.Bmc(X.1xT, int):void");
    }

    /* JADX WARNING: type inference failed for: r2v21, types: [X.5fc, android.view.View, X.6F6, X.6F9] */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.6Fm, X.5gN] */
    /* JADX WARNING: type inference failed for: r0v20, types: [X.6Fm, X.5gN] */
    /* JADX WARNING: type inference failed for: r2v33, types: [X.6FB, X.5g6, X.6FA, android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v12, types: [X.65q, X.1xT] */
    /* JADX WARNING: type inference failed for: r0v34, types: [X.6FQ, android.view.View, X.6Fm, X.5gN] */
    /* JADX WARNING: type inference failed for: r0v53, types: [X.6Fd, X.6Fm] */
    /* JADX WARNING: type inference failed for: r0v72, types: [android.view.View, X.6Fm, X.5gN, X.6Fl] */
    /* JADX WARNING: type inference failed for: r1v85, types: [X.6Fk, android.view.View, X.6Fm, X.5gN] */
    /* JADX WARNING: type inference failed for: r0v76, types: [X.6Fm, X.5gN] */
    /* JADX WARNING: type inference failed for: r0v78, types: [X.6Fm, X.5gN] */
    /* JADX WARNING: type inference failed for: r0v80, types: [X.6FR, android.view.View, X.6Fm, X.5gN] */
    /* JADX WARNING: type inference failed for: r0v82, types: [X.6FP, android.view.View, X.6Fm, X.5gN] */
    /* JADX WARNING: type inference failed for: r0v83, types: [X.6Fe, android.view.View, X.6Fm, X.5gN] */
    /* JADX WARNING: type inference failed for: r0v88, types: [X.6Fa, android.view.View, X.6Fm, X.5gN] */
    /* JADX WARNING: type inference failed for: r2v63, types: [X.5fc, android.view.View, X.6F7, X.6F9] */
    /* JADX WARNING: type inference failed for: r2v64, types: [X.5fc, android.view.View, java.lang.Object, X.6F9, X.6F8] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x054c, code lost:
        return new X.AnonymousClass66K(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0567, code lost:
        return new X.AnonymousClass66A(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e8, code lost:
        return new X.AnonymousClass66K(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0283, code lost:
        r1 = X.C42011xT.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0296, code lost:
        return new X.C42011xT(X.AnonymousClass3MX.A0B(X.AnonymousClass3MZ.A0D(r0), r0, 2131625401, false));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ X.C42011xT BqY(android.view.ViewGroup r24, int r25) {
        /*
            r23 = this;
            r1 = r23
            X.6wQ r6 = r1.A0U
            r2 = 0
            r0 = r24
            X.C18070vi.A0d(r0, r2)
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r25
            r5 = r25 & r4
            int r2 = r25 >> 16
            r2 = r2 & r4
            int r4 = r2 + -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            X.1D6 r4 = X.AnonymousClass1D6.A00(r2, r4)
            java.lang.Object r2 = r4.first
            java.lang.Number r2 = (java.lang.Number) r2
            r2.intValue()
            int r4 = X.C108955ca.A09(r4)
            boolean r2 = X.C138036wQ.A00(r6, r4)
            if (r2 != 0) goto L_0x0627
            r2 = -1
            if (r3 == r2) goto L_0x0639
            r2 = 1
            if (r3 == r2) goto L_0x05fc
            r2 = 2
            if (r3 == r2) goto L_0x05b4
            r2 = 3
            if (r3 == r2) goto L_0x05b4
            r4 = 4
            if (r3 == r4) goto L_0x059b
            switch(r25) {
                case 6: goto L_0x0065;
                case 7: goto L_0x009f;
                case 8: goto L_0x00ba;
                case 9: goto L_0x00c8;
                case 10: goto L_0x00d6;
                case 11: goto L_0x00e9;
                case 12: goto L_0x0568;
                case 13: goto L_0x0579;
                case 14: goto L_0x0104;
                case 15: goto L_0x011f;
                case 16: goto L_0x013a;
                case 17: goto L_0x014e;
                case 18: goto L_0x0162;
                case 19: goto L_0x0180;
                case 20: goto L_0x019e;
                case 21: goto L_0x01b8;
                case 22: goto L_0x0086;
                case 23: goto L_0x01d4;
                case 24: goto L_0x01fd;
                case 25: goto L_0x05b4;
                case 26: goto L_0x0262;
                case 27: goto L_0x0283;
                case 28: goto L_0x0297;
                case 29: goto L_0x0297;
                case 30: goto L_0x0297;
                case 31: goto L_0x0297;
                case 32: goto L_0x0297;
                case 33: goto L_0x0297;
                case 34: goto L_0x0297;
                case 35: goto L_0x0297;
                case 36: goto L_0x041a;
                case 37: goto L_0x0297;
                case 38: goto L_0x042e;
                case 39: goto L_0x0297;
                case 40: goto L_0x0449;
                case 41: goto L_0x0297;
                case 42: goto L_0x0297;
                case 43: goto L_0x0467;
                case 44: goto L_0x0297;
                case 45: goto L_0x0297;
                case 46: goto L_0x049a;
                case 47: goto L_0x04b9;
                case 48: goto L_0x058a;
                case 49: goto L_0x04e7;
                case 50: goto L_0x050e;
                case 51: goto L_0x0520;
                case 52: goto L_0x0536;
                case 53: goto L_0x054d;
                default: goto L_0x0041;
            }
        L_0x0041:
            switch(r25) {
                case 99: goto L_0x05b4;
                case 100: goto L_0x0054;
                case 101: goto L_0x05e8;
                default: goto L_0x0044;
            }
        L_0x0044:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid viewType: "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r3)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0054:
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r1 = X.AnonymousClass3MY.A04(r0)
            X.5fL r0 = new X.5fL
            r0.<init>(r1)
            X.65t r12 = new X.65t
            r12.<init>(r0)
            return r12
        L_0x0065:
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r0 = r0.getContext()
            X.6F8 r2 = new X.6F8
            r2.<init>(r0)
            r2.A03()
            r1 = 15
            X.78d r0 = new X.78d
            r0.<init>((java.lang.Object) r2, (int) r1)
            r2.addOnLayoutChangeListener(r0)
            X.C108995ce.A0u(r2)
            X.65y r12 = new X.65y
            r12.<init>(r2)
            return r12
        L_0x0086:
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r0 = r0.getContext()
            X.6F7 r2 = new X.6F7
            r2.<init>(r0)
            r2.A03()
            r1 = -1
            r0 = -2
            X.AnonymousClass3Ma.A18(r2, r1, r0)
            X.660 r12 = new X.660
            r12.<init>(r2)
            return r12
        L_0x009f:
            android.content.Context r3 = r0.getContext()
            X.5jU r2 = r1.A0T
            X.1pb r1 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.6Fa r0 = new X.6Fa
            r0.<init>(r3, r1)
            r0.A03()
            X.C72473Md.A0y(r0)
            X.66D r12 = new X.66D
            r12.<init>(r2, r0)
            return r12
        L_0x00ba:
            X.5jU r2 = r1.A0T
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r0 = r0.getContext()
            X.6Fp r1 = new X.6Fp
            r1.<init>(r0)
            goto L_0x00e3
        L_0x00c8:
            X.5jU r2 = r1.A0T
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r0 = r0.getContext()
            com.whatsapp.search.views.itemviews.SearchMessageImageThumbView r1 = new com.whatsapp.search.views.itemviews.SearchMessageImageThumbView
            r1.<init>(r0)
            goto L_0x00e3
        L_0x00d6:
            X.5jU r2 = r1.A0T
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r0 = r0.getContext()
            com.whatsapp.search.views.itemviews.SearchMessageVideoThumbView r1 = new com.whatsapp.search.views.itemviews.SearchMessageVideoThumbView
            r1.<init>(r0)
        L_0x00e3:
            X.66K r12 = new X.66K
            r12.<init>(r2, r1)
            return r12
        L_0x00e9:
            X.5jU r3 = r1.A0T
            X.1pb r2 = r1.A0I
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r1 = r0.getContext()
            X.6Fe r0 = new X.6Fe
            r0.<init>(r1, r2)
            r0.A03()
            X.C72473Md.A0y(r0)
            X.667 r12 = new X.667
            r12.<init>(r3, r0)
            return r12
        L_0x0104:
            android.content.Context r3 = r0.getContext()
            X.5jU r2 = r1.A0T
            X.1pb r1 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.6FP r0 = new X.6FP
            r0.<init>(r3, r1)
            r0.A03()
            X.C72473Md.A0y(r0)
            X.666 r12 = new X.666
            r12.<init>(r2, r0)
            return r12
        L_0x011f:
            android.content.Context r3 = r0.getContext()
            X.5jU r2 = r1.A0T
            X.1pb r1 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.6FR r0 = new X.6FR
            r0.<init>(r3, r1)
            r0.A03()
            X.C72473Md.A0y(r0)
            X.66E r12 = new X.66E
            r12.<init>(r2, r0)
            return r12
        L_0x013a:
            android.content.Context r2 = r0.getContext()
            X.5jU r3 = r1.A0T
            X.1pb r1 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.6Fg r0 = new X.6Fg
            r0.<init>(r2, r1)
            r0.A03()
            goto L_0x0562
        L_0x014e:
            android.content.Context r2 = r0.getContext()
            X.5jU r3 = r1.A0T
            X.1pb r1 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.6Fj r0 = new X.6Fj
            r0.<init>(r2, r1)
            r0.A03()
            goto L_0x0562
        L_0x0162:
            android.content.Context r4 = r0.getContext()
            X.5jU r3 = r1.A0T
            X.1pb r2 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.6Ff r1 = new X.6Ff
            r1.<init>(r4, r2)
            r1.A03()
            r0 = 2131431134(0x7f0b0ede, float:1.8483989E38)
            r1.setId(r0)
            X.66A r12 = new X.66A
            r12.<init>(r3, r1)
            return r12
        L_0x0180:
            android.content.Context r3 = r0.getContext()
            X.5jU r2 = r1.A0T
            X.1pb r1 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.6Fl r0 = new X.6Fl
            r0.<init>(r3, r1)
            r0.A03()
            r0.A03()
            X.C72473Md.A0y(r0)
            X.668 r12 = new X.668
            r12.<init>(r2, r0)
            return r12
        L_0x019e:
            android.content.Context r4 = r0.getContext()
            X.5jU r3 = r1.A0T
            X.1pZ r2 = r1.A0G
            X.1pb r1 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.6FS r0 = new X.6FS
            r0.<init>(r4, r2, r1)
            X.C72473Md.A0y(r0)
            X.669 r12 = new X.669
            r12.<init>(r3, r0)
            return r12
        L_0x01b8:
            android.content.Context r5 = r0.getContext()
            X.68H r4 = r1.A0V
            X.5jU r3 = r1.A0T
            X.1pZ r2 = r1.A0G
            X.1pb r1 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.6FT r0 = new X.6FT
            r0.<init>(r5, r2, r1, r4)
            X.C72473Md.A0y(r0)
            X.665 r12 = new X.665
            r12.<init>(r3, r0)
            return r12
        L_0x01d4:
            X.1og r4 = r1.A0P
            X.6aK r2 = r1.A09
            java.util.List r1 = X.C42011xT.A0I
            X.C18070vi.A0j(r4, r2)
            android.content.Context r3 = r0.getContext()
            X.1na r0 = r2.A00
            X.1nZ r2 = r0.A01
            X.10E r0 = r0.A02
            X.00S r0 = r0.A1G
            java.lang.Object r1 = r0.get()
            X.1gj r1 = (X.C32151gj) r1
            X.5fM r0 = new X.5fM
            r0.<init>(r3, r1)
            X.C36241nZ.A20(r2, r0)
            X.663 r12 = new X.663
            r12.<init>(r4, r0)
            return r12
        L_0x01fd:
            X.5jU r6 = r1.A0T
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r5 = r0.getContext()
            r1 = 2131626794(0x7f0e0b2a, float:1.8880834E38)
            r0 = 0
            android.view.View r4 = android.view.View.inflate(r5, r1, r0)
            r8 = 2131895844(0x7f122624, float:1.9426532E38)
            r7 = 2131232234(0x7f0805ea, float:1.8080571E38)
            r3 = 2131231553(0x7f080341, float:1.807919E38)
            X.C42491yG.A02(r4)
            r0 = 2131431401(0x7f0b0fe9, float:1.848453E38)
            android.widget.ImageView r2 = X.AnonymousClass3MW.A0G(r4, r0)
            android.content.Context r1 = r4.getContext()
            int r0 = X.C72473Md.A06(r4)
            X.AnonymousClass4aX.A0B(r1, r2, r7, r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r2.setScaleType(r0)
            r2.setBackgroundResource(r3)
            r0 = 2131431404(0x7f0b0fec, float:1.8484536E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r4, r0)
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r4, r0)
            X.C43421zm.A04(r0)
            X.C43421zm.A04(r1)
            r1.setText(r8)
            r1 = 14
            X.4dT r0 = new X.4dT
            r0.<init>((java.lang.Object) r6, (int) r1)
            r4.setOnClickListener(r0)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r5)
            r0.addView(r4)
            X.65w r12 = new X.65w
            r12.<init>(r0)
            return r12
        L_0x0262:
            X.0ve r4 = r1.A0M
            r3 = 2662(0xa66, float:3.73E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r4, r3)
            if (r2 == 0) goto L_0x0283
            android.content.Context r3 = r0.getContext()
            X.5jU r2 = r1.A0T
            X.1pb r1 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.6Fd r0 = new X.6Fd
            r0.<init>(r3, r1)
            X.66C r12 = new X.66C
            r12.<init>(r2, r0)
            return r12
        L_0x0283:
            java.util.List r1 = X.C42011xT.A0I
            r3 = 0
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131625401(0x7f0e05b9, float:1.8878009E38)
            android.view.View r0 = X.AnonymousClass3MX.A0B(r2, r0, r1, r3)
            X.65p r12 = new X.65p
            r12.<init>(r0)
            return r12
        L_0x0297:
            X.6jD r4 = r1.A0E
            android.app.Activity r10 = r1.A04
            X.1pZ r14 = r1.A0G
            r2 = 0
            X.C18070vi.A0k(r10, r14)
            X.6am r1 = r4.A01
            X.10H r1 = r1.A00
            X.10E r5 = r1.A00
            X.0ve r17 = X.AnonymousClass10E.A8r(r5)
            X.1LU r18 = X.AnonymousClass3MY.A0Z(r5)
            X.1L9 r11 = X.AnonymousClass3MZ.A0N(r5)
            X.11C r16 = X.AnonymousClass3Ma.A0a(r5)
            X.00S r1 = r5.A5j
            java.lang.Object r1 = r1.get()
            X.1rS r1 = (X.C38541rS) r1
            X.129 r19 = X.AnonymousClass10E.AKP(r5)
            X.1M9 r13 = X.AnonymousClass10E.A4z(r5)
            X.1KB r12 = X.AnonymousClass10E.A12(r5)
            X.1o3 r15 = X.AnonymousClass3Ma.A0T(r5)
            X.6oK r9 = new X.6oK
            r20 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.0zA r5 = r4.A00
            boolean r1 = r5.A07()
            if (r1 == 0) goto L_0x02e8
            r5.A03()
            java.lang.String r0 = "create"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r0)
            throw r1
        L_0x02e8:
            switch(r25) {
                case 28: goto L_0x0362;
                case 29: goto L_0x02fb;
                case 30: goto L_0x0395;
                case 31: goto L_0x030d;
                case 32: goto L_0x03a6;
                case 33: goto L_0x031e;
                case 34: goto L_0x032f;
                case 35: goto L_0x0340;
                case 36: goto L_0x02eb;
                case 37: goto L_0x03bb;
                case 38: goto L_0x02eb;
                case 39: goto L_0x02eb;
                case 40: goto L_0x02eb;
                case 41: goto L_0x03cc;
                case 42: goto L_0x0351;
                case 43: goto L_0x02eb;
                case 44: goto L_0x03f4;
                case 45: goto L_0x0409;
                default: goto L_0x02eb;
            }
        L_0x02eb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid Business search viewType: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        L_0x02fb:
            android.view.LayoutInflater r3 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131624392(0x7f0e01c8, float:1.8875962E38)
            android.view.View r1 = r3.inflate(r1, r0, r2)
            r0 = 1
            X.5wA r12 = new X.5wA
            r12.<init>(r1, r0)
            return r12
        L_0x030d:
            android.view.LayoutInflater r3 = X.AnonymousClass3MY.A0B(r0)
            r1 = 2131624393(0x7f0e01c9, float:1.8875964E38)
            android.view.View r0 = X.AnonymousClass3MX.A0B(r3, r0, r1, r2)
            X.5w9 r12 = new X.5w9
            r12.<init>(r0)
            return r12
        L_0x031e:
            android.view.LayoutInflater r3 = X.AnonymousClass3MY.A0B(r0)
            r1 = 2131625455(0x7f0e05ef, float:1.8878118E38)
            android.view.View r0 = X.AnonymousClass3MX.A0B(r3, r0, r1, r2)
            X.5wF r12 = new X.5wF
            r12.<init>(r0)
            return r12
        L_0x032f:
            android.view.LayoutInflater r3 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131625456(0x7f0e05f0, float:1.887812E38)
            android.view.View r0 = r3.inflate(r1, r0, r2)
            X.5wA r12 = new X.5wA
            r12.<init>(r0, r2)
            return r12
        L_0x0340:
            android.view.LayoutInflater r3 = X.AnonymousClass3MY.A0B(r0)
            r1 = 2131625457(0x7f0e05f1, float:1.8878122E38)
            android.view.View r0 = X.AnonymousClass3MX.A0B(r3, r0, r1, r2)
            X.5wC r12 = new X.5wC
            r12.<init>(r0)
            return r12
        L_0x0351:
            android.view.LayoutInflater r3 = X.AnonymousClass3MY.A0B(r0)
            r1 = 2131626679(0x7f0e0ab7, float:1.88806E38)
            android.view.View r0 = X.AnonymousClass3MX.A0B(r3, r0, r1, r2)
            X.5wG r12 = new X.5wG
            r12.<init>(r0)
            return r12
        L_0x0362:
            java.util.List r1 = X.C42011xT.A0I
            X.0ve r8 = r4.A05
            X.0vb r7 = r4.A04
            X.1Lf r6 = r4.A02
            X.12E r5 = r4.A03
            X.00H r1 = r4.A06
            java.lang.Object r4 = X.C18070vi.A0E(r1)
            X.4Zt r4 = (X.C88454Zt) r4
            r1 = 7
            X.C18070vi.A0d(r4, r1)
            android.view.LayoutInflater r3 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131624397(0x7f0e01cd, float:1.8875973E38)
            android.view.View r13 = X.C108955ca.A0G(r3, r0, r1, r2)
            X.3lz r12 = new X.3lz
            r15 = r9
            r16 = r6
            r17 = r14
            r18 = r5
            r19 = r7
            r20 = r8
            r14 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            return r12
        L_0x0395:
            android.view.LayoutInflater r3 = X.AnonymousClass3MY.A0B(r0)
            r1 = 2131624391(0x7f0e01c7, float:1.887596E38)
            android.view.View r0 = X.C108955ca.A0G(r3, r0, r1, r2)
            X.5wH r12 = new X.5wH
            r12.<init>(r0, r9)
            return r12
        L_0x03a6:
            java.util.List r1 = X.C42011xT.A0I
            X.0ve r4 = r4.A05
            android.view.LayoutInflater r3 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131624394(0x7f0e01ca, float:1.8875966E38)
            android.view.View r0 = X.C108955ca.A0G(r3, r0, r1, r2)
            X.5wI r12 = new X.5wI
            r12.<init>(r0, r4)
            return r12
        L_0x03bb:
            android.view.LayoutInflater r3 = X.AnonymousClass3MY.A0B(r0)
            r1 = 2131624400(0x7f0e01d0, float:1.8875979E38)
            android.view.View r0 = X.C108955ca.A0G(r3, r0, r1, r2)
            X.5wE r12 = new X.5wE
            r12.<init>(r0)
            return r12
        L_0x03cc:
            java.util.List r1 = X.C42011xT.A0I
            X.0ve r7 = r4.A05
            X.0vb r6 = r4.A04
            X.1Lf r5 = r4.A02
            X.12E r4 = r4.A03
            android.view.LayoutInflater r3 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131624399(0x7f0e01cf, float:1.8875977E38)
            android.view.View r16 = X.C108955ca.A0G(r3, r0, r1, r2)
            X.3ly r12 = new X.3ly
            r15 = r12
            r17 = r9
            r18 = r5
            r19 = r14
            r20 = r4
            r21 = r6
            r22 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r12
        L_0x03f4:
            java.util.List r1 = X.C42011xT.A0I
            X.1Lf r4 = r4.A02
            android.view.LayoutInflater r3 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131624396(0x7f0e01cc, float:1.887597E38)
            android.view.View r0 = X.C108955ca.A0G(r3, r0, r1, r2)
            X.5wJ r12 = new X.5wJ
            r12.<init>(r0, r9, r4, r14)
            return r12
        L_0x0409:
            android.view.LayoutInflater r3 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131624401(0x7f0e01d1, float:1.887598E38)
            android.view.View r0 = r3.inflate(r1, r0, r2)
            X.5wD r12 = new X.5wD
            r12.<init>(r0)
            return r12
        L_0x041a:
            java.util.List r1 = X.C42011xT.A0I
            r3 = 0
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131625911(0x7f0e07b7, float:1.8879043E38)
            android.view.View r0 = X.AnonymousClass3MX.A0B(r2, r0, r1, r3)
            X.66I r12 = new X.66I
            r12.<init>(r0)
            return r12
        L_0x042e:
            java.util.List r2 = X.C42011xT.A0I
            boolean r5 = r1.A0Y
            X.3Kk r4 = r1.A0B
            boolean r3 = X.C108975cc.A1J(r4)
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131626808(0x7f0e0b38, float:1.8880863E38)
            android.view.View r0 = X.AnonymousClass3MX.A0B(r2, r0, r1, r3)
            X.66F r12 = new X.66F
            r12.<init>(r0, r4, r5)
            return r12
        L_0x0449:
            android.content.Context r3 = r0.getContext()
            X.5jU r2 = r1.A0T
            X.1pb r1 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.C18070vi.A0n(r3, r2, r1)
            X.6FQ r0 = new X.6FQ
            r0.<init>(r3, r1)
            r0.A03()
            X.C72473Md.A0y(r0)
            X.66B r12 = new X.66B
            r12.<init>(r2, r0)
            return r12
        L_0x0467:
            java.util.List r2 = X.C42011xT.A0I
            X.73Z r4 = r1.A0D
            X.6aJ r5 = r1.A08
            r3 = 0
            X.C18070vi.A0j(r4, r5)
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131626777(0x7f0e0b19, float:1.88808E38)
            android.view.View r3 = X.AnonymousClass3MX.A0B(r2, r0, r1, r3)
            X.1na r2 = r5.A00
            X.10E r0 = r2.A02
            X.10G r0 = r0.A00
            X.00S r0 = r0.A4O
            java.lang.Object r1 = r0.get()
            X.6zk r1 = (X.C139976zk) r1
            X.1nZ r0 = r2.A01
            X.00S r0 = r0.A1I
            java.lang.Object r0 = r0.get()
            X.2hn r0 = (X.C56642hn) r0
            X.6Fr r12 = new X.6Fr
            r12.<init>(r3, r0, r4, r1)
            return r12
        L_0x049a:
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r0 = X.AnonymousClass3MY.A04(r0)
            X.6FA r2 = new X.6FA
            r2.<init>(r0)
            r2.A00()
            r1 = -1
            r0 = -2
            X.AnonymousClass3Ma.A18(r2, r1, r0)
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.65q r12 = new X.65q
            r12.<init>(r2)
            r12.A00 = r2
            return r12
        L_0x04b9:
            X.6aL r2 = r1.A0A
            java.util.List r1 = X.C42011xT.A0I
            X.1na r3 = r2.A00
            X.10E r1 = r3.A02
            X.11P r7 = X.AnonymousClass10E.A6O(r1)
            X.00S r1 = r1.A14
            java.lang.Object r2 = r1.get()
            X.1UD r2 = (X.AnonymousClass1UD) r2
            X.1nZ r1 = r3.A01
            X.6id r5 = X.C36241nZ.A05(r1)
            X.1K1 r1 = r3.A00
            X.00S r1 = r1.A4n
            java.lang.Object r1 = r1.get()
            X.1rX r1 = (X.C38581rX) r1
            X.66G r12 = new X.66G
            r3 = r12
            r4 = r0
            r6 = r2
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r12
        L_0x04e7:
            java.util.List r2 = X.C42011xT.A0I
            X.1Me r7 = r1.A0F
            X.1pj r6 = r1.A0C
            X.3Kk r5 = r1.A0B
            X.1pZ r8 = r1.A0G
            X.5jU r1 = r1.A0T
            X.7Ej r9 = r1.A16
            X.C18070vi.A0o(r7, r6, r5)
            X.C18070vi.A0g(r8, r4, r9)
            r3 = 0
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131626825(0x7f0e0b49, float:1.8880897E38)
            android.view.View r4 = X.AnonymousClass3MX.A0B(r2, r0, r1, r3)
            X.66H r12 = new X.66H
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r12
        L_0x050e:
            X.5jU r2 = r1.A0T
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r1 = r0.getContext()
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.6FW r0 = new X.6FW
            r0.<init>(r1)
            goto L_0x0547
        L_0x0520:
            android.content.Context r2 = r0.getContext()
            X.5jU r3 = r1.A0T
            X.1pb r1 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.C18070vi.A0j(r2, r1)
            X.6Fh r0 = new X.6Fh
            r0.<init>(r2, r1)
            r0.A03()
            goto L_0x0562
        L_0x0536:
            X.5jU r2 = r1.A0T
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r1 = r0.getContext()
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.6FU r0 = new X.6FU
            r0.<init>(r1)
        L_0x0547:
            X.66K r12 = new X.66K
            r12.<init>(r2, r0)
            return r12
        L_0x054d:
            android.content.Context r2 = r0.getContext()
            X.5jU r3 = r1.A0T
            X.1pb r1 = r1.A0I
            java.util.List r0 = X.C42011xT.A0I
            X.C18070vi.A0j(r2, r1)
            X.6Fi r0 = new X.6Fi
            r0.<init>(r2, r1)
            r0.A03()
        L_0x0562:
            X.66A r12 = new X.66A
            r12.<init>(r3, r0)
            return r12
        L_0x0568:
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r1 = X.AnonymousClass3MY.A04(r0)
            X.5ff r0 = new X.5ff
            r0.<init>(r1)
            X.65u r12 = new X.65u
            r12.<init>(r0)
            return r12
        L_0x0579:
            android.view.LayoutInflater r2 = X.AnonymousClass3MY.A0B(r0)
            r1 = 2131626823(0x7f0e0b47, float:1.8880893E38)
            android.view.View r0 = X.AnonymousClass3MX.A09(r2, r0, r1)
            X.66J r12 = new X.66J
            r12.<init>(r0)
            return r12
        L_0x058a:
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r1 = X.AnonymousClass3MY.A04(r0)
            X.5gC r0 = new X.5gC
            r0.<init>(r1)
            X.661 r12 = new X.661
            r12.<init>(r0)
            return r12
        L_0x059b:
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r0 = r0.getContext()
            X.6F6 r2 = new X.6F6
            r2.<init>(r0)
            r2.A03()
            r1 = -1
            r0 = -2
            X.AnonymousClass3Ma.A18(r2, r1, r0)
            X.65z r12 = new X.65z
            r12.<init>(r2)
            return r12
        L_0x05b4:
            X.1zf r9 = X.C43351zf.A02
            r2 = 99
            if (r3 != r2) goto L_0x05bc
            X.1zf r9 = X.C43351zf.A01
        L_0x05bc:
            X.1pZ r6 = r1.A0G
            X.1pb r7 = r1.A0I
            X.5jU r2 = r1.A0T
            X.7Ej r8 = r2.A16
            X.1nz r3 = r1.A07
            java.util.List r2 = X.C42011xT.A0I
            android.content.Context r4 = r0.getContext()
            r10 = 0
            r2 = 0
            android.view.View r5 = X.C42071xZ.A00(r0, r2, r10)
            X.1xZ r12 = r3.A00(r4, r5, r6, r7, r8, r9, r10)
            X.0ve r3 = r1.A0M
            X.0vf r2 = X.C18040vf.A01
            r0 = 9528(0x2538, float:1.3352E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 != 0) goto L_0x05fb
            X.1Fv r0 = r1.A05
            r0.A05(r12)
            return r12
        L_0x05e8:
            java.util.List r1 = X.C42011xT.A0I
            r3 = 0
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131626830(0x7f0e0b4e, float:1.8880907E38)
            android.view.View r0 = X.AnonymousClass3MX.A0B(r2, r0, r1, r3)
            X.65x r12 = new X.65x
            r12.<init>(r0)
        L_0x05fb:
            return r12
        L_0x05fc:
            X.1rX r1 = r1.A0O
            boolean r2 = r1.A01()
            java.util.List r1 = X.C42011xT.A0I
            if (r2 == 0) goto L_0x0618
            r3 = 0
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r0)
            r1 = 2131626793(0x7f0e0b29, float:1.8880832E38)
            android.view.View r0 = X.AnonymousClass3MX.A0B(r2, r0, r1, r3)
            X.664 r12 = new X.664
            r12.<init>(r0)
            return r12
        L_0x0618:
            android.content.Context r1 = X.AnonymousClass3MY.A04(r0)
            X.5ff r0 = new X.5ff
            r0.<init>(r1)
            X.65v r12 = new X.65v
            r12.<init>(r0)
            return r12
        L_0x0627:
            X.0vl r1 = r6.A00
            java.lang.Object r1 = r1.getValue()
            X.20Z r1 = (X.AnonymousClass20Z) r1
            r1.A00(r4)
            java.util.List r1 = X.C42011xT.A0I
            android.content.Context r2 = r0.getContext()
            goto L_0x063f
        L_0x0639:
            android.content.Context r2 = r0.getContext()
            java.util.List r0 = X.C42011xT.A0I
        L_0x063f:
            android.view.View r1 = new android.view.View
            r1.<init>(r2)
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.65o r12 = new X.65o
            r12.<init>(r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112355lL.BqY(android.view.ViewGroup, int):X.1xT");
    }

    public boolean CM0() {
        C111295jU r2 = this.A0T;
        if (C108965cb.A1W(r2.A0b, Boolean.TRUE) || r2.A0Z() != null) {
            return true;
        }
        return false;
    }

    public int getItemViewType(int i) {
        C147387Sy r1 = this.A0S;
        if (i < 0 || i >= r1.size()) {
            return -1;
        }
        return C108955ca.A07(r1, i);
    }

    public C112355lL(Activity activity, C23381Fv r10, AnonymousClass190 r11, C36491nz r12, C124986aJ r13, C124996aK r14, C125006aL r15, C72043Kk r16, C37551pj r17, AnonymousClass73Z r18, C130306jD r19, C24921Me r20, C37451pZ r21, AnonymousClass733 r22, AnonymousClass11P r23, AnonymousClass118 r24, C18000vb r25, C18030ve r26, C32011gU r27, C38581rX r28, C36921og r29, C41461wR r30, C142627Ae r31, C111295jU r32, C138036wQ r33, AnonymousClass10I r34, AnonymousClass68H r35) {
        this();
        this.A01 = "";
        boolean z = true;
        this.A0J = r23;
        C18030ve r3 = r26;
        this.A0M = r3;
        this.A0Z = r11;
        this.A04 = activity;
        this.A05 = r10;
        AnonymousClass118 r6 = r24;
        this.A0K = r6;
        C32011gU r4 = r27;
        this.A0N = r4;
        this.A0F = r20;
        C18000vb r5 = r25;
        this.A0L = r5;
        this.A0T = r32;
        this.A0Q = r31;
        this.A0C = r17;
        this.A0G = r21;
        this.A0V = r35;
        C138036wQ r7 = r33;
        this.A0U = r7;
        this.A09 = r14;
        this.A0P = r29;
        this.A0E = r19;
        this.A0D = r18;
        this.A0B = r16;
        this.A08 = r13;
        this.A0A = r15;
        this.A0H = r22;
        this.A0O = r28;
        this.A07 = r12;
        this.A0I = new C37471pb(new C200710s(r34, true));
        this.A0R = new C142617Ad(this, this);
        this.A0S = new C147387Sy(r6, r5, r4, r7);
        this.A0Y = C18020vd.A00(C18040vf.A02, r3, 6739) != 1 ? false : z;
        this.A0X = r30.A00();
    }

    public /* synthetic */ boolean Be5() {
        return false;
    }

    public C112355lL() {
        this.A0W = C17880vN.A12();
        this.A06 = new C112735lx(this, 5);
    }
}
