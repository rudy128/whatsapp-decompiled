package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.37a  reason: invalid class name and case insensitive filesystem */
public final class C693937a implements AnonymousClass3M6, AnonymousClass3LF {
    public final AnonymousClass11S A00;
    public final C51802Zr A01;
    public final AnonymousClass1OZ A02;

    public boolean CRi(C63362sw r6, C29621ca r7) {
        AnonymousClass1BI r0;
        if (r6.A0S) {
            Jid jid = r6.A0Z;
            if (!(jid instanceof C29671cg)) {
                AnonymousClass11S r1 = this.A00;
                if (jid instanceof UserJid) {
                    r0 = (AnonymousClass1BI) jid;
                } else {
                    r0 = null;
                }
                if (r1.A0O(r0) && r7.A0K("participants") != null && r1.A0N()) {
                    C58762lD r2 = new C58762lD();
                    r2.A02 = r6.A0Y;
                    r2.A06 = "message";
                    r2.A08 = r6.A0h;
                    r2.A09 = r6.A0R;
                    r2.A01 = jid;
                    r2.A00 = -1;
                    this.A02.A0K(r2.A00());
                    return false;
                }
            }
        }
        return true;
    }

    public /* synthetic */ B5K CBD(C194979sb r2, C29621ca r3) {
        return null;
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public C693937a(AnonymousClass11S r1, C51802Zr r2, AnonymousClass1OZ r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void CB9(C63362sw r7, C29621ca r8) {
        boolean A16 = C18070vi.A16(r8, r7);
        if (this.A01.A00.A0N() && !"peer".equals(r8.A0Q("category", (String) null))) {
            String A0Q = r8.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
            C29621ca[] r4 = r8.A02;
            if (r4 != null && ("text".equals(A0Q) || "media".equals(A0Q) || "reaction".equals(A0Q) || "poll".equals(A0Q) || "event".equals(A0Q))) {
                int length = r4.length;
                int i = 0;
                while (i < length) {
                    C29621ca r5 = r4[i];
                    if (C29621ca.A07(r5, "enc") || C29621ca.A07(r5, "device-identity") || C29621ca.A07(r5, "verified_name") || C29621ca.A07(r5, "url_text") || C29621ca.A07(r5, "url_number") || C29621ca.A07(r5, "padding") || C29621ca.A07(r5, "biz") || C29621ca.A07(r5, "meta") || C29621ca.A07(r5, "automated") || C29621ca.A07(r5, "multicast") || C29621ca.A07(r5, "rcat") || C29621ca.A07(r5, "reporting") || C29621ca.A07(r5, "bot") || C29621ca.A07(r5, "hsm")) {
                        i++;
                    }
                }
                return;
            }
            r7.A0T = A16;
        }
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }
}
