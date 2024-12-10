package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Qg  reason: invalid class name and case insensitive filesystem */
public class C25951Qg {
    public final C24681Lg A00;
    public final AnonymousClass1Cd A01;
    public final C18030ve A02;
    public final C25931Qe A03;
    public final AnonymousClass00H A04 = C221618v.A00(AnonymousClass166.class);
    public final AnonymousClass118 A05;
    public final C25941Qf A06;
    public final AnonymousClass1LW A07;
    public final AnonymousClass1KI A08;

    public static final AEE A02(JSONObject jSONObject) {
        byte[] bArr;
        C20275AEi aEi;
        byte[] bArr2;
        String str = null;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("title");
        if (!(optString == null || optString.length() == 0)) {
            str = optString;
        }
        String str2 = null;
        String optString2 = jSONObject2.optString("sub_title");
        if (!(optString2 == null || optString2.length() == 0)) {
            str2 = optString2;
        }
        String str3 = null;
        String optString3 = jSONObject2.optString("header_thumbnail");
        if (!(optString3 == null || optString3.length() == 0)) {
            str3 = optString3;
        }
        boolean z = false;
        if (str3 == null || str3.length() == 0) {
            bArr = null;
        } else {
            bArr = Base64.decode(str3, 0);
        }
        JSONObject optJSONObject = jSONObject2.optJSONObject("document_metadata");
        if (optJSONObject != null) {
            String optString4 = optJSONObject.optString("url");
            String optString5 = optJSONObject.optString("direct_path");
            String optString6 = optJSONObject.optString("media_hash");
            String optString7 = optJSONObject.optString("media_enc_hash");
            String optString8 = optJSONObject.optString("media_key");
            if (optString8 != null) {
                bArr2 = Base64.decode(optString8, 0);
            } else {
                bArr2 = null;
            }
            long optLong = optJSONObject.optLong("media_key_ts");
            long optLong2 = optJSONObject.optLong("file_length");
            aEi = new C20275AEi(Long.valueOf(optLong), Long.valueOf(optLong2), optString4, optString5, optString6, optString7, optJSONObject.optString("mime_type"), optJSONObject.optString("file_name"), optJSONObject.optString("file_path"), bArr2);
            if (aEi.A00()) {
                z = true;
            }
        } else {
            aEi = null;
        }
        if ((str == null || str.length() == 0) && ((str2 == null || str2.length() == 0) && bArr == null && !z)) {
            return null;
        }
        return new AEE(aEi, str, str2, bArr);
    }

    public static int A00(C438721g r2) {
        C20268AEb aEb = r2.A00;
        if (aEb != null) {
            int i = aEb.A03;
            if (i == 1) {
                return 1;
            }
            if (i != 2) {
                return 0;
            }
            return 8;
        }
        return 0;
    }

