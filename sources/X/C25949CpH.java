package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

/* renamed from: X.CpH  reason: case insensitive filesystem */
public class C25949CpH {
    public static E4S A03;
    public static E4S A04;
    public final E14 A00;
    public final C25026CUc A01;
    public final boolean A02;

    /* JADX WARNING: type inference failed for: r1v10, types: [X.C99, java.lang.Object] */
    public static C26766DCv A00(Bitmap.Config config, EAH eah, C25949CpH cpH, C25798CmA cmA, String str) {
        if (cmA.A03) {
            DRN A002 = cpH.A01.A00(config, eah.getWidth(), eah.getHeight());
            ((Bitmap) A002.A05()).eraseColor(0);
            ((Bitmap) A002.A05()).setHasAlpha(true);
            C25524ChM chM = new C25524ChM(eah);
            AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) ((C26752DCh) cpH.A00).A01;
            C99 c99 = animatedFactoryV2Impl.A06;
            C99 c992 = c99;
            if (c99 == null) {
                ? obj = new Object();
                animatedFactoryV2Impl.A06 = obj;
                c992 = obj;
            }
            new C26113Csb(new C26116Cse((Rect) null, chM, c992, animatedFactoryV2Impl.A0A), new C26753DCi(cpH, 1), cpH.A02).A03(0, (Bitmap) A002.A05());
            return new BSE(A002, C25112CYh.A03, 0, 0);
        }
        CNF cnf = new CNF(eah);
        cnf.A00 = str;
        return new BSC(new C25524ChM(cnf));
    }

    static {
        E4S e4s;
        E4S e4s2;
        try {
            e4s = (E4S) Class.forName("com.facebook.animated.gif.GifImage").newInstance();
        } catch (Throwable unused) {
            e4s = null;
        }
        A03 = e4s;
        try {
            e4s2 = (E4S) Class.forName("com.facebook.animated.webp.WebPImage").newInstance();
        } catch (Throwable unused2) {
            e4s2 = null;
        }
        A04 = e4s2;
    }

    public C25949CpH(E14 e14, C25026CUc cUc, boolean z) {
        this.A00 = e14;
        this.A01 = cUc;
        this.A02 = z;
    }
}
