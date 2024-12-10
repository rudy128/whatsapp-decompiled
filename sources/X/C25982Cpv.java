package X;

import android.content.Intent;

/* renamed from: X.Cpv  reason: case insensitive filesystem */
public final class C25982Cpv {
    public final AnonymousClass11C A00;
    public final AnonymousClass1Q6 A01;
    public final AnonymousClass20X A02;
    public final C32011gU A03;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r1.getString("newsletter_invite_link_jid") == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (X.C18070vi.A18(r9.getAction(), "android.intent.action.SEND_MULTIPLE") != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        if (r1.getString("newsletter_invite_link_jid") == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b1, code lost:
        if (r9.getStringExtra("android.intent.extra.TEXT") != null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b3, code lost:
        r1 = r9.getExtras();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        if (r1 == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b9, code lost:
        r0 = r1.getBundle("message_keys");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        if (r0 == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c1, code lost:
        r0 = X.AnonymousClass4aU.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c5, code lost:
        if (r0 == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        r1 = r0.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
        if (java.lang.Integer.valueOf(r1) == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d1, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d2, code lost:
        r3 = ((r3 + r5) + r6) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d5, code lost:
        if (r3 <= 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d8, code lost:
        r5 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C25168CaK A02(android.content.Intent r9) {
        /*
            r8 = this;
            r6 = 0
            X.C18070vi.A0d(r9, r6)
            int r2 = A00(r9)
            java.lang.String r0 = r9.getAction()
            java.lang.String r5 = "android.intent.action.SEND"
            boolean r0 = X.C18070vi.A18(r0, r5)
            if (r0 != 0) goto L_0x0021
            java.lang.String r1 = r9.getAction()
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            boolean r0 = X.C18070vi.A18(r1, r0)
            r4 = 0
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r4 = 1
        L_0x0022:
            android.os.Bundle r1 = r9.getExtras()
            r7 = 0
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = "forward"
            boolean r6 = r1.getBoolean(r0, r6)
        L_0x002f:
            android.os.Bundle r1 = r9.getExtras()
            if (r1 == 0) goto L_0x003e
            java.lang.String r0 = "newsletter_invite_link_jid"
            java.lang.String r0 = r1.getString(r0)
            r3 = 1
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            r1 = 108(0x6c, float:1.51E-43)
            boolean r0 = X.AnonymousClass000.A1T(r2, r1)
            if (r4 != 0) goto L_0x004d
            if (r6 != 0) goto L_0x004d
            if (r3 != 0) goto L_0x004d
            if (r0 == 0) goto L_0x004e
        L_0x004d:
            r7 = 1
        L_0x004e:
            if (r2 != r1) goto L_0x008f
            java.lang.String r4 = r9.getAction()
            r3 = -1
            if (r4 == 0) goto L_0x006d
            int r1 = r4.hashCode()
            r0 = -1173264947(0xffffffffba1165cd, float:-5.5464805E-4)
            if (r1 == r0) goto L_0x0071
            r0 = -58484670(0xfffffffffc839842, float:-5.4662324E36)
            if (r1 != r0) goto L_0x006d
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0077
        L_0x006d:
            if (r7 != 0) goto L_0x00f2
            r0 = 0
            return r0
        L_0x0071:
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L_0x006d
        L_0x0077:
            android.content.ClipData r0 = r9.getClipData()
            if (r0 == 0) goto L_0x0082
            int r3 = r0.getItemCount()
            goto L_0x00d5
        L_0x0082:
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r9.getStringArrayListExtra(r0)
            if (r0 == 0) goto L_0x00e9
            int r3 = r0.size()
            goto L_0x00d5
        L_0x008f:
            android.content.ClipData r0 = r9.getClipData()
            r6 = 0
            if (r0 == 0) goto L_0x00da
            int r3 = r0.getItemCount()
        L_0x009a:
            android.os.Bundle r1 = r9.getExtras()
            r5 = 1
            if (r1 == 0) goto L_0x00aa
            java.lang.String r0 = "newsletter_invite_link_jid"
            java.lang.String r0 = r1.getString(r0)
            r4 = 1
            if (r0 != 0) goto L_0x00d8
        L_0x00aa:
            r4 = 0
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r0 = r9.getStringExtra(r0)
            if (r0 == 0) goto L_0x00d8
        L_0x00b3:
            android.os.Bundle r1 = r9.getExtras()
            if (r1 == 0) goto L_0x00d2
            java.lang.String r0 = "message_keys"
            android.os.Bundle r0 = r1.getBundle(r0)
            if (r0 == 0) goto L_0x00d2
            java.util.ArrayList r0 = X.AnonymousClass4aU.A04(r0)
            if (r0 == 0) goto L_0x00d2
            int r1 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00d2
            r6 = r1
        L_0x00d2:
            int r3 = r3 + r5
            int r3 = r3 + r6
            int r3 = r3 + r4
        L_0x00d5:
            if (r3 > 0) goto L_0x00f2
            goto L_0x006d
        L_0x00d8:
            r5 = 0
            goto L_0x00b3
        L_0x00da:
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r9.getStringArrayListExtra(r0)
            if (r0 == 0) goto L_0x00e7
            int r3 = r0.size()
            goto L_0x009a
        L_0x00e7:
            r3 = 0
            goto L_0x009a
        L_0x00e9:
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r0 = r9.getStringExtra(r0)
            if (r0 == 0) goto L_0x006d
            r3 = 1
        L_0x00f2:
            X.CaK r0 = new X.CaK
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25982Cpv.A02(android.content.Intent):X.CaK");
    }

    public static final int A00(Intent intent) {
        int intExtra = intent.getIntExtra("source_surface", 1);
        if (intExtra != 1) {
            return intExtra;
        }
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1173264947) {
                if (hashCode != -58484670 || !action.equals("android.intent.action.SEND_MULTIPLE")) {
                    return 1;
                }
                return AnonymousClass74N.A03;
            } else if (action.equals("android.intent.action.SEND")) {
                return AnonymousClass74N.A03;
            }
        }
        return 1;
    }

    public static final C24298Byv A01(int i) {
        if (i == 0) {
            return C24298Byv.TYPE_TEXT;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 9) {
                        if (!(i == 13 || i == 25)) {
                            if (i != 43) {
                                if (i != 57) {
                                    if (!(i == 62 || i == 81 || i == 28)) {
                                        if (i != 29) {
                                            return C24298Byv.TYPE_UNKNOWN;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return C24298Byv.TYPE_VIDEO;
            }
            return C24298Byv.TYPE_FILE;
        }
        return C24298Byv.TYPE_IMAGE;
    }

    public C25982Cpv(AnonymousClass11C r1, AnonymousClass1Q6 r2, AnonymousClass20X r3, C32011gU r4) {
        C18070vi.A0s(r4, r1, r3, r2);
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
