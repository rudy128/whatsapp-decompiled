package X;

import android.util.Pair;
import com.facebook.common.util.TriState;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.CwE  reason: case insensitive filesystem */
public class C26269CwE {
    public float A00;
    public int A01;
    public DDI A02;
    public C22849BSb A03;
    public Closeable A04;
    public final Object A05;
    public final CopyOnWriteArraySet A06 = new CopyOnWriteArraySet();
    public final /* synthetic */ DDF A07;

    private synchronized C24271ByU A00() {
        C24271ByU byU;
        C24271ByU byU2;
        byU = C24271ByU.LOW;
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            DDI ddi = (DDI) ((ECs) ((Pair) it.next()).second);
            synchronized (ddi) {
                byU2 = ddi.A00;
            }
            if (byU.ordinal() <= byU2.ordinal()) {
                byU = byU2;
            }
        }
        return byU;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.ArrayList A01(X.C26269CwE r3) {
        /*
            monitor-enter(r3)
            X.DDI r2 = r3.A02     // Catch:{ all -> 0x0023 }
            if (r2 != 0) goto L_0x0008
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x0008:
            boolean r1 = r3.A06()     // Catch:{ all -> 0x0023 }
            monitor-enter(r2)     // Catch:{ all -> 0x0023 }
            boolean r0 = r2.A02     // Catch:{ all -> 0x0020 }
            if (r1 != r0) goto L_0x0013
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x001d
        L_0x0013:
            r2.A02 = r1     // Catch:{ all -> 0x0020 }
            java.util.List r0 = r2.A0A     // Catch:{ all -> 0x0020 }
            java.util.ArrayList r0 = X.C17880vN.A10(r0)     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            monitor-exit(r3)
            return r0
        L_0x0020:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26269CwE.A01(X.CwE):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.ArrayList A02(X.C26269CwE r3) {
        /*
            monitor-enter(r3)
            X.DDI r2 = r3.A02     // Catch:{ all -> 0x0023 }
            if (r2 != 0) goto L_0x0008
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x0008:
            boolean r1 = r3.A07()     // Catch:{ all -> 0x0023 }
            monitor-enter(r2)     // Catch:{ all -> 0x0023 }
            boolean r0 = r2.A03     // Catch:{ all -> 0x0020 }
            if (r1 != r0) goto L_0x0013
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x001d
        L_0x0013:
            r2.A03 = r1     // Catch:{ all -> 0x0020 }
            java.util.List r0 = r2.A0A     // Catch:{ all -> 0x0020 }
            java.util.ArrayList r0 = X.C17880vN.A10(r0)     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            monitor-exit(r3)
            return r0
        L_0x0020:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26269CwE.A02(X.CwE):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.ArrayList A03(X.C26269CwE r3) {
        /*
            monitor-enter(r3)
            X.DDI r2 = r3.A02     // Catch:{ all -> 0x0023 }
            if (r2 != 0) goto L_0x0008
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x0008:
            X.ByU r1 = r3.A00()     // Catch:{ all -> 0x0023 }
            monitor-enter(r2)     // Catch:{ all -> 0x0023 }
            X.ByU r0 = r2.A00     // Catch:{ all -> 0x0020 }
            if (r1 != r0) goto L_0x0013
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x001d
        L_0x0013:
            r2.A00 = r1     // Catch:{ all -> 0x0020 }
            java.util.List r0 = r2.A0A     // Catch:{ all -> 0x0020 }
            java.util.ArrayList r0 = X.C17880vN.A10(r0)     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            monitor-exit(r3)
            return r0
        L_0x0020:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26269CwE.A03(X.CwE):java.util.ArrayList");
    }

    public static void A04(TriState triState, C26269CwE cwE) {
        synchronized (cwE) {
            boolean z = true;
            C26208Cuj.A04(AnonymousClass000.A1X(cwE.A02));
            if (cwE.A03 != null) {
                z = false;
            }
            C26208Cuj.A04(z);
            CopyOnWriteArraySet copyOnWriteArraySet = cwE.A06;
            if (copyOnWriteArraySet.isEmpty()) {
                cwE.A07.A00(cwE, cwE.A05);
                return;
            }
            ECs eCs = (ECs) ((Pair) copyOnWriteArraySet.iterator().next()).second;
            DDI ddi = (DDI) eCs;
            C25256Cbv cbv = ddi.A07;
            String str = ddi.A09;
            C28605E9w e9w = ddi.A05;
            Object obj = ddi.A08;
            DDI ddi2 = new DDI(cwE.A00(), ((DDI) eCs).A04, e9w, ddi.A06, cbv, obj, str, cwE.A07(), cwE.A06());
            cwE.A02 = ddi2;
            ddi2.CD3(eCs.BRV());
            if (triState.isSet()) {
                cwE.A02.CD2("started_as_prefetch", Boolean.valueOf(triState.asBoolean()));
            }
            C22849BSb bSb = new C22849BSb(cwE);
            cwE.A03 = bSb;
            DDI ddi3 = cwE.A02;
            cwE.A07.A00.CCn(bSb, ddi3);
        }
    }

    private synchronized boolean A06() {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            if (((ECs) ((Pair) it.next()).second).BfB()) {
                return true;
            }
        }
        return false;
    }

    private synchronized boolean A07() {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            if (!((ECs) ((Pair) it.next()).second).Bfu()) {
                return false;
            }
        }
        return true;
    }

    public C26269CwE(DDF ddf, Object obj) {
        this.A07 = ddf;
        this.A05 = obj;
    }

    public static void A05(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                throw AnonymousClass8BR.A0x(e);
            }
        }
    }
}
