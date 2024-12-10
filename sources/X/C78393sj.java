package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.3sj  reason: invalid class name and case insensitive filesystem */
public class C78393sj extends AnonymousClass3uP {
    public LinearLayout A00;
    public AnonymousClass1VW A01;
    public C86304Rc A02;
    public C115265tf A03;
    public boolean A04;
    public final TextView A05;
    public final TextView A06;
    public final AnonymousClass00H A07 = DWR.A02(this, 44);
    public final AnonymousClass00H A08 = DWR.A02(this, 45);
    public final ImageView[] A09;
    public final C37451pZ A0A;
    public final AnonymousClass68H A0B;

    public static void A01(C78393sj r8, String str, List list, int i) {
        CharSequence A022;
        int i2 = 0;
        do {
            if (list == null || i2 >= list.size()) {
                r8.A01.A09(r8.A09[i2], 2131231047);
            } else {
                r8.A0A.A0D(r8.A09[i2], (AnonymousClass73C) list.get(i2));
            }
            i2++;
        } while (i2 < 3);
        if (!TextUtils.isEmpty(str)) {
            int i3 = i - 1;
            String A0F = AnonymousClass1EG.A0F(str, 50);
            Object[] A1b = AnonymousClass3MW.A1b();
            BE8.A1A(A0F, A1b, 0, i3, 1);
            String A0K = r8.A0D.A0K(A1b, 2131755076, (long) i3);
            Context context = r8.getContext();
            TextView textView = r8.A05;
            TextPaint paint = textView.getPaint();
            AnonymousClass1KW r1 = r8.A15;
            if (A0K == null) {
                A022 = null;
            } else {
                A022 = C43251zV.A02(context, paint, new AnonymousClass7G7(), r1, A0K);
            }
            textView.setText(r8.A1p(A022));
            return;
        }
        TextView textView2 = r8.A05;
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, i, 0);
        textView2.setText(r8.A0D.A0K(objArr, 2131755251, (long) i));
    }

    public void A1u() {
        AnonymousClass3uP.A0h(this, false);
        A00();
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void A1M() {
        if (!this.A04) {
            this.A04 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r3 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r3, A0O, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3uQ.A16(r1, this);
            AnonymousClass3uQ.A0w(A0n, r3, r1, this);
            AnonymousClass3uQ.A12(r3, r1, this);
            AnonymousClass3uQ.A0y(A0n, r3, this, BE8.A0d(r3));
            AnonymousClass3uQ.A13(r3, r1, this, r3.ABq);
            AnonymousClass3uQ.A0x(A0n, r3, r1, this, r3.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A11(r3, r1, this);
            AnonymousClass3uQ.A15(r3, this);
            AnonymousClass3uQ.A0s(r0, A0n, r3, r1, this);
            AnonymousClass3uQ.A0u(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r3, A0O, this);
            AnonymousClass3uQ.A10(r3, r1, this);
            AnonymousClass3uQ.A0z(r3, r1, A0O, this, AnonymousClass3uQ.A0o(r3));
            this.A01 = BE9.A0W(r3);
            this.A02 = (C86304Rc) r1.A9L.get();
        }
    }

    public boolean A1V() {
        return this.A0l.CMI();
    }

    public boolean A1X() {
        return C79103uS.A1K(this, getFMessage(), this.A1h);
    }

    public int getMainChildMaxWidth() {
        if (this.A0l.Bew(getFMessage())) {
            return 0;
        }
        return AnonymousClass3uQ.A0k(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.A3I.A02(r3) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.AnonymousClass206 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C442022n
            if (r0 != 0) goto L_0x000b
            boolean r1 = X.A3I.A02(r3)
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.C17960vV.A0D(r0)
            r2.A0I = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78393sj.setFMessage(X.206):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.widget.ImageView[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C78393sj(android.content.Context r4, X.C37451pZ r5, X.C108875cR r6, X.AnonymousClass206 r7, X.AnonymousClass68H r8) {
        /*
            r3 = this;
            r3.<init>(r4, r6, r7)
            r3.A1M()
            r0 = 3
            android.widget.ImageView[] r2 = new android.widget.ImageView[r0]
            r3.A09 = r2
            r0 = 44
            X.0vq r0 = X.DWR.A02(r3, r0)
            r3.A07 = r0
            r0 = 45
            X.0vq r0 = X.DWR.A02(r3, r0)
            r3.A08 = r0
            r3.A0A = r5
            r3.A0B = r8
            r0 = 2131436685(0x7f0b248d, float:1.8495247E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r3, r0)
            r3.A05 = r0
            r0 = 2131433831(0x7f0b1967, float:1.8489459E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 0
            r2[r0] = r1
            r0 = 2131433832(0x7f0b1968, float:1.848946E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 1
            r2[r0] = r1
            r0 = 2131433833(0x7f0b1969, float:1.8489463E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 2
            r2[r0] = r1
            r0 = 2131436783(0x7f0b24ef, float:1.8495446E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r3, r0)
            r3.A06 = r0
            r0 = 2131429390(0x7f0b080e, float:1.8480451E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.A00 = r0
            X.4Rc r0 = r3.A02
            boolean r0 = r0.A00()
            android.widget.LinearLayout r2 = r3.A00
            if (r0 == 0) goto L_0x0078
            X.00H r0 = r3.A08
            java.lang.Object r0 = r0.get()
            android.view.View$OnTouchListener r0 = (android.view.View.OnTouchListener) r0
            r2.setOnTouchListener(r0)
        L_0x006f:
            android.widget.LinearLayout r0 = r3.A00
            X.AnonymousClass3uP.A0W(r0, r3)
            r3.A00()
            return
        L_0x0078:
            r1 = 1
            X.48f r0 = new X.48f
            r0.<init>(r3, r1)
            r2.setOnClickListener(r0)
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78393sj.<init>(android.content.Context, X.1pZ, X.5cR, X.206, X.68H):void");
    }

    private void A00() {
        boolean z;
        AnonymousClass1E7 A0H;
        boolean z2;
        AnonymousClass206 fMessage = getFMessage();
        int A002 = C62872s8.A00(fMessage);
        TextView textView = this.A05;
        AnonymousClass205 r3 = fMessage.A0v;
        textView.setTag(r3);
        C115265tf r1 = this.A03;
        if (r1 != null) {
            this.A0B.A07(r1);
        }
        C115265tf r2 = (C115265tf) this.A0B.A02(fMessage);
        this.A03 = r2;
        r2.A0A(new C98334qx(this, 9), this.A0S.A05);
        A01(this, (String) null, (List) null, A002);
        ImageView imageView = this.A09[2];
        if (A002 == 2) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
        }
        if (!r3.A02) {
            AnonymousClass1BI r32 = r3.A00;
            boolean A0e = C22971Dz.A0e(r32);
            boolean z3 = true;
            AnonymousClass1M9 r12 = this.A0j;
            if (A0e) {
                AnonymousClass1BI A0H2 = fMessage.A0H();
                C17960vV.A07(A0H2);
                A0H = r12.A0H(A0H2);
                z2 = (!this.A19.A0O.A0O((AnonymousClass1EC) r32)) & this.A1Q.A06(r32) & true;
            } else {
                C17960vV.A07(r32);
                A0H = r12.A0H(r32);
                z2 = true;
            }
            if (A0H.A0H != null) {
                z3 = false;
            }
            C24901Mc r13 = this.A1Q;
            Jid A062 = A0H.A06(AnonymousClass1BI.class);
            C17960vV.A07(A062);
            z = z2 & z3 & r13.A06((AnonymousClass1BI) A062);
        } else {
            z = false;
        }
        View findViewById = findViewById(2131428595);
        TextView textView2 = this.A06;
        if (!z) {
            textView2.setVisibility(0);
            textView2.setOnClickListener(new C825048f(this, 1));
            return;
        }
        textView2.setVisibility(8);
        findViewById.setVisibility(8);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public int getCenteredLayoutId() {
        return 2131624801;
    }

    public int getIncomingLayoutId() {
        return 2131624801;
    }

    public int getOutgoingLayoutId() {
        return 2131624802;
    }
}
