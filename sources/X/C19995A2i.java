package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.A2i  reason: case insensitive filesystem */
public class C19995A2i {
    public C58372ka A00;
    public C58372ka A01;
    public AnonymousClass00H A02;
    public final C19880zA A03;
    public final C198279y5 A04;
    public final C19943A0a A05;
    public final C34991lS A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final Set A0A;
    public final C51632Za A0B;

    public void A03(ADL adl, BCH bch, Boolean bool, String str, String str2, String str3) {
        A04(adl, bch, bool, str, str2, str3, this.A0A.contains(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        if (r28.booleanValue() == false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C19995A2i r23, X.AnonymousClass705 r24, X.C187029f9 r25, X.ADL r26, X.BCH r27, java.lang.Boolean r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, boolean r32) {
        /*
            if (r28 == 0) goto L_0x000a
            boolean r0 = r28.booleanValue()
            r17 = 0
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            r17 = 1
        L_0x000c:
            r6 = r23
            X.9y5 r1 = r6.A04
            r12 = r29
            X.9aO r5 = X.C198279y5.A00(r1, r12)
            r11 = 0
            X.9aN r0 = r5.A01
            X.1lW r4 = r0.A01
            r13 = r30
            if (r4 != 0) goto L_0x0030
            X.9Wx r2 = r5.A00
            long r0 = r0.A00
            X.B7a r2 = r2.A00
            r10 = r2
            r14 = r0
            X.8te r8 = r10.BHl(r11, r12, r13, r14)
        L_0x002b:
            r15 = r31
            if (r31 == 0) goto L_0x005a
            goto L_0x0048
        L_0x0030:
            X.6ki r3 = r1.A00
            long r0 = r0.A00
            X.ATp r2 = new X.ATp
            r2.<init>(r5, r12, r13)
            r18 = r3
            r19 = r4
            r20 = r11
            r21 = r2
            r22 = r0
            X.7IB r8 = r18.A01(r19, r20, r21, r22)
            goto L_0x002b
        L_0x0048:
            org.json.JSONObject r1 = X.C17880vN.A16(r15)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r0 = "FDS_INSTANCE_KEY"
            java.lang.String r14 = r1.getString(r0)     // Catch:{ JSONException -> 0x0055 }
            if (r14 != 0) goto L_0x0062
            goto L_0x005a
        L_0x0055:
            java.lang.String r0 = "qpl params parsing failure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x005a:
            int r0 = r8.hashCode()
            java.lang.String r14 = java.lang.String.valueOf(r0)
        L_0x0062:
            X.AfQ r11 = new X.AfQ
            r2 = r27
            r0 = r11
            r1 = r6
            r3 = r14
            r4 = r13
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            X.10I r0 = r6.A07
            X.Ajk r5 = new X.Ajk
            r7 = r24
            r9 = r25
            r10 = r26
            r16 = r32
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.CGF(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19995A2i.A00(X.A2i, X.705, X.9f9, X.ADL, X.BCH, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public void A01(C187029f9 r3, ADL adl, BCH bch, String str, boolean z) {
        if (adl != null && adl.A02 == "ASYNC_COMPONENT") {
            bch.C3l(str);
        } else if (z) {
            C196529vD.A00(new AOT(this, r3, bch), this.A00, str);
        } else {
            C196529vD.A01(new AOV(this, r3, bch), this.A00, str);
        }
    }

    public void A02(C187029f9 r3, BCH bch, String str) {
        if (r3.A00 != 5) {
            if (r3.A02 == null) {
                r3.A02 = AnonymousClass8BR.A0w(str);
            }
            bch.C3j(r3);
            return;
        }
        throw AnonymousClass000.A0n("Successful responses should not be processed as errors");
    }

    public void A04(ADL adl, BCH bch, Boolean bool, String str, String str2, String str3, boolean z) {
        String str4 = str;
        C17960vV.A07(str4);
        C187029f9 r5 = new C187029f9();
        Iterator A15 = AnonymousClass000.A15(this.A0B.A00);
        while (true) {
            ADL adl2 = adl;
            BCH bch2 = bch;
            String str5 = str2;
            String str6 = str3;
            boolean z2 = z;
            if (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                if (AnonymousClass8BU.A1V(str4, (Pattern) A16.getKey()) && ((C184069aM) A16.getValue()).A01.BeZ(str4)) {
                    this.A07.CGF(new AnonymousClass7QT(this, ((C184069aM) A16.getValue()).A00, r5, adl2, bch2, str4, str5, str6, z2));
                    return;
                }
            } else {
                A00(this, new AnonymousClass705(3, C20113A7w.A0L), r5, adl2, bch2, bool, str4, str5, str6, z2);
                return;
            }
        }
    }

    public C19995A2i(C19880zA r1, C58372ka r2, C51632Za r3, C198279y5 r4, C19943A0a a0a, C34991lS r6, AnonymousClass10I r7, AnonymousClass00H r8, AnonymousClass00H r9, Set set) {
        this.A00 = r2;
        this.A0A = set;
        this.A08 = r8;
        this.A07 = r7;
        this.A09 = r9;
        this.A05 = a0a;
        this.A06 = r6;
        this.A0B = r3;
        this.A04 = r4;
        this.A03 = r1;
    }
}
