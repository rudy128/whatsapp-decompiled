package X;

import android.content.Context;
import com.whatsapp.bridge.wfal.WfalManager;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1x5  reason: invalid class name and case insensitive filesystem */
public final class C41801x5 {
    public final AnonymousClass1KB A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final Map A0F;

    public C41801x5(AnonymousClass1KB r19, AnonymousClass10I r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, Map map) {
        AnonymousClass1KB r17 = r19;
        C18070vi.A0d(r17, 1);
        AnonymousClass10I r16 = r20;
        C18070vi.A0d(r16, 2);
        AnonymousClass00H r15 = r21;
        C18070vi.A0d(r15, 3);
        AnonymousClass00H r14 = r22;
        C18070vi.A0d(r14, 4);
        AnonymousClass00H r13 = r23;
        C18070vi.A0d(r13, 5);
        AnonymousClass00H r12 = r24;
        C18070vi.A0d(r12, 6);
        AnonymousClass00H r11 = r25;
        C18070vi.A0d(r11, 7);
        AnonymousClass00H r10 = r26;
        C18070vi.A0d(r10, 8);
        AnonymousClass00H r9 = r27;
        C18070vi.A0d(r9, 9);
        AnonymousClass00H r8 = r28;
        C18070vi.A0d(r8, 10);
        AnonymousClass00H r7 = r29;
        C18070vi.A0d(r7, 11);
        AnonymousClass00H r6 = r30;
        C18070vi.A0d(r6, 12);
        AnonymousClass00H r5 = r31;
        C18070vi.A0d(r5, 13);
        AnonymousClass00H r4 = r32;
        C18070vi.A0d(r4, 14);
        Map map2 = map;
        C18070vi.A0d(map2, 15);
        AnonymousClass00H r3 = r33;
        C18070vi.A0d(r3, 16);
        this.A00 = r17;
        this.A01 = r16;
        this.A0E = r15;
        this.A03 = r14;
        this.A02 = r13;
        this.A04 = r12;
        this.A0B = r11;
        this.A07 = r10;
        this.A0C = r9;
        this.A0A = r8;
        this.A0D = r7;
        this.A06 = r6;
        this.A05 = r5;
        this.A09 = r4;
        this.A0F = map2;
        this.A08 = r3;
    }

    public static final C30101dO A00(C41801x5 r1) {
        return (C30101dO) r1.A0F.get(551499239);
    }

