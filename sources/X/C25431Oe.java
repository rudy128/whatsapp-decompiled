package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.1Oe  reason: invalid class name and case insensitive filesystem */
public final class C25431Oe {
    public PhoneUserJid A00;
    public String A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass1OZ A04;
    public volatile boolean A05;

    public C25431Oe(AnonymousClass11S r2, AnonymousClass11P r3, AnonymousClass1OZ r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
    }

    public static final void A00(C25431Oe r4) {
        String valueOf;
        if (!r4.A05) {
            AnonymousClass11S r2 = r4.A02;
            r2.A0I();
            r4.A00 = r2.A0E;
            r2.A0A.add(new C29581cW(r4));
            r4.A05 = true;
        }
        if (r4.A00 == null) {
            valueOf = null;
        } else {
            valueOf = String.valueOf((AnonymousClass11P.A01(r4.A03) + 259200000) % 604800000);
        }
        r4.A01 = valueOf;
    }

    public static final void A01(C25431Oe r10) {
        String str = r10.A01;
        if (str != null) {
            AnonymousClass1OZ r4 = r10.A04;
            C29591cX r3 = new C29591cX("ib");
            C29591cX r2 = new C29591cX("unified_session");
            if (C29601cY.A04(str, 0, 64, false)) {
                r2.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
            }
            r3.A05(r2.A03());
            r4.A0O(r3.A03(), 447);
        }
    }

    public String A03() {
        if (!this.A05) {
            synchronized (this) {
                if (!this.A05) {
                    A00(this);
                }
            }
        }
        return this.A01;
    }

    public C29621ca A02() {
        String A032 = A03();
        if (A032 == null) {
            return null;
        }
        C29591cX r3 = new C29591cX("ib");
        C29591cX r2 = new C29591cX("unified_session");
        if (C29601cY.A04(A032, 0, 64, false)) {
            r2.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032));
        }
        r3.A05(r2.A03());
        return r3.A03();
    }
}
