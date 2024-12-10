package X;

import android.database.Cursor;
import com.whatsapp.InteractiveAnnotation;
import java.io.File;
import java.util.LinkedList;

/* renamed from: X.1Nt  reason: invalid class name and case insensitive filesystem */
public class C25321Nt {
    public final AnonymousClass1L7 A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1Cd A02;
    public final C18030ve A03;
    public final C25311Ns A04;
    public final AnonymousClass1DL A05;
    public final C24621La A06;

    public static D3j A00(C25321Nt r13, AnonymousClass1BI r14) {
        String str;
        Throwable th;
        long j;
        long j2;
        String string;
        File A07;
        D3j d3j = new D3j();
        long j3 = Long.MIN_VALUE;
        while (true) {
            long j4 = j3 + 1;
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/messages ");
            sb.append(r14);
            AnonymousClass1Ez r2 = new AnonymousClass1Ez(sb.toString());
            String[] strArr = {String.valueOf(r13.A01.A09(r14)), String.valueOf(j4), String.valueOf(3000)};
            if (C18020vd.A05(C18040vf.A02, r13.A03, 6261)) {
                str = "SELECT _id, starred, sort_id, message_type,  message_media.file_size AS file_size,  message_media.file_path AS file_path FROM message_media AS message_media JOIN available_message_view AS message WHERE message_media.message_row_id = message._id AND message.message_type != 7 AND message.chat_row_id = ? AND sort_id >= ? ORDER BY sort_id ASC LIMIT ?";
            } else {
                str = "SELECT _id, starred, sort_id, message_type,  message_media.file_size AS file_size,  message_media.file_path AS file_path FROM message_media AS message_media JOIN available_message_view AS message ON message_media.message_row_id = message._id WHERE message.message_type != 7 AND message.chat_row_id = ? AND sort_id >= ? ORDER BY sort_id ASC LIMIT ?";
            }
            C28781at A042 = r13.A02.get();
            try {
                Cursor A0A = ((C28801av) A042).A02.A0A(str, "GET_N_MEDIA_MESSAGES_FOR_JID_STORAGE_USAGE", strArr);
                if (A0A.moveToLast()) {
                    j = A0A.getLong(A0A.getColumnIndexOrThrow("_id"));
                    j2 = A0A.getLong(A0A.getColumnIndexOrThrow("sort_id"));
                } else {
                    j = 1;
                    j2 = Long.MIN_VALUE;
                }
                A0A.moveToFirst();
                A042.close();
                r2.A02();
                C54242dp r5 = new C54242dp(A0A, j, j2);
                long j5 = r5.A02;
                Cursor cursor = r5.A00;
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        break;
                    }
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow("message_type");
                    do {
                        int i = cursor.getInt(columnIndexOrThrow);
                        d3j.A06++;
                        long j6 = 0;
                        if (AnonymousClass25A.A0H(i) && (string = cursor.getString(cursor.getColumnIndexOrThrow("file_path"))) != null && (A07 = r13.A00.A07(new File(string))) != null && A07.canRead()) {
                            j6 = A07.length();
                        }
                        if (i == 0) {
                            d3j.A09++;
                        } else if (i == 1) {
                            d3j.A04++;
                            d3j.A0E += j6;
                        } else if (i == 2) {
                            d3j.A00++;
                            d3j.A0B += j6;
                        } else if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i == 9) {
                                        d3j.A02++;
                                        d3j.A0C += j6;
                                    } else if (i != 16) {
                                        if (i == 20) {
                                            d3j.A08++;
                                            d3j.A0G += j6;
                                        } else if (i == 81) {
                                            d3j.A07++;
                                            d3j.A0F += j6;
                                        } else if (i == 13) {
                                            d3j.A03++;
                                            d3j.A0D += j6;
                                        } else if (i != 14) {
                                        }
                                    }
                                }
                                d3j.A05++;
                            }
                            d3j.A01++;
                        } else {
                            d3j.A0A++;
                            d3j.A0H += j6;
                        }
                    } while (cursor.moveToNext());
                    cursor.close();
                    if (j4 == j5) {
                        break;
                    }
                    j3 = j5;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                A042.close();
                throw th;
            }
        }
        d3j.A06 = d3j.A03 + d3j.A09 + d3j.A00 + d3j.A04 + d3j.A0A + d3j.A07 + d3j.A01 + d3j.A02 + d3j.A05 + d3j.A08;
        d3j.A0I = d3j.A0D + d3j.A0B + d3j.A0E + d3j.A0H + d3j.A0F + d3j.A0C + d3j.A0G;
        return d3j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: com.whatsapp.SerializablePoint[]} */
    /* JADX WARNING: type inference failed for: r9v1, types: [com.whatsapp.InteractiveAnnotation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v2, types: [com.whatsapp.InteractiveAnnotation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v3, types: [com.whatsapp.InteractiveAnnotation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v16, types: [com.whatsapp.SerializableLocation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v5, types: [com.whatsapp.InteractiveAnnotation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v21, types: [com.whatsapp.SerializablePoint, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.InteractiveAnnotation A01(android.database.Cursor r21, X.C28781at r22) {
        /*
            r20 = this;
            r2 = r22
            java.lang.String r1 = "_id"
            r9 = r21
            int r0 = r9.getColumnIndexOrThrow(r1)
            long r5 = r9.getLong(r0)
            X.1av r2 = (X.C28801av) r2
            X.1Ev r4 = r2.A02
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = java.lang.Long.toString(r5)
            r6 = 0
            r3[r6] = r0
            java.lang.String r2 = "GET_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_VERTEX_SQL"
            java.lang.String r0 = "SELECT message_media_interactive_annotation_row_id, x, y, sort_order FROM message_media_interactive_annotation_vertex WHERE message_media_interactive_annotation_row_id = ? ORDER BY sort_order"
            android.database.Cursor r7 = r4.A0A(r0, r2, r3)
            int r0 = r7.getCount()     // Catch:{ all -> 0x01a8 }
            com.whatsapp.SerializablePoint[] r8 = new com.whatsapp.SerializablePoint[r0]     // Catch:{ all -> 0x01a8 }
            r10 = 0
        L_0x002b:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x01a8 }
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "x"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01a8 }
            double r4 = r7.getDouble(r0)     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = "y"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01a8 }
            double r2 = r7.getDouble(r0)     // Catch:{ all -> 0x01a8 }
            com.whatsapp.SerializablePoint r0 = new com.whatsapp.SerializablePoint     // Catch:{ all -> 0x01a8 }
            r0.<init>()     // Catch:{ all -> 0x01a8 }
            r0.x = r4     // Catch:{ all -> 0x01a8 }
            r0.y = r2     // Catch:{ all -> 0x01a8 }
            r8[r10] = r0     // Catch:{ all -> 0x01a8 }
            int r10 = r10 + 1
            goto L_0x002b
        L_0x0055:
            r7.close()
            java.lang.String r0 = "child_message_row_id"
            int r0 = r9.getColumnIndexOrThrow(r0)
            r2 = -1
            long r18 = X.AnonymousClass1Eu.A02(r9, r0, r2)
            java.lang.String r0 = "skip_confirmation"
            int r0 = r9.getColumnIndexOrThrow(r0)
            boolean r7 = X.AnonymousClass1Eu.A06(r9, r0)
            java.lang.String r0 = "fp_interactive_annotation"
            int r0 = r9.getColumnIndexOrThrow(r0)
            byte[] r5 = r9.getBlob(r0)
            int r0 = r9.getColumnIndexOrThrow(r1)
            long r0 = X.AnonymousClass1Eu.A02(r9, r0, r2)
            java.lang.String r4 = "message_row_id"
            int r4 = r9.getColumnIndexOrThrow(r4)
            long r10 = X.AnonymousClass1Eu.A02(r9, r4, r2)
            java.lang.String r2 = "sort_order"
            int r2 = r9.getColumnIndexOrThrow(r2)
            int r12 = X.AnonymousClass1Eu.A00(r9, r2, r6)
            java.lang.String r2 = "type"
            int r3 = r9.getColumnIndexOrThrow(r2)
            X.2Qq r6 = X.C49482Qq.UNKNOWN
            int r2 = r6.value
            int r3 = X.AnonymousClass1Eu.A00(r9, r3, r2)
            r2 = 1
            if (r3 != r2) goto L_0x0199
            X.2Qq r6 = X.C49482Qq.MUSIC
        L_0x00aa:
            java.lang.String r13 = "location_name"
            int r2 = r9.getColumnIndexOrThrow(r13)
            java.lang.String r2 = r9.getString(r2)
            r17 = 0
            if (r2 == 0) goto L_0x00ba
            r17 = 1
        L_0x00ba:
            java.lang.String r3 = "newsletter_jid_row_id"
            int r2 = r9.getColumnIndexOrThrow(r3)
            int r2 = r9.getInt(r2)
            r16 = 0
            if (r2 == 0) goto L_0x00ca
            r16 = 1
        L_0x00ca:
            r14 = 1
            r4 = 0
            int r2 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x00ee
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            X.97M r2 = new X.97M
            r2.<init>(r4, r3)
            com.whatsapp.InteractiveAnnotation r9 = new com.whatsapp.InteractiveAnnotation
            r9.<init>()
            r9.interactiveAnnotationId = r0
            r9.polygonVertices = r8
            r9.skipConfirmation = r7
            r9.data = r2
        L_0x00e7:
            r9.messageRowId = r10
            r9.sortOrder = r12
            r9.type = r6
            return r9
        L_0x00ee:
            if (r17 == 0) goto L_0x0125
            java.lang.String r2 = "location_latitude"
            int r2 = r9.getColumnIndexOrThrow(r2)
            double r4 = r9.getDouble(r2)
            java.lang.String r2 = "location_longitude"
            int r2 = r9.getColumnIndexOrThrow(r2)
            double r2 = r9.getDouble(r2)
            int r13 = r9.getColumnIndexOrThrow(r13)
            java.lang.String r13 = r9.getString(r13)
            com.whatsapp.InteractiveAnnotation r9 = new com.whatsapp.InteractiveAnnotation
            r9.<init>()
            r9.interactiveAnnotationId = r0
            r9.polygonVertices = r8
            r9.skipConfirmation = r7
            com.whatsapp.SerializableLocation r0 = new com.whatsapp.SerializableLocation
            r0.<init>()
            r0.latitude = r4
            r0.longitude = r2
            r0.name = r13
            r9.data = r0
            goto L_0x00e7
        L_0x0125:
            if (r16 == 0) goto L_0x0186
            int r2 = r9.getColumnIndexOrThrow(r3)
            int r2 = r9.getInt(r2)
            java.lang.String r3 = "newsletter_server_message_id"
            int r3 = r9.getColumnIndexOrThrow(r3)
            int r18 = r9.getInt(r3)
            java.lang.String r3 = "newsletter_name"
            int r3 = r9.getColumnIndexOrThrow(r3)
            java.lang.String r16 = r9.getString(r3)
            java.lang.String r3 = "newsletter_content_type"
            int r3 = r9.getColumnIndexOrThrow(r3)
            int r3 = r9.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            X.9Id r15 = X.AnonymousClass9RX.A00(r3)
            java.lang.String r3 = "newsletter_accessibility_text"
            int r3 = r9.getColumnIndexOrThrow(r3)
            java.lang.String r17 = r9.getString(r3)
            r3 = r20
            X.1DL r5 = r3.A05
            long r2 = (long) r2
            com.whatsapp.jid.Jid r14 = r5.A0B(r2)
            android.os.Parcelable$Creator r2 = X.C29681ch.CREATOR
            boolean r2 = r14 instanceof X.C29681ch
            if (r2 == 0) goto L_0x01a7
            X.1ch r14 = (X.C29681ch) r14
            if (r14 == 0) goto L_0x01a7
            com.whatsapp.InteractiveAnnotation r9 = new com.whatsapp.InteractiveAnnotation
            r9.<init>()
            r9.interactiveAnnotationId = r0
            r9.polygonVertices = r8
            r9.skipConfirmation = r7
            X.Ac1 r13 = new X.Ac1
            r13.<init>(r14, r15, r16, r17, r18)
            r9.data = r13
            goto L_0x00e7
        L_0x0186:
            if (r5 == 0) goto L_0x01a7
            com.whatsapp.InteractiveAnnotation r9 = new com.whatsapp.InteractiveAnnotation
            r9.<init>()
            r9.interactiveAnnotationId = r0
            r9.polygonVertices = r8
            r9.data = r5
            X.2Qq r0 = X.C49482Qq.FUTURE_PROOF
            r9.type = r0
            goto L_0x00e7
        L_0x0199:
            r2 = 2
            if (r3 != r2) goto L_0x01a0
            X.2Qq r6 = X.C49482Qq.LINKCLICK
            goto L_0x00aa
        L_0x01a0:
            r2 = 3
            if (r3 != r2) goto L_0x00aa
            X.2Qq r6 = X.C49482Qq.FUTURE_PROOF
            goto L_0x00aa
        L_0x01a7:
            return r4
        L_0x01a8:
            r1 = move-exception
            if (r7 == 0) goto L_0x01b3
            r7.close()     // Catch:{ all -> 0x01af }
            throw r1
        L_0x01af:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x01b3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25321Nt.A01(android.database.Cursor, X.1at):com.whatsapp.InteractiveAnnotation");
    }

    public C62572rc A02(Cursor cursor) {
        File file;
        C62572rc r2 = new C62572rc();
        r2.A0Q = AnonymousClass1Eu.A06(cursor, cursor.getColumnIndexOrThrow("autotransfer_retry_enabled"));
        r2.A0L = cursor.getString(cursor.getColumnIndexOrThrow("media_job_uuid"));
        r2.A0V = AnonymousClass1Eu.A06(cursor, cursor.getColumnIndexOrThrow("transferred"));
        r2.A0U = AnonymousClass1Eu.A06(cursor, cursor.getColumnIndexOrThrow("transcoded"));
        r2.A0A = cursor.getLong(cursor.getColumnIndexOrThrow("file_size"));
        r2.A07 = cursor.getInt(cursor.getColumnIndexOrThrow("suspicious_content"));
        r2.A0D = cursor.getLong(cursor.getColumnIndexOrThrow("trim_from"));
        r2.A0E = cursor.getLong(cursor.getColumnIndexOrThrow("trim_to"));
        r2.A02 = cursor.getInt(cursor.getColumnIndexOrThrow("face_x"));
        r2.A03 = cursor.getInt(cursor.getColumnIndexOrThrow("face_y"));
        r2.A0a = cursor.getBlob(cursor.getColumnIndexOrThrow("media_key"));
        r2.A0B = cursor.getLong(cursor.getColumnIndexOrThrow("media_key_timestamp"));
        r2.A08 = cursor.getInt(cursor.getColumnIndexOrThrow("width"));
        r2.A06 = cursor.getInt(cursor.getColumnIndexOrThrow("height"));
        r2.A0R = AnonymousClass1Eu.A06(cursor, cursor.getColumnIndexOrThrow("has_streaming_sidecar"));
        r2.A05 = cursor.getInt(cursor.getColumnIndexOrThrow("gif_attribution"));
        r2.A00 = cursor.getFloat(cursor.getColumnIndexOrThrow("thumbnail_height_width_ratio"));
        r2.A0J = cursor.getString(cursor.getColumnIndexOrThrow("direct_path"));
        r2.A0X = cursor.getBlob(cursor.getColumnIndexOrThrow("first_scan_sidecar"));
        r2.A04 = cursor.getInt(cursor.getColumnIndexOrThrow("first_scan_length"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("file_path"));
        r2.A0O = cursor.getString(cursor.getColumnIndexOrThrow("partial_media_hash"));
        r2.A0N = cursor.getString(cursor.getColumnIndexOrThrow("partial_media_enc_hash"));
        r2.A0M = cursor.getString(cursor.getColumnIndexOrThrow("media_upload_handle"));
        r2.A0T = AnonymousClass1Eu.A06(cursor, cursor.getColumnIndexOrThrow("mute_video"));
        if (string == null) {
            file = null;
        } else {
            file = new File(string);
        }
        r2.A0G = this.A00.A07(file);
        r2.A0P = cursor.getString(cursor.getColumnIndexOrThrow("raw_transcription_text"));
        return r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(com.whatsapp.InteractiveAnnotation r14, X.C28791au r15, int r16, long r17) {
        /*
            r13 = this;
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            r4.put(r1, r0)
            java.lang.String r1 = "skip_confirmation"
            boolean r0 = r14.skipConfirmation
            X.C63432t4.A02(r4, r1, r0)
            java.lang.Object r3 = r14.data
            boolean r0 = r3 instanceof com.whatsapp.SerializableLocation
            r2 = 0
            if (r0 == 0) goto L_0x0123
            com.whatsapp.SerializableLocation r3 = (com.whatsapp.SerializableLocation) r3
            double r0 = r3.latitude
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "location_latitude"
            r4.put(r0, r1)
            double r0 = r3.longitude
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "location_longitude"
            r4.put(r0, r1)
            java.lang.String r1 = "location_name"
            java.lang.String r0 = r3.name
        L_0x0039:
            r4.put(r1, r0)
        L_0x003c:
            X.2Qq r0 = r14.type
            if (r0 == 0) goto L_0x005b
            int r0 = r0.value
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "type"
            r4.put(r0, r1)
            X.2Qq r1 = r14.type
            X.2Qq r0 = X.C49482Qq.FUTURE_PROOF
            if (r1 != r0) goto L_0x005b
            java.lang.Object r1 = r14.data
            byte[] r1 = (byte[]) r1
            java.lang.String r0 = "fp_interactive_annotation"
            r4.put(r0, r1)
        L_0x005b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.String r7 = "sort_order"
            r4.put(r7, r0)
            X.1av r15 = (X.C28801av) r15
            X.1Ev r8 = r15.A02
            r6 = 5
            java.lang.String r1 = "INSERT_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_SQL"
            java.lang.String r0 = "message_media_interactive_annotation"
            long r3 = r8.A09(r0, r1, r4, r6)
            r14.interactiveAnnotationId = r3
            java.lang.Object r9 = r14.data
            boolean r0 = r9 instanceof X.AnonymousClass77U
            if (r0 == 0) goto L_0x00e0
            X.77U r9 = (X.AnonymousClass77U) r9
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r1 = "message_media_interactive_annotation_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.put(r1, r0)
            java.lang.String r1 = "music_content_media_id"
            java.lang.String r0 = r9.A03
            r5.put(r1, r0)
            java.lang.String r1 = "song_id"
            java.lang.String r0 = r9.A04
            r5.put(r1, r0)
            java.lang.String r1 = "author"
            java.lang.String r0 = r9.A02
            r5.put(r1, r0)
            java.lang.String r1 = "title"
            java.lang.String r0 = r9.A05
            r5.put(r1, r0)
            java.lang.String r1 = "artwork_direct_path"
            java.lang.String r0 = r9.A01
            r5.put(r1, r0)
            java.lang.String r1 = "artwork_sha256"
            byte[] r0 = r9.A09
            X.C63432t4.A03(r5, r1, r0)
            java.lang.String r1 = "artwork_enc_sha256"
            byte[] r0 = r9.A07
            X.C63432t4.A03(r5, r1, r0)
            java.lang.String r1 = "artwork_media_key"
            byte[] r0 = r9.A08
            X.C63432t4.A03(r5, r1, r0)
            java.lang.String r1 = "artist_attribution"
            java.lang.String r0 = r9.A00
            r5.put(r1, r0)
            java.lang.String r1 = "country_blocklist"
            byte[] r0 = r9.A0A
            X.C63432t4.A03(r5, r1, r0)
            java.lang.String r1 = "is_explicit"
            boolean r0 = r9.A06
            X.C63432t4.A02(r5, r1, r0)
            java.lang.String r1 = "INSERT_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_EMBEDDED_MUSIC"
            java.lang.String r0 = "message_media_interactive_annotation_embedded_music"
            r8.A05(r0, r1, r5)
        L_0x00e0:
            com.whatsapp.SerializablePoint[] r10 = r14.polygonVertices
            if (r10 == 0) goto L_0x0163
            int r9 = r10.length
            r12 = 0
        L_0x00e6:
            if (r2 >= r9) goto L_0x0163
            r11 = r10[r2]
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r1 = "message_media_interactive_annotation_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.put(r1, r0)
            double r0 = r11.x
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "x"
            r5.put(r0, r1)
            double r0 = r11.y
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "y"
            r5.put(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r5.put(r7, r0)
            java.lang.String r1 = "INSERT_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_VERTEX_SQL"
            java.lang.String r0 = "message_media_interactive_annotation_vertex"
            r8.A09(r0, r1, r5, r6)
            int r12 = r12 + 1
            int r2 = r2 + 1
            goto L_0x00e6
        L_0x0123:
            boolean r0 = r3 instanceof X.C20947Ac1
            if (r0 == 0) goto L_0x003c
            X.Ac1 r3 = (X.C20947Ac1) r3
            X.1DL r1 = r13.A05
            X.1ch r0 = r3.A01
            long r5 = r1.A09(r0)
            java.lang.String r1 = "newsletter_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r4.put(r1, r0)
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "newsletter_server_message_id"
            r4.put(r0, r1)
            java.lang.String r1 = "newsletter_name"
            java.lang.String r0 = r3.A04
            r4.put(r1, r0)
            X.9Id r0 = r3.A02
            if (r0 == 0) goto L_0x0161
            int r0 = r0.value
        L_0x0152:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "newsletter_content_type"
            r4.put(r0, r1)
            java.lang.String r1 = "newsletter_accessibility_text"
            java.lang.String r0 = r3.A03
            goto L_0x0039
        L_0x0161:
            r0 = 0
            goto L_0x0152
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25321Nt.A03(com.whatsapp.InteractiveAnnotation, X.1au, int, long):void");
    }

    public void A04(AnonymousClass206 r23) {
        C62572rc r1;
        Cursor A0A;
        AnonymousClass206 r10 = r23;
        if ((r10 instanceof AnonymousClass21V) && (r1 = ((AnonymousClass21V) r10).A02) != null) {
            LinkedList linkedList = new LinkedList();
            InteractiveAnnotation[] interactiveAnnotationArr = r1.A0b;
            if (interactiveAnnotationArr != null) {
                int length = interactiveAnnotationArr.length;
                int i = 0;
                while (i < length) {
                    InteractiveAnnotation interactiveAnnotation = interactiveAnnotationArr[i];
                    if (!(interactiveAnnotation.data instanceof AnonymousClass77U)) {
                        linkedList.add(interactiveAnnotation);
                        i++;
                    } else {
                        return;
                    }
                }
            }
            C28781at A042 = this.A02.get();
            try {
                A0A = ((C28801av) A042).A02.A0A("SELECT message_media_interactive_annotation_row_id, music_content_media_id, song_id, author, title, artwork_direct_path, artwork_sha256, artwork_enc_sha256, artwork_media_key, artist_attribution, country_blocklist, is_explicit FROM message_media_interactive_annotation_embedded_music INNER JOIN (SELECT _id FROM message_media_interactive_annotation WHERE message_row_id = ? AND type = ?) message_media_interactive_annotation ON message_media_interactive_annotation_embedded_music.message_media_interactive_annotation_row_id = message_media_interactive_annotation._id", "GET_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_EMBEDDED_MUSIC", new String[]{Long.toString(r10.A0x), Integer.toString(C49482Qq.MUSIC.value)});
                while (A0A.moveToNext()) {
                    linkedList.add(new InteractiveAnnotation(new AnonymousClass77U(A0A.getString(A0A.getColumnIndexOrThrow("music_content_media_id")), A0A.getString(A0A.getColumnIndexOrThrow("song_id")), A0A.getString(A0A.getColumnIndexOrThrow("author")), A0A.getString(A0A.getColumnIndexOrThrow("title")), A0A.getString(A0A.getColumnIndexOrThrow("artwork_direct_path")), A0A.getString(A0A.getColumnIndexOrThrow("artist_attribution")), A0A.getBlob(A0A.getColumnIndexOrThrow("artwork_sha256")), A0A.getBlob(A0A.getColumnIndexOrThrow("artwork_enc_sha256")), A0A.getBlob(A0A.getColumnIndexOrThrow("artwork_media_key")), A0A.getBlob(A0A.getColumnIndexOrThrow("country_blocklist")), AnonymousClass1Eu.A06(A0A, A0A.getColumnIndexOrThrow("is_explicit")))));
                }
                A0A.close();
                A042.close();
                r1.A0b = (InteractiveAnnotation[]) linkedList.toArray(new InteractiveAnnotation[0]);
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
        } else {
            return;
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01bc, code lost:
        if (r1 != false) goto L_0x01be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass206 r36) {
        /*
            r35 = this;
            r6 = r36
            boolean r0 = r6 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x02f3
            X.205 r5 = r6.A0v
            X.1BI r0 = r5.A00
            boolean r0 = X.C22971Dz.A0R(r0)
            if (r0 != 0) goto L_0x02f3
            long r0 = r6.A0x
            r19 = 0
            r4 = 0
            r3 = 1
            int r7 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            r2 = 0
            if (r7 <= 0) goto L_0x001c
            r2 = 1
        L_0x001c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/message must have row_id set; key="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A0G(r2, r0)
            r7 = r6
            X.21V r7 = (X.AnonymousClass21V) r7
            int r0 = r6.A0E()
            r2 = 0
            if (r0 != r3) goto L_0x003b
            r2 = 1
        L_0x003b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/message in main storage; key="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A0G(r2, r0)
            r34 = r35
            r0 = r34
            X.1Cd r0 = r0.A02
            r33 = r0
            X.1au r22 = r33.A05()
            X.1xA r21 = r22.BD0()     // Catch:{ all -> 0x02e6 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x02dc }
            r2.<init>()     // Catch:{ all -> 0x02dc }
            X.2rc r8 = r7.A02     // Catch:{ all -> 0x02dc }
            if (r8 == 0) goto L_0x0162
            X.C17960vV.A07(r8)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "autotransfer_retry_enabled"
            boolean r0 = r8.A0Q     // Catch:{ all -> 0x02dc }
            X.C63432t4.A02(r2, r1, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "media_job_uuid"
            java.lang.String r0 = r8.A0L     // Catch:{ all -> 0x02dc }
            X.C63432t4.A01(r2, r1, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "transferred"
            boolean r0 = r8.A0V     // Catch:{ all -> 0x02dc }
            X.C63432t4.A02(r2, r1, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "transcoded"
            boolean r0 = r8.A0U     // Catch:{ all -> 0x02dc }
            X.C63432t4.A02(r2, r1, r0)     // Catch:{ all -> 0x02dc }
            long r0 = r8.A0A     // Catch:{ all -> 0x02dc }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "file_size"
            r2.put(r0, r1)     // Catch:{ all -> 0x02dc }
            int r0 = r8.A07     // Catch:{ all -> 0x02dc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "suspicious_content"
            r2.put(r0, r1)     // Catch:{ all -> 0x02dc }
            long r0 = r8.A0D     // Catch:{ all -> 0x02dc }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "trim_from"
            r2.put(r0, r1)     // Catch:{ all -> 0x02dc }
            long r0 = r8.A0E     // Catch:{ all -> 0x02dc }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "trim_to"
            r2.put(r0, r1)     // Catch:{ all -> 0x02dc }
            int r0 = r8.A02     // Catch:{ all -> 0x02dc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "face_x"
            r2.put(r0, r1)     // Catch:{ all -> 0x02dc }
            int r0 = r8.A03     // Catch:{ all -> 0x02dc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "face_y"
            r2.put(r0, r1)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "media_key"
            byte[] r0 = r8.A0a     // Catch:{ all -> 0x02dc }
            X.C63432t4.A03(r2, r1, r0)     // Catch:{ all -> 0x02dc }
            long r0 = r8.A0B     // Catch:{ all -> 0x02dc }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "media_key_timestamp"
            r2.put(r0, r1)     // Catch:{ all -> 0x02dc }
            int r0 = r8.A08     // Catch:{ all -> 0x02dc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "width"
            r2.put(r0, r1)     // Catch:{ all -> 0x02dc }
            int r0 = r8.A06     // Catch:{ all -> 0x02dc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "height"
            r2.put(r0, r1)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "has_streaming_sidecar"
            boolean r0 = r8.A0R     // Catch:{ all -> 0x02dc }
            X.C63432t4.A02(r2, r1, r0)     // Catch:{ all -> 0x02dc }
            int r0 = r8.A05     // Catch:{ all -> 0x02dc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "gif_attribution"
            r2.put(r0, r1)     // Catch:{ all -> 0x02dc }
            float r0 = r8.A00     // Catch:{ all -> 0x02dc }
            java.lang.Float r1 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "thumbnail_height_width_ratio"
            r2.put(r0, r1)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "direct_path"
            java.lang.String r0 = r8.A0J     // Catch:{ all -> 0x02dc }
            X.C63432t4.A01(r2, r1, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "first_scan_sidecar"
            byte[] r0 = r8.A0X     // Catch:{ all -> 0x02dc }
            X.C63432t4.A03(r2, r1, r0)     // Catch:{ all -> 0x02dc }
            int r0 = r8.A04     // Catch:{ all -> 0x02dc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "first_scan_length"
            r2.put(r0, r1)     // Catch:{ all -> 0x02dc }
            java.io.File r9 = r8.A0G     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "file_path"
            if (r9 == 0) goto L_0x01b7
            r0 = r34
            X.1L7 r0 = r0.A00     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = r0.A09(r9)     // Catch:{ all -> 0x02dc }
            r2.put(r1, r0)     // Catch:{ all -> 0x02dc }
        L_0x013f:
            java.lang.String r1 = "partial_media_hash"
            java.lang.String r0 = r8.A0O     // Catch:{ all -> 0x02dc }
            X.C63432t4.A01(r2, r1, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "partial_media_enc_hash"
            java.lang.String r0 = r8.A0N     // Catch:{ all -> 0x02dc }
            X.C63432t4.A01(r2, r1, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "media_upload_handle"
            java.lang.String r0 = r8.A0M     // Catch:{ all -> 0x02dc }
            X.C63432t4.A01(r2, r1, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "mute_video"
            boolean r0 = r8.A0T     // Catch:{ all -> 0x02dc }
            X.C63432t4.A02(r2, r1, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "raw_transcription_text"
            java.lang.String r0 = r8.A0P     // Catch:{ all -> 0x02dc }
            X.C63432t4.A01(r2, r1, r0)     // Catch:{ all -> 0x02dc }
        L_0x0162:
            long r0 = r7.A0x     // Catch:{ all -> 0x02dc }
            r31 = r0
            r0 = r34
            X.1LW r1 = r0.A01     // Catch:{ all -> 0x02dc }
            X.205 r0 = r7.A0v     // Catch:{ all -> 0x02dc }
            X.1BI r0 = r0.A00     // Catch:{ all -> 0x02dc }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x02dc }
            long r17 = r1.A09(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = r7.A0A     // Catch:{ all -> 0x02dc }
            r30 = r0
            java.lang.String r0 = r7.A07     // Catch:{ all -> 0x02dc }
            r29 = r0
            java.lang.String r0 = r7.A06     // Catch:{ all -> 0x02dc }
            r28 = r0
            long r0 = r7.A01     // Catch:{ all -> 0x02dc }
            r26 = r0
            java.lang.String r16 = r7.A19()     // Catch:{ all -> 0x02dc }
            java.lang.String r12 = r7.A05     // Catch:{ all -> 0x02dc }
            long r0 = r7.A00     // Catch:{ all -> 0x02dc }
            r24 = r0
            boolean r0 = r7 instanceof X.C438921i     // Catch:{ all -> 0x02dc }
            r13 = 0
            if (r0 == 0) goto L_0x01b1
            r1 = r7
            X.21i r1 = (X.C438921i) r1     // Catch:{ all -> 0x02dc }
            int r0 = r1.A00     // Catch:{ all -> 0x02dc }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x02dc }
            r23 = r0
            r9 = 0
        L_0x01a2:
            java.lang.String r11 = r7.A08     // Catch:{ all -> 0x02dc }
            boolean r1 = r7 instanceof X.C441322g     // Catch:{ all -> 0x02dc }
            if (r1 == 0) goto L_0x01bb
            r0 = r7
            X.22g r0 = (X.C441322g) r0     // Catch:{ all -> 0x02dc }
            boolean r0 = r0.A03     // Catch:{ all -> 0x02dc }
            r10 = 1
            if (r0 != 0) goto L_0x01be
            goto L_0x01bb
        L_0x01b1:
            int r9 = r7.A0D     // Catch:{ all -> 0x02dc }
            r14 = r13
            r23 = r13
            goto L_0x01a2
        L_0x01b7:
            r2.putNull(r1)     // Catch:{ all -> 0x02dc }
            goto L_0x013f
        L_0x01bb:
            r10 = 0
            if (r1 == 0) goto L_0x01c3
        L_0x01be:
            r0 = r7
            X.22g r0 = (X.C441322g) r0     // Catch:{ all -> 0x02dc }
            java.lang.Integer r13 = r0.A01     // Catch:{ all -> 0x02dc }
        L_0x01c3:
            java.lang.String r8 = r7.A0B     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r31)     // Catch:{ all -> 0x02dc }
            r2.put(r1, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r15 = "chat_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x02dc }
            r2.put(r15, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r15 = "multicast_id"
            r0 = r30
            X.C63432t4.A01(r2, r15, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r15 = "message_url"
            r0 = r29
            X.C63432t4.A01(r2, r15, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r15 = "mime_type"
            r0 = r28
            X.C63432t4.A01(r2, r15, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r15 = "file_length"
            java.lang.Long r0 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x02dc }
            r2.put(r15, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r15 = "first_viewed_timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x02dc }
            r2.put(r15, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r15 = "media_name"
            r0 = r16
            X.C63432t4.A01(r2, r15, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "file_hash"
            X.C63432t4.A01(r2, r0, r12)     // Catch:{ all -> 0x02dc }
            java.lang.String r12 = "media_duration"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "page_count"
            if (r14 == 0) goto L_0x024f
            r2.put(r0, r14)     // Catch:{ all -> 0x02dc }
            r2.put(r12, r15)     // Catch:{ all -> 0x02dc }
        L_0x021a:
            java.lang.String r9 = "media_caption"
            r0 = r23
            X.C63432t4.A01(r2, r9, r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "enc_file_hash"
            X.C63432t4.A01(r2, r0, r11)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "is_animated_sticker"
            X.C63432t4.A02(r2, r0, r10)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "sticker_flags"
            r2.put(r0, r13)     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "original_file_hash"
            X.C63432t4.A01(r2, r0, r8)     // Catch:{ all -> 0x02dc }
            r0 = r22
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x02dc }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x02dc }
            java.lang.String r8 = "message_media"
            java.lang.String r0 = "INSERT_MESSAGE_MEDIA_SQL"
            long r10 = r9.A05(r8, r0, r2)     // Catch:{ all -> 0x02dc }
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a1
            long r1 = r6.A0x     // Catch:{ all -> 0x02dc }
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x025b
            goto L_0x025a
        L_0x024f:
            r2.put(r0, r15)     // Catch:{ all -> 0x02dc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x02dc }
            r2.put(r12, r0)     // Catch:{ all -> 0x02dc }
            goto L_0x021a
        L_0x025a:
            r4 = 1
        L_0x025b:
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/inserted row should have same row_id"
            X.C17960vV.A0H(r4, r0)     // Catch:{ all -> 0x02dc }
            X.2rc r1 = r7.A02     // Catch:{ all -> 0x02dc }
            long r2 = r7.A0x     // Catch:{ all -> 0x02dc }
            if (r1 == 0) goto L_0x02d5
            com.whatsapp.InteractiveAnnotation[] r0 = r1.A0b     // Catch:{ all -> 0x02dc }
            if (r0 == 0) goto L_0x02d5
            X.1au r8 = r33.A05()     // Catch:{ all -> 0x02dc }
            X.1xA r5 = r8.BD0()     // Catch:{ all -> 0x0297 }
            com.whatsapp.InteractiveAnnotation[] r4 = r1.A0b     // Catch:{ all -> 0x028d }
            int r1 = r4.length     // Catch:{ all -> 0x028d }
            r0 = 0
            r9 = 0
        L_0x0277:
            if (r0 >= r1) goto L_0x0286
            r7 = r4[r0]     // Catch:{ all -> 0x028d }
            r6 = r34
            r10 = r2
            r6.A03(r7, r8, r9, r10)     // Catch:{ all -> 0x028d }
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L_0x0277
        L_0x0286:
            r5.A00()     // Catch:{ all -> 0x028d }
            r5.close()     // Catch:{ all -> 0x0297 }
            goto L_0x02d2
        L_0x028d:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0292 }
            goto L_0x0296
        L_0x0292:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0297 }
        L_0x0296:
            throw r1     // Catch:{ all -> 0x0297 }
        L_0x0297:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x029c }
            goto L_0x02a0
        L_0x029c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x02dc }
        L_0x02a0:
            throw r1     // Catch:{ all -> 0x02dc }
        L_0x02a1:
            r2.remove(r1)     // Catch:{ all -> 0x02dc }
            java.lang.String r12 = "message_row_id = ?"
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x02dc }
            long r0 = r6.A0x     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02dc }
            r7[r4] = r0     // Catch:{ all -> 0x02dc }
            java.lang.String r13 = "UPDATE_MESSAGE_MEDIA_SQL"
            r10 = r2
            r11 = r8
            r14 = r7
            int r0 = r9.A02(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x02dc }
            if (r0 == r3) goto L_0x02d5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02dc }
            r1.<init>()     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/Failed to update message media; key="
            r1.append(r0)     // Catch:{ all -> 0x02dc }
            r1.append(r5)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02dc }
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x02dc }
            r0.<init>(r1)     // Catch:{ all -> 0x02dc }
            throw r0     // Catch:{ all -> 0x02dc }
        L_0x02d2:
            r8.close()     // Catch:{ all -> 0x02dc }
        L_0x02d5:
            r21.A00()     // Catch:{ all -> 0x02dc }
            r21.close()     // Catch:{ all -> 0x02e6 }
            goto L_0x02f0
        L_0x02dc:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x02e1 }
            goto L_0x02e5
        L_0x02e1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x02e6 }
        L_0x02e5:
            throw r1     // Catch:{ all -> 0x02e6 }
        L_0x02e6:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x02eb }
            throw r1
        L_0x02eb:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x02f0:
            r22.close()
        L_0x02f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25321Nt.A05(X.206):void");
    }

    public void A06(AnonymousClass21V r7, boolean z, boolean z2) {
        File file;
        C62572rc r0 = r7.A02;
        if (r0 != null && (file = r0.A0G) != null) {
            this.A04.A05(file, r7.A0u, 1, z | AnonymousClass25A.A10(r7), z2);
        }
    }

    public C25321Nt(C25311Ns r1, AnonymousClass1L7 r2, AnonymousClass1LW r3, AnonymousClass1DL r4, AnonymousClass1Cd r5, C24621La r6, C18030ve r7) {
        this.A03 = r7;
        this.A05 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A06 = r6;
        this.A02 = r5;
        this.A04 = r1;
    }
}
