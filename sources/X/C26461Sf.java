package X;

import com.whatsapp.media.WamediaManager;
import com.whatsapp.wamsys.JniBridge;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.1Sf  reason: invalid class name and case insensitive filesystem */
public abstract class C26461Sf {
    public final AnonymousClass00H A00;
    public final Map A01 = new HashMap();

    public static synchronized boolean A00(C70893Cx r2, C26461Sf r3, Object obj) {
        synchronized (r3) {
            Map map = r3.A01;
            if (!r2.equals(map.get(obj))) {
                return false;
            }
            map.remove(obj);
            ((ThreadPoolExecutor) r3.A00.get()).remove(r2);
            return true;
        }
    }

    public synchronized Runnable A02(Object obj) {
        return A04(obj, (Object) null);
    }

    public synchronized Runnable A03(Object obj) {
        Runnable runnable;
        C70893Cx r0 = (C70893Cx) this.A01.get(obj);
        if (r0 != null) {
            runnable = r0.A00;
        } else {
            runnable = null;
        }
        return runnable;
    }

    public synchronized Runnable A04(Object obj, Object obj2) {
        C70893Cx r1;
        Map map = this.A01;
        r1 = (C70893Cx) map.get(obj);
        if (r1 == null) {
            r1 = new C70893Cx(this, obj, obj2, A09(obj, obj2));
            map.put(obj, r1);
            ((ThreadPoolExecutor) this.A00.get()).execute(r1);
        }
        return r1.A00;
    }

    public synchronized HashSet A05() {
        return new HashSet(this.A01.keySet());
    }

