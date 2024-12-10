package X;

import java.util.concurrent.Callable;

/* renamed from: X.3DG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DG implements Callable {
    public final /* synthetic */ byte A00;
    public final /* synthetic */ C60002nE A01;
    public final /* synthetic */ AnonymousClass1P3 A02;
    public final /* synthetic */ C54492eE A03;
    public final /* synthetic */ C54492eE A04;
    public final /* synthetic */ byte[] A05;
    public final /* synthetic */ byte[] A06;

    public final Object call() {
        AnonymousClass1P3 r1 = this.A02;
        C60002nE r2 = this.A01;
        byte[] bArr = this.A05;
        byte b = this.A00;
        C54492eE r3 = this.A03;
        C54492eE r4 = this.A04;
        byte[] bArr2 = this.A06;
        C18070vi.A0d(r4, 5);
        return Integer.valueOf(r1.A07(r2, r3, r4, bArr, bArr2, b));
    }

    public /* synthetic */ AnonymousClass3DG(C60002nE r1, AnonymousClass1P3 r2, C54492eE r3, C54492eE r4, byte[] bArr, byte[] bArr2, byte b) {
        this.A02 = r2;
        this.A01 = r1;
        this.A05 = bArr;
        this.A00 = b;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = bArr2;
    }
}
