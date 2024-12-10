package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.3CZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CZ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C62572rc A02;
    public final /* synthetic */ C72433Ly A03;
    public final /* synthetic */ C34531kd A04;
    public final /* synthetic */ AnonymousClass206 A05;
    public final /* synthetic */ C692236j A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ byte[] A0A;

    public final void run() {
        int i;
        C34531kd r5 = this.A04;
        List list = this.A08;
        C62572rc r8 = this.A02;
        int i2 = this.A01;
        boolean z = this.A09;
        String str = this.A07;
        AnonymousClass206 r9 = this.A05;
        C692236j r10 = this.A06;
        int i3 = this.A00;
        byte[] bArr = this.A0A;
        C26421Sb r6 = r5.A09;
        if (i2 == 1) {
            i = 81;
        } else {
            i = 3;
            if (z) {
                i = 13;
            }
        }
        C63642tS A042 = r6.A04((Uri) null, r8, r9, r10, str, list, (List) null, (List) null, i, 0, 0, false);
        A042.A00 = i3;
        r5.A03.A0I(A042, (Long) null, bArr, false, false);
    }

    public /* synthetic */ AnonymousClass3CZ(C62572rc r1, C72433Ly r2, C34531kd r3, AnonymousClass206 r4, C692236j r5, String str, List list, byte[] bArr, int i, int i2, boolean z) {
        this.A04 = r3;
        this.A08 = list;
        this.A02 = r1;
        this.A01 = i;
        this.A09 = z;
        this.A07 = str;
        this.A05 = r4;
        this.A06 = r5;
        this.A00 = i2;
        this.A0A = bArr;
        this.A03 = r2;
    }
}
