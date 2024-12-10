package X;

import android.view.Choreographer;
import androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0Vc  reason: invalid class name and case insensitive filesystem */
public final class C05640Vc implements C17860vL {
    public static final Choreographer A00 = ((Choreographer) AnonymousClass4Z4.A01(C23871Hy.A00().A0E(), new DefaultChoreographerFrameClock$choreographer$1((C30391dr) null)));
    public static final C05640Vc A01 = new Object();

    public /* synthetic */ C23801Hr getKey() {
        return AnonymousClass0EJ.A00();
    }

    public Object CSE(C30391dr r4, C22821Di r5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        C31781g7 r2 = new C31781g7(1, C30581eB.A02(r4));
        r2.A0F();
        AnonymousClass0RT r1 = new AnonymousClass0RT(r5, r2);
        A00.postFrameCallback(r1);
        r2.Bdu(new C09830hM(r1));
        return r2.A0C();
    }

    public Object fold(Object obj, AnonymousClass1OS r3) {
        return C04770Os.A00(this, obj, r3);
    }

    public C18570wi get(C23801Hr r2) {
        return C04770Os.A01(this, r2);
    }

    public C18560wh minusKey(C23801Hr r2) {
        return C04770Os.A02(this, r2);
    }

    public C18560wh plus(C18560wh r2) {
        return C04770Os.A03(this, r2);
    }
}
