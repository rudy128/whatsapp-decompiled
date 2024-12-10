package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;

/* renamed from: X.73h  reason: invalid class name and case insensitive filesystem */
public abstract class C1408473h {
    public static final Intent A00(Context context, C19880zA r2, boolean z) {
        C18070vi.A0d(r2, 2);
        if (r2.A07()) {
            r2.A03();
            throw AnonymousClass000.A0s("getMessageQRActivity");
        }
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(context.getPackageName(), "com.whatsapp.qrcode.contactqr.ContactQrActivity");
        A0A.putExtra("scan", z);
        return A0A;
    }

    public static final Integer A02(C42741yf r3) {
        int i;
        if (r3 == null) {
            return null;
        }
        if (r3.A03()) {
            i = 2;
        } else {
            i = 3;
            if (!r3.A02()) {
                return null;
            }
        }
        return Integer.valueOf(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r2 == 2) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r1 == 2) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        if ((!r2) != false) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C42741yf r5, X.C62602rf r6, X.AnonymousClass18K r7, X.C129806iO r8, java.lang.Boolean r9, java.lang.Integer r10, int r11, boolean r12) {
        /*
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            if (r10 != 0) goto L_0x0011
            if (r6 == 0) goto L_0x0058
            int r0 = r6.A00
            if (r0 != 0) goto L_0x0058
            r3 = 3
        L_0x000d:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
        L_0x0011:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            if (r8 == 0) goto L_0x0056
            int r2 = r8.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 1
            if (r0 == 0) goto L_0x0056
            if (r2 == 0) goto L_0x0029
            r0 = 1
            r1 = 3
            if (r2 == r0) goto L_0x0029
            r1 = 2
            if (r2 != r1) goto L_0x0056
        L_0x0029:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = A02(r5)
            boolean r0 = X.AnonymousClass000.A1X(r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.63j r1 = new X.63j
            r1.<init>()
            r1.A03 = r4
            r1.A04 = r10
            r1.A05 = r3
            r1.A01 = r0
            r1.A00 = r9
            r1.A02 = r2
            if (r12 == 0) goto L_0x0052
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A06 = r0
        L_0x0052:
            r7.CC7(r1)
            return
        L_0x0056:
            r1 = 7
            goto L_0x0029
        L_0x0058:
            if (r8 == 0) goto L_0x0072
            int r0 = r8.A00
            if (r0 != 0) goto L_0x0072
            if (r6 == 0) goto L_0x0074
            boolean r2 = r6.A00()
            if (r2 == 0) goto L_0x0072
            int r1 = r8.A01
            if (r1 == 0) goto L_0x006e
            r0 = 2
            r3 = 4
            if (r1 != r0) goto L_0x000d
        L_0x006e:
            r0 = r2 ^ 1
            if (r0 == 0) goto L_0x0074
        L_0x0072:
            r3 = 2
            goto L_0x000d
        L_0x0074:
            r10 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1408473h.A04(X.1yf, X.2rf, X.18K, X.6iO, java.lang.Boolean, java.lang.Integer, int, boolean):void");
    }

    public static final String A03(String str, int i) {
        if (i == 0) {
            return C108955ca.A0z(str, 17);
        }
        if (i != 1) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            if (lastPathSegment != null) {
                return lastPathSegment;
            }
            return "";
        }
        C17900vP.A0i("ContactQrUtils/getUniqueIdFromContactQrCode/invalid code type", AnonymousClass000.A10(), i);
        return "";
    }

    public static final boolean A05(String str) {
        if (str == null || AnonymousClass1YF.A0T(str)) {
            return false;
        }
        return C18070vi.A18(Uri.parse(str).getQueryParameter("src"), "qr");
    }

    public static final Bitmap A01(AnonymousClass1FU r5, AnonymousClass1E7 r6, String str, String str2, boolean z) {
        boolean A17 = C18070vi.A17(r5, r6);
        C108985cd.A1D(str, str2);
        Resources resources = r5.getResources();
        r5.A2n();
        ContactQrContactCardView contactQrContactCardView = new ContactQrContactCardView(C28281Zt.A02(r5));
        contactQrContactCardView.setGravity(17);
        contactQrContactCardView.setStyle(A17 ? 1 : 0);
        contactQrContactCardView.A02(r6, z);
        contactQrContactCardView.setPrompt(str2);
        contactQrContactCardView.setQrCode(str);
        C108995ce.A0v(contactQrContactCardView, View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelSize(2131166104), 1073741824), View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelSize(2131166100), 1073741824));
        Bitmap A0H = C108995ce.A0H(contactQrContactCardView);
        contactQrContactCardView.draw(C108945cZ.A0I(A0H));
        C18070vi.A0X(A0H);
        return A0H;
    }
}
