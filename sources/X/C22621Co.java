package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Co  reason: invalid class name and case insensitive filesystem */
public class C22621Co implements C201511a {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass00H A01;
    public final C22611Cn A02;

    public void A05(C49502Qs r11, AnonymousClass1BI r12, Runnable runnable, String str, boolean z) {
        ((C31931gM) ((C28771as) this.A01.get()).A0L.get()).A01(new AnonymousClass3CO(this, r12, runnable, r11, str, 1, z), 6);
    }

    public static void A00(C22621Co r19, AnonymousClass1BI r20, AnonymousClass206 r21, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        StringBuilder sb;
        AnonymousClass205 r0;
        int i4;
        int i5;
        boolean z4;
        AnonymousClass205 r02;
        C22621Co r9 = r19;
        AnonymousClass1BI r14 = r20;
        C29691ci A0A = r9.A00.A0A(r14);
        AnonymousClass206 r2 = r21;
        if (A0A == null) {
            sb.append("ChatManager/setchatseen/nochat ");
            sb.append(r14);
            sb.append("/");
            if (r21 != null) {
                r02 = r2.A0v;
            } else {
                r02 = null;
            }
            sb.append(r02);
            Log.i(sb.toString());
            return;
        }
        sb = new StringBuilder();
        sb.append("ChatManager/setchatseen ");
        sb.append(r14);
        sb.append("/");
        sb.append(A0A.A0B());
        sb.append("/");
        if (r21 != null) {
            r0 = r2.A0v;
        } else {
            r0 = null;
        }
        sb.append(r0);
        sb.append("/");
        int i6 = i;
        sb.append(i6);
        Log.i(sb.toString());
        boolean z5 = true;
        boolean z6 = false;
        if (A0A.A0A == -1) {
            z6 = true;
        }
        if (r2 != null) {
            AnonymousClass00H r10 = r9.A01;
            AnonymousClass1NJ r3 = ((C28771as) r10.get()).A0C;
            AnonymousClass1BI r6 = r2.A0v.A00;
            C17960vV.A07(r6);
            i4 = r3.A01(r6, r2.A0y);
            C28761ar r32 = ((C28771as) r10.get()).A09;
            C17960vV.A07(r6);
            i5 = r32.A00(r6, r2.A0y);
        } else {
            i4 = 0;
            i5 = 0;
        }
        boolean A0K = A0A.A0K(i6, i2, i4, i5);
        long j = A0A.A0V;
        long j2 = A0A.A0O;
        if (j2 > j) {
            A0A.A0V = j2;
            A0A.A09 = 0;
            z4 = true;
        } else {
            z5 = A0K;
            z4 = false;
        }
        long A022 = AnonymousClass25A.A02(r2);
        long A03 = AnonymousClass25A.A03(r2);
        long j3 = A0A.A0S;
        if (A022 == 1) {
            A03 = A0A.A0Q;
            long j4 = A0A.A0X;
            if (A03 > j4) {
                A022 = A0A.A0P;
            } else {
                A03 = j4;
                A022 = A0A.A0W;
            }
        }
        if (j3 < A03 || z5 || A0A.A0P == 0) {
            if (A0A.A0P == 0) {
                AnonymousClass00H r33 = r9.A01;
                AnonymousClass1NK r03 = ((C28771as) r33.get()).A0B;
                AnonymousClass1BI r22 = A0A.A0u;
                A0A.A0P = r03.A04(r22);
                A0A.A0Q = ((C28771as) r33.get()).A0C.A06(r22);
                A0A.A0f = null;
            }
            if (A0A.A0N != 1) {
                A0A.A0N = 1;
            }
            A0A.A0R = A022;
            A0A.A0S = A03;
            long j5 = j;
            C22621Co r13 = r9;
            C29691ci r12 = A0A;
            ((C31931gM) ((C28771as) r9.A01.get()).A0L.get()).A01(new C70673Cb(r12, r13, r14, i3, j3, j5, z, z6, z2, z4, z3), 2);
        }
    }

    public static void A01(C22621Co r0, boolean z) {
        if (z) {
            AnonymousClass00H r1 = r0.A01;
            if (((C28771as) r1.get()).A04.A02() == 0 && !((C28771as) r1.get()).A06.A2Q()) {
                Log.i("chatMAnager/setChatArchived/Enabling archive2.0");
                ((C28771as) r1.get()).A05.A04();
            }
        }
    }

    public static void A02(C22621Co r5, boolean z) {
        boolean z2;
        synchronized (r5.A02) {
            AnonymousClass1CJ r3 = r5.A00;
            synchronized (r3) {
                z2 = r3.A00;
            }
            if (!z2) {
                AnonymousClass1EH r2 = new AnonymousClass1EH(r5);
                synchronized (r3) {
                    AnonymousClass1CJ.A01(r3);
                    boolean z3 = false;
                    if (r3.A04 == null) {
                        z3 = true;
                    }
                    C17960vV.A0D(z3);
                    r3.A04 = r2;
                    if (!z) {
                        AnonymousClass1CJ.A01(r3);
                    }
                }
            }
        }
    }

