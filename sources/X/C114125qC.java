package X;

import android.content.Context;
import android.view.MotionEvent;
import java.util.ArrayList;

/* renamed from: X.5qC  reason: invalid class name and case insensitive filesystem */
public class C114125qC extends C110125ey {
    public boolean A00 = false;
    public final C114155qF A01;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A00) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.5qF, X.6uh] */
    public C114125qC(Context context) {
        super(context);
        ? r4 = new C136966uh();
        this.A01 = r4;
        ArrayList A13 = AnonymousClass000.A13();
        C133646pF A002 = C110125ey.A00(C137566vf.A00(), AnonymousClass000.A13(), A13);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSupportZoom(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        A04(r4);
        getSettings().setJavaScriptEnabled(true);
        this.A01 = A002;
    }
}
