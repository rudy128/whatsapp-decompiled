package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.6mB  reason: invalid class name and case insensitive filesystem */
public class C132086mB {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.5qs] */
    public C114465qs A00(C1596185f r11, Integer num) {
        AnonymousClass00H r3 = this.A01;
        String A0T = C17890vO.A0T(r3);
        C17900vP.A0f("GdprXmppMethods/sendRequestGdprReport; iq=", A0T, AnonymousClass000.A10());
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11("action", "request", A13);
        if (num == AnonymousClass00R.A0C) {
            C17890vO.A11("report_type", "newsletters", A13);
        }
        C29621ca r5 = new C29621ca("gdpr", (AnonymousClass1MD[]) A13.toArray(new AnonymousClass1MD[0]));
        AnonymousClass1MD[] r4 = new AnonymousClass1MD[4];
        C17880vN.A1I(C173438v4.A00, "to", r4, 0);
        r4[1] = new AnonymousClass1MD("xmlns", "urn:xmpp:whatsapp:account");
        C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r4);
        C29621ca A012 = C29621ca.A01(r5, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T, r4);
        ? obj = new Object();
        C17880vN.A0U(r3).A0I(new AnonymousClass7LL(this, r11, obj, 6), A012, A0T, 167, 32000);
        return obj;
    }

    public C132086mB(AnonymousClass11P r1, AnonymousClass00H r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
