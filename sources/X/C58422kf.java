package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.2kf  reason: invalid class name and case insensitive filesystem */
public final class C58422kf {
    public final AnonymousClass1OZ A00;
    public final C22510BAr A01;

    public C58422kf(C22510BAr bAr, AnonymousClass1OZ r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
        this.A01 = bAr;
    }

    public final void A01(GroupJid groupJid, String str, String str2) {
        A00((GroupJid) null, groupJid, this.A00.A0B(), str, str2, "preview", "blob");
    }

    public final void A00(GroupJid groupJid, GroupJid groupJid2, String str, String str2, String str3, String str4, String str5) {
        String str6;
        C29621ca r2;
        AnonymousClass1OZ r4 = this.A00;
        GroupJid groupJid3 = groupJid2;
        Jid jid = groupJid3;
        String str7 = str3;
        String str8 = str2;
        AnonymousClass1MD[] r7 = new AnonymousClass1MD[(true + (AnonymousClass000.A1W(str7) ? 1 : 0) + (AnonymousClass000.A1W(str8) ? 1 : 0))];
        C17880vN.A1Q("query", str5, r7, 0);
        String str9 = str4;
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str9, r7, 1);
        int i = 2;
        if (str3 != null) {
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str7, r7, 2);
            i = 3;
        }
        GroupJid groupJid4 = groupJid;
        if (str2 != null) {
            C17880vN.A1Q("invite", str8, r7, i);
            r2 = new C29621ca("picture", r7);
            if (groupJid2 == null) {
                jid = C173428v3.A00;
            }
        } else {
            C17960vV.A07(groupJid4);
            C18070vi.A0X(groupJid4);
            GroupJid groupJid5 = groupJid4;
            if (groupJid2 == null) {
                str6 = "parent_group";
            } else {
                str6 = "sub_group";
                groupJid5 = groupJid3;
            }
            AnonymousClass1MD[] r22 = new AnonymousClass1MD[2];
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str6, r22, 0);
            C17880vN.A1I(groupJid5, "jid", r22, 1);
            r2 = new C29621ca(new C29621ca("query_linked", r22), "picture", r7);
            C17960vV.A07(groupJid4);
            jid = groupJid4;
        }
        AnonymousClass1MD[] r72 = new AnonymousClass1MD[4];
        String str10 = str;
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str10, r72, 0);
        C17880vN.A1Q("xmlns", "w:g2", r72, 1);
        C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r72);
        r4.A0I(new C20981AcZ(this.A01, groupJid3, groupJid4, str9, str7), C29621ca.A00(jid, r2, r72), str10, 300, 32000);
    }
}
