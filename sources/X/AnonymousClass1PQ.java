package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1PQ  reason: invalid class name */
public class AnonymousClass1PQ {
    public final AnonymousClass190 A00;
    public final AnonymousClass1NK A01;
    public final AnonymousClass1PP A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.2Mh, X.2MR] */
    public C48392Mh A07(GroupJid groupJid, String str, List list, int i, int i2, long j) {
        C48392Mh r1;
        Boolean bool = C17960vV.A01;
        AnonymousClass1PP r12 = this.A02;
        AnonymousClass205 A012 = r12.A01(groupJid, true);
        if (i == 2) {
            r1 = new C48392Mh(r12.A01(groupJid, true), i, j);
        } else {
            ? r13 = new C48392Mh(A012, 3, j);
            r13.A00 = i2;
            r1 = r13;
        }
        r1.A0i(str);
        if (list != null) {
            r1.A01 = list;
        }
        return r1;
    }

    public AnonymousClass2MS A0B(AnonymousClass1EC r8, UserJid userJid, int i, int i2, long j) {
        AnonymousClass2MS r1 = (AnonymousClass2MS) A06((C63872tp) null, r8, (C62502rV) null, 56, j);
        r1.A0d(userJid);
        r1.A00 = i;
        r1.A04 = i2;
        r1.A0Q = Boolean.valueOf(this.A03.A0O(userJid));
        return r1;
    }

    public static void A01(UserJid userJid, C48392Mh r2, AnonymousClass1PQ r3, boolean z) {
        if (r3.A03.A0O(userJid)) {
            r2.A00 = 1;
        }
        if (!z) {
            r2.A0d(userJid);
        }
    }

    public C436420i A02(AnonymousClass1BI r4, int i, long j) {
        return ((C190329kl) this.A05.get()).A00(this.A02.A01(r4, true), i, j);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.20i, X.2MD] */
    public AnonymousClass2MD A03(AnonymousClass1BI r4, String str, int i, long j) {
        ? r0 = new C436420i(this.A02.A01(r4, true), 69, j);
        r0.A00 = i;
        r0.A01 = str;
        return r0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.20i, X.206, X.97f] */
    public AnonymousClass97f A04(AnonymousClass1BI r4, UserJid userJid, long j) {
        ? r0 = new C436420i(this.A02.A01(r4, true), 71, j);
        r0.A0d(userJid);
        return r0;
    }

    public C48392Mh A05(C63872tp r9, AnonymousClass1E9 r10, UserJid userJid, C62502rV r12, List list, int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemMessageFactory/newParticipantsStatusMessage; stanzaMetadata=");
        sb.append(r12);
        sb.append("; gjid=");
        sb.append(r10);
        sb.append("; action=");
        sb.append(i);
        sb.append("; author=");
        sb.append(userJid);
        Log.i(sb.toString());
        C63872tp r2 = r9;
        C48392Mh A06 = A06(r2, r10, r12, i, j);
        A00(userJid, A06, this, list, i);
        return A06;
    }

    public C48392Mh A06(C63872tp r15, AnonymousClass1E9 r16, C62502rV r17, int i, long j) {
        C48392Mh r2;
        Set set = AnonymousClass2WQ.A01;
        boolean z = true;
        int i2 = i;
        if (!(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8 || i2 == 9 || i2 == 11 || i2 == 167 || i2 == 12 || i2 == 13 || i2 == 14 || i2 == 15 || i2 == 16 || i2 == 17 || i2 == 20 || i2 == 21 || i2 == 27 || i2 == 29 || i2 == 30 || i2 == 31 || i2 == 32 || i2 == 33 || i2 == 51 || i2 == 52 || i2 == 53 || i2 == 54 || i2 == 56 || i2 == 73 || i2 == 74 || i2 == 79 || i2 == 81 || i2 == 82 || i2 == 173 || i2 == 83 || i2 == 84 || i2 == 85 || i2 == 86 || i2 == 90 || i2 == 91 || i2 == 92 || i2 == 93 || i2 == 94 || i2 == 99 || i2 == 100 || i2 == 101 || i2 == 106 || i2 == 107 || i2 == 120 || i2 == 122 || i2 == 123 || i2 == 124 || i2 == 144 || i2 == 125 || i2 == 126 || i2 == 127 || i2 == 131 || i2 == 137 || i2 == 138 || i2 == 140 || i2 == 141 || i2 == 139 || i2 == 142 || i2 == 143 || i2 == 145 || i2 == 148 || i2 == 149 || i2 == 150 || i2 == 151 || i2 == 152 || i2 == 177 || i2 == 159 || i2 == 160 || i2 == 161 || i2 == 168)) {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not supposed to be used for action = ");
        sb.append(i2);
        C17960vV.A0F(z, sb.toString());
        boolean z2 = true;
        C62502rV r4 = r17;
        long j2 = j;
        if (r17 != null) {
            C63872tp r3 = r15;
            if (i2 == 1) {
                r2 = new C48392Mh(r15, r4, 1, j2);
            } else if (i2 == 56) {
                r2 = new C48392Mh(r15, r4, 56, j2);
            } else {
                r2 = new C48392Mh(r3, r4, i2, j2);
            }
            r2.A10 = r4.A01;
            return r2;
        }
        AnonymousClass1E9 r32 = r16;
        if (r16 == null) {
            z2 = false;
        }
        C17960vV.A0D(z2);
        return (C48392Mh) ((C190329kl) this.A05.get()).A00(this.A02.A01(r32, true), i2, j2);
    }

    public C48392Mh A08(AnonymousClass1E9 r10, UserJid userJid, C62502rV r12, int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemMessageFactory/newParticipantStatusMessage; stanzaKey=");
        sb.append(r12);
        sb.append("; gjid=");
        sb.append(r10);
        sb.append("; action=");
        sb.append(i);
        Log.i(sb.toString());
        C48392Mh A06 = A06((C63872tp) null, r10, r12, i, j);
        A06.A0d(userJid);
        if (i == 4 && this.A03.A0O(userJid)) {
            A06.A00 = 1;
        }
        return A06;
    }

    public C48392Mh A09(AnonymousClass1EC r4, UserJid userJid, long j, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemMessageFactory/newReportToAdminStatusChangeSystemMessage/gjid=");
        sb.append(r4);
        Log.i(sb.toString());
        AnonymousClass205 A012 = this.A02.A01(r4, true);
        int i = 141;
        if (z) {
            i = 140;
        }
        C48392Mh r0 = new C48392Mh(A012, i, j);
        r0.A0d(userJid);
        return r0;
    }

    public C48392Mh A0A(AnonymousClass1EC r8, C42661yX r9, C62502rV r10, boolean z) {
        long millis = TimeUnit.SECONDS.toMillis(r9.A00);
        int i = 27;
        if (z) {
            i = 131;
        }
        C48392Mh A06 = A06((C63872tp) null, r8, r10, i, millis);
        A06.A0i(r9.A03);
        A06.A0d(r9.A02);
        return A06;
    }

    public AnonymousClass2MS A0C(AnonymousClass1EC r8, UserJid userJid, C62502rV r10, int i, long j) {
        AnonymousClass2MS r0 = (AnonymousClass2MS) A06((C63872tp) null, r8, r10, 56, j);
        r0.A0d(userJid);
        r0.A00 = i;
        return r0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.20i, X.2MC] */
    public AnonymousClass2MC A0D(AnonymousClass1BI r5, int i, long j) {
        ? r3 = new C436420i(this.A02.A01(r5, true), 67, j);
        r3.A00 = 0;
        C22941Dw r0 = UserJid.Companion;
        if (C22941Dw.A01(r5) != null) {
            r3.A00 = i;
        }
        this.A04.CGF(new C146517Pk(this, r5, 5));
        return r3;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.2Mh, X.2Mg, X.2Mb, X.206] */
    public C48332Mb A0E(GroupJid groupJid, AnonymousClass1EC r12, UserJid userJid, C62502rV r14, String str, String str2, long j) {
        ? r4 = new C48382Mg(this.A02.A01(groupJid, true), (C62502rV) null, 107, j);
        r4.A03 = r14;
        r4.A1E(r12, str2);
        if (r12 != null) {
            if (r4.A1C(4).size() > 0) {
                C17960vV.A0F(false, "FMessageSystemParentGroupNameChanged/setOldParentInfo/old parent info should only be set once");
            }
            r4.A00.add(new C59632md(r12, str, 4, 0));
        }
        r4.A0d(userJid);
        return r4;
    }

    public AnonymousClass1PQ(AnonymousClass190 r1, AnonymousClass11S r2, AnonymousClass1NK r3, AnonymousClass1PP r4, AnonymousClass10I r5, AnonymousClass00H r6) {
        this.A00 = r1;
        this.A03 = r2;
        this.A04 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = r6;
    }

    public static void A00(UserJid userJid, C48392Mh r1, AnonymousClass1PQ r2, List list, int i) {
        r1.A0d(userJid);
        r1.A0m(list);
        if (AnonymousClass25A.A0F(i)) {
            AnonymousClass11S r0 = r2.A03;
            r0.A0I();
            if (list.contains(r0.A0E)) {
                r1.A00 = 1;
            }
        }
    }
}
