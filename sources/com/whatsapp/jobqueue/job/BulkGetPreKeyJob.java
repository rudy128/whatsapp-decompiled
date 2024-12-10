package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass10E;
import X.AnonymousClass18K;
import X.AnonymousClass1OZ;
import X.AnonymousClass2FY;
import X.C000100c;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C22488B9u;
import X.C22971Dz;
import X.C26981Ug;
import X.C29351c6;
import X.C29431cG;
import X.C57842jj;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.whispersystems.jobqueue.Job;

public final class BulkGetPreKeyJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass18K A00;
    public transient C57842jj A01;
    public transient AnonymousClass1OZ A02;
    public final int context;
    public final String[] identityChangedJids;
    public final String[] jids;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BulkGetPreKeyJob(com.whatsapp.jid.DeviceJid[] r7, com.whatsapp.jid.DeviceJid[] r8, int r9) {
        /*
            r6 = this;
            X.9lc r2 = new X.9lc
            r2.<init>()
            r0 = 1
            r2.A02 = r0
            X.3EB r1 = new X.3EB
            r1.<init>()
            java.util.List r0 = r2.A01
            r0.add(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A00()
            r6.<init>(r0)
            java.util.List r0 = java.util.Arrays.asList(r7)
            java.lang.String[] r0 = X.C22971Dz.A0j(r0)
            X.C17960vV.A0J(r0)
            r6.jids = r0
            if (r8 != 0) goto L_0x0047
            r0 = 0
        L_0x0029:
            r6.identityChangedJids = r0
            r6.context = r9
            int r5 = r7.length
            r4 = 0
            r2 = 0
        L_0x0030:
            java.lang.String r3 = "jid must be an individual jid; jid="
            if (r2 >= r5) goto L_0x0064
            r1 = r7[r2]
            if (r1 == 0) goto L_0x005d
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 != 0) goto L_0x0050
            boolean r0 = X.C22971Dz.A0N(r1)
            if (r0 != 0) goto L_0x0050
            int r2 = r2 + 1
            goto L_0x0030
        L_0x0047:
            java.util.List r0 = java.util.Arrays.asList(r8)
            java.lang.String[] r0 = X.C22971Dz.A0j(r0)
            goto L_0x0029
        L_0x0050:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.AnonymousClass001.A1E(r1, r3, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x005d:
            java.lang.String r0 = "an element of jids was empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0064:
            if (r8 == 0) goto L_0x0090
            int r2 = r8.length
        L_0x0067:
            if (r4 >= r2) goto L_0x0090
            r1 = r8[r4]
            if (r1 == 0) goto L_0x0089
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 != 0) goto L_0x007c
            boolean r0 = X.C22971Dz.A0N(r1)
            if (r0 != 0) goto L_0x007c
            int r4 = r4 + 1
            goto L_0x0067
        L_0x007c:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.AnonymousClass001.A1E(r1, r3, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0089:
            java.lang.String r0 = "an element of identityChangedJids was empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.BulkGetPreKeyJob.<init>(com.whatsapp.jid.DeviceJid[], com.whatsapp.jid.DeviceJid[], int):void");
    }

    private String A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("; jids=");
        A10.append(C22971Dz.A09(this.jids));
        A10.append("; context=");
        return C17880vN.A0t(A10, this.context);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw new InvalidObjectException("jids must not be empty");
        }
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            DeviceJid A06 = DeviceJid.Companion.A06(strArr[i2]);
            if (A06 == null) {
                throw new InvalidObjectException("an element of jids was empty");
            } else if (C22971Dz.A0e(A06) || C22971Dz.A0N(A06)) {
                throw new InvalidObjectException(AnonymousClass001.A1E(A06, "jid must be an individual jid; jid=", AnonymousClass000.A10()));
            } else {
                i2++;
            }
        }
        String[] strArr2 = this.identityChangedJids;
        if (strArr2 != null) {
            int length2 = strArr2.length;
            while (i < length2) {
                DeviceJid A062 = DeviceJid.Companion.A06(strArr2[i]);
                if (A062 == null) {
                    throw new InvalidObjectException("an element of identityChangedJids was empty");
                } else if (C22971Dz.A0e(A062) || C22971Dz.A0N(A062)) {
                    throw new InvalidObjectException(AnonymousClass001.A1E(A062, "jid must be an individual jid; jid=", AnonymousClass000.A10()));
                } else {
                    i++;
                }
            }
        }
    }

    public void A08() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("bulk get pre key job added");
        C17890vO.A1A(A10, A00());
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("canceled bulk get pre key job");
        C17890vO.A1B(A10, A00());
    }

    public void A0A() {
        ArrayList A13;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("starting bulk get pre key job");
        C17890vO.A1A(A10, A00());
        String A0B = this.A02.A0B();
        Class<DeviceJid> cls = DeviceJid.class;
        ArrayList A0A = C22971Dz.A0A(cls, Arrays.asList(this.jids));
        String[] strArr = this.identityChangedJids;
        if (strArr != null) {
            A13 = C22971Dz.A0A(cls, Arrays.asList(strArr));
        } else {
            A13 = AnonymousClass000.A13();
        }
        C57842jj r6 = this.A01;
        if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(r6.A00), 10180)) {
            ArrayList A0k = C29431cG.A0k(A13, A0A);
            ArrayList A0D = C29351c6.A0D(A0k);
            Iterator it = A0k.iterator();
            while (it.hasNext()) {
                A0D.add(C17880vN.A0R(it).userJid);
            }
            r6.A00(C29431cG.A12(A0D));
        }
        if (this.context != 0) {
            AnonymousClass2FY r1 = new AnonymousClass2FY();
            r1.A00 = Boolean.valueOf(C17880vN.A1X(A13));
            r1.A02 = C17880vN.A0n(A0A.size());
            r1.A01 = Integer.valueOf(this.context);
            this.A00.CC7(r1);
        }
        AnonymousClass1OZ r62 = this.A02;
        Message obtain = Message.obtain((Handler) null, 0, 87, 0);
        obtain.getData().putString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B);
        obtain.getData().putParcelableArray("jids", (Jid[]) A0A.toArray(new DeviceJid[0]));
        obtain.getData().putParcelableArray("identityJids", (Jid[]) A13.toArray(new DeviceJid[0]));
        C17960vV.A08(A0B, "MessageClient/sendIq: id is null");
        C26981Ug r2 = new C26981Ug();
        Map map = r62.A05.A04;
        synchronized (map) {
            map.put(A0B, r2);
        }
        C17900vP.A0f("MessageClient/sendIq id=", A0B, AnonymousClass000.A10());
        AnonymousClass1OZ.A03(obtain, r62, false);
        r62.A07.A05(A0B);
        r2.get();
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("exception while running bulk get pre key job");
        C17890vO.A13(A00(), A10, exc);
        return true;
    }

    public void CIZ(Context context2) {
        C000100c A04 = C17900vP.A04(context2);
        this.A00 = A04.CS2();
        this.A02 = A04.BAA();
        this.A01 = (C57842jj) ((AnonymousClass10E) A04).A6u.get();
    }
}
