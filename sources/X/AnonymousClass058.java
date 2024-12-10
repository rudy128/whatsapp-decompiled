package X;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* renamed from: X.058  reason: invalid class name */
public final class AnonymousClass058 extends View.DragShadowBuilder {
    public final long A00;
    public final C28644ECa A01;
    public final C22821Di A02;

    public /* synthetic */ AnonymousClass058(C28644ECa eCa, C22821Di r2, AnonymousClass1Y1 r3, long j) {
        this(eCa, r2, j);
    }

    public void onDrawShadow(Canvas canvas) {
        C05870Wa r12 = new C05870Wa();
        C28644ECa eCa = this.A01;
        long j = this.A00;
        C24246By4 by4 = C24246By4.Ltr;
        Canvas canvas2 = AnonymousClass0M0.A00;
        AnonymousClass0WO r9 = new AnonymousClass0WO();
        r9.A00 = canvas;
        C22821Di r8 = this.A02;
        C04710Ol A04 = r12.A04();
        C28644ECa A002 = A04.A00();
        C24246By4 A022 = A04.A02();
        C16960tV r2 = A04.A01;
        long j2 = A04.A00;
        A04.A04(eCa);
        A04.A05(by4);
        A04.A01 = r9;
        A04.A00 = j;
        r9.CGe();
        r8.invoke(r12);
        r9.CFz();
        A04.A04(A002);
        A04.A05(A022);
        A04.A01 = r2;
        A04.A00 = j2;
    }

    public void onProvideShadowMetrics(Point point, Point point2) {
        C28644ECa eCa = this.A01;
        long j = this.A00;
        point.set(eCa.CG9(eCa.CPF(AnonymousClass0QG.A02(j))), eCa.CG9(eCa.CPF(AnonymousClass0QG.A00(j))));
        point2.set(point.x / 2, point.y / 2);
    }

    public AnonymousClass058(C28644ECa eCa, C22821Di r2, long j) {
        this.A01 = eCa;
        this.A00 = j;
        this.A02 = r2;
    }
}
