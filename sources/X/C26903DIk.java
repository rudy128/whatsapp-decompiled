package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.DIk  reason: case insensitive filesystem */
public final class C26903DIk implements EA6 {
    public final C26909DIq A00;

    public C26903DIk(C26909DIq dIq) {
        this.A00 = dIq;
    }

    public final void CSi() {
    }

    public final void CSo(Bundle bundle) {
    }

    public final void CSp(C23203Bcx bcx, C24924CPx cPx, boolean z) {
    }

    public final BZL CSd(BZL bzl) {
        try {
            C26909DIq dIq = this.A00;
            BZB bzb = dIq.A05;
            C25541Che che = bzb.A09;
            che.A01.add(bzl);
            bzl.A09.set(che.A00);
            C24599CAv cAv = bzl.A00;
            EDS eds = (EDS) bzb.A0D.get(cAv);
            C18210vx.A02(eds, "Appropriate Api was not requested.");
            if (eds.isConnected() || !dIq.A0A.containsKey(cAv)) {
                bzl.A08(eds);
                return bzl;
            }
            bzl.CIq(new Status(17, (String) null));
            return bzl;
        } catch (DeadObjectException unused) {
            C26909DIq dIq2 = this.A00;
            C108955ca.A1F(dIq2.A06, new BZU(this, this), 1);
            return bzl;
        }
    }

    public final void CSk() {
    }

    public final void CSq(int i) {
        C26909DIq dIq = this.A00;
        dIq.A00((C23203Bcx) null);
        dIq.A07.CSh(i);
    }

    public final void CSr() {
        this.A00.A00((C23203Bcx) null);
    }

    public final void CSc(BZL bzl) {
        CSd(bzl);
    }
}
