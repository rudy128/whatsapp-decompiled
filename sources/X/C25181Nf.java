package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1Nf  reason: invalid class name and case insensitive filesystem */
public class C25181Nf implements C201511a {
    public List A00;
    public Map A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass1MZ A03;
    public final AnonymousClass12M A04;
    public final AnonymousClass10I A05;
    public final Object A06 = new Object();
    public final C24921Me A07;
    public final C25161Nd A08;

    public static boolean A00(AnonymousClass1BI r2, List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1605388w r0 = (C1605388w) it.next();
            if (r0 != null && !r0.BLC(r2)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass1E7 A01(AnonymousClass1BI r5) {
        AnonymousClass1E7 A0H = this.A02.A0H(r5);
        C24921Me r2 = this.A07;
        AnonymousClass1BI r1 = A0H.A0J;
        if (C22971Dz.A0e(r1) && !C22971Dz.A0c(r1) && (r2.A0j(A0H, -1) || TextUtils.isEmpty(A0H.A0X))) {
            this.A05.CGF(new AnonymousClass3C4(this, A0H, r5, 13));
        }
        return A0H;
    }

    public ArrayList A02(int i) {
        ArrayList A062 = this.A08.A06();
        ArrayList arrayList = new ArrayList(Math.min(A062.size(), i));
        for (int i2 = 0; i2 < A062.size() && arrayList.size() < i; i2++) {
            A062.get(i2);
            AnonymousClass1E7 A012 = A01((AnonymousClass1BI) A062.get(i2));
            if (!TextUtils.isEmpty(A012.A0K())) {
                arrayList.add(A012);
            }
        }
        return arrayList;
    }

    public List A03() {
        List list;
        synchronized (this.A06) {
            if (this.A00 == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.A00 = copyOnWriteArrayList;
                AnonymousClass1M9 r3 = this.A02;
                AnonymousClass1M2 r5 = r3.A04;
                AnonymousClass1M2.A0C(r5, copyOnWriteArrayList, 0, false, false, false, true, C18020vd.A05(C18040vf.A02, r5.A06, 11565));
                AnonymousClass1M9.A01(r3, copyOnWriteArrayList);
            }
            list = this.A00;
        }
        return list;
    }

    public Map A04() {
        Map map;
        AnonymousClass1BI r1;
        synchronized (this.A06) {
            if (this.A01 == null) {
                List<AnonymousClass1E7> A032 = A03();
                this.A01 = new HashMap(A032.size(), 1.0f);
                for (AnonymousClass1E7 r7 : A032) {
                    Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
                    AnonymousClass1E7 r0 = (AnonymousClass1E7) this.A01.get(r7.A06(cls));
                    if ((r0 == null || r0.A0J() > r7.A0J()) && (r1 = (AnonymousClass1BI) r7.A06(cls)) != null) {
                        this.A01.put(r1, r7);
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.A08.A06().iterator();
                while (it.hasNext()) {
                    AnonymousClass1BI r2 = (AnonymousClass1BI) it.next();
                    if (this.A01.get(r2) == null) {
                        AnonymousClass1E7 A012 = A01(r2);
                        arrayList.add(A012);
                        this.A01.put(r2, A012);
                    }
                }
                List list = this.A00;
                C17960vV.A07(list);
                list.addAll(arrayList);
            }
            map = this.A01;
        }
        return map;
    }

    public C25181Nf(AnonymousClass1M9 r2, C24921Me r3, C25161Nd r4, AnonymousClass1MZ r5, AnonymousClass12M r6, AnonymousClass10I r7) {
        this.A05 = r7;
        this.A02 = r2;
        this.A07 = r3;
        this.A08 = r4;
        this.A04 = r6;
        this.A03 = r5;
    }
}
