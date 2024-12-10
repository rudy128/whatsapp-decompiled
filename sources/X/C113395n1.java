package X;

import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import com.whatsapp.WaImageView;

/* renamed from: X.5n1  reason: invalid class name and case insensitive filesystem */
public final class C113395n1 extends C42011xT {
    public final View A00;
    public final View A01;
    public final ShapeableImageView A02;
    public final WaImageView A03;
    public final C125916bt A04;
    public final C28931bI A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113395n1(View view, C125916bt r6) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A04 = r6;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C18070vi.A05(view, 2131431496);
        float dimension = view.getResources().getDimension(2131168908);
        C28041Yp r1 = new C28041Yp(shapeableImageView.A07);
        r1.A01(dimension);
        shapeableImageView.setShapeAppearanceModel(new C28011Ym(r1));
        this.A02 = shapeableImageView;
        this.A03 = C108965cb.A0I(view, 2131435135);
        this.A00 = C18070vi.A05(view, 2131428036);
        this.A01 = C18070vi.A05(view, 2131436021);
        this.A05 = C28931bI.A00(view, 2131433904);
    }
}
