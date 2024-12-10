package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.storage.StorageUsageMediaPreviewOverflowOverlayView;

/* renamed from: X.5fg  reason: invalid class name and case insensitive filesystem */
public class C110465fg extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass65B A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final WaTextView A03;
    public final StorageUsageMediaPreviewOverflowOverlayView A04;

    public C110465fg(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        AnonymousClass3MZ.A0D(this).inflate(2131627139, this, true);
        this.A04 = (StorageUsageMediaPreviewOverflowOverlayView) AnonymousClass1HF.A06(this, 2131433362);
        this.A03 = AnonymousClass3MW.A0T(this, 2131433363);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A04.setFrameDrawable(drawable);
        AnonymousClass65B r0 = this.A00;
        if (r0 != null) {
            r0.setFrameDrawable(drawable);
        }
    }
}
