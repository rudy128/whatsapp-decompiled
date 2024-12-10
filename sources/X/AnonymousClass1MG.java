package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1MG  reason: invalid class name */
public class AnonymousClass1MG {
    public final AnonymousClass1MF A00;
    public final Map A01 = new ConcurrentHashMap();
    public final Map A02 = new ConcurrentHashMap();
    public final Object A03 = new Object();
    public volatile boolean A04;

    public static C19760yx A00(AnonymousClass1MG r4, GroupJid groupJid) {
        StringBuilder sb;
        String str;
        AnonymousClass1EC r1 = (AnonymousClass1EC) r4.A02.get(groupJid);
        if (r1 == null) {
            sb = new StringBuilder();
            str = "SubgroupCache/removeOldSubgroupFromCache/subgroup has no parent ";
        } else {
            C61492pm r2 = (C61492pm) r4.A01.get(r1);
            if (r2 == null) {
                sb = new StringBuilder();
                str = "SubgroupCache/removeOldSubgroupFromCache/Subgroup not in cache: ";
            } else {
                A2B A012 = A01(r4, groupJid, r1);
                if (A012 == null) {
                    sb = new StringBuilder();
                    str = "SubgroupCache/removeOldSubgroupFromCache/Subgroup no longer in cache: ";
                } else {
                    r2.A02.remove(A012);
                    return new C19760yx(r2, A012);
                }
            }
        }
        sb.append(str);
        sb.append(groupJid);
        Log.e(sb.toString());
        return null;
    }

