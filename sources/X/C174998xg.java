package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.8xg  reason: invalid class name and case insensitive filesystem */
public final class C174998xg extends C175028xj {
    public C20079A6f A00;
    public C20327AGj A01;
    public A5P A02;
    public C174158wK A03;
    public C219217x A04;
    public C27091Ur A05;
    public final View A06;
    public final A5L A07;
    public final C129976ig A08;
    public final AnonymousClass1XN A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174998xg(View view, A5L a5l, C129976ig r14, C219217x r15, C27091Ur r16, AnonymousClass1XN r17) {
        super(view);
        C27091Ur r2 = r16;
        AnonymousClass1XN r1 = r17;
        C18070vi.A0p(r2, r15, r1);
        C18070vi.A0d(a5l, 5);
        this.A06 = view;
        this.A05 = r2;
        this.A04 = r15;
        this.A09 = r1;
        this.A07 = a5l;
        this.A08 = r14;
        C20079A6f A032 = a5l.A03();
        this.A00 = A032 == null ? new C20079A6f(Double.valueOf(2800.0d), Double.valueOf(-23.533773d), Double.valueOf(-46.62529d), (Double) null, (Double) null, (Double) null, "São Paulo", (String) null, "city_default") : A032;
        ViewGroup A0C = AnonymousClass3MW.A0C(view, 2131432279);
        C18070vi.A0b(A0C);
        this.A01 = new C20327AGj(A0C, new AI9(this, 1), A00(this, 15.5f), this.A05);
    }

    public static final D44 A00(C174998xg r6, float f) {
        Double d = r6.A00.A03;
        C17960vV.A07(d);
        C18070vi.A0X(d);
        double doubleValue = d.doubleValue();
        Double d2 = r6.A00.A04;
        C17960vV.A07(d2);
        C18070vi.A0X(d2);
        return new D44(new C20269AEc(doubleValue, d2.doubleValue()), f, 90.0f, 0.0f);
    }
}
