package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.WaImageView;
import java.util.List;

/* renamed from: X.6Hy  reason: invalid class name and case insensitive filesystem */
public class C121156Hy extends C145227Kl {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public WaImageView A04;
    public C112185l4 A05;
    public List A06;
    public boolean A07;
    public final AnonymousClass11S A08;
    public final C136866uX A09;
    public final C1193467t A0A;
    public final C26631Sw A0B;
    public final AnonymousClass88B A0C;
    public final boolean A0D;
    public final int A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C121156Hy(android.content.Context r8, android.view.LayoutInflater r9, X.AnonymousClass11S r10, X.C18030ve r11, X.C136866uX r12, X.C1193467t r13, X.C26631Sw r14, X.AnonymousClass88B r15, int r16, int r17) {
        /*
            r7 = this;
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r5 = r16
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r7.A08 = r10
            r7.A09 = r12
            r7.A0A = r13
            r7.A0B = r14
            r7.A0C = r15
            boolean r0 = r13.A09
            r7.A0D = r0
            r7.A0E = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121156Hy.<init>(android.content.Context, android.view.LayoutInflater, X.11S, X.0ve, X.6uX, X.67t, X.1Sw, X.88B, int, int):void");
    }

    public void A05(C1418377d r13) {
        C1418377d r3 = r13;
        this.A08 = r13;
        WaImageView waImageView = this.A04;
        if (waImageView == null) {
            return;
        }
        if (r13 == null) {
            waImageView.setImageDrawable((Drawable) null);
            return;
        }
        C26631Sw r0 = this.A0B;
        int i = this.A0F;
        r0.A06(new C59842my(waImageView, r3, (AnonymousClass889) null, i, i, 0, 0, true, true, false));
    }

    public void A03(View view) {
        view.setBackgroundColor(this.A0E);
        View findViewById = view.findViewById(2131430354);
        this.A01 = findViewById;
        findViewById.setVisibility(4);
        TextView A0E2 = C17880vN.A0E(view, 2131431114);
        this.A02 = A0E2;
        C43421zm.A04(A0E2);
        AnonymousClass78P.A00(this.A02, this, 26);
        this.A03 = C17880vN.A0E(view, 2131430396);
        this.A04 = AnonymousClass3MW.A0R(view, 2131430378);
        this.A00 = view.findViewById(2131435724);
        if (this.A0D) {
            C1418377d r0 = this.A08;
            if (r0 != null) {
                A05(r0);
            } else {
                this.A04.setImageDrawable((Drawable) null);
            }
        }
    }

    public void A06(List list) {
        C112185l4 A002 = A00();
        this.A06 = list;
        A002.A0U(list);
        A002.notifyDataSetChanged();
        if (this.A01 != null) {
            int A0Q = A00().A0Q();
            View view = this.A01;
            int i = 8;
            if (A0Q == 0) {
                i = 0;
            }
            view.setVisibility(i);
            boolean z = this.A07;
            TextView textView = this.A03;
            if (z) {
                textView.setText(2131896465);
                this.A02.setVisibility(4);
            } else {
                textView.setText(2131896464);
                this.A02.setVisibility(0);
            }
            AnonymousClass11S r1 = this.A08;
            if (!r1.A0N()) {
                r1.A0N();
            }
            this.A04.setVisibility(0);
            if (this.A0D) {
                this.A03.setText(2131886847);
                this.A02.setVisibility(4);
            }
        }
    }

    public void BrI(ViewGroup viewGroup, View view, int i) {
        super.BrI(viewGroup, view, i);
        C112185l4 r1 = this.A05;
        if (r1 != null) {
            r1.A03 = null;
        }
        this.A01 = null;
    }
}
