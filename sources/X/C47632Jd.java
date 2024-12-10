package X;

import android.database.Cursor;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Jd  reason: invalid class name and case insensitive filesystem */
public class C47632Jd extends C37061ou {
    public final AnonymousClass11S A00;
    public final C32191gn A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final AnonymousClass11C A04;
    public final AnonymousClass118 A05;
    public final C18030ve A06;
    public final AnonymousClass1TM A07;
    public final C19959A0q A08;
    public final C192259o4 A09;
    public final C32091gc A0A;
    public final AnonymousClass1Nb A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass11P A0D;
    public final AnonymousClass1CJ A0E;
    public final AnonymousClass122 A0F;
    public final C18010vc A0G;
    public final AnonymousClass19T A0H;
    public final AnonymousClass1W6 A0I;

    private void A02(AnonymousClass206 r6, JSONObject jSONObject) {
        AnonymousClass21V r3;
        AnonymousClass206 r32 = r6;
        String str = null;
        if (r6 instanceof AnonymousClass21K) {
            C20083A6j A012 = ((C42341y1) this.A0C.get()).A01((AnonymousClass21K) r32);
            if (A012 != null) {
                str = A012.A0G(this.A05.A00);
            }
        } else if (r6 instanceof AnonymousClass22Q) {
            AnonymousClass22Q r33 = (AnonymousClass22Q) r32;
            str = r33.A0A;
            String str2 = r33.A02;
            if (!TextUtils.isEmpty(str2)) {
                str = C17900vP.A0H(str, " ", str2).toString();
            }
            String str3 = r33.A05;
            if (!TextUtils.isEmpty(str3)) {
                str = C17900vP.A0H(str, " ", str3).toString();
            }
        } else {
            if (r6 instanceof C438421d) {
                AnonymousClass21V r1 = (AnonymousClass21V) r32;
                r3 = r32;
                if (!C20097A7a.A05(r6)) {
                    str = r1.A18();
                }
            } else if (r6 instanceof C440021t) {
                str = ((AnonymousClass21V) r32).A18();
            } else if (r6 instanceof AnonymousClass21Y) {
                AnonymousClass21V r34 = (AnonymousClass21V) r32;
                boolean A052 = C20097A7a.A05(r34);
                r3 = r34;
                if (!A052) {
                    str = r34.A18();
                }
            } else {
                r3 = r32;
                if (!(r6 instanceof AnonymousClass21B)) {
                    if (r6 instanceof AnonymousClass219) {
                        str = ((AnonymousClass219) r32).A03;
                    }
                }
            }
            str = C20097A7a.A01(r3);
        }
        jSONObject.put("text", A01(str, r6.A0h));
    }

