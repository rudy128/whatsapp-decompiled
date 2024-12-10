package X;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class BGW extends ClickableSpan {
    public final int A00;
    public final int A01;
    public final C26228CvK A02;

    public BGW(C26228CvK cvK, int i, int i2) {
        this.A01 = i;
        this.A02 = cvK;
        this.A00 = i2;
    }

    public void onClick(View view) {
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A01);
        C26228CvK cvK = this.A02;
        cvK.A02.performAction(this.A00, A0D);
    }
}
