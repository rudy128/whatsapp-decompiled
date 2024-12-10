package X;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1;

/* renamed from: X.0gg  reason: invalid class name and case insensitive filesystem */
public final class C09420gg extends AnonymousClass11G implements C18090vk {
    public static final C09420gg A00 = new C09420gg();

    public C09420gg() {
        super(0);
    }

    public static final C18560wh A00() {
        Choreographer choreographer;
        if (AnonymousClass000.A1Z(Looper.myLooper(), Looper.getMainLooper())) {
            choreographer = Choreographer.getInstance();
        } else {
            choreographer = (Choreographer) AnonymousClass4Z4.A01(C23871Hy.A00(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1((C30391dr) null));
        }
        C15290qO r1 = new C15290qO(AnonymousClass9O8.A00(Looper.getMainLooper()), choreographer, (AnonymousClass1Y1) null);
        return r1.plus(r1.A0F());
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return A00();
    }
}
