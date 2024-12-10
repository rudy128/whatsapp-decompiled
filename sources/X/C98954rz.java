package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import java.util.Comparator;

/* renamed from: X.4rz  reason: invalid class name and case insensitive filesystem */
public class C98954rz implements Comparator {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C98954rz(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static Integer A00(AnonymousClass11S r5, AnonymousClass1E7 r6, UserJid userJid, C178119Bw r8) {
        boolean A0Z = r8.A0Z(r5, userJid);
        AnonymousClass1BI r0 = r6.A0J;
        C18070vi.A0z(r0, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
        boolean A0a = r8.A0a((UserJid) r0);
        boolean z = r6.A0g;
        boolean A06 = C24921Me.A06(r6);
        boolean A0B = r6.A0B();
        int i = 0;
        if (A0Z) {
            i = SearchActionVerificationClientService.NOTIFICATION_ID;
        }
        if (A0a) {
            i += 1000;
        }
        if (z) {
            i++;
        }
        if (A0B) {
            i += 100;
        } else if (A06) {
            i += 10;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x0093;
                case 2: goto L_0x0061;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r0 = r9.A01
            int r8 = X.AnonymousClass000.A0M(r0)
            r7 = 0
            java.lang.Object r5 = r10.getValue()
            X.C18070vi.A0X(r5)
            X.206 r5 = (X.AnonymousClass206) r5
            if (r8 == r7) goto L_0x005e
            X.22C r5 = X.C63892tr.A03(r5)
            if (r5 == 0) goto L_0x005a
            long r3 = r5.A03
        L_0x0021:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0029
            long r3 = r5.A0I
        L_0x0029:
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r5 = r11.getValue()
            X.C18070vi.A0X(r5)
            X.206 r5 = (X.AnonymousClass206) r5
            if (r8 == r7) goto L_0x0057
            X.22C r5 = X.C63892tr.A03(r5)
            if (r5 == 0) goto L_0x0053
            long r3 = r5.A03
        L_0x0042:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004a
            long r3 = r5.A0I
        L_0x004a:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            int r0 = X.C40151uF.A00(r6, r0)
        L_0x0052:
            return r0
        L_0x0053:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            goto L_0x004a
        L_0x0057:
            long r3 = r5.A0H
            goto L_0x0042
        L_0x005a:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            goto L_0x0029
        L_0x005e:
            long r3 = r5.A0H
            goto L_0x0021
        L_0x0061:
            java.lang.Object r0 = r9.A02
            java.util.Comparator r0 = (java.util.Comparator) r0
            int r0 = r0.compare(r10, r11)
            if (r0 != 0) goto L_0x0052
            java.lang.Object r3 = r9.A01
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r0 = r3.get(r10)
            X.4Tj r0 = (X.C86864Tj) r0
            r2 = 0
            if (r0 == 0) goto L_0x0091
            int r0 = r0.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x007e:
            java.lang.Object r0 = r3.get(r11)
            X.4Tj r0 = (X.C86864Tj) r0
            if (r0 == 0) goto L_0x008c
            int r0 = r0.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x008c:
            int r0 = X.C40151uF.A00(r1, r2)
            return r0
        L_0x0091:
            r1 = r2
            goto L_0x007e
        L_0x0093:
            X.1E7 r11 = (X.AnonymousClass1E7) r11
            java.lang.Object r0 = r9.A02
            X.3mF r0 = (X.C75983mF) r0
            X.9Bw r4 = r0.A02
            X.1BI r1 = r11.A0J
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r1, r3)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.11S r2 = r0.A00
            goto L_0x00ba
        L_0x00a7:
            X.1E7 r11 = (X.AnonymousClass1E7) r11
            java.lang.Object r0 = r9.A02
            X.3mD r0 = (X.C75963mD) r0
            X.9Bw r4 = r0.A01
            X.1BI r1 = r11.A0J
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r1, r3)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.11S r2 = r0.A00
        L_0x00ba:
            java.lang.Integer r1 = A00(r2, r11, r1, r4)
            X.1E7 r10 = (X.AnonymousClass1E7) r10
            X.1BI r0 = r10.A0J
            X.C18070vi.A0z(r0, r3)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            java.lang.Integer r0 = A00(r2, r10, r0, r4)
            int r0 = X.C40151uF.A00(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98954rz.compare(java.lang.Object, java.lang.Object):int");
    }
}
