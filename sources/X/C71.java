package X;

import android.graphics.RectF;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

public abstract class C71 {
    public static final void A00(CursorAnchorInfo.Builder builder, AnonymousClass0NU r7) {
        EditorBoundsInfo.Builder builder2 = new EditorBoundsInfo.Builder();
        float f = r7.A01;
        float f2 = r7.A03;
        float f3 = r7.A02;
        float f4 = r7.A00;
        builder.setEditorBoundsInfo(builder2.setEditorBounds(new RectF(f, f2, f3, f4)).setHandwritingBounds(new RectF(f, f2, f3, f4)).build());
    }
}
