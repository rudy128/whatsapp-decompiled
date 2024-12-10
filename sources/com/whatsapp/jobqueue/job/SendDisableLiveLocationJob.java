package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass1BI;
import X.AnonymousClass1MD;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C22488B9u;
import X.C27101Us;
import X.C27131Uv;
import X.C29621ca;
import X.C58762lD;
import X.C60132nR;
import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SendDisableLiveLocationJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C27131Uv A00;
    public transient C27101Us A01;
    public final String rawJid;
    public final long sequenceNumber;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendDisableLiveLocationJob(X.AnonymousClass1BI r5, long r6) {
        /*
            r4 = this;
            X.9lc r3 = new X.9lc
            r3.<init>()
            java.lang.String r0 = r5.getRawString()
            r3.A00 = r0
            r2 = 1
            r3.A02 = r2
            X.3EB r1 = new X.3EB
            r1.<init>()
            java.util.List r0 = r3.A01
            r0.add(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r3.A00()
            r4.<init>(r0)
            X.C17960vV.A0C(r2)
            java.lang.String r0 = r5.getRawString()
            r4.rawJid = r0
            r4.sequenceNumber = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendDisableLiveLocationJob.<init>(X.1BI, long):void");
    }

    private String A00() {
        AnonymousClass1BI A02 = AnonymousClass1BI.A00.A02(this.rawJid);
        StringBuilder A0d = C17890vO.A0d();
        A0d.append(A02);
        C17900vP.A0q(A0d, this);
        return A0d.toString();
    }

    public void A0A() {
        String str;
        AnonymousClass1BI A02 = AnonymousClass1BI.A00.A02(this.rawJid);
        if (A02 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("skip disable live location job; invalid jid: ");
            C17890vO.A19(A10, this.rawJid);
            return;
        }
        boolean A0d = this.A00.A0d(A02);
        StringBuilder A102 = AnonymousClass000.A10();
        if (A0d) {
            str = "skip disable live location job; sharing is currently enabled";
        } else {
            A102.append("starting disable live location job");
            C17890vO.A1A(A102, A00());
            C27101Us r0 = this.A01;
            long j = this.sequenceNumber;
            AnonymousClass00H r8 = r0.A02;
            String A0C = C17880vN.A0U(r8).A0C();
            C58762lD r02 = new C58762lD();
            r02.A02 = A02;
            r02.A06 = "notification";
            r02.A09 = "location";
            r02.A08 = A0C;
            C60132nR A002 = r02.A00();
            AnonymousClass1MD[] r5 = new AnonymousClass1MD[3];
            boolean A1W = C17890vO.A1W(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0C, r5);
            r5[1] = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location");
            r5[2] = new AnonymousClass1MD((Jid) A02, "to");
            AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.toString(j), r2, A1W ? 1 : 0);
            C17880vN.A0U(r8).A08(new C29621ca(new C29621ca("disable", r2), "notification", r5), A002, 81).get();
            A102 = AnonymousClass000.A10();
            str = "done disable live location job";
        }
        A102.append(str);
        C17890vO.A1A(A102, A00());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawJid)) {
            throw new InvalidObjectException("jid must not be empty");
        }
    }

    public void A08() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("disable live location job added");
        C17890vO.A1A(A10, A00());
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("canceled disable live location job");
        C17890vO.A1B(A10, A00());
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("exception while running disable live location job");
        C17890vO.A13(A00(), A10, exc);
        return true;
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) C17900vP.A04(context);
        this.A01 = (C27101Us) r1.A5r.get();
        this.A00 = (C27131Uv) r1.A5p.get();
    }
}
