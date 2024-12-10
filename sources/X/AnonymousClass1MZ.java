package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcelable;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1MZ  reason: invalid class name */
public class AnonymousClass1MZ {
    public final AnonymousClass190 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass1M9 A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass1CJ A05;
    public final AnonymousClass1MS A06;
    public final AnonymousClass1Cd A07;
    public final AnonymousClass1MW A08;
    public final AnonymousClass1MU A09;
    public final AnonymousClass1MX A0A;
    public final C24751Ln A0B;
    public final AnonymousClass1MR A0C;
    public final C18030ve A0D;
    public final AnonymousClass10I A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass1MY A0K;
    public final AnonymousClass1MG A0L;

    private void A00(AnonymousClass1E9 r5, List list) {
        A2B A022;
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        AnonymousClass1EC A002 = C42941yz.A00(r5);
        if (A002 != null) {
            AnonymousClass1MG r2 = this.A0L;
            r2.A04();
            AnonymousClass1EC r1 = (AnonymousClass1EC) r2.A02.get(A002);
            if (r1 != null && (A022 = r2.A02(r1)) != null && A002.equals(A022.A02)) {
                this.A0K.A01(r1, list);
            }
        }
    }

    public int A01(AnonymousClass1BI r8) {
        Cursor A0A2;
        C63872tp A0A3;
        HashSet A0M;
        if (!(r8 instanceof AnonymousClass1E9)) {
            return 0;
        }
        AnonymousClass1MW r2 = this.A08;
        AnonymousClass1E9 r82 = (AnonymousClass1E9) r8;
        StringBuilder sb = new StringBuilder();
        sb.append("ParticipantUserStore/getGroupParticipantsDevicesCount ");
        sb.append(r82);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ParticipantUserStore/getGroupParticipantDevicesCountFromCacheIfAvailable ");
        sb2.append(r82);
        Log.i(sb2.toString());
        AnonymousClass1MS r1 = r2.A04;
        C18070vi.A0d(r82, 0);
        if (r1.A05.containsKey(r82) && (A0A3 = r1.A0A(r82)) != null) {
            if (A0A3.A00 != 0) {
                A0M = A0A3.A0L();
            } else {
                A0M = A0A3.A0M();
            }
            int size = A0M.size();
            if (size != -1) {
                return size;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("ParticipantUserStore/getGroupParticipantsDevicesCount/cacheMiss ");
        sb3.append(r82);
        Log.i(sb3.toString());
        String valueOf = String.valueOf(r2.A05.A09(r82));
        C28781at A042 = r2.A06.get();
        try {
            int i = 0;
            A0A2 = ((C28801av) A042).A02.A0A("SELECT COUNT(1) as count FROM group_participant_user JOIN group_participant_device ON group_participant_row_id = group_participant_user._id WHERE group_jid_row_id = ?", "GET_GROUP_PARTICIPANT_DEVICES_COUNT_SQL", new String[]{valueOf});
            if (A0A2.moveToFirst()) {
                i = A0A2.getInt(A0A2.getColumnIndexOrThrow("count"));
            }
            A0A2.close();
            A042.close();
            return i;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public int A02(AnonymousClass1EC r5) {
        int A062 = this.A05.A06(r5);
        C18030ve r2 = this.A0D;
        int i = 1304;
        if (A062 == 3) {
            i = 2774;
        }
        return C18020vd.A00(C18040vf.A02, r2, i);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1DT, X.1DS, java.lang.Object] */
    public AnonymousClass1DT A03(AnonymousClass1BI r5, GroupJid groupJid) {
        String str;
        AnonymousClass1A3 r0;
        ? r3 = new AnonymousClass1DS();
        if (groupJid == null) {
            str = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat groupJid null";
        } else if (!(r5 instanceof AnonymousClass1E2)) {
            str = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat chatJid not LID";
        } else {
            if (C18020vd.A05(C18040vf.A02, this.A0D, 3876)) {
                str = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat force create LID chat";
            } else {
                this.A01.A07(0, 2131891797);
                this.A0E.CGN(new AnonymousClass3C4(this, r5, r3, 21));
                return r3;
            }
        }
        Log.i(str);
        if (r5 == null) {
            r0 = AnonymousClass1A3.A01;
        } else {
            r0 = new AnonymousClass1A3(r5);
        }
        r3.A0F(r0);
        return r3;
    }

    public C63312sr A05(AnonymousClass1E9 r3, UserJid userJid) {
        return this.A08.A0C(r3).A0D(userJid, false);
    }

    public C63312sr A06(AnonymousClass1E9 r4, UserJid userJid) {
        C63872tp A0B2 = this.A08.A0B(r4);
        boolean A1T = AnonymousClass000.A1T(2, A0B2.A00);
        if (C22971Dz.A0T(userJid) && !A1T) {
            userJid = this.A0B.A0D((AnonymousClass1E1) userJid);
        } else if (C22971Dz.A0X(userJid) && A1T) {
            userJid = this.A0B.A0A((PhoneUserJid) userJid);
        }
        if (userJid != null) {
            return A0B2.A0D(userJid, false);
        }
        return null;
    }

    public String A07(AnonymousClass1E9 r2, boolean z) {
        C63872tp A0C2 = this.A08.A0C(r2);
        if (z) {
            return A0C2.A0H();
        }
        return A0C2.A0J();
    }

    public HashSet A08(AnonymousClass1BI r3) {
        if (!(r3 instanceof AnonymousClass1E9)) {
            return new HashSet();
        }
        C63872tp A0C2 = this.A08.A0C((AnonymousClass1E9) r3);
        if (A0C2.A00 != 0) {
            return A0C2.A0L();
        }
        return A0C2.A0M();
    }

    public void A09(C63872tp r5) {
        C41851xA BD0;
        C28791au A052 = this.A07.A05();
        try {
            BD0 = A052.BD0();
            this.A08.A0J(r5);
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

    public void A0A(C63872tp r5) {
        AnonymousClass11S r0 = this.A02;
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        C17960vV.A07(phoneUserJid);
        AnonymousClass1E2 A092 = r0.A09();
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(phoneUserJid);
        if (A092 != null) {
            arrayList.add(A092);
        }
        A0C(r5, arrayList);
    }

    public void A0B(C63872tp r24) {
        C41851xA BD0;
        C199410f r0;
        AnonymousClass1MS r1 = this.A06;
        C63872tp r9 = r24;
        AnonymousClass1E9 r8 = r9.A06;
        C18070vi.A0d(r8, 0);
        r1.A05.put(r8, r9);
        C28791au A052 = this.A07.A05();
        try {
            C41851xA BD02 = A052.BD0();
            try {
                AnonymousClass1MW r7 = this.A08;
                boolean z = false;
                if (r9.A00 != 0) {
                    z = true;
                }
                r9.A06();
                long A092 = r7.A05.A09(r8);
                C28791au A053 = r7.A06.A05();
                try {
                    BD0 = A053.BD0();
                    C23141Ev r4 = ((C28801av) A053).A02;
                    r4.A04("group_participant_user", "group_jid_row_id=?", "saveGroupParticipants/DELETE_GROUP_PARTICIPANT_USER", new String[]{String.valueOf(A092)});
                    if (z) {
                        r0 = C199410f.copyOf(r9.A08.values());
                    } else {
                        r0 = r9.A0B();
                    }
                    AnonymousClass1IZ it = r0.iterator();
                    while (it.hasNext()) {
                        C63312sr r92 = (C63312sr) it.next();
                        UserJid userJid = r92.A04;
                        long A002 = AnonymousClass1MW.A00(r7, userJid);
                        ContentValues contentValues = new ContentValues(5);
                        contentValues.put("group_jid_row_id", Long.valueOf(A092));
                        contentValues.put("user_jid_row_id", Long.valueOf(A002));
                        contentValues.put("rank", Integer.valueOf(r92.A01));
                        contentValues.put("pending", Integer.valueOf(r92.A03 ? 1 : 0));
                        contentValues.put("add_timestamp", Long.valueOf(r92.A02));
                        r4.A05("group_participant_user", "saveGroupParticipants/INSERT_GROUP_PARTICIPANT_USER", contentValues);
                        r7.A07.A01(r92.A00(), r8, userJid, A002);
                        AnonymousClass1MU r10 = r7.A08;
                        boolean A0O = r7.A01.A0O(userJid);
                        if (C18020vd.A05(C18040vf.A02, r10.A01, 8088) && A0O) {
                            r10.A05(A053, r8, r92.A01);
                        }
                    }
                    BD0.A00();
                    BD0.close();
                    A053.close();
                    BD02.A00();
                    BD02.close();
                    A052.close();
                    return;
                } catch (Throwable th) {
                    A053.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                BD02.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A052.close();
                throw th3;
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th3, th4);
                throw th3;
            }
        }
    }

    public void A0D(AnonymousClass1E9 r6, Collection collection) {
        C41851xA BD0;
        C28791au A052 = this.A07.A05();
        try {
            BD0 = A052.BD0();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.A08.A0P(r6, (UserJid) it.next());
            }
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

    public void A0E(AnonymousClass1E9 r8, List list) {
        C41851xA BD0;
        C28791au A052 = this.A07.A05();
        try {
            C41851xA BD02 = A052.BD0();
            try {
                AnonymousClass1MW r4 = this.A08;
                StringBuilder sb = new StringBuilder();
                sb.append("ParticipantUserStore/updateGroupParticipants/");
                sb.append(r8);
                sb.append(" ");
                sb.append(list);
                Log.i(sb.toString());
                C28791au A053 = r4.A06.A05();
                try {
                    BD0 = A053.BD0();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r4.A0I((C63312sr) it.next(), r8);
                    }
                    BD0.A00();
                    BD0.close();
                    A053.close();
                    BD02.A00();
                    BD02.close();
                    A052.close();
                    return;
                } catch (Throwable th) {
                    A053.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                BD02.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A052.close();
                throw th3;
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th3, th4);
                throw th3;
            }
        }
    }

    public void A0F(UserJid userJid, List list) {
        C41851xA BD0;
        C28791au A052 = this.A07.A05();
        try {
            C41851xA BD02 = A052.BD0();
            try {
                AnonymousClass1MW r4 = this.A08;
                StringBuilder sb = new StringBuilder();
                sb.append("ParticipantUserStore/removeParticipantFromGroups ");
                sb.append(list);
                sb.append(" ");
                sb.append(userJid);
                Log.i(sb.toString());
                C28791au A053 = r4.A06.A05();
                try {
                    BD0 = A053.BD0();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r4.A0P((AnonymousClass1E9) it.next(), userJid);
                    }
                    BD0.A00();
                    BD0.close();
                    A053.close();
                    BD02.A00();
                    BD02.close();
                    A052.close();
                    return;
                } catch (Throwable th) {
                    A053.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                BD02.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A052.close();
                throw th3;
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th3, th4);
                throw th3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02b0, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0138, code lost:
        r7.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.C436420i r19) {
        /*
            r18 = this;
            r5 = r19
            X.205 r1 = r5.A0v
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x030c
            X.1BI r1 = r1.A00
            boolean r0 = r1 instanceof X.AnonymousClass1E9
            if (r0 == 0) goto L_0x030c
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1E9 r4 = X.C50242Tr.A00(r1)
            X.C17960vV.A07(r4)
            r3 = r18
            X.1Cd r0 = r3.A07
            X.1au r11 = r0.A05()
            X.1xA r10 = r11.BD0()     // Catch:{ all -> 0x0302 }
            boolean r0 = r5 instanceof X.C48392Mh     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x002f
            r0 = r5
            X.2Mh r0 = (X.C48392Mh) r0     // Catch:{ all -> 0x02f8 }
            java.util.List r6 = r0.A01     // Catch:{ all -> 0x02f8 }
        L_0x002c:
            int r2 = r5.A00     // Catch:{ all -> 0x02f8 }
            goto L_0x0031
        L_0x002f:
            r6 = 0
            goto L_0x002c
        L_0x0031:
            r0 = 2
            if (r2 == r0) goto L_0x02a7
            r0 = 3
            if (r2 == r0) goto L_0x02a7
            r0 = 4
            if (r2 == r0) goto L_0x0274
            r0 = 5
            if (r2 == r0) goto L_0x0238
            r0 = 7
            if (r2 == r0) goto L_0x0238
            r0 = 20
            if (r2 == r0) goto L_0x01c4
            r0 = 52
            if (r2 == r0) goto L_0x01c4
            r0 = 79
            if (r2 == r0) goto L_0x01c4
            r0 = 90
            if (r2 == r0) goto L_0x01c4
            r0 = 106(0x6a, float:1.49E-43)
            if (r2 == r0) goto L_0x01c4
            r0 = 144(0x90, float:2.02E-43)
            if (r2 == r0) goto L_0x01c4
            r0 = 149(0x95, float:2.09E-43)
            if (r2 == r0) goto L_0x01c4
            r0 = 9
            if (r2 == r0) goto L_0x0194
            r0 = 10
            if (r2 == r0) goto L_0x0150
            r0 = 93
            if (r2 == r0) goto L_0x01c4
            r0 = 94
            if (r2 == r0) goto L_0x01c4
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L_0x01c4
            r0 = 124(0x7c, float:1.74E-43)
            if (r2 == r0) goto L_0x01c4
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L_0x01c4
            r0 = 127(0x7f, float:1.78E-43)
            if (r2 == r0) goto L_0x01c4
            switch(r2) {
                case 12: goto L_0x01c4;
                case 13: goto L_0x0081;
                case 14: goto L_0x0081;
                case 15: goto L_0x02a7;
                case 16: goto L_0x02a7;
                case 17: goto L_0x00cf;
                default: goto L_0x007f;
            }     // Catch:{ all -> 0x02f8 }
        L_0x007f:
            goto L_0x02b3
        L_0x0081:
            X.1MW r1 = r3.A08     // Catch:{ all -> 0x02f8 }
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x02f8 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02f8 }
            r0.<init>(r6)     // Catch:{ all -> 0x02f8 }
            r1.A0L(r4, r0)     // Catch:{ all -> 0x02f8 }
            r3.A00(r4, r6)     // Catch:{ all -> 0x02f8 }
            X.1MX r12 = r3.A0A     // Catch:{ all -> 0x02f8 }
            X.0ve r7 = r12.A02     // Catch:{ all -> 0x02f8 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x02f8 }
            boolean r0 = X.C18020vd.A05(r0, r7, r1)     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x02b3
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x02f8 }
            java.util.Set r0 = X.AnonymousClass2WQ.A01     // Catch:{ all -> 0x02f8 }
            r0 = 13
            r17 = 0
            if (r2 != r0) goto L_0x00ac
            r17 = 1
        L_0x00ac:
            long r0 = r5.A0I     // Catch:{ all -> 0x02f8 }
            X.1Cd r5 = r12.A01     // Catch:{ all -> 0x02f8 }
            X.1au r8 = r5.A05()     // Catch:{ all -> 0x02f8 }
            X.1xA r7 = r8.BD0()     // Catch:{ all -> 0x014a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0140 }
        L_0x00bc:
            boolean r5 = r6.hasNext()     // Catch:{ all -> 0x0140 }
            if (r5 == 0) goto L_0x0138
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0140 }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x0140 }
            r13 = r4
            r14 = r5
            r15 = r0
            r12.A04(r13, r14, r15, r17)     // Catch:{ all -> 0x0140 }
            goto L_0x00bc
        L_0x00cf:
            X.1MW r5 = r3.A08     // Catch:{ all -> 0x02f8 }
            X.1DL r0 = r5.A05     // Catch:{ all -> 0x02f8 }
            long r0 = r0.A09(r4)     // Catch:{ all -> 0x02f8 }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02f8 }
            r0 = 4
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x02f8 }
            r13.<init>(r0)     // Catch:{ all -> 0x02f8 }
            java.lang.String r0 = "group_jid_row_id"
            r13.put(r0, r6)     // Catch:{ all -> 0x02f8 }
            r9 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x02f8 }
            java.lang.String r0 = "rank"
            r13.put(r0, r1)     // Catch:{ all -> 0x02f8 }
            java.lang.String r0 = "pending"
            r13.put(r0, r1)     // Catch:{ all -> 0x02f8 }
            java.lang.String r0 = "add_timestamp"
            r13.put(r0, r1)     // Catch:{ all -> 0x02f8 }
            X.1Cd r0 = r5.A06     // Catch:{ all -> 0x02f8 }
            X.1au r8 = r0.A05()     // Catch:{ all -> 0x02f8 }
            X.1xA r7 = r8.BD0()     // Catch:{ all -> 0x014a }
            X.11S r1 = r5.A01     // Catch:{ all -> 0x0140 }
            X.1E2 r0 = r1.A09()     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x0113
            X.1E2 r0 = r1.A09()     // Catch:{ all -> 0x0140 }
            r5.A0P(r4, r0)     // Catch:{ all -> 0x0140 }
        L_0x0113:
            r1.A0I()     // Catch:{ all -> 0x0140 }
            com.whatsapp.jid.PhoneUserJid r0 = r1.A0E     // Catch:{ all -> 0x0140 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x0140 }
            r5.A0P(r4, r0)     // Catch:{ all -> 0x0140 }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0140 }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x0140 }
            java.lang.String r14 = "group_participant_user"
            java.lang.String r15 = "group_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0140 }
            r0[r9] = r6     // Catch:{ all -> 0x0140 }
            java.lang.String r16 = "onGroupEnded/UPDATE_GROUP_PARTICIPANT_USER"
            r17 = r0
            r12.A02(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0140 }
            X.1MV r0 = r5.A07     // Catch:{ all -> 0x0140 }
            r0.A03(r4)     // Catch:{ all -> 0x0140 }
        L_0x0138:
            r7.A00()     // Catch:{ all -> 0x0140 }
            r7.close()     // Catch:{ all -> 0x014a }
            goto L_0x02b0
        L_0x0140:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0145 }
            goto L_0x0149
        L_0x0145:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x014a }
        L_0x0149:
            throw r1     // Catch:{ all -> 0x014a }
        L_0x014a:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0233 }
            goto L_0x0237
        L_0x0150:
            X.2MN r5 = (X.AnonymousClass2MN) r5     // Catch:{ all -> 0x02f8 }
            X.1MW r8 = r3.A08     // Catch:{ all -> 0x02f8 }
            com.whatsapp.jid.UserJid r7 = r5.A00     // Catch:{ all -> 0x02f8 }
            X.C17960vV.A07(r7)     // Catch:{ all -> 0x02f8 }
            com.whatsapp.jid.UserJid r6 = r5.A01     // Catch:{ all -> 0x02f8 }
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x02f8 }
            X.2tp r1 = r8.A0B(r4)     // Catch:{ all -> 0x02f8 }
            r0 = 0
            X.2sr r1 = r1.A0D(r7, r0)     // Catch:{ all -> 0x02f8 }
            X.1Cd r0 = r8.A06     // Catch:{ all -> 0x02f8 }
            X.1au r5 = r0.A05()     // Catch:{ all -> 0x02f8 }
            X.1xA r0 = r5.BD0()     // Catch:{ all -> 0x018e }
            r8.A0P(r4, r6)     // Catch:{ all -> 0x0184 }
            if (r1 == 0) goto L_0x0179
            r8.A0I(r1, r4)     // Catch:{ all -> 0x0184 }
        L_0x0179:
            r0.A00()     // Catch:{ all -> 0x0184 }
            r0.close()     // Catch:{ all -> 0x018e }
            r5.close()     // Catch:{ all -> 0x02f8 }
            goto L_0x02b3
        L_0x0184:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x0189:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x018e }
        L_0x018d:
            throw r1     // Catch:{ all -> 0x018e }
        L_0x018e:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0233 }
            goto L_0x0237
        L_0x0194:
            boolean r0 = r3.A0I(r4)     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x01b9
            X.11S r0 = r3.A02     // Catch:{ all -> 0x02f8 }
            X.1E2 r5 = r0.A0A()     // Catch:{ all -> 0x02f8 }
        L_0x01a0:
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x02f8 }
            r1 = r6
            boolean r0 = r6.contains(r5)     // Catch:{ all -> 0x02f8 }
            if (r0 != 0) goto L_0x01b2
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x02f8 }
            r1.<init>(r6)     // Catch:{ all -> 0x02f8 }
            r1.add(r5)     // Catch:{ all -> 0x02f8 }
        L_0x01b2:
            X.1MW r0 = r3.A08     // Catch:{ all -> 0x02f8 }
            r0.A0K(r4, r1)     // Catch:{ all -> 0x02f8 }
            goto L_0x02b3
        L_0x01b9:
            X.11S r0 = r3.A02     // Catch:{ all -> 0x02f8 }
            r0.A0I()     // Catch:{ all -> 0x02f8 }
            com.whatsapp.jid.PhoneUserJid r5 = r0.A0E     // Catch:{ all -> 0x02f8 }
            X.C17960vV.A07(r5)     // Catch:{ all -> 0x02f8 }
            goto L_0x01a0
        L_0x01c4:
            X.1MW r0 = r3.A08     // Catch:{ all -> 0x02f8 }
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x02f8 }
            r0.A0K(r4, r6)     // Catch:{ all -> 0x02f8 }
            X.1MX r8 = r3.A0A     // Catch:{ all -> 0x02f8 }
            X.0ve r5 = r8.A02     // Catch:{ all -> 0x02f8 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x02f8 }
            boolean r0 = X.C18020vd.A05(r0, r5, r1)     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x02b3
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x02f8 }
            X.1Cd r0 = r8.A01     // Catch:{ all -> 0x02f8 }
            X.1au r7 = r0.A05()     // Catch:{ all -> 0x02f8 }
            X.1xA r5 = r7.BD0()     // Catch:{ all -> 0x022e }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0224 }
        L_0x01eb:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0224 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0224 }
            r8.A03(r4, r0)     // Catch:{ all -> 0x0224 }
            goto L_0x01eb
        L_0x01fb:
            r5.A00()     // Catch:{ all -> 0x0224 }
            r5.close()     // Catch:{ all -> 0x022e }
            r7.close()     // Catch:{ all -> 0x02f8 }
            X.11S r5 = r3.A02     // Catch:{ all -> 0x02f8 }
            r5.getClass()     // Catch:{ all -> 0x02f8 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x02f8 }
        L_0x020d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x02b3
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x02f8 }
            X.1BI r0 = (X.AnonymousClass1BI) r0     // Catch:{ all -> 0x02f8 }
            boolean r0 = r5.A0O(r0)     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x020d
            r8.A02(r4)     // Catch:{ all -> 0x02f8 }
            goto L_0x02b3
        L_0x0224:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0229 }
            goto L_0x022d
        L_0x0229:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x022e }
        L_0x022d:
            throw r1     // Catch:{ all -> 0x022e }
        L_0x022e:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0233 }
            goto L_0x0237
        L_0x0233:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x02f8 }
        L_0x0237:
            throw r1     // Catch:{ all -> 0x02f8 }
        L_0x0238:
            X.1BI r1 = r5.A0H()     // Catch:{ all -> 0x02f8 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x02f8 }
            com.whatsapp.jid.UserJid r14 = X.C22941Dw.A01(r1)     // Catch:{ all -> 0x02f8 }
            X.C17960vV.A07(r14)     // Catch:{ all -> 0x02f8 }
            X.1MW r1 = r3.A08     // Catch:{ all -> 0x02f8 }
            java.util.List r0 = java.util.Collections.singletonList(r14)     // Catch:{ all -> 0x02f8 }
            r1.A0L(r4, r0)     // Catch:{ all -> 0x02f8 }
            java.util.List r0 = java.util.Collections.singletonList(r14)     // Catch:{ all -> 0x02f8 }
            r3.A00(r4, r0)     // Catch:{ all -> 0x02f8 }
            X.1MX r12 = r3.A0A     // Catch:{ all -> 0x02f8 }
            X.0ve r6 = r12.A02     // Catch:{ all -> 0x02f8 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x02f8 }
            boolean r0 = X.C18020vd.A05(r0, r6, r1)     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x02b3
            java.util.Set r0 = X.AnonymousClass2WQ.A01     // Catch:{ all -> 0x02f8 }
            r0 = 5
            r17 = 1
            if (r2 == r0) goto L_0x026c
            r17 = 0
        L_0x026c:
            long r0 = r5.A0I     // Catch:{ all -> 0x02f8 }
            r13 = r4
            r15 = r0
            r12.A04(r13, r14, r15, r17)     // Catch:{ all -> 0x02f8 }
            goto L_0x02b3
        L_0x0274:
            X.1BI r1 = r5.A0H()     // Catch:{ all -> 0x02f8 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x02f8 }
            com.whatsapp.jid.UserJid r7 = X.C22941Dw.A01(r1)     // Catch:{ all -> 0x02f8 }
            X.C17960vV.A07(r7)     // Catch:{ all -> 0x02f8 }
            X.1MW r1 = r3.A08     // Catch:{ all -> 0x02f8 }
            java.util.List r0 = java.util.Collections.singletonList(r7)     // Catch:{ all -> 0x02f8 }
            r1.A0K(r4, r0)     // Catch:{ all -> 0x02f8 }
            X.1MX r6 = r3.A0A     // Catch:{ all -> 0x02f8 }
            X.0ve r5 = r6.A02     // Catch:{ all -> 0x02f8 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x02f8 }
            boolean r0 = X.C18020vd.A05(r0, r5, r1)     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x02b3
            r6.A03(r4, r7)     // Catch:{ all -> 0x02f8 }
            X.11S r0 = r3.A02     // Catch:{ all -> 0x02f8 }
            boolean r0 = r0.A0O(r7)     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x02b3
            r6.A02(r4)     // Catch:{ all -> 0x02f8 }
            goto L_0x02b3
        L_0x02a7:
            X.1MW r0 = r3.A08     // Catch:{ all -> 0x02f8 }
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x02f8 }
            r0.A0K(r4, r6)     // Catch:{ all -> 0x02f8 }
            goto L_0x02b3
        L_0x02b0:
            r8.close()     // Catch:{ all -> 0x02f8 }
        L_0x02b3:
            r10.A00()     // Catch:{ all -> 0x02f8 }
            r10.close()     // Catch:{ all -> 0x0302 }
            r11.close()
            boolean r0 = r4 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x030c
            java.util.Set r0 = X.AnonymousClass2WQ.A01
            r0 = 4
            if (r2 == r0) goto L_0x02eb
            r0 = 12
            if (r2 == r0) goto L_0x02eb
            r0 = 52
            if (r2 == r0) goto L_0x02eb
            r0 = 20
            if (r2 == r0) goto L_0x02eb
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L_0x02eb
            r0 = 7
            if (r2 == r0) goto L_0x02eb
            r0 = 14
            if (r2 == r0) goto L_0x02eb
            r0 = 5
            if (r2 == r0) goto L_0x02eb
            r0 = 13
            if (r2 == r0) goto L_0x02eb
            r0 = 93
            if (r2 == r0) goto L_0x02eb
            r0 = 94
            if (r2 != r0) goto L_0x030c
        L_0x02eb:
            X.1KB r2 = r3.A01
            r1 = 31
            X.3Bx r0 = new X.3Bx
            r0.<init>(r3, r4, r1)
            r2.A0J(r0)
            return
        L_0x02f8:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x02fd }
            goto L_0x0301
        L_0x02fd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0302 }
        L_0x0301:
            throw r1     // Catch:{ all -> 0x0302 }
        L_0x0302:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0307 }
            throw r1
        L_0x0307:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x030c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MZ.A0G(X.20i):void");
    }

    public boolean A0I(AnonymousClass1BI r3) {
        if (!(r3 instanceof AnonymousClass1E9)) {
            return false;
        }
        return AnonymousClass000.A1T(2, this.A08.A0C((AnonymousClass1E9) r3).A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r2 == X.C29701cj.A06) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0J(com.whatsapp.jid.GroupJid r6) {
        /*
            r5 = this;
            X.1MU r4 = r5.A09
            boolean r0 = r4.A06(r6)
            if (r0 == 0) goto L_0x002c
            r0 = 2
            X.7S0 r3 = new X.7S0
            r3.<init>(r6, r5, r0)
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.1CJ r0 = r4.A00
            X.1cj r2 = r0.A0C(r6)
            X.1cj r0 = X.C29701cj.PARTICIPANT
            if (r2 == r0) goto L_0x0025
            X.1cj r0 = X.C29701cj.ADMIN
            if (r2 == r0) goto L_0x0025
            X.1cj r0 = X.C29701cj.SUPER_ADMIN
            r1 = 0
            if (r2 != r0) goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            java.lang.String r0 = "hasMe"
            X.AnonymousClass1MU.A02(r4, r6, r0, r3, r1)
            return r1
        L_0x002c:
            X.1MW r0 = r5.A08
            X.2tp r1 = r0.A0C(r6)
            X.11S r0 = r5.A02
            boolean r1 = r1.A0W(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MZ.A0J(com.whatsapp.jid.GroupJid):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r2 == X.C29701cj.A06) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(com.whatsapp.jid.GroupJid r6) {
        /*
            r5 = this;
            X.1MU r4 = r5.A09
            boolean r0 = r4.A06(r6)
            if (r0 == 0) goto L_0x0028
            r0 = 4
            X.7S0 r3 = new X.7S0
            r3.<init>(r6, r5, r0)
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.1CJ r0 = r4.A00
            X.1cj r2 = r0.A0C(r6)
            X.1cj r0 = X.C29701cj.ADMIN
            if (r2 == r0) goto L_0x0021
            X.1cj r0 = X.C29701cj.SUPER_ADMIN
            r1 = 0
            if (r2 != r0) goto L_0x0022
        L_0x0021:
            r1 = 1
        L_0x0022:
            java.lang.String r0 = "isMeAdmin"
            X.AnonymousClass1MU.A02(r4, r6, r0, r3, r1)
            return r1
        L_0x0028:
            X.1MW r0 = r5.A08
            X.2tp r1 = r0.A0C(r6)
            X.11S r0 = r5.A02
            boolean r0 = r1.A0X(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MZ.A0K(com.whatsapp.jid.GroupJid):boolean");
    }

    @Deprecated
    public boolean A0L(GroupJid groupJid, UserJid userJid) {
        AnonymousClass1E1 A0A2;
        C63872tp A0C2 = this.A08.A0C(groupJid);
        if (userJid != null && A0C2.A0D(userJid, false) != null) {
            return true;
        }
        if (!C22971Dz.A0Y(userJid) || A0C2.A00 == 0 || (A0A2 = this.A0B.A0A((PhoneUserJid) userJid)) == null || A0C2.A0D(A0A2, false) == null) {
            return false;
        }
        return true;
    }

    public boolean A0M(AnonymousClass1E9 r4) {
        AnonymousClass1IZ it = this.A08.A0C(r4).A08().iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0E2 = this.A03.A0E(((C63312sr) it.next()).A04);
            if (A0E2 != null && A0E2.A0C()) {
                return true;
            }
        }
        return false;
    }

    public boolean A0N(AnonymousClass1E9 r5, UserJid userJid) {
        UserJid A0F2;
        C63872tp A0C2 = this.A08.A0C(r5);
        boolean z = false;
        if (A0C2.A0D(userJid, false) != null) {
            z = true;
        }
        if (z || ((A0F2 = this.A0B.A0F(userJid)) != null && A0C2.A0D(A0F2, false) != null)) {
            return true;
        }
        return false;
    }

    public boolean A0O(AnonymousClass1EC r4) {
        AnonymousClass1E7 A0E2;
        Iterator it = this.A08.A0C(r4).A0K().iterator();
        while (it.hasNext()) {
            AnonymousClass11S r0 = this.A02;
            UserJid userJid = ((C63312sr) it.next()).A04;
            if (!r0.A0O(userJid) && (A0E2 = this.A03.A0E(userJid)) != null && A0E2.A0H != null) {
                return true;
            }
        }
        return false;
    }

    public boolean A0P(AnonymousClass1EC r6) {
        UserJid userJid;
        C63312sr A0D2;
        AnonymousClass1MU r4 = this.A09;
        if (r4.A06(r6)) {
            AnonymousClass7S0 r3 = new AnonymousClass7S0(r6, this, 3);
            C18070vi.A0d(r6, 0);
            boolean z = false;
            if (r4.A00.A0C(r6) == C29701cj.SUPER_ADMIN) {
                z = true;
            }
            AnonymousClass1MU.A02(r4, r6, "isMeSuperAdmin", r3, z);
            return z;
        }
        C63872tp A0C2 = this.A08.A0C(r6);
        AnonymousClass11S r1 = this.A02;
        if (A0C2.A00 != 0) {
            userJid = r1.A09();
        } else {
            r1.A0I();
            userJid = r1.A0E;
        }
        if (userJid == null || (A0D2 = A0C2.A0D(userJid, false)) == null || A0D2.A01 != 2) {
            return false;
        }
        return true;
    }

    public boolean A0R(AnonymousClass206 r5) {
        Jid A0H2;
        AnonymousClass205 r1 = r5.A0v;
        AnonymousClass1BI r3 = r1.A00;
        if (C22971Dz.A0e(r3)) {
            AnonymousClass1EC r32 = (AnonymousClass1EC) r3;
            if (r1.A02) {
                boolean A0I2 = A0I(r32);
                AnonymousClass11S r0 = this.A02;
                if (A0I2) {
                    A0H2 = r0.A09();
                } else {
                    r0.A0I();
                    A0H2 = r0.A0E;
                    C17960vV.A07(A0H2);
                }
            } else {
                A0H2 = r5.A0H();
            }
            if (C22971Dz.A0d(A0H2)) {
                return A0Q(r32, (UserJid) A0H2);
            }
        }
        return false;
    }

    public AnonymousClass1MZ(AnonymousClass190 r2, AnonymousClass1KB r3, AnonymousClass11S r4, AnonymousClass1M9 r5, AnonymousClass11P r6, AnonymousClass1CJ r7, AnonymousClass1MS r8, AnonymousClass1Cd r9, AnonymousClass1MY r10, AnonymousClass1MW r11, AnonymousClass1MU r12, AnonymousClass1MX r13, C24751Ln r14, AnonymousClass1MR r15, C18030ve r16, AnonymousClass1MG r17, AnonymousClass10I r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23) {
        this.A04 = r6;
        this.A0D = r16;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A0E = r18;
        this.A05 = r7;
        this.A0H = r19;
        this.A0L = r17;
        this.A03 = r5;
        this.A0B = r14;
        this.A0C = r15;
        this.A07 = r9;
        this.A08 = r11;
        this.A0G = r20;
        this.A0J = r21;
        this.A06 = r8;
        this.A09 = r12;
        this.A0A = r13;
        this.A0I = r22;
        this.A0K = r10;
        this.A0F = r23;
        Boolean bool = C17960vV.A01;
    }

    public C63312sr A04(C63872tp r4, UserJid userJid) {
        Map map;
        if (C22971Dz.A0Y(userJid)) {
            map = r4.A09;
        } else {
            map = r4.A08;
        }
        C63312sr r2 = (C63312sr) map.remove(userJid);
        if (r2 != null) {
            r4.A0O();
        }
        ((C58922lT) this.A0J.get()).A01(r4, Collections.singleton(userJid));
        return r2;
    }

    public void A0C(C63872tp r2, Collection collection) {
        r2.A0R(collection);
        ((C58922lT) this.A0J.get()).A01(r2, collection);
    }

    public void A0H(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1E9 r3 = (AnonymousClass1E9) it.next();
            C63872tp A0A2 = this.A08.A04.A0A(r3);
            if (A0A2 != null) {
                A0A(A0A2);
            }
            AnonymousClass1MU r2 = this.A09;
            C18070vi.A0d(r3, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("ParticipationChatsCache/setParticipatingCacheOnly: ");
            sb.append(r3);
            sb.append(' ');
            sb.append(C29701cj.A00);
            sb.append(".NOT_PARTICIPANT");
            Log.i(sb.toString());
            C29691ci A002 = AnonymousClass1CJ.A00(r2.A00, r3);
            if (A002 != null) {
                A002.A0c = C29701cj.NOT_PARTICIPANT;
            }
        }
    }

    public boolean A0Q(AnonymousClass1EC r3, UserJid userJid) {
        C63312sr A052 = A05(r3, userJid);
        if (A052 == null || A052.A01 == 0) {
            return false;
        }
        return true;
    }
}
