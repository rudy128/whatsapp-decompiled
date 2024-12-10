package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Ajj  reason: case insensitive filesystem */
public class C21416Ajj implements Runnable {
    public final AppWidgetManager A00;
    public final Context A01;
    public final AnonymousClass1XL A02;
    public final C25161Nd A03;
    public final C18000vb A04;
    public final AnonymousClass1CJ A05;
    public final AnonymousClass1R3 A06;
    public final AnonymousClass1LU A07;
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final int[] A09;
    public final AnonymousClass1KB A0A;
    public final C18030ve A0B;

    public void run() {
        AtomicBoolean atomicBoolean = this.A08;
        if (!atomicBoolean.get()) {
            ArrayList A0B2 = this.A03.A0B();
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A0B2.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                if (!atomicBoolean.get()) {
                    int A032 = this.A05.A03(A0Q);
                    if (A032 > 0) {
                        A13.addAll(this.A06.A07(A0Q, Math.min(A032, 100)));
                    }
                } else {
                    return;
                }
            }
            Collections.sort(A13, new C147027Rn(30));
            C21453AkK akK = new C21453AkK(this, A13, 7);
            if (C18020vd.A05(C18040vf.A02, this.A0B, 12208)) {
                akK.run();
            } else {
                this.A0A.A0J(akK);
            }
        }
    }

    public C21416Ajj(AppWidgetManager appWidgetManager, Context context, AnonymousClass1KB r4, AnonymousClass1XL r5, C25161Nd r6, C18000vb r7, AnonymousClass1CJ r8, AnonymousClass1R3 r9, C18030ve r10, AnonymousClass1LU r11, int[] iArr) {
        this.A0B = r10;
        this.A01 = context;
        this.A0A = r4;
        this.A07 = r11;
        this.A05 = r8;
        this.A02 = r5;
        this.A04 = r7;
        this.A00 = appWidgetManager;
        this.A06 = r9;
        this.A03 = r6;
        this.A09 = iArr;
    }
}
