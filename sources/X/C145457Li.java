package X;

import android.os.SystemClock;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.7Li  reason: invalid class name and case insensitive filesystem */
public class C145457Li implements C1602087o {
    public long A00;
    public AnonymousClass6M6 A01;
    public C129806iO A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass1LA A06;
    public final C58362kZ A07;
    public final AnonymousClass1KB A08;
    public final C129956ie A09;
    public final AnonymousClass11E A0A;
    public final AnonymousClass1M9 A0B;
    public final AnonymousClass1PM A0C;
    public final C678831f A0D;
    public final AnonymousClass11P A0E;
    public final C30801eX A0F;
    public final C32971i3 A0G;
    public final C32981i4 A0H;
    public final C18030ve A0I;
    public final AnonymousClass18K A0J;
    public final AnonymousClass1OZ A0K;
    public final AnonymousClass10I A0L;
    public final String A0M;
    public final WeakReference A0N;
    public final boolean A0O;
    public final boolean A0P;

    public void A01(C62602rf r8, C188829i3 r9) {
        long j;
        UserJid userJid;
        C129806iO r0;
        String str;
        int i;
        int i2;
        if (r9 != null && this.A02 == null) {
            String str2 = r9.A0J;
            if (str2 == null || str2.isEmpty() || (userJid = r9.A0D) == null) {
                userJid = r9.A0D;
                if (userJid != null) {
                    str = null;
                    i = 0;
                    i2 = 3;
                } else {
                    r0 = new C129806iO((UserJid) null, (String) null, (String) null, -1, 404);
                    this.A02 = r0;
                }
            } else {
                str = null;
                i = 0;
                i2 = 2;
            }
            r0 = new C129806iO(userJid, str, str, i2, i);
            this.A02 = r0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        AnonymousClass1KB r4 = this.A08;
        C146517Pk r3 = new C146517Pk(this, r8, 23);
        if (elapsedRealtime < 500) {
            j = 500 - elapsedRealtime;
        } else {
            j = 0;
        }
        r4.A0K(r3, j);
    }

    public void C3h(C129806iO r23) {
        boolean z;
        int i;
        String str;
        String str2;
        C222119a r1;
        if (!this.A03) {
            C18030ve r9 = this.A0I;
            String str3 = this.A0M;
            boolean A0B2 = C32981i4.A0B(r9, str3);
            if (A0B2 && (r1 = (C222119a) this.A0G.A02.get("fetch_biz_info")) != null) {
                r1.A06("datasource");
            }
            C129806iO r5 = r23;
            if (r23 != null) {
                this.A02 = r5;
                UserJid userJid = r5.A02;
                int i2 = r5.A01;
                if (i2 == -1 || (i = this.A04) != i2 || userJid == null) {
                    z = true;
                    if (C18020vd.A05(C18040vf.A02, r9, 4748)) {
                        this.A02 = null;
                        A00(this, str3);
                        return;
                    }
                    A01((C62602rf) null, (C188829i3) null);
                } else {
                    z = false;
                    C18070vi.A0d(r9, 0);
                    C18040vf r7 = C18040vf.A02;
                    if (C18020vd.A05(r7, r9, 508)) {
                        if (i == 2) {
                            str = "message_short_link";
                        } else {
                            str = "qr_code";
                        }
                        if (C18020vd.A05(r7, r9, 1669) && i == 2) {
                            if (C32981i4.A0C(r9, str3)) {
                                str = "custom_qr_code_link";
                            } else if (C32981i4.A0B(r9, str3)) {
                                str = "custom_link";
                            }
                        }
                        if (this.A0O) {
                            str2 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                        } else {
                            str2 = null;
                        }
                        this.A0F.A05(userJid, str, str2, System.currentTimeMillis(), System.currentTimeMillis());
                    }
                    AnonymousClass1M9 r15 = this.A0B;
                    C58362kZ r14 = this.A07;
                    UserJid userJid2 = userJid;
                    C678831f r16 = this.A0D;
                    AnonymousClass6M6 r13 = new AnonymousClass6M6(r14, r15, r16, userJid2, this, r5.A04, (String) null, (AnonymousClass1D6) null);
                    this.A01 = r13;
                    AnonymousClass3MW.A1T(r13, this.A0L, 0);
                }
                if (A0B2) {
                    C32971i3 r0 = this.A0G;
                    boolean z2 = true ^ z;
                    Map map = r0.A02;
                    C222119a r12 = (C222119a) map.get("fetch_biz_info");
                    if (r12 != null) {
                        short s = 3;
                        if (z2) {
                            s = 2;
                        }
                        r12.A0C(s);
                        map.remove("fetch_biz_info");
                    }
                }
            }
        }
    }

    public C145457Li(AnonymousClass1LA r3, C58362kZ r4, AnonymousClass1KB r5, C129956ie r6, AnonymousClass11E r7, AnonymousClass1M9 r8, AnonymousClass1PM r9, C678831f r10, AnonymousClass11P r11, C30801eX r12, C32971i3 r13, C32981i4 r14, C18030ve r15, AnonymousClass18K r16, AnonymousClass1OZ r17, C139676zG r18, AnonymousClass10I r19, String str, int i, int i2, boolean z) {
        this.A0E = r11;
        this.A0I = r15;
        this.A08 = r5;
        this.A0L = r19;
        this.A0J = r16;
        this.A0K = r17;
        this.A0B = r8;
        this.A0H = r14;
        this.A07 = r4;
        this.A0D = r10;
        this.A06 = r3;
        this.A0G = r13;
        this.A09 = r6;
        this.A04 = i;
        this.A0F = r12;
        this.A0M = str;
        this.A0O = z;
        this.A0C = r9;
        this.A0A = r7;
        C139676zG r1 = r18;
        this.A0N = AnonymousClass3MW.A0z(r1);
        this.A05 = i2;
        this.A0P = r1.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (r12 == null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C145457Li r12, java.lang.String r13) {
        /*
            android.net.Uri r2 = android.net.Uri.parse(r13)
            java.lang.String r1 = X.C32981i4.A07(r2)
            r10 = r12
            X.1i4 r0 = r12.A0H
            X.1D6 r13 = r0.A0G(r2)
            r9 = 0
            if (r1 == 0) goto L_0x0028
            X.1LA r7 = r12.A06
            java.lang.String r8 = "\\D"
            java.lang.String r6 = ""
            java.lang.String r3 = r1.replaceAll(r8, r6)
            int r1 = r3.length()
            r0 = 5
            if (r1 >= r0) goto L_0x0037
            java.lang.String r0 = "contactpicker/converttointlformat/too-short-no-cc"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0028:
            r12 = r9
        L_0x0029:
            java.lang.Object r0 = r13.first
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0085
            r10.A01(r9, r9)
            return
        L_0x0037:
            java.lang.String r0 = "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r2 = r0.matcher(r3)
            boolean r0 = r2.find()
            if (r0 == 0) goto L_0x0028
            r1 = 1
            java.lang.String r5 = r2.group(r1)
            int r0 = r5.length()
            java.lang.String r4 = r3.substring(r0)
            int r0 = X.C63942tw.A01(r7, r5, r4)
            if (r0 != r1) goto L_0x0028
            int r3 = java.lang.Integer.parseInt(r5)
            java.lang.String r0 = r4.replaceAll(r8, r6)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = r7.A03(r3, r0)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0075
        L_0x0067:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contactpicker/converttointlformat/trim/error "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)
            com.whatsapp.util.Log.w(r0, r2)
        L_0x0075:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "+"
            X.C17890vO.A10(r0, r5, r4, r1)
            java.lang.String r12 = r1.toString()
            if (r12 != 0) goto L_0x0085
            goto L_0x0029
        L_0x0085:
            X.1M9 r7 = r10.A0B
            X.2kZ r6 = r10.A07
            X.31f r8 = r10.A0D
            X.6M6 r5 = new X.6M6
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r10.A01 = r5
            X.10I r0 = r10.A0L
            X.C17890vO.A0u(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145457Li.A00(X.7Li, java.lang.String):void");
    }
}
