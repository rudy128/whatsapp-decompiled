package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Rj  reason: invalid class name and case insensitive filesystem */
public class C26241Rj implements C26231Ri {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final AnonymousClass11S A01;
    public final C25111Mx A02;
    public final AnonymousClass1CJ A03;
    public final C24751Ln A04;
    public final C18030ve A05;
    public final C25241Nl A06;
    public final C25011Mn A07;
    public final C25431Oe A08;
    public final AnonymousClass10I A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final HashMap A0C = new HashMap();
    public final Set A0D = new HashSet();
    public final Set A0E = new HashSet();
    public final ConcurrentHashMap A0F = new ConcurrentHashMap();
    public final AnonymousClass11P A0G;
    public final AnonymousClass00H A0H;

    public static C52502b1 A00(AnonymousClass1BI r1, C26241Rj r2) {
        byte[] bArr;
        C58962lX A052;
        C22941Dw r0 = UserJid.Companion;
        UserJid A012 = C22941Dw.A01(r1);
        if (A012 == null || (A052 = r2.A02.A05(A012)) == null) {
            bArr = null;
        } else {
            bArr = A052.A01;
        }
        return new C52502b1(bArr);
    }

    public static boolean A02(long j) {
        if (j == 0 || j + 25000 <= SystemClock.elapsedRealtime()) {
            return false;
        }
        return true;
    }

    public int A04(AnonymousClass1BI r2) {
        C43371zh r0 = (C43371zh) this.A0F.get(r2);
        if (r0 != null) {
            return r0.A03;
        }
        return 0;
    }

    public int A05(AnonymousClass1BI r2) {
        C43371zh r0 = (C43371zh) this.A0F.get(r2);
        if (r0 != null) {
            return r0.A02;
        }
        return 2;
    }

    public int A06(AnonymousClass1BI r5, UserJid userJid) {
        C53722cz r2;
        C43371zh r22 = (C43371zh) this.A0F.get(r5);
        if (r22 == null) {
            return -1;
        }
        if (userJid != null && C22971Dz.A0e(r5)) {
            HashMap hashMap = r22.A06;
            if (hashMap == null || (r2 = (C53722cz) hashMap.get(userJid)) == null || !A02(r2.A01)) {
                return -1;
            }
            return r2.A00;
        } else if (A02(r22.A04)) {
            return r22.A01;
        } else {
            return -1;
        }
    }

    public long A07(AnonymousClass1BI r3) {
        C43371zh r0 = (C43371zh) this.A0F.get(r3);
        if (r0 == null) {
            return 0;
        }
        return r0.A05;
    }

