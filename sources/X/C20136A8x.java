package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.A8x  reason: case insensitive filesystem */
public final class C20136A8x {
    public final AnonymousClass11S A00;
    public final C183049Ws A01;
    public final AnonymousClass11P A02;
    public final C19830z4 A03;
    public final AnonymousClass1CJ A04;
    public final C37541pi A05;
    public final AnonymousClass1R3 A06;
    public final C18030ve A07;
    public final AnonymousClass18K A08;
    public final C25931Qe A09;
    public final C32011gU A0A;
    public final AnonymousClass1N5 A0B;
    public final AnonymousClass1W6 A0C;
    public final C57442j5 A0D;
    public final A1E A0E;
    public final AnonymousClass1M9 A0F;
    public final C26161Rb A0G;

    public final AnonymousClass206 A0B(AnonymousClass1BI r10) {
        Cursor A0A2;
        AnonymousClass1R3 r5 = this.A06;
        ArrayList A13 = AnonymousClass000.A13();
        try {
            C28781at A042 = r5.A04.get();
            try {
                C23141Ev r6 = ((C28801av) A042).A02;
                String str = AnonymousClass203.A07;
                String[] A1Z = C17880vN.A1Z();
                AnonymousClass1LW.A03(r5.A00, r10, A1Z, 0);
                A1Z[1] = String.valueOf(1);
                A0A2 = r6.A0A(str, "GET_LAST_SIGNIFICANT_OUTGOING_MESSAGES_SQL", A1Z);
                while (A0A2.moveToNext()) {
                    AnonymousClass206 A022 = C17880vN.A0c(r5.A07).A02(A0A2, r10);
                    if (A022 != null) {
                        A13.add(A022);
                    }
                }
                A0A2.close();
                A042.close();
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            r5.A03.A03();
        } catch (IllegalStateException e2) {
            Log.i("msgstore/getLastSignificantOutgoingMessages/IllegalStateException ", e2);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        if (C17880vN.A1X(A13)) {
            return (AnonymousClass206) A13.get(0);
        }
        return null;
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean A0C(X.AnonymousClass206 r6) {
        /*
            r5 = this;
            r2 = 0
            X.C18070vi.A0d(r6, r2)
            X.0ve r3 = r5.A07
            r1 = 12133(0x2f65, float:1.7002E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 != 0) goto L_0x0012
            r0 = 0
            return r0
        L_0x0012:
            boolean r1 = r6 instanceof X.AnonymousClass210
            if (r1 == 0) goto L_0x0023
            r0 = r6
            X.210 r0 = (X.AnonymousClass210) r0
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L_0x0023
            r2 = 1
        L_0x001e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0023:
            boolean r0 = r6 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x0066
            X.AEt r3 = X.AnonymousClass8BR.A0g(r6)
            if (r3 == 0) goto L_0x001e
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = r3.A0B
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.append(r0)
        L_0x003c:
            X.AEE r1 = r3.A05
            if (r1 == 0) goto L_0x004e
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x0047
            X.C17900vP.A0p(r4, r0)
        L_0x0047:
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x004e
            X.C17900vP.A0p(r4, r0)
        L_0x004e:
            java.lang.String r0 = r3.A0C
            if (r0 == 0) goto L_0x0055
            X.C17900vP.A0p(r4, r0)
        L_0x0055:
            java.lang.String r1 = r4.toString()
        L_0x0059:
            if (r1 == 0) goto L_0x001e
            X.1gU r0 = r5.A0A
            r2 = 1
            java.util.ArrayList r0 = r0.A04(r1, r2)
            if (r0 != 0) goto L_0x001e
            r2 = 0
            goto L_0x001e
        L_0x0066:
            boolean r0 = r6 instanceof X.C439421n
            if (r0 == 0) goto L_0x008a
            X.21n r6 = (X.C439421n) r6
            X.2k6 r1 = r6.BaE()
            java.lang.StringBuilder r4 = X.C108955ca.A15(r1)
            java.lang.String r0 = r1.A02
            r4.append(r0)
            java.lang.String r3 = r1.A03
            if (r3 == 0) goto L_0x0055
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 32
            r1.append(r0)
            X.C108985cd.A1L(r3, r1, r4)
            goto L_0x0055
        L_0x008a:
            boolean r0 = X.C20097A7a.A05(r6)
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = X.C20097A7a.A02(r6)
            goto L_0x0059
        L_0x0095:
            if (r1 == 0) goto L_0x009c
            java.lang.String r1 = r6.A0P()
            goto L_0x0059
        L_0x009c:
            boolean r0 = r6 instanceof X.C438921i
            if (r0 == 0) goto L_0x00a5
            X.21i r6 = (X.C438921i) r6
            java.lang.String r1 = r6.A01
            goto L_0x0059
        L_0x00a5:
            boolean r0 = r6 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x00b0
            X.21V r6 = (X.AnonymousClass21V) r6
            java.lang.String r1 = r6.A18()
            goto L_0x0059
        L_0x00b0:
            boolean r0 = r6 instanceof X.AnonymousClass219
            if (r0 == 0) goto L_0x001e
            X.219 r6 = (X.AnonymousClass219) r6
            java.lang.String r1 = r6.A03
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20136A8x.A0C(X.206):java.lang.Boolean");
    }

    public final Integer A0E(AnonymousClass1BI r7) {
        int i;
        if (!C18020vd.A05(C18040vf.A02, this.A07, 8547)) {
            return null;
        }
        long A012 = AnonymousClass11P.A01(this.A02) - this.A0D.A00(r7);
        if (A012 <= 86400000) {
            return 0;
        }
        if (A012 <= 604800000) {
            i = 1;
        } else {
            i = 3;
            if (A012 <= 2592000000L) {
                i = 2;
            }
        }
        return Integer.valueOf(i);
    }

    public final String A0L(AnonymousClass206 r6) {
        String str;
        C18070vi.A0d(r6, 0);
        C18030ve r3 = this.A07;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r3, 7893)) {
            str = C20120A8f.A04(r6);
        } else {
            if (r6 instanceof C439421n) {
                C58072k6 BaE = ((C439421n) r6).BaE();
                C18070vi.A0X(BaE);
                str = BaE.A05;
            } else {
                str = null;
            }
            if (r6 instanceof AnonymousClass21L) {
                str = this.A05.A00(r6);
            }
        }
        if (str != null || !r6.A11(4194304)) {
            return str;
        }
        String str2 = r6.A0v.A01;
        if (!C18020vd.A05(r2, r3, 4658)) {
            return str2;
        }
        this.A09.A0A(C18070vi.A09(r6, C20954Ac8.class));
        if (C196879vn.A00(r6) != null) {
            return C196879vn.A00(r6);
        }
        return str2;
    }

    public final boolean A0N(int i) {
        if (i != 3) {
            return false;
        }
        C18030ve r2 = this.A07;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 9687) || C18020vd.A05(r1, r2, 9740)) {
            return true;
        }
        return false;
    }

    public final boolean A0R(AnonymousClass205 r5) {
        AnonymousClass1BI r1 = r5.A00;
        if (r1 == null || !A0O(r1) || !A0O(r1)) {
            return false;
        }
        C18030ve r2 = this.A07;
        C18040vf r12 = C18040vf.A02;
        if (!C18020vd.A05(r12, r2, 7557) || !C18020vd.A05(r12, r2, 10097)) {
            return false;
        }
        return true;
    }

    public C20136A8x(AnonymousClass11S r18, C183049Ws r19, C57442j5 r20, A1E a1e, AnonymousClass1M9 r22, AnonymousClass11P r23, C19830z4 r24, AnonymousClass1CJ r25, C37541pi r26, AnonymousClass1R3 r27, C18030ve r28, C26161Rb r29, AnonymousClass18K r30, C25931Qe r31, C32011gU r32, AnonymousClass1N5 r33, AnonymousClass1W6 r34) {
        AnonymousClass18K r5 = r30;
        AnonymousClass1R3 r7 = r27;
        C18030ve r6 = r28;
        AnonymousClass1CJ r9 = r25;
        AnonymousClass11P r15 = r23;
        C18070vi.A0w(r15, r6, r7, r5, r9);
        AnonymousClass1N5 r3 = r33;
        C25931Qe r0 = r31;
        C37541pi r8 = r26;
        AnonymousClass11S r16 = r18;
        C72483Me.A16(r0, r8, r16, r3, 7);
        AnonymousClass1W6 r2 = r34;
        A1E a1e2 = a1e;
        AnonymousClass1M9 r11 = r22;
        C183049Ws r14 = r19;
        C57442j5 r13 = r20;
        C18070vi.A0y(r11, r2, r13, r14, a1e2);
        C32011gU r4 = r32;
        C19830z4 r10 = r24;
        C18070vi.A0m(r10, r4);
        this.A02 = r15;
        this.A07 = r6;
        this.A06 = r7;
        this.A08 = r5;
        this.A04 = r9;
        this.A0G = r29;
        this.A09 = r0;
        this.A05 = r8;
        this.A00 = r16;
        this.A0B = r3;
        this.A0F = r11;
        this.A0C = r2;
        this.A0D = r13;
        this.A01 = r14;
        this.A0E = a1e2;
        this.A03 = r10;
        this.A0A = r4;
    }

    public static final int A00(AnonymousClass1E7 r2) {
        C42741yf r22 = r2.A0G;
        if (r22 != null) {
            if (r22.A03()) {
                return 2;
            }
            if (r22.A02()) {
                return 3;
            }
        }
        return 1;
    }

    public static final long A03(AnonymousClass206 r3, long j) {
        return TimeUnit.MILLISECONDS.toSeconds(Math.max(j - r3.A0G, 0));
    }

    public static final Long A06(AnonymousClass206 r3, long j) {
        if (r3 == null) {
            return null;
        }
        return AnonymousClass8BT.A0p(TimeUnit.MILLISECONDS, Math.max(j - r3.A0I, 0));
    }

    public static final String A08(AnonymousClass206 r2) {
        C20285AEt A0g;
        if (r2 instanceof C439421n) {
            return ((C439421n) r2).BaE().A04;
        }
        if (!(r2 instanceof AnonymousClass21K) || (A0g = AnonymousClass8BR.A0g(r2)) == null) {
            return null;
        }
        return A0g.A0D;
    }

    public final Boolean A0D(boolean z) {
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A07, 8547);
        if (A052) {
            return Boolean.valueOf(z);
        }
        if (!A052) {
            return null;
        }
        throw AnonymousClass3MW.A14();
    }

    public final Integer A0F(AnonymousClass206 r4) {
        AnonymousClass1E7 A0E2;
        AnonymousClass1BI r2 = r4.A0v.A00;
        if (r2 == null || (A0E2 = this.A0F.A0E(r2)) == null) {
            return null;
        }
        return Integer.valueOf(A00(A0E2));
    }

    public final Integer A0G(AnonymousClass206 r4) {
        String str;
        int i;
        if (r4 instanceof C439421n) {
            C58072k6 BaE = ((C439421n) r4).BaE();
            C18070vi.A0X(BaE);
            str = BaE.A01;
        } else {
            str = null;
        }
        if (r4.A11(4194304)) {
            str = "MARKETING_MESSAGE_SMB";
        } else if (str == null) {
            return null;
        }
        if ("TRANSACTIONAL".equals(str)) {
            i = 1;
        } else if ("NON_TRANSACTIONAL".equals(str)) {
            i = 2;
        } else if ("OTP".equals(str)) {
            i = 3;
        } else {
            i = 0;
            if ("MARKETING_MESSAGE_SMB".equals(str)) {
                i = 4;
            }
        }
        return Integer.valueOf(i);
    }

    public final Integer A0H(AnonymousClass206 r4) {
        int i;
        C20285AEt aEt;
        C20277AEk aEk;
        if (!C18020vd.A05(C18040vf.A02, this.A07, 11576)) {
            return null;
        }
        if ((r4 instanceof C438121a) && (aEt = ((C438121a) r4).A00) != null && (aEk = aEt.A06) != null && aEk.A00()) {
            i = 2;
        } else if (C60502o8.A00(r4) != null) {
            return 1;
        } else {
            i = 3;
        }
        return Integer.valueOf(i);
    }

    public final String A0I(AnonymousClass1E7 r3) {
        AnonymousClass1BI r0 = r3.A0J;
        if (r0 != null) {
            return this.A0G.A04(r0.getRawString());
        }
        return null;
    }

    public final String A0J(AnonymousClass1BI r6) {
        AnonymousClass1E7 A0E2;
        UserJid A002;
        if (!C18020vd.A05(C18040vf.A02, this.A07, 11082) || (A0E2 = this.A0F.A0E(r6)) == null || A00(A0E2) != 2 || (A002 = C22941Dw.A00(r6)) == null) {
            return null;
        }
        A1E a1e = this.A0E;
        ConcurrentHashMap concurrentHashMap = a1e.A06;
        if (!concurrentHashMap.containsKey(A002)) {
            a1e.A01(A002);
        }
        C195609tc r0 = (C195609tc) concurrentHashMap.get(A002);
        if (r0 != null) {
            return r0.A08;
        }
        return null;
    }

    public final String A0K(AnonymousClass206 r4) {
        int i = r4.A0u;
        switch (i) {
            case 0:
                return "undefined";
            case 1:
                return "image";
            case 2:
                return "audio";
            case 3:
                return "video";
            case 4:
                return "vcard";
            case 5:
                return "location";
            case 8:
                return "call";
            case 9:
                return "document";
            case 10:
                return "missed_call";
            case 13:
                return "gif";
            case 16:
                return "livelocation";
            case 19:
                return "hsm_rejected";
            case 20:
                return "sticker";
            case 23:
                return "product";
            case 24:
                return "group_invite";
            case 25:
                return "template_image";
            case 26:
                return "template_document";
            case 27:
                return "template_hsm";
            case 28:
                return "template_video";
            case 29:
                return "template_gif";
            case 30:
                return "template_location";
            case 32:
                return "template_quick_reply";
            case 33:
                return "blank_reply";
            case 37:
                return "catalog";
            case 42:
                return "view_once_image";
            case 43:
                return "view_once_video";
            case 44:
                return "order";
            case 49:
                return "buttons_response";
            case 51:
                return "payment_invite";
            case 52:
                return "product_list";
            case 54:
                return "checkout";
            case 55:
                if (AnonymousClass25A.A0e(r4)) {
                    return "interactive_message.call_permission_request";
                }
                return "interactive_message";
            case 56:
                return "reaction";
            case 57:
                return "interactive_image_message";
            case 58:
                return "invisible_hello";
            case 59:
                return "waffle_image";
            case 60:
                return "waffle_video";
            case 61:
                return "waffle_gif";
            case 62:
                return "interactive_video_message";
            case 63:
                return "interactive_document_message";
            case 65:
                return "payment_background_image";
            case 66:
                return "poll";
            case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                return "poll_vote";
            case 72:
                return "request_phone";
            case 73:
                return "share_phone_number";
            case C166418cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                return "edited_message";
            case C166418cr.EVENT_MESSAGE_FIELD_NUMBER:
                return "peer_data_link_preview_request_response";
            case C166418cr.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER:
                return "peer_data_sticker_request_response";
            case C166418cr.COMMENT_MESSAGE_FIELD_NUMBER:
                return "ephemeral_sync_response";
            case C166418cr.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER:
                return "view_once_text";
            case 79:
                return "pin_in_chat";
            case C166418cr.PLACEHOLDER_MESSAGE_FIELD_NUMBER:
                return "scheduled_call";
            case 81:
                return "push_to_video";
            case C166418cr.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER:
                return "view_once_audio";
            case C166418cr.ALBUM_MESSAGE_FIELD_NUMBER:
                return "scheduled_call_edit_legacy";
            case 84:
                return "peer_data_placeholder_resend_response";
            case C166418cr.EVENT_COVER_IMAGE_FIELD_NUMBER:
                return "interactive_location_message";
            case C166418cr.STICKER_PACK_MESSAGE_FIELD_NUMBER:
                return "scheduled_call_edit";
            case C166418cr.STATUS_MENTION_MESSAGE_FIELD_NUMBER:
                return "request_welcome";
            case C166418cr.POLL_RESULT_SNAPSHOT_MESSAGE_FIELD_NUMBER:
                return "bot_feedback_message";
            case 90:
                return "call_log";
            case C166418cr.ASSOCIATED_CHILD_MESSAGE_FIELD_NUMBER:
                return "bcall";
            case C166418cr.GROUP_STATUS_MENTION_MESSAGE_FIELD_NUMBER:
                return "event";
            case C166418cr.POLL_CREATION_MESSAGE_V4_FIELD_NUMBER:
                return "event_response";
            case C166418cr.POLL_CREATION_MESSAGE_V5_FIELD_NUMBER:
                return "newsletter_admin_invite";
            case 95:
                return "fixed_content_placeholder";
            default:
                return AnonymousClass001.A1I("FMessageType_", AnonymousClass000.A10(), i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002a, code lost:
        if ((X.AnonymousClass11P.A01(r5.A02) - X.C17890vO.A05(X.C108955ca.A0C(r5.A01.A00, "biz_integrity_logger_settings"), "last_force_flush_time")) >= 3600000) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(boolean r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x002c
            X.0ve r2 = r5.A07
            r1 = 4832(0x12e0, float:6.771E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x004c
            X.9Ws r0 = r5.A01
            X.0vc r1 = r0.A00
            java.lang.String r0 = "biz_integrity_logger_settings"
            android.content.SharedPreferences r1 = X.C108955ca.A0C(r1, r0)
            java.lang.String r0 = "last_force_flush_time"
            long r1 = X.C17890vO.A05(r1, r0)
            X.11P r0 = r5.A02
            long r3 = X.AnonymousClass11P.A01(r0)
            long r3 = r3 - r1
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x004c
        L_0x002c:
            r4 = 1
            X.9Ws r1 = r5.A01
            X.11P r0 = r5.A02
            long r2 = X.AnonymousClass11P.A01(r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "biz_integrity_logger_settings"
            android.content.SharedPreferences r0 = X.C108955ca.A0C(r1, r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "last_force_flush_time"
            X.C17880vN.A1D(r1, r0, r2)
        L_0x0046:
            X.18K r0 = r5.A08
            r0.CHJ(r4)
            return
        L_0x004c:
            r4 = 0
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20136A8x.A0M(boolean):void");
    }

    public final boolean A0O(AnonymousClass1BI r3) {
        if (!(!this.A00.A0N()) || C42701yb.A01(r3) || C22971Dz.A0e(r3)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0P(X.AnonymousClass206 r7) {
        /*
            r6 = this;
            X.0ve r5 = r6.A07
            r4 = 7893(0x1ed5, float:1.106E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r5, r4)
            r2 = 0
            r1 = 1
            if (r0 != 0) goto L_0x0024
            boolean r0 = r7 instanceof X.C439421n
            if (r0 == 0) goto L_0x0013
            return r1
        L_0x0013:
            boolean r0 = r7 instanceof X.AnonymousClass21L
            if (r0 == 0) goto L_0x002b
            boolean r0 = X.C18020vd.A05(r3, r5, r4)
            if (r0 != 0) goto L_0x0024
            X.1pi r0 = r6.A05
            java.lang.String r0 = r0.A00(r7)
            goto L_0x0028
        L_0x0024:
            java.lang.String r0 = X.C20120A8f.A04(r7)
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            r2 = 1
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20136A8x.A0P(X.206):boolean");
    }

    public final boolean A0Q(AnonymousClass206 r4, int i) {
        C18030ve r2 = this.A07;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 7800) && i == 2) {
            return true;
        }
        if (C18020vd.A05(r1, r2, 7801) && i == 3) {
            return true;
        }
        if (r4 == null) {
            return false;
        }
        if (A0P(r4) || r4.A11(4194304)) {
            return true;
        }
        return false;
    }

    public static int A01(AnonymousClass1E7 r0, AnonymousClass00H r1) {
        r1.get();
        return A00(r0);
    }

    public static int A02(AnonymousClass1BI r1, AnonymousClass00H r2) {
        if (((C20136A8x) r2.get()).A04.A0Q(r1)) {
            return 2;
        }
        return 1;
    }

    public static long A04(AnonymousClass00H r1) {
        Object obj = r1.get();
        C18070vi.A0X(obj);
        return AnonymousClass11P.A01(((C20136A8x) obj).A02);
    }

    public static Long A05(AnonymousClass1BI r1, AnonymousClass00H r2) {
        AnonymousClass206 A0B2 = ((C20136A8x) r2.get()).A0B(r1);
        if (A0B2 != null) {
            return Long.valueOf(A0B2.A0I);
        }
        return null;
    }

    public static final String A07(int i) {
        switch (i) {
            case 0:
                return "undefined";
            case 1:
                return "image";
            case 2:
                return "audio";
            case 3:
                return "video";
            case 4:
                return "vcard";
            case 5:
                return "location";
            case 8:
                return "call";
            case 9:
                return "document";
            case 10:
                return "missed_call";
            case 13:
                return "gif";
            case 16:
                return "livelocation";
            case 19:
                return "hsm_rejected";
            case 20:
                return "sticker";
            case 23:
                return "product";
            case 24:
                return "group_invite";
            case 25:
                return "template_image";
            case 26:
                return "template_document";
            case 27:
                return "template_hsm";
            case 28:
                return "template_video";
            case 29:
                return "template_gif";
            case 30:
                return "template_location";
            case 32:
                return "template_quick_reply";
            case 33:
                return "blank_reply";
            case 37:
                return "catalog";
            case 42:
                return "view_once_image";
            case 43:
                return "view_once_video";
            case 44:
                return "order";
            case 49:
                return "buttons_response";
            case 51:
                return "payment_invite";
            case 52:
                return "product_list";
            case 54:
                return "checkout";
            case 55:
                return "interactive_message";
            case 56:
                return "reaction";
            case 57:
                return "interactive_image_message";
            case 58:
                return "invisible_hello";
            case 59:
                return "waffle_image";
            case 60:
                return "waffle_video";
            case 61:
                return "waffle_gif";
            case 62:
                return "interactive_video_message";
            case 63:
                return "interactive_document_message";
            case 65:
                return "payment_background_image";
            case 66:
                return "poll";
            case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                return "poll_vote";
            case 72:
                return "request_phone";
            case 73:
                return "share_phone_number";
            case C166418cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                return "edited_message";
            case C166418cr.EVENT_MESSAGE_FIELD_NUMBER:
                return "peer_data_link_preview_request_response";
            case C166418cr.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER:
                return "peer_data_sticker_request_response";
            case C166418cr.COMMENT_MESSAGE_FIELD_NUMBER:
                return "ephemeral_sync_response";
            case C166418cr.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER:
                return "view_once_text";
            case 79:
                return "pin_in_chat";
            case C166418cr.PLACEHOLDER_MESSAGE_FIELD_NUMBER:
                return "scheduled_call";
            case 81:
                return "push_to_video";
            case C166418cr.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER:
                return "view_once_audio";
            case C166418cr.ALBUM_MESSAGE_FIELD_NUMBER:
                return "scheduled_call_edit_legacy";
            case 84:
                return "peer_data_placeholder_resend_response";
            case C166418cr.EVENT_COVER_IMAGE_FIELD_NUMBER:
                return "interactive_location_message";
            case C166418cr.STICKER_PACK_MESSAGE_FIELD_NUMBER:
                return "scheduled_call_edit";
            case C166418cr.STATUS_MENTION_MESSAGE_FIELD_NUMBER:
                return "request_welcome";
            case C166418cr.POLL_RESULT_SNAPSHOT_MESSAGE_FIELD_NUMBER:
                return "bot_feedback_message";
            case 90:
                return "call_log";
            case C166418cr.ASSOCIATED_CHILD_MESSAGE_FIELD_NUMBER:
                return "bcall";
            case C166418cr.GROUP_STATUS_MENTION_MESSAGE_FIELD_NUMBER:
                return "event";
            case C166418cr.POLL_CREATION_MESSAGE_V4_FIELD_NUMBER:
                return "event_response";
            case C166418cr.POLL_CREATION_MESSAGE_V5_FIELD_NUMBER:
                return "newsletter_admin_invite";
            case 95:
                return "fixed_content_placeholder";
            default:
                return AnonymousClass001.A1I("FMessageType_", AnonymousClass000.A10(), i);
        }
    }

    public static void A09(AnonymousClass184 r1, AnonymousClass00H r2) {
        ((C20136A8x) r2.get()).A08.CC7(r1);
    }

    public static boolean A0A(A5M a5m, AnonymousClass1BI r4, AnonymousClass00H r5) {
        if (C18020vd.A05(C18040vf.A02, ((C20136A8x) r5.get()).A07, 7115)) {
            return a5m.A05.A2U();
        }
        return a5m.A0B.A04(r4);
    }
}
