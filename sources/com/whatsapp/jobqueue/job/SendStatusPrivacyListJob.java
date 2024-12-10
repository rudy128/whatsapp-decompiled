package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1MD;
import X.AnonymousClass1OZ;
import X.C173438v4;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import X.C186279dw;
import X.C20989Ach;
import X.C20996Aco;
import X.C22488B9u;
import X.C22971Dz;
import X.C29351c6;
import X.C29621ca;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.whispersystems.jobqueue.Job;

public final class SendStatusPrivacyListJob extends Job implements C22488B9u {
    public static volatile long A01 = 0;
    @Deprecated
    public static final long serialVersionUID = 1;
    public transient C186279dw A00;
    public final Collection jids;
    public final int statusDistribution;

    public void A08() {
    }

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        Context applicationContext = context.getApplicationContext();
        C18070vi.A0X(applicationContext);
        this.A00 = AnonymousClass10G.ADc(((AnonymousClass10E) C17890vO.A0H(applicationContext)).Ao8.A00);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendStatusPrivacyListJob(java.util.Collection r3, int r4) {
        /*
            r2 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.String r0 = "SendStatusPrivacyListJob"
            X.AnonymousClass3EB.A00(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r2.<init>(r0)
            r2.statusDistribution = r4
            if (r3 == 0) goto L_0x001c
            java.util.ArrayList r0 = X.C22971Dz.A0B(r3)
        L_0x0019:
            r2.jids = r0
            return
        L_0x001c:
            r0 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendStatusPrivacyListJob.<init>(java.util.Collection, int):void");
    }

    public void A07(long j) {
        this.A01 = j;
        A01 = j;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("set persistent id for send status privacy job");
        C17890vO.A1A(A10, A00());
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.concurrent.Future, java.lang.Object] */
    public void A0A() {
        ArrayList arrayList;
        C29621ca[] r8;
        String str;
        if (A01 != this.A01) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("skip send status privacy job");
            A10.append(A00());
            A10.append("; lastJobId=");
            C17890vO.A16(A10, A01);
            return;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("run send status privacy job");
        C17890vO.A1A(A102, A00());
        AtomicInteger atomicInteger = new AtomicInteger();
        C186279dw r82 = this.A00;
        if (r82 != null) {
            int i = this.statusDistribution;
            Collection collection = this.jids;
            if (collection != null) {
                arrayList = AnonymousClass000.A13();
                C22971Dz.A0G(AnonymousClass1BI.class, collection, arrayList);
            } else {
                arrayList = null;
            }
            C20989Ach ach = new C20989Ach(atomicInteger, 2);
            ? obj = new Object();
            AnonymousClass00H r0 = r82.A02;
            String A0T = C17890vO.A0T(r0);
            AnonymousClass1OZ A0U = C17880vN.A0U(r0);
            if (arrayList == null || arrayList.size() <= 0) {
                r8 = null;
            } else {
                ArrayList A0D = C29351c6.A0D(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass1MD[] r1 = new AnonymousClass1MD[1];
                    C17880vN.A1I(C17880vN.A0S(it), "jid", r1, 0);
                    C29621ca.A05(PublicKeyCredentialControllerUtility.JSON_KEY_USER, A0D, r1);
                }
                r8 = (C29621ca[]) A0D.toArray(new C29621ca[0]);
            }
            if (i == 0) {
                str = "contacts";
            } else if (i != 1) {
                str = "blacklist";
            } else {
                str = "whitelist";
            }
            AnonymousClass1MD[] r6 = new AnonymousClass1MD[1];
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, r6, 0);
            C29621ca r83 = new C29621ca(new C29621ca("list", r6, r8), "privacy", (AnonymousClass1MD[]) null);
            AnonymousClass1MD[] r62 = new AnonymousClass1MD[4];
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T, r62, 0);
            C17880vN.A1Q("xmlns", "status", r62, 1);
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r62, 2);
            A0U.A0N(new C20996Aco(obj, ach, 20), C29621ca.A00(C173438v4.A00, r83, r62), A0T, 120, 32000);
            obj.get();
        }
        int i2 = atomicInteger.get();
        if (i2 == 500) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("server 500 error during send status privacy job");
            throw new Exception(AnonymousClass000.A0y(A00(), A103));
        } else if (i2 != 0) {
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append("server error code returned during send status privacy job; errorCode=");
            A104.append(i2);
            C17890vO.A1B(A104, A00());
        }
    }

    private final String A00() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("; statusDistribution=");
        A10.append(this.statusDistribution);
        A10.append("; jids=");
        Collection collection = this.jids;
        if (collection != null) {
            ArrayList A0z = C17880vN.A0z(collection.size());
            C22971Dz.A0I(collection, A0z);
            str = Arrays.toString(A0z.toArray(new Jid[0]));
            C18070vi.A0X(str);
        } else {
            str = "null";
        }
        A10.append(str);
        C17900vP.A0q(A10, this);
        return A10.toString();
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("canceled send status privacy job");
        C17890vO.A1B(A10, A00());
    }

    public boolean A0C(Exception exc) {
        StringBuilder A0K = C18070vi.A0K(exc);
        A0K.append("exception while running send status privacy job");
        C17890vO.A13(A00(), A0K, exc);
        return true;
    }
}
