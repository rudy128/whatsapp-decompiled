package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass11S;
import X.AnonymousClass190;
import X.C000100c;
import X.C000200d;
import X.C17890vO;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C191919nP;
import X.C19830z4;
import X.C19890zB;
import X.C22488B9u;
import X.C22941Dw;
import X.C32501hI;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class GetVNameCertificateJob extends Job implements C22488B9u {
    public static final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public static final long serialVersionUID = 1;
    public transient int A00 = 0;
    public transient C18030ve A01;
    public transient C32501hI A02;
    public transient C191919nP A03;
    public final String jid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GetVNameCertificateJob(com.whatsapp.jid.UserJid r5) {
        /*
            r4 = this;
            X.9lc r3 = new X.9lc
            r3.<init>()
            java.lang.String r0 = r5.getRawString()
            r3.A00 = r0
            r0 = 1
            r3.A02 = r0
            X.3EB r0 = new X.3EB
            r0.<init>()
            java.util.List r2 = r3.A01
            r2.add(r0)
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r1 = r5.getPrimaryDevice()
            X.C17960vV.A07(r1)
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r1)
            r2.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r3.A00()
            r4.<init>(r0)
            r0 = 0
            r4.A00 = r0
            java.lang.String r0 = r5.getRawString()
            X.C17960vV.A06(r0)
            r4.jid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GetVNameCertificateJob.<init>(com.whatsapp.jid.UserJid):void");
    }

    private String A00() {
        StringBuilder A0d = C17890vO.A0d();
        A0d.append(C22941Dw.A02(this.jid));
        C17900vP.A0q(A0d, this);
        return A0d.toString();
    }

    public void A08() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GetVNameCertificateJob/onAdded");
        C17890vO.A1A(A10, A00());
        A04.put(this.jid, Boolean.TRUE);
        for (Requirement requirement : this.parameters.requirements) {
            if (requirement instanceof AxolotlSessionRequirement) {
                AxolotlSessionRequirement axolotlSessionRequirement = (AxolotlSessionRequirement) requirement;
                if (!axolotlSessionRequirement.Bfv()) {
                    this.A02.A04(new DeviceJid[]{axolotlSessionRequirement.A00}, 2, false);
                }
            }
        }
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GetVNameCertificateJob/canceled get vname certificate job");
        C17890vO.A1B(A10, A00());
        A04.remove(this.jid);
    }

    public void A0A() {
        try {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GetVNameCertificateJob/onRun, starting get vname certificate job");
            C17890vO.A1A(A10, A00());
            C191919nP r2 = this.A03;
            String str = this.jid;
            C22941Dw r0 = UserJid.Companion;
            r2.A00(C22941Dw.A03(str)).get();
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("GetVNameCertificateJob/onRun, finished get vname certificate job");
            C17890vO.A1A(A102, A00());
            A04.remove(this.jid);
            return;
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            A04.remove(this.jid);
            throw th;
        }
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GetVNameCertificateJob/onShouldRetry, exception while running get vname certificate job");
        C17890vO.A13(A00(), A10, exc);
        C18030ve r2 = this.A01;
        if (r2 != null && C18020vd.A05(C18040vf.A02, r2, 10355)) {
            int i = this.A00;
            this.A00 = i + 1;
            if (i >= 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void CIZ(Context context) {
        C000100c A0H = C17890vO.A0H(context);
        AnonymousClass10E r0 = (AnonymousClass10E) A0H;
        C18030ve A8r = AnonymousClass10E.A8r(r0);
        AnonymousClass11S A17 = AnonymousClass10E.A17(r0);
        AnonymousClass00H A002 = C000200d.A00(r0.A6N);
        AnonymousClass00H A003 = C000200d.A00(r0.AC1);
        AnonymousClass00H A004 = C000200d.A00(r0.A1M);
        AnonymousClass00H A005 = C000200d.A00(r0.ABM);
        this.A03 = new C191919nP(C19890zB.A00, (AnonymousClass190) r0.A31.get(), A17, (C19830z4) r0.ABl.get(), A8r, A002, A003, A004, A005, C000200d.A00(r0.ABN), C000200d.A00(r0.A7h), C000200d.A00(r0.A7j), C000200d.A00(r0.A7i));
        this.A02 = (C32501hI) r0.A8Y.get();
        this.A01 = A0H.BAL();
    }
}
