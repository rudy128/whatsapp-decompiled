package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class A7L {
    public final long A00;
    public final long A01;
    public final Set A02;
    public final Set A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            A7L a7l = (A7L) obj;
            if (this.A00 != a7l.A00 || this.A01 != a7l.A01 || !this.A02.equals(a7l.A02) || !this.A03.equals(a7l.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        C17890vO.A1L(objArr, this.A00);
        C17890vO.A1M(objArr, this.A01);
        objArr[2] = this.A02;
        return AnonymousClass000.A0P(this.A03, objArr, 3);
    }

    public static A7L A01(A7L a7l, A7L a7l2) {
        long max = Math.max(a7l.A00, a7l2.A00);
        long max2 = Math.max(a7l.A01, a7l2.A01);
        HashSet A12 = AnonymousClass8BR.A12(a7l.A02);
        A12.addAll(a7l2.A02);
        Iterator it = A12.iterator();
        while (it.hasNext()) {
            if (((C196029uL) it.next()).A00 < max) {
                it.remove();
            }
        }
        if (A12.size() > 1000) {
            ArrayList A10 = C17880vN.A10(A12);
            C21486Akr.A01(22, A10);
            List subList = A10.subList(0, 1000);
            A12 = AnonymousClass8BR.A12(subList);
            max = ((C196029uL) subList.get(AnonymousClass3MX.A01(subList))).A00;
        }
        HashSet A122 = AnonymousClass8BR.A12(a7l.A03);
        A122.addAll(a7l2.A03);
        if (max2 <= max) {
            max2 = 0;
        }
        return new A7L(A12, A122, max, max2);
    }

    public static A7L A02(C165018aS r17, boolean z) {
        if (z) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C165018aS r3 = r17;
            long millis = timeUnit.toMillis(r3.lastMessageTimestamp_);
            long millis2 = timeUnit.toMillis(r3.lastSystemMessageTimestamp_);
            int i = r3.bitField0_;
            if ((i & 1) == 0 || (i & 2) == 0 || millis2 > millis) {
                EE9<C164488Za> ee9 = r3.messages_;
                HashSet A12 = C17880vN.A12();
                HashSet A122 = C17880vN.A12();
                for (C164488Za r1 : ee9) {
                    if ((r1.bitField0_ & 1) != 0) {
                        C166408cq r0 = r1.key_;
                        C166408cq r32 = r0;
                        if (r0 == null) {
                            r0 = C166408cq.DEFAULT_INSTANCE;
                        }
                        if ((r0.bitField0_ & 2) != 0) {
                            C166408cq r02 = r32;
                            if (r32 == null) {
                                r02 = C166408cq.DEFAULT_INSTANCE;
                            }
                            if ((r02.bitField0_ & 4) != 0) {
                                C166408cq r03 = r32;
                                if (r32 == null) {
                                    r03 = C166408cq.DEFAULT_INSTANCE;
                                }
                                if ((r03.bitField0_ & 1) != 0) {
                                    if (r32 == null) {
                                        r32 = C166408cq.DEFAULT_INSTANCE;
                                    }
                                    AnonymousClass1BI A0l = AnonymousClass3MX.A0l(r32.remoteJid_);
                                    if (A0l != null) {
                                        UserJid A022 = C22941Dw.A02(r32.participant_);
                                        boolean z2 = r32.fromMe_;
                                        if (!C22971Dz.A0e(A0l) || z2 || A022 != null) {
                                            C196029uL r6 = new C196029uL(A0l, A022, r32.id_, TimeUnit.SECONDS.toMillis(r1.timestamp_), z2);
                                            if (r6.A00 == 0) {
                                                A122.add(r6);
                                            } else {
                                                A12.add(r6);
                                            }
                                        } else {
                                            throw new C26341Rt(11);
                                        }
                                    } else {
                                        throw new C26341Rt(10);
                                    }
                                } else {
                                    throw new C26341Rt(7);
                                }
                            } else {
                                throw new C26341Rt(9);
                            }
                        } else {
                            throw new C26341Rt(8);
                        }
                    } else {
                        throw new C26341Rt(6);
                    }
                }
                if (A12.size() <= 1000) {
                    return new A7L(A12, A122, millis, millis2);
                }
                throw new C26341Rt(5);
            }
            throw new C26341Rt(2);
        }
        throw new C26341Rt(1);
    }

    public static boolean A03(A7L a7l, A7L a7l2) {
        for (Object next : a7l2.A03) {
            if (!a7l.A02.contains(next) && !a7l.A03.contains(next)) {
                return false;
            }
        }
        for (C196029uL r5 : a7l2.A02) {
            if (r5.A00 > a7l.A00 && !a7l.A02.contains(r5) && !a7l.A03.contains(r5)) {
                return false;
            }
        }
        return true;
    }

    public C165018aS A04() {
        C163818Wl r2 = (C163818Wl) C165018aS.DEFAULT_INSTANCE.A0N();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(this.A00);
        long seconds2 = timeUnit.toSeconds(this.A01);
        if (seconds > 0) {
            C165018aS r1 = (C165018aS) C17880vN.A0G(r2);
            r1.bitField0_ |= 1;
            r1.lastMessageTimestamp_ = seconds;
        }
        if (seconds2 > 0) {
            C165018aS r12 = (C165018aS) C17880vN.A0G(r2);
            r12.bitField0_ |= 2;
            r12.lastSystemMessageTimestamp_ = seconds2;
        }
        for (C196029uL A002 : this.A02) {
            r2.A0G(A002.A00());
        }
        for (C196029uL A003 : this.A03) {
            r2.A0G(A003.A00());
        }
        return (C165018aS) r2.A0C();
    }

    public A7L(Set set, Set set2, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = set;
        this.A03 = set2;
    }

    public static int A00(A7L a7l, A7L a7l2) {
        boolean A032 = A03(a7l, a7l2);
        boolean A033 = A03(a7l2, a7l);
        if (A032) {
            return AnonymousClass8BU.A00(A033 ? 1 : 0);
        }
        if (A033) {
            return 1;
        }
        return 3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncdMessageRange{lastMessageTimestamp=");
        A10.append(this.A00);
        A10.append(", lastSystemMessageTimestamp=");
        A10.append(this.A01);
        A10.append(", messages=");
        A10.append(this.A02);
        A10.append(", messagesWithoutTimestamp=");
        return AnonymousClass8BX.A0c(this.A03, A10);
    }
}
