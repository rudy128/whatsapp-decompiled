package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Ry  reason: invalid class name and case insensitive filesystem */
public class C26391Ry {
    public final C25551Oq A00;
    public final AnonymousClass00H A01;

    public AnonymousClass231 A03(DeviceJid deviceJid, String str) {
        Cursor A0A;
        C17960vV.A01();
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE device_id = ? AND key_from_me = ? AND key_id = ?", "PeerMessagesStore.getPeerMessageByKey", new String[]{deviceJid.getRawString(), String.valueOf(1), str});
            if (!A0A.moveToNext()) {
                A0A.close();
                A05.close();
                return null;
            }
            AnonymousClass231 A002 = A00(A0A);
            A0A.close();
            A05.close();
            return A002;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public C26391Ry(C25551Oq r1, AnonymousClass00H r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r8v5, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r8v6, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x03fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x03fe, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0401, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0405, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0593, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0597, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x059a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x059e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x060b, code lost:
        r5.endObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0618, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x061c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x061f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0623, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e8, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x09fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass231 A00(android.database.Cursor r11) {
        /*
            r10 = this;
            X.C17960vV.A01()
            java.lang.String r0 = "_id"
            int r0 = r11.getColumnIndexOrThrow(r0)
            long r0 = r11.getLong(r0)
            java.lang.String r2 = "message_type"
            int r2 = r11.getColumnIndexOrThrow(r2)
            long r3 = r11.getLong(r2)
            int r2 = (int) r3
            byte r8 = (byte) r2
            java.lang.String r2 = "key_remote_jid"
            int r2 = r11.getColumnIndexOrThrow(r2)
            java.lang.String r4 = r11.getString(r2)
            X.1Dv r2 = X.AnonymousClass1BI.A00
            X.1BI r6 = r2.A02(r4)
            if (r6 != 0) goto L_0x0051
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "peer-messages-store/read-peer-message-from-cursor/invalid remote jid "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = " for "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " of msgType: "
            r3.append(r0)
            r3.append(r8)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x0051:
            java.lang.String r2 = "key_from_me"
            int r2 = r11.getColumnIndexOrThrow(r2)
            int r5 = r11.getInt(r2)
            r4 = 0
            r2 = 1
            r3 = 0
            if (r5 != r2) goto L_0x0061
            r3 = 1
        L_0x0061:
            java.lang.String r2 = "key_id"
            int r2 = r11.getColumnIndexOrThrow(r2)
            java.lang.String r2 = r11.getString(r2)
            X.205 r7 = new X.205
            r7.<init>(r6, r2, r3)
            java.lang.String r5 = "timestamp"
            int r2 = r11.getColumnIndexOrThrow(r5)
            long r2 = r11.getLong(r2)
            X.00H r6 = r10.A01
            java.lang.Object r6 = r6.get()
            X.207 r6 = (X.AnonymousClass207) r6
            X.206 r3 = r6.A00(r7, r8, r2)
            X.231 r3 = (X.AnonymousClass231) r3
            r3.A0x = r0
            java.lang.String r0 = "device_id"
            int r0 = r11.getColumnIndexOrThrow(r0)
            java.lang.String r1 = r11.getString(r0)
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r0 = r0.A06(r1)
            if (r0 == 0) goto L_0x009f
            r3.A00 = r0
        L_0x009f:
            java.lang.String r0 = "data"
            int r0 = r11.getColumnIndexOrThrow(r0)
            java.lang.String r1 = r11.getString(r0)
            boolean r0 = r3 instanceof X.AnonymousClass232
            if (r0 == 0) goto L_0x013a
            r5 = r3
            X.232 r5 = (X.AnonymousClass232) r5
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x09ec
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x09e6 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x09e6 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x09e6 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x09e6 }
            r2.beginObject()     // Catch:{ all -> 0x0130 }
        L_0x00c3:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x0128
            java.lang.String r6 = r2.nextName()     // Catch:{ all -> 0x0130 }
            int r1 = r6.hashCode()     // Catch:{ all -> 0x0130 }
            r0 = 569764601(0x21f5eaf9, float:1.6664043E-18)
            if (r1 == r0) goto L_0x00ea
            r0 = 1150097001(0x448d1669, float:1128.7003)
            if (r1 != r0) goto L_0x010e
            java.lang.String r0 = "requestType"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x010e
            int r0 = r2.nextInt()     // Catch:{ all -> 0x0130 }
            r5.A00 = r0     // Catch:{ all -> 0x0130 }
            goto L_0x00c3
        L_0x00ea:
            java.lang.String r0 = "identifierSet"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x010e
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0130 }
            r1.<init>()     // Catch:{ all -> 0x0130 }
            r2.beginArray()     // Catch:{ all -> 0x0130 }
        L_0x00fa:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x0130 }
            r1.add(r0)     // Catch:{ all -> 0x0130 }
            goto L_0x00fa
        L_0x0108:
            r2.endArray()     // Catch:{ all -> 0x0130 }
            r5.A01 = r1     // Catch:{ all -> 0x0130 }
            goto L_0x00c3
        L_0x010e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0130 }
            r1.<init>()     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = "FMessagePeerDataOperationRequest/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x0130 }
            r1.append(r6)     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0130 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0130 }
            goto L_0x00c3
        L_0x0128:
            r2.endObject()     // Catch:{ all -> 0x0130 }
            r2.close()     // Catch:{ IOException -> 0x09e6 }
            goto L_0x09ec
        L_0x0130:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0135 }
            goto L_0x0139
        L_0x0135:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x09e6 }
        L_0x0139:
            throw r1     // Catch:{ IOException -> 0x09e6 }
        L_0x013a:
            boolean r0 = r3 instanceof X.AnonymousClass241
            if (r0 == 0) goto L_0x01f1
            r7 = r3
            X.241 r7 = (X.AnonymousClass241) r7
            if (r1 == 0) goto L_0x09ec
            int r0 = r1.length()
            if (r0 == 0) goto L_0x09ec
            java.io.StringReader r2 = new java.io.StringReader     // Catch:{ IOException -> 0x01e9 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x01e9 }
            android.util.JsonReader r6 = new android.util.JsonReader     // Catch:{ all -> 0x01e2 }
            r6.<init>(r2)     // Catch:{ all -> 0x01e2 }
        L_0x0153:
            r6.beginObject()     // Catch:{ all -> 0x01db }
        L_0x0156:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x01d0
            java.lang.String r1 = r6.nextName()     // Catch:{ all -> 0x01db }
            if (r1 == 0) goto L_0x0169
            int r0 = r1.hashCode()     // Catch:{ all -> 0x01db }
            switch(r0) {
                case -1340068645: goto L_0x016f;
                case -392662625: goto L_0x0178;
                case 105002991: goto L_0x0187;
                case 1281924152: goto L_0x01a6;
                default: goto L_0x0169;
            }     // Catch:{ all -> 0x01db }
        L_0x0169:
            java.lang.String r0 = "FMessagePeerDataWaffleNonceFetchRequestResponse/readDataFromJsonReader unexpected format"
            X.C31081ez.A01(r0)     // Catch:{ all -> 0x01db }
            goto L_0x0156
        L_0x016f:
            java.lang.String r0 = "peerDataOperationResults"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x0153
            goto L_0x0169
        L_0x0178:
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x0169
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x01db }
            r7.A00 = r0     // Catch:{ all -> 0x01db }
            goto L_0x0156
        L_0x0187:
            java.lang.String r0 = "nonce"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x0169
            X.7Ik r8 = new X.7Ik     // Catch:{ all -> 0x01db }
            r8.<init>()     // Catch:{ all -> 0x01db }
            java.lang.String r5 = r6.nextString()     // Catch:{ all -> 0x01db }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x01db }
            java.lang.String r1 = "waffleCompanionLinkingNonce"
            X.77e r0 = new X.77e     // Catch:{ all -> 0x01db }
            r0.<init>(r8, r5, r1)     // Catch:{ all -> 0x01db }
            r7.A00 = r0     // Catch:{ all -> 0x01db }
            goto L_0x0156
        L_0x01a6:
            java.lang.String r0 = "waEntFbid"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x0169
            X.7Ik r8 = new X.7Ik     // Catch:{ all -> 0x01db }
            r8.<init>()     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x01db }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x01db }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x01db }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r1 = "WaFbid"
            X.77e r0 = new X.77e     // Catch:{ all -> 0x01db }
            r0.<init>(r8, r5, r1)     // Catch:{ all -> 0x01db }
            r7.A01 = r0     // Catch:{ all -> 0x01db }
            r6.endObject()     // Catch:{ all -> 0x01db }
            goto L_0x0156
        L_0x01d0:
            r6.endObject()     // Catch:{ all -> 0x01db }
            r6.close()     // Catch:{ all -> 0x01e2 }
            r2.close()     // Catch:{ IOException -> 0x01e9 }
            goto L_0x09ec
        L_0x01db:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x01e2 }
            throw r0     // Catch:{ all -> 0x01e2 }
        L_0x01e2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01e4 }
        L_0x01e4:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x01e9 }
            throw r0     // Catch:{ IOException -> 0x01e9 }
        L_0x01e9:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataWaffleNonceFetchRequestResponse/readData failed"
            X.C31081ez.A03(r0, r1)
            goto L_0x09ec
        L_0x01f1:
            boolean r0 = r3 instanceof X.AnonymousClass239
            if (r0 == 0) goto L_0x02f8
            r9 = r3
            X.239 r9 = (X.AnonymousClass239) r9
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x09ec
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x02bf }
            r0.<init>(r1)     // Catch:{ IOException -> 0x02bf }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ IOException -> 0x02bf }
            r5.<init>(r0)     // Catch:{ IOException -> 0x02bf }
            r5.beginObject()     // Catch:{ all -> 0x02b5 }
        L_0x0215:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02b5 }
            if (r0 == 0) goto L_0x02ae
            java.lang.String r6 = r5.nextName()     // Catch:{ all -> 0x02b5 }
            int r1 = r6.hashCode()     // Catch:{ all -> 0x02b5 }
            r0 = -957719559(0xffffffffc6ea5bf9, float:-29997.986)
            r7 = 2
            if (r1 == r0) goto L_0x0265
            r0 = -758599065(0xffffffffd2c8b267, float:-4.30993277E11)
            if (r1 == r0) goto L_0x0242
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 != r0) goto L_0x0293
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x02b5 }
            if (r0 == 0) goto L_0x0293
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x02b5 }
            r9.A00 = r0     // Catch:{ all -> 0x02b5 }
            goto L_0x0215
        L_0x0242:
            java.lang.String r0 = "requestResults"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x02b5 }
            if (r0 == 0) goto L_0x0293
            r5.beginObject()     // Catch:{ all -> 0x02b5 }
        L_0x024d:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02b5 }
            if (r0 == 0) goto L_0x028f
            java.lang.String r1 = r5.nextName()     // Catch:{ all -> 0x02b5 }
            int r0 = r5.nextInt()     // Catch:{ all -> 0x02b5 }
            X.9KN r0 = X.AnonymousClass9KN.A00(r0)     // Catch:{ all -> 0x02b5 }
            if (r0 == 0) goto L_0x024d
            r2.put(r1, r0)     // Catch:{ all -> 0x02b5 }
            goto L_0x024d
        L_0x0265:
            java.lang.String r0 = "stickerResults"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x02b5 }
            if (r0 == 0) goto L_0x0293
            r5.beginObject()     // Catch:{ all -> 0x02b5 }
        L_0x0271:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02b5 }
            if (r0 == 0) goto L_0x028f
            java.lang.String r6 = r5.nextName()     // Catch:{ all -> 0x02b5 }
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x02b5 }
            byte[] r1 = android.util.Base64.decode(r0, r7)     // Catch:{ all -> 0x02b5 }
            X.8cX r0 = X.C166218cX.DEFAULT_INSTANCE     // Catch:{ all -> 0x02b5 }
            X.Bm6 r0 = X.C23577Bm6.A07(r0, r1)     // Catch:{ all -> 0x02b5 }
            X.8cX r0 = (X.C166218cX) r0     // Catch:{ all -> 0x02b5 }
            r8.put(r6, r0)     // Catch:{ all -> 0x02b5 }
            goto L_0x0271
        L_0x028f:
            r5.endObject()     // Catch:{ all -> 0x02b5 }
            goto L_0x0215
        L_0x0293:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b5 }
            r1.<init>()     // Catch:{ all -> 0x02b5 }
            java.lang.String r0 = "FMessagePeerDataStickerRequestResponse/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x02b5 }
            r1.append(r6)     // Catch:{ all -> 0x02b5 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x02b5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02b5 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x02b5 }
            goto L_0x0215
        L_0x02ae:
            r5.endObject()     // Catch:{ all -> 0x02b5 }
            r5.close()     // Catch:{ IOException -> 0x02bf }
            goto L_0x02c5
        L_0x02b5:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x02ba }
            goto L_0x02be
        L_0x02ba:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x02bf }
        L_0x02be:
            throw r1     // Catch:{ IOException -> 0x02bf }
        L_0x02bf:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataStickerRequestResponse/readData failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02c5:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x02cd:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x09ec
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            java.util.Map r5 = r9.A00
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r8.containsKey(r6)
            if (r0 == 0) goto L_0x02f6
            java.lang.Object r1 = r8.get(r6)
        L_0x02ed:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r5.put(r6, r0)
            goto L_0x02cd
        L_0x02f6:
            r1 = 0
            goto L_0x02ed
        L_0x02f8:
            boolean r0 = r3 instanceof X.AnonymousClass237
            if (r0 == 0) goto L_0x0365
            r5 = r3
            X.234 r5 = (X.AnonymousClass234) r5
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x09ec
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x0360 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0360 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x0360 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0360 }
            r2.beginObject()     // Catch:{ all -> 0x0356 }
        L_0x0312:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0356 }
            if (r0 == 0) goto L_0x034e
            java.lang.String r6 = r2.nextName()     // Catch:{ all -> 0x0356 }
            int r1 = r6.hashCode()     // Catch:{ all -> 0x0356 }
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 != r0) goto L_0x0334
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0356 }
            if (r0 == 0) goto L_0x0334
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x0356 }
            r5.A00 = r0     // Catch:{ all -> 0x0356 }
            goto L_0x0312
        L_0x0334:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0356 }
            r1.<init>()     // Catch:{ all -> 0x0356 }
            java.lang.String r0 = "FMessagePeerDataRequestUnknownResponse/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x0356 }
            r1.append(r6)     // Catch:{ all -> 0x0356 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x0356 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0356 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0356 }
            goto L_0x0312
        L_0x034e:
            r2.endObject()     // Catch:{ all -> 0x0356 }
            r2.close()     // Catch:{ IOException -> 0x0360 }
            goto L_0x09ec
        L_0x0356:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x035b }
            goto L_0x035f
        L_0x035b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0360 }
        L_0x035f:
            throw r1     // Catch:{ IOException -> 0x0360 }
        L_0x0360:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataRequestUnknownResponse/readData failed"
            goto L_0x09e9
        L_0x0365:
            boolean r0 = r3 instanceof X.AnonymousClass23B
            if (r0 == 0) goto L_0x040b
            r6 = r3
            X.23B r6 = (X.AnonymousClass23B) r6
            if (r1 == 0) goto L_0x09ec
            int r0 = r1.length()
            if (r0 == 0) goto L_0x09ec
            java.io.StringReader r2 = new java.io.StringReader     // Catch:{ IOException -> 0x0406 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0406 }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ all -> 0x03ff }
            r5.<init>(r2)     // Catch:{ all -> 0x03ff }
            java.lang.String r7 = "FMessagePeerDataPlaceholderResendResponse/readData failed"
            r5.beginObject()     // Catch:{ all -> 0x03f8 }
        L_0x0383:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x03f8 }
            if (r0 == 0) goto L_0x03ed
            java.lang.String r8 = r5.nextName()     // Catch:{ all -> 0x03f8 }
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = X.C18070vi.A18(r8, r0)     // Catch:{ all -> 0x03f8 }
            if (r0 == 0) goto L_0x039c
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x03f8 }
            r6.A00 = r0     // Catch:{ all -> 0x03f8 }
            goto L_0x0383
        L_0x039c:
            java.lang.String r0 = "peerDataOperationResults"
            boolean r0 = X.C18070vi.A18(r8, r0)     // Catch:{ all -> 0x03f8 }
            if (r0 == 0) goto L_0x03d8
            r5.beginArray()     // Catch:{ all -> 0x03f8 }
            X.DcQ r8 = X.AnonymousClass1ZT.A01()     // Catch:{ all -> 0x03f8 }
        L_0x03ab:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x03f8 }
            if (r0 == 0) goto L_0x03ce
            java.lang.String r1 = r5.nextString()     // Catch:{ 1PN | IllegalArgumentException -> 0x03c9 }
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch:{ 1PN | IllegalArgumentException -> 0x03c9 }
            X.8bo r0 = X.C165818bo.DEFAULT_INSTANCE     // Catch:{ 1PN | IllegalArgumentException -> 0x03c9 }
            X.Bm6 r0 = X.C23577Bm6.A07(r0, r1)     // Catch:{ 1PN | IllegalArgumentException -> 0x03c9 }
            X.8bo r0 = (X.C165818bo) r0     // Catch:{ 1PN | IllegalArgumentException -> 0x03c9 }
            X.C18070vi.A0X(r0)     // Catch:{ 1PN | IllegalArgumentException -> 0x03c9 }
            r8.add(r0)     // Catch:{ 1PN | IllegalArgumentException -> 0x03c9 }
            goto L_0x03ab
        L_0x03c9:
            r0 = move-exception
            com.whatsapp.util.Log.e(r7, r0)     // Catch:{ all -> 0x03f8 }
            goto L_0x03ab
        L_0x03ce:
            X.DcQ r0 = X.AnonymousClass1ZT.A02(r8)     // Catch:{ all -> 0x03f8 }
            r6.A00 = r0     // Catch:{ all -> 0x03f8 }
            r5.endArray()     // Catch:{ all -> 0x03f8 }
            goto L_0x0383
        L_0x03d8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f8 }
            r1.<init>()     // Catch:{ all -> 0x03f8 }
            java.lang.String r0 = "FMessagePeerDataPlaceholderResendResponse/readData unexpected name: "
            r1.append(r0)     // Catch:{ all -> 0x03f8 }
            r1.append(r8)     // Catch:{ all -> 0x03f8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03f8 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x03f8 }
            goto L_0x0383
        L_0x03ed:
            r5.endObject()     // Catch:{ all -> 0x03f8 }
            r5.close()     // Catch:{ all -> 0x03ff }
            r2.close()     // Catch:{ IOException -> 0x0406 }
            goto L_0x09ec
        L_0x03f8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03fa }
        L_0x03fa:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x03ff }
            throw r0     // Catch:{ all -> 0x03ff }
        L_0x03ff:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0401 }
        L_0x0401:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0406 }
            throw r0     // Catch:{ IOException -> 0x0406 }
        L_0x0406:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataPlaceholderResendResponse/readData failed"
            goto L_0x09e9
        L_0x040b:
            boolean r0 = r3 instanceof X.AnonymousClass235
            if (r0 == 0) goto L_0x0511
            r9 = r3
            X.235 r9 = (X.AnonymousClass235) r9
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x09ec
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x04d8 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x04d8 }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ IOException -> 0x04d8 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x04d8 }
            r5.beginObject()     // Catch:{ all -> 0x04ce }
        L_0x042f:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x04ce }
            if (r0 == 0) goto L_0x04c7
            java.lang.String r6 = r5.nextName()     // Catch:{ all -> 0x04ce }
            int r1 = r6.hashCode()     // Catch:{ all -> 0x04ce }
            r0 = -1808687704(0xffffffff94319da8, float:-8.9673085E-27)
            r7 = 2
            if (r1 == r0) goto L_0x047f
            r0 = -758599065(0xffffffffd2c8b267, float:-4.30993277E11)
            if (r1 == r0) goto L_0x045c
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 != r0) goto L_0x04ac
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x04ce }
            if (r0 == 0) goto L_0x04ac
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x04ce }
            r9.A00 = r0     // Catch:{ all -> 0x04ce }
            goto L_0x042f
        L_0x045c:
            java.lang.String r0 = "requestResults"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x04ce }
            if (r0 == 0) goto L_0x04ac
            r5.beginObject()     // Catch:{ all -> 0x04ce }
        L_0x0467:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x04ce }
            if (r0 == 0) goto L_0x04a8
            java.lang.String r1 = r5.nextName()     // Catch:{ all -> 0x04ce }
            int r0 = r5.nextInt()     // Catch:{ all -> 0x04ce }
            X.9KN r0 = X.AnonymousClass9KN.A00(r0)     // Catch:{ all -> 0x04ce }
            if (r0 == 0) goto L_0x0467
            r2.put(r1, r0)     // Catch:{ all -> 0x04ce }
            goto L_0x0467
        L_0x047f:
            java.lang.String r0 = "linkPreviewResults"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x04ce }
            if (r0 == 0) goto L_0x04ac
            r5.beginObject()     // Catch:{ all -> 0x04ce }
        L_0x048a:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x04ce }
            if (r0 == 0) goto L_0x04a8
            java.lang.String r6 = r5.nextName()     // Catch:{ all -> 0x04ce }
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x04ce }
            byte[] r1 = android.util.Base64.decode(r0, r7)     // Catch:{ all -> 0x04ce }
            X.8bw r0 = X.C165898bw.DEFAULT_INSTANCE     // Catch:{ all -> 0x04ce }
            X.Bm6 r0 = X.C23577Bm6.A07(r0, r1)     // Catch:{ all -> 0x04ce }
            X.8bw r0 = (X.C165898bw) r0     // Catch:{ all -> 0x04ce }
            r8.put(r6, r0)     // Catch:{ all -> 0x04ce }
            goto L_0x048a
        L_0x04a8:
            r5.endObject()     // Catch:{ all -> 0x04ce }
            goto L_0x042f
        L_0x04ac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ce }
            r1.<init>()     // Catch:{ all -> 0x04ce }
            java.lang.String r0 = "FMessagePeerDataLinkPreviewRequestResponse/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x04ce }
            r1.append(r6)     // Catch:{ all -> 0x04ce }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x04ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04ce }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x04ce }
            goto L_0x042f
        L_0x04c7:
            r5.endObject()     // Catch:{ all -> 0x04ce }
            r5.close()     // Catch:{ IOException -> 0x04d8 }
            goto L_0x04de
        L_0x04ce:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x04d3 }
            goto L_0x04d7
        L_0x04d3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x04d8 }
        L_0x04d7:
            throw r1     // Catch:{ IOException -> 0x04d8 }
        L_0x04d8:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataLinkPreviewRequestResponse/readData failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x04de:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x04e6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x09ec
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            java.util.Map r5 = r9.A00
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r8.containsKey(r6)
            if (r0 == 0) goto L_0x050f
            java.lang.Object r1 = r8.get(r6)
        L_0x0506:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r5.put(r6, r0)
            goto L_0x04e6
        L_0x050f:
            r1 = 0
            goto L_0x0506
        L_0x0511:
            boolean r0 = r3 instanceof X.AnonymousClass243
            if (r0 == 0) goto L_0x05a4
            r6 = r3
            X.243 r6 = (X.AnonymousClass243) r6
            if (r1 == 0) goto L_0x09ec
            boolean r0 = X.AnonymousClass1YF.A0T(r1)
            if (r0 != 0) goto L_0x09ec
            java.io.StringReader r2 = new java.io.StringReader     // Catch:{ IOException -> 0x059f }
            r2.<init>(r1)     // Catch:{ IOException -> 0x059f }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ all -> 0x0598 }
            r5.<init>(r2)     // Catch:{ all -> 0x0598 }
        L_0x052a:
            r5.beginObject()     // Catch:{ all -> 0x0591 }
        L_0x052d:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0591 }
            if (r0 == 0) goto L_0x0586
            java.lang.String r1 = r5.nextName()     // Catch:{ all -> 0x0591 }
            if (r1 == 0) goto L_0x0540
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0591 }
            switch(r0) {
                case -1340068645: goto L_0x057d;
                case -392662625: goto L_0x056e;
                case 586820319: goto L_0x055f;
                case 1676268331: goto L_0x0546;
                default: goto L_0x0540;
            }     // Catch:{ all -> 0x0591 }
        L_0x0540:
            java.lang.String r0 = "FMessagePeerDataFullHistoryOnDemandRequestResponse/readDataFromJsonReader unexpected format"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0591 }
            goto L_0x052d
        L_0x0546:
            java.lang.String r0 = "response_code"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0591 }
            if (r0 == 0) goto L_0x0540
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0591 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0591 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0591 }
            r6.A00 = r0     // Catch:{ all -> 0x0591 }
            r5.endObject()     // Catch:{ all -> 0x0591 }
            goto L_0x052d
        L_0x055f:
            java.lang.String r0 = "request_metadata"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0591 }
            if (r0 == 0) goto L_0x0540
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0591 }
            r6.A01 = r0     // Catch:{ all -> 0x0591 }
            goto L_0x052d
        L_0x056e:
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0591 }
            if (r0 == 0) goto L_0x0540
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0591 }
            r6.A00 = r0     // Catch:{ all -> 0x0591 }
            goto L_0x052d
        L_0x057d:
            java.lang.String r0 = "peerDataOperationResults"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0591 }
            if (r0 != 0) goto L_0x052a
            goto L_0x0540
        L_0x0586:
            r5.endObject()     // Catch:{ all -> 0x0591 }
            r5.close()     // Catch:{ all -> 0x0598 }
            r2.close()     // Catch:{ IOException -> 0x059f }
            goto L_0x09ec
        L_0x0591:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0593 }
        L_0x0593:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0598 }
            throw r0     // Catch:{ all -> 0x0598 }
        L_0x0598:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x059a }
        L_0x059a:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x059f }
            throw r0     // Catch:{ IOException -> 0x059f }
        L_0x059f:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataFullHistoryOnDemandRequestResponse/readData failed"
            goto L_0x09e9
        L_0x05a4:
            boolean r0 = r3 instanceof X.AnonymousClass245
            if (r0 == 0) goto L_0x0629
            r6 = r3
            X.245 r6 = (X.AnonymousClass245) r6
            if (r1 == 0) goto L_0x09ec
            int r0 = r1.length()
            if (r0 == 0) goto L_0x09ec
            java.io.StringReader r2 = new java.io.StringReader     // Catch:{ IOException -> 0x0624 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0624 }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ all -> 0x061d }
            r5.<init>(r2)     // Catch:{ all -> 0x061d }
        L_0x05bd:
            r5.beginObject()     // Catch:{ all -> 0x0616 }
        L_0x05c0:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0616 }
            if (r0 == 0) goto L_0x060b
            java.lang.String r7 = r5.nextName()     // Catch:{ all -> 0x0616 }
            if (r7 == 0) goto L_0x0605
            int r1 = r7.hashCode()     // Catch:{ all -> 0x0616 }
            r0 = -1340068645(0xffffffffb0202cdb, float:-5.8271404E-10)
            if (r1 == r0) goto L_0x05fd
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 == r0) goto L_0x05ee
            r0 = 105002991(0x64237ef, float:3.6528438E-35)
            if (r1 != r0) goto L_0x0605
            java.lang.String r0 = "nonce"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x0616 }
            if (r0 == 0) goto L_0x0605
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0616 }
            r6.A00 = r0     // Catch:{ all -> 0x0616 }
            goto L_0x05c0
        L_0x05ee:
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x0616 }
            if (r0 == 0) goto L_0x0605
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0616 }
            r6.A00 = r0     // Catch:{ all -> 0x0616 }
            goto L_0x05c0
        L_0x05fd:
            java.lang.String r0 = "peerDataOperationResults"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x0616 }
            if (r0 != 0) goto L_0x05bd
        L_0x0605:
            java.lang.String r0 = "FMessagePeerDataCompanionMetaNonceResponse/readDataFromJsonReader unexpected format"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0616 }
            goto L_0x05c0
        L_0x060b:
            r5.endObject()     // Catch:{ all -> 0x0616 }
            r5.close()     // Catch:{ all -> 0x061d }
            r2.close()     // Catch:{ IOException -> 0x0624 }
            goto L_0x09ec
        L_0x0616:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0618 }
        L_0x0618:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x061d }
            throw r0     // Catch:{ all -> 0x061d }
        L_0x061d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x061f }
        L_0x061f:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0624 }
            throw r0     // Catch:{ IOException -> 0x0624 }
        L_0x0624:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataCompanionMetaNonceResponse/readData failed"
            goto L_0x09e9
        L_0x0629:
            boolean r0 = r3 instanceof X.AnonymousClass23L
            if (r0 == 0) goto L_0x067d
            r6 = r3
            X.23L r6 = (X.AnonymousClass23L) r6
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x09ec
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x0678 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0678 }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ IOException -> 0x0678 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0678 }
            r5.beginObject()     // Catch:{ all -> 0x066e }
        L_0x0643:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x066e }
            if (r0 == 0) goto L_0x0666
            java.lang.String r2 = r5.nextName()     // Catch:{ all -> 0x066e }
            int r1 = r2.hashCode()     // Catch:{ all -> 0x066e }
            r0 = 1518553996(0x5a834b8c, float:1.84781433E16)
            if (r1 != r0) goto L_0x0643
            java.lang.String r0 = "security_notification_enabled"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x066e }
            if (r0 == 0) goto L_0x0643
            boolean r0 = r5.nextBoolean()     // Catch:{ all -> 0x066e }
            r6.A00 = r0     // Catch:{ all -> 0x066e }
            goto L_0x0643
        L_0x0666:
            r5.endObject()     // Catch:{ all -> 0x066e }
            r5.close()     // Catch:{ IOException -> 0x0678 }
            goto L_0x09ec
        L_0x066e:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0673 }
            goto L_0x0677
        L_0x0673:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0678 }
        L_0x0677:
            throw r1     // Catch:{ IOException -> 0x0678 }
        L_0x0678:
            r1 = move-exception
            java.lang.String r0 = "FMessageInitialSecurityNotificationSettingSync/readData failed"
            goto L_0x09e9
        L_0x067d:
            boolean r0 = r3 instanceof X.AnonymousClass23J
            if (r0 == 0) goto L_0x083f
            r2 = r3
            X.23J r2 = (X.AnonymousClass23J) r2
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x09ec
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x083a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x083a }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ IOException -> 0x083a }
            r5.<init>(r0)     // Catch:{ IOException -> 0x083a }
            r5.beginObject()     // Catch:{ all -> 0x0830 }
        L_0x0697:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x0828
            java.lang.String r1 = r5.nextName()     // Catch:{ all -> 0x0830 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0830 }
            r6 = 2
            switch(r0) {
                case -1906067869: goto L_0x06c3;
                case -1696065235: goto L_0x06d2;
                case -1641051461: goto L_0x06e1;
                case -1001078227: goto L_0x06f0;
                case -945994952: goto L_0x06ff;
                case -339500935: goto L_0x070e;
                case -50870532: goto L_0x071e;
                case 494573150: goto L_0x072e;
                case 500641162: goto L_0x073f;
                case 899130860: goto L_0x0753;
                case 990743644: goto L_0x0763;
                case 1098377542: goto L_0x0773;
                case 1120684249: goto L_0x0783;
                case 1161658856: goto L_0x0793;
                case 1190721806: goto L_0x07a7;
                case 1661853540: goto L_0x07b7;
                case 1807168655: goto L_0x07c8;
                case 1836211977: goto L_0x07d8;
                case 1894532689: goto L_0x07e8;
                case 1939495049: goto L_0x07f8;
                case 2011285592: goto L_0x0808;
                case 2104347627: goto L_0x0818;
                default: goto L_0x06a9;
            }     // Catch:{ all -> 0x0830 }
        L_0x06a9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0830 }
            r6.<init>()     // Catch:{ all -> 0x0830 }
            java.lang.String r0 = "FMessageHistorySyncNotification/readData/unexpected name \""
            r6.append(r0)     // Catch:{ all -> 0x0830 }
            r6.append(r1)     // Catch:{ all -> 0x0830 }
            java.lang.String r0 = "\""
            r6.append(r0)     // Catch:{ all -> 0x0830 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0830 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x06c3:
            java.lang.String r0 = "original-msg-id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0830 }
            r2.A0G = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x06d2:
            java.lang.String r0 = "enc_handle"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0830 }
            r2.A0C = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x06e1:
            java.lang.String r0 = "direct_path"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0830 }
            r2.A0B = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x06f0:
            java.lang.String r0 = "progress"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            int r0 = r5.nextInt()     // Catch:{ all -> 0x0830 }
            r2.A01 = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x06ff:
            java.lang.String r0 = "oldest_msg_to_sync_timestamp"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            long r0 = r5.nextLong()     // Catch:{ all -> 0x0830 }
            r2.A0A = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x070e:
            java.lang.String r0 = "oldest_msg_id_to_sync"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            long r0 = r5.nextLong()     // Catch:{ all -> 0x0830 }
            r2.A09 = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x071e:
            java.lang.String r0 = "chunk_order"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            int r0 = r5.nextInt()     // Catch:{ all -> 0x0830 }
            r2.A00 = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x072e:
            java.lang.String r0 = "sync_type"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            int r0 = r5.nextInt()     // Catch:{ all -> 0x0830 }
            r2.A03 = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x073f:
            java.lang.String r0 = "key_data"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0830 }
            byte[] r0 = android.util.Base64.decode(r0, r6)     // Catch:{ all -> 0x0830 }
            r2.A0L = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x0753:
            java.lang.String r0 = "peer_data_request_session_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0830 }
            r2.A0H = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x0763:
            java.lang.String r0 = "messages_count"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            long r0 = r5.nextLong()     // Catch:{ all -> 0x0830 }
            r2.A07 = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x0773:
            java.lang.String r0 = "retries"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            int r0 = r5.nextInt()     // Catch:{ all -> 0x0830 }
            r2.A02 = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x0783:
            java.lang.String r0 = "oldest_msg_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            long r0 = r5.nextLong()     // Catch:{ all -> 0x0830 }
            r2.A08 = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x0793:
            java.lang.String r0 = "inline_payload"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0830 }
            byte[] r0 = android.util.Base64.decode(r0, r6)     // Catch:{ all -> 0x0830 }
            r2.A0K = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x07a7:
            java.lang.String r0 = "enc_media_hash"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0830 }
            r2.A0E = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x07b7:
            java.lang.String r0 = "session_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0830 }
            r2.A0J = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x07c8:
            java.lang.String r0 = "full_on_demand_request_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0830 }
            r2.A0D = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x07d8:
            java.lang.String r0 = "file_length"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            long r0 = r5.nextLong()     // Catch:{ all -> 0x0830 }
            r2.A05 = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x07e8:
            java.lang.String r0 = "latest_msg_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            long r0 = r5.nextLong()     // Catch:{ all -> 0x0830 }
            r2.A06 = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x07f8:
            java.lang.String r0 = "media_hash"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0830 }
            r2.A0F = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x0808:
            java.lang.String r0 = "reg_attempt_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0830 }
            r2.A0I = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x0818:
            java.lang.String r0 = "chats_count"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0830 }
            if (r0 == 0) goto L_0x06a9
            long r0 = r5.nextLong()     // Catch:{ all -> 0x0830 }
            r2.A04 = r0     // Catch:{ all -> 0x0830 }
            goto L_0x0697
        L_0x0828:
            r5.endObject()     // Catch:{ all -> 0x0830 }
            r5.close()     // Catch:{ IOException -> 0x083a }
            goto L_0x09ec
        L_0x0830:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0835 }
            goto L_0x0839
        L_0x0835:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x083a }
        L_0x0839:
            throw r1     // Catch:{ IOException -> 0x083a }
        L_0x083a:
            r1 = move-exception
            java.lang.String r0 = "FMessageHistorySyncNotification/readData failed"
            goto L_0x09e9
        L_0x083f:
            boolean r0 = r3 instanceof X.AnonymousClass23F
            if (r0 == 0) goto L_0x08cd
            r5 = r3
            X.23F r5 = (X.AnonymousClass23F) r5
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x09ec
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x08c8 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x08c8 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x08c8 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x08c8 }
            r2.beginObject()     // Catch:{ all -> 0x08be }
        L_0x0859:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x08be }
            if (r0 == 0) goto L_0x08b6
            java.lang.String r6 = r2.nextName()     // Catch:{ all -> 0x08be }
            int r1 = r6.hashCode()     // Catch:{ all -> 0x08be }
            r0 = -1807872114(0xffffffff943e0f8e, float:-9.595616E-27)
            if (r1 == r0) goto L_0x0880
            r0 = 1970709011(0x7576a213, float:3.126446E32)
            if (r1 != r0) goto L_0x089c
            java.lang.String r0 = "isNewlyGeneratedKey"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x08be }
            if (r0 == 0) goto L_0x089c
            boolean r0 = r2.nextBoolean()     // Catch:{ all -> 0x08be }
            r5.A01 = r0     // Catch:{ all -> 0x08be }
            goto L_0x0859
        L_0x0880:
            java.lang.String r0 = "appStateSyncKeyShareProtoString"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x08be }
            if (r0 == 0) goto L_0x089c
            java.lang.String r1 = r2.nextString()     // Catch:{ all -> 0x08be }
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x08be }
            X.2B3 r0 = X.AnonymousClass2B3.DEFAULT_INSTANCE     // Catch:{ all -> 0x08be }
            X.Bm6 r0 = X.C23577Bm6.A07(r0, r1)     // Catch:{ all -> 0x08be }
            X.2B3 r0 = (X.AnonymousClass2B3) r0     // Catch:{ all -> 0x08be }
            r5.A00 = r0     // Catch:{ all -> 0x08be }
            goto L_0x0859
        L_0x089c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x08be }
            r1.<init>()     // Catch:{ all -> 0x08be }
            java.lang.String r0 = "FMessageAppStateSyncKeyShare/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x08be }
            r1.append(r6)     // Catch:{ all -> 0x08be }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x08be }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x08be }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x08be }
            goto L_0x0859
        L_0x08b6:
            r2.endObject()     // Catch:{ all -> 0x08be }
            r2.close()     // Catch:{ IOException -> 0x08c8 }
            goto L_0x09ec
        L_0x08be:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x08c3 }
            goto L_0x08c7
        L_0x08c3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x08c8 }
        L_0x08c7:
            throw r1     // Catch:{ IOException -> 0x08c8 }
        L_0x08c8:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyShare/readData failed"
            goto L_0x09e9
        L_0x08cd:
            boolean r0 = r3 instanceof X.AnonymousClass23D
            if (r0 == 0) goto L_0x095d
            r0 = r3
            X.23D r0 = (X.AnonymousClass23D) r0
            java.util.Set r5 = r0.A00
            r5.clear()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x09ec
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x0958 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0958 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x0958 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0958 }
            r2.beginObject()     // Catch:{ all -> 0x094e }
        L_0x08ec:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x094e }
            if (r0 == 0) goto L_0x0946
            java.lang.String r6 = r2.nextName()     // Catch:{ all -> 0x094e }
            java.lang.String r0 = "key-ids"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x094e }
            if (r0 == 0) goto L_0x092c
            r2.beginArray()     // Catch:{ all -> 0x094e }
        L_0x0901:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x094e }
            if (r0 == 0) goto L_0x0928
            java.lang.String r1 = r2.nextString()     // Catch:{ all -> 0x094e }
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x094e }
            X.C18070vi.A0d(r1, r4)     // Catch:{ all -> 0x094e }
            X.8XX r0 = X.AnonymousClass8XX.DEFAULT_INSTANCE     // Catch:{ all -> 0x094e }
            X.Bm6 r0 = X.C23577Bm6.A07(r0, r1)     // Catch:{ all -> 0x094e }
            X.8XX r0 = (X.AnonymousClass8XX) r0     // Catch:{ all -> 0x094e }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x094e }
            X.A2n r0 = X.AnonymousClass9QT.A00(r0)     // Catch:{ all -> 0x094e }
            if (r0 == 0) goto L_0x0901
            r5.add(r0)     // Catch:{ all -> 0x094e }
            goto L_0x0901
        L_0x0928:
            r2.endArray()     // Catch:{ all -> 0x094e }
            goto L_0x08ec
        L_0x092c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x094e }
            r1.<init>()     // Catch:{ all -> 0x094e }
            java.lang.String r0 = "FMessageAppStateSyncKeyRequest/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x094e }
            r1.append(r6)     // Catch:{ all -> 0x094e }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x094e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x094e }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x094e }
            goto L_0x08ec
        L_0x0946:
            r2.endObject()     // Catch:{ all -> 0x094e }
            r2.close()     // Catch:{ IOException -> 0x0958 }
            goto L_0x09ec
        L_0x094e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0953 }
            goto L_0x0957
        L_0x0953:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0958 }
        L_0x0957:
            throw r1     // Catch:{ IOException -> 0x0958 }
        L_0x0958:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyRequest/readData failed"
            goto L_0x09e9
        L_0x095d:
            r6 = r3
            X.23H r6 = (X.AnonymousClass23H) r6
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x09ec
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x09e2 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x09e2 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x09e2 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x09e2 }
            r2.beginObject()     // Catch:{ all -> 0x09d8 }
        L_0x0973:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d1
            java.lang.String r7 = r2.nextName()     // Catch:{ all -> 0x09d8 }
            int r1 = r7.hashCode()     // Catch:{ all -> 0x09d8 }
            r0 = -1490290073(0xffffffffa72bfa67, float:-2.386676E-15)
            if (r1 == r0) goto L_0x0998
            r0 = 55126294(0x3492916, float:5.9115755E-37)
            if (r1 != r0) goto L_0x09b7
            boolean r0 = r7.equals(r5)     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09b7
            long r0 = r2.nextLong()     // Catch:{ all -> 0x09d8 }
            r6.A00 = r0     // Catch:{ all -> 0x09d8 }
            goto L_0x0973
        L_0x0998:
            java.lang.String r0 = "collection_names"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09b7
            r2.beginArray()     // Catch:{ all -> 0x09d8 }
        L_0x09a3:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09b3
            java.util.Set r1 = r6.A01     // Catch:{ all -> 0x09d8 }
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x09d8 }
            r1.add(r0)     // Catch:{ all -> 0x09d8 }
            goto L_0x09a3
        L_0x09b3:
            r2.endArray()     // Catch:{ all -> 0x09d8 }
            goto L_0x0973
        L_0x09b7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09d8 }
            r1.<init>()     // Catch:{ all -> 0x09d8 }
            java.lang.String r0 = "FMessageAppStateFatalExceptionNotification/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x09d8 }
            r1.append(r7)     // Catch:{ all -> 0x09d8 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x09d8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x09d8 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x09d8 }
            goto L_0x0973
        L_0x09d1:
            r2.endObject()     // Catch:{ all -> 0x09d8 }
            r2.close()     // Catch:{ IOException -> 0x09e2 }
            goto L_0x09ec
        L_0x09d8:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x09dd }
            goto L_0x09e1
        L_0x09dd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x09e2 }
        L_0x09e1:
            throw r1     // Catch:{ IOException -> 0x09e2 }
        L_0x09e2:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateFatalExceptionNotification/readData failed"
            goto L_0x09e9
        L_0x09e6:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataOperationRequest/readData failed"
        L_0x09e9:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x09ec:
            java.lang.String r0 = "acked"
            int r0 = r11.getColumnIndexOrThrow(r0)
            long r5 = r11.getLong(r0)
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x09fd
            r4 = 1
        L_0x09fd:
            r3.A01 = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26391Ry.A00(android.database.Cursor):X.231");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x028c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0290, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0293, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0297, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03d2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03d9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x042e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0432, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0435, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0439, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0115, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0119, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0120, code lost:
        throw r0;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:385:0x0703=Splitter:B:385:0x0703, B:323:0x0637=Splitter:B:323:0x0637, B:372:0x06ed=Splitter:B:372:0x06ed} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01(X.AnonymousClass231 r12) {
        /*
            r11 = this;
            X.C17960vV.A01()
            X.1Oq r0 = r11.A00
            X.1au r8 = r0.A06()
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x072f }
            r5.<init>()     // Catch:{ all -> 0x072f }
            java.lang.String r1 = "message_type"
            int r0 = r12.A0u     // Catch:{ all -> 0x072f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x072f }
            r5.put(r1, r0)     // Catch:{ all -> 0x072f }
            java.lang.String r1 = "key_remote_jid"
            X.205 r2 = r12.A0v     // Catch:{ all -> 0x072f }
            X.1BI r0 = r2.A00     // Catch:{ all -> 0x072f }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x072f }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x072f }
            r5.put(r1, r0)     // Catch:{ all -> 0x072f }
            java.lang.String r1 = "key_from_me"
            boolean r0 = r2.A02     // Catch:{ all -> 0x072f }
            r10 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x072f }
            r5.put(r1, r0)     // Catch:{ all -> 0x072f }
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x072f }
            r5.put(r1, r0)     // Catch:{ all -> 0x072f }
            java.lang.String r2 = "timestamp"
            long r0 = r12.A0I     // Catch:{ all -> 0x072f }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x072f }
            r5.put(r2, r0)     // Catch:{ all -> 0x072f }
            com.whatsapp.jid.DeviceJid r0 = r12.A00     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = "device_id"
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x072f }
            r5.put(r1, r0)     // Catch:{ all -> 0x072f }
        L_0x0055:
            java.lang.String r6 = "data"
            boolean r0 = r12 instanceof X.AnonymousClass232     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x00ae
            r7 = r12
            X.232 r7 = (X.AnonymousClass232) r7     // Catch:{ all -> 0x072f }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x072f }
            r4.<init>()     // Catch:{ all -> 0x072f }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0700 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0700 }
            r2.beginObject()     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "requestType"
            android.util.JsonWriter r3 = r2.name(r0)     // Catch:{ all -> 0x00a4 }
            int r0 = r7.A00     // Catch:{ all -> 0x00a4 }
            long r0 = (long) r0     // Catch:{ all -> 0x00a4 }
            r3.value(r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "identifierSet"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x00a4 }
            r0.beginArray()     // Catch:{ all -> 0x00a4 }
            java.util.Set r0 = r7.A01     // Catch:{ all -> 0x00a4 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00a4 }
        L_0x0086:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00a4 }
            r2.value(r0)     // Catch:{ all -> 0x00a4 }
            goto L_0x0086
        L_0x0096:
            r2.endArray()     // Catch:{ all -> 0x00a4 }
            r2.endObject()     // Catch:{ all -> 0x00a4 }
            r2.flush()     // Catch:{ all -> 0x00a4 }
            r2.close()     // Catch:{ IOException -> 0x0700 }
            goto L_0x06ed
        L_0x00a4:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00a9 }
            goto L_0x00ad
        L_0x00a9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0700 }
        L_0x00ad:
            throw r1     // Catch:{ IOException -> 0x0700 }
        L_0x00ae:
            boolean r0 = r12 instanceof X.AnonymousClass241     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x0129
            r7 = r12
            X.241 r7 = (X.AnonymousClass241) r7     // Catch:{ all -> 0x072f }
            r2 = 0
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ IOException -> 0x0121 }
            r3.<init>()     // Catch:{ IOException -> 0x0121 }
            android.util.JsonWriter r4 = new android.util.JsonWriter     // Catch:{ all -> 0x011a }
            r4.<init>(r3)     // Catch:{ all -> 0x011a }
            r4.beginObject()     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "requestStanzaId"
            android.util.JsonWriter r1 = r4.name(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = r7.A00     // Catch:{ all -> 0x0113 }
            r1.value(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "peerDataOperationResults"
            r4.name(r0)     // Catch:{ all -> 0x0113 }
            r4.beginObject()     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "nonce"
            android.util.JsonWriter r1 = r4.name(r0)     // Catch:{ all -> 0x0113 }
            X.77e r0 = r7.A00     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0113 }
        L_0x00e4:
            r1.value(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "waEntFbid"
            android.util.JsonWriter r1 = r4.name(r0)     // Catch:{ all -> 0x0113 }
            X.77e r0 = r7.A01     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0113 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0113 }
        L_0x00f6:
            r1.value(r0)     // Catch:{ all -> 0x0113 }
            r4.endObject()     // Catch:{ all -> 0x0113 }
            r4.endObject()     // Catch:{ all -> 0x0113 }
            r4.flush()     // Catch:{ all -> 0x0113 }
            goto L_0x0107
        L_0x0103:
            r0 = r2
            goto L_0x00f6
        L_0x0105:
            r0 = r2
            goto L_0x00e4
        L_0x0107:
            r4.close()     // Catch:{ all -> 0x011a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x011a }
            r3.close()     // Catch:{ IOException -> 0x0121 }
            goto L_0x0429
        L_0x0113:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x011a }
            throw r0     // Catch:{ all -> 0x011a }
        L_0x011a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x011c }
        L_0x011c:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x0121 }
            throw r0     // Catch:{ IOException -> 0x0121 }
        L_0x0121:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataWaffleNonceFetchRequestResponse/writeData failed"
            X.C31081ez.A03(r0, r1)     // Catch:{ all -> 0x072f }
            goto L_0x070e
        L_0x0129:
            boolean r0 = r12 instanceof X.AnonymousClass239     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x01f5
            r7 = r12
            X.239 r7 = (X.AnonymousClass239) r7     // Catch:{ all -> 0x072f }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x072f }
            r4.<init>()     // Catch:{ all -> 0x072f }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x01f0 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x01f0 }
            r2.beginObject()     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "requestStanzaId"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = r7.A00     // Catch:{ all -> 0x01e6 }
            r1.value(r0)     // Catch:{ all -> 0x01e6 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x01e6 }
            r3.<init>()     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "stickerResults"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x01e6 }
            r0.beginObject()     // Catch:{ all -> 0x01e6 }
            java.util.Map r0 = r7.A00     // Catch:{ all -> 0x01e6 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x01e6 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x01e6 }
        L_0x0161:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x01a2
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x01e6 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x01e6 }
            java.lang.Object r1 = r7.getKey()     // Catch:{ all -> 0x01e6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01e6 }
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x01e6 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x01e6 }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x01e6 }
            X.9KN r0 = (X.AnonymousClass9KN) r0     // Catch:{ all -> 0x01e6 }
            r3.put(r1, r0)     // Catch:{ all -> 0x01e6 }
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x01e6 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x01e6 }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x01e6 }
            X.8cX r1 = (X.C166218cX) r1     // Catch:{ all -> 0x01e6 }
            if (r1 == 0) goto L_0x0161
            java.lang.Object r0 = r7.getKey()     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01e6 }
            r2.name(r0)     // Catch:{ all -> 0x01e6 }
            byte[] r1 = r1.A0M()     // Catch:{ all -> 0x01e6 }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x01e6 }
            r2.value(r0)     // Catch:{ all -> 0x01e6 }
            goto L_0x0161
        L_0x01a2:
            r2.endObject()     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "requestResults"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x01e6 }
            r0.beginObject()     // Catch:{ all -> 0x01e6 }
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x01e6 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x01e6 }
        L_0x01b6:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x01e6 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x01e6 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01e6 }
            r2.name(r0)     // Catch:{ all -> 0x01e6 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x01e6 }
            X.9KN r0 = (X.AnonymousClass9KN) r0     // Catch:{ all -> 0x01e6 }
            int r0 = r0.value     // Catch:{ all -> 0x01e6 }
            long r0 = (long) r0     // Catch:{ all -> 0x01e6 }
            r2.value(r0)     // Catch:{ all -> 0x01e6 }
            goto L_0x01b6
        L_0x01d8:
            r2.endObject()     // Catch:{ all -> 0x01e6 }
            r2.endObject()     // Catch:{ all -> 0x01e6 }
            r2.flush()     // Catch:{ all -> 0x01e6 }
            r2.close()     // Catch:{ IOException -> 0x01f0 }
            goto L_0x06ed
        L_0x01e6:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x01eb }
            goto L_0x01ef
        L_0x01eb:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x01f0 }
        L_0x01ef:
            throw r1     // Catch:{ IOException -> 0x01f0 }
        L_0x01f0:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataStickerRequestResponse/writeData failed"
            goto L_0x0703
        L_0x01f5:
            boolean r0 = r12 instanceof X.AnonymousClass237     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x022e
            r3 = r12
            X.234 r3 = (X.AnonymousClass234) r3     // Catch:{ all -> 0x072f }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x072f }
            r4.<init>()     // Catch:{ all -> 0x072f }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0229 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0229 }
            r2.beginObject()     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "requestStanzaId"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = r3.A00     // Catch:{ all -> 0x021f }
            r1.value(r0)     // Catch:{ all -> 0x021f }
            r2.endObject()     // Catch:{ all -> 0x021f }
            r2.flush()     // Catch:{ all -> 0x021f }
            r2.close()     // Catch:{ IOException -> 0x0229 }
            goto L_0x0637
        L_0x021f:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0224 }
            goto L_0x0228
        L_0x0224:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0229 }
        L_0x0228:
            throw r1     // Catch:{ IOException -> 0x0229 }
        L_0x0229:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataRequestUnknownResponse/writeData failed"
            goto L_0x0703
        L_0x022e:
            boolean r0 = r12 instanceof X.AnonymousClass23B     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x02a0
            r2 = r12
            X.23B r2 = (X.AnonymousClass23B) r2     // Catch:{ all -> 0x072f }
            r7 = 0
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ IOException -> 0x0298 }
            r3.<init>()     // Catch:{ IOException -> 0x0298 }
            android.util.JsonWriter r4 = new android.util.JsonWriter     // Catch:{ all -> 0x0291 }
            r4.<init>(r3)     // Catch:{ all -> 0x0291 }
            r4.beginObject()     // Catch:{ all -> 0x028a }
            java.lang.String r0 = "requestStanzaId"
            android.util.JsonWriter r1 = r4.name(r0)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x028a }
            r1.value(r0)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = "peerDataOperationResults"
            r4.name(r0)     // Catch:{ all -> 0x028a }
            r4.beginArray()     // Catch:{ all -> 0x028a }
            java.util.List r0 = r2.A00     // Catch:{ all -> 0x028a }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x028a }
        L_0x025c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0275
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x028a }
            X.8bo r0 = (X.C165818bo) r0     // Catch:{ all -> 0x028a }
            byte[] r1 = r0.A0M()     // Catch:{ all -> 0x028a }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x028a }
            r4.value(r0)     // Catch:{ all -> 0x028a }
            goto L_0x025c
        L_0x0275:
            r4.endArray()     // Catch:{ all -> 0x028a }
            r4.endObject()     // Catch:{ all -> 0x028a }
            r4.flush()     // Catch:{ all -> 0x028a }
            r4.close()     // Catch:{ all -> 0x0291 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0291 }
            r3.close()     // Catch:{ IOException -> 0x0298 }
            goto L_0x070e
        L_0x028a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x028c }
        L_0x028c:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0291 }
            throw r0     // Catch:{ all -> 0x0291 }
        L_0x0291:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0293 }
        L_0x0293:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x0298 }
            throw r0     // Catch:{ IOException -> 0x0298 }
        L_0x0298:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataPlaceholderResendResponse/writeData failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x072f }
            goto L_0x03e0
        L_0x02a0:
            boolean r0 = r12 instanceof X.AnonymousClass235     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x036b
            r7 = r12
            X.235 r7 = (X.AnonymousClass235) r7     // Catch:{ all -> 0x072f }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x072f }
            r4.<init>()     // Catch:{ all -> 0x072f }
            android.util.JsonWriter r3 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0366 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0366 }
            r3.beginObject()     // Catch:{ all -> 0x035c }
            java.lang.String r0 = "requestStanzaId"
            android.util.JsonWriter r1 = r3.name(r0)     // Catch:{ all -> 0x035c }
            java.lang.String r0 = r7.A00     // Catch:{ all -> 0x035c }
            r1.value(r0)     // Catch:{ all -> 0x035c }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x035c }
            r2.<init>()     // Catch:{ all -> 0x035c }
            java.lang.String r0 = "linkPreviewResults"
            android.util.JsonWriter r0 = r3.name(r0)     // Catch:{ all -> 0x035c }
            r0.beginObject()     // Catch:{ all -> 0x035c }
            java.util.Map r0 = r7.A00     // Catch:{ all -> 0x035c }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x035c }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x035c }
        L_0x02d7:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x035c }
            if (r0 == 0) goto L_0x0318
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x035c }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x035c }
            java.lang.Object r1 = r7.getKey()     // Catch:{ all -> 0x035c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x035c }
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x035c }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x035c }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x035c }
            X.9KN r0 = (X.AnonymousClass9KN) r0     // Catch:{ all -> 0x035c }
            r2.put(r1, r0)     // Catch:{ all -> 0x035c }
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x035c }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x035c }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x035c }
            X.8bw r1 = (X.C165898bw) r1     // Catch:{ all -> 0x035c }
            if (r1 == 0) goto L_0x02d7
            java.lang.Object r0 = r7.getKey()     // Catch:{ all -> 0x035c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x035c }
            r3.name(r0)     // Catch:{ all -> 0x035c }
            byte[] r1 = r1.A0M()     // Catch:{ all -> 0x035c }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x035c }
            r3.value(r0)     // Catch:{ all -> 0x035c }
            goto L_0x02d7
        L_0x0318:
            r3.endObject()     // Catch:{ all -> 0x035c }
            java.lang.String r0 = "requestResults"
            android.util.JsonWriter r0 = r3.name(r0)     // Catch:{ all -> 0x035c }
            r0.beginObject()     // Catch:{ all -> 0x035c }
            java.util.Set r0 = r2.entrySet()     // Catch:{ all -> 0x035c }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x035c }
        L_0x032c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x035c }
            if (r0 == 0) goto L_0x034e
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x035c }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x035c }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x035c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x035c }
            r3.name(r0)     // Catch:{ all -> 0x035c }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x035c }
            X.9KN r0 = (X.AnonymousClass9KN) r0     // Catch:{ all -> 0x035c }
            int r0 = r0.value     // Catch:{ all -> 0x035c }
            long r0 = (long) r0     // Catch:{ all -> 0x035c }
            r3.value(r0)     // Catch:{ all -> 0x035c }
            goto L_0x032c
        L_0x034e:
            r3.endObject()     // Catch:{ all -> 0x035c }
            r3.endObject()     // Catch:{ all -> 0x035c }
            r3.flush()     // Catch:{ all -> 0x035c }
            r3.close()     // Catch:{ IOException -> 0x0366 }
            goto L_0x06ed
        L_0x035c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0361 }
            goto L_0x0365
        L_0x0361:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0366 }
        L_0x0365:
            throw r1     // Catch:{ IOException -> 0x0366 }
        L_0x0366:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataLinkPreviewRequestResponse/writeData failed"
            goto L_0x0703
        L_0x036b:
            boolean r0 = r12 instanceof X.AnonymousClass243     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x03e3
            r4 = r12
            X.243 r4 = (X.AnonymousClass243) r4     // Catch:{ all -> 0x072f }
            r7 = 0
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ IOException -> 0x03da }
            r3.<init>()     // Catch:{ IOException -> 0x03da }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ all -> 0x03d3 }
            r2.<init>(r3)     // Catch:{ all -> 0x03d3 }
            r2.beginObject()     // Catch:{ all -> 0x03cc }
            java.lang.String r0 = "requestStanzaId"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x03cc }
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x03cc }
            r1.value(r0)     // Catch:{ all -> 0x03cc }
            java.lang.String r0 = "peerDataOperationResults"
            r2.name(r0)     // Catch:{ all -> 0x03cc }
            r2.beginObject()     // Catch:{ all -> 0x03cc }
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x03cc }
            if (r0 == 0) goto L_0x03a8
            int r0 = r0.length()     // Catch:{ all -> 0x03cc }
            if (r0 == 0) goto L_0x03a8
            java.lang.String r0 = "request_metadata"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x03cc }
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x03cc }
            r1.value(r0)     // Catch:{ all -> 0x03cc }
        L_0x03a8:
            java.lang.String r0 = "response_code"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x03cc }
            int r0 = r4.A00     // Catch:{ all -> 0x03cc }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03cc }
            r1.value(r0)     // Catch:{ all -> 0x03cc }
            r2.endObject()     // Catch:{ all -> 0x03cc }
            r2.endObject()     // Catch:{ all -> 0x03cc }
            r2.flush()     // Catch:{ all -> 0x03cc }
            r2.close()     // Catch:{ all -> 0x03d3 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x03d3 }
            r3.close()     // Catch:{ IOException -> 0x03da }
            goto L_0x070e
        L_0x03cc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03ce }
        L_0x03ce:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x03d3 }
            throw r0     // Catch:{ all -> 0x03d3 }
        L_0x03d3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03d5 }
        L_0x03d5:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x03da }
            throw r0     // Catch:{ IOException -> 0x03da }
        L_0x03da:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataFullHistoryOnDemandRequestResponse/writeData failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x072f }
        L_0x03e0:
            r2 = r7
            goto L_0x070e
        L_0x03e3:
            boolean r0 = r12 instanceof X.AnonymousClass245     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x043a
            r7 = r12
            X.245 r7 = (X.AnonymousClass245) r7     // Catch:{ all -> 0x072f }
            r2 = 0
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ IOException -> 0x0708 }
            r3.<init>()     // Catch:{ IOException -> 0x0708 }
            android.util.JsonWriter r4 = new android.util.JsonWriter     // Catch:{ all -> 0x0433 }
            r4.<init>(r3)     // Catch:{ all -> 0x0433 }
            r4.beginObject()     // Catch:{ all -> 0x042c }
            java.lang.String r0 = "requestStanzaId"
            android.util.JsonWriter r1 = r4.name(r0)     // Catch:{ all -> 0x042c }
            java.lang.String r0 = r7.A00     // Catch:{ all -> 0x042c }
            r1.value(r0)     // Catch:{ all -> 0x042c }
            java.lang.String r0 = "peerDataOperationResults"
            r4.name(r0)     // Catch:{ all -> 0x042c }
            r4.beginObject()     // Catch:{ all -> 0x042c }
            java.lang.String r0 = "nonce"
            android.util.JsonWriter r1 = r4.name(r0)     // Catch:{ all -> 0x042c }
            java.lang.String r0 = r7.A00     // Catch:{ all -> 0x042c }
            r1.value(r0)     // Catch:{ all -> 0x042c }
            r4.endObject()     // Catch:{ all -> 0x042c }
            r4.endObject()     // Catch:{ all -> 0x042c }
            r4.flush()     // Catch:{ all -> 0x042c }
            r4.close()     // Catch:{ all -> 0x0433 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0433 }
            r3.close()     // Catch:{ IOException -> 0x0708 }
        L_0x0429:
            r2 = r0
            goto L_0x070e
        L_0x042c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x042e }
        L_0x042e:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0433 }
            throw r0     // Catch:{ all -> 0x0433 }
        L_0x0433:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0435 }
        L_0x0435:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x0708 }
            throw r0     // Catch:{ IOException -> 0x0708 }
        L_0x043a:
            boolean r0 = r12 instanceof X.AnonymousClass23L     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x0473
            r3 = r12
            X.23L r3 = (X.AnonymousClass23L) r3     // Catch:{ all -> 0x072f }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x072f }
            r4.<init>()     // Catch:{ all -> 0x072f }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x046e }
            r2.<init>(r4)     // Catch:{ IOException -> 0x046e }
            android.util.JsonWriter r1 = r2.beginObject()     // Catch:{ all -> 0x0464 }
            java.lang.String r0 = "security_notification_enabled"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ all -> 0x0464 }
            boolean r0 = r3.A00     // Catch:{ all -> 0x0464 }
            android.util.JsonWriter r0 = r1.value(r0)     // Catch:{ all -> 0x0464 }
            r0.endObject()     // Catch:{ all -> 0x0464 }
            r2.close()     // Catch:{ IOException -> 0x046e }
            goto L_0x0637
        L_0x0464:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0469 }
            goto L_0x046d
        L_0x0469:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x046e }
        L_0x046d:
            throw r1     // Catch:{ IOException -> 0x046e }
        L_0x046e:
            r1 = move-exception
            java.lang.String r0 = "FMessageInitialSecurityNotificationSettingSync/writeData failed"
            goto L_0x0703
        L_0x0473:
            boolean r0 = r12 instanceof X.AnonymousClass23J     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x05f8
            r3 = r12
            X.23J r3 = (X.AnonymousClass23J) r3     // Catch:{ all -> 0x072f }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x072f }
            r4.<init>()     // Catch:{ all -> 0x072f }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x05f3 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x05f3 }
            r2.beginObject()     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x05e9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05e9 }
            if (r0 != 0) goto L_0x049a
            java.lang.String r0 = "direct_path"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x05e9 }
            r1.value(r0)     // Catch:{ all -> 0x05e9 }
        L_0x049a:
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x05e9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05e9 }
            if (r0 != 0) goto L_0x04ad
            java.lang.String r0 = "media_hash"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x05e9 }
            r1.value(r0)     // Catch:{ all -> 0x05e9 }
        L_0x04ad:
            java.lang.String r0 = r3.A0E     // Catch:{ all -> 0x05e9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05e9 }
            if (r0 != 0) goto L_0x04c0
            java.lang.String r0 = "enc_media_hash"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = r3.A0E     // Catch:{ all -> 0x05e9 }
            r1.value(r0)     // Catch:{ all -> 0x05e9 }
        L_0x04c0:
            java.lang.String r0 = r3.A0G     // Catch:{ all -> 0x05e9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05e9 }
            if (r0 != 0) goto L_0x04d3
            java.lang.String r0 = "original-msg-id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = r3.A0G     // Catch:{ all -> 0x05e9 }
            r1.value(r0)     // Catch:{ all -> 0x05e9 }
        L_0x04d3:
            java.lang.String r0 = r3.A0J     // Catch:{ all -> 0x05e9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05e9 }
            if (r0 != 0) goto L_0x04e7
            java.lang.String r0 = "session_id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = r3.A0J     // Catch:{ all -> 0x05e9 }
            r1.value(r0)     // Catch:{ all -> 0x05e9 }
        L_0x04e7:
            java.lang.String r0 = r3.A0I     // Catch:{ all -> 0x05e9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05e9 }
            if (r0 != 0) goto L_0x04fa
            java.lang.String r0 = "reg_attempt_id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = r3.A0I     // Catch:{ all -> 0x05e9 }
            r1.value(r0)     // Catch:{ all -> 0x05e9 }
        L_0x04fa:
            java.lang.String r0 = r3.A0H     // Catch:{ all -> 0x05e9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05e9 }
            if (r0 != 0) goto L_0x050d
            java.lang.String r0 = "peer_data_request_session_id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = r3.A0H     // Catch:{ all -> 0x05e9 }
            r1.value(r0)     // Catch:{ all -> 0x05e9 }
        L_0x050d:
            java.lang.String r0 = r3.A0D     // Catch:{ all -> 0x05e9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05e9 }
            if (r0 != 0) goto L_0x0520
            java.lang.String r0 = "full_on_demand_request_id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = r3.A0D     // Catch:{ all -> 0x05e9 }
            r1.value(r0)     // Catch:{ all -> 0x05e9 }
        L_0x0520:
            java.lang.String r0 = r3.A0C     // Catch:{ all -> 0x05e9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05e9 }
            if (r0 != 0) goto L_0x0533
            java.lang.String r0 = "enc_handle"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = r3.A0C     // Catch:{ all -> 0x05e9 }
            r1.value(r0)     // Catch:{ all -> 0x05e9 }
        L_0x0533:
            java.lang.String r0 = "file_length"
            android.util.JsonWriter r7 = r2.name(r0)     // Catch:{ all -> 0x05e9 }
            long r0 = r3.A05     // Catch:{ all -> 0x05e9 }
            android.util.JsonWriter r1 = r7.value(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = "sync_type"
            android.util.JsonWriter r7 = r1.name(r0)     // Catch:{ all -> 0x05e9 }
            int r0 = r3.A03     // Catch:{ all -> 0x05e9 }
            long r0 = (long) r0     // Catch:{ all -> 0x05e9 }
            android.util.JsonWriter r1 = r7.value(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = "chunk_order"
            android.util.JsonWriter r7 = r1.name(r0)     // Catch:{ all -> 0x05e9 }
            int r0 = r3.A00     // Catch:{ all -> 0x05e9 }
            long r0 = (long) r0     // Catch:{ all -> 0x05e9 }
            android.util.JsonWriter r1 = r7.value(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = "progress"
            android.util.JsonWriter r7 = r1.name(r0)     // Catch:{ all -> 0x05e9 }
            int r0 = r3.A01     // Catch:{ all -> 0x05e9 }
            long r0 = (long) r0     // Catch:{ all -> 0x05e9 }
            android.util.JsonWriter r1 = r7.value(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = "retries"
            android.util.JsonWriter r7 = r1.name(r0)     // Catch:{ all -> 0x05e9 }
            int r0 = r3.A02     // Catch:{ all -> 0x05e9 }
            long r0 = (long) r0     // Catch:{ all -> 0x05e9 }
            android.util.JsonWriter r1 = r7.value(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = "latest_msg_id"
            android.util.JsonWriter r7 = r1.name(r0)     // Catch:{ all -> 0x05e9 }
            long r0 = r3.A06     // Catch:{ all -> 0x05e9 }
            android.util.JsonWriter r1 = r7.value(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = "oldest_msg_id"
            android.util.JsonWriter r7 = r1.name(r0)     // Catch:{ all -> 0x05e9 }
            long r0 = r3.A08     // Catch:{ all -> 0x05e9 }
            android.util.JsonWriter r1 = r7.value(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = "oldest_msg_id_to_sync"
            android.util.JsonWriter r7 = r1.name(r0)     // Catch:{ all -> 0x05e9 }
            long r0 = r3.A09     // Catch:{ all -> 0x05e9 }
            android.util.JsonWriter r1 = r7.value(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = "chats_count"
            android.util.JsonWriter r7 = r1.name(r0)     // Catch:{ all -> 0x05e9 }
            long r0 = r3.A04     // Catch:{ all -> 0x05e9 }
            android.util.JsonWriter r1 = r7.value(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = "messages_count"
            android.util.JsonWriter r7 = r1.name(r0)     // Catch:{ all -> 0x05e9 }
            long r0 = r3.A07     // Catch:{ all -> 0x05e9 }
            android.util.JsonWriter r1 = r7.value(r0)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = "oldest_msg_to_sync_timestamp"
            android.util.JsonWriter r7 = r1.name(r0)     // Catch:{ all -> 0x05e9 }
            long r0 = r3.A0A     // Catch:{ all -> 0x05e9 }
            r7.value(r0)     // Catch:{ all -> 0x05e9 }
            byte[] r0 = r3.A0L     // Catch:{ all -> 0x05e9 }
            r7 = 2
            if (r0 == 0) goto L_0x05cd
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r7)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = "key_data"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x05e9 }
            r0.value(r1)     // Catch:{ all -> 0x05e9 }
        L_0x05cd:
            byte[] r0 = r3.A0K     // Catch:{ all -> 0x05e9 }
            if (r0 == 0) goto L_0x05de
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r7)     // Catch:{ all -> 0x05e9 }
            java.lang.String r0 = "inline_payload"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x05e9 }
            r0.value(r1)     // Catch:{ all -> 0x05e9 }
        L_0x05de:
            r2.endObject()     // Catch:{ all -> 0x05e9 }
            r2.flush()     // Catch:{ all -> 0x05e9 }
            r2.close()     // Catch:{ IOException -> 0x05f3 }
            goto L_0x06ed
        L_0x05e9:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x05ee }
            goto L_0x05f2
        L_0x05ee:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x05f3 }
        L_0x05f2:
            throw r1     // Catch:{ IOException -> 0x05f3 }
        L_0x05f3:
            r1 = move-exception
            java.lang.String r0 = "FMessageHistorySyncNotification/writeData failed"
            goto L_0x0703
        L_0x05f8:
            boolean r0 = r12 instanceof X.AnonymousClass23F     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x064c
            r3 = r12
            X.23F r3 = (X.AnonymousClass23F) r3     // Catch:{ all -> 0x072f }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x072f }
            r4.<init>()     // Catch:{ all -> 0x072f }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0647 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0647 }
            r2.beginObject()     // Catch:{ all -> 0x063d }
            X.2B3 r0 = r3.A00     // Catch:{ all -> 0x063d }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x063d }
            byte[] r1 = r0.A0M()     // Catch:{ all -> 0x063d }
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x063d }
            java.lang.String r0 = "appStateSyncKeyShareProtoString"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x063d }
            r0.value(r1)     // Catch:{ all -> 0x063d }
            java.lang.String r0 = "isNewlyGeneratedKey"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x063d }
            boolean r0 = r3.A01     // Catch:{ all -> 0x063d }
            r1.value(r0)     // Catch:{ all -> 0x063d }
            r2.endObject()     // Catch:{ all -> 0x063d }
            r2.flush()     // Catch:{ all -> 0x063d }
            r2.close()     // Catch:{ IOException -> 0x0647 }
        L_0x0637:
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x072f }
            goto L_0x070e
        L_0x063d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0642 }
            goto L_0x0646
        L_0x0642:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0647 }
        L_0x0646:
            throw r1     // Catch:{ IOException -> 0x0647 }
        L_0x0647:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyShare/writeData failed"
            goto L_0x0703
        L_0x064c:
            boolean r0 = r12 instanceof X.AnonymousClass23D     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x06a7
            r1 = r12
            X.23D r1 = (X.AnonymousClass23D) r1     // Catch:{ all -> 0x072f }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x072f }
            r4.<init>()     // Catch:{ all -> 0x072f }
            android.util.JsonWriter r3 = new android.util.JsonWriter     // Catch:{ IOException -> 0x06a3 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x06a3 }
            r3.beginObject()     // Catch:{ all -> 0x0699 }
            java.lang.String r0 = "key-ids"
            android.util.JsonWriter r0 = r3.name(r0)     // Catch:{ all -> 0x0699 }
            r0.beginArray()     // Catch:{ all -> 0x0699 }
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x0699 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0699 }
        L_0x066f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0699 }
            if (r0 == 0) goto L_0x068c
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0699 }
            X.A2n r0 = (X.C19999A2n) r0     // Catch:{ all -> 0x0699 }
            X.8XX r0 = r0.A01()     // Catch:{ all -> 0x0699 }
            byte[] r1 = r0.A0M()     // Catch:{ all -> 0x0699 }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0699 }
            r3.value(r0)     // Catch:{ all -> 0x0699 }
            goto L_0x066f
        L_0x068c:
            r3.endArray()     // Catch:{ all -> 0x0699 }
            r3.endObject()     // Catch:{ all -> 0x0699 }
            r3.flush()     // Catch:{ all -> 0x0699 }
            r3.close()     // Catch:{ IOException -> 0x06a3 }
            goto L_0x06ed
        L_0x0699:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x069e }
            goto L_0x06a2
        L_0x069e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x06a3 }
        L_0x06a2:
            throw r1     // Catch:{ IOException -> 0x06a3 }
        L_0x06a3:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyRequest/writeData failed"
            goto L_0x0703
        L_0x06a7:
            r7 = r12
            X.23H r7 = (X.AnonymousClass23H) r7     // Catch:{ all -> 0x072f }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x072f }
            r4.<init>()     // Catch:{ all -> 0x072f }
            android.util.JsonWriter r3 = new android.util.JsonWriter     // Catch:{ IOException -> 0x06fc }
            r3.<init>(r4)     // Catch:{ IOException -> 0x06fc }
            r3.beginObject()     // Catch:{ all -> 0x06f2 }
            java.lang.String r0 = "collection_names"
            android.util.JsonWriter r0 = r3.name(r0)     // Catch:{ all -> 0x06f2 }
            r0.beginArray()     // Catch:{ all -> 0x06f2 }
            java.util.Set r0 = r7.A01     // Catch:{ all -> 0x06f2 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x06f2 }
        L_0x06c6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x06f2 }
            if (r0 == 0) goto L_0x06d8
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x06f2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x06f2 }
            if (r0 == 0) goto L_0x06c6
            r3.value(r0)     // Catch:{ all -> 0x06f2 }
            goto L_0x06c6
        L_0x06d8:
            r3.endArray()     // Catch:{ all -> 0x06f2 }
            android.util.JsonWriter r2 = r3.name(r2)     // Catch:{ all -> 0x06f2 }
            long r0 = r7.A00     // Catch:{ all -> 0x06f2 }
            r2.value(r0)     // Catch:{ all -> 0x06f2 }
            r3.endObject()     // Catch:{ all -> 0x06f2 }
            r3.flush()     // Catch:{ all -> 0x06f2 }
            r3.close()     // Catch:{ IOException -> 0x06fc }
        L_0x06ed:
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x072f }
            goto L_0x070e
        L_0x06f2:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x06f7 }
            goto L_0x06fb
        L_0x06f7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x06fc }
        L_0x06fb:
            throw r1     // Catch:{ IOException -> 0x06fc }
        L_0x06fc:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateFatalExceptionNotification/writeData failed"
            goto L_0x0703
        L_0x0700:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataOperationRequest/writeData failed"
        L_0x0703:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x072f }
            r2 = 0
            goto L_0x070e
        L_0x0708:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataCompanionMetaNonceResponse/writeData failed"
            X.C31081ez.A03(r0, r1)     // Catch:{ all -> 0x072f }
        L_0x070e:
            r5.put(r6, r2)     // Catch:{ all -> 0x072f }
            java.lang.String r1 = "acked"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x072f }
            r5.put(r1, r0)     // Catch:{ all -> 0x072f }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x072f }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x072f }
            java.lang.String r1 = "peer_messages"
            java.lang.String r0 = "PeerMessagesTable.ADD_MESSAGE"
            long r0 = r2.A05(r1, r0, r5)     // Catch:{ all -> 0x072f }
            r12.A0x = r0     // Catch:{ all -> 0x072f }
            long r0 = r12.A0x     // Catch:{ all -> 0x072f }
            r8.close()
            return r0
        L_0x072f:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0734 }
            throw r1
        L_0x0734:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26391Ry.A01(X.231):long");
    }

    public AnonymousClass231 A02(long j) {
        Cursor A0A;
        C17960vV.A01();
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE _id = ?", "PeerMessagesTable.SELECT_MESSAGE_BY_ID", new String[]{String.valueOf(j)});
            if (!A0A.moveToNext()) {
                A0A.close();
                A05.close();
                return null;
            }
            AnonymousClass231 A002 = A00(A0A);
            A0A.close();
            A05.close();
            return A002;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public ArrayList A04(int i) {
        Cursor A0A;
        C17960vV.A01();
        ArrayList arrayList = new ArrayList();
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE message_type = ? ", "PeerMessagesTable.SELECT_MESSAGES_BY_MESSAGE_TYPE", new String[]{String.valueOf(i)});
            while (A0A.moveToNext()) {
                AnonymousClass231 A002 = A00(A0A);
                if (A002 != null) {
                    arrayList.add(A002);
                }
            }
            A0A.close();
            A05.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A05(long j) {
        C17960vV.A01();
        A07(Collections.singletonList(Long.valueOf(j)));
    }

    public void A06(DeviceJid deviceJid) {
        C17960vV.A01();
        C28791au A06 = this.A00.A06();
        try {
            ((C28801av) A06).A02.A04("peer_messages", "device_id = ?", "PeerMessagesStore.deletePeerMessages", new String[]{deviceJid.getRawString()});
            A06.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A07(List list) {
        C41851xA BD0;
        if (list.size() != 0) {
            list.size();
            C17960vV.A01();
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = String.valueOf(list.get(i));
            }
            C443423b r1 = new C443423b(strArr, 975);
            C28791au A06 = this.A00.A06();
            try {
                BD0 = A06.BD0();
                Iterator it = r1.iterator();
                while (it.hasNext()) {
                    String[] strArr2 = (String[]) it.next();
                    C23141Ev r3 = ((C28801av) A06).A02;
                    int length = strArr2.length;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DELETE FROM peer_messages WHERE _id IN ( ");
                    sb.append(TextUtils.join(",", Collections.nCopies(length, "?")));
                    sb.append(" )");
                    r3.A0F(sb.toString(), "PeerMessagesStore.deletePeerMessageById", strArr2);
                }
                BD0.A00();
                BD0.close();
                A06.close();
                return;
            } catch (Throwable th) {
                try {
                    A06.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
