package X;

import android.content.Context;
import android.database.Cursor;
import androidx.work.OverwritingInputMerger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.Aka  reason: case insensitive filesystem */
public class C21469Aka implements Runnable {
    public static final String A0I = A5Z.A01("WorkerWrapper");
    public Context A00;
    public AnonymousClass00I A01;
    public C180129Lg A02 = new C162168Jj();
    public C20001A2q A03;
    public C185329cP A04;
    public WorkDatabase A05;
    public B4Q A06;
    public C22400B6d A07;
    public A2t A08;
    public BD8 A09;
    public C113975oM A0A = new Object();
    public C71973Kb A0B;
    public String A0C;
    public List A0D;
    public E0T A0E;
    public final C113975oM A0F = new Object();
    public final String A0G;
    public volatile int A0H = -256;

    private void A00() {
        String str;
        boolean z;
        BD8 bd8 = this.A09;
        String str2 = this.A0G;
        Integer BZd = bd8.BZd(str2);
        Integer num = AnonymousClass00R.A01;
        A5Z A002 = A5Z.A00();
        String str3 = A0I;
        StringBuilder A0o = AnonymousClass8BW.A0o("Status for ", str2);
        if (BZd == num) {
            AnonymousClass8BW.A16(A002, " is RUNNING; not doing any work and rescheduling for later execution", str3, A0o);
            z = true;
        } else {
            A0o.append(" is ");
            if (BZd != null) {
                str = C196349ut.A00(BZd);
            } else {
                str = "null";
            }
            A0o.append(str);
            AnonymousClass8BW.A16(A002, " ; not doing any work", str3, A0o);
            z = false;
        }
        A01(z);
    }

