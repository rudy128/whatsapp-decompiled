package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.crop.CropImageView;

/* renamed from: X.3Rp  reason: invalid class name and case insensitive filesystem */
public abstract class C73223Rp extends AppCompatImageView implements AnonymousClass009 {
    public AnonymousClass031 A00;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C73223Rp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CropImageView cropImageView = (CropImageView) this;
        if (!cropImageView.A00) {
            cropImageView.A00 = true;
            cropImageView.generatedComponent();
        }
    }
}
