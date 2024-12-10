package X;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import android.view.View;

/* renamed from: X.5rb  reason: invalid class name and case insensitive filesystem */
public final class C114675rb extends C74703cE {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C139386yk A01;
    public final /* synthetic */ AnonymousClass206 A02;
    public final /* synthetic */ String A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C114675rb(android.content.Context r8, X.AnonymousClass1KB r9, X.C36361nl r10, X.C139386yk r11, X.AnonymousClass11C r12, X.AnonymousClass206 r13, java.lang.String r14) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r7.A00 = r8
            r6 = r14
            r7.A03 = r14
            r7.A01 = r11
            r7.A02 = r13
            r5 = 0
            r3 = r9
            r2 = r10
            r4 = r12
            r0.<init>((android.content.Context) r1, (X.AnonymousClass1L8) r2, (X.AnonymousClass1KB) r3, (X.AnonymousClass11C) r4, (X.AnonymousClass206) r5, (java.lang.String) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114675rb.<init>(android.content.Context, X.1KB, X.1nl, X.6yk, X.11C, X.206, java.lang.String):void");
    }

    public void A02() {
        this.A01.A04.A00(Boolean.valueOf(this.A02.A0v.A02), (Boolean) null, 2);
    }

    public void onClick(View view) {
        Context context;
        boolean z;
        AnonymousClass1BI r7;
        Pair pair;
        String str = this.A03;
        String schemeSpecificPart = Uri.parse(str).getSchemeSpecificPart();
        C139386yk r6 = this.A01;
        AnonymousClass00H r3 = r6.A07;
        C18070vi.A0b(schemeSpecificPart);
        C18070vi.A0d(schemeSpecificPart, 0);
        if (((C37141p2) r3.get()).A00.get(schemeSpecificPart) != null) {
            context = this.A00;
            pair = (Pair) ((C37141p2) r3.get()).A00.get(schemeSpecificPart);
            AnonymousClass205 r0 = this.A02.A0v;
            z = r0.A02;
            r7 = r0.A00;
        } else if (r6.A00 != null) {
            return;
        } else {
            if (!r6.A02.A09()) {
                context = this.A00;
                AnonymousClass205 r02 = this.A02.A0v;
                z = r02.A02;
                r7 = r02.A00;
                pair = null;
            } else {
                AnonymousClass6MD r9 = new AnonymousClass6MD(r6.A01, r6.A03, new C129616i5(this.A00, r6, this.A02, schemeSpecificPart, str), C17880vN.A0U(r6.A06), schemeSpecificPart);
                AnonymousClass3MW.A1T(r9, r6.A05, 0);
                r6.A00 = r9;
                return;
            }
        }
        C139386yk.A00(context, pair, r6, r7, schemeSpecificPart, str, z);
    }
}
