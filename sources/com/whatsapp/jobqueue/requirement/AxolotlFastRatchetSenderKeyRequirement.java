package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass10E;
import X.AnonymousClass1P3;
import X.C173408v1;
import X.C17900vP;
import X.C22488B9u;
import X.C27131Uv;
import android.content.Context;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class AxolotlFastRatchetSenderKeyRequirement implements Requirement, C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1P3 A00;
    public transient C27131Uv A01;
    public String groupJid = C173408v1.A00.getRawString();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r1 <= 0) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bfv() {
        /*
            r6 = this;
            X.1Uv r0 = r6.A01
            boolean r0 = r0.A0b()
            r5 = 1
            if (r0 == 0) goto L_0x0063
            X.1Uv r0 = r6.A01
            java.util.ArrayList r0 = r0.A0M()
            boolean r1 = r0.isEmpty()
            r4 = 0
            X.1Uv r0 = r6.A01
            if (r1 != 0) goto L_0x001c
            r0.A0c()
            return r4
        L_0x001c:
            com.whatsapp.jid.DeviceJid r0 = r0.A0L()
            X.2nE r1 = X.C63962tz.A02(r0)
            X.8v1 r0 = X.C173408v1.A00
            java.lang.String r0 = r0.getRawString()
            X.2nC r3 = new X.2nC
            r3.<init>(r1, r0)
            X.1P3 r1 = r6.A00
            X.1Os r0 = r1.A0H
            X.3Ez r2 = X.C25571Os.A01(r0, r3)
            r2.lock()
            X.1P2 r0 = r1.A05     // Catch:{ all -> 0x0059 }
            X.2bk r0 = r0.A00(r3)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0048
            byte[] r0 = r0.A01     // Catch:{ all -> 0x0059 }
            int r1 = r0.length     // Catch:{ all -> 0x0059 }
            r0 = 1
            if (r1 > 0) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r2.close()
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "AxolotlFastRatchetSenderKeyRequirement/empty sender key record; reset key"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Uv r0 = r6.A01
            r0.A0S()
            return r4
        L_0x0059:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x005e }
            throw r1
        L_0x005e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0063:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement.Bfv():boolean");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String rawString = C173408v1.A00.getRawString();
        String str = this.groupJid;
        if (!rawString.equals(str)) {
            throw new InvalidObjectException(AnonymousClass001.A1H("groupJid is not location Jid, only location Jid supported for now; groupJid=", str, AnonymousClass000.A10()));
        }
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) C17900vP.A04(context);
        this.A00 = (AnonymousClass1P3) r1.A9y.get();
        this.A01 = (C27131Uv) r1.A5p.get();
    }
}
