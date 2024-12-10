package X;

import android.database.Cursor;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1T7  reason: invalid class name */
public class AnonymousClass1T7 {
    public final AnonymousClass1M9 A00;
    public final C25111Mx A01;
    public final AnonymousClass1Q8 A02;
    public final C26001Ql A03;
    public final AnonymousClass00H A04;
    public final HashSet A05 = new HashSet();
    public final HashSet A06 = new HashSet();
    public final AnonymousClass1CJ A07;
    public final AnonymousClass1MZ A08;
    public final AnonymousClass12B A09;
    public final C24751Ln A0A;
    public final C18030ve A0B;
    public final AnonymousClass00H A0C;

    public boolean A06(C195629te r8, C45662Ay r9, AnonymousClass206 r10) {
        AnonymousClass8X1 r5;
        AnonymousClass1E7 A0E;
        if (r10 == null) {
            return false;
        }
        try {
            if (r8.A03 || !C22971Dz.A0M(r10.A0H())) {
                AnonymousClass1BI r1 = r10.A0v.A00;
                if (r1 != null && !r8.A05) {
                    C36321nh r0 = GroupJid.Companion;
                    GroupJid A002 = C36321nh.A00(r1);
                    if (A002 != null && (A0E = this.A00.A0E(A002)) != null && A0E.A03 == 1 && !AnonymousClass25A.A0r(r10)) {
                        r5 = (AnonymousClass8X1) C166388co.DEFAULT_INSTANCE.A0N();
                        r5.A0I(C179859Ke.A1q);
                        AnonymousClass00H r4 = ((C192859p6) this.A0C.get()).A03;
                        r4.get();
                        r5.A0H(r10.A0I / 1000);
                        r4.get();
                        C20106A7k.A03(r5, r10);
                        r4.get();
                        C20106A7k.A04(r5, r10);
                    }
                }
                r5 = ((C192859p6) this.A0C.get()).A00(r8, r10);
            } else {
                r5 = (AnonymousClass8X1) C166388co.DEFAULT_INSTANCE.A0N();
                r5.A0I(C179859Ke.A38);
                AnonymousClass00H r42 = ((C192859p6) this.A0C.get()).A03;
                r42.get();
                r5.A0H(r10.A0I / 1000);
                r42.get();
                C20106A7k.A03(r5, r10);
            }
            C23624Bmt A0N = C164658Zr.DEFAULT_INSTANCE.A0N();
            A0N.A0E();
            C164658Zr r12 = (C164658Zr) A0N.A00;
            C166388co r02 = (C166388co) r5.A0C();
            r02.getClass();
            r12.message_ = r02;
            r12.bitField0_ |= 1;
            long j = r10.A0x;
            A0N.A0E();
            C164658Zr r13 = (C164658Zr) A0N.A00;
            r13.bitField0_ |= 2;
            r13.msgOrderId_ = j;
            C23577Bm6 A0C2 = A0N.A0C();
            r9.A0E();
            C166298cf r2 = (C166298cf) r9.A00;
            C166298cf r03 = C166298cf.DEFAULT_INSTANCE;
            A0C2.getClass();
            EE9 ee9 = r2.messages_;
            if (!((C27296DbR) ee9).A00) {
                ee9 = C23577Bm6.A09(ee9);
                r2.messages_ = ee9;
            }
            ee9.add(A0C2);
            return true;
        } catch (AnonymousClass1T8 e) {
            Log.e("HistorySyncUtils/addMessage/invalid message", e);
            return false;
        }
    }

    public static void A00(AnonymousClass206 r1) {
        if ((r1 instanceof AnonymousClass215) && (r1 instanceof AnonymousClass21V)) {
            AnonymousClass21V r12 = (AnonymousClass21V) r1;
            r12.A07 = "";
            r12.A04 = "";
        }
    }

