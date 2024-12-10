package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import com.whatsapp.interop.integrator.IntegratorManager$dispatchRefreshIntegrators$1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2lH  reason: invalid class name and case insensitive filesystem */
public final class C58802lH {
    public final C19880zA A00;
    public final C25001Mm A01;
    public final C26291Ro A02;
    public final C24661Le A03;
    public final C33501iv A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06 = C217517g.A00(32877);
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final C33621j7 A0A;
    public final AnonymousClass1M9 A0B;
    public final AnonymousClass12E A0C;
    public final C51992aC A0D;
    public final C22621Co A0E;
    public final AnonymousClass1WP A0F;
    public final AnonymousClass1DQ A0G;
    public final AnonymousClass1NI A0H;
    public final AnonymousClass1MS A0I;
    public final AnonymousClass1MZ A0J;
    public final C22611Cn A0K;
    public final C24621La A0L;
    public final AnonymousClass1MQ A0M;
    public final AnonymousClass126 A0N;
    public final C26221Rh A0O;
    public final C35681md A0P;
    public final AnonymousClass10I A0Q;
    public final AnonymousClass00H A0R;

    /* JADX WARNING: type inference failed for: r0v75, types: [X.2Ru, java.lang.Object] */
    public final void A00() {
        C28791au A052;
        long longValue;
        Cursor A0A2;
        Long l;
        int i;
        Cursor A002;
        long j;
        C22621Co.A02(this.A0E, false);
        this.A0M.A07();
        this.A0K.A01();
        C51992aC r1 = this.A0D;
        Log.i("BroadcastListChatStore/getBroadcastLists");
        ArrayList A13 = AnonymousClass000.A13();
        try {
            C28781at A042 = r1.A00.get();
            try {
                A002 = C23141Ev.A00(((C28801av) A042).A02, "SELECT raw_string, subject, created_timestamp FROM chat_view chat_view LEFT JOIN jid jid ON chat_view.jid_row_id = jid._id WHERE type = 3 AND ( chat_view.hidden IS NULL OR chat_view.hidden = 0 )", "GET_BROADCAST_LISTS_SQL");
                int columnIndexOrThrow = A002.getColumnIndexOrThrow("raw_string");
                int columnIndexOrThrow2 = A002.getColumnIndexOrThrow("subject");
                int columnIndexOrThrow3 = A002.getColumnIndexOrThrow("created_timestamp");
                while (A002.moveToNext()) {
                    C47712Jo A003 = C47712Jo.A00(A002.getString(columnIndexOrThrow));
                    if (A003 == null) {
                        Log.w("BroadcastListChatStore/getBroadcastLists/jid is null or invalid!");
                    } else {
                        String string = A002.getString(columnIndexOrThrow2);
                        if (!A002.isNull(columnIndexOrThrow3)) {
                            j = A002.getLong(columnIndexOrThrow3);
                        } else {
                            j = 0;
                        }
                        ? obj = new Object();
                        obj.A01 = A003;
                        obj.A02 = string;
                        obj.A00 = j;
                        A13.add(obj);
                    }
                }
                A002.close();
                A042.close();
                AnonymousClass1M9 r14 = this.A0B;
                Log.i("ContactManager/populateNamesFromBroadcasts");
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    C49762Ru r0 = (C49762Ru) it.next();
                    r14.A0C(r0.A01, r0.A02, "pn", r0.A00);
                }
                AnonymousClass1NI r12 = this.A0H;
                Log.i("msgstore/getPersistedGroupInfo");
                ArrayList A132 = AnonymousClass000.A13();
                try {
                    C28781at A043 = r12.A02.get();
                    try {
                        A0A2 = ((C28801av) A043).A02.A0A("SELECT jid.raw_string AS raw_string, chat_view.subject AS subject, chat_view.created_timestamp AS created_timestamp, chat_view.ephemeral_expiration AS ephemeral_expiration FROM chat_view chat_view LEFT JOIN jid jid ON chat_view.jid_row_id = jid._id WHERE jid.type IN ( 1, 16 ) AND (chat_view.hidden IS NULL OR chat_view.hidden = 0)", "GET_GROUP_CHAT_INFO_SQL", new String[0]);
                        int columnIndexOrThrow4 = A0A2.getColumnIndexOrThrow("raw_string");
                        int columnIndexOrThrow5 = A0A2.getColumnIndexOrThrow("subject");
                        int columnIndexOrThrow6 = A0A2.getColumnIndexOrThrow("created_timestamp");
                        int columnIndexOrThrow7 = A0A2.getColumnIndexOrThrow("ephemeral_expiration");
                        while (A0A2.moveToNext()) {
                            String string2 = A0A2.getString(columnIndexOrThrow4);
                            String string3 = A0A2.getString(columnIndexOrThrow5);
                            if (!A0A2.isNull(columnIndexOrThrow6)) {
                                l = C17890vO.A0M(A0A2, columnIndexOrThrow6);
                            } else {
                                l = null;
                            }
                            if (!A0A2.isNull(columnIndexOrThrow7)) {
                                i = A0A2.getInt(columnIndexOrThrow7);
                            } else {
                                i = 0;
                            }
                            AnonymousClass1EC A022 = AnonymousClass1EC.A01.A02(string2);
                            if (A022 != null) {
                                A132.add(new C54792ei(A022, l, string3, i));
                            }
                        }
                        A0A2.close();
                        A043.close();
                        Log.i("ContactManager/populateNamesFromBroadcasts");
                        Iterator it2 = A132.iterator();
                        while (it2.hasNext()) {
                            C54792ei r13 = (C54792ei) it2.next();
                            AnonymousClass1E7 r10 = new AnonymousClass1E7(r13.A01);
                            String str = r13.A03;
                            Long l2 = r13.A02;
                            if (l2 == null) {
                                longValue = Long.MIN_VALUE;
                            } else {
                                longValue = l2.longValue();
                            }
                            C42661yX r6 = C42661yX.A05;
                            int i2 = r13.A00;
                            C18070vi.A0d(r6, 4);
                            Log.i("addGroupChatContact");
                            r10.A0R = str;
                            r10.A0X = Long.toString(longValue);
                            r10.A0j = false;
                            r10.A13 = false;
                            r10.A0f = false;
                            r10.A11 = false;
                            r10.A04 = i2;
                            r10.A0K = null;
                            r10.A0t = false;
                            r10.A09(r6);
                            r10.A0k = false;
                            r10.A06 = 0;
                            r10.A12 = false;
                            r10.A0O = "pn";
                            r10.A0r = false;
                            r10.A0e = false;
                            r10.A0i = false;
                            r10.A03 = 0;
                            r10.A0n = false;
                            r14.A04.A0O(r10);
                        }
                        AnonymousClass1MZ r15 = this.A0J;
                        C28791au A053 = r15.A07.A05();
                        try {
                            C41851xA BD0 = A053.BD0();
                            try {
                                AnonymousClass1MW r4 = r15.A08;
                                Log.i("ParticipantUserStore/resetSentSenderKeyForAllParticipants");
                                C28791au A054 = r4.A06.A05();
                                try {
                                    C41851xA BD02 = A054.BD0();
                                    try {
                                        AnonymousClass1MV r3 = r4.A07;
                                        Log.i("ParticipantDeviceStore/resetSentSenderKeyForAllParticipants");
                                        ContentValues A092 = C17880vN.A09(1);
                                        A092.put("sent_sender_key", 0);
                                        A052 = r3.A03.A05();
                                        ((C28801av) A052).A02.A02(A092, "group_participant_device", (String) null, "resetSentSenderKeyForAllParticipants/UPDATE_GROUP_PARTICIPANT_DEVICE", (String[]) null);
                                        A052.close();
                                        AnonymousClass1MS r32 = r4.A04;
                                        Iterator it3 = new HashSet(r32.A05.keySet()).iterator();
                                        while (it3.hasNext()) {
                                            C63872tp A0A3 = r32.A0A((AnonymousClass1E9) it3.next());
                                            if (A0A3 != null) {
                                                AnonymousClass1MW.A05(A0A3, r4);
                                            }
                                        }
                                        BD02.A00();
                                        BD02.close();
                                        A054.close();
                                        BD0.A00();
                                        BD0.close();
                                        A053.close();
                                        this.A0F.A01();
                                        this.A0G.CCj();
                                        this.A0L.A03("async_init_migration_start_time");
                                        C27431Wb r33 = C33621j7.A00(this.A0A).A09;
                                        ((AnonymousClass1NP) r33.A0a.get()).A0B(512);
                                        r33.A0U.CGF(new C70573Bq(r33, 36));
                                        return;
                                    } catch (Throwable th) {
                                        BD02.close();
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    A054.close();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                BD0.close();
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            try {
                                A053.close();
                                throw th4;
                            } catch (Throwable th5) {
                                AnonymousClass0DT.A00(th4, th5);
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        A043.close();
                        throw th6;
                    }
                } catch (SQLiteDiskIOException e) {
                    Log.e("msgstore/groupinfo/error ", e);
                } catch (Throwable th7) {
                    AnonymousClass0DT.A00(th6, th7);
                }
                throw th;
                throw th;
                throw th;
            } catch (Throwable th8) {
                A042.close();
                throw th8;
            }
        } catch (SQLiteDiskIOException e2) {
            Log.e("BroadcastListChatStore/getBroadcastLists/error ", e2);
        } catch (Throwable th9) {
            AnonymousClass0DT.A00(th8, th9);
        }
    }

    public final void A01() {
        this.A0C.A05();
        this.A0I.A05.clear();
        this.A0N.A0P(3, false);
        this.A0O.A00();
        this.A0P.A02();
        if (((C39541tF) this.A07.get()).A00()) {
            C34651kr r1 = (C34651kr) this.A0R.get();
            AnonymousClass1OX r3 = r1.A05;
            IntegratorManager$dispatchRefreshIntegrators$1 integratorManager$dispatchRefreshIntegrators$1 = new IntegratorManager$dispatchRefreshIntegrators$1(r1, (C30391dr) null);
            C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, integratorManager$dispatchRefreshIntegrators$1, r3);
        }
        AnonymousClass10I r2 = this.A0Q;
        r2.CGF(new C21449AkG((Object) this, 10));
        r2.CGF(new C21449AkG((Object) this, 11));
    }

    public C58802lH(C19880zA r29, C25001Mm r30, C33621j7 r31, AnonymousClass1M9 r32, AnonymousClass12E r33, C51992aC r34, C22621Co r35, AnonymousClass1WP r36, AnonymousClass1DQ r37, AnonymousClass1NI r38, AnonymousClass1MS r39, AnonymousClass1MZ r40, C26291Ro r41, C22611Cn r42, C24621La r43, C24661Le r44, AnonymousClass1MQ r45, AnonymousClass126 r46, C26221Rh r47, C35681md r48, C33501iv r49, AnonymousClass10I r50, AnonymousClass00H r51, AnonymousClass00H r52, AnonymousClass00H r53, AnonymousClass00H r54, AnonymousClass00H r55) {
        C24661Le r15 = r44;
        AnonymousClass10I r0 = r50;
        C25001Mm r26 = r30;
        C33621j7 r25 = r31;
        C22621Co r21 = r35;
        C18070vi.A0w(r0, r21, r15, r26, r25);
        AnonymousClass1MQ r14 = r45;
        AnonymousClass126 r12 = r46;
        AnonymousClass00H r9 = r51;
        AnonymousClass1M9 r24 = r32;
        AnonymousClass1NI r18 = r38;
        C18070vi.A0x(r14, r24, r18, r12, r9);
        C24621La r13 = r43;
        C26221Rh r11 = r47;
        C35681md r10 = r48;
        AnonymousClass00H r8 = r52;
        AnonymousClass12E r23 = r33;
        C18070vi.A0y(r8, r10, r13, r23, r11);
        AnonymousClass00H r4 = r53;
        C51992aC r22 = r34;
        AnonymousClass1WP r20 = r36;
        AnonymousClass1MS r17 = r39;
        C18070vi.A0t(r4, r17, r22, r20);
        C33501iv r5 = r49;
        C19880zA r27 = r29;
        AnonymousClass1MZ r16 = r40;
        C26291Ro r7 = r41;
        C18070vi.A0u(r27, r16, r7, r5);
        AnonymousClass00H r3 = r54;
        AnonymousClass00H r2 = r55;
        C22611Cn r6 = r42;
        AnonymousClass1DQ r19 = r37;
        C18070vi.A0v(r6, r19, r3, r2);
        this.A0Q = r0;
        this.A0E = r21;
        this.A03 = r15;
        this.A01 = r26;
        this.A0A = r25;
        this.A0M = r14;
        this.A0B = r24;
        this.A0H = r18;
        this.A0N = r12;
        this.A09 = r9;
        this.A0R = r8;
        this.A0P = r10;
        this.A0L = r13;
        this.A0C = r23;
        this.A0O = r11;
        this.A07 = r4;
        this.A0I = r17;
        this.A0D = r22;
        this.A0F = r20;
        this.A00 = r27;
        this.A0J = r16;
        this.A02 = r7;
        this.A04 = r5;
        this.A0K = r6;
        this.A0G = r19;
        this.A05 = r3;
        this.A08 = r2;
    }
}
