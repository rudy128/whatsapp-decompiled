package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.util.Log;

public final class Bq2 extends AnonymousClass28W {
    public C66582yP A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C35421mD A09;
    public final AnonymousClass1VW A0A;
    public final C24921Me A0B;
    public final C37451pZ A0C;
    public final C37451pZ A0D;
    public final AnonymousClass11P A0E;
    public final C18000vb A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18100vl A0J;
    public final C18100vl A0K;
    public final C18100vl A0L;
    public final C18100vl A0M;
    public final C18100vl A0N;
    public final C18100vl A0O;
    public final C18100vl A0P;
    public final C18100vl A0Q;
    public final C18100vl A0R;
    public final C18100vl A0S;
    public final boolean A0T;
    public final C18100vl A0U;

    public /* bridge */ /* synthetic */ C41121vq A0B() {
        return this.A00;
    }

    public SelectionCheckView A0C() {
        return (SelectionCheckView) this.A0U.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Bq2(View view, C72043Kk r6, C35421mD r7, AnonymousClass1VW r8, C24921Me r9, C37451pZ r10, C37451pZ r11, AnonymousClass11P r12, C18000vb r13, AnonymousClass1DC r14, boolean z) {
        super(view);
        C18070vi.A0j(r14, r6);
        C18070vi.A0d(r12, 4);
        C72473Md.A1J(r8, r9);
        C18070vi.A0d(r13, 7);
        this.A0E = r12;
        this.A0A = r8;
        this.A0B = r9;
        this.A0F = r13;
        this.A09 = r7;
        this.A0C = r10;
        this.A0D = r11;
        this.A0T = z;
        Integer num = AnonymousClass00R.A0C;
        this.A0U = AnonymousClass1DF.A00(num, new DmJ(view, this));
        this.A0K = AnonymousClass1DF.A00(num, new DmH(view, this));
        this.A0M = AnonymousClass1DF.A00(num, new DmI(view, this));
        this.A0I = AnonymousClass1DF.A00(num, new C27696Dje(view));
        this.A0H = AnonymousClass1DF.A00(num, new DmF(view, this));
        this.A0L = AnonymousClass1DF.A00(num, new C27697Djf(view));
        this.A0P = AnonymousClass1DF.A00(num, new C27824DmL(view, this));
        this.A0O = AnonymousClass1DF.A00(num, new DmK(view, this));
        this.A0S = AnonymousClass1DF.A00(num, new C27826DmN(view, this));
        this.A0R = AnonymousClass1DF.A00(num, new C27825DmM(view, this));
        this.A0N = AnonymousClass1DF.A00(num, new C27698Djg(view));
        this.A0J = AnonymousClass1DF.A00(num, new DmG(view, r6));
        this.A0G = AnonymousClass1DF.A00(num, C27908Dnj.A00);
        this.A0Q = AnonymousClass1DF.A00(num, new C27699Djh(this));
        boolean z2 = this.A0T;
        if (!z2) {
            View A0A2 = AnonymousClass3MW.A0A(this.A0S);
            C18100vl r2 = this.A0G;
            A0A2.setOnTouchListener((C64732vF) r2.getValue());
            AnonymousClass3MW.A0A(this.A0R).setOnTouchListener((C64732vF) r2.getValue());
        }
        if (this.A09 == null) {
            Log.w("CallsHistoryCallItemViewHolder/setEventListeners event listener is null");
        } else {
            if (!z2) {
                C18100vl r22 = this.A0K;
                AnonymousClass48l.A00(AnonymousClass3MW.A0A(r22), this, 14);
                AnonymousClass3MW.A0A(r22).setOnLongClickListener(new C26585D4z(this, 0));
                C18100vl r23 = this.A0M;
                AnonymousClass48l.A00(AnonymousClass3MW.A0A(r23), this, 13);
                AnonymousClass3MW.A0A(r23).setOnLongClickListener(new C26585D4z(this, 1));
            }
            View view2 = this.A0H;
            AnonymousClass48l.A00(view2, this, 15);
            view2.setOnLongClickListener(new C90274do(this, 2));
            if (!z2) {
                C89874dA.A00(AnonymousClass3MW.A0A(this.A0S), this, 25);
                C89874dA.A00(AnonymousClass3MW.A0A(this.A0R), this, 26);
            }
        }
        C42491yG.A02(view);
    }

    public static final void A00(View view, C58792lG r5, int i) {
        CharSequence charSequence;
        Context context = view.getContext();
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass4ZN r1 = r5.A0B;
        if (r1 != null) {
            charSequence = r1.A03(AnonymousClass3MY.A04(view));
        } else {
            charSequence = null;
        }
        AnonymousClass1Y5.A06(view, AnonymousClass3Ma.A10(context, charSequence, A1a, 0, i));
    }
}
