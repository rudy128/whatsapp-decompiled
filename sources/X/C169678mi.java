package X;

import android.database.Cursor;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8mi  reason: invalid class name and case insensitive filesystem */
public final class C169678mi extends C169708ml {
    public final AnonymousClass11P A00;
    public final C218217n A01;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        long j;
        A6U a6u2 = a6u;
        C18070vi.A0d(a6u2, 2);
        String[] strArr = a6u2.A06;
        C62382rJ r4 = a6u2.A01;
        C166378cn r5 = a6u2.A03;
        if (strArr.length != 2 || !AnonymousClass8BU.A1a("mute", strArr)) {
            return null;
        }
        AnonymousClass1BI A02 = AnonymousClass1BI.A00.A02(strArr[1]);
        if (A02 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("mute-chat-mutation/from-key-value unable to create chat jid from ");
            C17890vO.A19(A10, strArr[1]);
            return null;
        } else if (!C18070vi.A18(C62382rJ.A03, r4) || r5 == null || !AnonymousClass8BW.A1Q(r5.bitField0_) || (r5.bitField0_ & 8) == 0) {
            return null;
        } else {
            C164998aQ r0 = r5.muteAction_;
            C164998aQ r6 = r0;
            if (r0 == null) {
                r0 = C164998aQ.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 1) == 0) {
                return null;
            }
            C164998aQ r02 = r6;
            if (r6 == null) {
                r02 = C164998aQ.DEFAULT_INSTANCE;
            }
            boolean z2 = r02.muted_;
            C19999A2n a2n = a6u2.A02;
            C164998aQ r03 = r6;
            if (r6 == null) {
                r03 = C164998aQ.DEFAULT_INSTANCE;
            }
            if (r03.muted_) {
                C164998aQ r04 = r6;
                if (r6 == null) {
                    r04 = C164998aQ.DEFAULT_INSTANCE;
                }
                if ((r04.bitField0_ & 2) != 0) {
                    C164998aQ r05 = r6;
                    if (r6 == null) {
                        r05 = C164998aQ.DEFAULT_INSTANCE;
                    }
                    long j2 = r05.muteEndTimestamp_;
                    if (j2 >= 0 || j2 == -1) {
                        if (r6 == null) {
                            r6 = C164998aQ.DEFAULT_INSTANCE;
                        }
                        j = r6.muteEndTimestamp_;
                        return new C170458pt(a2n, A02, str, j, r5.timestamp_, z2, z);
                    }
                }
            }
            j = 0;
            return new C170458pt(a2n, A02, str, j, r5.timestamp_, z2, z);
        }
    }

    public boolean A0J() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169678mi(C26371Rw r2, AnonymousClass1S4 r3, AnonymousClass11P r4, AnonymousClass1CJ r5, C26331Rs r6, C218217n r7) {
        super(r2, r3, r5, r6);
        C18070vi.A0w(r5, r2, r3, r6, r4);
        C18070vi.A0d(r7, 6);
        this.A00 = r4;
        this.A01 = r7;
    }

    public String A0D() {
        return "regular_high";
    }

    public String A0E() {
        return "mute";
    }

    public List A0F(boolean z) {
        Cursor A002;
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass1Nb r8 = this.A01.A04;
        HashMap A11 = C17880vN.A11();
        C28781at A05 = r8.A0U().get();
        try {
            A002 = C23141Ev.A00(((C28801av) A05).A02, "SELECT jid, mute_end FROM settings WHERE mute_end IS NOT NULL", "GET_MUTED_CHAT_JID_WITH_END_TIME");
            int columnIndex = A002.getColumnIndex("jid");
            int columnIndex2 = A002.getColumnIndex("mute_end");
            while (A002.moveToNext()) {
                AnonymousClass1BI A0l = AnonymousClass3MX.A0l(A002.getString(columnIndex));
                if (A0l != null) {
                    A11.put(A0l, C17890vO.A0M(A002, columnIndex2));
                }
            }
            A002.close();
            A05.close();
            LinkedHashMap A03 = ((AnonymousClass1NG) r8.A0K.get()).A03(A11.keySet());
            HashSet hashSet = new HashSet(A03.size());
            Iterator A15 = AnonymousClass000.A15(A03);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                C17880vN.A1K(A16.getValue(), A11.get(A16.getKey()), hashSet);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                AnonymousClass1BI r9 = (AnonymousClass1BI) pair.first;
                Number number = (Number) pair.second;
                AnonymousClass11P r5 = this.A00;
                long currentTimeMillis = System.currentTimeMillis();
                C18070vi.A0b(number);
                long longValue = number.longValue();
                if (longValue > currentTimeMillis || longValue == -1) {
                    C18070vi.A0b(r9);
                    long A012 = AnonymousClass11P.A01(r5);
                    C18070vi.A0d(r9, 1);
                    A13.add(new C170458pt((C19999A2n) null, r9, (String) null, longValue, A012, true, false));
                }
            }
            return A13;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }
}
