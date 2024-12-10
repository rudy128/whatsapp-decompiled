package X;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.DIl  reason: case insensitive filesystem */
public final class C26904DIl implements EA6 {
    public final C26909DIq A00;

    public C26904DIl(C26909DIq dIq) {
        this.A00 = dIq;
    }

    public final void CSo(Bundle bundle) {
    }

    public final void CSp(C23203Bcx bcx, C24924CPx cPx, boolean z) {
    }

    public final void CSq(int i) {
    }

    public final void CSr() {
    }

    public final void CSc(BZL bzl) {
        this.A00.A05.A0F.add(bzl);
    }

    public final BZL CSd(BZL bzl) {
        throw AnonymousClass000.A0n("GoogleApiClient is not connected yet.");
    }

    public final void CSi() {
        C26909DIq dIq = this.A00;
        Iterator A0l = C17890vO.A0l(dIq.A09);
        while (A0l.hasNext()) {
            ((EDS) A0l.next()).BIn();
        }
        dIq.A05.A03 = Collections.emptySet();
    }

    public final void CSk() {
        C26909DIq dIq = this.A00;
        Lock lock = dIq.A0D;
        lock.lock();
        try {
            CTL ctl = dIq.A08;
            Map map = dIq.A0B;
            dIq.A0E = new C26905DIm(dIq.A02, dIq.A03, dIq.A04, dIq, ctl, map, lock);
            dIq.A0E.CSi();
            dIq.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
