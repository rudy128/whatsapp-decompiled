package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1fv  reason: invalid class name and case insensitive filesystem */
public final class C31661fv {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass1M4 A01;
    public final C24751Ln A02;
    public final AnonymousClass10I A03;

    public C31661fv(AnonymousClass1M9 r2, AnonymousClass1M4 r3, C24751Ln r4, AnonymousClass10I r5) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r3, 4);
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final void A01(Map map) {
        C18070vi.A0d(map, 0);
        this.A02.A0K(new HashMap(map));
    }

    public final void A02(Map map) {
        String str;
        C18070vi.A0d(map, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (C60052nJ r5 : map.values()) {
            PhoneUserJid phoneUserJid = r5.A01;
            if (phoneUserJid != null) {
                UserJid userJid = r5.A02;
                if (C22971Dz.A0T(userJid)) {
                    C18070vi.A0z(userJid, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
                    linkedHashMap2.put(userJid, phoneUserJid);
                    C18070vi.A0z(userJid, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
                    arrayList.add(userJid);
                }
            }
            if (r5.A00()) {
                AnonymousClass1E2 r2 = r5.A00;
                C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
                UserJid userJid2 = r5.A02;
                C18070vi.A0z(userJid2, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
                linkedHashMap2.put(r2, userJid2);
            }
            Object obj = r5.A00;
            if (obj == null) {
                obj = r5.A02;
            }
            if ((obj instanceof AnonymousClass1E2) && (str = r5.A03) != null && (!AnonymousClass1YF.A0T(str))) {
                linkedHashMap.put(obj, str);
            }
        }
        this.A03.CGS(new C146617Py(this, this.A02.A0K(linkedHashMap2), linkedHashMap, arrayList, 15), "PrivacyPhoneNumberHidingHelper/updateAliasedDisplayName");
    }

    public final void A00(UserJid userJid, UserJid userJid2, C62532rY r6, boolean z) {
        PhoneUserJid phoneUserJid;
        C24751Ln r0;
        AnonymousClass1E1 r5;
        if (z) {
            phoneUserJid = r6.A03;
            if (phoneUserJid != null && (userJid2 instanceof AnonymousClass1E2)) {
                r0 = this.A02;
                r5 = (AnonymousClass1E1) userJid2;
            } else {
                return;
            }
        } else if (userJid instanceof AnonymousClass1E2) {
            PhoneUserJid phoneUserJid2 = r6.A04;
            if (phoneUserJid2 != null) {
                AnonymousClass1E1 r1 = (AnonymousClass1E1) userJid;
                this.A02.A0P(r1, phoneUserJid2);
                this.A00.A0a(r1);
            }
            phoneUserJid = r6.A02;
            if (phoneUserJid != null) {
                r0 = this.A02;
                r5 = (AnonymousClass1E1) userJid;
            } else {
                return;
            }
        } else if (userJid instanceof PhoneUserJid) {
            AnonymousClass1E2 r2 = r6.A01;
            if (r2 != null) {
                this.A02.A0P(r2, (PhoneUserJid) userJid);
                this.A00.A0a(r2);
            }
            AnonymousClass1E2 r12 = r6.A00;
            if (r12 != null) {
                this.A02.A0P(r12, (PhoneUserJid) userJid);
                this.A00.A0a(r12);
                return;
            }
            return;
        } else {
            return;
        }
        r0.A0P(r5, phoneUserJid);
        this.A00.A0a(r5);
    }
}
