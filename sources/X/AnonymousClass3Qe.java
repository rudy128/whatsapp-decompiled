package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.3Qe  reason: invalid class name */
public class AnonymousClass3Qe extends LinearLayout implements AnonymousClass009 {
    public WaImageView A00;
    public WaTextView A01;
    public AnonymousClass031 A02;
    public boolean A03;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setChecked(boolean z) {
        this.A00.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public void setText(int i) {
        this.A01.setText(i);
    }

    public AnonymousClass3Qe(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        View.inflate(getContext(), 2131627137, this);
        setOrientation(0);
        setGravity(16);
        TypedValue typedValue = new TypedValue();
        AnonymousClass3Ma.A06(this).resolveAttribute(16843534, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        this.A01 = AnonymousClass3MW.A0T(this, 2131435831);
        this.A00 = AnonymousClass3MW.A0R(this, 2131435830);
    }
}
