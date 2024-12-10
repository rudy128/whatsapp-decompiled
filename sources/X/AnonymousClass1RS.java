package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1RS  reason: invalid class name */
public class AnonymousClass1RS implements C201511a {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1PM A02;
    public final AnonymousClass1P3 A03;
    public final AnonymousClass1MZ A04;
    public final AnonymousClass1Cd A05;
    public final AnonymousClass1MW A06;
    public final C24661Le A07;
    public final AnonymousClass1MR A08;
    public final C18030ve A09;
    public final AnonymousClass1PT A0A;
    public final AnonymousClass10I A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass11P A0E;
    public final C24751Ln A0F;

    public static HashSet A00(AnonymousClass1RS r7, ArrayList arrayList, List list, List list2, int i, boolean z) {
        HashSet hashSet;
        AnonymousClass1E7 A0E2;
        if (i == 2 || i == 0) {
            HashSet hashSet2 = new HashSet();
            if (i != 0) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    AnonymousClass1BI r1 = (AnonymousClass1BI) it.next();
                    C22941Dw r0 = UserJid.Companion;
                    if (C22941Dw.A01(r1) != null) {
                        hashSet2.add(r1);
                    } else {
                        C36321nh r02 = GroupJid.Companion;
                        if (!(C36321nh.A00(r1) == null || (A0E2 = r7.A01.A0E(r1)) == null)) {
                            hashSet2.addAll(r7.A01(A0E2));
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            r7.A01.A0m(arrayList2);
            hashSet = new HashSet(arrayList2.size(), 1.0f);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AnonymousClass1E7 r2 = (AnonymousClass1E7) it2.next();
                UserJid userJid = (UserJid) r2.A06(UserJid.class);
                if (userJid != null && !hashSet2.contains(userJid) && !r7.A02.A04(userJid)) {
                    hashSet.add(userJid);
                    arrayList.add(r2);
                }
            }
        } else if (i == 1) {
            hashSet = new HashSet();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                AnonymousClass1BI r12 = (AnonymousClass1BI) it3.next();
                C22941Dw r03 = UserJid.Companion;
                UserJid A012 = C22941Dw.A01(r12);
                AnonymousClass1M9 r4 = r7.A01;
                AnonymousClass1E7 A0E3 = r4.A0E(r12);
                if (A012 != null) {
                    if (A0E3 != null) {
                        if (!r7.A02.A04(A012)) {
                            hashSet.add(A012);
                            arrayList.add(A0E3);
                        }
                    }
                } else if (A0E3 == null) {
                }
                if (A0E3.A0F()) {
                    Iterator it4 = r7.A01(A0E3).iterator();
                    while (it4.hasNext()) {
                        UserJid userJid2 = (UserJid) it4.next();
                        AnonymousClass1E7 A0E4 = r4.A0E(userJid2);
                        if (!(A0E4 == null || A0E4.A0H == null || r7.A02.A04(userJid2))) {
                            hashSet.add(userJid2);
                            arrayList.add(A0E4);
                        }
                    }
                }
            }
        } else {
            throw new IllegalStateException("unknown status distribution mode");
        }
        if (!z) {
            return hashSet;
        }
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            Jid jid = (Jid) it5.next();
            if (C22971Dz.A0Y(jid)) {
                hashSet4.add(jid);
            }
        }
        for (Map.Entry value : r7.A0F.A0L(hashSet4).entrySet()) {
            Jid jid2 = (Jid) value.getValue();
            if (C22971Dz.A0U(jid2)) {
                hashSet3.add(jid2);
            }
        }
        return hashSet3;
    }

    private HashSet A01(AnonymousClass1E7 r5) {
        HashSet hashSet = new HashSet();
        AnonymousClass1BI r1 = r5.A0J;
        C22931Dv r0 = AnonymousClass1BI.A00;
        AnonymousClass1E9 A002 = C50242Tr.A00(r1);
        if (A002 != null) {
            AnonymousClass1IZ it = this.A04.A08.A0C(A002).A0B().iterator();
            while (it.hasNext()) {
                AnonymousClass11S r02 = this.A00;
                UserJid userJid = ((C63312sr) it.next()).A04;
                if (!r02.A0O(userJid)) {
                    hashSet.add(userJid);
                }
            }
        }
        return hashSet;
    }

    public void A02(AnonymousClass206 r23, boolean z, boolean z2) {
        Jid jid;
        C41851xA BD0;
        int i;
        List list;
        List list2;
        AnonymousClass11S r15;
        Object obj;
        int size;
        AnonymousClass206 r7 = r23;
        if (r23 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("StatusParticipantUserManager/updateParticipantsTableForNewStatus/");
            AnonymousClass205 r1 = r7.A0v;
            sb.append(r1);
            Log.i(sb.toString());
            jid = r1.A00;
        } else {
            Log.i("StatusParticipantUserManager/updateParticipantsTableForNewStatus no message");
            jid = C29671cg.A00;
        }
        C17960vV.A0C(C22971Dz.A0a(jid));
        C28791au A052 = this.A05.A05();
        try {
            BD0 = A052.BD0();
            if (!z || r23 == null || C63672tV.A00(r7) == null) {
                C24661Le r0 = this.A07;
                i = r0.A05();
                list = r0.A0A();
                list2 = r0.A0B();
            } else {
                AnonymousClass77K A002 = C63672tV.A00(r7);
                C17960vV.A07(A002);
                i = A002.A00;
                list = A002.A01;
                list2 = A002.A02;
            }
            AnonymousClass1MW r8 = this.A06;
            C29671cg r4 = C29671cg.A00;
            HashSet A0F2 = r8.A0F(r4);
            ArrayList arrayList = new ArrayList();
            C18030ve r10 = this.A09;
            C18040vf r3 = C18040vf.A02;
            HashSet A003 = A00(this, arrayList, list, list2, i, C18020vd.A05(r3, r10, 6791));
            AnonymousClass11P r14 = this.A0E;
            long A012 = AnonymousClass11P.A01(r14) + 86400000;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass1E7 r13 = (AnonymousClass1E7) it.next();
                if (r13.A0D < A012) {
                    r13.A0D = AnonymousClass11P.A01(r14) + 604800000;
                    arrayList2.add(r13);
                }
            }
            this.A01.A0q(arrayList2);
            HashSet hashSet = new HashSet(A0F2);
            hashSet.removeAll(A003);
            HashSet hashSet2 = new HashSet(A003);
            hashSet2.removeAll(A0F2);
            if (C18020vd.A05(r3, r10, 6791)) {
                r15 = this.A00;
                obj = r15.A0A();
            } else {
                r15 = this.A00;
                r15.A0I();
                obj = r15.A0E;
                C17960vV.A07(obj);
            }
            hashSet.remove(obj);
            hashSet2.add(obj);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("StatusParticipantUserManager/updateParticipantsTableForNewStatus/removedJids/");
            sb2.append(hashSet);
            Log.i(sb2.toString());
            C17960vV.A07(jid);
            AnonymousClass1E9 r6 = (AnonymousClass1E9) jid;
            HashSet hashSet3 = new HashSet(hashSet2.size());
            if (!hashSet2.isEmpty()) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    UserJid userJid = (UserJid) it2.next();
                    HashSet A0A2 = this.A08.A0A(userJid);
                    C17960vV.A0D(!A0A2.isEmpty());
                    HashSet hashSet4 = new HashSet(A0A2.size());
                    Iterator it3 = A0A2.iterator();
                    while (it3.hasNext()) {
                        hashSet4.add(new C59232ly((DeviceJid) it3.next(), false, false));
                    }
                    int i2 = 0;
                    if (r15.A0O(userJid)) {
                        i2 = 2;
                    }
                    C63312sr r02 = new C63312sr(userJid, (Set) hashSet4, i2, false);
                    r8.A0I(r02, r6);
                    hashSet3.add(r02);
                }
            }
            if (!hashSet.isEmpty()) {
                r8.A0L(r6, new ArrayList(hashSet));
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("StatusParticipantUserManager/updateStatusParticipants/added/");
            sb3.append(hashSet3);
            Log.i(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("StatusParticipantUserManager/updateStatusParticipants/removed/");
            sb4.append(hashSet);
            Log.i(sb4.toString());
            C63872tp A0B2 = r8.A0B(r4);
            A0B2.A0Q(hashSet3);
            this.A04.A0C(A0B2, UserJid.userJidsFromChatJids(hashSet));
            boolean z3 = z2;
            if (!hashSet.isEmpty()) {
                if (this.A03.A0Y()) {
                    this.A0B.CGF(new AnonymousClass7RT(this, r4, A0B2, 25, z3));
                } else {
                    ((C25581Ot) this.A0C.get()).A00(new AnonymousClass7RT(this, r4, A0B2, 26, z3));
                }
            } else if (z2) {
                ((C58752lC) this.A0D.get()).A00();
            }
            if (r23 != null) {
                r7.A0f = C63872tp.A01(UserJid.userJidsFromChatJids(r8.A0F(r6)));
                if (A003.contains(obj)) {
                    size = A003.size() - 1;
                } else {
                    size = A003.size();
                }
                r7.A0A = size;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("StatusParticipantUserManager/msgstore/addmsg/status/ added:");
            sb5.append(hashSet2.size());
            sb5.append(" removed:");
            sb5.append(hashSet.size());
            sb5.append(" current:");
            sb5.append(A003.size());
            Log.i(sb5.toString());
            BD0.A00();
            BD0.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass1RS(AnonymousClass11S r2, AnonymousClass1M9 r3, AnonymousClass1PM r4, AnonymousClass11P r5, AnonymousClass1P3 r6, AnonymousClass1MZ r7, AnonymousClass1Cd r8, AnonymousClass1MW r9, C24661Le r10, C24751Ln r11, AnonymousClass1MR r12, C18030ve r13, AnonymousClass1PT r14, AnonymousClass10I r15, AnonymousClass00H r16, AnonymousClass00H r17) {
        this.A0E = r5;
        this.A09 = r13;
        this.A00 = r2;
        this.A0B = r15;
        this.A07 = r10;
        this.A0C = r16;
        this.A01 = r3;
        this.A0A = r14;
        this.A0F = r11;
        this.A03 = r6;
        this.A08 = r12;
        this.A02 = r4;
        this.A05 = r8;
        this.A06 = r9;
        this.A04 = r7;
        this.A0D = r17;
    }
}
