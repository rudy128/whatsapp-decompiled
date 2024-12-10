package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.8xV  reason: invalid class name and case insensitive filesystem */
public abstract class C174888xV extends C175028xj {
    public WaImageButton A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174888xV(View view) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A01 = AnonymousClass3MW.A0R(view, 2131431496);
        this.A03 = AnonymousClass3MW.A0T(view, 2131436208);
        this.A02 = AnonymousClass3MW.A0T(view, 2131435885);
        this.A00 = (WaImageButton) AnonymousClass1HF.A06(view, 2131427483);
    }

    public void A0B() {
        this.A01.setImageDrawable((Drawable) null);
        this.A03.setText("");
        WaTextView waTextView = this.A02;
        waTextView.setText("");
        waTextView.setVisibility(8);
        WaImageButton waImageButton = this.A00;
        waImageButton.setImageDrawable((Drawable) null);
        waImageButton.setVisibility(8);
        waImageButton.setOnClickListener((View.OnClickListener) null);
    }
}