    private void A01(boolean z) {
        AHX A002;
        Cursor A003;
        WorkDatabase workDatabase = this.A05;
        workDatabase.A07();
        try {
            boolean z2 = false;
            A002 = A3D.A00("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            C20076A6c a6c = ((C20365AHv) workDatabase.A0E()).A02;
            a6c.A06();
            A003 = AnonymousClass9OB.A00(a6c, A002, false);
            if (A003.moveToFirst() && A003.getInt(0) != 0) {
                z2 = true;
            }
            A003.close();
            A002.A00();
            if (!z2) {
                C197039w3.A00(this.A00, RescheduleReceiver.class, false);
            }
            if (z) {
                BD8 bd8 = this.A09;
                Integer num = AnonymousClass00R.A00;
                String str = this.A0G;
                bd8.CKr(num, str);
                bd8.CKt(str, this.A0H);
                bd8.Biq(str, -1);
            }
            workDatabase.A08();
            C20076A6c.A02(workDatabase);
            this.A0A.A05(Boolean.valueOf(z));
        } catch (Throwable th) {
            C20076A6c.A02(workDatabase);
            throw th;
        }
    }

    public static boolean A02(C21469Aka aka) {
        if (aka.A0H == -256) {
            return false;
        }
        A5Z A002 = A5Z.A00();
        String str = A0I;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Work interrupted for ");
        AnonymousClass8BW.A16(A002, aka.A0C, str, A10);
        Integer BZd = aka.A09.BZd(aka.A0G);
        if (BZd == null) {
            aka.A01(false);
            return true;
        }
        aka.A01(!C196349ut.A01(BZd));
        return true;
    }

    public void A04() {
        WorkDatabase workDatabase = this.A05;
        workDatabase.A07();
        try {
            String str = this.A0G;
            LinkedList A14 = AnonymousClass8BR.A14();
            A14.add(str);
            while (!A14.isEmpty()) {
                String str2 = (String) A14.remove();
                BD8 bd8 = this.A09;
                if (bd8.BZd(str2) != AnonymousClass00R.A0j) {
                    bd8.CKr(AnonymousClass00R.A0N, str2);
                }
                A14.addAll(this.A07.BQV(str2));
            }
            A6Y a6y = ((C162168Jj) this.A02).A00;
            BD8 bd82 = this.A09;
            bd82.CFq(str, this.A08.A00);
            bd82.CJo(a6y, str);
            workDatabase.A08();
        } finally {
            C20076A6c.A02(workDatabase);
            A01(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r8v4, types: [androidx.work.WorkerParameters, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v62, types: [java.util.concurrent.Executor, java.lang.Object] */
    public void run() {
        String str;
        A5Z A002;
        String str2;
        StringBuilder A10;
        String str3;
        A6Y A003;
        Class cls;
        Object newInstance;
        byte[] bArr;
        boolean z;
        C20076A6c a6c;
        C19955A0m a0m;
        BDc A012;
        List list = this.A0D;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str4 = this.A0G;
        sb.append(str4);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(A0v);
        }
        this.A0C = AnonymousClass000.A0y(" } ]", sb);
        if (!A02(this)) {
            WorkDatabase workDatabase = this.A05;
            workDatabase.A07();
            try {
                A2t a2t = this.A08;
                Integer num = a2t.A0G;
                Integer num2 = AnonymousClass00R.A00;
                if (num != num2) {
                    A00();
                    workDatabase.A08();
                    A5Z A004 = A5Z.A00();
                    String str5 = A0I;
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append(a2t.A0I);
                    AnonymousClass8BW.A16(A004, " is not in ENQUEUED state. Nothing more to do", str5, A102);
                } else if ((a2t.A06 != 0 || a2t.A02 > 0) && System.currentTimeMillis() < a2t.A00()) {
                    A5Z.A00().A03(A0I, AnonymousClass8BS.A0l(a2t.A0I, "Delaying execution for %s because it is being executed before schedule.", new Object[1], 0));
                    A01(true);
                    workDatabase.A08();
                } else {
                    workDatabase.A08();
                    C20076A6c.A02(workDatabase);
                    if (a2t.A06 != 0) {
                        A003 = a2t.A0C;
                    } else {
                        str = a2t.A0H;
                        try {
                            Object newInstance2 = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            C18070vi.A0z(newInstance2, "null cannot be cast to non-null type androidx.work.InputMerger");
                            C180119Lf r8 = (C180119Lf) newInstance2;
                            if (r8 != null) {
                                ArrayList<A6Y> A13 = AnonymousClass000.A13();
                                A13.add(a2t.A0C);
                                AHX A005 = A3D.A00("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                                A005.BDB(1, str4);
                                C20076A6c a6c2 = ((C20365AHv) this.A09).A02;
                                a6c2.A06();
                                Cursor A006 = AnonymousClass9OB.A00(a6c2, A005, false);
                                try {
                                    ArrayList A0w = AnonymousClass8BV.A0w(A006);
                                    while (A006.moveToNext()) {
                                        if (A006.isNull(0)) {
                                            bArr = null;
                                        } else {
                                            bArr = A006.getBlob(0);
                                        }
                                        A0w.add(A6Y.A00(bArr));
                                    }
                                    A006.close();
                                    A005.A00();
                                    A13.addAll(A0w);
                                    if (r8 instanceof OverwritingInputMerger) {
                                        C192939pH r7 = new C192939pH();
                                        LinkedHashMap A132 = C17880vN.A13();
                                        for (A6Y a6y : A13) {
                                            Map unmodifiableMap = Collections.unmodifiableMap(a6y.A00);
                                            C18070vi.A0X(unmodifiableMap);
                                            A132.putAll(unmodifiableMap);
                                        }
                                        r7.A02(A132);
                                        A003 = r7.A00();
                                    } else {
                                        C192939pH r12 = new C192939pH();
                                        HashMap A11 = C17880vN.A11();
                                        for (A6Y a6y2 : A13) {
                                            Map unmodifiableMap2 = Collections.unmodifiableMap(a6y2.A00);
                                            C18070vi.A0X(unmodifiableMap2);
                                            Iterator A15 = AnonymousClass000.A15(unmodifiableMap2);
                                            while (true) {
                                                if (A15.hasNext()) {
                                                    Map.Entry A16 = AnonymousClass000.A16(A15);
                                                    Object key = A16.getKey();
                                                    Object value = A16.getValue();
                                                    if (value == null || (cls = value.getClass()) == null) {
                                                        cls = String.class;
                                                    }
                                                    Object obj = A11.get(key);
                                                    C18070vi.A0V(key);
                                                    if (obj != null) {
                                                        Class<?> cls2 = obj.getClass();
                                                        if (C18070vi.A18(cls2, cls)) {
                                                            C18070vi.A0X(value);
                                                            int length = Array.getLength(obj);
                                                            int length2 = Array.getLength(value);
                                                            Class<?> componentType = cls2.getComponentType();
                                                            C18070vi.A0b(componentType);
                                                            newInstance = Array.newInstance(componentType, length + length2);
                                                            System.arraycopy(obj, 0, newInstance, 0, length);
                                                            System.arraycopy(value, 0, newInstance, length, length2);
                                                        } else if (C18070vi.A18(cls2.getComponentType(), cls)) {
                                                            int length3 = Array.getLength(obj);
                                                            newInstance = Array.newInstance(cls, length3 + 1);
                                                            System.arraycopy(obj, 0, newInstance, 0, length3);
                                                            Array.set(newInstance, length3, value);
                                                        } else {
                                                            throw new IllegalArgumentException();
                                                        }
                                                    } else if (!cls.isArray()) {
                                                        newInstance = Array.newInstance(cls, 1);
                                                        Array.set(newInstance, 0, value);
                                                    } else {
                                                        C18070vi.A0a(value);
                                                        A11.put(key, value);
                                                    }
                                                    C18070vi.A0X(newInstance);
                                                    value = newInstance;
                                                    C18070vi.A0a(value);
                                                    A11.put(key, value);
                                                }
                                            }
                                        }
                                        r12.A02(A11);
                                        A003 = r12.A00();
                                    }
                                } catch (Throwable th) {
                                    A006.close();
                                    A005.A00();
                                    throw th;
                                }
                            }
                        } catch (Exception e) {
                            A5Z.A00().A08(C181989Sq.A00, AnonymousClass001.A1H("Trouble instantiating ", str, AnonymousClass000.A10()), e);
                        }
                        A002 = A5Z.A00();
                        str2 = A0I;
                        A10 = AnonymousClass000.A10();
                        str3 = "Could not create Input Merger ";
                        A10.append(str3);
                        A002.A04(str2, AnonymousClass000.A0y(str, A10));
                        A04();
                        return;
                    }
                    UUID fromString = UUID.fromString(str4);
                    C185329cP r14 = this.A04;
                    int i = a2t.A02;
                    AnonymousClass00I r1 = this.A01;
                    Executor executor = r1.A08;
                    C71973Kb r5 = this.A0B;
                    C198879z4 r11 = r1.A06;
                    C20347AHd aHd = new C20347AHd(workDatabase, r5);
                    C20345AHb aHb = new C20345AHb(workDatabase, this.A06, r5);
                    ? obj2 = new Object();
                    obj2.A08 = fromString;
                    obj2.A01 = A003;
                    obj2.A07 = AnonymousClass8BR.A12(list);
                    obj2.A05 = r14;
                    obj2.A00 = i;
                    obj2.A09 = executor;
                    obj2.A06 = r5;
                    obj2.A04 = r11;
                    obj2.A03 = aHd;
                    obj2.A02 = aHb;
                    C20001A2q a2q = this.A03;
                    if (a2q == null) {
                        Context context = this.A00;
                        str = a2t.A0I;
                        a2q = r11.A01(context, obj2, str);
                        this.A03 = a2q;
                        if (a2q == null) {
                            A002 = A5Z.A00();
                            str2 = A0I;
                            A10 = AnonymousClass000.A10();
                            str3 = "Could not create Worker ";
                            A10.append(str3);
                            A002.A04(str2, AnonymousClass000.A0y(str, A10));
                            A04();
                            return;
                        }
                    }
                    if (a2q.A02) {
                        A002 = A5Z.A00();
                        str2 = A0I;
                        A10 = AnonymousClass000.A10();
                        A10.append("Received an already-used Worker ");
                        A10.append(a2t.A0I);
                        str = "; Worker Factory should return new instances";
                        A002.A04(str2, AnonymousClass000.A0y(str, A10));
                        A04();
                        return;
                    }
                    a2q.A02 = true;
                    workDatabase.A07();
                    BD8 bd8 = this.A09;
                    if (bd8.BZd(str4) == num2) {
                        bd8.CKr(AnonymousClass00R.A01, str4);
                        C20365AHv aHv = (C20365AHv) bd8;
                        a6c = aHv.A02;
                        a6c.A06();
                        a0m = aHv.A04;
                        A012 = C20076A6c.A01(a6c, a0m, str4);
                        AHW.A00(a6c, A012);
                        C20076A6c.A02(a6c);
                        a0m.A02(A012);
                        bd8.CKt(str4, -256);
                        z = true;
                    } else {
                        z = false;
                    }
                    workDatabase.A08();
                    C20076A6c.A02(workDatabase);
                    if (!z) {
                        A00();
                        return;
                    } else if (!A02(this)) {
                        C21472Akd akd = new C21472Akd(this.A00, obj2.A02, this.A03, a2t, r5);
                        C20367AHx aHx = (C20367AHx) r5;
                        Executor executor2 = aHx.A02;
                        executor2.execute(akd);
                        DMs dMs = (DMs) akd.A03;
                        C113975oM r3 = this.A0F;
                        r3.BBG(new C21471Akc(this, (EEC) dMs, 19), new Object());
                        dMs.BBG(new C21471Akc(this, (EEC) dMs, 20), executor2);
                        r3.BBG(new C21452AkJ(1, this.A0C, this), aHx.A01);
                        return;
                    } else {
                        return;
                    }
                }
                C20076A6c.A02(workDatabase);
            } catch (Throwable th2) {
                C20076A6c.A02(workDatabase);
                throw th2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.5oM, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.5oM, java.lang.Object] */
    public C21469Aka(C188179h0 r2) {
        this.A00 = r2.A00;
        this.A0B = r2.A06;
        this.A06 = r2.A04;
        A2t a2t = r2.A05;
        this.A08 = a2t;
        this.A0G = a2t.A0M;
        this.A04 = r2.A02;
        this.A03 = null;
        AnonymousClass00I r0 = r2.A01;
        this.A01 = r0;
        this.A0E = r0.A03;
        WorkDatabase workDatabase = r2.A03;
        this.A05 = workDatabase;
        this.A09 = workDatabase.A0E();
        this.A07 = this.A05.A09();
        this.A0D = r2.A07;
    }

    public void A03() {
        boolean z;
        boolean z2;
        A2t a2t;
        C20076A6c a6c;
        C19955A0m a0m;
        BDc A012;
        AHX A022;
        Cursor A002;
        if (!A02(this)) {
            WorkDatabase workDatabase = this.A05;
            workDatabase.A07();
            try {
                BD8 bd8 = this.A09;
                String str = this.A0G;
                Integer BZd = bd8.BZd(str);
                workDatabase.A0D().BIB(str);
                if (BZd == null) {
                    A01(false);
                } else {
                    if (BZd == AnonymousClass00R.A01) {
                        C180129Lg r1 = this.A02;
                        if (r1 instanceof C162178Jk) {
                            A5Z A003 = A5Z.A00();
                            String str2 = A0I;
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Worker result SUCCESS for ");
                            A003.A05(str2, AnonymousClass000.A0y(this.A0C, A10));
                            a2t = this.A08;
                            if (a2t.A06 == 0) {
                                workDatabase.A07();
                                try {
                                    bd8.CKr(AnonymousClass00R.A0C, str);
                                    bd8.CJo(((C162178Jk) this.A02).A00, str);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    C22400B6d b6d = this.A07;
                                    Iterator it = b6d.BQV(str).iterator();
                                    while (it.hasNext()) {
                                        String A0v = C17880vN.A0v(it);
                                        if (bd8.BZd(A0v) == AnonymousClass00R.A0Y) {
                                            boolean z3 = true;
                                            A022 = A3D.A02("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", A0v);
                                            C20076A6c a6c2 = ((C20360AHq) b6d).A01;
                                            a6c2.A06();
                                            boolean z4 = false;
                                            A002 = AnonymousClass9OB.A00(a6c2, A022, false);
                                            if (A002.moveToFirst()) {
                                                if (A002.getInt(0) == 0) {
                                                    z3 = false;
                                                }
                                                z4 = z3;
                                            }
                                            A002.close();
                                            A022.A00();
                                            if (z4) {
                                                A5Z.A00().A05(str2, AnonymousClass001.A1H("Setting status to enqueued for ", A0v, AnonymousClass000.A10()));
                                                bd8.CKr(AnonymousClass00R.A00, A0v);
                                                bd8.CJI(A0v, currentTimeMillis);
                                            }
                                        }
                                    }
                                    workDatabase.A08();
                                    C20076A6c.A02(workDatabase);
                                    A01(false);
                                } catch (Throwable th) {
                                    th = th;
                                    C20076A6c.A02(workDatabase);
                                    A01(false);
                                    throw th;
                                }
                            }
                        } else {
                            boolean z5 = r1 instanceof C162158Ji;
                            A5Z A004 = A5Z.A00();
                            String str3 = A0I;
                            if (z5) {
                                StringBuilder A102 = AnonymousClass000.A10();
                                A102.append("Worker result RETRY for ");
                                A004.A05(str3, AnonymousClass000.A0y(this.A0C, A102));
                            } else {
                                StringBuilder A103 = AnonymousClass000.A10();
                                A103.append("Worker result FAILURE for ");
                                A004.A05(str3, AnonymousClass000.A0y(this.A0C, A103));
                                a2t = this.A08;
                                if (a2t.A06 == 0) {
                                    A04();
                                }
                            }
                        }
                        workDatabase.A07();
                        z2 = false;
                        try {
                            bd8.CJI(str, System.currentTimeMillis());
                            bd8.CKr(AnonymousClass00R.A00, str);
                            C20365AHv aHv = (C20365AHv) bd8;
                            a6c = aHv.A02;
                            a6c.A06();
                            a0m = aHv.A06;
                            A012 = C20076A6c.A01(a6c, a0m, str);
                            AHW.A00(a6c, A012);
                            C20076A6c.A02(a6c);
                            a0m.A02(A012);
                            bd8.CFq(str, a2t.A00);
                            a6c.A06();
                            a0m = aHv.A03;
                            A012 = C20076A6c.A01(a6c, a0m, str);
                            AHW.A00(a6c, A012);
                            C20076A6c.A02(a6c);
                            a0m.A02(A012);
                            bd8.Biq(str, -1);
                            workDatabase.A08();
                            C20076A6c.A02(workDatabase);
                            A01(z2);
                        } catch (Throwable th2) {
                            th = th2;
                            C20076A6c.A02(workDatabase);
                            A01(z);
                            throw th;
                        }
                    } else if (!C196349ut.A01(BZd)) {
                        this.A0H = -512;
                    }
                    workDatabase.A07();
                    z2 = true;
                    bd8.CKr(AnonymousClass00R.A00, str);
                    bd8.CJI(str, System.currentTimeMillis());
                    bd8.CFq(str, this.A08.A00);
                    bd8.Biq(str, -1);
                    workDatabase.A08();
                    C20076A6c.A02(workDatabase);
                    A01(z2);
                }
                workDatabase.A08();
            } finally {
                C20076A6c.A02(workDatabase);
            }
        }
    }
}
