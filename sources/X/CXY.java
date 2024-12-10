package X;

import android.app.ProgressDialog;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class CXY {
    public final SparseArray A00;
    public final E86 A01;
    public final A58 A02 = A58.A00();
    public final C185219cE A03;
    public final WeakReference A04;
    public final WeakReference A05;
    public final WeakReference A06;
    public final AtomicBoolean A07;
    public final C25545Chi A08;
    public final C24970CRu A09;
    public final String A0A;
    public final Map A0B;

    /* JADX WARNING: type inference failed for: r4v2, types: [X.E86, java.lang.Object] */
    public SparseArray A00() {
        C26960DNi dNi;
        SparseArray clone = this.A00.clone();
        C24970CRu cRu = this.A09;
        C26012CqT cqT = cRu.A00;
        if (cqT == null) {
            CMB cmb = cRu.A01;
            ? obj = new Object();
            C65792x7 r3 = cRu.A02;
            cqT = new C26012CqT(obj, r3, new CQK(new CWI(r3, cRu.A03)), cmb);
            cRu.A00 = cqT;
        }
        clone.put(2131428152, cqT);
        HashMap A11 = C17880vN.A11();
        Map map = this.A0B;
        if (map != null && !map.isEmpty()) {
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                A11.put(A16.getKey(), ((E6V) A16.getValue()).BM8());
            }
        }
        clone.put(2131428169, A11);
        HashMap A112 = C17880vN.A11();
        String str = this.A0A;
        if (str != null) {
            C25545Chi chi = this.A08;
            synchronized (chi) {
                String str2 = chi.A01;
                boolean z = false;
                if (str2 != null && !str2.equals(str)) {
                    z = true;
                }
                dNi = chi.A00;
                if (dNi == null || z) {
                    chi.A01 = str;
                    dNi = new C26960DNi(new C25653Cjj());
                    chi.A00 = dNi;
                }
            }
            A112.put("gs", dNi);
        }
        A112.put("ls", new Object());
        A112.put("acq", new C26961DNj(cqT));
        clone.put(2131428161, A112);
        clone.put(2131428249, this.A04.get());
        clone.put(2131428251, this.A06.get());
        clone.put(2131428250, this.A05.get());
        clone.put(2131428253, this.A02);
        clone.put(2131428252, C17880vN.A11());
        clone.put(2131428241, this.A03);
        clone.put(2131428248, this);
        return clone;
    }

    public CXY(AnonymousClass01E r2, AnonymousClass1GP r3, AnonymousClass2ZZ r4, C25545Chi chi, C24970CRu cRu, CMC cmc, C185219cE r8, String str, Map map, boolean z) {
        this.A0A = str;
        this.A04 = AnonymousClass3MW.A0z(r2);
        this.A05 = AnonymousClass3MW.A0z(r3);
        this.A06 = AnonymousClass3MW.A0z(new ProgressDialog(r2));
        this.A0B = map;
        this.A03 = r8;
        this.A09 = cRu;
        this.A07 = BE6.A16(true);
        C24454C4u.A00 = cmc;
        this.A01 = new DNI(this, r4, cmc, z);
        this.A08 = chi;
        this.A00 = BE6.A0Q();
    }
}