    public void A04() {
        Cursor A0A;
        StringBuilder sb;
        int i;
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    AnonymousClass1MF r0 = this.A00;
                    HashMap hashMap = new HashMap();
                    C28781at A05 = r0.A00.get();
                    try {
                        A0A = ((C28801av) A05).A02.A0A("SELECT subgroup_raw_jid, subject, subject_ts, group_type, group_membership_approval_state, linking_timestamp, last_known_member_count, relationship.parent_raw_jid FROM subgroup_info INNER JOIN group_relationship relationship ON subgroup_raw_jid = relationship.subgroup_raw_id", "GET_ALL_SUBGROUPS", (String[]) null);
                        while (A0A.moveToNext()) {
                            String string = A0A.getString(A0A.getColumnIndexOrThrow("parent_raw_jid"));
                            Set set = (Set) hashMap.get(string);
                            if (set == null) {
                                set = new HashSet();
                                hashMap.put(string, set);
                            }
                            A2B A002 = AnonymousClass1MF.A00(A0A);
                            if (A002 != null) {
                                set.add(A002);
                            }
                        }
                        A0A.close();
                        A05.close();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            AnonymousClass1EC A022 = AnonymousClass1EC.A01.A02((String) entry.getKey());
                            if (A022 == null) {
                                if (entry.getValue() == null) {
                                    i = 0;
                                } else {
                                    i = ((Set) entry.getValue()).size();
                                }
                                sb = new StringBuilder();
                                sb.append("Cache initialized with an empty parent, ");
                                sb.append(i);
                                sb.append(" subgroups not loaded");
                            } else {
                                Map map = this.A01;
                                C61492pm r6 = (C61492pm) map.get(A022);
                                if (r6 == null) {
                                    r6 = new C61492pm();
                                    map.put(A022, r6);
                                }
                                Set<A2B> set2 = (Set) entry.getValue();
                                if (set2 == null) {
                                    sb = new StringBuilder();
                                    sb.append("Parent without any subgroups, jid=");
                                    sb.append(A022);
                                } else {
                                    for (A2B a2b : set2) {
                                        int i2 = a2b.A00;
                                        if (i2 == 3) {
                                            r6.A00 = a2b;
                                        } else if (i2 == 6) {
                                            r6.A01 = a2b;
                                        }
                                        this.A02.put(a2b.A02, A022);
                                    }
                                    r6.A02.addAll(set2);
                                }
                            }
                            Log.e(sb.toString());
                        }
                        this.A04 = true;
                    } catch (Throwable th) {
                        try {
                            A05.close();
                        } catch (Throwable th2) {
                            AnonymousClass0DT.A00(th, th2);
                        }
                        throw th;
                    }
                }
            }
            return;
        }
        return;
        throw th;
    }

    public AnonymousClass1MG(AnonymousClass1MF r2) {
        this.A00 = r2;
    }

    public static A2B A01(AnonymousClass1MG r1, GroupJid groupJid, AnonymousClass1EC r3) {
        HashSet A032 = r1.A03(r3);
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            if (!groupJid.equals(((A2B) it.next()).A02)) {
                it.remove();
            }
        }
        ArrayList arrayList = new ArrayList(A032);
        if (!arrayList.isEmpty()) {
            return (A2B) arrayList.get(0);
        }
        return null;
    }

    public A2B A02(AnonymousClass1EC r2) {
        A04();
        C61492pm r0 = (C61492pm) this.A01.get(r2);
        if (r0 == null) {
            return null;
        }
        return r0.A00;
    }

    public HashSet A03(AnonymousClass1EC r3) {
        A04();
        HashSet hashSet = new HashSet();
        C61492pm r0 = (C61492pm) this.A01.get(r3);
        if (r0 != null) {
            hashSet.addAll(r0.A02);
        }
        return hashSet;
    }

    public void A05(A2B a2b, AnonymousClass1EC r6, Integer num) {
        A04();
        C49652Ri A022 = this.A00.A02(r6, num, Collections.singletonList(a2b));
        if (A022 instanceof C46192Dn) {
            Map map = this.A01;
            C61492pm r3 = (C61492pm) map.get(r6);
            if (r3 == null) {
                r3 = new C61492pm();
                map.put(r6, r3);
            }
            List list = (List) ((C46192Dn) A022).A00;
            if (list.size() > 0) {
                r3.A02.add(list.get(0));
            }
            int i = a2b.A00;
            if (i == 3) {
                r3.A00 = a2b;
            } else if (i == 6) {
                r3.A01 = a2b;
            }
            this.A02.put(a2b.A02, r6);
        }
    }

    public void A06(GroupJid groupJid) {
        AnonymousClass1EC r1;
        C61492pm r0;
        A2B A012;
        A04();
        if (this.A00.A01(groupJid) == 1 && (r1 = (AnonymousClass1EC) this.A02.remove(groupJid)) != null && (r0 = (C61492pm) this.A01.get(r1)) != null && (A012 = A01(this, groupJid, r1)) != null) {
            r0.A02.remove(A012);
        }
    }

    public boolean A07(GroupJid groupJid, Integer num) {
        C41851xA BD0;
        C61492pm r1;
        A2B a2b;
        A04();
        try {
            C28791au A06 = this.A00.A00.A06();
            try {
                BD0 = A06.BD0();
                GroupJid groupJid2 = groupJid;
                String rawString = groupJid.getRawString();
                ContentValues contentValues = new ContentValues(1);
                Integer num2 = num;
                contentValues.put("group_membership_approval_state", num2);
                if (((C28801av) A06).A02.A02(contentValues, "subgroup_info", "subgroup_raw_jid = ?", "subgroup_info.updateSubgroupMembershipApprovalState", new String[]{rawString}) == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SubgroupStore/setGroupMembershipApprovalState/Subgroup entry doesn't exist for");
                    sb.append(groupJid);
                    Log.e(sb.toString());
                    BD0.close();
                    A06.close();
                    return false;
                }
                BD0.A00();
                BD0.close();
                A06.close();
                C19760yx A002 = A00(this, groupJid);
                if (!(A002 == null || (r1 = (C61492pm) A002.A00) == null || (a2b = (A2B) A002.A01) == null)) {
                    Set set = r1.A02;
                    String str = a2b.A06;
                    long j = a2b.A01;
                    int i = a2b.A00;
                    Long l = a2b.A05;
                    C18070vi.A0d(str, 2);
                    set.add(new A2B(groupJid2, num2, (Integer) null, l, str, i, j));
                    return true;
                }
                return false;
            } catch (Throwable th) {
                A06.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }
}
