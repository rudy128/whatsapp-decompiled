package X;

import com.whatsapp.util.Log;

/* renamed from: X.7yz  reason: invalid class name and case insensitive filesystem */
public final class C157997yz extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C31761g5 $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157997yz(C31761g5 r2) {
        super(1);
        this.$continuation = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        Throwable th = (Throwable) obj;
        if (this.$continuation.Be2()) {
            C31761g5 r2 = this.$continuation;
            if (th == null) {
                try {
                    th = AnonymousClass000.A0n("Unknown error during cancellation");
                } catch (Throwable th2) {
                    obj2 = C108945cZ.A1J(th2);
                }
            }
            r2.resumeWith(new C30671eK(C108945cZ.A1J(th)));
            obj2 = C27621Wu.A00;
            Throwable A00 = C30671eK.A00(obj2);
            if (A00 != null) {
                Log.e("EmojiSearchProvider/searchAwait/Unable to set failure state and resume.", A00);
            }
        }
        return C27621Wu.A00;
    }
}
