package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7LM  reason: invalid class name */
public class AnonymousClass7LM implements AnonymousClass1O5 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass7LM(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r0 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        if (r1 > 4) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        r0 = new X.C162168Jj();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        r2.A00(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BrD(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.String r0 = "DisclosureResetOnServerWorker/onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r3.A03
            X.A2q r0 = (X.C20001A2q) r0
            androidx.work.WorkerParameters r0 = r0.A01
            int r1 = r0.A00
            r0 = 4
            java.lang.Object r2 = r3.A02
            X.CYi r2 = (X.C25113CYi) r2
            if (r1 <= r0) goto L_0x0041
            goto L_0x0034
        L_0x001b:
            java.lang.String r0 = "DisclosureMetadataGetWorker/onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r2 = r3.A03
            com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker r2 = (com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker) r2
            androidx.work.WorkerParameters r0 = r2.A01
            int r1 = r0.A00
            r0 = 4
            if (r1 <= r0) goto L_0x003d
            int r0 = r3.A01
            com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker.A00(r2, r0)
            java.lang.Object r2 = r3.A02
            X.CYi r2 = (X.C25113CYi) r2
        L_0x0034:
            X.8Jj r0 = new X.8Jj
            r0.<init>()
        L_0x0039:
            r2.A00(r0)
            return
        L_0x003d:
            java.lang.Object r2 = r3.A02
            X.CYi r2 = (X.C25113CYi) r2
        L_0x0041:
            X.8Ji r0 = new X.8Ji
            r0.<init>()
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LM.BrD(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r1 > 4) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r0 = new X.C162168Jj();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        r2.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        r0 = new java.lang.Object();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bt9(X.C29621ca r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            android.util.Pair r2 = X.C60482o6.A01(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DisclosureResetOnServerWorker/onError "
            X.C17900vP.A0X(r2, r0, r1)
            if (r2 == 0) goto L_0x002c
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x002c
            int r1 = r0.intValue()
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x002c
            java.lang.String r0 = "DisclosureResetOnServerWorker/onError invalid stanza"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x002c:
            java.lang.Object r0 = r3.A03
            X.A2q r0 = (X.C20001A2q) r0
            androidx.work.WorkerParameters r0 = r0.A01
            int r1 = r0.A00
            r0 = 4
            java.lang.Object r2 = r3.A02
            X.CYi r2 = (X.C25113CYi) r2
            if (r1 <= r0) goto L_0x0083
            goto L_0x0076
        L_0x003c:
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            android.util.Pair r2 = X.C60482o6.A01(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DisclosureMetadataGetWorker/onError "
            X.C17900vP.A0X(r2, r0, r1)
            if (r2 == 0) goto L_0x0062
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0062
            int r1 = r0.intValue()
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x0062
            java.lang.String r0 = "DisclosureMetadataGetWorker/onError invalid stanza"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0062:
            java.lang.Object r2 = r3.A03
            com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker r2 = (com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker) r2
            androidx.work.WorkerParameters r0 = r2.A01
            int r1 = r0.A00
            r0 = 4
            if (r1 <= r0) goto L_0x007f
            int r0 = r3.A01
            com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker.A00(r2, r0)
            java.lang.Object r2 = r3.A02
            X.CYi r2 = (X.C25113CYi) r2
        L_0x0076:
            X.8Jj r0 = new X.8Jj
            r0.<init>()
        L_0x007b:
            r2.A00(r0)
            return
        L_0x007f:
            java.lang.Object r2 = r3.A02
            X.CYi r2 = (X.C25113CYi) r2
        L_0x0083:
            X.8Ji r0 = new X.8Ji
            r0.<init>()
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LM.Bt9(X.1ca, java.lang.String):void");
    }

    public void C7Z(C29621ca r20, String str) {
        C33511iw A002;
        switch (this.A00) {
            case 0:
                C29621ca r1 = r20;
                C18070vi.A0d(r1, 1);
                DisclosureMetadataGetWorker disclosureMetadataGetWorker = (DisclosureMetadataGetWorker) this.A03;
                int i = this.A01;
                List<C29621ca> A0R = r1.A0R("notice");
                ArrayList A0t = C108965cb.A0t(A0R);
                boolean z = false;
                for (C29621ca r9 : A0R) {
                    int A09 = r9.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    int A092 = r9.A09("stage");
                    long A0C = 1000 * r9.A0C("t");
                    int A093 = r9.A09("version");
                    if (r9.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 0) != 2 || A092 <= -1 || A092 >= 1000) {
                        C17900vP.A0k("DisclosureMetadataGetWorker/parseUserNoticeMetadataList not valid PDFN metadata id = ", AnonymousClass000.A10(), A09);
                    } else {
                        A0t.add(new C63592tN(A09, A092, A093, A0C, 2));
                        if (A09 == i) {
                            z = true;
                        }
                    }
                }
                if (C17880vN.A1X(A0t) && (A002 = disclosureMetadataGetWorker.A02.A00(2)) != null) {
                    A002.BcE(A0t, false, false);
                }
                if (!z) {
                    DisclosureMetadataGetWorker.A00(disclosureMetadataGetWorker, i);
                    break;
                }
                break;
            case 1:
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("DisclosureResetOnServerWorker/onsuccess disclosureId = ");
                C17900vP.A0o(A10, this.A01);
                break;
            default:
                return;
        }
        ((C25113CYi) this.A02).A00(new C162178Jk());
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
