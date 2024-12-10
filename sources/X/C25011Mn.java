package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.whatsapp.util.Log;

/* renamed from: X.1Mn  reason: invalid class name and case insensitive filesystem */
public class C25011Mn {
    public final C25001Mm A00;
    public final AnonymousClass00H A01;
    public final C23651Hc A02;

    public void A00() {
        ((AnonymousClass1OZ) this.A01.get()).A0M(C63902ts.A01());
    }

    public void A01(AnonymousClass21V r5) {
        C62572rc r0;
        byte[] bArr;
        AnonymousClass205 r1 = r5.A0v;
        if (!r1.A02 && !C22971Dz.A0R(r1.A00) && (r0 = r5.A02) != null && (bArr = r0.A0a) != null) {
            C25001Mm r2 = this.A00;
            C17960vV.A07(r0);
            C17960vV.A07(bArr);
            r2.A01(new SendMediaErrorReceiptJob((AnonymousClass1BI) null, r5, (String) null, bArr));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (X.C22971Dz.A0V(r3) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.util.Set r10, boolean r11) {
        /*
            r9 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r8 = r10.iterator()
        L_0x0009:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r7 = r8.next()
            X.206 r7 = (X.AnonymousClass206) r7
            X.205 r6 = r7.A0v
            X.1BI r3 = r6.A00
            X.1BI r2 = r7.A0H()
            boolean r0 = r7 instanceof X.AnonymousClass212
            if (r0 != 0) goto L_0x0028
            boolean r1 = X.C22971Dz.A0V(r3)
            r0 = 0
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            X.2kt r5 = new X.2kt
            r5.<init>(r3, r2, r0)
            boolean r0 = r4.containsKey(r5)
            if (r0 == 0) goto L_0x004e
            java.lang.Object r3 = r4.get(r5)
            java.util.List r3 = (java.util.List) r3
            r3.getClass()
            long r0 = r7.A0x
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r6.A01
            X.2kk r0 = new X.2kk
            r0.<init>(r2, r1)
            r3.add(r0)
            goto L_0x0009
        L_0x004e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            long r0 = r7.A0x
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r6.A01
            X.2kk r0 = new X.2kk
            r0.<init>(r2, r1)
            r3.add(r0)
            r4.put(r5, r3)
            goto L_0x0009
        L_0x0067:
            java.util.HashSet r0 = X.C62842s5.A00(r4)
            java.util.Iterator r3 = r0.iterator()
        L_0x006f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r2 = r3.next()
            X.2jU r2 = (X.C57692jU) r2
            X.1Mm r1 = r9.A00
            com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2 r0 = new com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2
            r0.<init>(r2, r11)
            r1.A01(r0)
            goto L_0x006f
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25011Mn.A03(java.util.Set, boolean):void");
    }

    public boolean A05(AnonymousClass1BI r6, AnonymousClass1EC r7, byte[] bArr) {
        C23651Hc r1 = this.A02;
        if (!r1.A07 || !r1.A02()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("app/send-presence-subscription jid=");
        sb.append(r6);
        Log.i(sb.toString());
        AnonymousClass1OZ r4 = (AnonymousClass1OZ) this.A01.get();
        Message obtain = Message.obtain((Handler) null, 0, 12, 0, r6);
        if (bArr != null) {
            obtain.getData().putByteArray("tctoken", bArr);
        }
        if (r7 != null) {
            obtain.getData().putString("context", r7.getRawString());
        }
        r4.A0M(obtain);
        return true;
    }

    public boolean A06(String str, String str2) {
        return ((AnonymousClass1OZ) this.A01.get()).A0M(Message.obtain((Handler) null, 0, 36, 0, new C53592cm(str, str2)));
    }

    public C25011Mn(C25001Mm r1, C23651Hc r2, AnonymousClass00H r3) {
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
    }

    public void A02(String str, Long l) {
        Log.i("sendmethods/sendClearDirty");
        AnonymousClass1OZ r5 = (AnonymousClass1OZ) this.A01.get();
        Message obtain = Message.obtain((Handler) null, 0, 18, 0);
        obtain.getData().putString("category", str);
        if (l != null) {
            obtain.getData().putLong("timestamp", l.longValue());
        }
        r5.A0M(obtain);
    }

    public void A04(boolean z) {
        Log.i("sendmethods/sendGetServerProps");
        Bundle bundle = new Bundle();
        bundle.putBoolean("forceRefresh", z);
        ((AnonymousClass1OZ) this.A01.get()).A0M(Message.obtain((Handler) null, 0, 21, 0, bundle));
    }
}
