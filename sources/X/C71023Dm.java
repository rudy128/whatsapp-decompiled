package X;

/* renamed from: X.3Dm  reason: invalid class name and case insensitive filesystem */
public class C71023Dm implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;

    public C71023Dm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass1RR A00(C71023Dm r1) {
        AnonymousClass1RR r12 = (AnonymousClass1RR) r1.A01;
        C18070vi.A0d(r12, 0);
        return r12;
    }

    public static boolean A01(C71023Dm r2) {
        AnonymousClass1IW r1 = (AnonymousClass1IW) r2.A01;
        C18070vi.A0d(r1, 0);
        return C18020vd.A05(C18040vf.A02, (C18020vd) r1.A06.get(), 12828);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        if (((X.C57092iW) r1.A04.getValue()).A00() == false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x0036;
                case 2: goto L_0x0040;
                case 3: goto L_0x004b;
                case 4: goto L_0x005d;
                case 5: goto L_0x0072;
                case 6: goto L_0x0095;
                case 7: goto L_0x00a2;
                case 8: goto L_0x00b4;
                case 9: goto L_0x00c6;
                case 10: goto L_0x00d7;
                case 11: goto L_0x00e8;
                case 12: goto L_0x00f1;
                case 13: goto L_0x00fa;
                case 14: goto L_0x0103;
                case 15: goto L_0x010c;
                case 16: goto L_0x0115;
                case 17: goto L_0x011e;
                case 18: goto L_0x012c;
                case 19: goto L_0x0157;
                case 20: goto L_0x0164;
                case 21: goto L_0x0171;
                case 22: goto L_0x0182;
                case 23: goto L_0x0193;
                case 24: goto L_0x019f;
                case 25: goto L_0x01c2;
                case 26: goto L_0x01cd;
                case 27: goto L_0x01d8;
                case 28: goto L_0x01e3;
                case 29: goto L_0x01ee;
                case 30: goto L_0x01f9;
                case 31: goto L_0x0204;
                case 32: goto L_0x020f;
                case 33: goto L_0x021a;
                case 34: goto L_0x0225;
                case 35: goto L_0x0230;
                case 36: goto L_0x023b;
                case 37: goto L_0x024c;
                case 38: goto L_0x0259;
                case 39: goto L_0x0297;
                case 40: goto L_0x02ae;
                case 41: goto L_0x02c1;
                case 42: goto L_0x02d2;
                case 43: goto L_0x02e3;
                case 44: goto L_0x02f7;
                case 45: goto L_0x0313;
                case 46: goto L_0x0332;
                case 47: goto L_0x0341;
                case 48: goto L_0x0350;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r6.A01
            X.1Qr r1 = (X.C26061Qr) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.3Gv r0 = X.AnonymousClass3Gv.A00
            X.10f r2 = X.C26061Qr.A00(r1, r0)
            return r2
        L_0x0014:
            java.lang.Object r1 = r6.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.content.Context r0 = r1.getApplicationContext()
            X.C18070vi.A0X(r0)
            X.00c r0 = X.C17890vO.A0H(r0)
            X.10E r0 = (X.AnonymousClass10E) r0
            X.00S r0 = r0.A6w
            java.lang.Object r0 = r0.get()
            X.10d r0 = (X.C199210d) r0
            X.10i r2 = r0.A00()
            return r2
        L_0x0036:
            java.lang.Object r1 = r6.A01
            r0 = 32
            X.3Bt r2 = new X.3Bt
            r2.<init>(r1, r0)
            return r2
        L_0x0040:
            java.lang.Object r1 = r6.A01
            X.0vc r1 = (X.C18010vc) r1
            java.lang.String r0 = X.C19620yd.A09
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x004b:
            java.lang.Object r1 = r6.A01
            X.1Og r1 = (X.C25451Og) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "single_emoji_message_daily_logging_pref"
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x005d:
            java.lang.Object r1 = r6.A01
            X.1XL r1 = (X.AnonymousClass1XL) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.118 r0 = r1.A01
            android.content.Context r0 = r0.A00
            X.C18070vi.A0X(r0)
            X.2iW r2 = new X.2iW
            r2.<init>(r0)
            return r2
        L_0x0072:
            java.lang.Object r1 = r6.A01
            X.1XL r1 = (X.AnonymousClass1XL) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = X.AnonymousClass112.A01()
            if (r0 == 0) goto L_0x008f
            X.0vl r0 = r1.A04
            java.lang.Object r0 = r0.getValue()
            X.2iW r0 = (X.C57092iW) r0
            boolean r1 = r0.A00()
            r0 = 1
            if (r1 != 0) goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x0095:
            java.lang.Object r0 = r6.A01
            X.1XL r0 = (X.AnonymousClass1XL) r0
            boolean r0 = r0.A04()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x00a2:
            java.lang.Object r1 = r6.A01
            X.1Mb r1 = (X.C24891Mb) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "triggered_block_prefs"
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x00b4:
            java.lang.Object r1 = r6.A01
            X.1Mb r1 = (X.C24891Mb) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "triggered_block_prefs_purge_ts"
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x00c6:
            java.lang.Object r1 = r6.A01
            X.1ph r1 = (X.C37531ph) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "block_reasons_prefs"
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x00d7:
            java.lang.Object r1 = r6.A01
            X.1rr r1 = (X.C38771rr) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A01
            java.lang.String r0 = "bonsai_prefs"
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x00e8:
            java.lang.Object r1 = r6.A01
            r0 = 0
            X.2DN r2 = new X.2DN
            r2.<init>(r1, r0)
            return r2
        L_0x00f1:
            java.lang.Object r1 = r6.A01
            r0 = 2
            X.2DN r2 = new X.2DN
            r2.<init>(r1, r0)
            return r2
        L_0x00fa:
            java.lang.Object r1 = r6.A01
            r0 = 4
            X.2DN r2 = new X.2DN
            r2.<init>(r1, r0)
            return r2
        L_0x0103:
            java.lang.Object r1 = r6.A01
            r0 = 0
            X.5yZ r2 = new X.5yZ
            r2.<init>(r1, r0)
            return r2
        L_0x010c:
            java.lang.Object r1 = r6.A01
            r0 = 3
            X.2DN r2 = new X.2DN
            r2.<init>(r1, r0)
            return r2
        L_0x0115:
            java.lang.Object r1 = r6.A01
            r0 = 1
            X.2DN r2 = new X.2DN
            r2.<init>(r1, r0)
            return r2
        L_0x011e:
            java.lang.Object r1 = r6.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r1 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragment) r1
            r0 = 1
            int r0 = com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A00(r1, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x012c:
            java.lang.Object r4 = r6.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r4 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragment) r4
            X.00H r0 = r4.A0r
            r0.get()
            android.content.Context r0 = r4.A1n()
            r3 = 0
            X.C18070vi.A0d(r0, r3)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity.edit"
            r2.putExtra(r0, r3)
            r4.A1k(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            return r2
        L_0x0157:
            boolean r0 = A01(r6)
            r1 = 2131897245(0x7f122b9d, float:1.9429374E38)
            if (r0 == 0) goto L_0x017d
            r1 = 2131897246(0x7f122b9e, float:1.9429376E38)
            goto L_0x017d
        L_0x0164:
            boolean r0 = A01(r6)
            r1 = 2131897247(0x7f122b9f, float:1.9429378E38)
            if (r0 == 0) goto L_0x017d
            r1 = 2131897248(0x7f122ba0, float:1.942938E38)
            goto L_0x017d
        L_0x0171:
            boolean r0 = A01(r6)
            r1 = 2131897249(0x7f122ba1, float:1.9429382E38)
            if (r0 == 0) goto L_0x017d
            r1 = 2131897250(0x7f122ba2, float:1.9429384E38)
        L_0x017d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            return r2
        L_0x0182:
            java.lang.Object r1 = r6.A01
            X.1TK r1 = (X.AnonymousClass1TK) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A01
            java.lang.String r0 = "chat_lock"
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x0193:
            java.lang.Object r0 = r6.A01
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            com.whatsapp.conversationslist.filter.ConversationFilterViewModel r0 = r0.A1k
            r0.A0T()
            X.1Wu r2 = X.C27621Wu.A00
            return r2
        L_0x019f:
            java.lang.Object r1 = r6.A01
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            com.whatsapp.conversationslist.filter.ConversationFilterViewModel r0 = r1.A1k
            r0.A0T()
            X.1Gk r0 = r1.A27()
            java.util.List r0 = r0.A03
            if (r0 != 0) goto L_0x01b2
            X.0wS r0 = X.C18460wS.A00
        L_0x01b2:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01bf
            X.1Gk r0 = r1.A27()
            r1.BCQ(r0)
        L_0x01bf:
            X.1Wu r2 = X.C27621Wu.A00
            return r2
        L_0x01c2:
            X.1RR r0 = A00(r6)
            X.00H r0 = r0.A0A
            java.lang.Object r2 = r0.get()
            return r2
        L_0x01cd:
            X.1RR r0 = A00(r6)
            X.00H r0 = r0.A03
            java.lang.Object r2 = r0.get()
            return r2
        L_0x01d8:
            X.1RR r0 = A00(r6)
            X.00H r0 = r0.A04
            java.lang.Object r2 = r0.get()
            return r2
        L_0x01e3:
            X.1RR r0 = A00(r6)
            X.00H r0 = r0.A00
            java.lang.Object r2 = r0.get()
            return r2
        L_0x01ee:
            X.1RR r0 = A00(r6)
            X.00H r0 = r0.A01
            java.lang.Object r2 = r0.get()
            return r2
        L_0x01f9:
            X.1RR r0 = A00(r6)
            X.00H r0 = r0.A07
            java.lang.Object r2 = r0.get()
            return r2
        L_0x0204:
            X.1RR r0 = A00(r6)
            X.00H r0 = r0.A02
            java.lang.Object r2 = r0.get()
            return r2
        L_0x020f:
            X.1RR r0 = A00(r6)
            X.00H r0 = r0.A08
            java.lang.Object r2 = r0.get()
            return r2
        L_0x021a:
            X.1RR r0 = A00(r6)
            X.00H r0 = r0.A09
            java.lang.Object r2 = r0.get()
            return r2
        L_0x0225:
            X.1RR r0 = A00(r6)
            X.00H r0 = r0.A06
            java.lang.Object r2 = r0.get()
            return r2
        L_0x0230:
            X.1RR r0 = A00(r6)
            X.00H r0 = r0.A05
            java.lang.Object r2 = r0.get()
            return r2
        L_0x023b:
            java.lang.Object r1 = r6.A01
            X.1PR r1 = (X.AnonymousClass1PR) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "disappearing_mode_prefs"
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x024c:
            java.lang.Object r0 = r6.A01
            X.1Pe r0 = (X.C25681Pe) r0
            X.0vc r1 = r0.A02
            java.lang.String r0 = "consent"
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x0259:
            java.lang.Object r5 = r6.A01
            X.1Pe r5 = (X.C25681Pe) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            android.content.SharedPreferences r1 = r5.A02()
            java.lang.String r0 = "registration_ban_timestamp"
            r3 = 0
            long r1 = r1.getLong(r0, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            android.content.SharedPreferences r1 = r5.A02()
            if (r0 <= 0) goto L_0x0285
            java.lang.String r0 = "idv_token"
            java.lang.String r0 = X.C17880vN.A0r(r1, r0)
            X.7Fj r1 = new X.7Fj
            r1.<init>(r0)
        L_0x0280:
            X.1G7 r2 = X.C34071js.A00(r1)
            return r2
        L_0x0285:
            java.lang.String r0 = "url"
            java.lang.String r0 = X.C17880vN.A0r(r1, r0)
            if (r0 == 0) goto L_0x0294
            X.7Fk r1 = new X.7Fk
            r1.<init>(r0)
            goto L_0x0280
        L_0x0294:
            X.7Fv r1 = X.C144057Fv.A00
            goto L_0x0280
        L_0x0297:
            java.lang.Object r1 = r6.A01
            com.whatsapp.dobverification.DosaRepository r1 = (com.whatsapp.dobverification.DosaRepository) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vl r0 = r1.A05
            java.lang.Object r1 = r0.getValue()
            X.1G1 r1 = (X.AnonymousClass1G1) r1
            r0 = 0
            X.1jt r2 = new X.1jt
            r2.<init>(r0, r1)
            return r2
        L_0x02ae:
            java.lang.Object r1 = r6.A01
            X.1gq r1 = (X.C32221gq) r1
            java.lang.String r0 = X.C32221gq.A02
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = X.C32221gq.A02
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x02c1:
            java.lang.Object r1 = r6.A01
            X.1UZ r1 = (X.AnonymousClass1UZ) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "nc_prefs"
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x02d2:
            java.lang.Object r1 = r6.A01
            X.1QG r1 = (X.AnonymousClass1QG) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "com.whatsapp_alert_framework_preferences"
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x02e3:
            java.lang.Object r3 = r6.A01
            X.1jg r3 = (X.C33971jg) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.0vc r1 = r3.A00
            java.lang.String r0 = "interop_ui"
            android.content.SharedPreferences r2 = r1.A05(r0)
            r2.registerOnSharedPreferenceChangeListener(r3)
            return r2
        L_0x02f7:
            java.lang.Object r0 = r6.A01
            X.1jg r0 = (X.C33971jg) r0
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            android.content.SharedPreferences r1 = X.C33971jg.A00(r0)
            java.lang.String r0 = "unified_inbox_option"
            int r0 = r1.getInt(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.1G7 r2 = X.C34071js.A00(r0)
            return r2
        L_0x0313:
            java.lang.Object r3 = r6.A01
            X.1Of r3 = (X.C25441Of) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r1 = 0
            r0 = 1000(0x3e8, float:1.401E-42)
            X.DXn r2 = new X.DXn
            r2.<init>(r0)
            X.1OX r4 = r3.A08
            com.whatsapp.logging.messaging.MessagingFunnelLoggerImpl$jobQueue$2$1 r3 = new com.whatsapp.logging.messaging.MessagingFunnelLoggerImpl$jobQueue$2$1
            r3.<init>(r1, r2)
            X.1OR r1 = X.AnonymousClass1OR.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.C30451dy.A02(r0, r1, r3, r4)
            return r2
        L_0x0332:
            java.lang.Object r1 = r6.A01
            X.1Qr r1 = (X.C26061Qr) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.3Gw r0 = X.AnonymousClass3Gw.A00
            X.10f r2 = X.C26061Qr.A00(r1, r0)
            return r2
        L_0x0341:
            java.lang.Object r1 = r6.A01
            X.1Qr r1 = (X.C26061Qr) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.3Gx r0 = X.AnonymousClass3Gx.A00
            X.10f r2 = X.C26061Qr.A00(r1, r0)
            return r2
        L_0x0350:
            java.lang.Object r1 = r6.A01
            X.1Qr r1 = (X.C26061Qr) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.3Gy r0 = X.AnonymousClass3Gy.A00
            X.10f r2 = X.C26061Qr.A00(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71023Dm.invoke():java.lang.Object");
    }
}
