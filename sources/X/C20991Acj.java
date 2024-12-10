package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import java.util.HashMap;

/* renamed from: X.Acj  reason: case insensitive filesystem */
public class C20991Acj implements AnonymousClass1O5 {
    public HashMap A00 = C17880vN.A11();
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass9XX A04;
    public final AnonymousClass1OZ A05;

    private void A00(C186779ek r6, boolean z) {
        C171098rA r4 = new C171098rA();
        int i = 4;
        if (r6.A02) {
            i = 3;
        }
        r4.A01 = Integer.valueOf(i);
        r4.A00 = Boolean.valueOf(z);
        r4.A03 = C108945cZ.A1B(AnonymousClass11P.A01(this.A01), r6.A00);
        AnonymousClass1EC r2 = r6.A01;
        String str = r2.user;
        C36321nh r0 = GroupJid.Companion;
        if (C36321nh.A02(str)) {
            r4.A04 = r2.getRawString();
        }
        this.A03.CC7(r4);
    }

    public void A01(AnonymousClass1EC r17, boolean z) {
        String str;
        AnonymousClass1OZ r6 = this.A05;
        String A0B = r6.A0B();
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
        boolean z2 = z;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        boolean A1W = C17890vO.A1W("state", str, r2);
        C29621ca r3 = new C29621ca(AnonymousClass8BR.A0k("group_join", r2), "membership_approval_mode", (AnonymousClass1MD[]) null);
        AnonymousClass1MD[] r22 = new AnonymousClass1MD[4];
        C17880vN.A1Q("xmlns", "w:g2", r22, A1W ? 1 : 0);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, r22, 1);
        C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r22);
        AnonymousClass1EC r12 = r17;
        C29621ca A002 = C29621ca.A00(r12, r3, r22);
        this.A00.put(A0B, new C186779ek(this, r12, AnonymousClass11P.A01(this.A01), z2));
        r6.A0N(this, A002, A0B, 337, 20000);
    }

    public void BrD(String str) {
        AnonymousClass126 r1 = this.A04.A00.A0T;
        r1.A0O(1008, (Object) null);
        r1.A0O(3012, (Object) null);
        C186779ek r12 = (C186779ek) this.A00.get(str);
        if (r12 != null) {
            A00(r12, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r1 != 500) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bt9(X.C29621ca r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "error"
            X.1ca r2 = r5.A0K(r0)
            r1 = -2
            if (r2 == 0) goto L_0x000f
            java.lang.String r0 = "code"
            int r1 = r2.A0A(r0, r1)
        L_0x000f:
            X.9XX r3 = r4.A04
            r0 = -2
            r2 = 0
            if (r1 == r0) goto L_0x0058
            r0 = -1
            if (r1 == r0) goto L_0x004f
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x0058
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0045
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x003b
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0058
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x0058
        L_0x002c:
            java.util.HashMap r0 = r4.A00
            java.lang.Object r1 = r0.get(r6)
            X.9ek r1 = (X.C186779ek) r1
            if (r1 == 0) goto L_0x003a
            r0 = 0
            r4.A00(r1, r0)
        L_0x003a:
            return
        L_0x003b:
            X.8GZ r0 = r3.A00
            X.126 r1 = r0.A0T
            r0 = 3011(0xbc3, float:4.22E-42)
            r1.A0O(r0, r2)
            goto L_0x002c
        L_0x0045:
            X.8GZ r0 = r3.A00
            X.126 r1 = r0.A0T
            r0 = 3010(0xbc2, float:4.218E-42)
            r1.A0O(r0, r2)
            goto L_0x002c
        L_0x004f:
            X.8GZ r0 = r3.A00
            X.126 r1 = r0.A0T
            r0 = 1008(0x3f0, float:1.413E-42)
            r1.A0O(r0, r2)
        L_0x0058:
            X.8GZ r0 = r3.A00
            X.126 r1 = r0.A0T
            r0 = 3012(0xbc4, float:4.221E-42)
            r1.A0O(r0, r2)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20991Acj.Bt9(X.1ca, java.lang.String):void");
    }

    public void C7Z(C29621ca r3, String str) {
        C186779ek r1 = (C186779ek) this.A00.get(str);
        if (r1 != null) {
            A00(r1, true);
        }
    }

    public C20991Acj(AnonymousClass11P r2, C18030ve r3, AnonymousClass18K r4, AnonymousClass9XX r5, AnonymousClass1OZ r6) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
