package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.WaTextView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.90o  reason: invalid class name and case insensitive filesystem */
public class C1763090o extends C195289t6 {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ImageView A03;
    public ImageView A04;
    public WaTextView A05;
    public WaTextView A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final AnonymousClass1KB A0A;
    public final A56 A0B;
    public final AnonymousClass10I A0C;
    public final C18000vb A0D;
    public final AnonymousClass1QO A0E;
    public final C38471rL A0F = new C177659Ab(this, 38);
    public final C38471rL A0G = new C177659Ab(this, 37);

    public void A00() {
        View view = this.A04.A00;
        ViewStub viewStub = (ViewStub) AnonymousClass1HF.A06(view, 2131429861);
        viewStub.setLayoutResource(2131625061);
        View inflate = viewStub.inflate();
        this.A00 = inflate;
        this.A02 = AnonymousClass3MW.A0C(inflate, 2131433377);
        this.A01 = AnonymousClass3MW.A0C(this.A00, 2131433374);
        this.A06 = AnonymousClass3MW.A0T(this.A00, 2131433376);
        this.A04 = AnonymousClass3MW.A0G(this.A00, 2131433375);
        this.A05 = AnonymousClass3MW.A0T(this.A00, 2131433373);
        this.A03 = AnonymousClass3MW.A0G(this.A00, 2131433372);
        ImageView A0G2 = AnonymousClass3MW.A0G(view, 2131433375);
        int i = this.A03;
        AnonymousClass4aX.A0D(A0G2, i);
        AnonymousClass4aX.A0D(AnonymousClass3MW.A0G(view, 2131433372), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        if (X.C18020vd.A05(r5, r7, 10897) != false) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C20284AEs r9, boolean r10) {
        /*
            r8 = this;
            X.1QO r0 = r8.A0E
            X.0ve r7 = r0.A02
            r6 = 10897(0x2a91, float:1.527E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r7, r6)
            if (r0 != 0) goto L_0x004c
            int r1 = r9.A01
            r0 = 2
            boolean r2 = X.AnonymousClass000.A1T(r1, r0)
            com.whatsapp.WaTextView r1 = r8.A06
            r0 = 2131893479(0x7f121ce7, float:1.9421736E38)
            if (r2 == 0) goto L_0x001f
            r0 = 2131893480(0x7f121ce8, float:1.9421738E38)
        L_0x001f:
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r8.A06
            if (r2 == 0) goto L_0x00cd
            int r0 = r8.A09
        L_0x0028:
            r1.setTextColor(r0)
            android.widget.ImageView r1 = r8.A04
            r0 = 2131231957(0x7f0804d5, float:1.808001E38)
            if (r2 == 0) goto L_0x0035
            r0 = 2131233239(0x7f0809d7, float:1.808261E38)
        L_0x0035:
            r1.setImageResource(r0)
            if (r2 == 0) goto L_0x00c9
            int r0 = r8.A07
        L_0x003c:
            X.AnonymousClass4aX.A0D(r1, r0)
            android.view.ViewGroup r1 = r8.A02
            X.1rL r0 = r8.A0G
            if (r2 == 0) goto L_0x00c2
            r0 = 0
            r1.setOnClickListener(r0)
            r1.setBackground(r0)
        L_0x004c:
            int r1 = r9.A03
            r0 = 2
            boolean r2 = X.AnonymousClass000.A1T(r1, r0)
            com.whatsapp.WaTextView r1 = r8.A05
            r0 = 2131893441(0x7f121cc1, float:1.9421659E38)
            if (r2 == 0) goto L_0x005d
            r0 = 2131893442(0x7f121cc2, float:1.942166E38)
        L_0x005d:
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r8.A05
            if (r2 == 0) goto L_0x00bf
            int r0 = r8.A09
        L_0x0066:
            r1.setTextColor(r0)
            android.widget.ImageView r1 = r8.A03
            r0 = 2131232306(0x7f080632, float:1.8080718E38)
            if (r2 == 0) goto L_0x0073
            r0 = 2131233239(0x7f0809d7, float:1.808261E38)
        L_0x0073:
            r1.setImageResource(r0)
            if (r2 == 0) goto L_0x00bc
            int r0 = r8.A07
        L_0x007a:
            X.AnonymousClass4aX.A0D(r1, r0)
            android.view.ViewGroup r1 = r8.A01
            X.1rL r0 = r8.A0F
            if (r2 == 0) goto L_0x00b5
            r0 = 0
            r1.setOnClickListener(r0)
            r1.setBackground(r0)
        L_0x008a:
            boolean r0 = X.A8e.A08(r9)
            if (r0 == 0) goto L_0x00b4
            X.8pb r4 = r9.A08
            X.8pY r4 = (X.AnonymousClass8pY) r4
            if (r4 == 0) goto L_0x00b4
            android.view.ViewGroup r3 = r8.A02
            boolean r0 = r4.A0X
            r2 = 0
            if (r0 == 0) goto L_0x00a4
            boolean r1 = X.C18020vd.A05(r5, r7, r6)
            r0 = 0
            if (r1 == 0) goto L_0x00a6
        L_0x00a4:
            r0 = 8
        L_0x00a6:
            r3.setVisibility(r0)
            android.view.ViewGroup r1 = r8.A01
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x00b1
            r2 = 8
        L_0x00b1:
            r1.setVisibility(r2)
        L_0x00b4:
            return
        L_0x00b5:
            r1.setOnClickListener(r0)
            X.C42491yG.A02(r1)
            goto L_0x008a
        L_0x00bc:
            int r0 = r8.A03
            goto L_0x007a
        L_0x00bf:
            int r0 = r8.A08
            goto L_0x0066
        L_0x00c2:
            r1.setOnClickListener(r0)
            X.C42491yG.A02(r1)
            goto L_0x004c
        L_0x00c9:
            int r0 = r8.A03
            goto L_0x003c
        L_0x00cd:
            int r0 = r8.A08
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1763090o.A01(X.AEs, boolean):void");
    }

    public C1763090o(AnonymousClass1KB r3, C18000vb r4, AnonymousClass1QO r5, AnonymousClass91y r6, A56 a56, AnonymousClass10I r8) {
        super(r6);
        this.A0A = r3;
        this.A0C = r8;
        this.A0D = r4;
        this.A0E = r5;
        this.A0B = a56;
        this.A08 = AnonymousClass3Ma.A00(r6, 2130971557, 2131102703);
        this.A09 = AnonymousClass3Ma.A00(r6, 2130971558, 2131102704);
        this.A07 = AnonymousClass3Ma.A00(r6, 2130970093, 2131101214);
    }

    public void A02(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20284AEs A0P = AnonymousClass8BR.A0P(it);
            if (A0P.A0A.equals(this.A04.A04.A0A)) {
                A01(A0P, false);
                return;
            }
        }
    }
}
