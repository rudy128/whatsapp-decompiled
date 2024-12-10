package com.whatsapp.newsletter.mex;

import X.AnonymousClass10E;
import X.AnonymousClass1CJ;
import X.AnonymousClass1PY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.BCA;
import X.C17890vO;
import X.C18070vi;
import X.C20131A8r;
import X.C32991i5;
import android.content.Context;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;

public abstract class BaseNewsletterDirectoryV2GraphqlJob extends BaseNewslettersJob {
    public transient AnonymousClass1CJ A00;
    public transient C32991i5 A01;
    public transient AnonymousClass1PY A02;
    public transient C20131A8r A03;
    public BCA callback;

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        AnonymousClass10E r1 = (AnonymousClass10E) C17890vO.A0H(context);
        AnonymousClass1CJ A0d = AnonymousClass3Ma.A0d(r1);
        C18070vi.A0d(A0d, 0);
        this.A00 = A0d;
        AnonymousClass1PY A0l = AnonymousClass3Ma.A0l(r1);
        C18070vi.A0d(A0l, 0);
        this.A02 = A0l;
        C32991i5 A0G = AnonymousClass8BU.A0G(r1);
        C18070vi.A0d(A0G, 0);
        this.A01 = A0G;
        C20131A8r A0P = AnonymousClass8BT.A0P(r1);
        C18070vi.A0d(A0P, 0);
        this.A03 = A0P;
    }

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }
}