    public C45662Ay A01(AnonymousClass1BI r12, Map map, Map map2) {
        int i;
        Long l;
        C45662Ay r8 = (C45662Ay) C166298cf.DEFAULT_INSTANCE.A0N();
        C17960vV.A07(r12);
        String rawString = r12.getRawString();
        r8.A0E();
        C166298cf r1 = (C166298cf) r8.A00;
        rawString.getClass();
        r1.bitField0_ |= 1;
        r1.id_ = rawString;
        AnonymousClass1CJ r7 = this.A07;
        C29691ci A002 = AnonymousClass1CJ.A00(r7, r12);
        if (A002 != null) {
            if (A002.A0A() != null) {
                String A0A2 = A002.A0A();
                C166298cf r13 = (C166298cf) C17880vN.A0G(r8);
                A0A2.getClass();
                r13.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                r13.name_ = A0A2;
            }
            synchronized (A002) {
                i = A002.A06;
            }
            boolean z = true;
            boolean z2 = false;
            if (i == 1) {
                z2 = true;
            }
            r8.A0E();
            C166298cf r14 = (C166298cf) r8.A00;
            r14.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            r14.notSpam_ = z2;
            boolean z3 = A002.A0l;
            r8.A0E();
            C166298cf r15 = (C166298cf) r8.A00;
            r15.bitField0_ |= 16384;
            r15.archived_ = z3;
            long max = Math.max(A002.A05() / 1000, 0);
            r8.A0E();
            C166298cf r10 = (C166298cf) r8.A00;
            r10.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r10.conversationTimestamp_ = max;
            int max2 = Math.max(A002.A0e.expiration, 0);
            r8.A0E();
            C166298cf r16 = (C166298cf) r8.A00;
            r16.bitField0_ |= 128;
            r16.ephemeralExpiration_ = max2;
            long max3 = Math.max(A002.A0e.ephemeralSettingTimestamp, 0);
            r8.A0E();
            C166298cf r3 = (C166298cf) r8.A00;
            r3.bitField0_ |= 256;
            r3.ephemeralSettingTimestamp_ = max3;
            int max4 = Math.max(A002.A0A, 0);
            r8.A0E();
            C166298cf r17 = (C166298cf) r8.A00;
            r17.bitField0_ |= 16;
            r17.unreadCount_ = max4;
            boolean z4 = false;
            if (A002.A0A == -1) {
                z4 = true;
            }
            r8.A0E();
            C166298cf r2 = (C166298cf) r8.A00;
            r2.bitField0_ |= A7Y.A0F;
            r2.markedAsUnread_ = z4;
            boolean A0Q = r7.A0Q(r12);
            r8.A0E();
            C166298cf r18 = (C166298cf) r8.A00;
            r18.bitField0_ |= 32;
            r18.readOnly_ = A0Q;
            int A022 = r7.A02(r12);
            r8.A0E();
            C166298cf r22 = (C166298cf) r8.A00;
            r22.bitField0_ |= 65536;
            r22.unreadMentionCount_ = A022;
            if (r12 instanceof GroupJid) {
                AnonymousClass1E7 A0H = this.A00.A0H(r12);
                boolean z5 = A0H.A0t;
                r8.A0E();
                C166298cf r23 = (C166298cf) r8.A00;
                r23.bitField0_ |= 67108864;
                r23.suspended_ = z5;
                if (A0H.A0O != "lid") {
                    z = false;
                }
                String A072 = this.A08.A07((AnonymousClass1E9) r12, z);
                C166298cf r19 = (C166298cf) C17880vN.A0G(r8);
                A072.getClass();
                r19.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                r19.pHash_ = A072;
            } else {
                C58962lX r5 = (C58962lX) map.get(r12);
                if (r5 != null) {
                    byte[] bArr = r5.A01;
                    C23581BmB A012 = DSQ.A01(bArr, 0, bArr.length);
                    r8.A0E();
                    C166298cf r24 = (C166298cf) r8.A00;
                    r24.bitField0_ |= 262144;
                    r24.tcToken_ = A012;
                    long j = r5.A00;
                    r8.A0E();
                    C166298cf r4 = (C166298cf) r8.A00;
                    r4.bitField0_ |= 524288;
                    r4.tcTokenTimestamp_ = j;
                }
                C53122c1 r0 = (C53122c1) map2.get(r12);
                if (!(r0 == null || (l = r0.A01) == null)) {
                    long longValue = l.longValue();
                    r8.A0E();
                    C166298cf r25 = (C166298cf) r8.A00;
                    r25.bitField0_ |= 33554432;
                    r25.tcTokenSenderTimestamp_ = longValue;
                    return r8;
                }
            }
        }
        return r8;
    }

