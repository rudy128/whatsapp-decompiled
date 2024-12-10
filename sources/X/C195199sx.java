package X;

import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.9sx  reason: invalid class name and case insensitive filesystem */
public final class C195199sx {
    public C193699qW A00;
    public C193699qW A01;
    public C136746uK A02;
    public C136746uK A03;
    public final C18030ve A04;

    public C195199sx(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A04 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.6uK] */
    public final void A00() {
        if ((C18020vd.A00(C18040vf.A02, this.A04, 8175) & 4) == 4) {
            ? obj = new Object();
            obj.A02();
            this.A02 = obj;
            Log.i("VoipUXResponsivenessLogger startCallAnswerMarker started");
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.6uK] */
    public final void A01() {
        if ((C18020vd.A00(C18040vf.A02, this.A04, 8175) & 1) == 1) {
            ? obj = new Object();
            obj.A02();
            this.A03 = obj;
            Log.i("VoipUXResponsivenessLogger startCallStartMarker started");
        }
    }

    public final void A02(View view, String str) {
        C18070vi.A0h(view, str);
        if (C18020vd.A00(C18040vf.A02, this.A04, 8175) > 0) {
            C21452AkJ akJ = new C21452AkJ(39, str, this);
            view.getViewTreeObserver().addOnPreDrawListener(new C29541cS(C17890vO.A0D(), view, akJ));
        }
    }
}
