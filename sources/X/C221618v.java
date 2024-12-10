package X;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.18v  reason: invalid class name and case insensitive filesystem */
public class C221618v {
    public static final AnonymousClass115 A03 = new C65262w6(0);
    public static final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final Context A00;
    public final C221918y A01;
    public final AnonymousClass114 A02;

    public static void A03(C220518k r2) {
        List list = r2.A00;
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            r2.A00();
            return;
        }
        throw new IllegalStateException();
    }

    public C221618v(AnonymousClass114 r3) {
        Context context;
        this.A02 = r3;
        List list = r3.BSz().A00;
        if (list.isEmpty()) {
            context = AnonymousClass114.A00();
        } else {
            context = (Context) list.get(list.size() - 1);
        }
        this.A00 = context;
        this.A01 = new C221918y(this, r3);
    }

    public static C217617h A00(Class cls) {
        Integer A012 = AnonymousClass12S.A01(cls);
        if (A012 != null) {
            return new C217617h(A012.intValue());
        }
        throw new AssertionError("Looks like you hit the fallback method.  Please see https://fburl.com/wiki/g9sq37h7 for what this means and how to fix it.");
    }

    public static Object A01(int i) {
        Object obj;
        Context A002 = AnonymousClass114.A00();
        C221718w.A00(A002);
        AnonymousClass114 r8 = AnonymousClass114.get(A002);
        ConcurrentHashMap concurrentHashMap = A04;
        Integer valueOf = Integer.valueOf(i);
        Object obj2 = concurrentHashMap.get(valueOf);
        if (obj2 != null) {
            return obj2;
        }
        ConcurrentHashMap concurrentHashMap2 = C221818x.A00;
        concurrentHashMap2.putIfAbsent(valueOf, valueOf);
        Object obj3 = concurrentHashMap2.get(valueOf);
        synchronized (obj3) {
            obj = concurrentHashMap.get(obj3);
            if (obj == null) {
                C220818n BYf = r8.BYf();
                AnonymousClass115 r1 = A03;
                Class<C221618v> cls = C221618v.class;
                Map map = BYf.A00.A00;
                Object obj4 = map.get(cls);
                if (obj4 == null) {
                    synchronized (map) {
                        try {
                            obj4 = map.get(cls);
                            if (obj4 == null) {
                                obj4 = r1.Bha(BYf);
                                map.put(cls, obj4);
                            }
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error creating the scope ");
                            sb.append(cls.getCanonicalName());
                            throw new IllegalStateException(sb.toString(), e);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
                C221618v r4 = (C221618v) obj4;
                C220518k BSz = r4.A02.BSz();
                BSz.A00.add(AnonymousClass114.A00());
                BSz.A01.add(r4.A01);
                AnonymousClass113 BN6 = r8.BN6();
                AnonymousClass12Q.A05(BN6);
                try {
                    obj = C449725m.A00(i, BN6.BYf(), AnonymousClass114.A00());
                    if (obj != null) {
                        concurrentHashMap.put(obj3, obj);
                    }
                    AnonymousClass12Q.A04();
                    A03(BSz);
                } catch (Throwable th2) {
                    th = th2;
                    AnonymousClass12Q.A04();
                    A03(BSz);
                    throw th;
                }
            }
        }
        return obj;
    }

    public static Object A02(Class cls) {
        Integer A012 = AnonymousClass12S.A01(cls);
        if (A012 != null) {
            return A01(A012.intValue());
        }
        throw new AssertionError("Looks like you hit the fallback method.  Please see https://fburl.com/wiki/g9sq37h7 for what this means and how to fix it.");
    }
}
