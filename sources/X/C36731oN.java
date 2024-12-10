package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1oN  reason: invalid class name and case insensitive filesystem */
public final class C36731oN {
    public final C36361nl A00;
    public final C36721oM A01;
    public final C18030ve A02;
    public final AnonymousClass1LU A03;
    public final C33451iq A04;

    public C36731oN(C36361nl r2, C36721oM r3, C18030ve r4, AnonymousClass1LU r5, C33451iq r6) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r3, 5);
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
    }

    public final void A00(Context context, String str, Map map) {
        String obj;
        C18070vi.A0d(context, 2);
        if (C18070vi.A18(str, "open-link")) {
            String str2 = (String) map.get("link");
            if (str2 == null) {
                obj = "UserNoticeLinkActionHandler/handleOpenLink null url";
            } else {
                C36721oM r6 = this.A01;
                if (C18020vd.A05(C18040vf.A02, r6.A00, 8926)) {
                    Iterator it = r6.A01.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (AnonymousClass1YF.A0Y((CharSequence) entry.getValue(), str2, false)) {
                            String str3 = (String) entry.getKey();
                            if (str3 != null) {
                                try {
                                    r6.A01((AnonymousClass1FL) AnonymousClass1L9.A01(context, AnonymousClass1FL.class), str3);
                                    return;
                                } catch (Exception e) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("UserNoticeLinkActionHandler/handleOpenLink ");
                                    sb.append(e);
                                    Log.e(sb.toString());
                                    this.A00.CGU(context, Uri.parse(str2), (AnonymousClass206) null);
                                    return;
                                }
                            }
                        }
                    }
                }
                this.A00.CGU(context, Uri.parse(str2), (AnonymousClass206) null);
                return;
            }
        } else if (C18070vi.A18(str, "open-modal")) {
            A01(context, false);
            return;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UserNoticeLinkActionHandler/handleAction unknown action: ");
            sb2.append(str);
            sb2.append(" with params: ");
            sb2.append(map);
            obj = sb2.toString();
        }
        Log.e(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r11, boolean r12) {
        /*
            r10 = this;
            r5 = 0
            X.C18070vi.A0d(r11, r5)
            X.1iq r4 = r10.A04
            r9 = 0
            X.1io r6 = r4.A03
            X.2tN r8 = r6.A00()
            if (r8 == 0) goto L_0x0019
            r3 = 3
            if (r12 != 0) goto L_0x001f
            int r1 = r8.A00
            if (r1 == r3) goto L_0x001f
            r0 = 4
            if (r1 == r0) goto L_0x001f
        L_0x0019:
            java.lang.String r0 = "UserNoticeLinkActionHandler/handleOpenModal/no modal"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x001f:
            int r2 = r8.A01
            X.0ve r7 = r4.A01
            boolean r0 = X.C63802ti.A01(r7, r2)
            if (r0 == 0) goto L_0x003e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserNoticeManager/getModal/green alert disabled, notice: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
        L_0x003a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0019
        L_0x003e:
            X.1in r0 = r4.A02
            X.2mq r1 = r0.A04(r8)
            if (r1 == 0) goto L_0x0019
            r2 = 1
            if (r12 != 0) goto L_0x005e
            int r0 = r8.A00
            if (r0 == r3) goto L_0x005e
            X.2Lu r3 = r1.A03
            if (r3 != 0) goto L_0x006c
            java.lang.String r0 = "UserNoticeManager/getModal/no content for stage 4"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.190 r1 = r4.A00
            java.lang.String r0 = "UserNoticeManager/getModal/blockingModal/noContent"
        L_0x005a:
            r1.A0G(r0, r9, r2)
            goto L_0x0019
        L_0x005e:
            X.2Lu r3 = r1.A04
            if (r3 != 0) goto L_0x0077
            java.lang.String r0 = "UserNoticeManager/getModal/no content for stage 3"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.190 r1 = r4.A00
            java.lang.String r0 = "UserNoticeManager/getModal/modal/noContent"
            goto L_0x005a
        L_0x006c:
            X.1vP r1 = r3.A00
            boolean r0 = X.C33451iq.A07(r1, r4)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "UserNoticeManager/getModal/blocking modal not shown as per timing"
            goto L_0x003a
        L_0x0077:
            if (r12 != 0) goto L_0x009a
            X.1vP r1 = r3.A00
            boolean r0 = X.C33451iq.A07(r1, r4)
            if (r0 != 0) goto L_0x008e
            java.lang.String r0 = "UserNoticeManager/getModal/modal not shown as per timing"
            goto L_0x003a
        L_0x0084:
            boolean r0 = X.C63802ti.A02(r7, r8)
            X.C33451iq.A03(r1, r4, r0)
            java.lang.String r0 = "UserNoticeManager/getModal/has blocking modal"
            goto L_0x0097
        L_0x008e:
            boolean r0 = X.C63802ti.A02(r7, r8)
            X.C33451iq.A03(r1, r4, r0)
            java.lang.String r0 = "UserNoticeManager/getModal/has modal"
        L_0x0097:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x009a:
            X.2tN r1 = r6.A00()
            if (r1 == 0) goto L_0x00c4
            X.0ve r0 = r10.A02
            boolean r0 = X.C63802ti.A02(r0, r1)
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = "GreenAlert/launchModal"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r0 = "com.whatsapp.greenalert.GreenAlertActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "page"
            r2.putExtra(r0, r5)
            r11.startActivity(r2)
            return
        L_0x00c4:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = "icon_light_url"
            java.lang.String r0 = r3.A06
            r2.putString(r1, r0)
            java.lang.String r1 = "icon_dark_url"
            java.lang.String r0 = r3.A05
            r2.putString(r1, r0)
            java.lang.String r1 = "icon_description"
            java.lang.String r0 = r3.A04
            r2.putString(r1, r0)
            java.lang.String r1 = "title"
            java.lang.String r0 = r3.A07
            r2.putString(r1, r0)
            java.util.List r6 = r3.A08
            int r1 = r6.size()
            java.lang.String r0 = "bullets_size"
            r2.putInt(r0, r1)
            int r4 = r6.size()
        L_0x00f5:
            if (r5 >= r4) goto L_0x0142
            java.lang.Object r7 = r6.get(r5)
            X.2mI r7 = (X.C59432mI) r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "bullet_text_"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r7.A02
            r2.putString(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "bullet_icon_light_url_"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r7.A01
            r2.putString(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "bullet_icon_dark_url_"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r7.A00
            r2.putString(r1, r0)
            int r5 = r5 + 1
            goto L_0x00f5
        L_0x0142:
            java.lang.String r1 = "agree_button_text"
            java.lang.String r0 = r3.A01
            r2.putString(r1, r0)
            X.1vP r6 = r3.A00
            X.1vL r0 = r6.A02
            if (r0 == 0) goto L_0x0157
            java.lang.String r4 = "start_time_millis"
            long r0 = r0.A00
            r2.putLong(r4, r0)
        L_0x0157:
            X.1vM r5 = r6.A00
            if (r5 == 0) goto L_0x0169
            java.lang.String r4 = "duration_static"
            long r0 = r5.A00
            r2.putLong(r4, r0)
            java.lang.String r1 = "duration_repeat"
            long[] r0 = r5.A01
            r2.putLongArray(r1, r0)
        L_0x0169:
            X.1vL r0 = r6.A01
            if (r0 == 0) goto L_0x0174
            java.lang.String r4 = "end_time_millis"
            long r0 = r0.A00
            r2.putLong(r4, r0)
        L_0x0174:
            java.lang.String r1 = "body"
            java.lang.String r0 = r3.A02
            r2.putString(r1, r0)
            java.lang.String r1 = "footer"
            java.lang.String r0 = r3.A04
            r2.putString(r1, r0)
            java.lang.String r1 = "dismiss_button_text"
            java.lang.String r0 = r3.A03
            r2.putString(r1, r0)
            X.4DO r0 = r3.A02
            if (r0 == 0) goto L_0x0194
            java.lang.String r1 = "icon_role"
            java.lang.String r0 = r0.id
            r2.putString(r1, r0)
        L_0x0194:
            X.4DP r0 = r3.A03
            if (r0 == 0) goto L_0x019f
            java.lang.String r1 = "icon_style"
            java.lang.String r0 = r0.id
            r2.putString(r1, r0)
        L_0x019f:
            java.lang.String r1 = "light_icon_path"
            java.io.File r0 = r3.A01
            if (r0 == 0) goto L_0x01ac
            java.lang.String r0 = r0.getAbsolutePath()
            r2.putString(r1, r0)
        L_0x01ac:
            java.lang.String r1 = "dark_icon_path"
            java.io.File r0 = r3.A00
            if (r0 == 0) goto L_0x01b9
            java.lang.String r0 = r0.getAbsolutePath()
            r2.putString(r1, r0)
        L_0x01b9:
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r1 = new com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment
            r1.<init>()
            r1.A1R(r2)
            java.lang.Class<X.1FU> r0 = X.AnonymousClass1FU.class
            android.app.Activity r0 = X.AnonymousClass1L9.A01(r11, r0)
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.CMl(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36731oN.A01(android.content.Context, boolean):void");
    }
}
