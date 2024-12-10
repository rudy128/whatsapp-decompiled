package X;

import android.net.Uri;
import com.whatsapp.media.WamediaManager;

/* renamed from: X.7HB  reason: invalid class name */
public final class AnonymousClass7HB implements AnonymousClass87B {
    public final int A00;
    public final Uri A01;
    public final AnonymousClass11C A02;
    public final C18030ve A03;
    public final C139176yM A04;
    public final WamediaManager A05;
    public final AnonymousClass1Q5 A06;
    public final boolean A07;
    public final boolean A08;

    public AnonymousClass7HB(Uri uri, AnonymousClass11C r3, C18030ve r4, C139176yM r5, WamediaManager wamediaManager, AnonymousClass1Q5 r7, int i, boolean z, boolean z2) {
        C18070vi.A0d(r5, 2);
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A05 = wamediaManager;
        this.A06 = r7;
        this.A01 = uri;
        this.A00 = i;
        this.A07 = z;
        this.A08 = z2;
    }

    public C160878Ah BHY(boolean z) {
        String str;
        AnonymousClass77I A002;
        Uri uri = this.A01;
        if (uri == null || (str = uri.toString()) == null) {
            str = "";
        }
        String str2 = null;
        if (str.startsWith(C18070vi.A0H(AnonymousClass65c.A00))) {
            C18030ve r4 = this.A03;
            AnonymousClass11C r3 = this.A02;
            WamediaManager wamediaManager = this.A05;
            AnonymousClass1Q5 r6 = this.A06;
            if (uri != null) {
                str2 = uri.getQueryParameter("bucketId");
            }
            return new AnonymousClass65c(r3, r4, wamediaManager, r6, str2, this.A00);
        }
        if (!z) {
            A002 = C108995ce.A0P();
            A002.A05 = true;
        } else {
            int i = this.A00;
            if (uri != null) {
                str2 = uri.getQueryParameter("bucketId");
            }
            A002 = C139176yM.A00(str2, i, this.A07);
        }
        return this.A04.A01(A002, this.A08);
    }
}
