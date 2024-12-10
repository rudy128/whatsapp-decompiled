package X;

import android.view.View;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.3mP  reason: invalid class name and case insensitive filesystem */
public final class C76033mP extends AnonymousClass28W {
    public int A00;
    public long A01;
    public C70483Bg A02;
    public C66522yJ A03;
    public C35471mI A04;
    public AnonymousClass1E7 A05;
    public boolean A06;
    public final AnonymousClass1M9 A07;
    public final C37451pZ A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;

    public /* bridge */ /* synthetic */ C41121vq A0B() {
        return this.A03;
    }

    public SelectionCheckView A0C() {
        return (SelectionCheckView) this.A0E.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76033mP(View view, C72043Kk r4, AnonymousClass1M9 r5, C37451pZ r6) {
        super(view);
        C72473Md.A1I(r4, r5);
        this.A07 = r5;
        this.A08 = r6;
        Integer num = AnonymousClass00R.A0C;
        this.A0E = AnonymousClass1DF.A00(num, new C101415Cn(view));
        this.A09 = AnonymousClass1DF.A00(num, new C101395Cl(view));
        this.A0A = AnonymousClass1DF.A00(num, new C101405Cm(view));
        this.A0B = AnonymousClass1DF.A00(num, new AnonymousClass5MI(view, r4));
        this.A0C = AnonymousClass1DF.A00(num, new C101425Co(view));
        this.A0D = AnonymousClass1DF.A00(num, new C101435Cp(view));
    }
}
