package X;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.6Kv  reason: invalid class name and case insensitive filesystem */
public final class C121616Kv extends AnonymousClass70T {
    public int A00 = 0;
    public AnonymousClass190 A01;
    public C125796bh A02;
    public AnonymousClass88K A03;
    public boolean A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public final C26378Cye A07;
    public final Uri A08;
    public final C26204Cub A09;

    public C121616Kv(Context context, C18030ve r20, AnonymousClass6gC r21, File file, int i) {
        C26378Cye cye;
        boolean z = false;
        Uri fromFile = Uri.fromFile(file);
        this.A08 = fromFile;
        this.A04 = false;
        HashMap A11 = C17880vN.A11();
        AnonymousClass6gC r9 = r21;
        C18100vl r2 = r9.A01;
        C26204Cub A012 = C26204Cub.A01(context, (C27066DRp) AnonymousClass3MX.A14(r2), C28620EAs.A00, A11);
        this.A09 = A012;
        boolean A1a = C72453Mb.A1a(r9.A02);
        AtomicLong atomicLong = C26378Cye.A0U;
        if (A1a) {
            cye = new C26378Cye((Looper) r9.A00.getValue(), new AnonymousClass7B8(this), A012, (C27066DRp) AnonymousClass3MX.A14(r2));
        } else {
            cye = new C26378Cye(new AnonymousClass7B8(this), A012, (C27066DRp) AnonymousClass3MX.A14(r2));
        }
        this.A07 = cye;
        int i2 = 1;
        C18030ve r5 = r20;
        if (r20 != null && C18020vd.A05(C18040vf.A02, r5, 6395)) {
            z = true;
        }
        C18070vi.A0d(fromFile, 0);
        cye.A0I(new C25238CbZ(new D43(), C24275ByY.IN_PLAY, new C26551D3p(), D47.A00(fromFile, (Uri) null, String.valueOf(C124526Yr.A00.addAndGet(1)), C17880vN.A11()), AnonymousClass00R.A00, 1, Integer.MAX_VALUE, false, false, false, false, z));
        i2 = i == 0 ? 2 : i2;
        C26378Cye cye2 = this.A07;
        Integer valueOf = Integer.valueOf(i2);
        C26378Cye.A06(cye2, "setAudioUsage: %d", valueOf);
        C108955ca.A1F(cye2.A0C, valueOf, 23);
        C108955ca.A1F(this.A07.A0C, new AnonymousClass7BB(this), 44);
    }
}
