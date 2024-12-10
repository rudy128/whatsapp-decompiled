package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.68J  reason: invalid class name */
public class AnonymousClass68J extends C144737Im {
    public final AnonymousClass3LA A00;
    public final AnonymousClass1T1 A01;
    public final C18000vb A02;
    public final C18030ve A03;
    public final C25291Nq A04;
    public final C26631Sw A05;

    public AnonymousClass68J(Context context, AnonymousClass1T1 r9, C218617r r10, C18000vb r11, AnonymousClass1KW r12, C18030ve r13, C25291Nq r14, AnonymousClass3LA r15, AnonymousClass85B r16, C26631Sw r17, String str) {
        super(context, r10, r12, r16, str);
        this.A02 = r11;
        this.A00 = r15;
        this.A05 = r17;
        this.A03 = r13;
        this.A04 = r14;
        this.A01 = r9;
    }

    public void run() {
        C1409573s r1;
        File A0H = C26511Sk.A0H(this.A01, this.A04);
        if (A0H.exists()) {
            Context context = this.A00;
            AnonymousClass1KW r4 = this.A02;
            C18000vb r3 = this.A02;
            C26631Sw r7 = this.A05;
            C18030ve r5 = this.A03;
            C25291Nq r6 = this.A04;
            r1 = C1409573s.A06.A01(context, this.A01, r3, r4, r5, r6, r7, A0H);
        } else {
            r1 = null;
        }
        this.A00.Bwz(r1);
    }
}
