package com.whatsapp.jobqueue.job.messagejob;

import X.AnonymousClass10E;
import X.AnonymousClass1QB;
import X.C17890vO;
import android.content.Context;

public final class AsyncMessageTokenizationJob extends AsyncMessageJob {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1QB A00;

    public void CIZ(Context context) {
        super.CIZ(context);
        this.A00 = (AnonymousClass1QB) ((AnonymousClass10E) C17890vO.A0H(context)).A4T.get();
    }
}