    public Long A03(AnonymousClass1BI r5) {
        AnonymousClass00H r3 = this.A01;
        Set A06 = ((C28771as) r3.get()).A02.A06(r5, false);
        Long A0b = ((C28771as) r3.get()).A0J.A0b(r5);
        C26811To r0 = ((C28771as) r3.get()).A02;
        if (A0b != null) {
            r0.A0R(A06);
            return A0b;
        }
        r0.A0Q(A06);
        return A0b;
    }

    public HashMap A04(List list) {
        Set keySet = AnonymousClass1Nb.A05(((C28771as) this.A01.get()).A0J, true).keySet();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI r1 = (AnonymousClass1BI) it.next();
            if (!C22971Dz.A0c(r1) && keySet.contains(r1)) {
                hashMap.put(r1, A03(r1));
            }
        }
        return hashMap;
    }

    public void A06(AnonymousClass1BI r5) {
        C29691ci A0A = this.A00.A0A(r5);
        if (A0A == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/reset-show-group-description/no chat ");
            sb.append(r5);
            Log.w(sb.toString());
        } else if (!A0A.A0t) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("msgstore/reset-show-group-description/nop ");
            sb2.append(r5);
            Log.i(sb2.toString());
        } else {
            A0A.A0t = false;
            ((C31931gM) ((C28771as) this.A01.get()).A0L.get()).A01(new AnonymousClass3Bx(this, A0A, 3), 5);
        }
    }

    public void A07(AnonymousClass1BI r4, int i, boolean z) {
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChatManager/updatePushRecordingButtonMode skipped, enabled=");
            sb.append(z);
            Log.i(sb.toString());
            return;
        }
        ((C28771as) this.A01.get()).A0K.CGS(new C21470Akb((Object) this, i, 48, (Object) r4), "ChatManager/updatePushRecordingButtonMode");
    }

    public void A08(AnonymousClass1BI r12, Integer num, boolean z, boolean z2) {
        StringBuilder sb;
        String str;
        C28771as r5 = (C28771as) this.A01.get();
        r5.A0K.CGF(new AnonymousClass7Q6(r5, r12, num, 1, z, z2));
        C29691ci A0A = this.A00.A0A(r12);
        if (A0A == null) {
            sb = new StringBuilder();
            str = "msgstore/archive/no chat ";
        } else if (A0A.A0l == z) {
            sb = new StringBuilder();
            str = "msgstore/archive/nop ";
        } else {
            A01(this, z);
            A0A.A0l = z;
            AnonymousClass1Q1 r3 = (AnonymousClass1Q1) r5.A0N.get();
            AnonymousClass1BI r2 = A0A.A0u;
            boolean z3 = A0A.A0l;
            C18070vi.A0d(r2, 0);
            if (z3) {
                r3.A00(r2);
            } else {
                r3.A01(r2);
            }
            ((C31931gM) r5.A0L.get()).A01(new AnonymousClass7RF(A0A, r5, 41, z), 3);
            return;
        }
        sb.append(str);
        sb.append(r12);
        sb.append(" ");
        sb.append(z);
        Log.w(sb.toString());
    }

    public void A09(AnonymousClass206 r13) {
        C29691ci A002;
        AnonymousClass1BI r7 = r13.A0v.A00;
        if (r7 != null && (A002 = AnonymousClass1CJ.A00(this.A00, r7)) != null && A002.A0S >= r13.A0y) {
            AnonymousClass00H r1 = this.A01;
            int A003 = ((C28771as) r1.get()).A0C.A00((C199410f) ((C26061Qr) ((C28771as) r1.get()).A0S.get()).A01.getValue(), r7, r13.A0y, A002.A0Q);
            if (A002.A0C <= A003) {
                A002.A0K(A002.A0A + 1, A002.A0B, A003 + 1, A002.A08);
                StringBuilder sb = new StringBuilder();
                sb.append("ChatManager/setMessageUnseen unseenRowCount=");
                sb.append(A003);
                sb.append(" unseenMessageCount=");
                sb.append(A002.A0A);
                sb.append(" unseenImportantMessageCount=");
                sb.append(A002.A08);
                sb.append(" message=");
                sb.append(r13);
                Log.i(sb.toString());
                ((C31931gM) ((C28771as) r1.get()).A0L.get()).A01(new AnonymousClass3C4(this, A002, r7, 5), 2);
            }
        }
    }

    public boolean A0B(AnonymousClass1BI r8) {
        C29691ci A0A = this.A00.A0A(r8);
        if (A0A == null) {
            return false;
        }
        if (A0A.A0A == 0 && A0A.A0B == 0 && A0A.A0S == Math.max(A0A.A0Q, A0A.A0X) && A0A.A0O <= A0A.A0V) {
            return false;
        }
        return true;
    }

    public C22621Co(AnonymousClass1CJ r1, C22611Cn r2, AnonymousClass00H r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public void A0A(Integer num, List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI r2 = (AnonymousClass1BI) it.next();
            if (!C22971Dz.A0c(r2)) {
                boolean z2 = true;
                if (list.size() <= 1) {
                    z2 = false;
                }
                A08(r2, num, z, z2);
            }
        }
    }
}
