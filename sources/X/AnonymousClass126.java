package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;
import com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.126  reason: invalid class name */
public class AnonymousClass126 implements C201511a {
    public static Handler A1Z;
    public Integer A00;
    public Integer A01;
    public long A02 = 0;
    public final AnonymousClass190 A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass1V3 A06;
    public final AnonymousClass11E A07;
    public final AnonymousClass1M9 A08;
    public final C25111Mx A09;
    public final C24921Me A0A;
    public final C24791Lr A0B;
    public final AnonymousClass12E A0C;
    public final C26191Re A0D;
    public final C25161Nd A0E;
    public final AnonymousClass11P A0F;
    public final C19830z4 A0G;
    public final AnonymousClass1P3 A0H;
    public final AnonymousClass1CJ A0I;
    public final AnonymousClass1NN A0J;
    public final AnonymousClass122 A0K;
    public final AnonymousClass1NI A0L;
    public final C27151Ux A0M;
    public final AnonymousClass1MS A0N;
    public final AnonymousClass1MZ A0O;
    public final AnonymousClass1NH A0P;
    public final AnonymousClass1R3 A0Q;
    public final C24751Ln A0R;
    public final AnonymousClass1MR A0S;
    public final AnonymousClass1PS A0T;
    public final C18030ve A0U;
    public final C26991Uh A0V;
    public final C27141Uw A0W;
    public final C25841Pv A0X;
    public final AnonymousClass1V0 A0Y;
    public final AnonymousClass12M A0Z;
    public final AnonymousClass1MG A0a;
    public final C26211Rg A0b;
    public final C26201Rf A0c;
    public final C27131Uv A0d;
    public final AnonymousClass1PT A0e;
    public final C27001Ui A0f;
    public final C27071Up A0g;
    public final AnonymousClass1PQ A0h;
    public final C24901Mc A0i;
    public final AnonymousClass1PU A0j;
    public final AnonymousClass10I A0k;
    public final AnonymousClass00H A0l;
    public final AnonymousClass00H A0m;
    public final AnonymousClass00H A0n;
    public final AnonymousClass00H A0o;
    public final AnonymousClass00H A0p;
    public final AnonymousClass00H A0q;
    public final AnonymousClass00H A0r;
    public final AnonymousClass00H A0s;
    public final AnonymousClass00H A0t;
    public final AnonymousClass00H A0u;
    public final AnonymousClass00H A0v;
    public final AnonymousClass00H A0w;
    public final AnonymousClass00H A0x;
    public final AnonymousClass00H A0y;
    public final AnonymousClass00H A0z;
    public final AnonymousClass00H A10;
    public final AnonymousClass00H A11;
    public final AnonymousClass00H A12;
    public final AnonymousClass00H A13;
    public final AnonymousClass00H A14;
    public final AnonymousClass00H A15;
    public final AnonymousClass00H A16;
    public final AnonymousClass00H A17;
    public final AnonymousClass00H A18;
    public final AnonymousClass00H A19;
    public final AnonymousClass00H A1A;
    public final AnonymousClass00H A1B;
    public final AnonymousClass00H A1C;
    public final AnonymousClass00H A1D;
    public final Map A1E = new ConcurrentHashMap();
    public final Set A1F = Collections.newSetFromMap(new ConcurrentHashMap());
    public final C25001Mm A1G;
    public final C27161Uy A1H;
    public final AnonymousClass118 A1I;
    public final AnonymousClass1V2 A1J;
    public final AnonymousClass1Cd A1K;
    public final C27081Uq A1L;
    public final AnonymousClass1V4 A1M;
    public final GetGroupInfoProtocolHelper A1N;
    public final AnonymousClass1N9 A1O;
    public final C25011Mn A1P;
    public final AnonymousClass1QO A1Q;
    public final AnonymousClass1PP A1R;
    public final C25081Mu A1S;
    public final AnonymousClass00H A1T;
    public final AnonymousClass00H A1U;
    public final AnonymousClass00H A1V;
    public final AnonymousClass00H A1W;
    public final AnonymousClass00H A1X;
    public final AnonymousClass00H A1Y;

    public static C63312sr A01(C63872tp r5, AnonymousClass126 r6, UserJid userJid, int i) {
        UserJid userJid2 = userJid;
        if (userJid == null) {
            return null;
        }
        C63872tp r1 = r5;
        C63312sr A0D2 = r5.A0D(userJid, false);
        int i2 = i;
        if (A0D2 == null) {
            return C63872tp.A00(r1, userJid2, r6.A0S.A0A(userJid), i2, AnonymousClass11P.A01(r6.A0F), false, true);
        }
        A0D2.A01 = i;
        return A0D2;
    }

    private synchronized void A05(int i) {
        Integer valueOf;
        int intValue;
        Integer num = this.A01;
        if (num != null) {
            valueOf = Integer.valueOf(i | num.intValue());
            this.A01 = valueOf;
        } else {
            valueOf = Integer.valueOf(i);
            this.A01 = valueOf;
        }
        Integer num2 = this.A00;
        if (num2 != null) {
            intValue = num2.intValue() | valueOf.intValue();
        } else {
            intValue = valueOf.intValue();
        }
        this.A0G.A1D(intValue);
    }

    public static void A0A(AnonymousClass126 r15, GroupJid groupJid) {
        Cursor A0A2;
        AnonymousClass126 r4 = r15;
        if (C40811vJ.A0W(r15.A0U)) {
            C27081Uq r0 = r15.A1L;
            AnonymousClass1LW r1 = r0.A01;
            GroupJid groupJid2 = groupJid;
            long A092 = r1.A09(groupJid2);
            AnonymousClass1Cd r5 = r0.A03;
            C28791au A052 = r5.A05();
            try {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("is_upcoming", false);
                if (((C28801av) A052).A02.A02(contentValues, "scheduled_calls", "key_chat_row_id = ? AND is_upcoming = 1", "ScheduledCallsStore/UPDATE_IS_UPCOMING_TO_FALSE_FOR_GROUP", new String[]{String.valueOf(A092)}) == 0) {
                    Log.i("ScheduledCallsStore/updateIsUpcomingToFalseForGroup no scheduled calls to update");
                }
                A052.close();
                ArrayList arrayList = new ArrayList();
                String[] strArr = {String.valueOf(r1.A09(groupJid2)), String.valueOf(System.currentTimeMillis())};
                C28781at A042 = r5.get();
                try {
                    A0A2 = ((C28801av) A042).A02.A0A(" SELECT creation_message_row_id FROM scheduled_calls WHERE key_chat_row_id = ?  AND scheduled_timestamp >= ? ", "ScheduledCallsStore/SELECT_ROW_IDS_OF_SCHEDULED_CALLS_AFTER_TIME_IN_CHAT", strArr);
                    int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("creation_message_row_id");
                    while (A0A2.moveToNext()) {
                        arrayList.add(Long.valueOf(A0A2.getLong(columnIndexOrThrow)));
                    }
                    A0A2.close();
                    A042.close();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C35311m1) r4.A1Y.get()).A00(((Number) it.next()).longValue());
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    A042.close();
                    throw th;
                }
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }

    public static void A0E(AnonymousClass126 r9, AnonymousClass1EC r10, AnonymousClass1EC r11, Integer num, String str, int i, long j) {
        String str2 = str;
        AnonymousClass00H r1 = r9.A0v;
        r1.get();
        int i2 = i;
        if (i == 2 || i == 0 || i == 3 || i == 6) {
            r1.get();
            AnonymousClass1EC r5 = r11;
            if (!AnonymousClass2TI.A00(i) || r10 == null) {
                ((C34511kb) r9.A0m.get()).A08.A06(r11);
                return;
            }
            C34511kb r3 = (C34511kb) r9.A0m.get();
            if (str == null) {
                str2 = "";
            }
            List<A2B> singletonList = Collections.singletonList(new A2B(r5, str2, i2, j));
            C18070vi.A0d(singletonList, 1);
            for (A2B A052 : singletonList) {
                r3.A08.A05(A052, r10, num);
            }
        }
    }

    public int A0K(GroupJid groupJid) {
        Boolean bool = false;
        AnonymousClass1E7 A0A2 = this.A08.A03.A0A(groupJid);
        if (A0A2 != null) {
            bool = Boolean.valueOf(A0A2.A12);
        }
        if (bool.booleanValue()) {
            return 4;
        }
        return 1;
    }

    public synchronized void A0N(int i) {
        Log.i("groupmgr/groupSyncFailedOrTimedOut");
        AnonymousClass00H r2 = this.A12;
        ((AnonymousClass127) r2.get()).A02 = false;
        r2.get();
        this.A00 = null;
        A05(i);
    }

