package X;

import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.68n  reason: invalid class name and case insensitive filesystem */
public class C1195368n extends C1195468o implements BC9, AnonymousClass89Q {
    public File A00;
    public final C1418377d A01;
    public final C26981Ug A02 = new C26981Ug();
    public final File A03;
    public final AnonymousClass190 A04;
    public final C218617r A05;
    public final C25311Ns A06;
    public final C18030ve A07;
    public final WamediaManager A08;
    public final C32431hB A09;
    public final C136936ue A0A;
    public final AnonymousClass70H A0B;
    public final boolean A0C;

    public /* synthetic */ void BsA(long j) {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1195368n(X.AnonymousClass190 r10, X.C218617r r11, X.AnonymousClass1KB r12, X.C25311Ns r13, X.AnonymousClass181 r14, X.AnonymousClass11P r15, X.AnonymousClass11Z r16, X.C18030ve r17, X.C24371Kb r18, com.whatsapp.media.WamediaManager r19, X.C32431hB r20, X.C136936ue r21, X.C24421Kg r22, X.C1418377d r23, X.AnonymousClass70H r24, java.io.File r25, boolean r26) {
        /*
            r9 = this;
            java.util.concurrent.Executor r8 = r12.A05
            r1 = r9
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.A07 = r5
            r0 = r23
            r9.A01 = r0
            r9.A04 = r10
            r9.A05 = r11
            r0 = r21
            r9.A0A = r0
            X.1Ug r0 = new X.1Ug
            r0.<init>()
            r9.A02 = r0
            r0 = r25
            r9.A03 = r0
            r0 = r26
            r9.A0C = r0
            r0 = r24
            r9.A0B = r0
            r0 = r19
            r9.A08 = r0
            r0 = r20
            r9.A09 = r0
            r9.A06 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1195368n.<init>(X.190, X.17r, X.1KB, X.1Ns, X.181, X.11P, X.11Z, X.0ve, X.1Kb, com.whatsapp.media.WamediaManager, X.1hB, X.6ue, X.1Kg, X.77d, X.70H, java.io.File, boolean):void");
    }

    public C1409173o BJF() {
        C32431hB r1 = this.A09;
        C144767Ip r2 = new C144767Ip(this, 1);
        C1418377d r8 = this.A01;
        if (r1.A0F(r2, this, (C139666zF) null, (AnonymousClass21V) null, r8.A0F, false)) {
            try {
                return (C1409173o) this.A02.get();
            } catch (InterruptedException | ExecutionException e) {
                Log.e("DuplicateStickerDownloadListener/waitForResult ", e);
            }
        } else {
            BB6(this);
            C1409173o r14 = A03().A00;
            if (r14.A03()) {
                AnonymousClass70H r12 = this.A0B;
                File file = this.A03;
                AnonymousClass73B A022 = r12.A02(file, "image/webp");
                if (!(A022 == null && (A022 = r8.A04) == null)) {
                    AnonymousClass737[] r26 = A022.A0H;
                    String str = A022.A00;
                    String str2 = A022.A01;
                    String str3 = A022.A02;
                    String str4 = A022.A0A;
                    String str5 = A022.A09;
                    boolean z = A022.A03;
                    boolean z2 = A022.A0G;
                    String str6 = A022.A07;
                    boolean z3 = A022.A0B;
                    boolean z4 = A022.A0C;
                    boolean z5 = A022.A0D;
                    int i = A022.A04;
                    boolean z6 = A022.A0E;
                    String str7 = A022.A05;
                    String str8 = str;
                    String str9 = str2;
                    if (!this.A08.insertWebpMetadata(file, new AnonymousClass73B(str8, str9, str3, str4, str5, str6, str7, A022.A08, A022.A06, r26, i, z, z2, true, z3, z4, z5, z6).A04())) {
                        this.A0A.A02(1, "unable_to_insert_metadata", (String) null);
                    }
                }
                try {
                    String A002 = C1402370n.A00(file);
                    r8.A0C = A002;
                    r8.A0F = A002;
                    if (r8.A00 == 0) {
                        r8.A00 = (int) file.length();
                    }
                    if (!this.A0C) {
                        File A042 = this.A06.A04(r8.A0F, r8.A0E);
                        this.A00 = A042;
                        this.A05.A0j(file, A042);
                        return r14;
                    }
                    this.A00 = file;
                    return r14;
                } catch (IOException unused) {
                    return new C1409173o(9);
                }
            }
            return new C1409173o(1);
        }
    }

    public File BQZ() {
        return this.A00;
    }

    public void BsC(boolean z) {
    }

    public void BsD(C1409173o r1, C136996uk r2) {
    }
}
