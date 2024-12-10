package X;

import com.whatsapp.ml.v2.MLModelManagerV2$1;
import com.whatsapp.ml.v2.MLModelManagerV2$enqueueConditional$1;
import com.whatsapp.ml.v2.MLModelManagerV2$enqueueDownload$1;
import com.whatsapp.ml.v2.MLModelUtilV2;
import com.whatsapp.ml.v2.repo.MLModelRepository;
import com.whatsapp.ml.v2.worker.MLModelCleanUpWorkerV2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.73b  reason: invalid class name and case insensitive filesystem */
public final class C1407873b {
    public final AnonymousClass118 A00;
    public final C131606lN A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18100vl A05 = AnonymousClass1DF.A01(AnonymousClass7x6.A00);
    public final C18100vl A06 = AnonymousClass1DF.A01(new C152357nm(this));
    public final C18600wl A07;
    public final AnonymousClass1OX A08;
    public final AnonymousClass00H A09;

    public static final void A02(C162248Jv r5, C1407873b r6, AnonymousClass8AS r7, String str) {
        AnonymousClass3MX.A1Q(new MLModelManagerV2$enqueueConditional$1(r5, r6, r7, str, (C30391dr) null), AnonymousClass1OW.A02(r6.A07));
    }

    public final String A04(C122716Rq r5) {
        AnonymousClass708 BV1 = this.A01.A00(r5, false).BV1();
        C18070vi.A0d(BV1, 0);
        File A17 = C108945cZ.A17(((MLModelUtilV2) this.A03.get()).A03(BV1));
        if (A17.exists()) {
            return A17.getPath();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C23421Fz A05(X.C122716Rq r21) {
        /*
            r20 = this;
            r8 = 0
            r14 = 0
            r7 = r20
            X.6lN r0 = r7.A01
            r1 = r21
            X.8Ak r2 = r0.A00(r1, r14)
            X.708 r10 = r2.BV1()
            X.00H r0 = r7.A03
            r0.get()
            java.lang.String r6 = com.whatsapp.ml.v2.MLModelUtilV2.A00(r10)
            X.0vl r0 = r7.A05
            java.util.Map r5 = X.AnonymousClass3MW.A12(r0)
            java.lang.Object r0 = r5.get(r6)
            if (r0 != 0) goto L_0x0103
            X.00H r0 = r7.A02
            java.lang.Object r3 = r0.get()
            com.whatsapp.ml.v2.repo.MLModelRepository r3 = (com.whatsapp.ml.v2.repo.MLModelRepository) r3
            X.C18070vi.A0d(r10, r14)
            X.0vl r0 = r3.A02
            java.util.Map r1 = X.AnonymousClass3MW.A12(r0)
            java.lang.String r0 = com.whatsapp.ml.v2.repo.MLModelRepository.A01(r10)
            java.lang.String r0 = X.C17880vN.A0s(r0, r1)
            if (r0 != 0) goto L_0x005a
            X.6qX r0 = r3.A01
            java.lang.String r1 = com.whatsapp.ml.v2.repo.MLModelRepository.A01(r10)
            X.C18070vi.A0d(r1, r14)
            X.6eW r0 = r0.A00
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r0)
            java.lang.String r0 = r0.getString(r1, r8)
            if (r0 == 0) goto L_0x0106
            r3.A04(r10, r0)
        L_0x005a:
            X.6TT r9 = X.C137336vI.A00(r0)
            X.0vl r0 = r7.A06
            java.lang.Object r1 = r0.getValue()
            X.A7W r1 = (X.A7W) r1
            androidx.work.impl.WorkDatabase r0 = r1.A04
            X.BD8 r13 = r0.A0E()
            X.3Kb r0 = r1.A06
            X.AHx r0 = (X.C20367AHx) r0
            X.0wl r3 = r0.A03
            boolean r4 = X.C18070vi.A17(r13, r3)
            r1 = 2
            X.C18070vi.A0d(r6, r1)
            X.AHv r13 = (X.C20365AHv) r13
            java.lang.String r11 = "SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            java.util.TreeMap r0 = X.AHX.A08
            X.AHX r12 = X.A3D.A01(r11, r4)
            r12.BDB(r4, r6)
            X.A6c r15 = r13.A02
            r0 = 4
            java.lang.String[] r11 = new java.lang.String[r0]
            java.lang.String r0 = "WorkTag"
            r11[r14] = r0
            java.lang.String r0 = "WorkProgress"
            r11[r4] = r0
            java.lang.String r0 = "workspec"
            r11[r1] = r0
            r1 = 3
            java.lang.String r0 = "workname"
            r11[r1] = r0
            X.Al8 r0 = new X.Al8
            r0.<init>(r12, r13, r4)
            androidx.room.CoroutinesRoom$Companion$createFlow$1 r14 = new androidx.room.CoroutinesRoom$Companion$createFlow$1
            r19 = r4
            r18 = r11
            r17 = r8
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            X.Du4 r1 = new X.Du4
            r1.<init>(r14)
            X.7Se r0 = new X.7Se
            r0.<init>(r1, r4)
            X.1Fz r0 = X.C26092CsA.A02(r0)
            X.1Fz r3 = X.AnonymousClass4I5.A00(r3, r0)
            X.C18070vi.A0X(r3)
            r1 = 4
            X.7Se r0 = new X.7Se
            r0.<init>(r3, r1)
            X.7Sh r11 = new X.7Sh
            r14 = r10
            r15 = r2
            r16 = r0
            r12 = r9
            r13 = r7
            r11.<init>(r12, r13, r14, r15, r16)
            com.whatsapp.ml.v2.MLModelManagerV2$getFlow$1$3 r0 = new com.whatsapp.ml.v2.MLModelManagerV2$getFlow$1$3
            r0.<init>(r7, r10, r8)
            r3 = 10
            X.DXs r1 = new X.DXs
            r1.<init>((X.AnonymousClass1OS) r0, (X.C23421Fz) r11, (int) r3)
            com.whatsapp.ml.v2.MLModelManagerV2$getFlow$1$4 r0 = new com.whatsapp.ml.v2.MLModelManagerV2$getFlow$1$4
            r0.<init>(r9, r8)
            X.DXs r1 = X.AnonymousClass3MZ.A0L(r0, r1)
            com.whatsapp.ml.v2.MLModelManagerV2$getFlow$1$5 r0 = new com.whatsapp.ml.v2.MLModelManagerV2$getFlow$1$5
            r0.<init>(r2, r8)
            X.DXs r2 = new X.DXs
            r2.<init>((X.AnonymousClass1OS) r0, (X.C23421Fz) r1, (int) r3)
            X.0wl r0 = r7.A07
            X.1OY r1 = X.C108995ce.A0f(r0)
            X.5cA r0 = X.AnonymousClass4ZC.A00
            X.1Pi r0 = X.AnonymousClass4Z7.A00(r1, r2, r0, r4)
            r5.put(r6, r0)
        L_0x0103:
            X.1Fz r0 = (X.C23421Fz) r0
            return r0
        L_0x0106:
            r0 = 0
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407873b.A05(X.6Rq):X.1Fz");
    }

    public final void A06(C122716Rq r4) {
        A03(this, r4, false, false);
        AnonymousClass708 BV1 = this.A01.A00(r4, false).BV1();
        C196269uj r1 = new C196269uj(MLModelCleanUpWorkerV2.class);
        r1.A04(BV1.A00());
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r4.name());
        A02((C162248Jv) r1.A00(), this, (AnonymousClass8AS) null, AnonymousClass000.A0y("_feature_cleanup", A10));
    }

    public final boolean A08(C122716Rq r4) {
        return ((MLModelRepository) this.A02.get()).A06(this.A01.A00(r4, false).BV1());
    }

    public static final AnonymousClass6TT A00(AnonymousClass6TT r6, C1407873b r7, AnonymousClass708 r8, AnonymousClass8Ak r9) {
        C119946An r4 = C119946An.A00;
        if (C18070vi.A18(r6, r4)) {
            return r6;
        }
        AnonymousClass00H r72 = r7.A02;
        if (((MLModelRepository) r72.get()).A06(r8)) {
            return C119956Ao.A00;
        }
        ArrayList A032 = ((MLModelRepository) r72.get()).A03(r9.BV1().A02);
        if (!(A032 instanceof Collection) || !A032.isEmpty()) {
            Iterator it = A032.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = ((AnonymousClass708) it.next()).A06;
                String str2 = r8.A06;
                if (C18070vi.A18(str, str2)) {
                    List BMy = r9.BMy();
                    ArrayList A13 = AnonymousClass000.A13();
                    for (Object next : BMy) {
                        C108975cc.A13(((AnonymousClass708) next).A06, str2, next, A13);
                    }
                    ArrayList A033 = ((MLModelRepository) r72.get()).A03(r9.BV1().A02);
                    ArrayList<AnonymousClass708> A132 = AnonymousClass000.A13();
                    Iterator it2 = A033.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        AnonymousClass708 r1 = (AnonymousClass708) next2;
                        if (C18070vi.A18(r1.A06, str2) && !A13.contains(r1)) {
                            A132.add(next2);
                        }
                    }
                    MLModelRepository mLModelRepository = (MLModelRepository) r72.get();
                    for (AnonymousClass708 A052 : A132) {
                        C18070vi.A0b(mLModelRepository);
                        mLModelRepository.A05(A052, AnonymousClass7x8.A00);
                    }
                    if (AnonymousClass000.A1a(A132)) {
                        return r4;
                    }
                }
            }
        }
        return C119936Am.A00;
    }

    public static final AnonymousClass8AS A01(C1407873b r4, C122716Rq r5, AnonymousClass8Ak r6, String str, boolean z) {
        AnonymousClass8AS A002 = ((C132046m5) r4.A04.get()).A00("ML_DOWNLOADER_ENQUEUE_REQUEST", 721692980, r6.BV1().hashCode());
        A002.Bj0();
        A002.Bir("feature", r5.name());
        A002.Bir("unique_name", str);
        A002.Bis("is_silent_update", z);
        A002.Bis("is_enabled", r6.isEnabled());
        A002.Bir("network_type", AnonymousClass9OD.A00(r6.Bbr().A00));
        return A002;
    }

    public static final void A03(C1407873b r7, C122716Rq r8, boolean z, boolean z2) {
        AnonymousClass8Ak A002 = r7.A01.A00(r8, z);
        r7.A03.get();
        String A003 = MLModelUtilV2.A00(A002.BV1());
        AnonymousClass8AS A004 = ((C132046m5) r7.A04.get()).A00("ML_DOWNLOADER_CANCELED", 721690008, A002.BV1().hashCode());
        A004.Bj0();
        A004.Bir("feature", r8.name());
        A004.Bir("unique_name", A003);
        A004.Bis("is_silent_update", z);
        A004.Bis("canceled_by_user", z2);
        A004.Bis("is_enabled", A002.isEnabled());
        C18070vi.A0d(A003, 0);
        C127536eW r3 = ((C134406qX) r7.A09.get()).A00;
        String A0y = AnonymousClass000.A0y("_cancel", AnonymousClass000.A11(A003));
        C18070vi.A0d(A0y, 0);
        C17880vN.A1F(C17890vO.A0A(r3.A01), A0y, true);
        ((A7W) r7.A06.getValue()).A0A(A003);
        A004.Biu(2);
    }

    public final void A07(C122716Rq r5) {
        AnonymousClass3MW.A1X(this.A07, new MLModelManagerV2$enqueueDownload$1(this, r5, (C30391dr) null), this.A08);
    }

    public C1407873b(AnonymousClass118 r3, C131606lN r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, C18600wl r9, AnonymousClass1OX r10) {
        C18070vi.A0w(r3, r5, r4, r6, r10);
        C18070vi.A0q(r9, r7, r8);
        this.A00 = r3;
        this.A03 = r5;
        this.A01 = r4;
        this.A02 = r6;
        this.A08 = r10;
        this.A07 = r9;
        this.A09 = r7;
        this.A04 = r8;
        AnonymousClass3MW.A1X(r9, new MLModelManagerV2$1(this, (C30391dr) null), r10);
    }
}
