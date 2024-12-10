package com.whatsapp.imagineme.cron;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1OX;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass6RD;
import X.C000100c;
import X.C1408073d;
import X.C151417mG;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C20001A2q;
import X.C30391dr;
import X.C38731rn;
import X.C38761rq;
import X.EEC;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.whatsapp.imagineme.ImagineMeOnboardingRequester;

public final class ImagineMeGetOnboardedStateWorker extends C20001A2q {
    public final C000100c A00;
    public final C38731rn A01;
    public final C1408073d A02;
    public final ImagineMeOnboardingRequester A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C151417mG(this));
    public final C18600wl A05;
    public final C38761rq A06;
    public final AnonymousClass1OX A07;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.EEC, java.lang.Object, X.5qs] */
    public EEC A08() {
        ? obj = new Object();
        boolean A012 = this.A01.A01();
        boolean A052 = this.A06.A05(AnonymousClass6RD.META_AI_IMAGINE_ME_TOS);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onboardingComplete=");
        A10.append(A012);
        String A0D = C17900vP.A0D(", tosAccepted=", A10, A052);
        AnonymousClass3MX.A1Q(new ImagineMeGetOnboardedStateWorker$startWork$1(obj, this, A0D, (C30391dr) null), this.A07);
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagineMeGetOnboardedStateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        this.A00 = A0H;
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A05 = AnonymousClass3MZ.A1B(r1);
        this.A06 = (C38761rq) r1.A1A.get();
        this.A07 = (AnonymousClass1OX) r1.A9C.get();
        this.A02 = (C1408073d) r1.A11.get();
        this.A01 = (C38731rn) r1.A6o.get();
        this.A03 = AnonymousClass10G.A5k(r1.Ao8.A00);
    }
}
