package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1kb  reason: invalid class name and case insensitive filesystem */
public final class C34511kb {
    public final AnonymousClass1KB A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1QW A03;
    public final C34451kV A04;
    public final AnonymousClass1NI A05;
    public final AnonymousClass1MZ A06;
    public final C18030ve A07;
    public final AnonymousClass1MG A08;
    public final AnonymousClass1Nb A09;
    public final AnonymousClass10I A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final C18100vl A0D = new C18110vm(new C34521kc(this));
    public final AnonymousClass11S A0E;
    public final AnonymousClass1V3 A0F;
    public final AnonymousClass11P A0G;
    public final C34461kW A0H;
    public final AnonymousClass1MY A0I;
    public final C34471kX A0J;
    public final C34491kZ A0K;
    public final C34441kU A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AtomicBoolean A0Q = new AtomicBoolean(false);

    public final A2B A01(AnonymousClass1EC r2) {
        C18070vi.A0d(r2, 0);
        return this.A08.A02(r2);
    }

    public final GroupJid A03(AnonymousClass1EC r4) {
        A2B a2b;
        if (r4 == null || (a2b = (A2B) C29431cG.A0c(C29431cG.A0t(C29431cG.A0y(A00(this, this.A08.A03(r4)), (Comparator) this.A0D.getValue())))) == null) {
            return null;
        }
        return a2b.A02;
    }

    public final AnonymousClass1EC A04(AnonymousClass1EC r3) {
        GroupJid groupJid;
        C18070vi.A0d(r3, 0);
        A2B A022 = this.A08.A02(r3);
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        if (A022 != null) {
            groupJid = A022.A02;
        } else {
            groupJid = null;
        }
        return C42941yz.A00(groupJid);
    }

    public final AnonymousClass1EC A05(AnonymousClass1EC r2) {
        C18070vi.A0d(r2, 0);
        AnonymousClass1MG r0 = this.A08;
        r0.A04();
        return (AnonymousClass1EC) r0.A02.get(r2);
    }

    public final String A06(AnonymousClass1E7 r3, AnonymousClass1BI r4, Integer num, int i) {
        C18070vi.A0d(r3, 1);
        AnonymousClass1BI r1 = r3.A0J;
        if (r1 instanceof PhoneUserJid) {
            r1 = ((C24751Ln) this.A0M.get()).A0C((PhoneUserJid) r1);
        }
        if (!(r1 instanceof AnonymousClass1E2)) {
            return null;
        }
        return ((C24921Me) this.A0P.get()).A0V(this.A01.A0H(r1), r4, num, i);
    }

