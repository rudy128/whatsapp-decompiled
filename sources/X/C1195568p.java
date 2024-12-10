package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* renamed from: X.68p  reason: invalid class name and case insensitive filesystem */
public class C1195568p extends C1194668g implements BC9, AnonymousClass89Q {
    public final C25311Ns A00;
    public final C1418377d A01;
    public final C26981Ug A02;
    public final File A03;
    public final C32431hB A04;

    public C1409173o BJF() {
        if (this.A04.A0F(new C144767Ip(this, 2), this, (C139666zF) null, (AnonymousClass21V) null, this.A01.A0F, false)) {
            try {
                return (C1409173o) this.A02.get();
            } catch (InterruptedException | ExecutionException e) {
                Log.e("DuplicateStickerDownloadListener/waitForResult ", e);
                return new C1409173o(1);
            }
        } else {
            BB6(this);
            return A03().A00;
        }
    }

    public /* synthetic */ void BsA(long j) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r1.equals("application/was") == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1195568p(X.AnonymousClass1KB r12, X.C25311Ns r13, X.AnonymousClass181 r14, X.AnonymousClass11P r15, X.AnonymousClass11Z r16, X.C18030ve r17, X.C24371Kb r18, X.C32431hB r19, X.C24421Kg r20, X.C1418377d r21, java.io.File r22) {
        /*
            r11 = this;
            java.util.concurrent.Executor r10 = r12.A05
            r3 = r11
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2 = r21
            java.lang.String r1 = r2.A0E
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "application/was"
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r2.A0Q = r0
            r11.A01 = r2
            X.1Ug r0 = new X.1Ug
            r0.<init>()
            r11.A02 = r0
            r0 = r22
            r11.A03 = r0
            r0 = r19
            r11.A04 = r0
            r11.A00 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1195568p.<init>(X.1KB, X.1Ns, X.181, X.11P, X.11Z, X.0ve, X.1Kb, X.1hB, X.1Kg, X.77d, java.io.File):void");
    }

    public File BQZ() {
        return this.A03;
    }

    public void BsC(boolean z) {
    }

    public void BsD(C1409173o r1, C136996uk r2) {
    }
}
