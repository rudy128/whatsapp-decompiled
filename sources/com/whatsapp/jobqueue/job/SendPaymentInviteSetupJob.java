package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1MD;
import X.AnonymousClass1OZ;
import X.C000100c;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C22488B9u;
import X.C22941Dw;
import X.C29621ca;
import X.C31061ex;
import X.C58762lD;
import X.C60132nR;
import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SendPaymentInviteSetupJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1OZ A00;
    public transient C31061ex A01;
    public final boolean inviteUsed;
    public final String jidRawStr;
    public final int paymentService;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPaymentInviteSetupJob(com.whatsapp.jid.UserJid r3, int r4, boolean r5) {
        /*
            r2 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.String r0 = "SendPaymentInviteSetupJob"
            X.AnonymousClass3EB.A00(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r2.<init>(r0)
            java.lang.String r0 = r3.getRawString()
            r2.jidRawStr = r0
            r2.paymentService = r4
            r2.inviteUsed = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPaymentInviteSetupJob.<init>(com.whatsapp.jid.UserJid, int, boolean):void");
    }

    private String A00() {
        StringBuilder A0d = C17890vO.A0d();
        A0d.append(this.jidRawStr);
        A0d.append("; service: ");
        A0d.append(this.paymentService);
        A0d.append("; inviteUsed: ");
        A0d.append(this.inviteUsed);
        C17900vP.A0q(A0d, this);
        return A0d.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jidRawStr)) {
            throw new InvalidObjectException("jid must not be empty");
        } else if (this.paymentService == 0) {
            throw new InvalidObjectException("payment service must not be unknown");
        }
    }

    public void A08() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: SendPaymentInviteSetupJob notif job added: ");
        C17890vO.A1A(A10, A00());
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("canceled SendPaymentInviteSetupJob job");
        C17890vO.A1B(A10, A00());
    }

    public void A0A() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: starting SendPaymentInviteSetupJob job");
        C17890vO.A1A(A10, A00());
        String A0C = this.A00.A0C();
        C58762lD r2 = new C58762lD();
        String str2 = this.jidRawStr;
        C22941Dw r1 = UserJid.Companion;
        r2.A02 = r1.A04(str2);
        r2.A06 = "notification";
        r2.A09 = "pay";
        r2.A08 = A0C;
        C60132nR A002 = r2.A00();
        UserJid A04 = r1.A04(this.jidRawStr);
        int i = this.paymentService;
        boolean z = this.inviteUsed;
        AnonymousClass1MD[] r6 = {new AnonymousClass1MD((Jid) A04, "to"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "pay"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0C)};
        C29621ca[] r3 = new C29621ca[1];
        AnonymousClass1MD[] r22 = new AnonymousClass1MD[3];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "account-set-up", r22, 0);
        if (i == 1) {
            str = "FBPAY";
        } else if (i == 2) {
            str = "NOVI";
        } else if (i != 3) {
            str = null;
        } else {
            str = "UPI";
        }
        C17960vV.A07(str);
        C17880vN.A1Q("service", str, r22, 1);
        r22[2] = new AnonymousClass1MD("invite-used", z ? 1 : 0);
        r3[0] = new C29621ca("invite", r22);
        this.A00.A08(new C29621ca("notification", r6, r3), A002, 272);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("PAY: done SendPaymentInviteSetupJob job");
        C17890vO.A1A(A102, A00());
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("exception while running SendPaymentInviteSetupJob job");
        C17890vO.A13(A00(), A10, exc);
        return true;
    }

    public void CIZ(Context context) {
        C000100c A04 = C17900vP.A04(context);
        this.A00 = A04.BAA();
        this.A01 = (C31061ex) ((AnonymousClass10E) A04).A8E.get();
    }
}