    public static void A04(ContentValues contentValues, C25951Qg r8, String str, String str2, int i, long j) {
        C28791au A052 = r8.A01.A05();
        try {
            C23141Ev r3 = ((C28801av) A052).A02;
            ContentValues contentValues2 = contentValues;
            if (r3.A02(contentValues2, str, "element_type = ? AND message_row_id = ?", str2, new String[]{String.valueOf(i), String.valueOf(j)}) == 0) {
                r3.A05(str, str2, contentValues2);
            }
            A052.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static void A05(C25951Qg r17, AnonymousClass206 r18, String str, long j) {
        C20271AEe aEe;
        String str2;
        C28781at A042 = r17.A01.get();
        try {
            Cursor A0A = ((C28801av) A042).A02.A0A(str, "GET_MESSAGE_UI_ELEMENTS_BY_MESSAGE_ROW_ID_SQL", new String[]{String.valueOf(j)});
            try {
                if (A0A.moveToFirst()) {
                    int i = A0A.getInt(A0A.getColumnIndexOrThrow("element_type"));
                    String string = A0A.getString(A0A.getColumnIndexOrThrow("element_content"));
                    if (i == 2 && !TextUtils.isEmpty(string)) {
                        C17960vV.A07(string);
                        JSONObject jSONObject = new JSONObject(string);
                        ArrayList arrayList = new ArrayList();
                        JSONArray optJSONArray = jSONObject.optJSONArray("buttons");
                        if (optJSONArray != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                JSONObject optJSONObject = jSONObject2.optJSONObject("native_flow_info");
                                if (optJSONObject != null) {
                                    String string2 = optJSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                                    if (optJSONObject2 == null) {
                                        str2 = null;
                                    } else {
                                        str2 = optJSONObject2.toString();
                                    }
                                    aEe = new C20271AEe(string2, str2);
                                } else {
                                    aEe = null;
                                }
                                arrayList.add(new C195309t8(aEe, jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), jSONObject2.optString("displayText"), jSONObject2.optInt("button_type", 0), jSONObject2.optBoolean("selected")));
                            }
                        }
                        r18.A0g(new C194599rz(jSONObject.optString("content"), jSONObject.optString("footer"), arrayList));
                    }
                }
            } catch (JSONException e) {
                Log.w("ButtonsConverter/parseJSON/deserialization error", e);
            } catch (Throwable th) {
                if (A0A != null) {
                    A0A.close();
                }
                throw th;
            }
            A0A.close();
            A042.close();
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public static void A06(C25951Qg r15, C194599rz r16, String str, long j) {
        String str2;
        C194599rz r2 = r16;
        if (r16 != null) {
            ContentValues contentValues = new ContentValues();
            long j2 = j;
            contentValues.put("message_row_id", Long.valueOf(j2));
            contentValues.put("element_type", 2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("content", r2.A00);
                jSONObject.put("footer", r2.A01);
                JSONArray jSONArray = new JSONArray();
                for (C195309t8 r22 : r2.A02) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r22.A04);
                    String str3 = r22.A03;
                    if (str3 != null) {
                        jSONObject2.put("displayText", str3);
                    }
                    jSONObject2.put("selected", r22.A00);
                    jSONObject2.put("button_type", r22.A01);
                    C20271AEe aEe = r22.A02;
                    if (aEe != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, aEe.A02);
                        String str4 = aEe.A00;
                        if (str4 != null && str4.length() > 0) {
                            jSONObject3.put("params", new JSONObject(str4));
                        }
                        jSONObject2.put("native_flow_info", jSONObject3);
                    }
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("buttons", jSONArray);
                str2 = jSONObject.toString();
            } catch (JSONException e) {
                Log.w("ButtonsConverter/toJSONObject/serialization error", e);
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                contentValues.put("element_content", str2);
            }
            A04(contentValues, r15, str, "MessageUIElementsStore/insertOrUpdateQuotedButtonMessageElement", 2, j2);
        }
    }

