package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.5eF  reason: invalid class name and case insensitive filesystem */
public final class C109905eF extends View {
    public final int[] A00 = new int[2];
    public final int[] A01 = new int[2];
    public final /* synthetic */ AnonymousClass7DY A02;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        AnonymousClass7DY r3 = this.A02;
        View view = r3.A0A;
        if (view != null) {
            view.getLocationOnScreen(this.A00);
            getLocationOnScreen(this.A01);
            View view2 = r3.A0A;
            if (view2 != null) {
                return view2.dispatchTouchEvent(motionEvent);
            }
        }
        C18070vi.A11("cameraView");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109905eF(AnonymousClass1FU r3, AnonymousClass7DY r4) {
        super(r3);
        this.A02 = r4;
    }

    public final int[] getCameraLocation() {
        return this.A00;
    }

    public final int[] getTouchLocation() {
        return this.A01;
    }
}