    public synchronized void A0P(int i, boolean z) {
        if (z) {
            if (this.A02 != 0 && AnonymousClass11P.A01(this.A0F) - this.A02 < 120000) {
                StringBuilder sb = new StringBuilder();
                sb.append("groupmgr/sendGetGroups/skip backoff param=");
                sb.append(i);
                Log.i(sb.toString());
            }
        }
        if (i == 3) {
            Log.i("groupmgr/sendGetGroups/all");
            ((AnonymousClass127) this.A12.get()).A02 = true;
        }
        Integer num = this.A00;
        if (num == null) {
            A05(i);
            A04();
        } else if ((num.intValue() & i) == i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("groupmgr/sendGetGroups/skip inFlight param=");
            sb2.append(i);
            Log.i(sb2.toString());
        } else {
            A05(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cb, code lost:
        if ((r13 & 1) != 0) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0k(java.util.Set r12, int r13) {
        /*
            r11 = this;
            r4 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/onGroupSyncSucceeded/"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Nd r0 = r11.A0E
            java.util.ArrayList r0 = r0.A06()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x002c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x002c
            boolean r0 = r12.contains(r1)
            if (r0 != 0) goto L_0x002c
            r7.add(r1)
            goto L_0x002c
        L_0x0044:
            X.0ve r2 = r11.A0U
            r1 = 11347(0x2c53, float:1.59E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r10 = X.C18020vd.A05(r0, r2, r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            X.11S r0 = r11.A05
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r5 = r0.A0E
            X.C17960vV.A07(r5)
            X.1E2 r6 = r0.A09()
            java.util.Iterator r3 = r7.iterator()
        L_0x0065:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r2 = r3.next()
            X.1EC r2 = (X.AnonymousClass1EC) r2
            X.1MZ r1 = r11.A0O
            if (r10 == 0) goto L_0x0088
            r1.A0H(r7)
        L_0x0078:
            r8.add(r2)
            X.1Uv r0 = r11.A0d
            r0.A0X(r2)
            java.util.List r0 = java.util.Collections.singletonList(r5)
            A08(r11, r2, r0)
            goto L_0x0065
        L_0x0088:
            X.1MW r0 = r1.A08
            X.2tp r0 = r0.A0C(r2)
            r1.A0A(r0)
            goto L_0x0078
        L_0x0092:
            X.00H r0 = r11.A0l
            java.lang.Object r1 = r0.get()
            X.1gM r1 = (X.C31931gM) r1
            r9 = 4
            X.7QF r3 = new X.7QF
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0 = 47
            r1.A01(r3, r0)
            r3 = 3
            if (r13 != r3) goto L_0x00c9
            X.00H r0 = r11.A12
            java.lang.Object r0 = r0.get()
            X.127 r0 = (X.AnonymousClass127) r0
            r2 = 1
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A00
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L_0x00c2
            X.1Mn r2 = r11.A1P
            java.lang.String r1 = "groups"
            r0 = 0
            r2.A02(r1, r0)
        L_0x00c2:
            r11.A0j(r12)
        L_0x00c5:
            monitor-enter(r4)
            if (r13 != r3) goto L_0x00d9
            goto L_0x00ce
        L_0x00c9:
            r0 = r13 & 1
            if (r0 == 0) goto L_0x00c5
            goto L_0x00c2
        L_0x00ce:
            X.00H r0 = r11.A12     // Catch:{ all -> 0x0112 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0112 }
            X.127 r1 = (X.AnonymousClass127) r1     // Catch:{ all -> 0x0112 }
            r0 = 0
            r1.A02 = r0     // Catch:{ all -> 0x0112 }
        L_0x00d9:
            X.0z4 r3 = r11.A0G     // Catch:{ all -> 0x0110 }
            java.lang.Integer r0 = r3.A0Z()     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x0102
            java.lang.Integer r2 = r11.A01     // Catch:{ all -> 0x0110 }
            if (r2 == 0) goto L_0x00f5
            int r0 = r0.intValue()     // Catch:{ all -> 0x0110 }
            r1 = r13 ^ -1
            r1 = r1 & r0
            int r0 = r2.intValue()     // Catch:{ all -> 0x0110 }
            r1 = r1 | r0
            r3.A1D(r1)     // Catch:{ all -> 0x0110 }
            goto L_0x0102
        L_0x00f5:
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "get_groups_params"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x0110 }
            r0.apply()     // Catch:{ all -> 0x0110 }
        L_0x0102:
            java.lang.Integer r0 = r11.A01     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x010b
            r11.A04()     // Catch:{ all -> 0x0112 }
        L_0x0109:
            monitor-exit(r4)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x010b:
            r0 = 0
            r11.A00 = r0     // Catch:{ all -> 0x0112 }
            goto L_0x0109
        L_0x010f:
            return
        L_0x0110:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0112 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass126.A0k(java.util.Set, int):void");
    }

    public boolean A0n(GroupJid groupJid) {
        if (groupJid == null || !this.A0O.A0K(groupJid)) {
            return false;
        }
        return !this.A0I.A0R(groupJid);
    }

    public boolean A0o(GroupJid groupJid) {
        AnonymousClass1E7 A0G2;
        if (groupJid == null || !this.A0O.A0K(groupJid) || this.A0I.A0R(groupJid) || (A0G2 = this.A08.A0G(groupJid)) == null) {
            return false;
        }
        return ((C58322kV) this.A1A.get()).A00(A0G2);
    }

    public static A2B A02(AnonymousClass126 r4, AnonymousClass1EC r5) {
        AnonymousClass1EC A052 = ((C34511kb) r4.A0m.get()).A05(r5);
        if (A052 != null) {
            Iterator it = new ArrayList(r4.A0a.A03(A052)).iterator();
            while (it.hasNext()) {
                A2B a2b = (A2B) it.next();
                if (a2b.A02.equals(r5)) {
                    return a2b;
                }
            }
        }
        return null;
    }

    public static UserJid A03(AnonymousClass206 r3) {
        AnonymousClass205 r2 = r3.A0v;
        AnonymousClass1BI r1 = r2.A00;
        if (C22971Dz.A0e(r1)) {
            if (r2.A02 && (r3 instanceof C436420i)) {
                C436420i r22 = (C436420i) r3;
                int i = r22.A00;
                if (i == 10) {
                    return ((AnonymousClass2MN) r22).A00;
                }
                if (i == 20 || i == 52 || i == 79 || i == 123 || i == 125 || i == 126) {
                    return (UserJid) ((C48392Mh) r22).A01.get(0);
                }
            }
            r1 = r3.A0H();
        }
        C22941Dw r0 = UserJid.Companion;
        return C22941Dw.A01(r1);
    }

    private synchronized void A04() {
        synchronized (this) {
            Integer num = this.A01;
            C17960vV.A07(num);
            if (num.intValue() == 3) {
                this.A02 = AnonymousClass11P.A01(this.A0F);
            }
            int intValue = this.A01.intValue();
            StringBuilder sb = new StringBuilder();
            sb.append("groupmgr/sendGetGroups/ ");
            sb.append(intValue);
            Log.i(sb.toString());
            this.A00 = Integer.valueOf(intValue);
            this.A12.get();
            C18030ve r12 = this.A0U;
            if (C18020vd.A05(C18040vf.A02, r12, 10118)) {
                C186759ei r7 = (C186759ei) this.A0s.get();
                AnonymousClass1PY r6 = r7.A03;
                A7K a7k = new A7K();
                a7k.A00.A02().A06(GraphQlCallInput.A02.A00(), "input");
                r6.A01(new AIj(a7k, QueryParticipatingGroupsResponseImpl.class, "QueryParticipatingGroups")).A04(new B1M(r7, intValue));
            } else {
                C20983Acb acb = new C20983Acb(this.A03, r12, this, (C199369zs) this.A0x.get(), (AnonymousClass1OZ) this.A14.get(), intValue);
                Log.i("GroupRequestProtocolHelper/sendGetGroups/get-groups");
                AnonymousClass1OZ r14 = acb.A04;
                String A0B2 = r14.A0B();
                C27354DcQ A012 = AnonymousClass1ZT.A01();
                int i = acb.A00;
                if ((i & 1) != 0) {
                    A012.add(new C29621ca("participants", (AnonymousClass1MD[]) null));
                }
                if ((i & 2) != 0) {
                    A012.add(new C29621ca("description", (AnonymousClass1MD[]) null));
                }
                C29621ca r62 = new C29621ca("participating", (AnonymousClass1MD[]) null, (C29621ca[]) AnonymousClass1ZT.A02(A012).toArray(new C29621ca[0]));
                r14.A0J(acb, new C29621ca("iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "w:g2"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1MD((Jid) C173428v3.A00, "to")}, new C29621ca[]{r62}), A0B2, 19, 0);
            }
            this.A01 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.23h, X.206] */
    private void A06(C63872tp r7, Collection collection, int i, boolean z) {
        AnonymousClass1E9 r1 = r7.A06;
        C36321nh r0 = GroupJid.Companion;
        GroupJid A002 = C36321nh.A00(r1);
        if (z) {
            int A062 = r7.A06();
            C18030ve r2 = this.A0U;
            C18040vf r12 = C18040vf.A02;
            if (A062 >= C18020vd.A00(r12, r2, 934) && A062 <= C18020vd.A00(r12, r2, 1946) && A002 != null) {
                ? r4 = new AnonymousClass206(this.A1R.A01(A002, true), 58, AnonymousClass11P.A01(this.A0F));
                C26191Re r3 = this.A0D;
                UserJid[] userJidArr = (UserJid[]) collection.toArray(new UserJid[0]);
                if (userJidArr.length == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SyncDevicesAndSendInvisibleMessageJob/empty recipients for ");
                    sb.append(r4.A0v);
                    Log.w(sb.toString());
                    return;
                } else if (r3.A02.A01(r4.A0v)) {
                    r3.A00.A01(new SyncDevicesAndSendInvisibleMessageJob(r4, userJidArr));
                    return;
                } else {
                    return;
                }
            }
        }
        this.A0D.A01((UserJid[]) collection.toArray(new UserJid[0]), i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: X.2Ma} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: X.2MY} */
    /* JADX WARNING: type inference failed for: r10v4, types: [X.980, X.2Mf, X.20i, X.2Mh] */
    /* JADX WARNING: type inference failed for: r10v8, types: [X.2Mh, X.2MW] */
    /* JADX WARNING: type inference failed for: r10v12, types: [X.2MZ, X.2Md] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.A2B r16, X.A2B r17, X.AnonymousClass126 r18, com.whatsapp.jid.UserJid r19, X.C62502rV r20, java.lang.Integer r21, java.lang.Integer r22, long r23, boolean r25, boolean r26) {
        /*
            r1 = r16
            int r7 = r1.A00
            r0 = r17
            if (r17 == 0) goto L_0x01f5
            com.whatsapp.jid.GroupJid r6 = r0.A02
            java.lang.String r5 = r0.A06
        L_0x000c:
            r0 = 1
            if (r7 != r0) goto L_0x0011
            java.lang.String r5 = r1.A06
        L_0x0011:
            java.lang.String r0 = "GroupChatManager/updateLinkGroupInfoIfNeeded()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9 = r18
            X.00H r0 = r9.A0v
            r0.get()
            r2 = 2
            r0 = 1
            r8 = r20
            if (r7 == r2) goto L_0x002b
            if (r7 == r0) goto L_0x002b
            r0 = 3
            if (r7 == r0) goto L_0x002b
            r0 = 6
            if (r7 != r0) goto L_0x01ee
        L_0x002b:
            com.whatsapp.jid.GroupJid r4 = r1.A02
            boolean r0 = r4 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x01ee
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r18 = X.C42941yz.A00(r6)
            if (r18 == 0) goto L_0x0057
            X.00H r0 = r9.A0m
            java.lang.Object r11 = r0.get()
            X.1kb r11 = (X.C34511kb) r11
            java.lang.String r0 = "CommunityChatManageronSubgroupLinked()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10I r0 = r11.A0A
            r15 = 48
            X.Aix r10 = new X.Aix
            r14 = r22
            r12 = r18
            r13 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            r0.CGF(r10)
        L_0x0057:
            r0 = 6
            r12 = r19
            if (r7 != r0) goto L_0x01ea
            X.0ve r2 = r9.A0U
            r1 = 5021(0x139d, float:7.036E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0118
            X.11S r0 = r9.A05
            boolean r0 = r0.A0O(r12)
        L_0x006e:
            if (r0 == 0) goto L_0x0118
            r17 = 3010(0xbc2, float:4.218E-42)
            r19 = r25
            if (r25 == 0) goto L_0x0078
            r17 = 3012(0xbc4, float:4.221E-42)
        L_0x0078:
            r1 = 1
            r11 = 0
            r13 = r21
            r2 = r23
            if (r7 != r1) goto L_0x0119
            X.1PQ r14 = r9.A0h
            X.1PP r0 = r14.A02
            X.205 r0 = r0.A01(r4, r1)
            X.2MZ r10 = new X.2MZ
            r10.<init>(r0, r2)
            r10.A1F(r4, r5)
        L_0x0090:
            boolean r0 = r10.A1G()
        L_0x0094:
            X.AnonymousClass1PQ.A01(r12, r10, r14, r0)
        L_0x0097:
            r1 = 1
        L_0x0098:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "groupmgr/Failed to create community messagecreator="
            r14.append(r0)
            r14.append(r12)
            java.lang.String r0 = "; timestampMs="
            r14.append(r0)
            r14.append(r2)
            java.lang.String r0 = "; oldGroupType="
            r14.append(r0)
            r14.append(r13)
            java.lang.String r0 = "; newGroupType="
            r14.append(r0)
            r14.append(r7)
            java.lang.String r0 = "; isJoinFromCommunity="
            r14.append(r0)
            r0 = r19
            r14.append(r0)
            java.lang.String r0 = "; originatingStanzaMetadata="
            r14.append(r0)
            r14.append(r8)
            java.lang.String r0 = "; subGroupJid="
            r14.append(r0)
            r14.append(r4)
            java.lang.String r0 = "; parentGroupJid="
            r14.append(r0)
            r14.append(r6)
            java.lang.String r0 = "; parentSubject="
            r14.append(r0)
            r14.append(r5)
            java.lang.String r0 = r14.toString()
            X.C17960vV.A0F(r1, r0)
            if (r10 != 0) goto L_0x0111
            X.1PQ r5 = r9.A0h
            X.1PP r1 = r5.A02
            r0 = 1
            X.205 r1 = r1.A01(r4, r0)
            r0 = 75
            X.2MW r10 = new X.2MW
            r10.<init>(r1, r0, r2)
            r0 = 0
            r10.A00 = r11
            r10.A03 = r8
            r10.A02 = r13
            r10.A00 = r7
            r10.A01 = r6
            if (r13 != 0) goto L_0x010e
            r0 = 1
        L_0x010e:
            X.AnonymousClass1PQ.A01(r12, r10, r5, r0)
        L_0x0111:
            X.1Uh r1 = r9.A0V
            r0 = r17
            r1.BcH(r10, r0)
        L_0x0118:
            return
        L_0x0119:
            r10 = 0
            if (r6 == 0) goto L_0x012d
            if (r21 == 0) goto L_0x011f
            r1 = 0
        L_0x011f:
            r0 = 2
            if (r7 == r0) goto L_0x014c
            r0 = 3
            if (r7 == r0) goto L_0x0139
            r0 = 6
            if (r7 == r0) goto L_0x014c
            java.lang.String r0 = "groupmgr/unlink action in link creation"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x012d:
            X.190 r14 = r9.A03
            java.lang.String r1 = "groupmgr/Failed to create community message"
            java.lang.String r0 = ""
            r14.A0G(r1, r0, r11)
            r1 = 0
            goto L_0x0098
        L_0x0139:
            X.1PQ r14 = r9.A0h
            X.1PP r1 = r14.A02
            r0 = 1
            X.205 r0 = r1.A01(r4, r0)
            X.2MY r10 = new X.2MY
            r10.<init>(r0, r2)
            r10.A1F(r6, r5)
            goto L_0x0090
        L_0x014c:
            if (r1 == 0) goto L_0x018d
            X.1PQ r14 = r9.A0h
            if (r25 == 0) goto L_0x0177
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            X.1PP r10 = r14.A02
            r0 = 1
            X.205 r15 = r10.A01(r4, r0)
            r0 = 126(0x7e, float:1.77E-43)
            X.980 r10 = new X.980
            r10.<init>(r15, r0, r2)
            r0 = 2
            r10.A00 = r0
            r0 = r18
            r10.A1F(r0, r5)
            r10.A00 = r7
            int r0 = r10.A00
            X.AnonymousClass1PQ.A00(r12, r10, r14, r1, r0)
            r0 = 1
            goto L_0x0094
        L_0x0177:
            X.1PP r0 = r14.A02
            r1 = 1
            X.205 r0 = r0.A01(r4, r1)
            X.2Ma r10 = new X.2Ma
            r10.<init>(r0, r2)
            r10.A1F(r6, r5)
            r10.A00 = r7
            X.AnonymousClass1PQ.A01(r12, r10, r14, r1)
            goto L_0x0097
        L_0x018d:
            X.1PQ r0 = r9.A0h
            r26 = r0
            r16 = r10
            X.1M9 r14 = r9.A08
            X.1MA r0 = r14.A03
            X.1E7 r0 = r0.A0A(r4)
            if (r0 == 0) goto L_0x01a3
            boolean r0 = r0.A12
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r0)
        L_0x01a3:
            r1 = 0
            X.1E7 r0 = r14.A0G(r4)
            if (r0 == 0) goto L_0x01c0
            boolean r0 = r0.A0n
            if (r0 == 0) goto L_0x01c0
            X.0ve r0 = r9.A0U
            r20 = r0
            X.0vf r14 = X.C18040vf.A02
            r0 = 8530(0x2152, float:1.1953E-41)
            r15 = r14
            r14 = r20
            boolean r0 = X.C18020vd.A05(r15, r14, r0)
            if (r0 == 0) goto L_0x01c0
            r1 = 1
        L_0x01c0:
            r0 = r26
            X.1PP r0 = r0.A02
            r14 = 1
            X.205 r21 = r0.A01(r4, r14)
            r23 = 128(0x80, float:1.794E-43)
            X.982 r0 = new X.982
            r24 = r2
            r22 = r10
            r20 = r0
            r20.<init>((X.AnonymousClass205) r21, (X.C62502rV) r22, (int) r23, (long) r24)
            r0.A03 = r8
            r14 = r18
            r0.A1F(r14, r5)
            r14 = r16
            r0.A1G(r4, r14, r10, r1)
            r1 = r26
            X.AnonymousClass1PQ.A01(r12, r0, r1, r11)
            r10 = r0
            goto L_0x0097
        L_0x01ea:
            r0 = r26 ^ 1
            goto L_0x006e
        L_0x01ee:
            if (r20 == 0) goto L_0x0118
            r0 = 0
            X.C62502rV.A00(r0, r8, r0)
            return
        L_0x01f5:
            r5 = 0
            r6 = r5
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass126.A07(X.A2B, X.A2B, X.126, com.whatsapp.jid.UserJid, X.2rV, java.lang.Integer, java.lang.Integer, long, boolean, boolean):void");
    }

    public static void A08(AnonymousClass126 r3, AnonymousClass1BI r4, List list) {
        if (r3.A1Q.A04(0) && C22971Dz.A0e(r4)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r3.A0K.A0N(r4, (UserJid) it.next());
            }
        }
    }

    public static void A0B(AnonymousClass126 r3, AnonymousClass1EC r4) {
        r3.A08.A0b(r4, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("groupmgr/onGroupDelete/updated group state to deactivated/jid = ");
        sb.append(r4);
        Log.i(sb.toString());
        ((C31931gM) r3.A0l.get()).A01(new C146797Qq(r3, r4, 40), 47);
    }

    public static void A0C(AnonymousClass126 r6, AnonymousClass1EC r7) {
        C63872tp r4;
        C199410f A082;
        boolean A052 = C18020vd.A05(C18040vf.A02, r6.A0U, 11347);
        if (!A052) {
            r4 = r6.A0O.A08.A0C(r7);
        } else {
            r4 = null;
        }
        ArrayList arrayList = new ArrayList();
        AnonymousClass11S r3 = r6.A05;
        r3.A0I();
        PhoneUserJid phoneUserJid = r3.A0E;
        C17960vV.A07(phoneUserJid);
        arrayList.add(phoneUserJid);
        AnonymousClass1E2 A092 = r3.A09();
        if (A092 != null) {
            arrayList.add(A092);
        }
        AnonymousClass1MZ r1 = r6.A0O;
        r1.A0D(r7, arrayList);
        if (A052) {
            r4 = r1.A08.A04.A0A(r7);
        }
        if (r4 != null) {
            r1.A0C(r4, arrayList);
            if (r4.A00 == 1) {
                A082 = r4.A0A();
            } else {
                A082 = r4.A08();
            }
            AnonymousClass1IZ it = A082.iterator();
            while (it.hasNext()) {
                ((C63312sr) it.next()).A01 = 0;
            }
        }
        r6.A0d.A0X(r7);
        r3.A0I();
        A08(r6, r7, Collections.singletonList(r3.A0E));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(X.AnonymousClass126 r7, X.AnonymousClass1EC r8, int r9) {
        /*
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/updateGroupMemberCount/updating group size metadata for group: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " to:"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Uy r1 = r7.A1H
            java.lang.Integer r0 = r1.A00(r8)
            if (r0 == 0) goto L_0x002a
            int r0 = r0.intValue()
            if (r0 == r9) goto L_0x0091
        L_0x002a:
            r0 = 1
            if (r9 < r0) goto L_0x0079
            X.1Lt r0 = r1.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0081 }
            X.1au r4 = r0.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0081 }
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x0072 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x006b }
            r6.<init>()     // Catch:{ all -> 0x006b }
            java.lang.String r2 = "jid_row_id"
            X.1DL r0 = r1.A00     // Catch:{ all -> 0x006b }
            long r0 = r0.A09(r8)     // Catch:{ all -> 0x006b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x006b }
            r6.put(r2, r0)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = "member_count"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x006b }
            r6.put(r1, r0)     // Catch:{ all -> 0x006b }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x006b }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x006b }
            java.lang.String r2 = "group_membership_count"
            java.lang.String r1 = "UPDATE_GROUP_MEMBER_COUNT"
            r0 = 5
            r3.A09(r2, r1, r6, r0)     // Catch:{ all -> 0x006b }
            r5.A00()     // Catch:{ all -> 0x006b }
            r5.close()     // Catch:{ all -> 0x0072 }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0081 }
            goto L_0x0085
        L_0x006b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0081 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0081 }
        L_0x0079:
            java.lang.String r1 = "Number of members can't be less than 1."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0081:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0085:
            android.os.Handler r2 = A1Z
            r1 = 46
            X.7Qq r0 = new X.7Qq
            r0.<init>(r7, r8, r1)
            r2.post(r0)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass126.A0D(X.126, X.1EC, int):void");
    }

    public static void A0F(AnonymousClass126 r3, AnonymousClass1EC r4, AnonymousClass1EC r5, String str, boolean z) {
        String A0I2;
        if (!z) {
            return;
        }
        if (r5 == null) {
            AnonymousClass190 r32 = r3.A03;
            StringBuilder sb = new StringBuilder();
            sb.append(r4);
            sb.append(" has a null parent group");
            r32.A0G("comm-failures/parentGroupJid is null", sb.toString(), false);
            return;
        }
        AnonymousClass1M9 r2 = r3.A08;
        AnonymousClass1E7 A0G2 = r2.A0G(r5);
        if (A0G2 != null && (A0I2 = r3.A0A.A0I(A0G2)) != null && A0I2.equals(str)) {
            AnonymousClass1E7 A0H2 = r2.A0H(r5);
            A0H2.A0R = str;
            r2.A04.A0R(A0H2);
            r2.A03.A0B(A0H2);
            r3.A04.A0J(new C146797Qq(r3, r5, 48));
        }
    }

    public static boolean A0G(AnonymousClass1E7 r22, AnonymousClass126 r23, UserJid userJid, C42661yX r25, String str, String str2, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        C42661yX r0;
        boolean A052 = C18020vd.A05(C18040vf.A02, ((C58322kV) r23.A1A.get()).A00, 3695);
        AnonymousClass1E7 r10 = r22;
        String str3 = str;
        boolean z12 = z;
        boolean z13 = z2;
        boolean z14 = z3;
        boolean z15 = z4;
        boolean z16 = z5;
        boolean z17 = z6;
        boolean z18 = z7;
        boolean z19 = z8;
        boolean z20 = z9;
        boolean z21 = z10;
        boolean z22 = z11;
        C42661yX r14 = r25;
        String str4 = str2;
        int i3 = i;
        int i4 = i2;
        if (TextUtils.equals(r10.A0K(), str3) && TextUtils.equals(r10.A0X, Long.toString(j))) {
            String str5 = r10.A0M.A03;
            String str6 = r14.A03;
            if (TextUtils.equals(str5, str6) && ((r0 = r10.A0M) != null ? !(!TextUtils.equals(r0.A04, r14.A04)) : r14.A04 == null && r14.A00 == 0 && r14.A02 == null && str6 == null) && r10.A0j == z12 && r10.A13 == z13 && r10.A0f == z14 && r10.A11 == z15 && C42171xk.A00(r10.A0K, userJid) && r10.A0t == z16 && r10.A0k == z17 && r10.A12 == z18 && ((!A052 || r10.A0r == z19) && TextUtils.equals(r10.A0O, str4) && r10.A06 == i3 && r10.A0e == z20 && r10.A0i == z21 && r10.A03 == i4 && r10.A0n == z22)) {
                return false;
            }
        }
        r10.A0R = str3;
        r10.A0X = Long.toString(j);
        r10.A09(r14);
        r10.A0j = z12;
        r10.A13 = z13;
        r10.A0f = z14;
        r10.A11 = z15;
        r10.A0K = userJid;
        r10.A0t = z16;
        r10.A0k = z17;
        r10.A0O = str4;
        r10.A12 = z18;
        r10.A06 = i3;
        if (A052) {
            r10.A0r = z19;
        }
        r10.A0e = z20;
        r10.A0i = z21;
        r10.A03 = i4;
        r10.A0n = z22;
        return true;
    }

    public static boolean A0H(AnonymousClass126 r3, AnonymousClass1EC r4, Map map) {
        if (!((C59742mo) r3.A0y.get()).A02.A0R(r4)) {
            r3.A1W.get();
            Collection values = map.values();
            C18070vi.A0d(values, 0);
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (C22971Dz.A0T(((C60052nJ) it.next()).A02)) {
                    if (!C18020vd.A05(C18040vf.A02, r3.A0U, 2962) || r3.A0O.A0I(r4)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int A0I(AnonymousClass1E7 r3) {
        int A062 = this.A0I.A06((GroupJid) r3.A06(AnonymousClass1EC.class));
        if (!r3.A0F()) {
            return 0;
        }
        if (A062 == 1 || A062 == 3 || A062 == 6) {
            return r3.A05;
        }
        return 0;
    }

    public int A0J(AnonymousClass1BI r3) {
        Integer A002;
        if (!(r3 instanceof GroupJid) || (A002 = this.A1H.A00((GroupJid) r3)) == null) {
            return 0;
        }
        return A002.intValue();
    }

    public ArrayList A0L() {
        AnonymousClass1EC A052;
        ArrayList A0M2 = this.A08.A04.A0M();
        ArrayList arrayList = new ArrayList();
        Iterator it = A0M2.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 r5 = (AnonymousClass1E7) it.next();
            AnonymousClass1BI r1 = r5.A0J;
            Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
            AnonymousClass1EC A002 = C42941yz.A00(r1);
            if (A002 != null && this.A0O.A0K(A002)) {
                AnonymousClass1CJ r12 = this.A0I;
                if (!r12.A0S(A002)) {
                    int A062 = r12.A06(A002);
                    if (A062 == 2) {
                        A052 = ((C34511kb) this.A0m.get()).A05(A002);
                    } else if (A062 == 0) {
                        A052 = null;
                    }
                    if (r5.A0I(this.A03, new C53792d6(A052, A062))) {
                        arrayList.add(r5);
                    } else {
                        this.A0Z.A0H(A002, "subgroup_conflict_recovery", 3);
                    }
                }
            }
        }
        return arrayList;
    }

    public void A0O(int i, Object obj) {
        A1Z.obtainMessage(i, obj).sendToTarget();
    }

    public void A0S(A2S a2s) {
        PhoneUserJid phoneUserJid;
        PhoneUserJid phoneUserJid2;
        HashMap hashMap = new HashMap();
        UserJid userJid = a2s.A0C;
        if (C22971Dz.A0T(userJid) && (phoneUserJid2 = a2s.A0A) != null) {
            hashMap.put(userJid, phoneUserJid2);
        }
        UserJid userJid2 = a2s.A0D;
        if (C22971Dz.A0T(userJid2) && (phoneUserJid = a2s.A0B) != null) {
            hashMap.put(userJid2, phoneUserJid);
        }
        if (!hashMap.isEmpty()) {
            A0i(hashMap);
        }
    }

    public void A0T(C59962nA r55) {
        C59962nA r0 = r55;
        AnonymousClass1EC r14 = r0.A0A;
        UserJid userJid = r0.A0C;
        long j = r0.A07;
        String str = r0.A0G;
        long j2 = r0.A08;
        long j3 = r0.A06;
        Integer valueOf = Integer.valueOf(r0.A05);
        C42661yX r51 = r0.A0D;
        boolean z = r0.A0M;
        boolean z2 = r0.A0U;
        boolean z3 = r0.A0L;
        boolean z4 = r0.A0T;
        boolean z5 = r0.A0S;
        C29741cn r22 = r0.A0E;
        int i = r0.A02;
        C63262sm r18 = r0.A09;
        int i2 = r0.A03;
        AnonymousClass1EC r19 = r0.A0B;
        Map map = r0.A0I;
        boolean z6 = r0.A0P;
        boolean z7 = r0.A0Q;
        int i3 = r0.A00;
        String str2 = r0.A0F;
        int i4 = r0.A04;
        boolean z8 = r0.A0J;
        boolean z9 = r0.A0R;
        boolean z10 = r0.A0K;
        boolean z11 = r0.A0O;
        int i5 = r0.A01;
        boolean z12 = r0.A0N;
        Map map2 = r0.A0H;
        A0R(r18, r14, r19, userJid, r51, r22, valueOf, str, str2, map, map2, i, i2, i3, i4, i5, j, j2, j3, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12);
        ((C54562eL) this.A1V.get()).A00.A01(r14);
    }

    public void A0U(AnonymousClass1E9 r8, Iterable iterable, boolean z, boolean z2) {
        UserJid userJid;
        C63872tp A0C2 = this.A0O.A08.A0C(r8);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            UserJid userJid2 = (UserJid) it.next();
            arrayList.add(new C63312sr(userJid2, (Set) C63872tp.A02(this.A0S.A0A(userJid2)), 0, z));
        }
        if (C22971Dz.A0O(r8)) {
            AnonymousClass11S r0 = this.A05;
            if (z2) {
                userJid = r0.A0A();
            } else {
                r0.A0I();
                userJid = r0.A0E;
                C17960vV.A07(userJid);
            }
            if (z2) {
                A0C2.A00 = 2;
            }
            A0C2.A0P(userJid, this.A0S.A0A(userJid), 2, z);
        }
        C63872tp.A04(this.A03, A0C2, arrayList);
    }

    public void A0V(AnonymousClass1E9 r18, List list) {
        C48392Mh A052;
        List<UserJid> list2 = list;
        C17960vV.A0A("", list2);
        AnonymousClass1MZ r7 = this.A0O;
        AnonymousClass1E9 r9 = r18;
        C63872tp A0C2 = r7.A08.A0C(r9);
        ArrayList arrayList = new ArrayList(list2.size());
        for (UserJid userJid : list2) {
            arrayList.add(new C63312sr(userJid, (Set) C63872tp.A02(this.A0S.A0A(userJid)), 0, false));
        }
        C63872tp.A04(this.A03, A0C2, arrayList);
        r7.A0B(A0C2);
        this.A0A.A0g(r9);
        int size = list2.size();
        C26991Uh r0 = this.A0V;
        if (size == 1) {
            AnonymousClass1E9 r11 = r9;
            A052 = this.A0h.A08(r11, (UserJid) list2.get(0), (C62502rV) null, 4, AnonymousClass11P.A01(this.A0F));
        } else {
            A052 = this.A0h.A05(A0C2, r9, (UserJid) null, (C62502rV) null, list2, 12, AnonymousClass11P.A01(this.A0F));
        }
        r0.BcH(A052, 2);
        this.A04.A0J(new AnonymousClass3C4(this, r9, A0C2, 45));
    }

    public void A0W(AnonymousClass1E9 r16, List list) {
        C48392Mh A052;
        List list2 = list;
        C17960vV.A0A("", list2);
        AnonymousClass1MZ r2 = this.A0O;
        AnonymousClass1E9 r8 = r16;
        C63872tp A0C2 = r2.A08.A0C(r8);
        boolean A0Y2 = A0C2.A0Y(list2);
        r2.A0C(A0C2, list2);
        this.A0d.A0W(r8, list2);
        if (C22971Dz.A0N(r8)) {
            if (A0Y2) {
                if (this.A0H.A0Y()) {
                    this.A0k.CGF(new AnonymousClass3C4(this, r8, A0C2, 43));
                } else {
                    ((C25581Ot) this.A1B.get()).A00(new AnonymousClass3C4(this, r8, A0C2, 44));
                }
            }
            this.A0A.A0g(r8);
        } else {
            A08(this, r8, list2);
        }
        int size = list2.size();
        C26991Uh r1 = this.A0V;
        AnonymousClass1PQ r6 = this.A0h;
        long A012 = AnonymousClass11P.A01(this.A0F);
        if (size == 1) {
            A052 = r6.A08(r8, (UserJid) list2.get(0), (C62502rV) null, 7, A012);
        } else {
            A052 = r6.A05(A0C2, r8, (UserJid) null, (C62502rV) null, list2, 14, A012);
        }
        r1.BcH(A052, 2);
    }

    public void A0X(AnonymousClass1E9 r4, List list) {
        ((C31931gM) this.A0l.get()).A01(new AnonymousClass3C4(this, r4, list, 46), 46);
    }

    public void A0Y(AnonymousClass1EC r21, AnonymousClass1EC r22, UserJid userJid, UserJid userJid2, long j, boolean z) {
        C63312sr r3;
        AnonymousClass1MZ r7 = this.A0O;
        AnonymousClass1EC r10 = r21;
        C63872tp A0B2 = r7.A08.A0B(r10);
        ArrayList arrayList = new ArrayList();
        AnonymousClass1EC r13 = r22;
        UserJid userJid3 = userJid;
        UserJid userJid4 = userJid2;
        long j2 = j;
        if (userJid2 == null) {
            Log.i("groupmgr/onCommunityOwnershipChanged/server initiated cowner change");
            AnonymousClass1IZ it = A0B2.A08().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r3 = (C63312sr) it.next();
                if (r3.A01 == 2) {
                    break;
                }
            }
        } else {
            r3 = A0B2.A0D(userJid4, false);
            if (r3 != null) {
                if (r3.A01 != 2) {
                    Log.e("groupmgr/onCommunityOwnershipChanged/actor is not the current local owner. could be notification out of order.");
                }
            }
            Log.i("groupmgr/onCommunityOwnershipChanged/owner mismatch.");
            C63312sr A0D2 = A0B2.A0D(userJid3, false);
            if (A0D2 == null || A0D2.A01 != 2) {
                Log.e("groupmgr/onCommunityOwnershipChanged/newOwnerJid is also not the current local owner. recovering from server.");
                this.A0Z.A0H(r10, "participant_change_recovery", 2);
                if (z) {
                    this.A0V.BcH(this.A0h.A02(r13, 173, j2), 2);
                    return;
                }
                return;
            }
            Log.i("groupmgr/onCommunityOwnershipChanged/newOwnerJid is already the current local owner. dropping notification.");
            return;
        }
        r3.A01 = 1;
        arrayList.add(r3);
        arrayList.add(A01(A0B2, this, userJid3, 2));
        r7.A0E(r10, arrayList);
        if (z) {
            this.A0V.BcH(this.A0h.A05((C63872tp) null, r13, userJid4, (C62502rV) null, Collections.singletonList(userJid3), 173, j2), 2);
        }
    }

    public void A0Z(AnonymousClass1EC r10, UserJid userJid) {
        StringBuilder sb = new StringBuilder();
        sb.append("groupmgr/addGroupParticipantOnCurrentThread/adding participant: ");
        sb.append(userJid);
        sb.append(" to group:");
        sb.append(r10);
        Log.i(sb.toString());
        this.A0O.A08.A0C(r10).A0P(userJid, this.A0S.A0A(userJid), 0, false);
        this.A0A.A0g(r10);
        AnonymousClass1PQ r2 = this.A0h;
        C48392Mh A082 = r2.A08(r10, userJid, (C62502rV) null, 4, AnonymousClass11P.A01(this.A0F));
        this.A0K.BBY(A082);
        A1Z.post(new C146797Qq(this, A082, 49));
    }

    public void A0b(AnonymousClass1EC r13, UserJid userJid, long j, boolean z) {
        String str;
        AnonymousClass1M9 r3 = this.A08;
        AnonymousClass1E7 A0G2 = r3.A0G(r13);
        if (A0G2 == null) {
            str = "groupmgr/onAllowNonAdminSubGroupCreation/new group";
        } else {
            boolean z2 = z;
            if (A0G2.A0e == z2) {
                str = "groupmgr/onAllowNonAdminSubGroupCreation/did not change";
            } else {
                Log.i("groupmgr/onAllowNonAdminSubGroupCreation/changed");
                AnonymousClass1E7 A0H2 = r3.A0H(r13);
                if (A0H2.A0e != z2) {
                    A0H2.A0e = z2;
                    r3.A04.A0R(A0H2);
                    r3.A03.A0B(A0H2);
                }
                AnonymousClass1EC A002 = ((C58632l0) this.A0n.get()).A00(r13);
                if (A002 == null) {
                    Log.e("groupmgr/onAllowNonAdminSubGroupCreation/no cag");
                    return;
                } else if (!this.A0O.A0J(A002)) {
                    str = "groupmgr/onAllowNonAdminSubGroupCreation/not participant";
                } else {
                    C26991Uh r4 = this.A0V;
                    AnonymousClass1PQ r5 = this.A0h;
                    int i = 138;
                    if (z) {
                        i = 137;
                    }
                    C48392Mh A062 = r5.A06((C63872tp) null, A002, (C62502rV) null, i, j);
                    A062.A0d(userJid);
                    Log.i("groupactionhandler/handleCommunityAction/handle allow non admin sub group creation change");
                    r4.A01.BBM(A062);
                    AnonymousClass1BI r32 = A062.A0v.A00;
                    AnonymousClass1KB r2 = r4.A00;
                    r2.A0J(new C146797Qq(r4, r32, 30));
                    r2.A0J(new C146797Qq(r4, r13, 30));
                    return;
                }
            }
        }
        Log.i(str);
    }

    public void A0c(AnonymousClass1EC r10, C29741cn r11, long j) {
        AnonymousClass1EC r4 = r10;
        C29691ci A0A2 = this.A0I.A0A(r10);
        if (A0A2 == null) {
            Log.e("groupmgr/onGrowthLockChanged/notification for nonexistent group");
            return;
        }
        C48392Mh A002 = this.A0c.A00(r4, A0A2.A0h, r11, j);
        if (A002 != null) {
            this.A0V.BcH(A002, 8);
        }
        AnonymousClass1NI r3 = this.A0L;
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/updategroupchatgrowthlockifexists/");
        sb.append(r10);
        Log.i(sb.toString());
        ((C31931gM) r3.A03.get()).A01(new AnonymousClass3C4(r3, r10, r11, 20), 58);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0197, code lost:
        r1.append(r0);
        r1.append(r2);
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02b3, code lost:
        r1 = new java.lang.StringBuilder();
        r0 = "groupmgr/migrateGroup/missing counterpartJid for participantJid:";
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x026b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0d(X.AnonymousClass1EC r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.String r29, java.lang.String r30, int r31) {
        /*
            r25 = this;
            r4 = r25
            X.00H r0 = r4.A0y
            r24 = r0
            java.lang.Object r0 = r24.get()
            X.2mo r0 = (X.C59742mo) r0
            r7 = r26
            java.lang.String r13 = r0.A01(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/migrateGroup/"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "/local addressingMode:"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " new addressingMode:"
            r1.append(r0)
            r6 = r29
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r13.equals(r6)
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "groupmgr/migrateGroup/group is already migrated"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0043:
            return
        L_0x0044:
            X.00H r0 = r4.A0m
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            boolean r0 = r0.A0R(r7)
            r5 = r31
            if (r0 == 0) goto L_0x0147
            X.0ve r2 = r4.A0U
            r1 = 12481(0x30c1, float:1.749E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0043
            X.1MZ r1 = r4.A0O
            X.1MW r0 = r1.A08
            X.2tp r3 = r0.A0B(r7)
            java.lang.String r0 = "lid"
            boolean r0 = r0.equals(r6)
            r12 = 0
            if (r0 == 0) goto L_0x0097
            r0 = 2
            r3.A00 = r0
            X.10f r0 = r3.A0C()
            r3.A0R(r0)
        L_0x007b:
            X.1M9 r2 = r4.A08
            X.1E7 r1 = r2.A0H(r7)
            r1.A0O = r6
            X.1M2 r0 = r2.A04
            r0.A0R(r1)
            X.1MA r0 = r2.A03
            r0.A0B(r1)
            if (r12 == 0) goto L_0x0043
            X.12M r1 = r4.A0Z
            java.lang.String r0 = "lid_migration"
            r1.A0H(r7, r0, r5)
            return
        L_0x0097:
            r0 = 1
            r3.A00 = r0
            boolean r11 = r1.A0K(r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map r0 = r3.A08
            java.util.Set r0 = r0.keySet()
            X.10f r1 = X.C199410f.copyOf((java.util.Collection) r0)
            X.1Ln r0 = r4.A0R
            java.util.LinkedHashMap r9 = r0.A0G(r1)
            X.1IZ r10 = r1.iterator()
        L_0x00b7:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0137
            java.lang.Object r8 = r10.next()
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            boolean r0 = X.C22971Dz.A0T(r8)
            if (r0 != 0) goto L_0x00df
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/migrateCag/not a lid jid in GroupParticipants.getLidUserJids():"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00dd:
            r12 = 1
            goto L_0x00b7
        L_0x00df:
            java.lang.Object r14 = r9.get(r8)
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14
            if (r14 != 0) goto L_0x00fc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/migrateCag/missing counterpartJid for participantJid:"
        L_0x00ee:
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00dd
        L_0x00fc:
            r0 = 0
            X.2sr r1 = r3.A0D(r8, r0)
            if (r1 != 0) goto L_0x010b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/migrateCag/missing participant for participantJid:"
            goto L_0x00ee
        L_0x010b:
            if (r11 != 0) goto L_0x011a
            int r0 = r1.A01
            if (r0 != 0) goto L_0x011a
            X.11S r0 = r4.A05
            boolean r0 = r0.A0O(r8)
            if (r0 != 0) goto L_0x011a
            goto L_0x00b7
        L_0x011a:
            X.1MR r0 = r4.A0S
            java.util.HashSet r0 = r0.A0A(r14)
            java.util.HashSet r15 = X.C63872tp.A02(r0)
            int r8 = r1.A01
            r19 = 0
            long r0 = r1.A02
            X.2sr r13 = new X.2sr
            r16 = r8
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r19)
            r2.add(r13)
            goto L_0x00b7
        L_0x0137:
            r3.A0Q(r2)
            X.00H r0 = r4.A18
            java.lang.Object r0 = r0.get()
            X.2lT r0 = (X.C58922lT) r0
            r0.A02(r3, r2)
            goto L_0x007b
        L_0x0147:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            X.1MZ r10 = r4.A0O
            X.1MW r0 = r10.A08
            X.2tp r9 = r0.A0C(r7)
            X.10f r8 = r9.A07()
            X.1Ln r0 = r4.A0R
            java.util.LinkedHashMap r0 = r0.A0G(r8)
            X.DbW r3 = X.C27300DbW.create((java.util.Map) r0)
            X.1IZ r16 = r8.iterator()
        L_0x016b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r2 = r16.next()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            boolean r0 = X.C22971Dz.A0X(r2)
            if (r0 == 0) goto L_0x02a7
            X.3MQ r0 = r3.inverse()
            java.lang.Object r1 = r0.get(r2)
        L_0x0185:
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x02b3
            r0 = 0
            X.2sr r0 = r9.A0D(r2, r0)
            if (r0 != 0) goto L_0x0282
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/migrateGroup/missing participant for participantJid:"
        L_0x0197:
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01a4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/migrateGroup/originalGroupParticipants.size(): "
            r1.append(r0)
            int r0 = r8.size()
            r1.append(r0)
            java.lang.String r0 = "/participantsToAdd.size(): "
            r1.append(r0)
            int r0 = r12.size()
            r1.append(r0)
            java.lang.String r0 = "/ removedJids.size():"
            r1.append(r0)
            int r0 = r11.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0275
            int r1 = r8.size()
            int r0 = r12.size()
            if (r1 != r0) goto L_0x0275
            int r1 = r8.size()
            int r0 = r11.size()
            if (r1 != r0) goto L_0x0275
            X.0ve r2 = r4.A0U
            r1 = 11553(0x2d21, float:1.6189E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0275
            java.lang.String r0 = "lid"
            boolean r1 = r0.equals(r6)
            r0 = 0
            if (r1 == 0) goto L_0x0204
            r0 = 2
        L_0x0204:
            r9.A00 = r0
            java.lang.String r0 = "groupmgr/migrateGroup/calling swapParticipants"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.190 r0 = r10.A00
            X.C63872tp.A04(r0, r9, r12)
            X.00H r0 = r10.A0J
            java.lang.Object r0 = r0.get()
            X.2lT r0 = (X.C58922lT) r0
            r0.A02(r9, r12)
            r9.A0R(r11)
            r10.A0B(r9)
            X.1M9 r2 = r4.A08
            X.1E7 r1 = r2.A0H(r7)
            r1.A0O = r6
            X.1M2 r0 = r2.A04
            r0.A0R(r1)
            X.1MA r0 = r2.A03
            r0.A0B(r1)
        L_0x0233:
            java.lang.Object r3 = r24.get()
            X.2mo r3 = (X.C59742mo) r3
            int r2 = r27.intValue()
            X.2Fw r1 = new X.2Fw
            r1.<init>()
            int r0 = X.C64002u3.A06(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            int r0 = X.C64002u3.A06(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A02 = r0
            r0 = 5
            if (r0 != r2) goto L_0x026b
            r0 = r28
            if (r28 == 0) goto L_0x0265
            r1.A00 = r0
        L_0x0265:
            X.18K r0 = r3.A04
            r0.CC7(r1)
            return
        L_0x026b:
            r0 = 3
            if (r0 != r2) goto L_0x0265
            r0 = r30
            if (r30 == 0) goto L_0x0265
            r1.A04 = r0
            goto L_0x0265
        L_0x0275:
            java.lang.String r0 = "groupmgr/migrateGroup/calling fallback operation calling sendGetGroupInfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12M r1 = r4.A0Z
            java.lang.String r0 = "lid_migration"
            r1.A0H(r7, r0, r5)
            goto L_0x0233
        L_0x0282:
            long r14 = r0.A02
            int r0 = r0.A01
            r20 = r0
            X.1MR r0 = r4.A0S
            java.util.HashSet r0 = r0.A0A(r1)
            java.util.HashSet r19 = X.C63872tp.A02(r0)
            r23 = 0
            X.2sr r0 = new X.2sr
            r21 = r14
            r17 = r0
            r18 = r1
            r17.<init>(r18, r19, r20, r21, r23)
            r12.add(r0)
            r11.add(r2)
            goto L_0x016b
        L_0x02a7:
            boolean r0 = X.C22971Dz.A0T(r2)
            if (r0 == 0) goto L_0x02b3
            java.lang.Object r1 = r3.get(r2)
            goto L_0x0185
        L_0x02b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/migrateGroup/missing counterpartJid for participantJid:"
            goto L_0x0197
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass126.A0d(X.1EC, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int):void");
    }

    public void A0e(UserJid userJid, C29621ca r6) {
        Jid A0F2;
        Jid A0F3;
        HashMap hashMap = new HashMap();
        if (C22971Dz.A0T(userJid) && (A0F3 = r6.A0F(PhoneUserJid.class, "creator_pn")) != null) {
            hashMap.put(userJid, A0F3);
        }
        Jid A0F4 = r6.A0F(UserJid.class, "s_o");
        if (C22971Dz.A0T(A0F4) && (A0F2 = r6.A0F(PhoneUserJid.class, "s_o_pn")) != null) {
            hashMap.put(A0F4, A0F2);
        }
        if (!hashMap.isEmpty()) {
            A0i(hashMap);
        }
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [X.2Mh, X.2MX] */
    public void A0f(UserJid userJid, C62502rV r13, int i, long j, boolean z) {
        String str;
        C48392Mh r0;
        StringBuilder sb = new StringBuilder();
        sb.append("groupmgr/onGroupRestrictModeToggled ");
        C62502rV r7 = r13;
        sb.append(r13);
        sb.append("/");
        boolean z2 = z;
        sb.append(z2);
        sb.append("/isServerTriggered");
        boolean z3 = false;
        if (i > 0) {
            z3 = true;
        }
        sb.append(z3);
        Log.i(sb.toString());
        AnonymousClass1BI r1 = r13.A02;
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        AnonymousClass1EC A002 = C42941yz.A00(r1);
        C17960vV.A07(A002);
        AnonymousClass1M9 r3 = this.A08;
        AnonymousClass1E7 A0G2 = r3.A0G(A002);
        if (A0G2 == null) {
            str = "groupmgr/onGroupRestrictModeToggled/new group";
            Log.i(str);
        } else if (A0G2.A13 != z2) {
            Log.i("groupmgr/onGroupRestrictModeToggled/changed");
            AnonymousClass1E7 A0H2 = r3.A0H(A002);
            if (A0H2.A13 != z2) {
                A0H2.A13 = z2;
                r3.A04.A0R(A0H2);
                r3.A03.A0B(A0H2);
            }
            long j2 = j;
            if (i > 0) {
                ? r02 = new C48392Mh(this.A0h.A02.A01(A002, true), 142, j2);
                r02.A00 = i;
                r0 = r02;
            } else {
                AnonymousClass1PQ r4 = this.A0h;
                int i2 = 30;
                if (z) {
                    i2 = 29;
                }
                C48392Mh A062 = r4.A06((C63872tp) null, A002, r7, i2, j2);
                A062.A0d(userJid);
                r0 = A062;
            }
            A0O(3008, r0);
        } else {
            str = "groupmgr/onGroupRestrictModeToggled/did not change";
            Log.i(str);
        }
        C62502rV.A00((C29621ca) null, r13, (List) null);
    }

    public void A0g(C62502rV r7, boolean z) {
        AnonymousClass1EC A052;
        StringBuilder sb = new StringBuilder();
        sb.append("groupmgr/onGroupSuspensionChanged ");
        sb.append(r7);
        sb.append("/");
        sb.append(z);
        Log.i(sb.toString());
        AnonymousClass1BI r1 = r7.A02;
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        AnonymousClass1EC A002 = C42941yz.A00(r1);
        C17960vV.A07(A002);
        AnonymousClass1M9 r4 = this.A08;
        if (r4.A0G(A002) != null) {
            Log.i("groupmgr/onGroupSuspensionChanged/updateGroupIsSuspended");
            r4.A0c(A002, z);
            AnonymousClass00H r3 = this.A0m;
            if (((C34511kb) r3.get()).A0R(A002)) {
                if (C18020vd.A05(C18040vf.A02, this.A0U, 10539) && (A052 = ((C34511kb) r3.get()).A05(A002)) != null) {
                    Log.i("groupmgr/onGroupSuspensionChanged/updateGroupIsSuspended for community too");
                    r4.A0c(A052, z);
                }
            }
        } else {
            Log.i("groupmgr/onGroupSuspensionChanged/new group");
        }
        C62502rV.A00((C29621ca) null, r7, (List) null);
    }

    public void A0h(List list, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("groupmgr/onLeaveGroup/");
        sb.append(Arrays.deepToString(list.toArray()));
        Log.i(sb.toString());
        AnonymousClass11S r6 = this.A05;
        r6.A0I();
        PhoneUserJid phoneUserJid = r6.A0E;
        C17960vV.A07(phoneUserJid);
        AnonymousClass1E2 A092 = r6.A09();
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AnonymousClass1EC r11 = (AnonymousClass1EC) it.next();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("groupmgr/onLeaveGroup/starting to remove from groupjid = ");
            sb2.append(r11);
            Log.i(sb2.toString());
            this.A0A.A0g(r11);
            this.A08.A0b(r11, 2);
            AnonymousClass1MZ r7 = this.A0O;
            C63872tp A0C2 = r7.A08.A0C(r11);
            if (A0C2.A0W(r6)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(phoneUserJid);
                if (A092 != null) {
                    arrayList.add(A092);
                }
                r7.A0C(A0C2, arrayList);
                AnonymousClass10I r2 = this.A0k;
                r2.CGF(new C146797Qq(this, r11, 42));
                r2.CGN(new AnonymousClass3C4(this, r11, arrayList, 47));
                A08(this, r11, Collections.singletonList(phoneUserJid));
                C48392Mh A082 = this.A0h.A08(r11, phoneUserJid, (C62502rV) null, 5, AnonymousClass11P.A01(this.A0F));
                if (!z || !this.A0I.A0P(r11)) {
                    A0O(3, A082);
                } else {
                    this.A0V.BcH(A082, 7);
                }
                z2 = true;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("groupmgr/onLeaveGroup/not a member of group = ");
                sb3.append(r11);
                Log.i(sb3.toString());
                if (r7.A0J(r11)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("groupmgr/onLeaveGroup/hasMe but not in group = ");
                    sb4.append(r11);
                    Log.e(sb4.toString());
                    r7.A0E.CGF(new AnonymousClass3Bx(r7, r11, 32));
                }
            }
            if (this.A0I.A06(r11) == 1) {
                ((C34511kb) this.A0m.get()).A0L(r11);
                StringBuilder sb5 = new StringBuilder();
                sb5.append("groupmgr/onLeaveGroup/deletedParentGroup/jid = ");
                sb5.append(r11);
                Log.i(sb5.toString());
            }
        }
        if (z2) {
            RegistrationIntentService.A02(this.A1I.A00, this.A1S);
        }
    }

    public void A0i(Map map) {
        ((C31661fv) this.A19.get()).A01(map);
    }

    public void A0j(Set set) {
        ((C66182xl) this.A10.get()).A01(set);
        ((C57782jd) this.A1X.get()).A00(set);
        ((C58672l4) this.A1T.get()).A01(set);
        C57912jq r3 = (C57912jq) this.A15.get();
        C18070vi.A0d(set, 0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            r3.A00((AnonymousClass1EC) it.next());
        }
        this.A04.A0J(new C146507Pj(this, set, 0));
    }

    public boolean A0l() {
        return ((AnonymousClass127) this.A12.get()).A02;
    }

    public boolean A0m() {
        if (!this.A05.A0N()) {
            return true;
        }
        JSONObject A022 = this.A1M.A00.A02();
        if (A022 != null && A022.getInt("sync_type") > 0) {
            return true;
        }
        this.A03.A0G("groupChatManager/dropping group update", (String) null, true);
        return false;
    }

    public static void A09(AnonymousClass126 r3, DeviceJid deviceJid, AnonymousClass1EC r5, C62502rV r6, boolean z) {
        if (r3.A0H.A08.A05(new C59982nC(((AnonymousClass1P1) r3.A1U.get()).A01(C63962tz.A02(deviceJid)), r5.getRawString()), true)) {
            r3.A0e.A0D(r5, 1);
        }
        if (z) {
            C62502rV.A00((C29621ca) null, r6, (List) null);
        }
    }

    public ArrayList A0M(Map map) {
        ArrayList arrayList = new ArrayList(map.keySet().size());
        for (AnonymousClass1BI A0E2 : map.keySet()) {
            AnonymousClass1E7 A0E3 = this.A08.A0E(A0E2);
            if (!(A0E3 == null || A0E3.A0H == null)) {
                arrayList.add(A0E3);
            }
        }
        Collections.sort(arrayList, new AnonymousClass40d(this.A05, this.A0A, this, 0));
        return arrayList;
    }

    public void A0a(AnonymousClass1EC r4, UserJid userJid) {
        A0W(r4, Collections.singletonList(userJid));
        this.A04.A0J(new C146797Qq(this, r4, 43));
    }

    public AnonymousClass126(AnonymousClass190 r13, AnonymousClass1KB r14, AnonymousClass11S r15, AnonymousClass18O r16, AnonymousClass1V3 r17, C25001Mm r18, AnonymousClass11E r19, AnonymousClass1M9 r20, C27161Uy r21, C25111Mx r22, C24921Me r23, C24791Lr r24, AnonymousClass12E r25, C26191Re r26, C25161Nd r27, AnonymousClass11P r28, AnonymousClass118 r29, C19830z4 r30, C18000vb r31, AnonymousClass1P3 r32, AnonymousClass1CJ r33, AnonymousClass1NN r34, AnonymousClass122 r35, AnonymousClass1NI r36, C27151Ux r37, AnonymousClass1V2 r38, AnonymousClass1MS r39, AnonymousClass1MZ r40, AnonymousClass1NH r41, AnonymousClass1R3 r42, AnonymousClass1Cd r43, C27081Uq r44, C24751Ln r45, AnonymousClass1MR r46, AnonymousClass1V4 r47, AnonymousClass1PS r48, C18030ve r49, C26991Uh r50, C27141Uw r51, C25841Pv r52, AnonymousClass1V0 r53, AnonymousClass12M r54, AnonymousClass1MG r55, C26211Rg r56, GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, C26201Rf r58, C27131Uv r59, AnonymousClass1N9 r60, C25011Mn r61, AnonymousClass1PT r62, AnonymousClass1QO r63, C27001Ui r64, C27071Up r65, AnonymousClass1PP r66, AnonymousClass1PQ r67, C24901Mc r68, AnonymousClass1PU r69, C25081Mu r70, AnonymousClass10I r71, AnonymousClass00H r72, AnonymousClass00H r73, AnonymousClass00H r74, AnonymousClass00H r75, AnonymousClass00H r76, AnonymousClass00H r77, AnonymousClass00H r78, AnonymousClass00H r79, AnonymousClass00H r80, AnonymousClass00H r81, AnonymousClass00H r82, AnonymousClass00H r83, AnonymousClass00H r84, AnonymousClass00H r85, AnonymousClass00H r86, AnonymousClass00H r87, AnonymousClass00H r88, AnonymousClass00H r89, AnonymousClass00H r90, AnonymousClass00H r91, AnonymousClass00H r92, AnonymousClass00H r93, AnonymousClass00H r94, AnonymousClass00H r95, AnonymousClass00H r96, AnonymousClass00H r97, AnonymousClass00H r98, AnonymousClass00H r99, AnonymousClass00H r100, AnonymousClass00H r101, AnonymousClass00H r102, AnonymousClass00H r103, AnonymousClass00H r104, AnonymousClass00H r105, AnonymousClass00H r106) {
        Boolean bool = C17960vV.A01;
        this.A0F = r28;
        C18030ve r9 = r49;
        this.A0U = r9;
        this.A04 = r14;
        this.A03 = r13;
        this.A05 = r15;
        AnonymousClass118 r5 = r29;
        this.A1I = r5;
        this.A0k = r71;
        this.A0I = r33;
        this.A1P = r61;
        this.A0i = r68;
        this.A1S = r70;
        this.A0R = r45;
        this.A1O = r60;
        this.A1G = r18;
        this.A0y = r72;
        this.A0P = r41;
        this.A14 = r73;
        this.A0a = r55;
        AnonymousClass1M9 r3 = r20;
        this.A08 = r3;
        this.A0L = r36;
        this.A0e = r62;
        C24921Me r4 = r23;
        this.A0A = r4;
        this.A0j = r69;
        this.A0X = r52;
        this.A0Q = r42;
        AnonymousClass122 r7 = r35;
        this.A0K = r7;
        this.A1V = r75;
        this.A16 = r76;
        this.A0Z = r54;
        this.A0D = r26;
        this.A0c = r58;
        this.A0H = r32;
        this.A0b = r56;
        this.A1D = r77;
        this.A0S = r46;
        this.A0n = r78;
        this.A0l = r79;
        this.A0B = r24;
        this.A0C = r25;
        this.A1R = r66;
        this.A0V = r50;
        this.A15 = r80;
        this.A1A = r81;
        this.A09 = r22;
        this.A0t = r82;
        this.A0w = r83;
        this.A1K = r43;
        this.A0f = r64;
        this.A0g = r65;
        this.A1L = r44;
        this.A0G = r30;
        this.A0m = r84;
        this.A0o = r85;
        this.A0E = r27;
        this.A17 = r86;
        this.A0h = r67;
        this.A0v = r87;
        this.A0J = r34;
        this.A0N = r39;
        this.A1Q = r63;
        this.A18 = r88;
        this.A0q = r89;
        this.A0d = r59;
        this.A0x = r90;
        C27141Uw r10 = r51;
        this.A0W = r10;
        this.A0u = r91;
        AnonymousClass1MZ r8 = r40;
        this.A0O = r8;
        this.A07 = r19;
        this.A0M = r37;
        this.A1H = r21;
        this.A1N = getGroupInfoProtocolHelper;
        this.A11 = r92;
        this.A0p = r93;
        this.A1U = r94;
        this.A1C = r95;
        this.A1W = r96;
        this.A19 = r98;
        AnonymousClass1V0 r11 = r53;
        this.A0Y = r11;
        this.A1J = r38;
        this.A1Y = r99;
        this.A0s = r97;
        this.A06 = r17;
        this.A0z = r100;
        this.A10 = r101;
        this.A1B = r74;
        this.A13 = r102;
        this.A1T = r103;
        this.A1X = r104;
        this.A12 = r105;
        A1Z = new AnonymousClass1V5(r14, r16, r3, r4, r5, r31, r7, r8, r9, r10, r11);
        this.A0r = r106;
        this.A1M = r47;
        this.A0T = r48;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03bb, code lost:
        if (r13 != false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0091, code lost:
        if (r9 <= 0) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C63872tp r25, X.AnonymousClass126 r26, X.C63262sm r27, java.lang.String r28, java.util.Map r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            r0 = r26
            X.1MZ r6 = r0.A0O
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r13 = r29
            int r1 = r13.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            X.DbW r3 = X.C27300DbW.create()
            java.util.Set r1 = r13.entrySet()
            java.util.Iterator r17 = r1.iterator()
        L_0x0025:
            boolean r1 = r17.hasNext()
            r15 = r25
            if (r1 == 0) goto L_0x0162
            java.lang.Object r1 = r17.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r7 = r1.getKey()
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            java.lang.Object r1 = r1.getValue()
            X.2nJ r1 = (X.C60052nJ) r1
            X.C17960vV.A07(r1)
            java.lang.String r8 = r1.A04
            X.00H r2 = r6.A0G
            r2.get()
            java.lang.String r2 = "admin"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0155
            r2 = 1
        L_0x0052:
            r8 = 0
            X.2sr r11 = r15.A0D(r7, r8)
            if (r11 != 0) goto L_0x012e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r8 = "GroupParticipantsManager/sync-add-participant: "
            r9.append(r8)
            r9.append(r7)
            java.lang.String r8 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r8)
            r5.add(r7)
        L_0x0070:
            X.00H r14 = r6.A0F
            r14.get()
            com.whatsapp.jid.UserJid r10 = r1.A02
            boolean r8 = X.C22971Dz.A0T(r10)
            if (r8 == 0) goto L_0x011a
            com.whatsapp.jid.PhoneUserJid r9 = r1.A01
            if (r9 == 0) goto L_0x0089
            java.lang.String r8 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.C18070vi.A0z(r10, r8)
            r3.put(r9, r10)
        L_0x0089:
            if (r11 == 0) goto L_0x0093
            long r9 = r11.A02
            r15 = 0
            int r8 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r8 > 0) goto L_0x0099
        L_0x0093:
            X.11P r8 = r6.A04
            long r9 = X.AnonymousClass11P.A01(r8)
        L_0x0099:
            X.1MR r8 = r6.A0C
            java.util.HashSet r8 = r8.A0A(r7)
            java.util.HashSet r20 = X.C63872tp.A02(r8)
            r24 = 0
            X.2sr r8 = new X.2sr
            r21 = r2
            r22 = r9
            r18 = r8
            r19 = r7
            r18.<init>(r19, r20, r21, r22, r24)
            r4.add(r8)
            java.lang.Object r8 = r14.get()
            X.2eq r8 = (X.C54872eq) r8
            r11 = 2
            X.C18070vi.A0d(r7, r11)
            boolean r11 = r1.A00()
            if (r11 == 0) goto L_0x00e1
            if (r34 == 0) goto L_0x00e1
            X.1E2 r1 = r1.A00
            if (r1 == 0) goto L_0x00e1
            X.1MR r11 = r8.A01
            java.util.HashSet r11 = r11.A0A(r1)
            java.util.HashSet r20 = X.C63872tp.A02(r11)
            X.2sr r11 = new X.2sr
            r18 = r11
            r19 = r1
            r18.<init>(r19, r20, r21, r22, r24)
            r4.add(r11)
        L_0x00e1:
            boolean r1 = X.C22971Dz.A0T(r7)
            if (r1 == 0) goto L_0x0025
            X.11S r1 = r8.A00
            boolean r7 = r1.A0O(r7)
            if (r7 == 0) goto L_0x0025
            r1.A0I()
            com.whatsapp.jid.PhoneUserJid r11 = r1.A0E
            X.C17960vV.A07(r11)
            X.C18070vi.A0X(r11)
            X.1MR r7 = r8.A01
            r1.A0I()
            com.whatsapp.jid.PhoneUserJid r1 = r1.A0E
            X.C17960vV.A07(r1)
            java.util.HashSet r1 = r7.A0A(r1)
            java.util.HashSet r20 = X.C63872tp.A02(r1)
            X.2sr r1 = new X.2sr
            r18 = r1
            r19 = r11
            r18.<init>(r19, r20, r21, r22, r24)
            r4.add(r1)
            goto L_0x0025
        L_0x011a:
            boolean r8 = X.C22971Dz.A0X(r10)
            if (r8 == 0) goto L_0x0089
            X.1E2 r9 = r1.A00
            if (r9 == 0) goto L_0x0089
            java.lang.String r8 = "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid"
            X.C18070vi.A0z(r10, r8)
            r3.put(r10, r9)
            goto L_0x0089
        L_0x012e:
            int r8 = r11.A01
            if (r8 == r2) goto L_0x0070
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r8 = "GroupParticipantsManager/sync-change-admin-participant: "
            r9.append(r8)
            r9.append(r7)
            java.lang.String r8 = " was "
            r9.append(r8)
            int r8 = r11.A01
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r8)
            r12.add(r11)
            goto L_0x0070
        L_0x0155:
            java.lang.String r2 = "superadmin"
            boolean r8 = r2.equals(r8)
            r2 = 0
            if (r8 == 0) goto L_0x0052
            r2 = 2
            goto L_0x0052
        L_0x0162:
            X.00H r1 = r6.A0F
            r1.get()
            java.util.Collection r1 = r13.values()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            if (r1 == 0) goto L_0x0190
            java.util.Iterator r7 = r1.iterator()
        L_0x0176:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0190
            java.lang.Object r2 = r7.next()
            X.2nJ r2 = (X.C60052nJ) r2
            boolean r1 = r2.A00()
            if (r1 == 0) goto L_0x0176
            X.1E2 r1 = r2.A00
            if (r1 == 0) goto L_0x0176
            r8.add(r1)
            goto L_0x0176
        L_0x0190:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.10f r1 = r15.A09()
            X.1IZ r10 = r1.iterator()
        L_0x019d:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x01e0
            java.lang.Object r2 = r10.next()
            X.1BI r2 = (X.AnonymousClass1BI) r2
            boolean r1 = r13.containsKey(r2)
            if (r1 != 0) goto L_0x019d
            boolean r1 = r8.contains(r2)
            if (r1 != 0) goto L_0x019d
            X.11S r9 = r6.A02
            boolean r1 = r9.A0O(r2)
            if (r1 == 0) goto L_0x01c8
            X.1E2 r1 = r9.A09()
            boolean r1 = r13.containsKey(r1)
            if (r1 == 0) goto L_0x01c8
            goto L_0x019d
        L_0x01c8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "GroupParticipantsManager/sync-remove-participant:"
            r9.append(r1)
            r9.append(r2)
            java.lang.String r1 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r7.add(r2)
            goto L_0x019d
        L_0x01e0:
            X.11S r1 = r6.A02
            r1.A0I()
            com.whatsapp.jid.PhoneUserJid r8 = r1.A0E
            X.1E2 r2 = r1.A09()
            boolean r1 = r5.contains(r2)
            if (r1 == 0) goto L_0x02a4
            boolean r1 = r7.contains(r8)
            if (r1 == 0) goto L_0x02a4
            r5.remove(r2)
            r7.remove(r8)
        L_0x01fd:
            X.190 r1 = r6.A00
            X.C63872tp.A04(r1, r15, r4)
            X.00H r1 = r6.A0J
            java.lang.Object r1 = r1.get()
            X.2lT r1 = (X.C58922lT) r1
            r1.A02(r15, r4)
            r15.A0R(r7)
            r6.A0B(r15)
            X.2ej r2 = new X.2ej
            r2.<init>(r3, r5, r12, r7)
            X.1E9 r6 = r15.A06
            X.1nh r1 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r3 = X.C36321nh.A00(r6)
            X.00H r4 = r0.A0n
            java.lang.Object r1 = r4.get()
            X.2l0 r1 = (X.C58632l0) r1
            java.util.List r12 = r2.A01
            java.util.List r1 = r1.A01(r3, r12)
            java.lang.Object r4 = r4.get()
            X.2l0 r4 = (X.C58632l0) r4
            java.util.List r9 = r2.A03
            java.util.List r5 = r4.A01(r3, r9)
            X.00H r4 = r0.A1W
            java.lang.Object r7 = r4.get()
            X.2eq r7 = (X.C54872eq) r7
            X.3MQ r8 = r2.A00
            r4 = 1
            X.C18070vi.A0d(r8, r4)
            r4 = 2
            X.C18070vi.A0d(r1, r4)
            r4 = 3
            X.C18070vi.A0d(r5, r4)
            X.00H r4 = r7.A02
            r4.get()
            X.10f r4 = r15.A09()
            X.1IZ r11 = r4.iterator()
            r13 = 0
        L_0x025e:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x02b8
            java.lang.Object r7 = r11.next()
            com.whatsapp.jid.Jid r7 = (com.whatsapp.jid.Jid) r7
            boolean r4 = X.C22971Dz.A0T(r7)
            if (r4 == 0) goto L_0x029a
            X.3MQ r10 = r8.inverse()
            java.lang.String r4 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.C18070vi.A0z(r7, r4)
            java.lang.Object r10 = r10.get(r7)
        L_0x027d:
            if (r10 == 0) goto L_0x025e
            boolean r4 = r1.contains(r10)
            if (r4 == 0) goto L_0x028d
            r1.remove(r10)
            r5.remove(r7)
        L_0x028b:
            r13 = 1
            goto L_0x025e
        L_0x028d:
            boolean r4 = r5.contains(r10)
            if (r4 == 0) goto L_0x025e
            r1.remove(r7)
            r5.remove(r10)
            goto L_0x028b
        L_0x029a:
            java.lang.String r4 = "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid"
            X.C18070vi.A0z(r7, r4)
            java.lang.Object r10 = r8.get(r7)
            goto L_0x027d
        L_0x02a4:
            boolean r1 = r5.contains(r8)
            if (r1 == 0) goto L_0x01fd
            boolean r1 = r7.contains(r2)
            if (r1 == 0) goto L_0x01fd
            r5.remove(r8)
            r7.remove(r2)
            goto L_0x01fd
        L_0x02b8:
            r8 = 0
            r7 = 1
            if (r30 == 0) goto L_0x03d6
            java.util.ArrayList r10 = r15.A0K()
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x03d3
            X.1Uh r4 = r0.A0V
            X.1PQ r14 = r0.A0h
            X.11P r11 = r0.A0F
            long r21 = X.AnonymousClass11P.A01(r11)
            if (r32 == 0) goto L_0x03d0
            int r11 = r10.size()
            if (r11 != r7) goto L_0x03d0
            java.lang.Object r7 = r10.get(r8)
            X.2sr r7 = (X.C63312sr) r7
            com.whatsapp.jid.UserJid r7 = r7.A04
        L_0x02e0:
            r18 = 0
            r20 = 12
            r19 = r1
            r16 = r3
            r17 = r7
            X.2Mh r8 = r14.A05(r15, r16, r17, r18, r19, r20, r21)
            r7 = 2
            r4.BcH(r8, r7)
        L_0x02f2:
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x0317
            X.1Uh r8 = r0.A0V
            X.1PQ r4 = r0.A0h
            X.11P r10 = r0.A0F
            long r23 = X.AnonymousClass11P.A01(r10)
            r17 = 0
            r22 = 13
            r20 = r17
            r16 = r4
            r18 = r3
            r19 = r17
            r21 = r5
            X.2Mh r4 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            r8.BcH(r4, r7)
        L_0x0317:
            if (r3 == 0) goto L_0x031e
            java.util.List r4 = r2.A02
            r0.A0X(r3, r4)
        L_0x031e:
            boolean r3 = r1.isEmpty()
            r4 = r27
            if (r3 != 0) goto L_0x0344
            X.11S r7 = r0.A05
            boolean r3 = r15.A0W(r7)
            if (r3 == 0) goto L_0x0344
            r7.A0I()
            com.whatsapp.jid.PhoneUserJid r3 = r7.A0E
            boolean r3 = r1.contains(r3)
            r8 = r33
            if (r3 == 0) goto L_0x03c9
            X.10f r7 = r15.A09()
            int r3 = r4.A00
            r0.A06(r15, r7, r3, r8)
        L_0x0344:
            X.10I r8 = r0.A0k
            r7 = 41
            X.7Qq r3 = new X.7Qq
            r3.<init>(r0, r2, r7)
            r8.CGF(r3)
            java.lang.String r7 = "phash"
            java.lang.String r3 = r4.A01
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x03ae
            int r3 = r12.size()
            if (r3 > 0) goto L_0x0366
            int r3 = r9.size()
            if (r3 <= 0) goto L_0x03ae
        L_0x0366:
            X.1PT r7 = r0.A0e
            boolean r0 = r4.A03
            int r3 = r12.size()
            int r11 = r9.size()
            boolean r9 = r4.A04
            int r10 = r15.A06()
            X.2GF r8 = new X.2GF
            r8.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A00 = r0
            X.1CJ r0 = r7.A07
            java.lang.Integer r0 = X.C64002u3.A07(r0, r6)
            r8.A03 = r0
            long r3 = (long) r3
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r8.A04 = r0
            long r3 = (long) r11
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r8.A05 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r8.A01 = r0
            int r0 = X.C64002u3.A03(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A02 = r0
            X.18K r0 = r7.A0C
            r0.CC7(r8)
        L_0x03ae:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x03bd
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x03bd
            r1 = 0
            if (r13 == 0) goto L_0x03be
        L_0x03bd:
            r1 = 1
        L_0x03be:
            java.util.List r0 = r2.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x03c8
            r1 = r1 | 2
        L_0x03c8:
            return r1
        L_0x03c9:
            int r3 = r4.A00
            r0.A06(r15, r1, r3, r8)
            goto L_0x0344
        L_0x03d0:
            r7 = 0
            goto L_0x02e0
        L_0x03d3:
            r7 = 2
            goto L_0x02f2
        L_0x03d6:
            r10 = 2
            if (r31 == 0) goto L_0x031e
            r4 = r28
            if (r28 == 0) goto L_0x031e
            java.lang.String r3 = r15.A0F()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x031e
            X.1Uh r11 = r0.A0V
            X.1PQ r8 = r0.A0h
            X.11P r3 = r0.A0F
            long r3 = X.AnonymousClass11P.A01(r3)
            r7 = 86
            X.20i r3 = r8.A02(r6, r7, r3)
            r11.BcH(r3, r10)
            goto L_0x031e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass126.A00(X.2tp, X.126, X.2sm, java.lang.String, java.util.Map, boolean, boolean, boolean, boolean, boolean):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.97z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.97w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: X.97z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: X.97x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: X.97y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: X.2Mg} */
    /* JADX WARNING: type inference failed for: r0v35, types: [X.981, X.2Mf] */
    /* JADX WARNING: type inference failed for: r0v41, types: [X.980, X.2Mf] */
    /* JADX WARNING: type inference failed for: r0v46, types: [X.983, X.2Mf, X.206] */
    /* JADX WARNING: type inference failed for: r16v6, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r0v75 */
    /* JADX WARNING: type inference failed for: r16v7, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r0v77 */
    /* JADX WARNING: type inference failed for: r16v8, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r0v83 */
    /* JADX WARNING: type inference failed for: r11v13, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r0v85 */
    /* JADX WARNING: type inference failed for: r11v14, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r0v88 */
    /* JADX WARNING: type inference failed for: r11v15, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r0v91 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(X.C63872tp r23, com.whatsapp.jid.GroupJid r24, com.whatsapp.jid.GroupJid r25, X.AnonymousClass1EC r26, com.whatsapp.jid.UserJid r27, com.whatsapp.jid.UserJid r28, X.C62502rV r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.util.List r33, int r34, long r35, boolean r37) {
        /*
            r22 = this;
            r4 = r25
            java.lang.String r0 = "auto_add"
            r8 = r30
            boolean r11 = r0.equals(r8)
            r1 = r22
            r5 = r24
            r14 = r26
            r15 = r27
            r16 = r29
            r9 = r33
            r6 = r35
            if (r11 != 0) goto L_0x022d
            java.lang.String r0 = "default_sub_group_admin_add"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x022d
            java.lang.String r0 = "invite_auto_add"
            boolean r0 = r0.equals(r8)
            r13 = r23
            r2 = r28
            r3 = r32
            if (r0 == 0) goto L_0x00d3
            if (r37 == 0) goto L_0x0073
            X.1PQ r5 = r1.A0h
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r8 = X.C42941yz.A00(r14)
            X.1EC r10 = X.C42941yz.A00(r4)
            if (r29 != 0) goto L_0x0066
            X.1PP r4 = r5.A02
            r0 = 1
            X.205 r8 = r4.A01(r8, r0)
            r4 = 125(0x7d, float:1.75E-43)
            X.97y r0 = new X.97y
            r0.<init>(r8, r4, r6)
        L_0x004e:
            r4 = 3
            r0.A00 = r4
            r0.A1F(r10, r3)
            r0.A0d(r2)
            r0.A0i(r3)
            int r3 = r0.A00
            X.AnonymousClass1PQ.A00(r2, r0, r5, r9, r3)
        L_0x005f:
            X.1Uh r2 = r1.A0V
            r1 = 2
            r2.BcH(r0, r1)
            return
        L_0x0066:
            r14 = 125(0x7d, float:1.75E-43)
            r12 = 0
            X.97y r0 = new X.97y
            r13 = r16
            r15 = r6
            r11 = r0
            r11.<init>((X.C63872tp) r12, (X.C62502rV) r13, (int) r14, (long) r15)
            goto L_0x004e
        L_0x0073:
            if (r25 != 0) goto L_0x0081
            X.00H r0 = r1.A0m
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r4 = r0.A05(r14)
        L_0x0081:
            X.1PQ r2 = r1.A0h
            X.1CJ r0 = r1.A0I
            java.lang.String r8 = r0.A0F(r5)
            java.lang.String r3 = r0.A0F(r4)
            if (r29 != 0) goto L_0x00c3
            X.1PP r10 = r2.A02
            r0 = 1
            X.205 r17 = r10.A01(r14, r0)
            r19 = 101(0x65, float:1.42E-43)
            r18 = 0
            X.98U r0 = new X.98U
            r20 = r6
            r16 = r0
            r16.<init>((X.AnonymousClass205) r17, (X.C62502rV) r18, (int) r19, (long) r20)
        L_0x00a3:
            if (r24 == 0) goto L_0x00b1
            java.util.List r11 = r0.A00
            r10 = 2
            r7 = 0
            X.2md r6 = new X.2md
            r6.<init>(r5, r8, r10, r7)
            r11.add(r6)
        L_0x00b1:
            if (r4 == 0) goto L_0x00bf
            java.util.List r8 = r0.A00
            r7 = 1
            r6 = 0
            X.2md r5 = new X.2md
            r5.<init>(r4, r3, r7, r6)
            r8.add(r5)
        L_0x00bf:
            r3 = 101(0x65, float:1.42E-43)
            goto L_0x029a
        L_0x00c3:
            r19 = 101(0x65, float:1.42E-43)
            X.98U r0 = new X.98U
            r17 = r13
            r18 = r16
            r20 = r6
            r16 = r0
            r16.<init>((X.C63872tp) r17, (X.C62502rV) r18, (int) r19, (long) r20)
            goto L_0x00a3
        L_0x00d3:
            java.lang.String r0 = "invite"
            r10 = r34
            if (r37 == 0) goto L_0x0143
            r5 = 3
            if (r10 != r5) goto L_0x0143
            boolean r12 = r0.equals(r8)
            X.1PQ r8 = r1.A0h
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r11 = X.C42941yz.A00(r14)
            X.1EC r10 = X.C42941yz.A00(r4)
            if (r12 == 0) goto L_0x011d
            if (r29 != 0) goto L_0x0110
            X.1PP r4 = r8.A02
            r0 = 1
            X.205 r11 = r4.A01(r11, r0)
            r4 = 123(0x7b, float:1.72E-43)
            X.97x r0 = new X.97x
            r0.<init>(r11, r4, r6)
        L_0x00fe:
            r0.A00 = r5
            r0.A1F(r10, r3)
            r0.A0d(r2)
            r0.A0i(r3)
        L_0x0109:
            int r3 = r0.A00
            X.AnonymousClass1PQ.A00(r2, r0, r8, r9, r3)
            goto L_0x005f
        L_0x0110:
            r14 = 123(0x7b, float:1.72E-43)
            r12 = 0
            X.97x r0 = new X.97x
            r13 = r16
            r15 = r6
            r11 = r0
            r11.<init>((X.C63872tp) r12, (X.C62502rV) r13, (int) r14, (long) r15)
            goto L_0x00fe
        L_0x011d:
            if (r29 != 0) goto L_0x0136
            X.1PP r4 = r8.A02
            r0 = 1
            X.205 r11 = r4.A01(r11, r0)
            r4 = 124(0x7c, float:1.74E-43)
            X.97z r0 = new X.97z
            r0.<init>(r11, r4, r6)
        L_0x012d:
            r0.A00 = r5
            r0.A1F(r10, r3)
            r0.A0d(r2)
            goto L_0x0109
        L_0x0136:
            r14 = 124(0x7c, float:1.74E-43)
            r12 = 0
            X.97z r0 = new X.97z
            r13 = r16
            r15 = r6
            r11 = r0
            r11.<init>((X.C63872tp) r12, (X.C62502rV) r13, (int) r14, (long) r15)
            goto L_0x012d
        L_0x0143:
            X.1PU r11 = r1.A0j
            r2 = 6
            r5 = r31
            if (r10 != r2) goto L_0x019b
            X.0ve r12 = r11.A02
            r11 = 5021(0x139d, float:7.036E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r12, r11)
            if (r2 == 0) goto L_0x019b
            X.11S r2 = r1.A05
            r2.A0I()
            com.whatsapp.jid.PhoneUserJid r2 = r2.A0E
            boolean r2 = r9.contains(r2)
            if (r2 == 0) goto L_0x019b
            X.1PQ r2 = r1.A0h
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r10 = X.C42941yz.A00(r4)
            r4 = 1
            if (r29 != 0) goto L_0x018b
            X.1PP r0 = r2.A02
            X.205 r12 = r0.A01(r14, r4)
            r11 = 149(0x95, float:2.09E-43)
            X.98C r0 = new X.98C
            r0.<init>(r12, r11, r6)
        L_0x017b:
            r6 = 6
            r0.A00 = r6
            r0.A1F(r10, r5)
            r0.A1G(r14, r3, r4)
            r0.A0d(r15)
            r0.A0X = r8
            goto L_0x0298
        L_0x018b:
            r19 = 149(0x95, float:2.09E-43)
            r17 = 0
            X.98C r0 = new X.98C
            r18 = r16
            r20 = r6
            r16 = r0
            r16.<init>((X.C63872tp) r17, (X.C62502rV) r18, (int) r19, (long) r20)
            goto L_0x017b
        L_0x019b:
            java.lang.String r2 = "accept"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x01b1
            r18 = 52
        L_0x01a5:
            X.1PQ r12 = r1.A0h
            r19 = r6
            r17 = r9
            X.2Mh r0 = r12.A05(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x005f
        L_0x01b1:
            java.lang.String r2 = "default_sub_group_promote"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x01bc
            r18 = 93
            goto L_0x01a5
        L_0x01bc:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x01f3
            r0 = 2
            if (r10 == r0) goto L_0x01c8
            r0 = 6
            if (r10 != r0) goto L_0x0225
        L_0x01c8:
            if (r37 == 0) goto L_0x0225
            r11 = 126(0x7e, float:1.77E-43)
            X.1PQ r8 = r1.A0h
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r3 = X.C42941yz.A00(r4)
            X.1PP r2 = r8.A02
            r0 = 1
            X.205 r2 = r2.A01(r14, r0)
            X.980 r0 = new X.980
            r0.<init>(r2, r11, r6)
            r2 = 2
            r0.A00 = r2
            r0.A1F(r3, r5)
            r0.A00 = r10
        L_0x01e8:
            int r2 = r0.A00
            X.AnonymousClass1PQ.A00(r15, r0, r8, r9, r2)
            r2 = 1
            X.AnonymousClass1PQ.A01(r15, r0, r8, r2)
            goto L_0x005f
        L_0x01f3:
            java.lang.String r0 = "linked_group_join"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x01fe
            r18 = 79
            goto L_0x01a5
        L_0x01fe:
            r0 = 2
            if (r10 == r0) goto L_0x0204
            r0 = 6
            if (r10 != r0) goto L_0x0229
        L_0x0204:
            if (r37 == 0) goto L_0x0229
            r11 = 127(0x7f, float:1.78E-43)
            X.1PQ r8 = r1.A0h
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r3 = X.C42941yz.A00(r4)
            X.1PP r2 = r8.A02
            r0 = 1
            X.205 r2 = r2.A01(r14, r0)
            X.981 r0 = new X.981
            r0.<init>(r2, r11, r6)
            r2 = 2
            r0.A00 = r2
            r0.A1F(r3, r5)
            r0.A00 = r10
            goto L_0x01e8
        L_0x0225:
            r18 = 20
            goto L_0x01a5
        L_0x0229:
            r18 = 12
            goto L_0x01a5
        L_0x022d:
            if (r25 != 0) goto L_0x023b
            X.00H r0 = r1.A0m
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r4 = r0.A05(r14)
        L_0x023b:
            r8 = 0
            if (r4 == 0) goto L_0x02af
            X.1CJ r0 = r1.A0I
            java.lang.String r10 = r0.A0F(r4)
            r2 = 1
            r0 = 0
            X.2md r3 = new X.2md
            r3.<init>(r4, r10, r2, r0)
        L_0x024b:
            if (r24 == 0) goto L_0x025a
            X.1CJ r0 = r1.A0I
            java.lang.String r4 = r0.A0F(r5)
            r2 = 2
            r0 = 0
            X.2md r8 = new X.2md
            r8.<init>(r5, r4, r2, r0)
        L_0x025a:
            if (r11 == 0) goto L_0x02b1
            X.00H r0 = r1.A0p
            java.lang.Object r2 = r0.get()
            X.2eZ r2 = (X.C54702eZ) r2
            r0 = 4
            X.C18070vi.A0d(r9, r0)
            X.1PQ r2 = r2.A00
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r5 = X.C42941yz.A00(r14)
            if (r29 != 0) goto L_0x029f
            X.1PP r4 = r2.A02
            r0 = 1
            X.205 r5 = r4.A01(r5, r0)
            r4 = 144(0x90, float:2.02E-43)
            X.97w r0 = new X.97w
            r0.<init>(r5, r4, r6)
        L_0x0280:
            r4 = 3
            r0.A00 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r3 == 0) goto L_0x028d
            r4.add(r3)
        L_0x028d:
            if (r8 == 0) goto L_0x0292
            r4.add(r8)
        L_0x0292:
            r0.A1D(r4)
            r0.A0d(r15)
        L_0x0298:
            int r3 = r0.A00
        L_0x029a:
            X.AnonymousClass1PQ.A00(r15, r0, r2, r9, r3)
            goto L_0x005f
        L_0x029f:
            r19 = 144(0x90, float:2.02E-43)
            r17 = 0
            X.97w r0 = new X.97w
            r18 = r16
            r20 = r6
            r16 = r0
            r16.<init>((X.C63872tp) r17, (X.C62502rV) r18, (int) r19, (long) r20)
            goto L_0x0280
        L_0x02af:
            r3 = r8
            goto L_0x024b
        L_0x02b1:
            X.1PQ r5 = r1.A0h
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r10 = X.C42941yz.A00(r14)
            r8 = 0
            if (r3 == 0) goto L_0x02f4
            com.whatsapp.jid.GroupJid r0 = r3.A02
            X.1EC r4 = X.C42941yz.A00(r0)
            java.lang.String r8 = r3.A03
        L_0x02c4:
            if (r29 != 0) goto L_0x02e4
            X.1PP r2 = r5.A02
            r0 = 1
            X.205 r3 = r2.A01(r10, r0)
            r2 = 124(0x7c, float:1.74E-43)
            X.97z r0 = new X.97z
            r0.<init>(r3, r2, r6)
        L_0x02d4:
            r2 = 3
            r0.A00 = r2
            r0.A1F(r4, r8)
            r0.A0d(r15)
            int r2 = r0.A00
            X.AnonymousClass1PQ.A00(r15, r0, r5, r9, r2)
            goto L_0x005f
        L_0x02e4:
            r19 = 124(0x7c, float:1.74E-43)
            r17 = 0
            X.97z r0 = new X.97z
            r18 = r16
            r20 = r6
            r16 = r0
            r16.<init>((X.C63872tp) r17, (X.C62502rV) r18, (int) r19, (long) r20)
            goto L_0x02d4
        L_0x02f4:
            r4 = r8
            goto L_0x02c4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass126.A0Q(X.2tp, com.whatsapp.jid.GroupJid, com.whatsapp.jid.GroupJid, X.1EC, com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid, X.2rV, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009d, code lost:
        if (r44 != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        if (r13 != false) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(X.C63262sm r55, X.AnonymousClass1EC r56, X.AnonymousClass1EC r57, com.whatsapp.jid.UserJid r58, X.C42661yX r59, X.C29741cn r60, java.lang.Integer r61, java.lang.String r62, java.lang.String r63, java.util.Map r64, java.util.Map r65, int r66, int r67, int r68, int r69, int r70, long r71, long r73, long r75, boolean r77, boolean r78, boolean r79, boolean r80, boolean r81, boolean r82, boolean r83, boolean r84, boolean r85, boolean r86, boolean r87, boolean r88) {
        /*
            r54 = this;
            r6 = r73
            java.lang.String r0 = "groupmgr/onGroupInfoFromList"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r54
            X.1M9 r15 = r0.A08
            r1 = r56
            X.1E7 r2 = r15.A0H(r1)
            java.lang.String r3 = r2.A0X
            boolean r44 = android.text.TextUtils.isEmpty(r3)
            boolean r3 = r2.A0r
            r20 = 0
            r4 = r85
            if (r3 == r4) goto L_0x0021
            r20 = 1
        L_0x0021:
            boolean r3 = r2.A0i
            r19 = 0
            r14 = r87
            if (r3 == r14) goto L_0x002b
            r19 = 1
        L_0x002b:
            r38 = r83
            r40 = r86
            r48 = r58
            r25 = r59
            r42 = r88
            r5 = r63
            r21 = r62
            r28 = r69
            r29 = r70
            r30 = r71
            r32 = r77
            r33 = r78
            r34 = r79
            r35 = r80
            r36 = r81
            r37 = r82
            r26 = r21
            r27 = r5
            r39 = r4
            r41 = r14
            r22 = r2
            r23 = r0
            r24 = r48
            boolean r18 = A0G(r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            int r3 = r2.A04
            r4 = r66
            if (r3 == r4) goto L_0x033d
            r2.A04 = r4
            r18 = 1
            r17 = 1
        L_0x0069:
            r50 = r21
            X.1CJ r11 = r0.A0I
            boolean r3 = r11.A0P(r1)
            r4 = 1
            r16 = r3 ^ 1
            r8 = 3
            r13 = 0
            r51 = r67
            r3 = r51
            if (r3 != r8) goto L_0x007d
            r13 = 1
        L_0x007d:
            r3 = r64
            if (r64 == 0) goto L_0x0092
            boolean r8 = r3.isEmpty()
            if (r8 != 0) goto L_0x0092
            X.00H r8 = r0.A19
            java.lang.Object r8 = r8.get()
            X.1fv r8 = (X.C31661fv) r8
            r8.A02(r3)
        L_0x0092:
            r8 = r65
            if (r65 == 0) goto L_0x0099
            r0.A0i(r8)
        L_0x0099:
            if (r16 != 0) goto L_0x009f
            r43 = 1
            if (r44 == 0) goto L_0x00a1
        L_0x009f:
            r43 = 0
        L_0x00a1:
            r46 = 0
            if (r64 == 0) goto L_0x00db
            X.1MZ r8 = r0.A0O
            X.1MW r8 = r8.A08
            X.2tp r8 = r8.A0C(r1)
            java.lang.String r9 = "lid"
            boolean r10 = r9.equals(r5)
            if (r10 == 0) goto L_0x0337
            r9 = 2
        L_0x00b6:
            r8.A00 = r9
            java.lang.String r9 = r2.A0U
            if (r10 != 0) goto L_0x00c0
            r47 = 0
            if (r13 == 0) goto L_0x00c2
        L_0x00c0:
            r47 = 1
        L_0x00c2:
            r40 = r55
            r38 = r8
            r39 = r0
            r41 = r9
            r42 = r3
            r45 = r4
            int r46 = A00(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r8 = r46 & 1
            if (r8 == 0) goto L_0x00db
            X.1Me r8 = r0.A0A
            r8.A0g(r1)
        L_0x00db:
            r12 = 0
            r23 = r57
            if (r16 == 0) goto L_0x02cb
            X.00H r8 = r0.A0p
            r8.get()
            java.lang.String r8 = "lid"
            boolean r8 = r8.equals(r5)
            X.11S r5 = r0.A05
            if (r8 == 0) goto L_0x02c4
            X.1E2 r8 = r5.A09()
        L_0x00f3:
            r9 = 0
            if (r8 == 0) goto L_0x010c
            if (r64 == 0) goto L_0x010c
            java.lang.Object r3 = r3.get(r8)
            X.2nJ r3 = (X.C60052nJ) r3
            if (r3 == 0) goto L_0x010c
            java.lang.String r8 = r3.A04
            java.lang.String r3 = "admin"
            if (r8 == r3) goto L_0x010b
            java.lang.String r3 = "superadmin"
            if (r8 != r3) goto L_0x010c
        L_0x010b:
            r9 = 1
        L_0x010c:
            if (r13 == 0) goto L_0x012d
            if (r9 != 0) goto L_0x012d
            X.1Uh r3 = r0.A0V
            X.1PQ r8 = r0.A0h
            X.11P r9 = r0.A0F
            long r37 = X.AnonymousClass11P.A01(r9)
            r36 = 99
            r35 = r12
            r32 = r8
            r33 = r12
            r34 = r1
            X.2Mh r8 = r32.A06(r33, r34, r35, r36, r37)
            X.122 r3 = r3.A01
            r3.BBM(r8)
        L_0x012d:
            X.1Uh r3 = r0.A0V
            X.1PQ r13 = r0.A0h
            r36 = 11
            r35 = r12
            r32 = r13
            r33 = r12
            r34 = r1
            r37 = r6
            X.2Mh r9 = r32.A06(r33, r34, r35, r36, r37)
            r8 = r21
            r9.A0i(r8)
            r8 = r48
            r9.A0d(r8)
            r3.BcH(r9, r4)
            boolean r8 = r5.A0O(r8)
            if (r8 != 0) goto L_0x016f
            r5.A0I()
            com.whatsapp.jid.PhoneUserJid r10 = r5.A0E
            X.C17960vV.A07(r10)
            X.1PP r5 = r13.A02
            X.205 r9 = r5.A01(r1, r4)
            r8 = 4
            X.2Mh r5 = new X.2Mh
            r5.<init>(r9, r8, r6)
            r5.A0d(r10)
            r8 = 2
            r3.BcH(r5, r8)
        L_0x016f:
            if (r57 == 0) goto L_0x017e
            r26 = 0
            java.lang.String r24 = ""
            X.A2B r12 = new X.A2B
            r22 = r12
            r25 = r4
            r22.<init>(r23, r24, r25, r26)
        L_0x017e:
            if (r62 != 0) goto L_0x0182
            java.lang.String r50 = ""
        L_0x0182:
            X.A2B r8 = new X.A2B
            r24 = r8
            r25 = r1
            r26 = r50
            r27 = r51
            r28 = r6
            r24.<init>(r25, r26, r27, r28)
            java.lang.Integer r38 = X.AnonymousClass00R.A0Y
            r9 = 3019(0xbcb, float:4.23E-42)
            int r5 = r8.A00
            if (r5 != r4) goto L_0x01ae
            com.whatsapp.jid.GroupJid r5 = r8.A02
            android.os.Parcelable$Creator r10 = X.AnonymousClass1EC.CREATOR
            X.1EC r10 = X.C42941yz.A00(r5)
            if (r10 == 0) goto L_0x01ae
            X.00H r5 = r0.A0t
            java.lang.Object r5 = r5.get()
            com.whatsapp.group.GetSubgroupsManager r5 = (com.whatsapp.group.GetSubgroupsManager) r5
            r5.A05(r10)
        L_0x01ae:
            r5 = 0
            r41 = 0
            r37 = r5
            r32 = r8
            r33 = r12
            r34 = r0
            r35 = r48
            r36 = r5
            r39 = r30
            r42 = r41
            A07(r32, r33, r34, r35, r36, r37, r38, r39, r41, r42)
            if (r87 == 0) goto L_0x01e0
            X.11P r8 = r0.A0F
            long r29 = X.AnonymousClass11P.A01(r8)
            r28 = 150(0x96, float:2.1E-43)
            r27 = r5
            r25 = r5
            r26 = r1
            r24 = r13
            X.2Mh r8 = r24.A06(r25, r26, r27, r28, r29)
            r8.A0d(r5)
            r3.BcH(r8, r9)
        L_0x01e0:
            if (r18 == 0) goto L_0x01e5
            r15.A0X(r2)
        L_0x01e5:
            X.1MS r3 = r0.A0N
            r5 = 0
            X.C18070vi.A0d(r1, r5)
            java.util.Map r3 = r3.A05
            boolean r3 = r3.containsKey(r1)
            if (r3 != 0) goto L_0x0204
            X.1Ui r3 = r0.A0f
            java.lang.String r26 = "GroupChatManager.updateGroupInfo"
            r28 = 2
            r29 = r5
            r25 = r1
            r27 = r5
            r24 = r3
            r24.A03(r25, r26, r27, r28, r29)
        L_0x0204:
            r3 = r46 & 2
            if (r3 == 0) goto L_0x020c
            r3 = 5
            r0.A0O(r3, r1)
        L_0x020c:
            if (r17 == 0) goto L_0x022d
            if (r43 == 0) goto L_0x022d
            X.1PQ r8 = r0.A0h
            int r5 = r2.A04
            X.11P r3 = r0.A0F
            long r29 = X.AnonymousClass11P.A01(r3)
            r26 = 0
            r25 = r1
            r27 = r26
            r28 = r5
            r24 = r8
            X.2MS r5 = r24.A0C(r25, r26, r27, r28, r29)
            r3 = 3017(0xbc9, float:4.228E-42)
            r0.A0O(r3, r5)
        L_0x022d:
            if (r20 == 0) goto L_0x0260
            if (r43 == 0) goto L_0x0260
            X.11P r3 = r0.A0F
            long r27 = X.AnonymousClass11P.A01(r3)
            boolean r5 = r2.A0r
            r26 = 0
            X.00H r2 = r0.A1A
            java.lang.Object r2 = r2.get()
            X.2kV r2 = (X.C58322kV) r2
            X.0ve r8 = r2.A00
            r3 = 3695(0xe6f, float:5.178E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r8, r3)
            if (r2 == 0) goto L_0x0260
            X.1PQ r2 = r0.A0h
            r25 = r1
            r29 = r5
            r24 = r2
            X.2Mh r3 = r24.A09(r25, r26, r27, r29)
            r2 = 3027(0xbd3, float:4.242E-42)
            r0.A0O(r2, r3)
        L_0x0260:
            r3 = 3
            r2 = r51
            if (r2 != r3) goto L_0x0294
            if (r61 == 0) goto L_0x026e
            int r2 = r61.intValue()
            A0D(r0, r1, r2)
        L_0x026e:
            java.lang.Integer r25 = X.AnonymousClass00R.A0Y
            r22 = r0
            r24 = r1
            r26 = r21
            r27 = r51
            r28 = r6
            A0E(r22, r23, r24, r25, r26, r27, r28)
            X.1V2 r4 = r0.A1J
            r2 = r75
            r4.A00(r1, r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r6 = r73 / r2
            r4.A01(r1, r6)
            X.1Mc r2 = r0.A0i
            r0 = 0
            r3 = r84
            r2.A05(r1, r0, r3)
            return
        L_0x0294:
            if (r2 != r4) goto L_0x026e
            X.1ci r5 = X.AnonymousClass1CJ.A00(r11, r1)
            r8 = r68
            if (r5 == 0) goto L_0x02b2
            X.00H r2 = r0.A0m
            java.lang.Object r3 = r2.get()
            X.1kb r3 = (X.C34511kb) r3
            r2 = 1
            if (r8 == r4) goto L_0x02aa
            r2 = 0
        L_0x02aa:
            r5.A0r = r2
            X.1QW r2 = r3.A03
            r2.A01(r5)
            goto L_0x026e
        L_0x02b2:
            if (r16 == 0) goto L_0x026e
            r3 = 0
            if (r8 != r4) goto L_0x02b8
            r3 = 1
        L_0x02b8:
            X.00H r2 = r0.A0o
            java.lang.Object r2 = r2.get()
            X.4Q3 r2 = (X.AnonymousClass4Q3) r2
            r2.A00(r1, r3)
            goto L_0x026e
        L_0x02c4:
            r5.A0I()
            com.whatsapp.jid.PhoneUserJid r8 = r5.A0E
            goto L_0x00f3
        L_0x02cb:
            r5 = 3019(0xbcb, float:4.23E-42)
            X.1ci r3 = r11.A0A(r1)
            if (r3 != 0) goto L_0x0334
            r10 = r12
        L_0x02d4:
            X.1Rf r8 = r0.A0c
            X.11P r9 = r0.A0F
            long r28 = X.AnonymousClass11P.A01(r9)
            r49 = r60
            r24 = r8
            r25 = r1
            r26 = r10
            r27 = r49
            X.2Mh r10 = r24.A00(r25, r26, r27, r28)
            if (r10 == 0) goto L_0x02f3
            X.1Uh r9 = r0.A0V
            r8 = 8
            r9.BcH(r10, r8)
        L_0x02f3:
            if (r19 == 0) goto L_0x0313
            X.1Uh r8 = r0.A0V
            X.1PQ r9 = r0.A0h
            r36 = 151(0x97, float:2.12E-43)
            if (r87 == 0) goto L_0x02ff
            r36 = 150(0x96, float:2.1E-43)
        L_0x02ff:
            r35 = r12
            r32 = r9
            r33 = r12
            r34 = r1
            r37 = r30
            X.2Mh r9 = r32.A06(r33, r34, r35, r36, r37)
            r9.A0d(r12)
            r8.BcH(r9, r5)
        L_0x0313:
            X.1NI r8 = r0.A0L
            boolean r5 = android.text.TextUtils.isEmpty(r21)
            if (r5 == 0) goto L_0x0329
            java.lang.String r5 = r3.A0A()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0329
            java.lang.String r50 = r3.A0A()
        L_0x0329:
            r47 = r8
            r48 = r1
            r52 = r30
            r47.A04(r48, r49, r50, r51, r52)
            goto L_0x01e0
        L_0x0334:
            X.1cn r10 = r3.A0h
            goto L_0x02d4
        L_0x0337:
            r9 = 0
            if (r13 == 0) goto L_0x00b6
            r9 = 1
            goto L_0x00b6
        L_0x033d:
            r17 = 0
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass126.A0R(X.2sm, X.1EC, X.1EC, com.whatsapp.jid.UserJid, X.1yX, X.1cn, java.lang.Integer, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, int, int, int, int, long, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
