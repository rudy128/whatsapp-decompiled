package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Bw  reason: invalid class name and case insensitive filesystem */
public class C178119Bw extends C21340AiT implements AnonymousClass229 {
    public Map A00;
    public final long A01;
    public final DeviceJid A02;
    public final AnonymousClass22J A03;
    public final C89444cT A04;
    public final boolean A05;
    public volatile int A06;
    public volatile int A07;
    public volatile int A08;
    public volatile int A09;
    public volatile long A0A;
    public volatile C59292m4 A0B;
    public volatile GroupJid A0C;
    public volatile C179559Il A0D;
    public volatile AnonymousClass2Q4 A0E;
    public volatile C58332kW A0F;
    public volatile String A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;
    public volatile boolean A0J;
    public final transient List A0K;

    public synchronized ArrayList A0B() {
        return C17880vN.A10(this.A00.values());
    }

    public synchronized HashSet A0C() {
        return AnonymousClass8BR.A12(this.A00.keySet());
    }

    public synchronized List A0D() {
        return this.A0K;
    }

    public synchronized void A0E(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            A02();
        }
    }

    public synchronized void A0F(int i) {
        if (!(this.A07 == i || this.A07 == 3)) {
            this.A07 = i;
            A02();
        }
    }

    public synchronized void A0G(int i) {
        if (this.A09 != i) {
            this.A09 = i;
            A02();
        }
    }

    public synchronized void A0H(C59292m4 r2) {
        if (!C42171xk.A00(this.A0B, r2)) {
            this.A0B = r2;
            A02();
        }
    }

    public synchronized void A0I(GroupJid groupJid) {
        if (!C42171xk.A00(this.A0C, groupJid)) {
            this.A0C = groupJid;
            A02();
        }
    }

    public synchronized void A0J(UserJid userJid, int i) {
        C178109Bv r1 = (C178109Bv) this.A00.get(userJid);
        if (r1 != null) {
            synchronized (r1) {
                if (r1.A01 != i) {
                    r1.A01 = i;
                    r1.A02();
                }
            }
        } else {
            C178109Bv r2 = new C178109Bv(userJid, i, -1);
            this.A00.put(r2.A00, r2);
            A02();
        }
    }

    public synchronized void A0K(AnonymousClass2Q4 r2) {
        this.A0E = r2;
        this.A0H = true;
        A02();
    }

    public synchronized void A0L(boolean z) {
        if (this.A0J != z) {
            this.A0J = z;
            A02();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C178119Bw r7 = (C178119Bw) obj;
            if (A01() != r7.A01() || !this.A04.equals(r7.A04) || this.A01 != r7.A01 || this.A0J != r7.A0J || this.A08 != r7.A08 || this.A0A != r7.A0A || this.A06 != r7.A06 || A0A() != r7.A0A() || this.A05 != r7.A05 || !C42171xk.A00(this.A0C, r7.A0C) || this.A0I != r7.A0I) {
                return false;
            }
            A00(this);
            int i = this.A09;
            A00(r7);
            if (i != r7.A09 || !this.A00.equals(r7.A00) || !C42171xk.A00(this.A02, r7.A02) || !C42171xk.A00(this.A0G, r7.A0G) || !C42171xk.A00(this.A0B, r7.A0B) || this.A07 != r7.A07 || !C42171xk.A00(this.A0F, r7.A0F)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r3.A06 == 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C178119Bw r3) {
        /*
            int r1 = r3.A09
            r0 = 2
            if (r1 != r0) goto L_0x0047
            boolean r0 = r3.A0O()
            if (r0 == 0) goto L_0x0011
            X.4cT r0 = r3.A04
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x001c
        L_0x0011:
            boolean r0 = r3.A0Q()
            if (r0 != 0) goto L_0x001c
            int r0 = r3.A06
            r2 = 0
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallLog/validateOfferSilenceReasonInvariants A 1:1 call silenced for privacy reasons should be a missed call. isGroupCall="
            r1.append(r0)
            boolean r0 = r3.A0O()
            r1.append(r0)
            java.lang.String r0 = " isFromMe="
            r1.append(r0)
            X.4cT r0 = r3.A04
            boolean r0 = r0.A03
            r1.append(r0)
            java.lang.String r0 = " callResult="
            r1.append(r0)
            int r0 = r3.A06
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            X.C17960vV.A0F(r2, r0)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178119Bw.A00(X.9Bw):void");
    }

    public int A07(UserJid userJid) {
        C178109Bv r0 = (C178109Bv) this.A00.get(userJid);
        if (r0 != null) {
            return r0.A01;
        }
        return 2;
    }

    public C89444cT A09() {
        C89444cT r0 = this.A04;
        UserJid userJid = r0.A01;
        boolean z = r0.A03;
        return new C89444cT(r0.A00, userJid, r0.A02, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r3.A0C == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C179559Il A0A() {
        /*
            r3 = this;
            X.9Il r1 = r3.A0D
            boolean r0 = r1 instanceof X.C178099Bu
            if (r0 != 0) goto L_0x0035
            boolean r0 = r1 instanceof X.C178089Bt
            if (r0 == 0) goto L_0x002b
            X.4cT r0 = r3.A04
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0015
            com.whatsapp.jid.GroupJid r0 = r3.A0C
            r2 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallLog/getNotificationSilenceReason Invalid call log for "
            r1.append(r0)
            X.9Il r0 = r3.A0D
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            X.C17960vV.A0F(r2, r0)
            X.9Il r0 = r3.A0D
            return r0
        L_0x002b:
            boolean r0 = r1 instanceof X.C178079Bs
            if (r0 != 0) goto L_0x0035
            boolean r0 = r1 instanceof X.C178069Br
            if (r0 != 0) goto L_0x0035
            r2 = 1
            goto L_0x0016
        L_0x0035:
            X.4cT r0 = r3.A04
            boolean r0 = r0.A03
            r2 = r0 ^ 1
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178119Bw.A0A():X.9Il");
    }

    public boolean A0M() {
        if (this.A0C != null || !A0O()) {
            return false;
        }
        return true;
    }

    public boolean A0N() {
        if (!this.A04.A03 || this.A06 != 7) {
            return false;
        }
        return true;
    }

    public boolean A0O() {
        if (this.A00.size() < 2 && this.A0B == null && this.A0C == null) {
            return false;
        }
        return true;
    }

    public boolean A0P() {
        Jid jid = this.A02;
        if (jid == null) {
            jid = this.A04.A01;
        }
        return C22971Dz.A0T(jid);
    }

    public boolean A0Q() {
        if (this.A04.A03 || this.A06 != 2) {
            return false;
        }
        return true;
    }

    public boolean A0V() {
        if (this.A04.A03 || this.A06 == 5 || this.A06 == 6) {
            return false;
        }
        return true;
    }

    public boolean A0W() {
        if (this.A07 == 2 || this.A07 == 3) {
            return true;
        }
        return false;
    }

    public boolean A0X() {
        return AnonymousClass000.A1T(this.A07, 3);
    }

    public boolean A0Z(AnonymousClass11S r3, UserJid userJid) {
        C89444cT r1 = this.A04;
        if (r1.A03) {
            if (!r3.A0O(userJid)) {
                return false;
            }
            return true;
        } else if (userJid.equals(r1.A01)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[19];
        C17890vO.A1L(objArr, A01());
        objArr[1] = this.A04;
        C17890vO.A1N(objArr, this.A01);
        objArr[3] = Boolean.valueOf(this.A0J);
        AnonymousClass3Ma.A1T(objArr, this.A08);
        C17890vO.A1Q(objArr, this.A0A);
        C17890vO.A1H(objArr, this.A06);
        objArr[7] = A0A();
        objArr[8] = Boolean.valueOf(this.A05);
        objArr[9] = this.A00;
        objArr[10] = this.A0C;
        objArr[11] = Boolean.valueOf(this.A0I);
        objArr[12] = this.A02;
        objArr[13] = this.A0G;
        objArr[14] = this.A0E;
        objArr[15] = this.A0B;
        objArr[16] = Integer.valueOf(this.A07);
        A00(this);
        objArr[17] = Integer.valueOf(this.A09);
        return AnonymousClass000.A0P(this.A0F, objArr, 18);
    }

    public C178119Bw(C59292m4 r5, DeviceJid deviceJid, GroupJid groupJid, AnonymousClass22J r8, C89444cT r9, C179559Il r10, AnonymousClass2Q4 r11, C58332kW r12, String str, Collection collection, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z, boolean z2, boolean z3) {
        this.A00 = j;
        this.A00 = C17880vN.A13();
        this.A0K = AnonymousClass000.A13();
        this.A04 = r9;
        this.A03 = r8;
        this.A01 = j2;
        this.A0J = z;
        this.A08 = i;
        this.A06 = i2;
        this.A0D = r10;
        this.A0A = j3;
        this.A05 = z2;
        this.A0C = groupJid;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C178109Bv r2 = (C178109Bv) it.next();
            this.A00.put(r2.A00, r2);
        }
        this.A0I = z3;
        this.A02 = deviceJid;
        this.A0G = str;
        this.A09 = i3;
        this.A0E = r11;
        this.A0B = r5;
        this.A07 = i4;
        this.A0F = r12;
    }

    public boolean A04() {
        if (!super.A04()) {
            Iterator A0l = C17890vO.A0l(this.A00);
            while (A0l.hasNext()) {
                if (((C21340AiT) A0l.next()).A04()) {
                }
            }
            return false;
        }
        return true;
    }

    public int A05() {
        Iterator it = A0B().iterator();
        int i = 0;
        while (it.hasNext()) {
            C178109Bv r2 = (C178109Bv) it.next();
            if (r2.A01 == 5 || r2.A01 == 100) {
                i++;
            }
        }
        return i;
    }

    public int A06(AnonymousClass11S r5) {
        if (A0O() && this.A0E != null) {
            Iterator it = A0B().iterator();
            while (it.hasNext()) {
                UserJid userJid = ((C178109Bv) it.next()).A00;
                if (r5.A0O(userJid)) {
                    return A07(userJid);
                }
            }
        }
        return -1;
    }

    /* renamed from: A08 */
    public C178119Bw clone() {
        C178119Bw r5 = (C178119Bw) super.clone();
        LinkedHashMap A13 = C17880vN.A13();
        Iterator A15 = AnonymousClass000.A15(this.A00);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            A13.put(((UserJid) A16.getKey()).clone(), ((C21340AiT) A16.getValue()).clone());
        }
        r5.A00 = A13;
        return r5;
    }

    public boolean A0R() {
        A00(this);
        boolean A1T = AnonymousClass000.A1T(this.A09, 2);
        if (!A0Q() || !A1T) {
            return false;
        }
        return true;
    }

    public boolean A0S() {
        if (!A0Q() || A0A() != C179559Il.A05) {
            return false;
        }
        return true;
    }

    public boolean A0T() {
        if (!A0Q() || A0A() != C179559Il.A04) {
            return false;
        }
        return true;
    }

    public boolean A0U() {
        if (!A0Q()) {
            return false;
        }
        if (A0A() == C179559Il.A03 || A0A() == C179559Il.A02) {
            return true;
        }
        return false;
    }

    public boolean A0Y(AnonymousClass11S r5) {
        if (A0O() && this.A0E != null) {
            Iterator it = A0B().iterator();
            while (it.hasNext()) {
                UserJid userJid = ((C178109Bv) it.next()).A00;
                if (r5.A0O(userJid)) {
                    return A0a(userJid);
                }
            }
        }
        return false;
    }

    public boolean A0a(UserJid userJid) {
        int A072 = A07(userJid);
        if (A072 == 5 || A072 == 100) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallLog[rowId=");
        A10.append(A01());
        A10.append(", key=");
        A10.append(this.A04);
        A10.append(", timestamp=");
        A10.append(this.A01);
        A10.append(", videoCall=");
        A10.append(this.A0J);
        A10.append(", duration=");
        A10.append(this.A08);
        A10.append(", bytesTransferred=");
        A10.append(this.A0A);
        A10.append(", callResult=");
        A10.append(this.A06);
        A10.append(", notificationSilenceReason=");
        A10.append(A0A());
        A10.append(", fromMissedCall=");
        A10.append(this.A05);
        A10.append(", groupJid=");
        A10.append(this.A0C);
        A10.append(", isJoinableGroupCall=");
        A10.append(this.A0I);
        A10.append(", participants.size=");
        A10.append(this.A00.size());
        A10.append(", callCreatorDeviceJid=");
        A10.append(this.A02);
        A10.append(", callRandomId=");
        A10.append(this.A0G);
        A10.append(", offerSilenceReason=");
        A00(this);
        A10.append(this.A09);
        A10.append(", joinableData=");
        A10.append(this.A0E);
        A10.append(", callLinkData=");
        A10.append(this.A0B);
        A10.append(", callType=");
        A10.append(this.A07);
        A10.append(", scheduledData=");
        A10.append(this.A0F);
        return AnonymousClass000.A0z(A10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C178119Bw(DeviceJid deviceJid, C89444cT r26, List list, long j, boolean z) {
        this((C59292m4) null, deviceJid, (GroupJid) null, (AnonymousClass22J) null, r26, C179559Il.NONE, (AnonymousClass2Q4) null, (C58332kW) null, (String) null, list == null ? Collections.emptyList() : list, 0, 0, 0, 0, -1, j, 0, z, false, false);
    }
}
