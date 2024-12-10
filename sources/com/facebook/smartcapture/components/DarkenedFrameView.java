package com.facebook.smartcapture.components;

import X.AnonymousClass3MW;
import X.AnonymousClass6VZ;
import X.C108945cZ;
import X.C18070vi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

public final class DarkenedFrameView extends View {
    public final float A00;
    public final float A01;
    public final Path A02 = C108945cZ.A0L();
    public final RectF A03 = AnonymousClass3MW.A08();
    public final RectF A04 = AnonymousClass3MW.A08();
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DarkenedFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A05 = AnonymousClass6VZ.A00(context, 2130971030);
        this.A01 = getResources().getDimension(2131166390);
        this.A00 = getResources().getDimension(2131166389);
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
        int i = Build.VERSION.SDK_INT;
        Path path = this.A02;
        if (i >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.A05);
    }
}
