package X;

import android.os.Handler;
import android.os.Vibrator;
import android.view.View;

/* renamed from: X.71K  reason: invalid class name */
public class AnonymousClass71K {
    public boolean A00;
    public final Handler A01;
    public final Vibrator A02;
    public final View A03;
    public final C109405dO A04;
    public final Runnable A05;
    public final Runnable A06;

    public static void A00(AnonymousClass71K r3) {
        C109405dO r2 = r3.A04;
        r2.A00 = AnonymousClass000.A0Y(r3.A03).getColor(2131102742);
        r2.invalidateSelf();
    }

    public static boolean A01(AnonymousClass71K r1, float f, float f2) {
        View view = r1.A03;
        if (f < ((float) view.getLeft()) || f > ((float) view.getRight()) || f2 < ((float) view.getTop()) || f2 > ((float) view.getBottom())) {
            return false;
        }
        return true;
    }

    public AnonymousClass71K(Handler handler, View view, AnonymousClass11C r7, C18000vb r8, C109405dO r9) {
        this.A03 = view;
        this.A04 = r9;
        this.A01 = handler;
        view.setBackground(new C74743cP(r9, r8));
        this.A06 = new C146567Pr(view, 0.0f, 1.0f, 0);
        this.A05 = new C146567Pr(view, 1.0f, 0.0f, 4);
        this.A02 = r7.A0H();
        A00(this);
    }
}