    public ArrayList A02(Set set) {
        List A0I;
        PhoneUserJid phoneUserJid;
        if (!C18020vd.A05(C18040vf.A02, this.A0B, 7392)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        C24751Ln r6 = this.A0A;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (userJid instanceof AnonymousClass1E1) {
                PhoneUserJid A0D = r6.A0D((AnonymousClass1E1) userJid);
                if (A0D != null && !linkedHashMap.containsKey(A0D)) {
                    A0I = r6.A0I(A0D);
                    phoneUserJid = A0D;
                }
            } else if ((userJid instanceof PhoneUserJid) && !linkedHashMap.containsKey(userJid)) {
                A0I = r6.A0I((PhoneUserJid) userJid);
                phoneUserJid = userJid;
                if (!(!A0I.isEmpty())) {
                }
            }
            linkedHashMap.put(phoneUserJid, A0I);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            for (Jid jid : (List) entry.getValue()) {
                if (jid instanceof AnonymousClass1E2) {
                    C23624Bmt A0N = AnonymousClass8ZP.DEFAULT_INSTANCE.A0N();
                    String rawString = ((Jid) entry.getKey()).getRawString();
                    A0N.A0E();
                    AnonymousClass8ZP r1 = (AnonymousClass8ZP) A0N.A00;
                    rawString.getClass();
                    r1.bitField0_ |= 1;
                    r1.pnJid_ = rawString;
                    String rawString2 = jid.getRawString();
                    A0N.A0E();
                    AnonymousClass8ZP r12 = (AnonymousClass8ZP) A0N.A00;
                    rawString2.getClass();
                    r12.bitField0_ |= 2;
                    r12.lidJid_ = rawString2;
                    arrayList.add(A0N.A0C());
                }
            }
        }
        return arrayList;
    }

    public LinkedHashMap A03(Cursor cursor, C195629te r12, List list, long j) {
        HashSet hashSet;
        int i;
        AnonymousClass1E7 A0E;
        C25111Mx r1 = this.A01;
        HashMap A0I = r1.A01.A0I();
        HashMap A082 = r1.A08();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet2 = new HashSet();
        while (cursor.moveToNext()) {
            AnonymousClass206 A012 = ((AnonymousClass1W6) this.A04.get()).A01(cursor);
            if (A012 != null) {
                A05(A012, hashSet2);
                AnonymousClass1Q8 r0 = this.A02;
                AnonymousClass205 r8 = A012.A0v;
                r0.A01(r8);
                if (A012.A0I < j) {
                    break;
                }
                AnonymousClass1BI r7 = r8.A00;
                if (r7 != null && !(A012 instanceof AnonymousClass22M) && !(A012 instanceof C439821r)) {
                    A00(A012);
                    if ((r12.A04 || !C42701yb.A01(r7)) && (r12.A03 || !C22971Dz.A0M(r7))) {
                        if (!r12.A05) {
                            C36321nh r02 = GroupJid.Companion;
                            GroupJid A002 = C36321nh.A00(r7);
                            if (!(A002 == null || (A0E = this.A00.A0E(A002)) == null || A0E.A03 != 1)) {
                            }
                        }
                        C45662Ay r82 = (C45662Ay) linkedHashMap.get(r7);
                        if (r82 == null) {
                            r82 = A01(r7, A0I, A082);
                            linkedHashMap.put(r7, r82);
                        }
                        boolean A062 = A06(r12, r82, A012);
                        int i2 = r12.A00;
                        if (i2 > 0) {
                            Iterator it = this.A03.A01(Collections.singletonList(A012), i2).iterator();
                            while (it.hasNext()) {
                                A06(r12, r82, (AnonymousClass206) it.next());
                            }
                        }
                        if (!A062) {
                            if (A012 instanceof C436420i) {
                                hashSet = this.A05;
                                i = ((C436420i) A012).A00;
                            } else {
                                hashSet = this.A06;
                                i = A012.A0u;
                            }
                            hashSet.add(Integer.valueOf(i));
                        }
                    }
                }
            }
        }
        list.addAll(A02(hashSet2));
        return linkedHashMap;
    }