    public synchronized void A07(Runnable runnable) {
        Iterator it = A05().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (runnable.equals(A03(next))) {
                A08(next);
                break;
            }
        }
    }

    public synchronized boolean A08(Object obj) {
        Map map = this.A01;
        C70893Cx r1 = (C70893Cx) map.get(obj);
        if (r1 == null) {
            return false;
        }
        r1.cancel();
        ((ThreadPoolExecutor) this.A00.get()).remove(r1);
        map.remove(obj);
        return true;
    }

    public Runnable A09(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this instanceof C26471Sg) {
            C26471Sg r1 = (C26471Sg) this;
            C62492rU r14 = (C62492rU) obj4;
            C17960vV.A07(r14);
            int A002 = r14.A00();
            if (A002 != 2) {
                C26421Sb r0 = r1.A00;
                AnonymousClass118 r29 = r0.A07;
                AnonymousClass11P r12 = r0.A06;
                if (A002 != 4) {
                    AnonymousClass11P r25 = r12;
                    C18030ve r26 = r0.A0A;
                    AnonymousClass1KB r24 = r0.A02;
                    AnonymousClass190 r23 = r0.A00;
                    AnonymousClass10I r22 = r0.A0Q;
                    C218617r r20 = r0.A01;
                    JniBridge jniBridge = r0.A0R;
                    AnonymousClass181 r21 = r0.A05;
                    C24421Kg r18 = r0.A0P;
                    WamediaManager wamediaManager = r0.A0G;
                    AnonymousClass1SJ r15 = r0.A0E;
                    AnonymousClass1SK r13 = r0.A0H;
                    AnonymousClass1SR r122 = r0.A0M;
                    AnonymousClass1ST r11 = r0.A08;
                    AnonymousClass1SW r10 = r0.A0N;
                    AnonymousClass1SX r9 = r0.A09;
                    AnonymousClass1SU r8 = r0.A0J;
                    AnonymousClass1SY r7 = r0.A0F;
                    AnonymousClass1KX r6 = r0.A0D;
                    AnonymousClass1SV r5 = r0.A0B;
                    C24371Kb r4 = r0.A0C;
                    C18010vc r3 = r0.A0O;
                    AnonymousClass1SZ r2 = r0.A0L;
                    C24421Kg r41 = r18;
                    AnonymousClass10I r42 = r22;
                    JniBridge jniBridge2 = jniBridge;
                    return new C167228ff(r23, r20, r24, r0.A04, r21, r25, r29, r11, r9, r26, r5, r4, r6, r15, r7, wamediaManager, r13, r8, r14, r0.A0K, r2, r122, r10, r3, r41, r42, jniBridge2);
                }
                AnonymousClass11P r28 = r12;
                C18030ve r27 = r0.A0A;
                AnonymousClass1KB r262 = r0.A02;
                AnonymousClass190 r252 = r0.A00;
                AnonymousClass10I r242 = r0.A0Q;
                C218617r r232 = r0.A01;
                JniBridge jniBridge3 = r0.A0R;
                AnonymousClass181 r212 = r0.A05;
                C24421Kg r202 = r0.A0P;
                WamediaManager wamediaManager2 = r0.A0G;
                AnonymousClass1SJ r30 = r0.A0E;
                AnonymousClass1SK r182 = r0.A0H;
                AnonymousClass1SR r17 = r0.A0M;
                AnonymousClass1ST r112 = r0.A08;
                AnonymousClass1SW r102 = r0.A0N;
                AnonymousClass1SX r92 = r0.A09;
                AnonymousClass1SU r82 = r0.A0J;
                AnonymousClass1SY r72 = r0.A0F;
                AnonymousClass1KX r62 = r0.A0D;
                AnonymousClass1SV r52 = r0.A0B;
                C24371Kb r43 = r0.A0C;
                C18010vc r32 = r0.A0O;
                AnonymousClass1SZ r210 = r0.A0L;
                C25311Ns r16 = r0.A04;
                C26411Sa r123 = r0.A0K;
                C18070vi.A0d(r29, 1);
                C18070vi.A0d(r28, 2);
                C18070vi.A0d(r27, 3);
                C18070vi.A0d(r262, 4);
                C18070vi.A0d(r252, 5);
                C18070vi.A0d(r242, 6);
                C18070vi.A0d(r232, 7);
                C18070vi.A0d(jniBridge3, 8);
                C18070vi.A0d(r212, 9);
                C18070vi.A0d(r202, 10);
                C18070vi.A0d(wamediaManager2, 11);
                C18070vi.A0d(r30, 12);
                C18070vi.A0d(r182, 13);
                C18070vi.A0d(r17, 14);
                C18070vi.A0d(r112, 15);
                C18070vi.A0d(r102, 16);
                C18070vi.A0d(r92, 17);
                C18070vi.A0d(r82, 18);
                C18070vi.A0d(r72, 19);
                C18070vi.A0d(r62, 20);
                C18070vi.A0d(r52, 21);
                C18070vi.A0d(r43, 22);
                C18070vi.A0d(r32, 23);
                C18070vi.A0d(r210, 24);
                C18070vi.A0d(r16, 25);
                C18070vi.A0d(r123, 26);
                C24421Kg r412 = r202;
                AnonymousClass10I r422 = r242;
                JniBridge jniBridge4 = jniBridge3;
                return new C167228ff(r252, r232, r262, r16, r212, r28, r29, r112, r92, r27, r52, r43, r62, r30, r72, wamediaManager2, r182, r82, r14, r123, r210, r17, r102, r32, r412, r422, jniBridge4);
            }
            C26421Sb r02 = r1.A00;
            AnonymousClass118 r272 = r02.A07;
            AnonymousClass11P r253 = r02.A06;
            C18030ve r263 = r02.A0A;
            AnonymousClass1KB r243 = r02.A02;
            AnonymousClass190 r233 = r02.A00;
            AnonymousClass10I r222 = r02.A0Q;
            C218617r r203 = r02.A01;
            JniBridge jniBridge5 = r02.A0R;
            AnonymousClass181 r213 = r02.A05;
            C24421Kg r183 = r02.A0P;
            WamediaManager wamediaManager3 = r02.A0G;
            AnonymousClass1SJ r152 = r02.A0E;
            AnonymousClass1SK r132 = r02.A0H;
            AnonymousClass1SR r124 = r02.A0M;
            AnonymousClass1ST r113 = r02.A08;
            AnonymousClass1SW r103 = r02.A0N;
            AnonymousClass1SX r93 = r02.A09;
            AnonymousClass1SU r83 = r02.A0J;
            AnonymousClass1SY r73 = r02.A0F;
            AnonymousClass1KX r63 = r02.A0D;
            AnonymousClass1SV r53 = r02.A0B;
            C24371Kb r44 = r02.A0C;
            C18010vc r33 = r02.A0O;
            AnonymousClass1SZ r211 = r02.A0L;
            C24421Kg r413 = r183;
            AnonymousClass10I r423 = r222;
            JniBridge jniBridge6 = jniBridge5;
            return new C167228ff(r233, r203, r243, r02.A04, r213, r253, r272, r113, r93, r263, r53, r44, r63, r152, r73, wamediaManager3, r132, r83, r14, r02.A0K, r211, r124, r103, r33, r413, r423, jniBridge6);
        } else if (this instanceof AnonymousClass2KA) {
            AnonymousClass2KA r19 = (AnonymousClass2KA) this;
            CXH cxh = (CXH) obj4;
            if (cxh != null) {
                return r19.A00.A00(cxh);
            }
            throw new NullPointerException("processMediaRequest is null");
        } else if (this instanceof AnonymousClass2K8) {
            C59112lm r34 = (C59112lm) obj3;
            C167258fi r142 = (C167258fi) obj4;
            C18070vi.A0d(r34, 0);
            if (r142 != null) {
                return r142;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C60662oP.A01(new AnonymousClass20F(getClass()).A00));
            sb.append("/makeRunnable: mediaDownload of message ");
            sb.append(r34.A00.A0v);
            sb.append(" is null");
            throw new NullPointerException(sb.toString());
        } else if ((this instanceof AnonymousClass2KB) || (this instanceof C36181nT)) {
            return (C167258fi) obj4;
        } else {
            if (this instanceof AnonymousClass2K9) {
                C24927CQa cQa = (C24927CQa) obj4;
                AnonymousClass2YT r03 = ((AnonymousClass2K9) this).A00;
                C17960vV.A07(cQa);
                C18070vi.A0X(cQa);
                return new C27085DTk((WamediaManager) r03.A00.A00.ABs.get(), cQa);
            }
            Runnable runnable = (Runnable) obj4;
            C17960vV.A07(runnable);
            return runnable;
        }
    }

    public C26461Sf(AnonymousClass00H r2) {
        this.A00 = r2;
    }

    public void A06(AnonymousClass1TI r3) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            r3.accept(it.next());
        }
    }
}
