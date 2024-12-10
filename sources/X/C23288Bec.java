package X;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Bec  reason: case insensitive filesystem */
public final class C23288Bec extends BG6 {
    public final /* synthetic */ C26909DIq A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23288Bec(Looper looper, C26909DIq dIq) {
        super(looper);
        this.A00 = dIq;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            CLD cld = (CLD) message.obj;
            C26909DIq dIq = this.A00;
            Lock lock = dIq.A0D;
            lock.lock();
            try {
                if (dIq.A0E == cld.A00) {
                    if (cld instanceof BZX) {
                        BZX bzx = (BZX) cld;
                        C26905DIm dIm = bzx.A00;
                        C23074Bap bap = bzx.A01;
                        if (C26905DIm.A07(dIm, 0)) {
                            C23203Bcx bcx = bap.A01;
                            if (bcx.A01 == 0) {
                                C23136Bbp bbp = bap.A02;
                                C18210vx.A00(bbp);
                                bcx = bbp.A02;
                                if (bcx.A01 == 0) {
                                    dIm.A04 = true;
                                    IAccountAccessor A002 = bbp.A00();
                                    C18210vx.A00(A002);
                                    dIm.A00 = A002;
                                    dIm.A05 = bbp.A03;
                                    dIm.A06 = bbp.A04;
                                } else {
                                    String valueOf = String.valueOf(String.valueOf(bcx));
                                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                                    C26905DIm.A02(bcx, dIm);
                                }
                            } else {
                                if (dIm.A02 && !bcx.A00()) {
                                    C26905DIm.A03(dIm);
                                }
                                C26905DIm.A02(bcx, dIm);
                            }
                            C26905DIm.A04(dIm);
                        }
                    } else if (cld instanceof BZV) {
                        ((BZV) cld).A00.C3H(new C23203Bcx(16, (PendingIntent) null));
                    } else if (cld instanceof BZW) {
                        BZW bzw = (BZW) cld;
                        C26905DIm.A02(bzw.A00, (C26905DIm) bzw.A01.A01);
                    } else {
                        ((BZU) cld).A00.CSq(1);
                    }
                }
            } finally {
                lock.unlock();
            }
        } else if (i != 2) {
            Log.w("GACStateManager", AnonymousClass001.A1I("Unknown message id: ", AnonymousClass000.A10(), i));
        } else {
            throw ((Throwable) message.obj);
        }
    }
}