    public final HashSet A07(AnonymousClass1EC r7) {
        C18070vi.A0d(r7, 0);
        C53482cb r5 = (C53482cb) this.A0O.get();
        HashSet A032 = r5.A01.A03(r7);
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            A2B a2b = (A2B) it.next();
            C18070vi.A0d(a2b, 1);
            if (!(!r5.A00.A0J(a2b.A02))) {
                it.remove();
            }
        }
        return A032;
    }

    public final HashSet A08(AnonymousClass1EC r7) {
        C18070vi.A0d(r7, 0);
        C53482cb r5 = (C53482cb) this.A0O.get();
        HashSet A032 = r5.A01.A03(r7);
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            A2B a2b = (A2B) it.next();
            C18070vi.A0d(a2b, 1);
            if (!r5.A00.A0J(a2b.A02)) {
                it.remove();
            }
        }
        return A032;
    }

    public final List A0B(AnonymousClass1EC r3) {
        C18070vi.A0d(r3, 0);
        return AnonymousClass1b2.A06(AnonymousClass1b2.A09(new AnonymousClass3IG(this), AnonymousClass1b2.A09(new AnonymousClass3IF(this), AnonymousClass1b2.A09(new AnonymousClass3IE(this), AnonymousClass1b2.A0B(C29431cG.A0V(this.A08.A03(r3)))))));
    }

    public final List A0C(AnonymousClass1EC r6) {
        C18070vi.A0d(r6, 0);
        HashSet A032 = this.A08.A03(r6);
        ArrayList arrayList = new ArrayList();
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int A033 = this.A02.A03(((A2B) next).A02);
            if (A033 > 0 || A033 == -1) {
                arrayList.add(next);
            }
        }
        List A002 = A00(this, C29431cG.A0t(arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : A002) {
            if (this.A06.A0J(((A2B) next2).A02)) {
                arrayList2.add(next2);
            }
        }
        return C29431cG.A0t(arrayList2);
    }

    public final void A0E(int i) {
        SharedPreferences.Editor putInt;
        SharedPreferences.Editor editor;
        String str;
        SharedPreferences sharedPreferences;
        if (i != 0) {
            if (i != 1) {
                AtomicBoolean atomicBoolean = this.A0Q;
                if (i == 2) {
                    atomicBoolean.set(false);
                    C34471kX r1 = this.A0J;
                    editor = C34471kX.A00(r1).edit();
                    sharedPreferences = C34471kX.A00(r1);
                    str = "community_tab_group_navigation";
                } else if (atomicBoolean.getAndSet(false)) {
                    C34471kX r7 = this.A0J;
                    putInt = C34471kX.A00(r7).edit().putInt("community_tab_no_action_view", Math.min(C34471kX.A00(r7).getInt("community_tab_no_action_view", 0), C34471kX.A00(r7).getInt("community_tab_daily_views", 0) + C34471kX.A00(r7).getInt("community_tab_views_via_context_menu", 0)) + 1);
                } else {
                    return;
                }
            } else {
                this.A0Q.set(false);
                C34471kX r12 = this.A0J;
                editor = C34471kX.A00(r12).edit();
                sharedPreferences = C34471kX.A00(r12);
                str = "community_tab_to_home_views";
            }
            putInt = editor.putInt(str, sharedPreferences.getInt(str, 0) + 1);
        } else {
            this.A0Q.set(true);
            C34471kX r13 = this.A0J;
            putInt = C34471kX.A00(r13).edit().putInt("community_tab_daily_views", C34471kX.A00(r13).getInt("community_tab_daily_views", 0) + 1);
        }
        putInt.apply();
    }

    public final void A0F(AnonymousClass1GV r4, AnonymousClass1EC r5) {
        C18070vi.A0d(r5, 0);
        this.A0A.CGF(new C21434Ak1(this, r5, r4, 40));
    }

    public final void A0H(AnonymousClass1E7 r4, AnonymousClass1EC r5) {
        C18070vi.A0d(r5, 0);
        AnonymousClass1MG r0 = this.A08;
        r0.A04();
        AnonymousClass1EC r1 = (AnonymousClass1EC) r0.A02.get(r5);
        if (r1 != null && r4 != null && r4.A0n && !this.A06.A0K(r1)) {
            A0N(r1, AnonymousClass1ZU.A06(r5));
        }
    }

    public final void A0I(GroupJid groupJid) {
        Object obj;
        String str;
        Cursor A0A2;
        C18070vi.A0d(groupJid, 0);
        AnonymousClass1MG r4 = this.A08;
        r4.A04();
        AnonymousClass1EC r3 = (AnonymousClass1EC) r4.A02.get(groupJid);
        if (r3 == null) {
            str = "SubgroupCache/clearLinkingTimestamp/subgroup has no parent";
        } else {
            try {
                C24811Lt r1 = r4.A00.A00;
                C28781at A062 = r1.A06();
                try {
                    String rawString = groupJid.getRawString();
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.putNull("linking_timestamp");
                    if (((C28801av) A062).A02.A02(contentValues, "subgroup_info", "subgroup_raw_jid = ?", "SUBGROUP_INFO_CLEAR_LINKING_TIMESTAMP_QUERY", new String[]{rawString}) != 0) {
                        String[] strArr = {groupJid.getRawString()};
                        try {
                            A062 = r1.get();
                            try {
                                A0A2 = ((C28801av) A062).A02.A0A("SELECT subgroups.subgroup_raw_jid, subject, subject_ts, group_type, group_membership_approval_state, linking_timestamp, last_known_member_count FROM subgroup_info subgroups INNER JOIN group_relationship relationship ON subgroups.subgroup_raw_jid = relationship.subgroup_raw_id WHERE relationship.subgroup_raw_id = ?", "GET_SUBGROUPS_WITH_PARENT_JID_SQL", strArr);
                                if (A0A2.moveToNext()) {
                                    A2B A002 = AnonymousClass1MF.A00(A0A2);
                                    A0A2.close();
                                    A062.close();
                                    if (A002 != null) {
                                        obj = new C46192Dn(A002);
                                    }
                                    obj = new C116825yg(new IllegalStateException("Failed to update group."));
                                } else {
                                    A0A2.close();
                                    A062.close();
                                    obj = new C116825yg(new IllegalStateException("Failed to update group."));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Exception e) {
                            Log.e((Throwable) e);
                        } catch (Throwable th2) {
                        }
                    } else {
                        obj = new C116825yg(new IllegalStateException("No groups where updated for the provided subgroup's jid."));
                    }
                    A062.close();
                    if (!(obj instanceof C46192Dn)) {
                        str = "SubgroupCache/clearLinkingTimestamp/failed to clear timestamp from store";
                    } else {
                        A2B A012 = AnonymousClass1MG.A01(r4, groupJid, r3);
                        C61492pm r12 = (C61492pm) r4.A01.get(r3);
                        if (r12 != null) {
                            if (A012 != null) {
                                r12.A02.remove(A012);
                            }
                            r12.A02.add(((C46192Dn) obj).A00);
                        }
                        ((C26211Rg) this.A0N.get()).A00(groupJid);
                        return;
                    }
                } finally {
                    A062.close();
                }
            } catch (Exception e2) {
                Log.e((Throwable) e2);
                obj = new C116825yg(e2);
            } catch (Throwable th22) {
                AnonymousClass0DT.A00(th, th22);
            }
        }
        Log.e(str);
        return;
        throw th;
    }

    public final void A0J(GroupJid groupJid, int i) {
        String str;
        C41851xA BD0;
        C18070vi.A0d(groupJid, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("\n        CommunityChatManagerincrementCommunityHomeActionLoggingCount\n        /parentGroupJid = ");
        sb.append(groupJid.getRawString());
        sb.append("\n        action type = ");
        int i2 = i;
        sb.append(i2);
        sb.append("\n        ");
        AnonymousClass1Y7.A01(sb.toString());
        C34491kZ r1 = this.A0K;
        long A092 = r1.A00.A09(groupJid);
        if (i == 0) {
            str = "home_view_count";
        } else if (i2 == 1) {
            str = "home_group_navigation_count";
        } else if (i2 != 2) {
            str = "home_group_join_count";
        } else {
            str = "home_group_discovery_count";
        }
        C28791au A062 = r1.A01.A06();
        try {
            BD0 = A062.BD0();
            C23141Ev r6 = ((C28801av) A062).A02;
            if (!(!TextUtils.isEmpty(C28331Zy.A00(r6, "table", "community_home_action_logging")))) {
                Log.e("CommunityHomeActionLoggingStore/incrementCount: table does not exist");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UPDATE community_home_action_logging SET ");
                sb2.append(str);
                sb2.append(" = ");
                sb2.append(str);
                sb2.append(" + ?");
                sb2.append(" WHERE ");
                sb2.append("jid_row_id");
                sb2.append(" = ?");
                C60042nI A0D2 = r6.A0D(sb2.toString(), "update_community_action");
                SQLiteStatement sQLiteStatement = A0D2.A00;
                sQLiteStatement.bindLong(1, 1);
                sQLiteStatement.bindLong(2, A092);
                if (A0D2.A00() == 0) {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("jid_row_id", Long.valueOf(A092));
                    contentValues.put(str, 1);
                    r6.A05("community_home_action_logging", "update_community_action", contentValues);
                }
                BD0.A00();
            }
            BD0.close();
            A062.close();
            return;
        } catch (Throwable th) {
            try {
                A062.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A0K(GroupJid groupJid, Integer num) {
        C18070vi.A0d(groupJid, 0);
        if (C18020vd.A05(C18040vf.A02, this.A07, 7180) && this.A08.A07(groupJid, num)) {
            ((C26211Rg) this.A0N.get()).A00(groupJid);
        }
    }

    public final void A0L(AnonymousClass1EC r10) {
        C18070vi.A0d(r10, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("CommunityChatManager/deleteParentGroup: ");
        sb.append(r10);
        Log.i(sb.toString());
        AnonymousClass1E7 A0E2 = this.A01.A0E(r10);
        AnonymousClass1V3 r6 = this.A0F;
        Set A072 = r6.A01.A07(r10, true);
        r6.A03.BIE(r10, true);
        r6.A00.A0R(A072);
        if (A0E2 != null) {
            AnonymousClass1MY r5 = this.A0I;
            synchronized (r5) {
                C28791au A052 = r5.A01.A05();
                try {
                    ((C28801av) A052).A02.A04("parent_group_participants", "parent_group_jid_row_id = ?", "parent_group_participants_store/DELETE_ALL_PARTICIPANTS", new String[]{String.valueOf(Long.valueOf(r5.A00.A09(r10)))});
                    A052.close();
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                }
            }
            this.A09.A0r(r10, A0E2.A0F());
            r6.A00(A0E2);
            A0M(r10);
            return;
        }
        return;
        throw th;
    }

    public final void A0M(AnonymousClass1EC r5) {
        C18070vi.A0d(r5, 0);
        AnonymousClass1MG r3 = this.A08;
        r3.A04();
        r3.A00.A05(r5, Collections.emptyList());
        C61492pm r0 = (C61492pm) r3.A01.remove(r5);
        if (r0 != null) {
            for (A2B a2b : r0.A02) {
                r3.A02.remove(a2b.A02);
            }
        }
    }

    public final void A0N(AnonymousClass1EC r4, Collection collection) {
        C18070vi.A0d(r4, 0);
        C18070vi.A0d(collection, 1);
        this.A0A.CGF(new C21434Ak1(collection, this, r4, 39));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r3 = r5.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0U(X.AnonymousClass1EC r6) {
        /*
            r5 = this;
            r4 = 0
            X.0ve r2 = r5.A07
            r1 = 1864(0x748, float:2.612E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0035
            X.1CJ r3 = r5.A02
            X.1ci r2 = r3.A0A(r6)
            if (r2 == 0) goto L_0x0035
            X.1MZ r1 = r5.A06
            boolean r0 = r1.A0K(r6)
            if (r0 == 0) goto L_0x0035
            boolean r0 = r1.A0P(r6)
            if (r0 != 0) goto L_0x0035
            int r1 = r3.A06(r6)
            r0 = 1
            if (r1 != r0) goto L_0x0035
            monitor-enter(r2)
            boolean r0 = r2.A0n     // Catch:{ all -> 0x0032 }
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0035
            r4 = 1
            return r4
        L_0x0032:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0035:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34511kb.A0U(X.1EC):boolean");
    }

    public final boolean A0V(AnonymousClass1EC r4) {
        C18070vi.A0d(r4, 0);
        AnonymousClass1E7 A0E2 = this.A01.A0E(r4);
        if (A0E2 == null) {
            C17960vV.A0F(false, "unexpected parent group null in subgroup creation, was it deactivated?");
            return false;
        } else if (A0E2.A0e || this.A06.A0K(r4)) {
            return true;
        } else {
            return false;
        }
    }

    public final GroupJid A02(AnonymousClass1EC r5) {
        C53482cb r3 = (C53482cb) this.A0O.get();
        Iterator it = r3.A01.A03(r5).iterator();
        while (it.hasNext()) {
            AnonymousClass1MZ r0 = r3.A00;
            GroupJid groupJid = ((A2B) it.next()).A02;
            if (r0.A0J(groupJid)) {
                return groupJid;
            }
        }
        return null;
    }

    public final List A09() {
        ArrayList A002 = this.A03.A00();
        ArrayList arrayList = new ArrayList();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
            AnonymousClass1EC A003 = C42941yz.A00((Jid) next);
            if (A003 != null && (!A08(A003).isEmpty())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final List A0A(AnonymousClass1EC r6) {
        HashSet A032 = this.A08.A03(r6);
        ArrayList arrayList = new ArrayList();
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!this.A02.A0S(((A2B) next).A02)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final void A0D() {
        AnonymousClass1MG r0 = this.A08;
        r0.A04();
        ArrayList arrayList = new ArrayList();
        for (C61492pm r02 : r0.A01.values()) {
            A2B a2b = r02.A00;
            if (a2b != null) {
                arrayList.add(a2b.A02);
            }
        }
    }

    public final void A0G(C29691ci r5) {
        long A012 = AnonymousClass11P.A01(this.A0G) / 1000;
        synchronized (r5) {
            r5.A0L = A012;
        }
        this.A03.A01(r5);
        this.A00.A0J(new AnonymousClass7RL(this, r5, 45));
    }

    public final void A0O(AnonymousClass1EC r6, boolean z) {
        boolean z2;
        C29691ci A002 = AnonymousClass1CJ.A00(this.A02, r6);
        if (A002 != null) {
            C34461kW r3 = this.A0H;
            synchronized (A002) {
                z2 = A002.A0n;
            }
            if (z2 != z) {
                synchronized (A002) {
                    A002.A0n = z;
                }
                ((C31931gM) r3.A02.get()).A01(new AnonymousClass3Bx(r3, A002, 41), 60);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r3.A06.A0K(r1) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0P(X.AnonymousClass1BI r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.AnonymousClass1EC
            r2 = 0
            if (r0 == 0) goto L_0x0034
            X.1kU r0 = r3.A0L
            java.lang.String r1 = "community_home"
            X.1aA r0 = r0.A00
            boolean r0 = r0.A01(r4, r1)
            if (r0 != 0) goto L_0x0034
            boolean r0 = r3.A0Q(r4)
            if (r0 == 0) goto L_0x0025
            r1 = r4
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            X.C18070vi.A0d(r1, r2)
            X.1MZ r0 = r3.A06
            boolean r0 = r0.A0K(r1)
            if (r0 == 0) goto L_0x0033
        L_0x0025:
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            X.1CJ r0 = r3.A02
            int r0 = r0.A06(r4)
            boolean r0 = X.AnonymousClass2TI.A00(r0)
            if (r0 == 0) goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34511kb.A0P(X.1BI):boolean");
    }

    public final boolean A0Q(AnonymousClass1BI r4) {
        if (!(r4 instanceof AnonymousClass1EC) || this.A02.A06((GroupJid) r4) != 1) {
            return false;
        }
        return true;
    }

    public final boolean A0R(GroupJid groupJid) {
        if (this.A02.A06(groupJid) == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0S(com.whatsapp.jid.GroupJid r4, com.whatsapp.jid.GroupJid r5) {
        /*
            r3 = this;
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r1 = X.C42941yz.A00(r5)
            X.1EC r2 = X.C42941yz.A00(r4)
            if (r1 == 0) goto L_0x0040
            X.1MG r0 = r3.A08
            X.A2B r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0024
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r1 = X.C18070vi.A18(r0, r2)
        L_0x001a:
            if (r2 == 0) goto L_0x0023
            X.1CJ r0 = r3.A02
            boolean r0 = r0.A0R(r2)
            r1 = r1 | r0
        L_0x0023:
            return r1
        L_0x0024:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CommunityChatManager/attempting to check SubgroupCache for missing CAG, gid:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; parent: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0040:
            r1 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34511kb.A0S(com.whatsapp.jid.GroupJid, com.whatsapp.jid.GroupJid):boolean");
    }

    public final boolean A0T(GroupJid groupJid, GroupJid groupJid2) {
        A2B a2b;
        boolean z = false;
        if (!C18020vd.A05(C18040vf.A02, this.A07, 5021)) {
            return false;
        }
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        AnonymousClass1EC A002 = C42941yz.A00(groupJid2);
        AnonymousClass1EC A003 = C42941yz.A00(groupJid);
        if (A002 != null) {
            AnonymousClass1MG r0 = this.A08;
            r0.A04();
            C61492pm r02 = (C61492pm) r0.A01.get(A002);
            if (!(r02 == null || (a2b = r02.A01) == null)) {
                z = C18070vi.A18(a2b.A02, A003);
            }
        }
        if (A003 != null) {
            return z | this.A02.A0U(A003);
        }
        return z;
    }

    public static final List A00(C34511kb r2, Collection collection) {
        return AnonymousClass1b2.A06(AnonymousClass1b2.A09(new AnonymousClass3IH(r2), AnonymousClass1b2.A09(new AnonymousClass3IG(r2), AnonymousClass1b2.A09(new AnonymousClass3IF(r2), AnonymousClass1b2.A09(new AnonymousClass3IE(r2), AnonymousClass1b2.A0B(C29431cG.A0V(collection)))))));
    }

    public final boolean A0W(AnonymousClass1EC r3, int i) {
        boolean A002 = AnonymousClass2TI.A00(i);
        AnonymousClass11S r0 = this.A0E;
        r0.A0I();
        if (r0.A0E == null || r3 == null || !A002 || !this.A06.A0J(r3)) {
            return false;
        }
        return true;
    }

    public C34511kb(AnonymousClass1KB r27, AnonymousClass11S r28, AnonymousClass1V3 r29, AnonymousClass1M9 r30, AnonymousClass11P r31, AnonymousClass1CJ r32, AnonymousClass1QW r33, C34451kV r34, AnonymousClass1NI r35, AnonymousClass1MZ r36, C34461kW r37, AnonymousClass1MY r38, C34471kX r39, C34491kZ r40, C18030ve r41, AnonymousClass1MG r42, C34441kU r43, AnonymousClass1Nb r44, AnonymousClass10I r45, AnonymousClass00H r46, AnonymousClass00H r47, AnonymousClass00H r48, AnonymousClass00H r49, AnonymousClass00H r50, AnonymousClass00H r51) {
        AnonymousClass11P r21 = r31;
        C18070vi.A0d(r21, 1);
        C18030ve r15 = r41;
        C18070vi.A0d(r15, 2);
        AnonymousClass1KB r25 = r27;
        C18070vi.A0d(r25, 3);
        AnonymousClass11S r24 = r28;
        C18070vi.A0d(r24, 4);
        AnonymousClass10I r8 = r45;
        C18070vi.A0d(r8, 5);
        AnonymousClass1CJ r20 = r32;
        C18070vi.A0d(r20, 6);
        AnonymousClass1MG r10 = r42;
        C18070vi.A0d(r10, 7);
        AnonymousClass1NI r17 = r35;
        C18070vi.A0d(r17, 8);
        AnonymousClass1M9 r22 = r30;
        C18070vi.A0d(r22, 9);
        AnonymousClass00H r7 = r46;
        C18070vi.A0d(r7, 11);
        AnonymousClass1Nb r9 = r44;
        C18070vi.A0d(r9, 12);
        AnonymousClass00H r6 = r47;
        C18070vi.A0d(r6, 13);
        AnonymousClass00H r5 = r48;
        C18070vi.A0d(r5, 14);
        AnonymousClass00H r4 = r49;
        C18070vi.A0d(r4, 15);
        AnonymousClass1QW r19 = r33;
        C18070vi.A0d(r19, 16);
        AnonymousClass00H r3 = r50;
        C18070vi.A0d(r3, 17);
        C34451kV r18 = r34;
        C18070vi.A0d(r18, 18);
        C34461kW r14 = r37;
        C18070vi.A0d(r14, 19);
        C34471kX r12 = r39;
        C18070vi.A0d(r12, 20);
        AnonymousClass1MZ r16 = r36;
        C18070vi.A0d(r16, 21);
        AnonymousClass00H r2 = r51;
        C18070vi.A0d(r2, 22);
        AnonymousClass1MY r13 = r38;
        C18070vi.A0d(r13, 23);
        C34491kZ r11 = r40;
        C18070vi.A0d(r11, 24);
        AnonymousClass1V3 r23 = r29;
        C18070vi.A0d(r23, 25);
        this.A0G = r21;
        this.A07 = r15;
        this.A00 = r25;
        this.A0E = r24;
        this.A0A = r8;
        this.A02 = r20;
        this.A08 = r10;
        this.A05 = r17;
        this.A01 = r22;
        this.A0L = r43;
        this.A0N = r7;
        this.A09 = r9;
        this.A0P = r6;
        this.A0M = r5;
        this.A0C = r4;
        this.A03 = r19;
        this.A0B = r3;
        this.A04 = r18;
        this.A0H = r14;
        this.A0J = r12;
        this.A06 = r16;
        this.A0O = r2;
        this.A0I = r13;
        this.A0K = r11;
        this.A0F = r23;
    }
}
