package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7Pu  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7Pu implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ AnonymousClass70T A01;
    public final /* synthetic */ AnonymousClass791 A02;
    public final /* synthetic */ File A03;

    public final void run() {
        AnonymousClass791 r5 = this.A02;
        File file = this.A03;
        double d = this.A00;
        AnonymousClass70T r4 = this.A01;
        if (d == 0.0d) {
            d = 43.0d;
        }
        ArrayList A022 = AnonymousClass70j.A02(file, (int) d);
        ArrayList A0g = C108975cc.A0g(A022);
        Iterator it = A022.iterator();
        while (it.hasNext()) {
            A0g.add(Float.valueOf(((float) ((Number) it.next()).byteValue()) / 100.0f));
        }
        AnonymousClass7RO.A01(r5.A02.A0G, r5, A0g, r4, 30);
    }

    public /* synthetic */ AnonymousClass7Pu(AnonymousClass70T r1, AnonymousClass791 r2, File file, double d) {
        this.A02 = r2;
        this.A03 = file;
        this.A00 = d;
        this.A01 = r1;
    }
}
