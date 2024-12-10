package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.DIn  reason: case insensitive filesystem */
public final class C26906DIn implements C28578E8o {
    public final /* synthetic */ C26908DIp A00;

    public /* synthetic */ C26906DIn(C26908DIp dIp) {
        this.A00 = dIp;
    }

    public final void CSh(int i) {
        C23203Bcx bcx;
        C26908DIp dIp = this.A00;
        Lock lock = dIp.A0B;
        lock.lock();
        try {
            if (dIp.A04 || (bcx = dIp.A03) == null || bcx.A01 != 0) {
                dIp.A04 = false;
                dIp.A07.CSh(i);
                dIp.A03 = null;
                dIp.A02 = null;
            } else {
                dIp.A04 = true;
                dIp.A09.onConnectionSuspended(i);
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
            dIp.A02 = bcx;
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
            Bundle bundle2 = dIp.A01;
            if (bundle2 == null) {
                dIp.A01 = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            dIp.A02 = C23203Bcx.A04;
            C26908DIp.A02(dIp);
        } finally {
            lock.unlock();
        }
    }
}
