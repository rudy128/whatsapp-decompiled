package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.3Nt  reason: invalid class name and case insensitive filesystem */
public class C72853Nt extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ AnonymousClass3uP A00;

    public C72853Nt(AnonymousClass3uP r1) {
        this.A00 = r1;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        String obj;
        AnonymousClass3uP r5 = this.A00;
        if (C18020vd.A05(C18040vf.A02, r5.A0F, 11511)) {
            r5.A2T(r5.getFMessage(), 2);
            return true;
        }
        String A0r = C17880vN.A0r(C17890vO.A0B(r5.A0v), "double_tap_reaction_emoji");
        C18010vc r1 = r5.A1M;
        if (A0r == null) {
            A0r = "❤️";
        }
        AnonymousClass737 A002 = C1409873v.A00(new AnonymousClass737(A0r), r1);
        String A04 = C63892tr.A04(r5.A0U, r5.getFMessage());
        boolean z = false;
        if (A04 != null) {
            z = true;
            if (A04.equals(A002.toString())) {
                obj = "";
                r5.A0a.A0r(r5.getFMessage(), obj, z);
                r5.A1O.A00(r5.getFMessage(), AnonymousClass00R.A0C, 2);
                return true;
            }
        }
        obj = A002.toString();
        r5.A0a.A0r(r5.getFMessage(), obj, z);
        r5.A1O.A00(r5.getFMessage(), AnonymousClass00R.A0C, 2);
        return true;
    }
}
