package com.whatsapp.jobqueue.job;

import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass1NU;
import X.C000100c;
import X.C17890vO;
import X.C22488B9u;
import android.content.Context;
import java.util.Random;
import org.whispersystems.jobqueue.Job;

public final class DeleteAccountFromHsmServerJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1NU A00;
    public transient AnonymousClass10I A01;
    public transient Random A02;

    public void CIZ(Context context) {
        C000100c A0H = C17890vO.A0H(context);
        this.A02 = new Random();
        this.A01 = A0H.CRy();
        this.A00 = (AnonymousClass1NU) ((AnonymousClass10E) A0H).A3g.get();
    }
}
