package com.whatsapp.jobqueue.job;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass8BX;
import X.C186279dw;
import X.C22488B9u;
import X.C24661Le;
import X.C41911xI;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public final class GetStatusPrivacyJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C24661Le A00;
    public transient C186279dw A01;
    public transient C41911xI A02;

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) AnonymousClass8BX.A0H(context);
        this.A00 = (C24661Le) r1.AAJ.get();
        this.A01 = AnonymousClass10G.ADc(r1.Ao8.A00);
        this.A02 = (C41911xI) r1.AAl.get();
    }
}
