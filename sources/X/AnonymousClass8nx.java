package X;

import android.app.Activity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8nx  reason: invalid class name */
public final class AnonymousClass8nx extends AnonymousClass8nz {
    public final AnonymousClass122 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C56582hh A04;
    public final C196149uX A05;
    public final C26911Ty A06;
    public final C18030ve A07;
    public final C20130A8q A08;
    public final AnonymousClass00H A09;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (r1 == null) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.app.Activity r7, X.AEW r8, X.AnonymousClass5XY r9, X.AnonymousClass8nx r10, com.whatsapp.jid.Jid r11, X.C20271AEe r12, java.lang.String r13, java.lang.String r14, long r15) {
        /*
            r6 = r10
            X.9uX r0 = r10.A05
            java.lang.String r1 = r0.A00(r8)
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r8 = r9
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            super.A0H(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = r10.A00
            java.util.HashMap r3 = X.A3M.A01(r0)
            java.util.HashMap r2 = X.C17880vN.A11()
            java.lang.String r1 = "action"
            java.lang.String r0 = "start"
            r2.put(r1, r0)
            java.util.HashMap r9 = A00(r7, r6, r10, r3)
            r3 = r6
            r4 = r7
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r2
            r10 = r15
            r3.A0I(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0038:
            X.00H r0 = r10.A02
            java.lang.Object r6 = r0.get()
            X.A0o r6 = (X.C19957A0o) r6
            r0 = 1
            r5 = 2131886997(0x7f120395, float:1.9408589E38)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r3 = 0
            if (r8 == 0) goto L_0x006b
            com.whatsapp.jid.UserJid r2 = r8.A09
            if (r2 == 0) goto L_0x006b
            X.1PM r0 = r6.A01
            X.1yf r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = r0.A08
        L_0x0057:
            boolean r0 = X.AnonymousClass1EG.A0H(r1)
            if (r0 == 0) goto L_0x0069
            X.1M9 r0 = r6.A00
            X.1E7 r1 = r0.A0H(r2)
            X.1Me r0 = r6.A02
            java.lang.String r1 = r0.A0I(r1)
        L_0x0069:
            if (r1 != 0) goto L_0x006d
        L_0x006b:
            java.lang.String r1 = ""
        L_0x006d:
            java.lang.String r0 = X.AnonymousClass3Ma.A10(r7, r1, r4, r3, r5)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r7)
            r3.A0S(r0)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 2
            X.A9R r0 = new X.A9R
            r0.<init>(r1)
            r3.A0Z(r0, r2)
            X.AnonymousClass3MY.A1G(r3)
            return
        L_0x0088:
            r1 = 0
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8nx.A01(android.app.Activity, X.AEW, X.5XY, X.8nx, com.whatsapp.jid.Jid, X.AEe, java.lang.String, java.lang.String, long):void");
    }

    public void A0H(Activity activity, AnonymousClass5XY r14, Jid jid, C20271AEe aEe, String str, String str2, long j) {
        UserJid userJid;
        Activity activity2 = activity;
        Activity A002 = C18050vg.A00(activity);
        if (A002 != null) {
            userJid = AnonymousClass3MZ.A0x(((C22559BCs) A002).getContact());
        } else {
            userJid = null;
        }
        this.A06.A0D(new C20477AMo(activity2, r14, this, jid, aEe, str, str2, j), userJid);
    }

    public final void A0I(Activity activity, C20271AEe aEe, String str, String str2, HashMap hashMap, Map map, long j) {
        HashMap hashMap2 = hashMap;
        Map map2 = map;
        String str3 = "address_message";
        C194579rx r17 = new C194579rx("address_message", (String) null, hashMap2);
        this.A08.A0B((B9G) null, new C20907AbN(activity, this, aEe, map2.get("supported_actions"), str, str2, hashMap2, j), r17, str3, (String) null, map2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8nx(C56582hh r2, C196149uX r3, C26911Ty r4, AnonymousClass122 r5, C18030ve r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        super(r8);
        C18070vi.A0w(r6, r2, r5, r7, r8);
        C18070vi.A0q(r9, r3, r4);
        C18070vi.A0d(r10, 9);
        this.A07 = r6;
        this.A04 = r2;
        this.A00 = r5;
        this.A03 = r7;
        this.A09 = r8;
        this.A01 = r9;
        this.A05 = r3;
        this.A06 = r4;
        this.A02 = r10;
        this.A08 = r2.A00((C193199ph) null);
    }

    public static final HashMap A00(Activity activity, AnonymousClass8nx r1, C20271AEe aEe, Map map) {
        HashMap A0G = r1.A0G(activity, aEe);
        A0G.put("country", map.get("country"));
        boolean containsKey = map.containsKey("saved_addresses");
        if (containsKey) {
            List A0t = AnonymousClass8BS.A0t("saved_addresses", map);
            if (A0t != null) {
                containsKey = AnonymousClass000.A1a(A0t);
            } else {
                containsKey = false;
            }
        }
        A0G.put("has_saved_addresses", Boolean.valueOf(containsKey));
        A0G.put("has_validation_errors", Boolean.valueOf(map.containsKey("validation_errors")));
        return A0G;
    }
}
