package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.3QY  reason: invalid class name */
public class AnonymousClass3QY extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass1M9 A02;
    public C24921Me A03;
    public C18030ve A04;
    public AnonymousClass1EC A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass031 A09;
    public boolean A0A;
    public final Context A0B;
    public final View A0C;
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final View A0G;
    public final AnonymousClass01E A0H;
    public final AnonymousClass8GM A0I;
    public final C28931bI A0J;
    public final View A0K;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A09;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass3QY(Context context) {
        super(context);
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A04 = AnonymousClass10E.A8r(A0O);
            this.A01 = AnonymousClass10E.A12(A0O);
            this.A08 = AnonymousClass3MW.A0s(A0O);
            this.A00 = AnonymousClass3MZ.A0N(A0O);
            this.A02 = AnonymousClass10E.A4z(A0O);
            this.A03 = AnonymousClass3MZ.A0g(A0O);
            this.A07 = C000200d.A00(A0O.AAd);
            this.A06 = C000200d.A00(A0O.A2M);
        }
        this.A0B = context;
        AnonymousClass01E r4 = (AnonymousClass01E) AnonymousClass1L9.A01(context, AnonymousClass01E.class);
        this.A0H = r4;
        AnonymousClass8GM r6 = (AnonymousClass8GM) AnonymousClass3MW.A0N(r4).A00(AnonymousClass8GM.class);
        this.A0I = r6;
        View inflate = View.inflate(getContext(), 2131624572, this);
        this.A0K = inflate;
        this.A0E = AnonymousClass1HF.A06(inflate, 2131429275);
        View A062 = AnonymousClass1HF.A06(inflate, 2131434532);
        this.A0G = A062;
        View A063 = AnonymousClass1HF.A06(inflate, 2131429814);
        this.A0C = A063;
        View A064 = AnonymousClass1HF.A06(inflate, 2131429885);
        this.A0D = A064;
        View A065 = AnonymousClass1HF.A06(inflate, 2131430650);
        this.A0F = A065;
        this.A0J = C28931bI.A00(inflate, 2131436417);
        AnonymousClass1Y5.A07(A062, "Button");
        AnonymousClass1Y5.A07(A064, "Button");
        AnonymousClass1Y5.A07(A063, "Button");
        C89894dC.A00(A065, this, 39);
        AnonymousClass1Y5.A07(A065, "Button");
        r6.A03.A0A(r4, new C91584fv(context, 49));
        r6.A02.A0A(r4, new C91494fm(context, this, 7));
    }
}
