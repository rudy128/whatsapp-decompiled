package com.facebook.primitive.canvas.model;

import X.AnonymousClass0CT;
import X.AnonymousClass0MD;
import X.C18070vi;
import X.C28506E4o;
import android.graphics.Matrix;

public final class CanvasInverseTransform implements C28506E4o {
    public static final CanvasInverseTransform A00 = new Object();

    public void BCU(Matrix matrix) {
        C18070vi.A0d(matrix, 0);
        if (!matrix.invert(matrix)) {
            AnonymousClass0MD.A00(AnonymousClass0CT.ERROR, "com.facebook.primitive.canvas.model.CanvasInverseTransform", "The matrix supplied cannot be inverted", (Throwable) null);
        }
    }
}
