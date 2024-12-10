package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.9ui  reason: invalid class name and case insensitive filesystem */
public class C196259ui {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public BDN A03;
    public String A04;
    public final ArrayList A05 = AnonymousClass000.A13();
    public final HashMap A06 = C17880vN.A11();
    public final CopyOnWriteArrayList A07 = new CopyOnWriteArrayList();

    public synchronized void A00(String str) {
        BDN bdn = this.A03;
        if (bdn != null) {
            bdn.Bix(str, 123);
        }
        this.A07.add(str);
    }

    public synchronized void A01(String str) {
        BDN bdn = this.A03;
        if (bdn != null) {
            bdn.Bix(str, 123);
        }
        this.A07.add(str);
    }

    public synchronized void A02(String str) {
        BDN bdn = this.A03;
        if (bdn != null) {
            bdn.Bix(str, 123);
        }
        this.A07.add(str);
    }

    public synchronized void A03(String str) {
        this.A05.add(str);
        this.A07.add(AnonymousClass000.A0y("-success", AnonymousClass000.A11(str)));
    }

    public synchronized void A04(String str, int i) {
        int i2;
        HashMap hashMap = this.A06;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.intValue();
        }
        Integer valueOf = Integer.valueOf(i2 + 1);
        hashMap.put(str, valueOf);
        this.A00 = i;
        this.A04 = str;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A07;
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append("-error-");
        A11.append(valueOf);
        copyOnWriteArrayList.add(AnonymousClass001.A1I("-", A11, i));
    }

    public boolean A05(String str) {
        Number A1D = C108945cZ.A1D(str, this.A06);
        if (this.A05.contains(str)) {
            return false;
        }
        if (A1D == null || A1D.intValue() < 3) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.A07.toString();
    }
}
