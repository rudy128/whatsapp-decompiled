package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;

public final class BPB extends CUU {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final SparseArray A07;
    public final SparseBooleanArray A08;

    public final void A00(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.A08;
        if (sparseBooleanArray.get(i) == z) {
            return;
        }
        if (z) {
            sparseBooleanArray.put(i, true);
        } else {
            sparseBooleanArray.delete(i);
        }
    }

    public BPB(BPC bpc) {
        this.A06 = bpc.A06;
        this.A05 = bpc.A05;
        this.A04 = bpc.A04;
        this.A03 = bpc.A03;
        this.A0A = bpc.A0A;
        this.A09 = bpc.A09;
        this.A08 = bpc.A08;
        this.A07 = bpc.A07;
        this.A0F = bpc.A0F;
        this.A0E = bpc.A0E;
        this.A0P = bpc.A0P;
        this.A0L = bpc.A0L;
        this.A0D = bpc.A0D;
        this.A0I = bpc.A0I;
        this.A0B = bpc.A0B;
        this.A02 = bpc.A02;
        this.A01 = bpc.A01;
        this.A0J = bpc.A0J;
        this.A0K = bpc.A0K;
        this.A0C = bpc.A0C;
        this.A00 = bpc.A00;
        this.A0O = bpc.A0O;
        this.A0N = bpc.A0N;
        this.A0M = bpc.A0M;
        this.A0H = AnonymousClass8BR.A12(bpc.A0H);
        this.A0G = BE6.A10(bpc.A0G);
        this.A06 = bpc.A08;
        this.A02 = bpc.A04;
        this.A03 = bpc.A05;
        this.A05 = bpc.A07;
        this.A00 = bpc.A00;
        this.A01 = bpc.A03;
        this.A04 = bpc.A06;
        SparseArray sparseArray = bpc.A01;
        SparseArray A0Q = BE6.A0Q();
        for (int i = 0; i < sparseArray.size(); i++) {
            A0Q.put(sparseArray.keyAt(i), BE6.A10((Map) sparseArray.valueAt(i)));
        }
        this.A07 = A0Q;
        this.A08 = bpc.A02.clone();
    }

    public /* bridge */ /* synthetic */ void A01(String[] strArr) {
        String A002;
        AnonymousClass2AI builder = AnonymousClass1IX.builder();
        String str = strArr[0];
        C26056CrS.A01(str);
        if (str == null) {
            A002 = null;
        } else {
            try {
                A002 = new Locale(str).getISO3Language();
            } catch (MissingResourceException unused) {
                A002 = C24603CBh.A00(str);
            }
        }
        builder.add((Object) A002);
        this.A0K = builder.build();
    }

    public BPB() {
        this.A07 = BE6.A0Q();
        this.A08 = new SparseBooleanArray();
        this.A06 = true;
        this.A02 = false;
        this.A03 = true;
        this.A05 = true;
        this.A01 = true;
    }
}
