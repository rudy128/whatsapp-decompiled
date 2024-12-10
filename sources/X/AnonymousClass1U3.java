package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Random;

/* renamed from: X.1U3  reason: invalid class name */
public class AnonymousClass1U3 {
    public final AnonymousClass11P A00;
    public final C19830z4 A01;
    public final AnonymousClass1RK A02;
    public final AnonymousClass190 A03;
    public final AnonymousClass1P3 A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;

    public static C53272cG A00(AnonymousClass1U3 r4) {
        AnonymousClass1P3 r3 = r4.A04;
        if (r3.A0Y()) {
            return r3.A01.A03();
        }
        return (C53272cG) ((C25581Ot) r4.A06.get()).A00.submit(new C21490Akz(r3, 4)).get();
    }

    public long A01() {
        long j = ((SharedPreferences) this.A01.A00.get()).getLong("adv_timestamp_sec", -1);
        AnonymousClass11P r2 = this.A00;
        long A07 = r2.A07() / 1000;
        long A052 = r2.A05() / 1000;
        long j2 = 1 + j;
        if (j2 > A07 + 86400) {
            StringBuilder sb = new StringBuilder();
            sb.append("CompanionDeviceAdvUtil/getTimestampSec invalid ts lastTs=");
            sb.append(j);
            sb.append("; ntpTs=");
            sb.append(A07);
            sb.append("; serverTs=");
            sb.append(A052);
            Log.e(sb.toString());
            return -1;
        }
        if (Math.abs(A052 - A07) <= 86400) {
            A07 = A052;
        }
        return Math.max(A07, j2);
    }

    public AnonymousClass2BR A02(AnonymousClass2RD r6, int i, int i2, long j) {
        int A022;
        AnonymousClass1RK r1 = this.A02;
        HashSet hashSet = new HashSet();
        if (!r1.A09.A0N()) {
            A022 = 0;
        } else {
            A022 = r1.A0E.A02();
        }
        hashSet.add(Integer.valueOf(A022));
        AnonymousClass1IZ it = r1.A0H.A04().values().iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((C88344Zh) it.next()).A05));
        }
        if (i == -1) {
            AnonymousClass190 r3 = this.A03;
            StringBuilder sb = new StringBuilder();
            sb.append("currentIndex=");
            sb.append(i2);
            sb.append("; timestampSec=");
            sb.append(j);
            r3.A0G("invalid_rawId_key_index_list", sb.toString(), true);
        }
        hashSet.add(Integer.valueOf(i2));
        C23624Bmt A0N = AnonymousClass2BR.DEFAULT_INSTANCE.A0N();
        A0N.A0E();
        AnonymousClass2BR r12 = (AnonymousClass2BR) A0N.A00;
        r12.bitField0_ |= 1;
        r12.rawId_ = i;
        A0N.A0E();
        AnonymousClass2BR r13 = (AnonymousClass2BR) A0N.A00;
        r13.bitField0_ |= 4;
        r13.currentIndex_ = i2;
        A0N.A0E();
        AnonymousClass2BR r14 = (AnonymousClass2BR) A0N.A00;
        r14.bitField0_ |= 2;
        r14.timestamp_ = j;
        A0N.A0E();
        AnonymousClass2BR r2 = (AnonymousClass2BR) A0N.A00;
        C28667EDj eDj = r2.validIndexes_;
        boolean z = ((C27296DbR) eDj).A00;
        Bm7 bm7 = eDj;
        if (!z) {
            Bm7 A08 = C23577Bm6.A08(eDj);
            r2.validIndexes_ = A08;
            bm7 = A08;
        }
        DND.A09(hashSet, bm7);
        A0N.A0E();
        AnonymousClass2BR r15 = (AnonymousClass2BR) A0N.A00;
        r15.accountType_ = r6.value;
        r15.bitField0_ |= 8;
        return (AnonymousClass2BR) A0N.A0C();
    }

    public void A04() {
        C19830z4.A00(this.A01).putLong("adv_timestamp_sec", -1).apply();
        this.A05.CGF(new C98764rg((Object) this, 18));
    }

    public void A05() {
        int abs = Math.abs(new Random().nextInt());
        if (abs == 0) {
            abs = 1;
        }
        C19830z4 r3 = this.A01;
        C19830z4.A00(r3).putInt("adv_raw_id", abs).apply();
        C19830z4.A00(r3).putInt("adv_current_key_index", 1).apply();
    }

    public void A06(long j) {
        C19830z4 r4 = this.A01;
        C19830z4.A00(r4).remove("adv_key_index_list_update_retry_count").apply();
        C19830z4.A00(r4).remove("adv_key_index_list_last_failure_time").apply();
        C19830z4.A00(r4).putLong("adv_key_index_list_last_update_time", AnonymousClass11P.A01(this.A00)).apply();
        C19830z4.A00(r4).remove("adv_key_index_list_require_update").apply();
        if (j > 0) {
            C19830z4.A00(r4).putLong("adv_timestamp_sec", j).apply();
        }
    }

    public AnonymousClass1U3(AnonymousClass190 r1, AnonymousClass11P r2, C19830z4 r3, AnonymousClass1P3 r4, AnonymousClass1RK r5, AnonymousClass10I r6, AnonymousClass00H r7) {
        this.A00 = r2;
        this.A03 = r1;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r4;
        this.A01 = r3;
        this.A02 = r5;
    }

    public AnonymousClass2BB A03(AnonymousClass2BR r8) {
        C53272cG A002 = A00(this);
        C17960vV.A07(A002);
        C58242kN r5 = A002.A00;
        byte[] A052 = A8G.A05(C19620yd.A0I, r8.A0M());
        C23624Bmt A0N = AnonymousClass2BB.DEFAULT_INSTANCE.A0N();
        AnonymousClass2RD A003 = AnonymousClass2RD.A00(r8.accountType_);
        if (A003 == null) {
            A003 = AnonymousClass2RD.E2EE;
        }
        if (A003 == AnonymousClass2RD.HOSTED) {
            byte[] bArr = A002.A01.A00.A00;
            C23581BmB A012 = DSQ.A01(bArr, 0, bArr.length);
            A0N.A0E();
            AnonymousClass2BB r1 = (AnonymousClass2BB) A0N.A00;
            r1.bitField0_ |= 4;
            r1.accountSignatureKey_ = A012;
        }
        byte[] A09 = C63962tz.A09(r5, A052);
        C23581BmB A013 = DSQ.A01(A09, 0, A09.length);
        A0N.A0E();
        AnonymousClass2BB r12 = (AnonymousClass2BB) A0N.A00;
        r12.bitField0_ |= 2;
        r12.accountSignature_ = A013;
        C23581BmB A0K = r8.A0K();
        A0N.A0E();
        AnonymousClass2BB r13 = (AnonymousClass2BB) A0N.A00;
        r13.bitField0_ |= 1;
        r13.details_ = A0K;
        return (AnonymousClass2BB) A0N.A0C();
    }
}
