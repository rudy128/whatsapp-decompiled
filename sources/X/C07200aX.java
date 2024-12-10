package X;

import android.os.Looper;
import android.view.Choreographer;

/* renamed from: X.0aX  reason: invalid class name and case insensitive filesystem */
public final class C07200aX extends ThreadLocal {
    public static C18560wh A00() {
        Choreographer instance = Choreographer.getInstance();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            C15290qO r1 = new C15290qO(AnonymousClass9O8.A00(myLooper), instance, (AnonymousClass1Y1) null);
            return r1.plus(r1.A0F());
        }
        throw AnonymousClass000.A0n("no Looper on this thread");
    }

    public /* bridge */ /* synthetic */ Object initialValue() {
        return A00();
    }
}
