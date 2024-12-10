package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.1NG  reason: invalid class name */
public final class AnonymousClass1NG {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public AnonymousClass1NG(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r8, 7);
        this.A04 = r2;
        this.A05 = r3;
        this.A01 = r4;
        this.A00 = r5;
        this.A03 = r6;
        this.A06 = r7;
        this.A02 = r8;
    }

    public LinkedHashMap A03(Set set) {
        C18070vi.A0d(set, 0);
        int A032 = C200610r.A03(C29351c6.A0C(set, 10));
        if (A032 < 16) {
            A032 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A032);
        for (Object next : set) {
            linkedHashMap.put(next, next);
        }
        return linkedHashMap;
    }

    public boolean A04() {
        return ((SharedPreferences) ((C19830z4) this.A06.get()).A00.get()).getBoolean("global_1to1_lid_chat_migration_done", false);
    }

    public AnonymousClass1BI A00(AnonymousClass1BI r4) {
        C24751Ln r1;
        UserJid userJid;
        if (!C22971Dz.A0d(r4)) {
            return r4;
        }
        if (A04()) {
            if (!C22971Dz.A0Y(r4)) {
                return r4;
            }
            r1 = (C24751Ln) this.A03.get();
            C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
            userJid = (PhoneUserJid) r4;
        } else if (!C22971Dz.A0U(r4)) {
            return r4;
        } else {
            if (!C18020vd.A05(C18040vf.A02, (C18020vd) this.A04.get(), 5143)) {
                return r4;
            }
            r1 = (C24751Ln) this.A03.get();
            C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
            userJid = (AnonymousClass1E2) r4;
        }
        return r1.A0F(userJid);
    }

    public AnonymousClass1BI A01(AnonymousClass1BI r4) {
        if (!C22971Dz.A0d(r4)) {
            return r4;
        }
        if (!C18020vd.A05(C18040vf.A01, (C18020vd) this.A04.get(), 11706)) {
            return r4;
        }
        if ((!A04() || !C22971Dz.A0Y(r4)) && (A04() || !C22971Dz.A0U(r4))) {
            return r4;
        }
        C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
        return ((C24751Ln) this.A03.get()).A0F((UserJid) r4);
    }

    public AnonymousClass1BI A02(AnonymousClass1BI r2, AnonymousClass1E2 r3, PhoneUserJid phoneUserJid) {
        if (C22971Dz.A0d(r2)) {
            if (C22971Dz.A0U(r2) && A05()) {
                return phoneUserJid;
            }
            if (!C22971Dz.A0Y(r2) || !A04()) {
                return r2;
            }
            return r3;
        }
        return r2;
    }

    public boolean A05() {
        if (!A04()) {
            if (!C18020vd.A05(C18040vf.A02, (C18020vd) this.A04.get(), 11440)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
