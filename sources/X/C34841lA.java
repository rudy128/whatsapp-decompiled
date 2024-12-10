package X;

import com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker;
import com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1lA  reason: invalid class name and case insensitive filesystem */
public final class C34841lA {
    public final AnonymousClass11S A00;
    public final C25001Mm A01;
    public final C26681Tb A02;
    public final C34851lB A03 = new Object();
    public final C26811To A04;
    public final AnonymousClass11Q A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass118 A07;
    public final C22621Co A08;
    public final C34821l8 A09;
    public final AnonymousClass1N9 A0A;
    public final AnonymousClass10I A0B;
    public final Map A0C = new HashMap();
    public final AnonymousClass19K A0D;

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.1lB] */
    public C34841lA(AnonymousClass11S r2, C25001Mm r3, C26681Tb r4, C26811To r5, AnonymousClass11Q r6, AnonymousClass11P r7, AnonymousClass118 r8, C22621Co r9, C34821l8 r10, AnonymousClass1N9 r11, AnonymousClass10I r12, AnonymousClass19K r13) {
        C18070vi.A0d(r7, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r8, 3);
        C18070vi.A0d(r12, 4);
        C18070vi.A0d(r9, 5);
        C18070vi.A0d(r5, 6);
        C18070vi.A0d(r3, 7);
        C18070vi.A0d(r11, 8);
        C18070vi.A0d(r13, 9);
        C18070vi.A0d(r4, 10);
        C18070vi.A0d(r10, 11);
        C18070vi.A0d(r6, 12);
        this.A06 = r7;
        this.A00 = r2;
        this.A07 = r8;
        this.A0B = r12;
        this.A08 = r9;
        this.A04 = r5;
        this.A01 = r3;
        this.A0A = r11;
        this.A0D = r13;
        this.A02 = r4;
        this.A09 = r10;
        this.A05 = r6;
    }

    public static final JSONObject A00(int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sync_type", i);
            jSONObject.put("chunk_order", i2);
            return jSONObject;
        } catch (JSONException unused) {
            Log.e("ReceiveHistorySyncManager/ Could not update history sync companion state");
            return null;
        }
    }

    public final void A01(AnonymousClass23J r5) {
        if (this.A09.A02() != null) {
            Integer num = AnonymousClass00R.A01;
            C196269uj r1 = new C196269uj(HistorySyncCompanionWorker.class);
            r1.A05(AnonymousClass00R.A00);
            ((A7W) this.A0D.get()).A07((C162248Jv) r1.A00(), num, "com.whatsapp.sync.historySyncCompanion");
        } else if (r5 != null) {
            this.A0A.A08(r5);
        }
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.23J, X.206] */
    public final void A02(C56152gz r12, Exception exc, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("ReceiveHistorySyncManager/ failed to process syncType=");
        int i = r12.A01;
        sb.append(i);
        sb.append(" chunkOrder=");
        int i2 = r12.A00;
        sb.append(i2);
        Log.e(sb.toString());
        Map map = this.A0C;
        String str = r12.A09;
        Number number = (Number) map.remove(str);
        if (z) {
            if (number == null) {
                number = 0L;
            }
            long longValue = number.longValue();
            AnonymousClass11S r0 = this.A00;
            r0.A0I();
            ? r8 = new AnonymousClass206(new AnonymousClass205(r0.A0E, str, true), 35, 1);
            if (longValue > 0) {
                r8.A10 = longValue;
            }
            byte[] bArr = r12.A0B;
            if (bArr != null) {
                r8.A0L = bArr;
            }
            byte[] bArr2 = r8.A0L;
            if (bArr2 == null) {
                Log.e("ReceiveHistorySyncManager/ missing media key");
            } else {
                this.A01.A01(new SendMediaErrorReceiptJob((AnonymousClass1BI) null, r8, "peer", bArr2));
            }
        } else {
            AnonymousClass11Q.A01(this.A05).edit().putBoolean("HAS_COMPANION_HISTORY_SYNC_FAILED", true).apply();
            C34851lB r2 = this.A03;
            synchronized (r2) {
                C51762Zn r02 = r2.A00;
                if (r02 != null) {
                    r02.A00.A0B(new C116825yg(exc));
                }
            }
        }
        C26681Tb r82 = this.A02;
        long j = r12.A02;
        long j2 = r12.A03;
        AnonymousClass2H2 r7 = new AnonymousClass2H2();
        r7.A02 = 2;
        r7.A0A = C26681Tb.A00(r82);
        r7.A00 = C26371Rw.A01(i);
        r7.A01 = C26371Rw.A00(i);
        long A012 = AnonymousClass11P.A01(r82.A01);
        r7.A09 = Long.valueOf(A012);
        r7.A06 = Long.valueOf(A012 - j2);
        r7.A05 = Long.valueOf(j);
        AnonymousClass00H r1 = r82.A03;
        long A042 = ((AnonymousClass11Z) r1.get()).A04();
        r7.A07 = Long.valueOf(A042);
        r7.A08 = Long.valueOf(A042 - ((AnonymousClass11Z) r1.get()).A02());
        r7.A03 = Long.valueOf((long) i2);
        r82.A02.CC7(r7);
        this.A09.A03(str);
    }
}
