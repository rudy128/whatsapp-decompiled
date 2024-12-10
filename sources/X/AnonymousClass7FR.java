package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7FR  reason: invalid class name */
public class AnonymousClass7FR implements C1606589k {
    public final /* synthetic */ AnonymousClass64Q A00;
    public final /* synthetic */ C131066kS A01;
    public final /* synthetic */ AtomicBoolean A02;

    public void BoI(C125816bj r1) {
    }

    public void Br6(D3j d3j, AnonymousClass1BI r2) {
    }

    public AnonymousClass7FR(AnonymousClass64Q r1, C131066kS r2, AtomicBoolean atomicBoolean) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = atomicBoolean;
    }

    public void BoH(C125806bi r6) {
        Iterator it = r6.A00.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((AnonymousClass7PZ) it.next()).A00.A0I;
        }
        this.A00.A02 = Long.valueOf((j / 10000000) * 10000000);
        this.A02.set(true);
        this.A01.A08.A07.remove(this);
    }

    public AnonymousClass7FR() {
    }
}
