package com.whatsapp.infra.graphql;

import X.A2F;
import X.A6Z;
import X.AnonymousClass1IX;
import X.C172768tz;
import X.C172938uG;
import X.C172948uH;
import X.C18070vi;
import X.C191019lt;
import X.C20125A8k;
import X.C22941Dw;
import X.C29351c6;
import X.C33051iB;
import X.C33061iC;
import X.C33071iE;
import X.C53892dG;
import X.C58902lR;
import X.C59192lu;
import com.whatsapp.infra.graphql.generated.bizquality.HasBusinessIntentResponseImpl;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

public abstract class BaseMexCallback implements C33051iB, C33061iC {
    public A2F A00;
    public C191019lt A01;
    public Long A02;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.A6Z r11, boolean r12) {
        /*
            r10 = this;
            r2 = 0
            X.A2F r7 = r10.A00
            if (r7 == 0) goto L_0x0071
            X.9lt r0 = r10.A01
            if (r0 == 0) goto L_0x000e
            X.00H r0 = r0.A03
            r0.get()
        L_0x000e:
            X.9lt r6 = r10.A01
            if (r6 == 0) goto L_0x0071
            java.lang.Long r8 = r10.A02
            X.11P r0 = r6.A00
            long r0 = X.AnonymousClass11P.A01(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            X.2Gw r3 = new X.2Gw
            r3.<init>()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A02 = r0
            r3.A05 = r8
            r3.A04 = r1
            r2 = 0
            if (r8 == 0) goto L_0x0099
            long r8 = r8.longValue()
            if (r1 == 0) goto L_0x0099
            long r0 = r1.longValue()
            long r0 = r0 - r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0048:
            r3.A03 = r0
            if (r11 == 0) goto L_0x0097
            java.lang.String r0 = r11.A03()
        L_0x0050:
            r3.A06 = r0
            if (r11 == 0) goto L_0x005e
            java.util.List r1 = r11.A01
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0072
            java.lang.String r2 = ""
        L_0x005e:
            r3.A07 = r2
            java.lang.String r0 = r7.A05
            r3.A08 = r0
            java.lang.String r0 = r7.A06
            r3.A09 = r0
            r3.A00 = r5
            r3.A01 = r4
            X.18K r0 = r6.A02
            r0.CC7(r3)
        L_0x0071:
            return
        L_0x0072:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x007b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r1.next()
            X.BC4 r0 = (X.BC4) r0
            org.json.JSONObject r0 = X.A6Z.A01(r0)
            r2.put(r0)
            goto L_0x007b
        L_0x008f:
            java.lang.String r2 = r2.toString()
            X.C18070vi.A0b(r2)
            goto L_0x005e
        L_0x0097:
            r0 = r2
            goto L_0x0050
        L_0x0099:
            r0 = r2
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.infra.graphql.BaseMexCallback.A01(X.A6Z, boolean):void");
    }

    public void A02(C20125A8k a8k) {
        C53892dG r0;
        C33071iE r5 = (C33071iE) this;
        C18070vi.A0d(a8k, 0);
        AnonymousClass1IX A0A = a8k.A0A(HasBusinessIntentResponseImpl.Xwa2BusinessGetQualityMetadata.class, "xwa2_business_get_quality_metadata");
        if (A0A != null) {
            ArrayList arrayList = new ArrayList(C29351c6.A0C(A0A, 10));
            Iterator it = A0A.iterator();
            while (it.hasNext()) {
                C20125A8k a8k2 = (C20125A8k) it.next();
                String optString = a8k2.A00.optString("jid");
                C22941Dw r02 = UserJid.Companion;
                arrayList.add(new C59192lu(C22941Dw.A03(optString), a8k2.A0G("has_business_intent")));
            }
            if ((!arrayList.isEmpty()) && (r0 = r5.A00) != null) {
                r0.A01.invoke(new C58902lR(arrayList));
            }
        }
    }

    public void A04(Throwable th) {
        A6Z a6z = new A6Z(th, (JSONArray) null);
        A01(a6z, false);
        A05(a6z);
    }

    public boolean A05(A6Z a6z) {
        C18070vi.A0d(a6z, 0);
        C53892dG r3 = ((C33071iE) this).A00;
        if (r3 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("QualityBizIntentMexCallback: Error fetching biz intent flags. Code: ");
            sb.append(a6z.A03());
            Throwable th = new Throwable(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("QualityBizIntentRefreshTask/Failed to fetch biz intent flag for ");
            sb2.append(r3.A00.size());
            sb2.append(" contacts");
            Log.e(sb2.toString(), th);
        }
        return false;
    }

    public final void Btr(Throwable th) {
        C18070vi.A0d(th, 0);
        A04(th);
    }

    public void A03(C172768tz r5) {
        A6Z a6z = null;
        if (r5.A03) {
            a6z = new A6Z((Throwable) null, r5.A01);
        }
        if (a6z != null) {
            try {
                boolean A05 = A05(a6z);
                A01(a6z, r5.A02);
                if (!A05) {
                    return;
                }
            } catch (Throwable th) {
                C172948uH r3 = new C172948uH(this.A00, th);
                A01(new A6Z(r3, r5.A01), r5.A02);
                throw r3;
            }
        }
        if (r5.A02) {
            try {
                A02(r5.A00);
                A01(a6z, true);
            } catch (Throwable th2) {
                C172938uG r2 = new C172938uG(this.A00, th2);
                A01(new A6Z(r2, r5.A01), true);
                throw r2;
            }
        }
    }

    public String getName() {
        A2F a2f = this.A00;
        if (a2f != null) {
            return a2f.A05;
        }
        return null;
    }

    public final void C3V(C172768tz r1) {
        A03(r1);
    }
}
