package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2u1  reason: invalid class name and case insensitive filesystem */
public abstract class C63982u1 {
    public static int A00(TelephonyManager telephonyManager, C219217x r3) {
        if (telephonyManager != null && !r3.A0J()) {
            try {
                if (AnonymousClass112.A08()) {
                    return telephonyManager.getCallStateForSubscription();
                }
                return telephonyManager.getCallState();
            } catch (SecurityException unused) {
                Log.w("voip/getTelephonyState SecurityException is caught");
            }
        }
        return 0;
    }

    public static AnonymousClass1E7 A01(AnonymousClass1M9 r4, AnonymousClass126 r5, GroupJid groupJid, C24901Mc r7, boolean z) {
        AnonymousClass1E7 A0G;
        AnonymousClass1EC r1;
        if (groupJid == null || (A0G = r4.A0G(groupJid)) == null || (r1 = (AnonymousClass1EC) A0G.A06(AnonymousClass1EC.class)) == null || A0G.A0K() == null || (!z && r7.A09(r1, r5.A0O.A0O(r1)))) {
            return null;
        }
        return A0G;
    }

    public static String A02(Context context, AnonymousClass1M9 r9, C24921Me r10, C18000vb r11, AnonymousClass1BI r12, UserJid userJid, long j, boolean z) {
        String A0T;
        int i;
        Object[] objArr;
        if (userJid == null) {
            A0T = context.getString(2131888741);
        } else {
            A0T = r10.A0T(r9.A0H(userJid), r10.A0B(r12));
        }
        String A01 = AnonymousClass11Y.A01(r11, j);
        String A00 = A8I.A00(r11, j);
        if (z) {
            i = 2131895416;
            objArr = new Object[]{A01, A00};
        } else {
            i = 2131895415;
            objArr = new Object[]{A0T, A01, A00};
        }
        return context.getString(i, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if ("video".equals(r6) != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(android.net.Uri r10, X.AnonymousClass1FU r11, X.AnonymousClass1KB r12, X.AnonymousClass1VP r13, int r14) {
        /*
            r8 = r13
            java.lang.String r0 = "whatsapp"
            boolean r0 = X.C17890vO.A1T(r10, r0)
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "call"
            boolean r0 = X.C17890vO.A1U(r10, r0)
            if (r0 != 0) goto L_0x002a
        L_0x0012:
            java.lang.String r0 = "http"
            boolean r0 = X.C17890vO.A1T(r10, r0)
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "https"
            boolean r0 = X.C17890vO.A1T(r10, r0)
            if (r0 == 0) goto L_0x007b
        L_0x0022:
            java.lang.String r0 = "call.whatsapp.com"
            boolean r0 = X.C17890vO.A1U(r10, r0)
            if (r0 == 0) goto L_0x007b
        L_0x002a:
            java.util.List r7 = r10.getPathSegments()
            int r0 = r7.size()
            r9 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x007e
            java.lang.Object r6 = r7.get(r5)
        L_0x003a:
            int r0 = r7.size()
            r4 = 1
            if (r0 <= r4) goto L_0x0045
            java.lang.String r9 = X.C17880vN.A0w(r7, r4)
        L_0x0045:
            java.lang.String r0 = "voice"
            boolean r0 = r0.equals(r6)
            java.lang.String r3 = "video"
            if (r0 != 0) goto L_0x0058
            boolean r0 = r3.equals(r6)
            r2 = 0
            if (r0 == 0) goto L_0x0059
        L_0x0058:
            r2 = 1
        L_0x0059:
            if (r9 == 0) goto L_0x007c
            int r1 = r9.length()
            r0 = 22
            if (r1 != r0) goto L_0x007c
        L_0x0063:
            int r1 = r7.size()
            r0 = 2
            if (r1 != r0) goto L_0x0080
            if (r2 == 0) goto L_0x0080
            if (r4 == 0) goto L_0x0080
            boolean r12 = r3.equals(r6)
            X.1VQ r8 = (X.AnonymousClass1VQ) r8
            java.lang.String r10 = "preview_call_link"
            r7 = r11
            r11 = r14
            X.AnonymousClass1VQ.A07(r7, r8, r9, r10, r11, r12)
        L_0x007b:
            return
        L_0x007c:
            r4 = 0
            goto L_0x0063
        L_0x007e:
            r6 = r9
            goto L_0x003a
        L_0x0080:
            r0 = 2131891437(0x7f1214ed, float:1.9417594E38)
            r12.A08(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63982u1.A06(android.net.Uri, X.1FU, X.1KB, X.1VP, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (((X.C32171gl) r4.A03()).Bey(r7) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A08(X.C19880zA r4, X.AnonymousClass1CJ r5, X.AnonymousClass1E7 r6, com.whatsapp.jid.GroupJid r7) {
        /*
            r3 = 1
            if (r7 == 0) goto L_0x0025
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r4.A03()
            X.1gl r0 = (X.C32171gl) r0
            boolean r0 = r0.Bey(r7)
            r2 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            boolean r0 = r6.A0j
            if (r0 != 0) goto L_0x0025
            int r1 = r5.A06(r7)
            r0 = 3
            if (r1 == r0) goto L_0x0025
            if (r2 != 0) goto L_0x0025
            return r3
        L_0x0025:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63982u1.A08(X.0zA, X.1CJ, X.1E7, com.whatsapp.jid.GroupJid):boolean");
    }

    public static boolean A09(AnonymousClass11S r6, AnonymousClass1HS r7, AnonymousClass1M9 r8, AnonymousClass1MZ r9, AnonymousClass1E7 r10, C18030ve r11, GroupJid groupJid, AnonymousClass1PU r13, boolean z) {
        if (groupJid != null && !r7.A01() && !r13.A01(r10, groupJid)) {
            C199410f A07 = r9.A08.A0C(groupJid).A07();
            if (A07.size() != 1 || !r6.A0O((AnonymousClass1BI) A07.asList().get(0))) {
                if (!z) {
                    if (A07.size() > Math.min(64, C18020vd.A00(C18040vf.A02, r11, 4189))) {
                        AnonymousClass1IZ it = A07.iterator();
                        while (it.hasNext()) {
                            if (r8.A0z(C17880vN.A0Q(it))) {
                            }
                        }
                    }
                    return true;
                } else if (C40811vJ.A0J(r6, r11, A07.size(), false) || !r7.A01()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List A04(AnonymousClass11S r3, AnonymousClass1M9 r4, AnonymousClass1MZ r5, AnonymousClass1E7 r6) {
        GroupJid groupJid = (GroupJid) r6.A06(AnonymousClass1EC.class);
        if (groupJid == null) {
            return Collections.singletonList(r6);
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A03(r3, r5, groupJid).iterator();
        while (it.hasNext()) {
            A13.add(r4.A0H(C17880vN.A0Q(it)));
        }
        return A13;
    }

    public static boolean A0A(AnonymousClass1PM r2, CallInfo callInfo) {
        if (callInfo != null) {
            boolean z = callInfo.isGroupCall;
            UserJid peerJid = callInfo.getPeerJid();
            if (z || !r2.A04(peerJid)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static ArrayList A03(AnonymousClass11S r4, AnonymousClass1MZ r5, GroupJid groupJid) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = C17880vN.A10(r5.A08.A0C(groupJid).A07()).iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            if (!r4.A0O(A0Q)) {
                A13.add(A0Q);
            }
        }
        return A13;
    }

    public static void A05(Context context, AnonymousClass1KB r10, AnonymousClass1VP r11, AnonymousClass12O r12, AnonymousClass11P r13, AnonymousClass1TD r14, AnonymousClass1TA r15, C27081Uq r16, GroupJid groupJid, int i, long j) {
        C59822mw A01;
        C178119Bw r1;
        GroupJid groupJid2 = groupJid;
        C17900vP.A0Y(groupJid2, "scheduled-call/joinScheduledCall groupJid=", AnonymousClass000.A10());
        AnonymousClass2Q4 A03 = r15.A03(groupJid2);
        if (A03 != null) {
            r1 = r14.A05(A03.A01());
            A01 = null;
        } else {
            A01 = r16.A01(j);
            r1 = null;
        }
        r10.A0J(new AnonymousClass7R5((Object) r1, (Object) r11, (Object) context, (Object) A01, (Object) r13, (Object) r12, i, 1));
    }

    public static boolean A07(C19880zA r0, AnonymousClass1CJ r1, AnonymousClass1MZ r2, AnonymousClass1E7 r3, C18030ve r4, GroupJid groupJid) {
        if (!A08(r0, r1, r3, groupJid) || !r2.A0J(groupJid) || r2.A08.A0A(groupJid) > Math.min(64, C18020vd.A00(C18040vf.A02, r4, 4189))) {
            return false;
        }
        return true;
    }
}