    private void A03(AnonymousClass206 r5, JSONObject jSONObject) {
        jSONObject.put("user_mentioned", false);
        List<C70503Bi> list = r5.A0h;
        if (list != null) {
            for (C70503Bi r0 : list) {
                if (this.A00.A0O(r0.A00)) {
                    jSONObject.put("user_mentioned", true);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x0178 A[Catch:{ JSONException -> 0x0275 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject A08(X.AnonymousClass206 r11, X.C60012nF r12, boolean r13) {
        /*
            r10 = this;
            r9 = 0
            X.205 r6 = r11.A0v     // Catch:{ JSONException -> 0x0275 }
            X.1BI r7 = r6.A00     // Catch:{ JSONException -> 0x0275 }
            boolean r0 = X.C22971Dz.A0a(r7)     // Catch:{ JSONException -> 0x0275 }
            if (r0 != 0) goto L_0x0274
            boolean r3 = r11 instanceof X.AnonymousClass215     // Catch:{ JSONException -> 0x0275 }
            if (r3 == 0) goto L_0x0038
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0275 }
            boolean r0 = r11 instanceof X.AnonymousClass22W     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = "image"
        L_0x0019:
            java.lang.String r0 = "type"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0275 }
            goto L_0x0176
        L_0x0021:
            boolean r0 = r11 instanceof X.AnonymousClass216     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x0029
            java.lang.String r1 = "text"
            goto L_0x0019
        L_0x0029:
            boolean r0 = r11 instanceof X.C444523m     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = "audio"
            goto L_0x0019
        L_0x0030:
            boolean r0 = r11 instanceof X.C441122e     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x0175
            java.lang.String r1 = "video"
            goto L_0x0019
        L_0x0038:
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0275 }
            boolean r0 = r11 instanceof X.AnonymousClass210     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x006f
            int r0 = r11.A0u     // Catch:{ JSONException -> 0x0275 }
            if (r0 != 0) goto L_0x006f
            X.AW0 r4 = X.AnonymousClass25B.A00(r11)     // Catch:{ JSONException -> 0x0275 }
            if (r4 == 0) goto L_0x005b
            int r1 = r4.A03     // Catch:{ JSONException -> 0x0275 }
            r0 = 5
            if (r1 == r0) goto L_0x0175
            X.11S r1 = r10.A00     // Catch:{ JSONException -> 0x0275 }
            com.whatsapp.jid.UserJid r0 = r4.A0D     // Catch:{ JSONException -> 0x0275 }
            boolean r0 = r1.A0O(r0)     // Catch:{ JSONException -> 0x0275 }
            if (r0 != 0) goto L_0x0179
            goto L_0x0173
        L_0x005b:
            r0 = r11
            X.210 r0 = (X.AnonymousClass210) r0     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = r0.A06     // Catch:{ JSONException -> 0x0275 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0275 }
            if (r0 != 0) goto L_0x006a
            java.lang.String r4 = "link"
            goto L_0x017b
        L_0x006a:
            java.lang.String r4 = "text"
            goto L_0x017b
        L_0x006f:
            boolean r0 = r11 instanceof X.AnonymousClass22Q     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r4 = "image"
            if (r0 == 0) goto L_0x0090
            java.lang.String r1 = r11.A0P()     // Catch:{ JSONException -> 0x0275 }
            java.util.List r0 = r11.A0h     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r1 = r10.A01(r1, r0)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = "text"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0275 }
            r10.A02(r11, r2)     // Catch:{ JSONException -> 0x0275 }
        L_0x0088:
            java.lang.String r0 = "type"
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x0275 }
            goto L_0x0176
        L_0x0090:
            boolean r0 = r11 instanceof X.AnonymousClass22S     // Catch:{ JSONException -> 0x0275 }
            if (r0 != 0) goto L_0x0175
            boolean r0 = r11 instanceof X.C439421n     // Catch:{ JSONException -> 0x0275 }
            if (r0 != 0) goto L_0x0175
            boolean r0 = r11 instanceof X.C438421d     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x00b8
            r8 = r11
            X.21V r8 = (X.AnonymousClass21V) r8     // Catch:{ JSONException -> 0x0275 }
            r10.A02(r8, r2)     // Catch:{ JSONException -> 0x0275 }
            r10.A03(r11, r2)     // Catch:{ JSONException -> 0x0275 }
            X.0ve r5 = r10.A06     // Catch:{ JSONException -> 0x0275 }
            r1 = 6160(0x1810, float:8.632E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ JSONException -> 0x0275 }
            boolean r0 = X.C18020vd.A05(r0, r5, r1)     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x0088
            A04(r11, r2)     // Catch:{ JSONException -> 0x0275 }
            A05(r8, r2)     // Catch:{ JSONException -> 0x0275 }
            goto L_0x0088
        L_0x00b8:
            boolean r0 = r11 instanceof X.C441822l     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r1 = "audio"
            java.lang.String r0 = "type"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0275 }
            X.1TM r0 = r10.A07     // Catch:{ JSONException -> 0x0275 }
            X.0ve r4 = r0.A01     // Catch:{ JSONException -> 0x0275 }
            r1 = 5650(0x1612, float:7.917E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ JSONException -> 0x0275 }
            boolean r0 = X.C18020vd.A05(r0, r4, r1)     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x0176
            r4 = r11
            X.21V r4 = (X.AnonymousClass21V) r4     // Catch:{ JSONException -> 0x0275 }
            int r0 = r4.A0D     // Catch:{ JSONException -> 0x0275 }
            int r0 = r0 + -1
            int r1 = r0 / 10
            r0 = 0
            int r0 = java.lang.Math.max(r0, r1)     // Catch:{ JSONException -> 0x0275 }
            int r0 = r0 + 1
            int r1 = r0 * 10
            r0 = 500(0x1f4, float:7.0E-43)
            int r1 = java.lang.Math.min(r0, r1)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = "media_duration"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0275 }
            A05(r4, r2)     // Catch:{ JSONException -> 0x0275 }
            goto L_0x0176
        L_0x00f4:
            boolean r0 = r11 instanceof X.AnonymousClass21Y     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r1 = "video"
            if (r0 == 0) goto L_0x0117
            r10.A02(r11, r2)     // Catch:{ JSONException -> 0x0275 }
            r10.A03(r11, r2)     // Catch:{ JSONException -> 0x0275 }
            X.0ve r5 = r10.A06     // Catch:{ JSONException -> 0x0275 }
            r4 = 6160(0x1810, float:8.632E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ JSONException -> 0x0275 }
            boolean r0 = X.C18020vd.A05(r0, r5, r4)     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x0110
            A04(r11, r2)     // Catch:{ JSONException -> 0x0275 }
        L_0x0110:
            java.lang.String r0 = "type"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0275 }
            goto L_0x0176
        L_0x0117:
            boolean r0 = r11 instanceof X.C441322g     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x0120
            java.lang.String r4 = "sticker"
            goto L_0x0088
        L_0x0120:
            boolean r0 = r11 instanceof X.C440021t     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x0142
            r10.A02(r11, r2)     // Catch:{ JSONException -> 0x0275 }
            r10.A03(r11, r2)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r1 = "gif"
            java.lang.String r0 = "type"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0275 }
            X.0ve r4 = r10.A06     // Catch:{ JSONException -> 0x0275 }
            r1 = 6160(0x1810, float:8.632E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ JSONException -> 0x0275 }
            boolean r0 = X.C18020vd.A05(r0, r4, r1)     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x0176
            A04(r11, r2)     // Catch:{ JSONException -> 0x0275 }
            goto L_0x0176
        L_0x0142:
            boolean r0 = r11 instanceof X.AnonymousClass218     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x014d
            r10.A02(r11, r2)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r4 = "location"
            goto L_0x0088
        L_0x014d:
            boolean r0 = r11 instanceof X.C442222p     // Catch:{ JSONException -> 0x0275 }
            if (r0 != 0) goto L_0x016f
            boolean r0 = r11 instanceof X.C442022n     // Catch:{ JSONException -> 0x0275 }
            if (r0 != 0) goto L_0x016f
            boolean r0 = r11 instanceof X.C438921i     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x015d
            java.lang.String r4 = "document"
            goto L_0x0088
        L_0x015d:
            boolean r0 = r11 instanceof X.AnonymousClass22W     // Catch:{ JSONException -> 0x0275 }
            if (r0 != 0) goto L_0x0088
            boolean r0 = r11 instanceof X.C441122e     // Catch:{ JSONException -> 0x0275 }
            if (r0 != 0) goto L_0x0110
            boolean r0 = r11 instanceof X.AnonymousClass23N     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x0175
            if (r13 == 0) goto L_0x0175
            java.lang.String r4 = "revoked"
            goto L_0x0088
        L_0x016f:
            java.lang.String r4 = "contact"
            goto L_0x0088
        L_0x0173:
            if (r13 != 0) goto L_0x0179
        L_0x0175:
            r2 = r9
        L_0x0176:
            if (r2 == 0) goto L_0x0274
            goto L_0x0190
        L_0x0179:
            java.lang.String r4 = "payment"
        L_0x017b:
            java.lang.String r1 = r11.A0P()     // Catch:{ JSONException -> 0x0275 }
            java.util.List r0 = r11.A0h     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r1 = r10.A01(r1, r0)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = "text"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0275 }
            r10.A03(r11, r2)     // Catch:{ JSONException -> 0x0275 }
            goto L_0x0088
        L_0x0190:
            X.1E7 r5 = A00(r10, r11)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r4 = "group_name"
            boolean r0 = X.C22971Dz.A0e(r7)     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x01e5
            X.1M9 r0 = r10.A02     // Catch:{ JSONException -> 0x0275 }
            X.C17960vV.A07(r7)     // Catch:{ JSONException -> 0x0275 }
            X.1E7 r1 = r0.A0H(r7)     // Catch:{ JSONException -> 0x0275 }
            X.1Me r0 = r10.A03     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = r0.A0I(r1)     // Catch:{ JSONException -> 0x0275 }
        L_0x01ab:
            r2.putOpt(r4, r0)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r4 = "author_name"
            X.1Me r1 = r10.A03     // Catch:{ JSONException -> 0x0275 }
            r0 = 0
            X.1yg r0 = r1.A0H(r5, r0)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = r0.A01     // Catch:{ JSONException -> 0x0275 }
            r2.put(r4, r0)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r1 = "author_id"
            X.A0q r4 = r10.A08     // Catch:{ JSONException -> 0x0275 }
            X.1BI r0 = r5.A0J     // Catch:{ JSONException -> 0x0275 }
            X.C17960vV.A07(r0)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = r4.A02(r0, r12)     // Catch:{ JSONException -> 0x0275 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r1 = "chat_id"
            X.C17960vV.A07(r7)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = r4.A02(r7, r12)     // Catch:{ JSONException -> 0x0275 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0275 }
            X.1TM r0 = r10.A07     // Catch:{ JSONException -> 0x0275 }
            X.0ve r5 = r0.A01     // Catch:{ JSONException -> 0x0275 }
            r1 = 9695(0x25df, float:1.3586E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ JSONException -> 0x0275 }
            boolean r0 = X.C18020vd.A05(r0, r5, r1)     // Catch:{ JSONException -> 0x0275 }
            goto L_0x01e7
        L_0x01e5:
            r0 = 0
            goto L_0x01ab
        L_0x01e7:
            if (r0 == 0) goto L_0x01fb
            java.lang.String r5 = "chat_seci"
            X.C17960vV.A07(r7)     // Catch:{ JSONException -> 0x0275 }
            X.1TN r1 = r4.A01     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = r1.A00(r12, r0)     // Catch:{ JSONException -> 0x0275 }
            r2.put(r5, r0)     // Catch:{ JSONException -> 0x0275 }
        L_0x01fb:
            java.lang.String r1 = "message_id"
            X.9o4 r0 = r10.A09     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = r0.A01(r6, r12)     // Catch:{ JSONException -> 0x0275 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r1 = "viewer_id"
            X.11S r0 = r10.A00     // Catch:{ JSONException -> 0x0275 }
            r0.A0I()     // Catch:{ JSONException -> 0x0275 }
            X.1E8 r0 = r0.A0D     // Catch:{ JSONException -> 0x0275 }
            X.C17960vV.A07(r0)     // Catch:{ JSONException -> 0x0275 }
            X.1BI r0 = r0.A0J     // Catch:{ JSONException -> 0x0275 }
            X.C17960vV.A07(r0)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = r4.A02(r0, r12)     // Catch:{ JSONException -> 0x0275 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r1 = "message_delivery"
            int r4 = r11.A0C     // Catch:{ JSONException -> 0x0275 }
            r0 = 7
            if (r4 == r0) goto L_0x0241
            r0 = 20
            if (r4 == r0) goto L_0x0241
            r0 = 21
            if (r4 == r0) goto L_0x0241
            r0 = -1
            if (r4 == r0) goto L_0x0241
            r0 = 8
            if (r4 == r0) goto L_0x023e
            r0 = 9
            if (r4 == r0) goto L_0x023e
            r0 = 10
            if (r4 == r0) goto L_0x023e
            goto L_0x0244
        L_0x023e:
            java.lang.String r0 = "played"
            goto L_0x024e
        L_0x0241:
            java.lang.String r0 = "failed"
            goto L_0x024e
        L_0x0244:
            r0 = 13
            boolean r0 = X.C446824j.A02(r4, r0)     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x025e
            java.lang.String r0 = "read"
        L_0x024e:
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r1 = "ephemeral_expiry_timestamp"
            java.lang.Long r0 = r11.A0U     // Catch:{ JSONException -> 0x0275 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r0 = "is_view_once"
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0275 }
            goto L_0x0273
        L_0x025e:
            r0 = 5
            boolean r0 = X.C446824j.A02(r4, r0)     // Catch:{ JSONException -> 0x0275 }
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = "delivered"
            goto L_0x024e
        L_0x0268:
            r0 = 4
            if (r4 != r0) goto L_0x026f
            java.lang.String r0 = "sent"
            goto L_0x024e
        L_0x026f:
            java.lang.String r0 = "unsent"
            goto L_0x024e
        L_0x0273:
            return r2
        L_0x0274:
            return r9
        L_0x0275:
            r1 = move-exception
            java.lang.String r0 = "IncomingMessageEventFactory/createUserMsgJson caught JSONException"
            com.whatsapp.util.Log.e(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47632Jd.A08(X.206, X.2nF, boolean):org.json.JSONObject");
    }

    public static AnonymousClass1E7 A00(C47632Jd r3, AnonymousClass206 r4) {
        AnonymousClass205 r1 = r4.A0v;
        if (r1.A02) {
            AnonymousClass11S r0 = r3.A00;
            r0.A0I();
            return r0.A0D;
        }
        AnonymousClass1BI A0H2 = r4.A0H();
        AnonymousClass1BI r12 = r1.A00;
        if (C22971Dz.A0e(r12) && A0H2 != null) {
            return r3.A02.A0H(A0H2);
        }
        AnonymousClass1M9 r02 = r3.A02;
        C17960vV.A07(r12);
        return r02.A0H(r12);
    }

    public static void A05(AnonymousClass21V r3, JSONObject jSONObject) {
        byte[] bArr;
        C62572rc r0 = r3.A02;
        if (r0 != null && (bArr = r0.A0a) != null) {
            String encodeToString = Base64.encodeToString(bArr, 3);
            jSONObject.put("media_url", r3.A07);
            jSONObject.put("media_key", encodeToString);
            jSONObject.put("media_enc_hash", r3.A08);
            jSONObject.put("media_dec_hash", r3.A05);
        }
    }

    public C127316e9 A07(AnonymousClass206 r20, C60012nF r21, int i) {
        JSONObject jSONObject;
        AnonymousClass1BI r12;
        AnonymousClass1W6 r10;
        AnonymousClass206 A022;
        AnonymousClass206 r7 = r20;
        C60012nF r8 = r21;
        C127316e9 A062 = A06(r7, r8, i);
        if (!(!C18020vd.A05(C18040vf.A02, this.A07.A01, 8366) || A062 == null || (jSONObject = A062.A01) == null || (r12 = r7.A0v.A00) == null)) {
            Cursor cursor = AnonymousClass122.A00(this.A0F, r12, 5, 1, AnonymousClass11P.A01(this.A0D), true).A00;
            if (cursor == null) {
                Log.w("IncomingMessageEventFactory/createEventWithPmidDbQuery fail to get cursor");
            } else if (!cursor.moveToFirst()) {
                return A062;
            } else {
                do {
                    r10 = this.A0I;
                    A022 = r10.A02(cursor, r12);
                    if (!cursor.moveToNext() || A022 == null || A022.A0x == r7.A0x) {
                    }
                    r10 = this.A0I;
                    A022 = r10.A02(cursor, r12);
                    break;
                } while (A022.A0x == r7.A0x);
                if (!cursor.isAfterLast()) {
                    AnonymousClass206 A023 = r10.A02(cursor, r12);
                    if (A023 != null) {
                        try {
                            jSONObject.put("prev_mid", this.A09.A01(A023.A0v, r8));
                        } catch (JSONException e) {
                            Log.w("IncomingMessageEventFactory/createUserMsgNotificationJson failed to put PREV_MESSAGE_ID", e);
                        }
                    } else {
                        Log.w("IncomingMessageEventFactory/createEventWithPmidDbQuery fail to get prev message");
                    }
                    return new C127316e9("incoming_message", jSONObject);
                }
            }
        }
        return A062;
    }

    public C47632Jd(AnonymousClass11S r2, C32191gn r3, AnonymousClass1M9 r4, C24921Me r5, AnonymousClass11C r6, AnonymousClass11P r7, AnonymousClass118 r8, AnonymousClass1CJ r9, AnonymousClass122 r10, C18030ve r11, AnonymousClass1TM r12, C19959A0q a0q, C192259o4 r14, C32091gc r15, C18010vc r16, AnonymousClass19T r17, AnonymousClass1Nb r18, AnonymousClass1W6 r19, AnonymousClass00H r20) {
        this.A0D = r7;
        this.A06 = r11;
        this.A05 = r8;
        this.A0A = r15;
        this.A00 = r2;
        this.A0E = r9;
        this.A0H = r17;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A0I = r19;
        this.A0F = r10;
        this.A0B = r18;
        this.A07 = r12;
        this.A0G = r16;
        this.A01 = r3;
        this.A08 = a0q;
        this.A09 = r14;
        this.A0C = r20;
    }

    private String A01(String str, List list) {
        CharSequence A0C2 = C26302CxJ.A0C(this.A04, this.A0G, C63462t7.A02(str));
        SpannableStringBuilder spannableStringBuilder = A0C2;
        if (list != null) {
            spannableStringBuilder = A0C2;
            if (!list.isEmpty()) {
                boolean isEmpty = TextUtils.isEmpty(A0C2);
                spannableStringBuilder = A0C2;
                if (!isEmpty) {
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(A0C2);
                    ArrayList A13 = AnonymousClass000.A13();
                    C32091gc r4 = this.A0A;
                    if (!list.isEmpty() && !TextUtils.isEmpty(valueOf)) {
                        HashMap A11 = C17880vN.A11();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C70503Bi r2 = (C70503Bi) it.next();
                            if (r2 != null) {
                                A11.put(AnonymousClass4aJ.A00(r2), new C19760yx(r2, (Object) null));
                            }
                        }
                        Matcher matcher = C32091gc.A0D.matcher(valueOf);
                        int i = 0;
                        while (matcher.find()) {
                            String group = matcher.group();
                            C19760yx A002 = C32091gc.A00(r4, group, A11);
                            if (A002 != null) {
                                if (A002.A00 == null) {
                                    C17960vV.A0F(false, "Mentions/null mention after map population");
                                } else {
                                    int start = matcher.start() + i;
                                    String A0F2 = AnonymousClass1EG.A0F((String) A002.A01, r4.A01.A04(AnonymousClass18O.A1O));
                                    int length = group.length();
                                    valueOf.replace(start, length + start, A0F2);
                                    i += A0F2.length() - length;
                                    if (valueOf.charAt(start) == '@') {
                                        C17890vO.A1D(A13, start);
                                    }
                                }
                            }
                        }
                    }
                    Collections.sort(A13, Collections.reverseOrder());
                    Iterator it2 = A13.iterator();
                    while (it2.hasNext()) {
                        int A0M = AnonymousClass000.A0M(it2.next());
                        valueOf.delete(A0M, A0M + 1);
                    }
                    spannableStringBuilder = valueOf;
                }
            }
        }
        CharSequence A022 = AnonymousClass1EG.A02(spannableStringBuilder);
        if (A022 == null) {
            return null;
        }
        return A022.toString();
    }

    public static void A04(AnonymousClass206 r2, JSONObject jSONObject) {
        if (r2.A16()) {
            C693336u A0O = r2.A0O();
            if (A0O == null || !C18070vi.A09(r2, C693336u.class).A03) {
                Log.w("IncomingMessageEventFactory/addThumbnail/thumbnail_not_loaded");
                return;
            }
            byte[] A012 = A0O.A01();
            if (A012 != null) {
                jSONObject.put("thumbnail", Base64.encodeToString(A012, 1));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r0.isBlocked() != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C127316e9 A06(X.AnonymousClass206 r7, X.C60012nF r8, int r9) {
        /*
            r6 = this;
            X.1BI r5 = X.AnonymousClass205.A00(r7)
            boolean r0 = r7.A0w()
            r3 = 0
            if (r0 != 0) goto L_0x0051
            X.1Nb r2 = r6.A0B
            X.1yM r0 = r2.A0a(r5)
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0051
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0052
            X.1yM r0 = r2.A0a(r5)
            X.1zz r0 = (X.C43551zz) r0
            java.lang.String r1 = r0.A0E()
            X.11C r0 = r6.A04
            android.app.NotificationManager r4 = r0.A07()
            if (r4 == 0) goto L_0x0052
            android.app.NotificationChannel r2 = r4.getNotificationChannel(r1)
            if (r2 == 0) goto L_0x0052
            int r0 = r2.getImportance()
            if (r0 == 0) goto L_0x0051
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0052
            java.lang.String r0 = r2.getGroup()
            android.app.NotificationChannelGroup r0 = r4.getNotificationChannelGroup(r0)
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.isBlocked()
            if (r0 == 0) goto L_0x0052
        L_0x0051:
            return r3
        L_0x0052:
            X.1CJ r0 = r6.A0E
            boolean r0 = r0.A0Q(r5)
            if (r0 != 0) goto L_0x0051
            if (r9 < 0) goto L_0x0066
            X.19T r2 = r6.A0H
            r1 = 494345647(0x1d771daf, float:3.2705524E-21)
            java.lang.String r0 = "db_query_end"
            r2.markerPoint((int) r1, (int) r9, (java.lang.String) r0)
        L_0x0066:
            r0 = 0
            org.json.JSONObject r1 = r6.A08(r7, r8, r0)
            if (r1 == 0) goto L_0x0051
            java.lang.String r0 = "incoming_message"
            X.6e9 r3 = new X.6e9
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47632Jd.A06(X.206, X.2nF, int):X.6e9");
    }
}
