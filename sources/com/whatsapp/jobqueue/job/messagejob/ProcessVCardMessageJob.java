package com.whatsapp.jobqueue.job.messagejob;

import X.AnonymousClass10E;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass1M9;
import X.AnonymousClass1QY;
import X.C000100c;
import X.C17890vO;
import X.C18000vb;
import X.C218017l;
import X.C34481kY;
import android.content.Context;

public class ProcessVCardMessageJob extends AsyncMessageJob {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1M9 A00;
    public transient AnonymousClass11C A01;
    public transient AnonymousClass118 A02;
    public transient C18000vb A03;
    public transient C218017l A04;
    public transient AnonymousClass1QY A05;
    public transient C34481kY A06;

    public void CIZ(Context context) {
        super.CIZ(context);
        C000100c A0H = C17890vO.A0H(context);
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A02 = (AnonymousClass118) r1.ABY.get();
        this.A06 = (C34481kY) r1.ABK.get();
        this.A00 = AnonymousClass10E.A4z(r1);
        this.A01 = (AnonymousClass11C) r1.AAp.get();
        this.A03 = A0H.CS9();
        this.A04 = (C218017l) r1.A8w.get();
        this.A05 = (AnonymousClass1QY) r1.ABL.get();
    }
}
