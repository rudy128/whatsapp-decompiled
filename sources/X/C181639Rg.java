package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9Rg  reason: invalid class name and case insensitive filesystem */
public abstract class C181639Rg {
    public static final C192879p8 A00(C166418cr r5, C63362sw r6, byte[] bArr) {
        String str;
        String str2;
        String str3;
        String str4;
        C18070vi.A0d(r6, 0);
        C20717AVx aVx = (C20717AVx) C63362sw.A00(r6, C20717AVx.class);
        C192879p8 A01 = C196699vU.A01(r5, r6.A0B, r6, r6.A0X);
        A01.A01 = (AW0) C63362sw.A00(r6, AW0.class);
        A01.A02 = C22971Dz.A00(r6.A0Y);
        A01.A0A = true;
        A01.A00 = r6.A01;
        A01.A08 = r6.A0R;
        UserJid userJid = null;
        if (aVx != null) {
            str = aVx.A00;
        } else {
            str = null;
        }
        A01.A06 = str;
        C20718AVy aVy = (C20718AVy) C63362sw.A00(r6, C20718AVy.class);
        if (aVy != null) {
            str2 = aVy.A01;
        } else {
            str2 = null;
        }
        A01.A09 = str2;
        if (aVx != null) {
            str3 = aVx.A01;
        } else {
            str3 = null;
        }
        A01.A07 = str3;
        A01.A01((C20719AVz) C63362sw.A00(r6, C20719AVz.class), bArr);
        Class<C687334m> cls = C687334m.class;
        C687334m r0 = (C687334m) C63362sw.A00(r6, cls);
        if (r0 != null) {
            str4 = r0.A01;
        } else {
            str4 = null;
        }
        A01.A05 = str4;
        C687334m r02 = (C687334m) C63362sw.A00(r6, cls);
        if (r02 != null) {
            userJid = r02.A00;
        }
        A01.A03 = userJid;
        A01.A0C = AnonymousClass000.A1P(((r6.A05 & 4194304) > 4194304 ? 1 : ((r6.A05 & 4194304) == 4194304 ? 0 : -1)));
        return A01;
    }
}
