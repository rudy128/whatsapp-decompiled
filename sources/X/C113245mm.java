package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;

/* renamed from: X.5mm  reason: invalid class name and case insensitive filesystem */
public class C113245mm extends C42011xT {
    public AnonymousClass8B0 A00;
    public ShapeItemView A01;
    public final /* synthetic */ C112395lP A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113245mm(View view, C112395lP r4) {
        super(view);
        this.A02 = r4;
        ShapeItemView shapeItemView = (ShapeItemView) view.findViewById(2131435343);
        this.A01 = shapeItemView;
        ViewGroup.LayoutParams layoutParams = shapeItemView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this.A01.setLayoutParams(layoutParams);
        AnonymousClass78K.A00(view, this, 25);
    }
}