    public GroupJid A08(AnonymousClass1BI r6, int i, long j) {
        HashMap hashMap;
        C53722cz r0;
        ConcurrentHashMap concurrentHashMap = this.A0F;
        C43371zh r3 = (C43371zh) concurrentHashMap.get(r6);
        if (r3 == null) {
            r3 = new C43371zh();
            concurrentHashMap.put(r6, r3);
        }
        if (j == 0) {
            r3.A05 = 0;
        } else {
            r3.A05 = j;
        }
        r3.A04 = 0;
        r3.A02 = i;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (C22971Dz.A0e((Jid) entry.getKey()) && (hashMap = ((C43371zh) entry.getValue()).A06) != null && (r0 = (C53722cz) hashMap.get(r6)) != null) {
                r0.A01 = 0;
                C36321nh r02 = GroupJid.Companion;
                return C36321nh.A00((Jid) entry.getKey());
            }
        }
        return null;
    }

    public void A09() {
        Iterator it = new HashSet(this.A0E).iterator();
        while (it.hasNext()) {
            AnonymousClass4SY r1 = ((C85044Lw) it.next()).A00;
            C18070vi.A0d(r1, 0);
            r1.A00();
        }
        ConcurrentHashMap concurrentHashMap = this.A0F;
        HashSet hashSet = new HashSet(concurrentHashMap.keySet());
        concurrentHashMap.clear();
        HashMap hashMap = this.A0C;
        for (AnonymousClass3C5 removeCallbacks : hashMap.values()) {
            this.A00.removeCallbacks(removeCallbacks);
        }
        hashMap.clear();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((C35751mk) this.A0A.get()).A00((AnonymousClass1BI) it2.next());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.2cz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.2cz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: X.2cz} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.AnonymousClass1BI r6, com.whatsapp.jid.UserJid r7) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r5.A0F
            java.lang.Object r4 = r0.get(r6)
            X.1zh r4 = (X.C43371zh) r4
            if (r4 != 0) goto L_0x0012
            X.1zh r4 = new X.1zh
            r4.<init>()
            r0.put(r6, r4)
        L_0x0012:
            r2 = 0
            if (r7 == 0) goto L_0x003b
            boolean r0 = X.C22971Dz.A0e(r6)
            if (r0 == 0) goto L_0x003b
            java.util.HashMap r0 = r4.A06
            if (r0 != 0) goto L_0x0027
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.A06 = r0
        L_0x0027:
            java.lang.Object r1 = r0.get(r7)
            X.2cz r1 = (X.C53722cz) r1
            if (r1 != 0) goto L_0x0039
            X.2cz r1 = new X.2cz
            r1.<init>()
            java.util.HashMap r0 = r4.A06
            r0.put(r7, r1)
        L_0x0039:
            r1.A01 = r2
        L_0x003b:
            r4.A04 = r2
            if (r7 != 0) goto L_0x0053
            java.lang.String r1 = r6.getRawString()
        L_0x0043:
            java.util.HashMap r0 = r5.A0C
            java.lang.Object r1 = r0.get(r1)
            X.3C5 r1 = (X.AnonymousClass3C5) r1
            if (r1 == 0) goto L_0x0052
            android.os.Handler r0 = r5.A00
            r0.removeCallbacks(r1)
        L_0x0052:
            return
        L_0x0053:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r6.getRawString()
            r1.append(r0)
            java.lang.String r0 = r7.getRawString()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26241Rj.A0C(X.1BI, com.whatsapp.jid.UserJid):void");
    }

    public void A0D(AnonymousClass1BI r4, boolean z) {
        ConcurrentHashMap concurrentHashMap = this.A0F;
        C43371zh r2 = (C43371zh) concurrentHashMap.get(r4);
        if (r2 == null) {
            r2 = new C43371zh();
            concurrentHashMap.put(r4, r2);
        }
        r2.A03 = z ? 1 : 0;
        if (!z) {
            r2.A05 = 0;
        }
    }

    public C26241Rj(AnonymousClass11S r3, C25111Mx r4, AnonymousClass11P r5, AnonymousClass1CJ r6, C24751Ln r7, C18030ve r8, C25241Nl r9, C25011Mn r10, C25431Oe r11, AnonymousClass10I r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        this.A0G = r5;
        this.A05 = r8;
        this.A01 = r3;
        this.A09 = r12;
        this.A0H = r13;
        this.A03 = r6;
        this.A07 = r10;
        this.A08 = r11;
        this.A04 = r7;
        this.A0A = r14;
        this.A06 = r9;
        this.A02 = r4;
        this.A0B = r15;
    }

    public static void A01(AnonymousClass1BI r3, AnonymousClass1EC r4, C52502b1 r5, C26241Rj r6) {
        if (r6.A04(r3) == 1) {
            return;
        }
        if (r6.A07.A05(r3, r4, r5.A00)) {
            r6.A0D(r3, true);
            r6.A0D.remove(r3);
            return;
        }
        r6.A0D.add(r3);
    }

    public static boolean A03(AnonymousClass1BI r2) {
        int type;
        if (C42701yb.A01(r2) || C22971Dz.A0N(r2) || (!C22971Dz.A00 ? (r2 instanceof C173458v6) || (r2 instanceof C42541yL) : r2 != null && ((type = r2.getType()) == 8 || type == 7)) || C22971Dz.A0c(r2) || C22971Dz.A0V(r2) || C22971Dz.A0S(r2)) {
            return false;
        }
        return true;
    }

    public void A0A(AnonymousClass1BI r8) {
        C43371zh r5;
        HashMap hashMap;
        if (C22971Dz.A0e(r8) && (r5 = (C43371zh) this.A0F.get(r8)) != null && (hashMap = r5.A06) != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((C53722cz) entry.getValue()).A01 = 0;
                StringBuilder sb = new StringBuilder();
                sb.append(r8.getRawString());
                sb.append(((Jid) entry.getKey()).getRawString());
                AnonymousClass3C5 r1 = (AnonymousClass3C5) this.A0C.get(sb.toString());
                if (r1 != null) {
                    this.A00.removeCallbacks(r1);
                }
            }
            r5.A04 = 0;
        }
    }

    public void A0B(AnonymousClass1BI r4) {
        if (A03(r4) && A04(r4) != 1) {
            this.A09.CGM(new AnonymousClass2PQ(this.A04, r4, this), new Void[0]);
        }
    }

    public boolean A0E(AnonymousClass1BI r7) {
        C43371zh r0;
        if (C22971Dz.A0e(r7) || ((r0 = (C43371zh) this.A0F.get(r7)) != null && r0.A05 == 1)) {
            return true;
        }
        return false;
    }
}