    public final void A03(Context context, C122646Re r16, String str, List list, int i) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Crossposting invoked from entrypoint: ");
        int i2 = i;
        sb.append(i2);
        C18070vi.A0d(sb.toString(), 0);
        C122646Re r9 = r16;
        String str3 = str;
        C55672gB r7 = new C55672gB(context, r9, this, str3, list, i2);
        C53942dL r3 = (C53942dL) this.A0C.get();
        if (i2 == 3) {
            str2 = "contextual_share_icon";
        } else if (i2 == 4 || i2 == 5) {
            str2 = "status_list_single_status_share_to_fb_menu";
        } else if (i2 == 6) {
            str2 = "status_list_multiple_statuses_share_to_fb_menu";
        } else if (i2 != 7) {
            str2 = "debug";
        } else {
            str2 = "status_detail_share_to_fb_menu";
        }
        AnonymousClass00H r1 = r3.A01;
        if (((WfalManager) r1.get()).A03(r9) == null || C18070vi.A18(((C34951lN) ((WfalManager) r1.get()).A04.get()).A05(), true)) {
            Context context2 = context;
            r3.A00.A00(context2, new C66422y9(r7), r9, AnonymousClass00R.A0C, str2, str3);
            return;
        }
        C41801x5 r2 = r7.A03;
        r2.A00.A0J(new AnonymousClass7QG(r2, r7.A01, r7.A02, r7.A05, r7.A04, r7.A00, 4));
    }

    public final boolean A04(C122646Re r7, AnonymousClass206 r8) {
        Integer A032;
        long j = r8.A0x;
        AnonymousClass00H r4 = ((C57012iO) this.A0D.get()).A00;
        if (!((AnonymousClass738) r4.get()).A05(r7, j)) {
            return false;
        }
        Integer A033 = ((AnonymousClass738) r4.get()).A03(r7, j);
        if ((A033 == null || 1 != A033.intValue()) && ((A032 = ((AnonymousClass738) r4.get()).A03(r7, j)) == null || 7 != A032.intValue())) {
            return false;
        }
        return true;
    }

    public final boolean A05(C122646Re r5, AnonymousClass206 r6) {
        Integer A032;
        long j = r6.A0x;
        AnonymousClass00H r3 = ((C57012iO) this.A0D.get()).A00;
        if (!((AnonymousClass738) r3.get()).A05(r5, j) || (A032 = ((AnonymousClass738) r3.get()).A03(r5, j)) == null || 3 != A032.intValue()) {
            return false;
        }
        return true;
    }

    public static final void A01(Context context, C122646Re r11, C41801x5 r12, String str, List list, int i) {
        String A012 = AnonymousClass74A.A01();
        C41801x5 r2 = r12;
        C122646Re r5 = r11;
        AnonymousClass6OD r8 = new AnonymousClass6OD(context, r11, r2, r12.A06, str, list);
        List singletonList = Collections.singletonList(r5);
        C18070vi.A0X(singletonList);
        A02(r2, singletonList, list, i);
        r2.A01.CGF(new AnonymousClass7R6(r2, context, list, r5, r8, A012, i, 2));
        ((AnonymousClass7PL) r2.A05.get()).A00(r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C41801x5 r4, java.util.List r5, java.util.List r6, int r7) {
        /*
            X.1dO r2 = A00(r4)
            if (r2 == 0) goto L_0x00fe
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            if (r0 == 0) goto L_0x0086
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x004e
            java.lang.String r3 = "auto_xpost_status_creation_share_view"
        L_0x0015:
            java.lang.String r1 = "INIT_CROSSPOST"
            r0 = 551499239(0x20df35e7, float:3.781334E-19)
            r2.A05(r3, r1, r0)
            java.lang.String r0 = "entrypoint"
            r2.A01(r3, r0)
            java.util.Iterator r3 = r5.iterator()
        L_0x0026:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r1 = r3.next()
            X.6Re r1 = (X.C122646Re) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r1 = r1.iqValue
            java.lang.String r0 = "FB"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x004b
            java.lang.String r1 = "is_destination_fb"
        L_0x0042:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01(r0, r1)
            goto L_0x0026
        L_0x004b:
            java.lang.String r1 = "is_destination_ig"
            goto L_0x0042
        L_0x004e:
            r0 = 2
            if (r1 != r0) goto L_0x0054
            java.lang.String r3 = "auto_xpost_status_creation_audience_selector_view"
            goto L_0x0015
        L_0x0054:
            r0 = 3
            if (r1 != r0) goto L_0x005a
            java.lang.String r3 = "contextual_share_icon"
            goto L_0x0015
        L_0x005a:
            r0 = 4
            if (r1 != r0) goto L_0x0061
            java.lang.String r3 = "status_list_single_status_share_menu"
            goto L_0x0015
        L_0x0061:
            r0 = 5
            if (r1 != r0) goto L_0x0068
            java.lang.String r3 = "status_list_single_status_long_press_share_menu"
            goto L_0x0015
        L_0x0068:
            r0 = 6
            if (r1 != r0) goto L_0x006f
            java.lang.String r3 = "status_list_multiple_statuses_share_menu"
            goto L_0x0015
        L_0x006f:
            r0 = 7
            if (r1 != r0) goto L_0x0076
            java.lang.String r3 = "status_detail_top_share_menu"
            goto L_0x0015
        L_0x0076:
            r0 = 8
            if (r1 != r0) goto L_0x007e
            java.lang.String r3 = "status_detail_overlay_app_icon"
            goto L_0x0015
        L_0x007e:
            r0 = 10
            if (r1 != r0) goto L_0x0086
            java.lang.String r3 = "xpost_retry"
            goto L_0x0015
        L_0x0086:
            java.lang.String r3 = "other"
            goto L_0x0015
        L_0x0089:
            X.00H r0 = r4.A0E
            java.lang.Object r0 = r0.get()
            com.whatsapp.bridge.wfal.WfalManager r0 = (com.whatsapp.bridge.wfal.WfalManager) r0
            X.6zR r4 = r0.A01()
            java.lang.String r5 = "status_id_to_type_map"
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00a5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r1 = r6.next()
            X.206 r1 = (X.AnonymousClass206) r1
            X.205 r0 = r1.A0v
            java.lang.String r3 = r0.A01
            X.C18070vi.A0X(r3)
            boolean r0 = r1 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = "text"
        L_0x00bf:
            r7.put(r3, r0)
            goto L_0x00a5
        L_0x00c3:
            int r1 = r1.A0u
            r0 = 1
            if (r1 != r0) goto L_0x00cb
            java.lang.String r0 = "photo"
            goto L_0x00bf
        L_0x00cb:
            r0 = 3
            if (r1 != r0) goto L_0x00d2
            java.lang.String r0 = "video"
            goto L_0x00bf
        L_0x00d2:
            java.lang.String r0 = "other"
            goto L_0x00bf
        L_0x00d5:
            java.util.Map r1 = X.AnonymousClass1D7.A0F(r7)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.String r0 = r0.toString()
            X.C18070vi.A0X(r0)
            r2.A01(r0, r5)
            boolean r0 = r4.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_auto_crosspost_setting_fb"
            r2.A01(r1, r0)
            boolean r0 = r4.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_auto_crosspost_setting_ig"
            r2.A01(r1, r0)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41801x5.A02(X.1x5, java.util.List, java.util.List, int):void");
    }
}
