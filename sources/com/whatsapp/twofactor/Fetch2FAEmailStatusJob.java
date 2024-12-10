package com.whatsapp.twofactor;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass1MD;
import X.AnonymousClass1OZ;
import X.AnonymousClass37G;
import X.C000100c;
import X.C173438v4;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C22488B9u;
import X.C29621ca;
import X.C30891eg;
import X.C30901eh;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;
import org.whispersystems.jobqueue.Job;

public class Fetch2FAEmailStatusJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C30901eh A00;
    public transient C30891eg A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Fetch2FAEmailStatusJob() {
        /*
            r3 = this;
            X.9lc r2 = new X.9lc
            r2.<init>()
            r0 = 1
            r2.A02 = r0
            X.3EB r1 = new X.3EB
            r1.<init>()
            java.util.List r0 = r2.A01
            r0.add(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A00()
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.Fetch2FAEmailStatusJob.<init>():void");
    }

    public void A09() {
        Log.w("Fetch2FAEmailStatusJob/canceled");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.concurrent.Future, java.lang.Object] */
    public void A0A() {
        Log.i("Fetch2FAEmailStatusJob/onRun: asking for 2FA status");
        C30891eg r4 = this.A01;
        AnonymousClass00H r3 = r4.A01;
        String A0T = C17890vO.A0T(r3);
        C17900vP.A0f("TwoFactorXmppMethods/sendGetTwoFactorAuth; iq=", A0T, AnonymousClass000.A10());
        ? obj = new Object();
        AnonymousClass37G r7 = new AnonymousClass37G(r4, obj, 7);
        AnonymousClass1OZ A0U = C17880vN.A0U(r3);
        C29621ca r42 = new C29621ca("2fa", (AnonymousClass1MD[]) null);
        AnonymousClass1MD[] r32 = new AnonymousClass1MD[4];
        r32[0] = new AnonymousClass1MD((Jid) C173438v4.A00, "to");
        r32[1] = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T);
        C17890vO.A12("xmlns", "urn:xmpp:whatsapp:account", r32);
        A0U.A0N(r7, C29621ca.A01(r42, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r32), A0T, 114, 32000);
        try {
            obj.get(32000, TimeUnit.MILLISECONDS);
            if (C17890vO.A00(C30901eh.A00(this.A00), "two_factor_auth_email_set") == 0) {
                Log.w("Fetch2FAEmailStatusJob/onRun: email status fetching failed");
                throw new Exception("Failing Fetch2FAEmailStatusJob, fetching status failed");
            }
        } catch (Exception unused) {
            Log.i("Fetch2FAEmailStatusJob/onRun: timeout waiting for response");
            throw new Exception("Failing Fetch2FAEmailStatusJob, timeout for response");
        }
    }

    public boolean A0C(Exception exc) {
        Log.w("Fetch2FAEmailStatusJob/exception", exc);
        return true;
    }

    public void A08() {
    }

    public void CIZ(Context context) {
        C000100c A04 = C17900vP.A04(context);
        this.A01 = A04.BAB();
        this.A00 = (C30901eh) ((AnonymousClass10E) A04).AB1.get();
    }
}
