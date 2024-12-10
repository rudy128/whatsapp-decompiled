package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1fO  reason: invalid class name and case insensitive filesystem */
public final class C31331fO implements C218917u {
    public AtomicReference A00 = new AtomicReference();
    public final C18030ve A01;
    public final AnonymousClass10I A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final C18100vl A04 = new C18110vm(new C31341fP(this));
    public final AtomicReference A05 = new AtomicReference();

    public C31331fO(C18030ve r3, AnonymousClass10I r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        this.A01 = r3;
        this.A02 = r4;
    }

    public /* synthetic */ void BzP() {
    }

    public static final void A00(C31331fO r1) {
        AtomicReference atomicReference = r1.A05;
        atomicReference.get();
        Runnable runnable = (Runnable) atomicReference.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void A01(Runnable runnable) {
        if (((Boolean) this.A04.getValue()).booleanValue()) {
            Log.i("PassiveModeManager/onConnectedPassiveMode");
            AtomicReference atomicReference = this.A00;
            Runnable runnable2 = (Runnable) atomicReference.getAndSet((Object) null);
            if (runnable2 != null) {
                this.A02.CEz(runnable2);
            }
            if (!this.A03.get()) {
                Log.i("PassiveModeManager/onConnectedPassiveMode offline-resume is not running, sending active-iq");
                runnable.run();
                return;
            }
            this.A05.set(runnable);
            int A002 = C18020vd.A00(C18040vf.A02, this.A01, 7470);
            atomicReference.set(this.A02.CGv(new AnonymousClass7RM((Object) this, A002, 21), ((long) A002) * 1000));
        }
    }

    public final boolean A02() {
        if (!this.A03.get() || !((Boolean) this.A04.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public void BzQ(Integer num, Integer num2) {
        this.A03.set(true);
    }

    public void BzR() {
        if (((Boolean) this.A04.getValue()).booleanValue()) {
            Runnable runnable = (Runnable) this.A00.getAndSet((Object) null);
            if (runnable != null) {
                this.A02.CEz(runnable);
            }
            this.A03.set(false);
            Log.i("PassiveModeManager/onHandlerOfflineProcessComplete sending active-iq");
            A00(this);
        }
    }
}
