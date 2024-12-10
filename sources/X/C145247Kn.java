package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.7Kn  reason: invalid class name and case insensitive filesystem */
public class C145247Kn implements C1607789w {
    public int A00;
    public int A01 = -1;
    public long A02 = 0;
    public C136866uX A03;
    public ArrayList A04;
    public int A05;
    public C112215l7 A06;
    public final Context A07;
    public final View A08;
    public final LinearLayoutManager A09;
    public final RecyclerView A0A;
    public final C18000vb A0B;
    public final HashMap A0C = C17880vN.A11();

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bzy(int r8) {
        /*
            r7 = this;
            int r2 = r7.A00
            if (r8 == r2) goto L_0x0067
            java.util.ArrayList r1 = r7.A04
            r3 = 0
            if (r1 != 0) goto L_0x0094
        L_0x0009:
            r3 = -1
        L_0x000a:
            r7.A00 = r8
            X.5l7 r0 = r7.A06
            if (r0 == 0) goto L_0x0067
            java.util.ArrayList r1 = r7.A04
            r2 = 0
            if (r1 != 0) goto L_0x007f
        L_0x0015:
            r2 = -1
        L_0x0016:
            if (r2 == r3) goto L_0x0062
            androidx.recyclerview.widget.LinearLayoutManager r4 = r7.A09
            int r6 = r4.A1N()
            int r5 = r4.A1P()
            int r3 = r5 - r6
            X.0vb r0 = r7.A0B
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x0046
            int r1 = r7.A05
            r0 = -1
            if (r1 == r0) goto L_0x0046
            int r0 = r4.A0J()
            int r0 = r0 + -1
            android.view.View r1 = r4.A0P(r0)
            int r0 = r7.A05
            if (r5 >= r0) goto L_0x0079
            if (r2 >= r0) goto L_0x0079
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0A
            r0.clearChildFocus(r1)
        L_0x0046:
            int r0 = r3 * 2
            int r0 = r0 / 5
            int r3 = r2 - r0
            if (r3 >= r6) goto L_0x0068
            if (r3 >= 0) goto L_0x0051
            r3 = 0
        L_0x0051:
            android.view.View r0 = r7.A08
            android.content.Context r2 = r0.getContext()
            r1 = 3
            X.5kG r0 = new X.5kG
            r0.<init>(r2, r7, r1)
            r0.A00 = r3
            r4.A0e(r0)
        L_0x0062:
            X.5l7 r0 = r7.A06
            r0.notifyDataSetChanged()
        L_0x0067:
            return
        L_0x0068:
            int r2 = r2 + r0
            if (r2 <= r5) goto L_0x0062
            r3 = r2
            int r0 = r4.A0K()
            if (r2 < r0) goto L_0x0051
            int r0 = r4.A0K()
            int r3 = r0 + -1
            goto L_0x0051
        L_0x0079:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0A
            r0.requestChildFocus(r1, r1)
            goto L_0x0046
        L_0x007f:
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0015
            java.lang.Object r0 = r1.get(r2)
            X.6xu r0 = (X.C138916xu) r0
            boolean r0 = r0.A00(r8)
            if (r0 != 0) goto L_0x0016
            int r2 = r2 + 1
            goto L_0x007f
        L_0x0094:
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0009
            java.lang.Object r0 = r1.get(r3)
            X.6xu r0 = (X.C138916xu) r0
            boolean r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x000a
            int r3 = r3 + 1
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145247Kn.Bzy(int):void");
    }

    public void CIW(C136866uX r4) {
        this.A03 = r4;
        if (r4 != null) {
            int A032 = r4.A03();
            if (A032 < 0) {
                C108955ca.A1X("StickerPickerHeader/setContentPicker/getCurrentPageIndex < 0", Locale.US, new Object[0]);
                A032 = 0;
            }
            Bzy(A032);
        }
    }

    public C145247Kn(Context context, View view, C18000vb r8) {
        this.A07 = context;
        this.A0B = r8;
        View A062 = AnonymousClass1HF.A06(view, 2131435754);
        this.A08 = A062;
        RecyclerView A0Q = AnonymousClass3MX.A0Q(view, 2131435731);
        this.A0A = A0Q;
        A0Q.A0R = false;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.A09 = linearLayoutManager;
        linearLayoutManager.A1Z(0);
        A0Q.setLayoutManager(linearLayoutManager);
        C111355ja r0 = new C111355ja(this);
        r0.A00 = false;
        A0Q.setItemAnimator(r0);
        linearLayoutManager.A1d(AnonymousClass3MW.A1Z(r8));
        AnonymousClass3MX.A1A(context, A062, AnonymousClass1YL.A00(context, 2130969438, 2131100423));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066 A[LOOP:0: B:18:0x0064->B:19:0x0066, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C145227Kl[] r8) {
        /*
            r7 = this;
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            int r6 = r8.length
            r4 = 0
            if (r6 <= 0) goto L_0x007d
            r1 = r8[r4]
            boolean r0 = r1 instanceof X.C121116Hu
            if (r0 == 0) goto L_0x007d
            java.lang.String r1 = r1.getId()
            X.6xu r0 = new X.6xu
            r0.<init>((int) r4, (java.lang.String) r1)
            r3.add(r0)
            r5 = 1
        L_0x001b:
            if (r5 >= r6) goto L_0x0031
            r1 = r8[r5]
            boolean r0 = r1 instanceof X.C121156Hy
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = r1.getId()
            X.6xu r0 = new X.6xu
            r0.<init>((int) r5, (java.lang.String) r1)
            r3.add(r0)
            int r5 = r5 + 1
        L_0x0031:
            if (r5 >= r6) goto L_0x0047
            r1 = r8[r5]
            boolean r0 = r1 instanceof X.C121146Hx
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r1.getId()
            X.6xu r0 = new X.6xu
            r0.<init>((int) r5, (java.lang.String) r1)
            r3.add(r0)
            int r5 = r5 + 1
        L_0x0047:
            r2 = -1
            if (r5 >= r6) goto L_0x0073
            r0 = r8[r5]
            boolean r0 = r0 instanceof X.C121126Hv
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "sticker_reactions"
            X.6Ho r1 = new X.6Ho
            r1.<init>((int) r5, (java.lang.String) r0)
            int r0 = r7.A05
            boolean r2 = X.AnonymousClass000.A1T(r0, r2)
            r7.A05 = r5
            r3.add(r1)
            int r5 = r5 + 4
        L_0x0064:
            if (r5 >= r6) goto L_0x007f
            r1 = r8[r5]
            X.6xu r0 = new X.6xu
            r0.<init>((X.C145227Kl) r1, (int) r5)
            r3.add(r0)
            int r5 = r5 + 1
            goto L_0x0064
        L_0x0073:
            int r0 = r7.A05
            if (r0 == r2) goto L_0x007b
            r7.A05 = r2
            r2 = 1
            goto L_0x0064
        L_0x007b:
            r2 = 0
            goto L_0x0064
        L_0x007d:
            r5 = 0
            goto L_0x001b
        L_0x007f:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r7.A09
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0088
            java.util.Collections.reverse(r3)
        L_0x0088:
            java.util.ArrayList r0 = r7.A04
            if (r0 != 0) goto L_0x009a
            X.0vb r0 = r7.A0B
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x0098
            int r4 = X.AnonymousClass000.A0Q(r3)
        L_0x0098:
            r7.A01 = r4
        L_0x009a:
            r7.A04 = r3
            X.5l7 r0 = r7.A06
            if (r0 == 0) goto L_0x00aa
            if (r2 != 0) goto L_0x00aa
            r0.A01 = r8
            r0.A00 = r3
            r0.notifyDataSetChanged()
            return
        L_0x00aa:
            X.5l7 r1 = new X.5l7
            r1.<init>(r7, r3, r8)
            r7.A06 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0A
            r0.setAdapter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145247Kn.A00(X.7Kl[]):void");
    }

    public View BbS() {
        return this.A08;
    }
}
