package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.DIo  reason: case insensitive filesystem */
public final class C26907DIo implements C28578E8o {
    public final /* synthetic */ C26908DIp A00;

    public /* synthetic */ C26907DIo(C26908DIp dIp) {
        this.A00 = dIp;
    }

    public final void CSh(int i) {
        C26908DIp dIp = this.A00;
        Lock lock = dIp.A0B;
        lock.lock();
        try {
            if (dIp.A04) {
                dIp.A04 = false;
                dIp.A07.CSh(i);
                dIp.A03 = null;
                dIp.A02 = null;
            } else {
                dIp.A04 = true;
                dIp.A08.onConnectionSuspended(i);
            }
        } finally {
            lock.unlock();
        }
    }

    public final void CSa(C23203Bcx bcx) {
        C26908DIp dIp = this.A00;
        Lock lock = dIp.A0B;
        lock.lock();
        try {
            dIp.A03 = bcx;
            C26908DIp.A02(dIp);
        } finally {
            lock.unlock();
        }
    }

    public final void CSe(Bundle bundle) {
        C26908DIp dIp = this.A00;
        Lock lock = dIp.A0B;
        lock.lock();
        try {
            dIp.A03 = C23203Bcx.A04;
            C26908DIp.A02(dIp);
        } finally {
            lock.unlock();
        }
    }
}
