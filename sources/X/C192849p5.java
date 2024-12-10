package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9p5  reason: invalid class name and case insensitive filesystem */
public class C192849p5 {
    public double A00;
    public int A01;
    public AnonymousClass9LV A02;
    public boolean A03;
    public final int A04;
    public final C180189Lm A05;
    public final BA6 A06;
    public final A4D A07;
    public final Map A08 = C17880vN.A11();
    public final Map A09 = C17880vN.A11();
    public final AnonymousClass9OY A0A;

    public synchronized boolean A00() {
        return this.A07.A02;
    }

    public synchronized String toString() {
        StringBuilder A10;
        A10 = AnonymousClass000.A10();
        A10.append("ExternalLoadRequest{, operationId='");
        A10.append(this.A07.A01);
        A10.append('\'');
        A10.append(", mAssetIdToResultMap=");
        A10.append(this.A09);
        A10.append(", mOverallProgress=");
        A10.append(this.A00);
        A10.append(", isPrefetch=");
        A10.append(A00());
        A10.append(", mFirstException=");
        A10.append(this.A02);
        A10.append(", mFinished=");
        A10.append(this.A03);
        A10.append(", mAssetLoadsCompleted=");
        A10.append(this.A01);
        return C17890vO.A0b(A10);
    }

    public C192849p5(C180189Lm r5, BA6 ba6, AnonymousClass9OY r7, A4D a4d, List list) {
        this.A06 = ba6;
        this.A05 = r5;
        this.A0A = r7;
        this.A07 = a4d;
        this.A04 = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C20282AEq) it.next()).A01.A0A;
            if (!this.A09.containsKey(str)) {
                this.A09.put(str, (Object) null);
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Id already present: ");
                throw AnonymousClass001.A12(str, A10);
            }
        }
    }
}