    public static void A07(C25951Qg r7, AnonymousClass21T r8, String str, String str2) {
        Cursor A0A;
        boolean z = false;
        if (r8.A0x > 0) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MessageUIElementsStore/fillReplyDataIfAvailable/message must have row_id set; key=");
        sb.append(r8.A0v);
        C17960vV.A0G(z, sb.toString());
        String[] strArr = {String.valueOf(r8.A0x)};
        C28781at A042 = r7.A01.get();
        try {
            A0A = ((C28801av) A042).A02.A0A(str, str2, strArr);
            if (A0A.moveToLast()) {
                String string = A0A.getString(A0A.getColumnIndexOrThrow("reply_values"));
                String string2 = A0A.getString(A0A.getColumnIndexOrThrow("reply_description"));
                r8.A0i(string);
                r8.A00 = string2;
            }
            A0A.close();
            A042.close();
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        if (r2 == null) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(X.C25951Qg r12, X.C438721g r13, java.lang.String r14, java.lang.String r15) {
        /*
            long r0 = r13.A0x
            r6 = 0
            r3 = 1
            r5 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r2 = 0
            if (r4 <= 0) goto L_0x000c
            r2 = 1
        L_0x000c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageUIElementsStore/fillReplyDataIfAvailable/message must have row_id set; key="
            r1.append(r0)
            X.205 r0 = r13.A0v
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A0G(r2, r0)
            java.lang.String[] r2 = new java.lang.String[r3]
            long r0 = r13.A0x
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r5] = r0
            X.1Cd r0 = r12.A01
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a2 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x00a2 }
            android.database.Cursor r2 = r0.A0A(r14, r15, r2)     // Catch:{ all -> 0x00a2 }
            boolean r0 = r2.moveToLast()     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = "element_type"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            int r1 = r2.getInt(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            if (r1 != r3) goto L_0x004f
            r11 = 1
            goto L_0x0055
        L_0x004f:
            r0 = 8
            r11 = 0
            if (r1 != r0) goto L_0x0055
            r11 = 2
        L_0x0055:
            java.lang.String r0 = "reply_description"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            java.lang.String r9 = r2.getString(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            if (r3 == r11) goto L_0x0072
            if (r11 == 0) goto L_0x0072
            X.00H r0 = r12.A04     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            java.lang.Object r0 = r0.get()     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            X.166 r0 = (X.AnonymousClass166) r0     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            X.AEb r5 = r0.A00(r9)     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            if (r5 == 0) goto L_0x008f
            goto L_0x0084
        L_0x0072:
            java.lang.String r0 = "reply_values"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            java.lang.String r8 = r2.getString(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            r6 = 0
            X.AEb r5 = new X.AEb     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            r10 = r6
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
        L_0x0084:
            r13.A00 = r5     // Catch:{ SQLiteBlobTooBigException -> 0x0087 }
            goto L_0x008f
        L_0x0087:
            r1 = move-exception
            java.lang.String r0 = "MessageUIElementsStore/fillReplyDataIfAvailable/failed to load message"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x0092
        L_0x008f:
            r2.close()     // Catch:{ all -> 0x00a2 }
        L_0x0092:
            r4.close()
            return
        L_0x0096:
            r1 = move-exception
            if (r2 == 0) goto L_0x00a1
            r2.close()     // Catch:{ all -> 0x009d }
            goto L_0x00a1
        L_0x009d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00a2 }
        L_0x00a1:
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00a7 }
            throw r1
        L_0x00a7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25951Qg.A08(X.1Qg, X.21g, java.lang.String, java.lang.String):void");
    }

    public static void A09(C25951Qg r8, AnonymousClass21K r9, String str, long j) {
        C28781at A042 = r8.A01.get();
        try {
            Cursor A0A = ((C28801av) A042).A02.A0A(str, "GET_MESSAGE_UI_ELEMENTS_BY_MESSAGE_ROW_ID_SQL", new String[]{String.valueOf(j)});
            try {
                if (A0A.moveToFirst()) {
                    int i = A0A.getInt(A0A.getColumnIndexOrThrow("element_type"));
                    String string = A0A.getString(A0A.getColumnIndexOrThrow("element_content"));
                    if (i == 1 || i == 3 || i == 4 || i == 10 || i == 7 || i == 5 || i == 6 || i == 9) {
                        AnonymousClass1KI r1 = r8.A08;
                        C18070vi.A0d(r1, 1);
                        if (!(string == null || string.length() == 0)) {
                            C20285AEt A012 = A01(r1, new JSONObject(string));
                            if (A012 != null) {
                                r9.CIS(A012);
                            }
                        }
                        if (i == 9) {
                            AnonymousClass206 r92 = (AnonymousClass206) r9;
                            if (r92 instanceof AnonymousClass21L) {
                                AnonymousClass25F r5 = ((AnonymousClass21L) r92).A02;
                                if (!r5.A03) {
                                    if (C22781De.A03()) {
                                        r8.A03.A09(new AnonymousClass3Bx(r8, r92, 33), new AnonymousClass25F[]{r5});
                                    } else {
                                        r8.A03.A0A(r5);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                Log.w("InteractiveMessageConverter/parseJSON/deserialization error", e);
            } catch (Throwable th) {
                if (A0A != null) {
                    A0A.close();
                }
                throw th;
            }
            A0A.close();
            A042.close();
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public int A0B(C20285AEt aEt) {
        List list;
        if (aEt == null) {
            return 0;
        }
        int i = aEt.A00;
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 6) {
            return 3;
        }
        if (i == 10) {
            return 10;
        }
        if (i == 3) {
            C20279AEn aEn = aEt.A02;
            if (aEn == null || (list = aEn.A0D.A09) == null || list.isEmpty()) {
                return 7;
            }
            return 4;
        } else if (i == 4) {
            return 5;
        } else {
            if (i == 5) {
                return 6;
            }
            if (i == 7) {
                return 9;
            }
            if (i == 9) {
                return 6;
            }
            return 0;
        }
    }

    public void A0C(AnonymousClass21T r10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("element_type", 2);
        contentValues.put("reply_values", r10.A0P());
        contentValues.put("reply_description", r10.A00);
        contentValues.put("message_row_id", Long.valueOf(r10.A0x));
        A04(contentValues, this, "message_ui_elements_reply", "MessageUIElementsStore/insertOrUpdateButtonsResponseMessage", 2, r10.A0x);
    }

    public void A0D(C438721g r12) {
        String str;
        ContentValues contentValues = new ContentValues();
        C20268AEb aEb = r12.A00;
        if (aEb != null) {
            int A002 = A00(r12);
            contentValues.put("element_type", Integer.valueOf(A002));
            contentValues.put("reply_values", aEb.A05);
            if (A002 == 8) {
                str = ((AnonymousClass166) this.A04.get()).A01(aEb);
            } else {
                str = aEb.A04;
            }
            contentValues.put("reply_description", str);
            if (aEb.A01(this.A02, r12.A0v.A02) && aEb.A00() != null) {
                contentValues.put("flow_id", aEb.A00().A00);
            }
        }
        contentValues.put("message_row_id", Long.valueOf(r12.A0x));
        A04(contentValues, this, "message_ui_elements_reply", "MessageUIElementsStore/insertOrUpdateResponseMessage", A00(r12), r12.A0x);
    }

    public void A0E(AnonymousClass21K r4, long j) {
        try {
            A09(this, r4, "SELECT element_type, element_content FROM message_ui_elements WHERE message_row_id = ?", j);
        } catch (SQLiteBlobTooBigException e) {
            Log.w("InteractiveMessageStore/fillMessageMultiElement/failed to load message", e);
            r4.CIS(new C20285AEt((C20242ADa) null, (AEE) null, this.A05.A01(2131890321), (String) null));
        }
    }

    public void A0F(AnonymousClass21K r21, long j) {
        String str;
        AnonymousClass21K r4 = r21;
        if (r4.BPK() != null) {
            ContentValues contentValues = new ContentValues();
            long j2 = j;
            Long valueOf = Long.valueOf(j2);
            contentValues.put("message_row_id", valueOf);
            contentValues.put("element_type", Integer.valueOf(A0B(r4.BPK())));
            C20285AEt BPK = r4.BPK();
            C18030ve r1 = this.A02;
            C18040vf r5 = C18040vf.A02;
            boolean A052 = C18020vd.A05(r5, r1, 10208);
            C18070vi.A0d(BPK, 0);
            JSONObject A002 = AnonymousClass9QU.A00(BPK, A052);
            if (A002 != null) {
                str = A002.toString();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                contentValues.put("element_content", str);
            }
            A04(contentValues, this, "message_ui_elements", "MessageUIElementsStore/insertMessageMultiElement", A0B(r4.BPK()), j2);
            if (A0B(r4.BPK()) == 9) {
                C25941Qf r7 = this.A06;
                if ((r4 instanceof AnonymousClass21L) && C18020vd.A05(r5, r7.A04, 4668) && C20120A8f.A07((AnonymousClass206) r4)) {
                    List A17 = ((AnonymousClass21L) r4).A17();
                    for (int i = 0; i < A17.size(); i++) {
                        AnonymousClass206 r8 = (AnonymousClass206) A17.get(i);
                        if (r8 instanceof AnonymousClass21V) {
                            AnonymousClass21V r82 = (AnonymousClass21V) r8;
                            C28791au A053 = r7.A03.A05();
                            try {
                                ContentValues contentValues2 = new ContentValues();
                                C62572rc r9 = r82.A02;
                                if (r9 != null) {
                                    C17960vV.A07(r9);
                                    contentValues2.put("file_size", Long.valueOf(r9.A0A));
                                    C63432t4.A03(contentValues2, "media_key", r9.A0a);
                                    contentValues2.put("media_key_timestamp", Long.valueOf(r9.A0B));
                                    contentValues2.put("width", Integer.valueOf(r9.A08));
                                    contentValues2.put("height", Integer.valueOf(r9.A06));
                                    C63432t4.A01(contentValues2, "direct_path", r9.A0J);
                                    File file = r9.A0G;
                                    if (file != null) {
                                        contentValues2.put("file_path", r7.A01.A09(file));
                                    } else {
                                        contentValues2.putNull("file_path");
                                    }
                                    C63432t4.A01(contentValues2, "partial_media_hash", r9.A0O);
                                    C63432t4.A01(contentValues2, "partial_media_enc_hash", r9.A0N);
                                    C63432t4.A03(contentValues2, "scans_sidecar", r9.A0X);
                                    C63432t4.A02(contentValues2, "transferred", r9.A0V);
                                }
                                AnonymousClass1LW r12 = r7.A02;
                                AnonymousClass1BI r0 = r82.A0v.A00;
                                C17960vV.A07(r0);
                                long A09 = r12.A09(r0);
                                String str2 = r82.A07;
                                String str3 = r82.A06;
                                long j3 = r82.A01;
                                String str4 = r82.A05;
                                String str5 = r82.A08;
                                contentValues2.put("message_row_id", valueOf);
                                contentValues2.put("addon_message_index", Integer.valueOf(i));
                                contentValues2.put("chat_row_id", Long.valueOf(A09));
                                C63432t4.A01(contentValues2, "message_url", str2);
                                C63432t4.A01(contentValues2, "mime_type", str3);
                                contentValues2.put("file_length", Long.valueOf(j3));
                                C63432t4.A01(contentValues2, "file_hash", str4);
                                C63432t4.A01(contentValues2, "enc_file_hash", str5);
                                C693336u A0O = r82.A0O();
                                if (A0O != null && C18070vi.A09(r82, C693336u.class).A03) {
                                    C63432t4.A03(contentValues2, "thumbnail", A0O.A01());
                                }
                                C693536w A003 = C60502o8.A00(r82);
                                if (A003 != null) {
                                    C63432t4.A01(contentValues2, "thumbnail_direct_path", A003.A05);
                                    C63432t4.A01(contentValues2, "thumbnail_hash", A003.A09);
                                    C63432t4.A01(contentValues2, "enc_thumbnail_hash", A003.A06);
                                }
                                C23141Ev r92 = ((C28801av) A053).A02;
                                if (r92.A02(contentValues2, "addon_message_media", "message_row_id = ? AND addon_message_index = ?", "UPDATE_SECONDARY_MESSAGE_MEDIA_SQL", new String[]{String.valueOf(j2), String.valueOf(i)}) == 0) {
                                    r92.A05("addon_message_media", "INSERT_SECONDARY_MESSAGE_MEDIA_SQL", contentValues2);
                                }
                                A053.close();
                            } catch (Throwable th) {
                                AnonymousClass0DT.A00(th, th);
                                throw th;
                            }
                        }
                    }
                }
            }
        }
    }

    public C25951Qg(AnonymousClass118 r2, C25941Qf r3, AnonymousClass1LW r4, C24681Lg r5, AnonymousClass1Cd r6, AnonymousClass1KI r7, C18030ve r8, C25931Qe r9) {
        this.A00 = r5;
        this.A03 = r9;
        this.A01 = r6;
        this.A06 = r3;
        this.A08 = r7;
        this.A07 = r4;
        this.A02 = r8;
        this.A05 = r2;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [X.ADF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v5, types: [X.ADG, java.lang.Object] */
    public static final C20285AEt A01(AnonymousClass1KI r34, JSONObject jSONObject) {
        C20285AEt aEt;
        String optString;
        String optString2;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        AEY aey;
        AER aer;
        AE3 ae3;
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("selectListType");
        AnonymousClass1KI r2 = r34;
        if (optInt == 3) {
            AEE A022 = A02(jSONObject2);
            String optString3 = jSONObject2.optString("description");
            String optString4 = jSONObject2.optString("footerText", (String) null);
            C20279AEn A052 = A8o.A05(r2, jSONObject2.optJSONObject("checkout_info"));
            C17960vV.A07(A052);
            C18070vi.A0X(A052);
            aEt = new C20285AEt(A052, A022, A03(r2, jSONObject2.optString("native_flow_content")), optString3, optString4);
        } else if (optInt == 4) {
            String optString5 = jSONObject2.optString("shops_info");
            if (TextUtils.isEmpty(optString5)) {
                return null;
            }
            try {
                C17960vV.A07(optString5);
                JSONObject jSONObject3 = new JSONObject(optString5);
                String optString6 = jSONObject3.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                int optInt2 = jSONObject3.optInt("shop_surface");
                int optInt3 = jSONObject3.optInt("message_version");
                ? obj = new Object();
                obj.A02 = optString6;
                obj.A00 = optInt2;
                obj.A01 = optInt3;
                aEt = C20285AEt.A0G.A00(A02(jSONObject2), obj, jSONObject2.optString("description"), jSONObject2.getInt("selectListType"));
            } catch (JSONException e) {
                Log.w("ShopInfoContentConverter/parseJSON error", e);
                return null;
            }
        } else if (optInt == 5) {
            C20277AEk A032 = A03(r2, jSONObject2.getString("native_flow_content"));
            aEt = null;
            if (A032 != null) {
                AEE A023 = A02(jSONObject2);
                String optString7 = jSONObject2.optString("description");
                String optString8 = jSONObject2.optString("footerText", (String) null);
                String optString9 = jSONObject2.optString("buttonText");
                C18070vi.A0X(optString9);
                aEt = new C20285AEt(A8o.A05(r2, jSONObject2.optJSONObject("checkout_info")), A023, A032, optString7, optString8, optString9);
            }
            return aEt;
        } else if (optInt == 7) {
            String string = jSONObject2.getString("carousel_content");
            if (!TextUtils.isEmpty(string)) {
                try {
                    C17960vV.A07(string);
                    JSONObject jSONObject4 = new JSONObject(string);
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = jSONObject4.optJSONArray("cards");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject jSONObject5 = optJSONArray.getJSONObject(i);
                            if (jSONObject5 != null) {
                                if (jSONObject5.optInt("selectListType") > 0) {
                                    arrayList.add(A01(r2, jSONObject5));
                                } else {
                                    C20277AEk A033 = A03(r2, jSONObject5.getString("native_flow_content"));
                                    AEE A024 = A02(jSONObject5);
                                    String optString10 = jSONObject5.optString("description");
                                    String optString11 = jSONObject5.optString("footerText");
                                    String optString12 = jSONObject5.optString("buttonText");
                                    C18070vi.A0d(optString12, 4);
                                    C18070vi.A0d(A033, 5);
                                    arrayList.add(new C20285AEt((View.OnClickListener) null, (C20279AEn) null, (AEY) null, (C20242ADa) null, A024, A033, (AER) null, (ADF) null, (ADG) null, optString10, optString11, optString12, (String) null, (String) null, C18460wS.A00, 5));
                                }
                            }
                        }
                    }
                    aEt = new C20285AEt(new C20242ADa(arrayList), A02(jSONObject2), jSONObject2.optString("description", (String) null), jSONObject2.optString("footerText", (String) null));
                } catch (JSONException e2) {
                    Log.w("CarouselMessageConverter/parseJSON/deserialization error", e2);
                }
            }
            return null;
        } else if (optInt == 9) {
            C20277AEk A034 = A03(r2, jSONObject2.getString("native_flow_content"));
            JSONObject jSONObject6 = jSONObject2.getJSONObject("single_product_info");
            ADG adg = null;
            if (!(jSONObject6 == null || (optString = jSONObject6.optString("business_owner_jid")) == null)) {
                C22941Dw r4 = UserJid.Companion;
                UserJid A035 = C22941Dw.A03(optString);
                String optString13 = jSONObject6.optString("product_id");
                if (!(optString13 == null || (optString2 = jSONObject6.optString("title")) == null)) {
                    String optString14 = jSONObject6.optString("currency_code");
                    if (optString14 == null || optString14.length() == 0) {
                        bigDecimal = null;
                        bigDecimal2 = null;
                    } else {
                        try {
                            bigDecimal = C197309wU.A00(new A6S(optString14), jSONObject6.optLong("price_amount"));
                            try {
                                bigDecimal2 = C197309wU.A00(new A6S(optString14), jSONObject6.optLong("sale_price_amount"));
                            } catch (IllegalArgumentException unused) {
                            }
                        } catch (IllegalArgumentException unused2) {
                            bigDecimal = null;
                            optString14 = null;
                            bigDecimal2 = null;
                            String optString15 = jSONObject6.optString("description");
                            String optString16 = jSONObject6.optString("retailer_id");
                            String optString17 = jSONObject6.optString("product_url");
                            int optInt4 = jSONObject6.optInt("product_image_count");
                            String optString18 = jSONObject6.optString("body");
                            String optString19 = jSONObject6.optString("footer");
                            ? obj2 = new Object();
                            obj2.A01 = A035;
                            obj2.A06 = optString13;
                            obj2.A09 = optString2;
                            obj2.A04 = optString15;
                            obj2.A03 = optString14;
                            obj2.A0A = bigDecimal;
                            obj2.A0B = bigDecimal2;
                            obj2.A08 = optString16;
                            obj2.A07 = optString17;
                            obj2.A00 = optInt4;
                            obj2.A02 = optString18;
                            obj2.A05 = optString19;
                            adg = obj2;
                            return A034 == null ? null : null;
                        }
                    }
                    String optString152 = jSONObject6.optString("description");
                    String optString162 = jSONObject6.optString("retailer_id");
                    String optString172 = jSONObject6.optString("product_url");
                    int optInt42 = jSONObject6.optInt("product_image_count");
                    String optString182 = jSONObject6.optString("body");
                    String optString192 = jSONObject6.optString("footer");
                    ? obj22 = new Object();
                    obj22.A01 = A035;
                    obj22.A06 = optString13;
                    obj22.A09 = optString2;
                    obj22.A04 = optString152;
                    obj22.A03 = optString14;
                    obj22.A0A = bigDecimal;
                    obj22.A0B = bigDecimal2;
                    obj22.A08 = optString162;
                    obj22.A07 = optString172;
                    obj22.A00 = optInt42;
                    obj22.A02 = optString182;
                    obj22.A05 = optString192;
                    adg = obj22;
                }
            }
            if (A034 == null && adg != null) {
                aEt = new C20285AEt((View.OnClickListener) null, (C20279AEn) null, (AEY) null, (C20242ADa) null, A02(jSONObject2), A034, (AER) null, (ADF) null, adg, jSONObject2.optString("description"), jSONObject2.optString("footerText"), (String) null, (String) null, (String) null, C18460wS.A00, 9);
            }
        } else if (optInt != 10) {
            AEE A025 = A02(jSONObject2);
            String optString20 = jSONObject2.optString("description");
            String optString21 = jSONObject2.optString("footerText", (String) null);
            String optString22 = jSONObject2.optString("buttonText");
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("sections");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray2 != null) {
                int length = optJSONArray2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject7 = optJSONArray2.getJSONObject(i2);
                    JSONArray optJSONArray3 = jSONObject7.optJSONArray("items");
                    String optString23 = jSONObject7.optString("title");
                    C18070vi.A0X(optString23);
                    ArrayList arrayList3 = new ArrayList();
                    if (optJSONArray3 != null) {
                        int length2 = optJSONArray3.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            JSONObject jSONObject8 = optJSONArray3.getJSONObject(i3);
                            String optString24 = jSONObject8.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            C18070vi.A0X(optString24);
                            String optString25 = jSONObject8.optString("title");
                            C18070vi.A0X(optString25);
                            arrayList3.add(new AEF(optString24, (String) null, optString25, jSONObject8.optString("description")));
                        }
                    }
                    arrayList2.add(new AE4(optString23, (String) null, arrayList3));
                }
            }
            JSONObject optJSONObject = jSONObject2.optJSONObject("product_info");
            byte[] bArr = null;
            if (optJSONObject == null) {
                aer = null;
            } else {
                String optString26 = optJSONObject.optString("business_owner_jid");
                try {
                    C22941Dw r1 = UserJid.Companion;
                    UserJid A036 = C22941Dw.A03(optString26);
                    ArrayList arrayList4 = new ArrayList();
                    JSONArray optJSONArray4 = optJSONObject.optJSONArray("product_sections");
                    if (optJSONArray4 != null) {
                        int length3 = optJSONArray4.length();
                        for (int i4 = 0; i4 < length3; i4++) {
                            JSONObject optJSONObject2 = optJSONArray4.optJSONObject(i4);
                            JSONArray optJSONArray5 = optJSONObject2.optJSONArray("product_section_products");
                            ArrayList arrayList5 = new ArrayList();
                            if (optJSONArray5 != null) {
                                int length4 = optJSONArray5.length();
                                for (int i5 = 0; i5 < length4; i5++) {
                                    String optString27 = optJSONArray5.optJSONObject(i5).optString("product_id");
                                    C18070vi.A0b(optString27);
                                    arrayList5.add(new C20243ADb(optString27));
                                }
                            }
                            arrayList4.add(new C20254ADm(optJSONObject2.optString("product_sections_title"), arrayList5));
                        }
                    }
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("product_header_info");
                    if (optJSONObject3 != null) {
                        String optString28 = optJSONObject3.optString("product_header_info_thumb");
                        if (!(optString28 == null || optString28.length() == 0)) {
                            bArr = Base64.decode(optString28, 0);
                        }
                        String optString29 = optJSONObject3.optString("product_header_info_id");
                        boolean optBoolean = optJSONObject3.optBoolean("product_header_is_rejected", false);
                        C18070vi.A0b(optString29);
                        ae3 = new AE3(bArr, optString29, optBoolean);
                    } else {
                        ae3 = new AE3((byte[]) null, "", false);
                    }
                    aer = new AER(A036, ae3, arrayList4);
                } catch (AnonymousClass11T e3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MultiElementConverter/parseProductListInfo/Invalid jid: ");
                    sb.append(optString26);
                    Log.e(sb.toString(), e3);
                    aer = null;
                }
            }
            aEt = new C20285AEt((View.OnClickListener) null, A8o.A05(r2, jSONObject2.optJSONObject("checkout_info")), (AEY) null, (C20242ADa) null, A025, (C20277AEk) null, aer, (ADF) null, (ADG) null, optString20, optString21, optString22, (String) null, (String) null, arrayList2, optInt);
        } else {
            JSONObject optJSONObject4 = jSONObject2.optJSONObject("payment_info");
            if (optJSONObject4 == null) {
                aey = null;
            } else {
                aey = new AEY(r2.A01(optJSONObject4.optString("currency")), optJSONObject4.optString("title"), optJSONObject4.optString("logging_id"), C181629Rf.A00(optJSONObject4.optJSONArray("payment_settings")));
            }
            C17960vV.A07(aey);
            aEt = new C20285AEt(aey, A03(r2, jSONObject2.optString("native_flow_content")));
        }
        aEt.A0E = jSONObject2.optString("templateId", (String) null);
        aEt.A0D = jSONObject2.optString("hsmtag", (String) null);
        return aEt;
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [X.ADE, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b A[Catch:{ JSONException -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0 A[Catch:{ JSONException -> 0x00b3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C20277AEk A03(X.AnonymousClass1KI r13, java.lang.String r14) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r8 = 0
            if (r0 == 0) goto L_0x0008
            return r8
        L_0x0008:
            X.C17960vV.A07(r14)     // Catch:{ JSONException -> 0x00b3 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b3 }
            r4.<init>(r14)     // Catch:{ JSONException -> 0x00b3 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ JSONException -> 0x00b3 }
            r12.<init>()     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "content_of_nfm"
            r6 = 0
            int r14 = r4.optInt(r0, r6)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "buttons"
            org.json.JSONArray r5 = r4.optJSONArray(r0)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "message_params_json"
            java.lang.String r11 = r4.optString(r0)     // Catch:{ JSONException -> 0x00b3 }
            if (r5 == 0) goto L_0x0068
        L_0x002a:
            int r0 = r5.length()     // Catch:{ JSONException -> 0x00b3 }
            if (r6 >= r0) goto L_0x0068
            org.json.JSONObject r2 = r5.getJSONObject(r6)     // Catch:{ JSONException -> 0x00b3 }
            if (r2 == 0) goto L_0x0065
            java.lang.String r0 = "name"
            java.lang.String r7 = r2.optString(r0)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "params"
            java.lang.String r3 = r2.optString(r0)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "checkout_info"
            org.json.JSONObject r1 = r2.optJSONObject(r0)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "selected"
            boolean r2 = r2.optBoolean(r0)     // Catch:{ JSONException -> 0x00b3 }
            if (r1 == 0) goto L_0x0063
            X.AEn r0 = X.A8o.A05(r13, r1)     // Catch:{ JSONException -> 0x00b3 }
        L_0x0055:
            X.AEe r1 = new X.AEe     // Catch:{ JSONException -> 0x00b3 }
            r1.<init>(r0, r7, r3)     // Catch:{ JSONException -> 0x00b3 }
            X.ADl r0 = new X.ADl     // Catch:{ JSONException -> 0x00b3 }
            r0.<init>(r1, r2)     // Catch:{ JSONException -> 0x00b3 }
            r12.add(r0)     // Catch:{ JSONException -> 0x00b3 }
            goto L_0x0065
        L_0x0063:
            r0 = r8
            goto L_0x0055
        L_0x0065:
            int r6 = r6 + 1
            goto L_0x002a
        L_0x0068:
            java.lang.String r0 = "form_state"
            org.json.JSONObject r3 = r4.optJSONObject(r0)     // Catch:{ JSONException -> 0x00b3 }
            r0 = 2
            if (r14 != r0) goto L_0x009d
            if (r3 == 0) goto L_0x007a
            java.lang.String r0 = "form_elements_values"
            org.json.JSONObject r2 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x00b3 }
            goto L_0x007b
        L_0x007a:
            r2 = r8
        L_0x007b:
            if (r11 == 0) goto L_0x0098
            boolean r0 = r11.isEmpty()     // Catch:{ JSONException -> 0x00b3 }
            if (r0 != 0) goto L_0x0098
            X.9kI r1 = new X.9kI     // Catch:{ JSONException -> 0x0092 }
            r1.<init>()     // Catch:{ JSONException -> 0x0092 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0092 }
            r0.<init>(r11)     // Catch:{ JSONException -> 0x0092 }
            X.DcQ r13 = r1.A00(r0, r2)     // Catch:{ JSONException -> 0x0092 }
            goto L_0x0099
        L_0x0092:
            r1 = move-exception
            java.lang.String r0 = "NativeFlowMessageConverter/parseDynamicMessageElements/deserialization error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
        L_0x0098:
            r13 = r8
        L_0x0099:
            if (r3 != 0) goto L_0x00a0
            r10 = r8
            goto L_0x00ad
        L_0x009d:
            r13 = r8
            r10 = r8
            goto L_0x00ad
        L_0x00a0:
            java.lang.String r0 = "is_form_disabled"
            boolean r0 = r3.optBoolean(r0)     // Catch:{ JSONException -> 0x00b3 }
            X.ADE r10 = new X.ADE     // Catch:{ JSONException -> 0x00b3 }
            r10.<init>()     // Catch:{ JSONException -> 0x00b3 }
            r10.A00 = r0     // Catch:{ JSONException -> 0x00b3 }
        L_0x00ad:
            X.AEk r9 = new X.AEk     // Catch:{ JSONException -> 0x00b3 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x00b3 }
            return r9
        L_0x00b3:
            r1 = move-exception
            java.lang.String r0 = "NativeFlowMessageConverter/parseJSON/deserialization error"
            com.whatsapp.util.Log.w(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25951Qg.A03(X.1KI, java.lang.String):X.AEk");
    }

    public static void A0A(AnonymousClass206 r4, AnonymousClass00H r5) {
        ((C25951Qg) r5.get()).A0F((AnonymousClass21K) r4, r4.A0x);
    }
}
