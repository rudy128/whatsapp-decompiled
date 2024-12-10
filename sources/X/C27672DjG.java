package X;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: X.DjG  reason: case insensitive filesystem */
public final class C27672DjG extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26993DOp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27672DjG(C26993DOp dOp) {
        super(0);
        this.this$0 = dOp;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C26993DOp dOp = this.this$0;
        float f = C26993DOp.A0B(dOp).A05;
        C18100vl r1 = dOp.A0h;
        float f2 = BE6.A0f(r1).A01 + BE6.A0f(r1).A05;
        float f3 = BE6.A0f(r1).A00;
        float f4 = BE6.A0f(r1).A02;
        float f5 = BE6.A0f(r1).A05;
        float f6 = BE6.A0f(r1).A03;
        float f7 = BE6.A0f(r1).A04;
        float f8 = BE6.A0f(r1).A0F;
        float f9 = BE6.A0f(r1).A08;
        Path A0L = C108945cZ.A0L();
        float f10 = 2.0f * f4;
        float f11 = (f2 - f) - f10;
        float f12 = f3 - f10;
        A0L.moveTo(f2, 0.0f + f4);
        float f13 = f2 - f10;
        A0L.arcTo(f13, 0.0f, f2, f10, 0.0f, -90.0f, false);
        A0L.rLineTo(-f11, 0.0f);
        A0L.lineTo(f7, 0.0f);
        float f14 = f7 * 2.0f;
        Path path = A0L;
        path.arcTo(0.0f, 0.0f, f14, 0.0f + f14, -90.0f, -120.0f, false);
        A0L.lineTo(f5, f6);
        A0L.rLineTo(0.0f, f12);
        float f15 = f12;
        float f16 = f3;
        path.arcTo(f, f15, f + f10, f16, 180.0f, -90.0f, false);
        A0L.rLineTo(f11, 0.0f);
        path.arcTo(f13, f15, f2, f16, 90.0f, -90.0f, false);
        A0L.rLineTo(0.0f, -f12);
        Matrix A0J = C108945cZ.A0J();
        A0J.setTranslate(f9, f8);
        A0L.transform(A0J);
        A0L.close();
        return A0L;
    }
}
