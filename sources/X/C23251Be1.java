package X;

import com.google.android.gms.common.api.Status;

/* renamed from: X.Be1  reason: case insensitive filesystem */
public final class C23251Be1 extends C23252Be2 {
    public final BZR A00;
    public final /* synthetic */ BYH A01;

    public C23251Be1(BYH byh, BZR bzr) {
        this.A01 = byh;
        this.A00 = bzr;
    }

    public final void CTX(Status status) {
        this.A00.A00.setException(new C22994BYq(status));
    }
}
