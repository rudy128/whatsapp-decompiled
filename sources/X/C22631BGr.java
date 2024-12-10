package X;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: X.BGr  reason: case insensitive filesystem */
public class C22631BGr extends Transition.EpicenterCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C22631BGr(Rect rect, BLT blt, int i) {
        this.A00 = i;
        this.A01 = blt;
        this.A02 = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        int i = this.A00;
        Rect rect = (Rect) this.A02;
        if (i == 0 || !rect.isEmpty()) {
            return rect;
        }
        return null;
    }
}
