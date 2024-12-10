package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9nG  reason: invalid class name and case insensitive filesystem */
public class C191829nG {
    public boolean A00;
    public final Context A01;
    public final AnonymousClass9WO A02;
    public final ExecutorService A03 = Executors.newSingleThreadExecutor();
    public final AtomicInteger A04 = new AtomicInteger(0);
    public final C21591Amf A05;
    public final A1G A06;
    public final A0C A07;
    public final AtomicBoolean A08 = new AtomicBoolean(false);
    public final C181949Sl A09;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.9Sl, java.lang.Object] */
    public C191829nG(Context context, AnonymousClass9P1 r10, AnonymousClass9WO r11, List list, int i, int i2) {
        AnonymousClass9WO r2 = r11;
        this.A06 = new A1G(r11);
        this.A01 = context;
        this.A02 = r11;
        ? obj = new Object();
        this.A09 = obj;
        this.A07 = new A0C(context, r10, r11, obj);
        C21429Ajw ajw = new C21429Ajw(this);
        if (!this.A00) {
            this.A03.execute(ajw);
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C22489B9v) it.next()).CJL(this);
            }
        }
        C21591Amf amf = new C21591Amf(r2, this.A04, this.A06, this.A07, i, i2);
        this.A05 = amf;
        amf.start();
    }

    public void A00() {
        C21429Ajw ajw = new C21429Ajw(this, 26);
        if (!this.A00) {
            this.A03.execute(ajw);
        }
    }
}
