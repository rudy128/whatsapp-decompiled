package com.whatsapp.newsletter.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1BI;
import X.AnonymousClass1MD;
import X.AnonymousClass1OZ;
import X.AnonymousClass206;
import X.AnonymousClass3KP;
import X.C000100c;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C22488B9u;
import X.C29621ca;
import X.C29681ch;
import X.C32331h1;
import X.C32471hF;
import X.C58762lD;
import X.C60132nR;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.whispersystems.jobqueue.Job;

public final class SendViewReceiptJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C32331h1 A00;
    public transient C29681ch A01;
    public transient AnonymousClass1OZ A02;
    public transient C32471hF A03;
    public final String newsletterRawJid;
    public String receiptStanzaId;
    public List serverMessageIds;

    public boolean A0C(Exception exc) {
        return true;
    }

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        C000100c A0H = C17890vO.A0H(context);
        this.A02 = A0H.BAA();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A03 = (C32471hF) r1.A7Q.get();
        this.A00 = (C32331h1) r1.A6d.get();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendViewReceiptJob(X.C29681ch r4, java.lang.String r5, java.util.List r6) {
        /*
            r3 = this;
            X.9lc r2 = new X.9lc
            r2.<init>()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "view-receipt-"
            r1.append(r0)
            java.lang.String r0 = r4.getRawString()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r2.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = X.AnonymousClass3EC.A00(r2)
            r3.<init>(r0)
            r3.A01 = r4
            r3.receiptStanzaId = r5
            r3.serverMessageIds = r6
            java.lang.String r0 = r4.getRawString()
            r3.newsletterRawJid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.jobqueue.job.SendViewReceiptJob.<init>(X.1ch, java.lang.String, java.util.List):void");
    }

    private final String A00() {
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(this.newsletterRawJid);
        StringBuilder A0d = C17890vO.A0d();
        A0d.append(A022);
        A0d.append("; id=");
        A0d.append(C17880vN.A05(this.serverMessageIds.get(0)));
        A0d.append("; count=");
        return C17880vN.A0t(A0d, this.serverMessageIds.size());
    }

    public void A0A() {
        A00();
        C29681ch A012 = C29681ch.A03.A01(this.newsletterRawJid);
        if (A012 != null) {
            List list = this.serverMessageIds;
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : list) {
                long A05 = C17880vN.A05(next);
                C32471hF r2 = this.A03;
                if (r2 == null) {
                    C18070vi.A11("newsletterMessageStore");
                    throw null;
                }
                AnonymousClass206 A022 = r2.A02(A012, A05);
                if (!(A05 <= 0 || A022 == null || A022.A0D() == 16)) {
                    A13.add(next);
                }
            }
            if (!A13.isEmpty()) {
                C58762lD r1 = new C58762lD();
                r1.A02 = A012;
                r1.A06 = "receipt";
                r1.A09 = "view";
                r1.A08 = this.receiptStanzaId;
                C60132nR A002 = r1.A00();
                String str = this.receiptStanzaId;
                ArrayList A132 = AnonymousClass000.A13();
                C17890vO.A0n(A012, "to", A132);
                C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A132);
                C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "view", A132);
                AnonymousClass1MD[] r9 = (AnonymousClass1MD[]) A132.toArray(new AnonymousClass1MD[0]);
                ArrayList A133 = AnonymousClass000.A13();
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    C29621ca.A05("item", A133, new AnonymousClass1MD[]{new AnonymousClass1MD("server_id", C17890vO.A07(it))});
                }
                C29621ca r22 = new C29621ca(new C29621ca("list", (AnonymousClass1MD[]) null, C17890vO.A1Y(A133, 0)), "receipt", r9);
                AnonymousClass1OZ r12 = this.A02;
                if (r12 == null) {
                    C18070vi.A11("messageClient");
                    throw null;
                }
                r12.A08(r22, A002, 407).get();
                Iterator it2 = A13.iterator();
                while (it2.hasNext()) {
                    long A07 = C17890vO.A07(it2);
                    C32471hF r0 = this.A03;
                    if (r0 == null) {
                        C18070vi.A11("newsletterMessageStore");
                        throw null;
                    }
                    AnonymousClass206 A023 = r0.A02(A012, A07);
                    if (A023 != null) {
                        C32331h1 r13 = this.A00;
                        if (r13 == null) {
                            C18070vi.A11("messageStatusStoreBridge");
                            throw null;
                        }
                        r13.A01((AnonymousClass3KP) null, A023.A0v, 16);
                    }
                }
            }
        }
    }

    public void A08() {
        A00();
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendViewReceiptJob/onAdded; ");
        C17890vO.A1B(A10, A00());
    }
}
