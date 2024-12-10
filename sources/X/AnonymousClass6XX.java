package X;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: X.6XX  reason: invalid class name */
public abstract class AnonymousClass6XX {
    public static final AnonymousClass1D6 A00(Context context, Bitmap bitmap) {
        int A00;
        if (bitmap != null) {
            A00 = -16777216;
            C25834Cmn cmn = new CYk(bitmap).A00().A01;
            if (cmn != null) {
                A00 = cmn.A05;
            }
        } else {
            A00 = C19740yt.A00(context, 2131099673);
        }
        int A03 = AnonymousClass1Z2.A03(0.3f, A00, -1);
        return AnonymousClass1D6.A00(Integer.valueOf(A03), AnonymousClass1Z2.A03(0.3f, A00, -16777216));
    }
}
