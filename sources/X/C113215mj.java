package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.5mj  reason: invalid class name and case insensitive filesystem */
public final class C113215mj extends C42011xT {
    public final View A00;
    public final TextView A01;
    public final ThumbnailButton A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113215mj(View view) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A00 = view;
        View findViewById = view.findViewById(2131429453);
        C18070vi.A0z(findViewById, "null cannot be cast to non-null type com.whatsapp.components.button.ThumbnailButton");
        this.A02 = (ThumbnailButton) findViewById;
        View findViewById2 = view.findViewById(2131429428);
        C18070vi.A0z(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        this.A01 = textView;
        textView.setImportantForAccessibility(2);
        View findViewById3 = view.findViewById(2131431856);
        if (findViewById3 instanceof ImageView) {
            ImageView imageView = (ImageView) findViewById3;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            AnonymousClass3MY.A14(AnonymousClass000.A0Y(imageView), findViewById3, 2131165911);
        }
    }
}