    public void A04(AnonymousClass1E9 r8, C45662Ay r9) {
        C63312sr A0D;
        AnonymousClass9K1 r0;
        C63872tp A0C2 = this.A08.A08.A0C(r8);
        AnonymousClass1IZ it = A0C2.A0C().iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (!(userJid == null || (A0D = A0C2.A0D(userJid, false)) == null)) {
                C23624Bmt A0N = C164648Zq.DEFAULT_INSTANCE.A0N();
                String rawString = A0D.A04.getRawString();
                A0N.A0E();
                C164648Zq r1 = (C164648Zq) A0N.A00;
                rawString.getClass();
                r1.bitField0_ |= 1;
                r1.userJid_ = rawString;
                int i = A0D.A01;
                if (i != 0) {
                    if (i == 1) {
                        r0 = AnonymousClass9K1.ADMIN;
                    } else if (i != 2) {
                        r0 = null;
                    } else {
                        r0 = AnonymousClass9K1.SUPERADMIN;
                    }
                    A0N.A0E();
                    C164648Zq r12 = (C164648Zq) A0N.A00;
                    r12.rank_ = r0.value;
                    r12.bitField0_ |= 2;
                }
                r9.A0E();
                C166298cf r3 = (C166298cf) r9.A00;
                C23577Bm6 A0C3 = A0N.A0C();
                C166298cf r02 = C166298cf.DEFAULT_INSTANCE;
                A0C3.getClass();
                EE9 ee9 = r3.participant_;
                if (!((C27296DbR) ee9).A00) {
                    ee9 = C23577Bm6.A09(ee9);
                    r3.participant_ = ee9;
                }
                ee9.add(A0C3);
            }
        }
    }

    public void A05(AnonymousClass206 r4, Set set) {
        if (!C18020vd.A05(C18040vf.A02, this.A0B, 7392)) {
            return;
        }
        if (r4 instanceof C48392Mh) {
            List A0T = r4.A0T();
            if (A0T != null) {
                set.addAll(A0T);
                return;
            }
            return;
        }
        if (r4.A0I() != null) {
            set.add(r4.A0I());
        }
        List<C70503Bi> list = r4.A0h;
        if (list != null) {
            for (C70503Bi r0 : list) {
                AnonymousClass1BI r1 = r0.A00;
                if (C22971Dz.A0d(r1)) {
                    set.add(r1);
                }
            }
        }
    }

    public AnonymousClass1T7(AnonymousClass1M9 r2, C25111Mx r3, AnonymousClass1Q8 r4, AnonymousClass1CJ r5, AnonymousClass1MZ r6, AnonymousClass12B r7, C26001Ql r8, C24751Ln r9, C18030ve r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        this.A0B = r10;
        this.A07 = r5;
        this.A00 = r2;
        this.A0A = r9;
        this.A04 = r11;
        this.A02 = r4;
        this.A03 = r8;
        this.A01 = r3;
        this.A0C = r12;
        this.A08 = r6;
        this.A09 = r7;
    }
}
