package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: X.5h3  reason: invalid class name and case insensitive filesystem */
public class C110765h3 extends AppCompatImageView implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Paint A04;
    public final /* synthetic */ C131086kU A05;

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.A02);
        canvas.drawRect(0.0f, 0.0f, C108945cZ.A03(this), C108945cZ.A04(this), this.A04);
        if (this.A05.A0B) {
            canvas.drawColor(this.A03);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110765h3(Context context, C131086kU r6) {
        super(context, (AttributeSet) null);
        this.A05 = r6;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        Paint A0K = C108945cZ.A0K(1);
        this.A04 = A0K;
        AnonymousClass3MX.A19(context, A0K, 2131103261);
        A0K.setStrokeWidth(AnonymousClass3MW.A00(context.getResources(), 2131166897));
        AnonymousClass3MW.A1P(A0K);
        A0K.setAntiAlias(true);
        this.A02 = C19740yt.A00(context, 2131102714);
        this.A03 = C19740yt.A00(context, 2131102715);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }
}
