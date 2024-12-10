package X;

import android.app.Activity;
import java.util.Timer;

/* renamed from: X.5yP  reason: invalid class name and case insensitive filesystem */
public final class C116655yP extends C196289ul {
    public final AnonymousClass1L9 A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass181 A03;
    public final C18030ve A04;
    public final A19 A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final Timer A0B = new Timer();
    public final AnonymousClass1LU A0C;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000f A[Catch:{ all -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016 A[Catch:{ all -> 0x0018 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A08(android.content.Context r7, X.C20285AEt r8, X.C20271AEe r9) {
        /*
            r6 = this;
            r5 = 0
            if (r9 == 0) goto L_0x000c
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x000c
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ all -> 0x0018 }
            goto L_0x000d
        L_0x000c:
            r1 = r5
        L_0x000d:
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "display_text"
            java.lang.String r4 = r1.optString(r0)     // Catch:{ all -> 0x0018 }
            goto L_0x001d
        L_0x0016:
            r4 = r5
            goto L_0x001d
        L_0x0018:
            r0 = move-exception
            X.1IU r4 = X.C108945cZ.A1J(r0)
        L_0x001d:
            java.lang.Throwable r3 = X.C30671eK.A00(r4)
            if (r3 == 0) goto L_0x002c
            X.190 r2 = r6.A01
            java.lang.String r1 = "AppAction"
            java.lang.String r0 = "AppAction/getButtonText can not get button text"
            r2.A0E(r1, r0, r3)
        L_0x002c:
            boolean r0 = r4 instanceof X.AnonymousClass1IU
            if (r0 != 0) goto L_0x0031
            r5 = r4
        L_0x0031:
            java.lang.String r5 = (java.lang.String) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116655yP.A08(android.content.Context, X.AEt, X.AEe):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r7 != null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.app.Activity r11, X.AnonymousClass5XY r12, X.AnonymousClass206 r13, X.C20271AEe r14, int r15) {
        /*
            r10 = this;
            r0 = 0
            r5 = r11
            X.C18070vi.A0d(r11, r0)
            r6 = r13
            X.C18070vi.A0k(r13, r14)
            java.lang.String r0 = r14.A00
            r2 = 0
            if (r0 == 0) goto L_0x0066
            org.json.JSONObject r1 = X.C17880vN.A16(r0)
            java.lang.String r0 = "android_app_metadata"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = "url"
            java.lang.String r7 = r1.optString(r0)
            java.lang.String r0 = "consented_users_url"
            java.lang.String r2 = r1.optString(r0)
        L_0x0026:
            X.205 r0 = r13.A0v
            X.1BI r1 = r0.A00
            r3 = r10
            if (r2 == 0) goto L_0x0063
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0063
            if (r1 == 0) goto L_0x0063
            X.00H r0 = r10.A08
            java.lang.Object r0 = r0.get()
            X.73F r0 = (X.AnonymousClass73F) r0
            boolean r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0063
            r7 = r2
        L_0x0044:
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0068
            X.7T4 r4 = new X.7T4
            r4.<init>(r10)
            java.util.Timer r2 = r10.A0B
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.schedule(r4, r0)
            X.10I r0 = r10.A06
            r9 = 1
            X.7QG r2 = new X.7QG
            r8 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.CGF(r2)
            return
        L_0x0063:
            if (r7 == 0) goto L_0x0068
            goto L_0x0044
        L_0x0066:
            r7 = r2
            goto L_0x0026
        L_0x0068:
            java.lang.String r0 = "AppAction/fetchDeeplinkMetadata can not get url"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116655yP.A0A(android.app.Activity, X.5XY, X.206, X.AEe, int):void");
    }

    public boolean A0E(C18030ve r3) {
        C18070vi.A0d(r3, 1);
        return !C18020vd.A05(C18040vf.A02, r3, 10713);
    }

    public boolean A0F(C18030ve r3, C166418cr r4) {
        C18070vi.A0d(r3, 1);
        return !C18020vd.A05(C18040vf.A02, r3, 10713);
    }

    public C116655yP(AnonymousClass1L9 r2, AnonymousClass190 r3, AnonymousClass1KB r4, AnonymousClass181 r5, C18030ve r6, AnonymousClass1LU r7, A19 a19, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0w(r3, r2, a19, r6, r10);
        C18070vi.A0x(r9, r11, r12, r13, r7);
        C72473Md.A1L(r5, r4);
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = a19;
        this.A04 = r6;
        this.A08 = r10;
        this.A06 = r9;
        this.A07 = r11;
        this.A0A = r12;
        this.A09 = r13;
        this.A0C = r7;
        this.A03 = r5;
        this.A02 = r4;
    }

    public int A04() {
        return 2131232150;
    }

    public String A07() {
        return "cta_app_link";
    }

    public void A0B(Activity activity, AnonymousClass5XY r3, AnonymousClass206 r4, C20271AEe aEe, Class cls) {
        throw C17880vN.A0y();
    }
}
