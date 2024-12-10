package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.70P  reason: invalid class name */
public final class AnonymousClass70P {
    public final AnonymousClass11P A00;
    public final C24901Mc A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass1KB A06;
    public final AnonymousClass11C A07;
    public final C19830z4 A08;
    public final C18030ve A09;
    public final AnonymousClass10I A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r10 = r29;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.content.Context r28, X.AnonymousClass206 r29) {
        /*
            r27 = this;
            r0 = 0
            r3 = r28
            X.C18070vi.A0d(r3, r0)
            r4 = r27
            X.00H r8 = r4.A03
            X.0ve r1 = X.AnonymousClass71Z.A00(r8)
            r0 = 3176(0xc68, float:4.45E-42)
            X.0vf r7 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r7, r1, r0)
            if (r0 == 0) goto L_0x00ad
            r10 = r29
            X.2qD r0 = A00(r10)
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r4.A09(r0)
            if (r0 == 0) goto L_0x00ad
            X.00H r2 = r4.A04
            java.lang.Object r9 = X.C18070vi.A0E(r2)
            X.72y r9 = (X.C1407672y) r9
            r11 = 0
            r16 = 11
            r20 = 0
            r17 = 8
            r13 = r11
            r14 = r11
            r15 = r11
            r12 = r11
            X.C1407672y.A02(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.2qD r5 = A00(r10)
            if (r5 == 0) goto L_0x00ae
            java.lang.String r6 = r5.A02
            if (r6 != 0) goto L_0x0052
            java.lang.String r0 = r5.A01
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "package_name"
            java.lang.String r6 = r1.getQueryParameter(r0)
        L_0x0052:
            java.lang.String r5 = r4.A02(r5)
            if (r6 == 0) goto L_0x00ae
            if (r5 == 0) goto L_0x00ae
            X.0ve r1 = X.AnonymousClass71Z.A00(r8)
            r0 = 6758(0x1a66, float:9.47E-42)
            boolean r0 = X.C18020vd.A05(r7, r1, r0)
            if (r0 == 0) goto L_0x0074
            X.00H r0 = r4.A05
            java.lang.Object r0 = r0.get()
            X.6gP r0 = (X.C128616gP) r0
            java.util.Map r0 = r0.A01
            java.lang.String r11 = X.C17880vN.A0s(r6, r0)
        L_0x0074:
            X.00H r0 = r4.A02
            android.content.Intent r1 = X.AnonymousClass3MZ.A06(r0)
            r1.setPackage(r6)
            java.lang.String r0 = "com.whatsapp.otp.OTP_RETRIEVED"
            r1.setAction(r0)
            java.lang.String r0 = "code"
            r1.putExtra(r0, r5)
            X.AnonymousClass6X3.A00(r3, r1)
            if (r11 == 0) goto L_0x0091
            java.lang.String r0 = "request_id"
            r1.putExtra(r0, r11)
        L_0x0091:
            r3.sendBroadcast(r1)
            java.lang.Object r0 = r2.get()
            X.72y r0 = (X.C1407672y) r0
            r25 = 3
        L_0x009c:
            r22 = r13
            r23 = r13
            r18 = r0
            r19 = r10
            r21 = r13
            r24 = r11
            r26 = r17
            X.C1407672y.A02(r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x00ad:
            return
        L_0x00ae:
            java.lang.Object r0 = X.C18070vi.A0E(r2)
            X.72y r0 = (X.C1407672y) r0
            r25 = 13
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70P.A03(android.content.Context, X.206):void");
    }

    public final void A04(Context context, C439521o r13, int i) {
        C439521o r3 = r13;
        C18070vi.A0d(r13, 0);
        UserJid A0I = r13.A0I();
        if (A0I != null) {
            this.A01.A08(A0I, 1);
        }
        AnonymousClass00H r1 = this.A04;
        Integer A0h = C17880vN.A0h();
        int i2 = i;
        C1407672y.A02((C1407672y) r1.get(), r3, A0h, (Integer) null, (Long) null, (String) null, (String) null, 0, i2);
        Intent A012 = A01(context, r13);
        if (A012 != null) {
            context.startActivity(A012);
            C1407672y.A02((C1407672y) r1.get(), r3, A0h, (Integer) null, (Long) null, (String) null, (String) null, 3, i2);
        }
    }

    public final boolean A06(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        if (A00(r3) == null || AnonymousClass71Z.A01(this.A03)) {
            return false;
        }
        return true;
    }

    public final boolean A07(C61762qD r3) {
        C18070vi.A0d(r3, 0);
        if (r3.A0B.get() != 1 || AnonymousClass71Z.A01(this.A03)) {
            return false;
        }
        return true;
    }

    public final boolean A09(C61762qD r3) {
        C18070vi.A0d(r3, 0);
        if (r3.A0B.get() != 3 || AnonymousClass71Z.A01(this.A03)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.2qD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.2qD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.2qD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.2qD} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C61762qD A00(X.AnonymousClass206 r4) {
        /*
            boolean r0 = r4 instanceof X.C439521o
            r3 = 0
            if (r0 == 0) goto L_0x0029
            X.21o r4 = (X.C439521o) r4
            X.2k6 r0 = r4.A00
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x0029
            java.util.Iterator r2 = r0.iterator()
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2qD r0 = (X.C61762qD) r0
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0B
            int r0 = r0.get()
            if (r0 == 0) goto L_0x0011
            r3 = r1
        L_0x0027:
            X.2qD r3 = (X.C61762qD) r3
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70P.A00(X.206):X.2qD");
    }

    public final String A02(C61762qD r5) {
        String queryParameter;
        C18030ve r2 = this.A09;
        if (C1408773k.A01(r2, r5)) {
            String A012 = C18020vd.A01(C18040vf.A02, r2, 3827);
            String str = r5.A01;
            C18070vi.A0W(str);
            C18070vi.A0b(A012);
            return AnonymousClass1YE.A07(str, A012, "", false);
        } else if (!C1408773k.A02(r2, r5) || (queryParameter = Uri.parse(r5.A01).getQueryParameter("code")) == null) {
            return null;
        } else {
            return AnonymousClass1YE.A07(queryParameter, "otp", "", true);
        }
    }

    public final void A05(C439521o r6, int i) {
        String str;
        C18070vi.A0d(r6, 0);
        C61762qD A002 = A00(r6);
        UserJid A0I = r6.A0I();
        if (A0I != null) {
            this.A01.A08(A0I, 1);
        }
        if (A002 != null) {
            str = A02(A002);
        } else {
            str = null;
        }
        try {
            ClipData newPlainText = ClipData.newPlainText(str, str);
            ClipboardManager A092 = this.A07.A09();
            if (A092 != null) {
                A092.setPrimaryClip(newPlainText);
            }
            this.A06.A09(2131889047, 1);
        } catch (NullPointerException | SecurityException e) {
            Log.e("OtpMessageService/copycode", e);
        }
        this.A0A.CGF(new C70863Cu(this, i, 27, r6));
    }

    public final boolean A08(C61762qD r3) {
        if (r3.A0B.get() != 2 || AnonymousClass71Z.A01(this.A03)) {
            return false;
        }
        return true;
    }

    public AnonymousClass70P(AnonymousClass1KB r2, AnonymousClass11C r3, AnonymousClass11P r4, C19830z4 r5, C18030ve r6, C24901Mc r7, AnonymousClass10I r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0w(r6, r2, r8, r9, r7);
        C18070vi.A0x(r10, r3, r11, r12, r5);
        C18070vi.A0d(r4, 11);
        this.A09 = r6;
        this.A06 = r2;
        this.A0A = r8;
        this.A02 = r9;
        this.A01 = r7;
        this.A04 = r10;
        this.A07 = r3;
        this.A05 = r11;
        this.A03 = r12;
        this.A08 = r5;
        this.A00 = r4;
    }

    public final Intent A01(Context context, AnonymousClass206 r9) {
        String str;
        String A022;
        C61762qD A002 = A00(r9);
        if (A002 == null || (((str = A002.A02) == null && (str = Uri.parse(A002.A01).getQueryParameter("package_name")) == null) || (A022 = A02(A002)) == null)) {
            return null;
        }
        String queryParameter = Uri.parse(A002.A01).getQueryParameter("cta_display_name");
        this.A02.get();
        Intent A0A2 = C17880vN.A0A();
        A0A2.setPackage(str);
        A0A2.setAction("com.whatsapp.otp.OTP_RETRIEVED");
        A0A2.putExtra("code", A022);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(A0A2, 0);
        C18070vi.A0X(queryIntentActivities);
        if (queryIntentActivities.isEmpty()) {
            C17900vP.A0e("OtpClient/autofill: no activity for ", queryParameter, AnonymousClass000.A10());
            return null;
        }
        A0A2.setClassName(str, queryIntentActivities.get(0).activityInfo.name);
        A0A2.setFlags(268435456);
        AnonymousClass6X3.A00(context, A0A2);
        return A0A2;
    }
}
