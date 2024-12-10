package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1ST  reason: invalid class name */
public class AnonymousClass1ST {
    public static final String[] A0F = new String[0];
    public final C218617r A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass1LW A02;
    public final AnonymousClass121 A03;
    public final C25321Nt A04;
    public final C25301Nr A05;
    public final AnonymousClass1CL A06;
    public final C22611Cn A07;
    public final AnonymousClass1Cd A08;
    public final AnonymousClass1NJ A09;
    public final C18030ve A0A;
    public final C18010vc A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass190 A0D;
    public final AnonymousClass1L7 A0E;

    public AnonymousClass21V A0B(String str) {
        Cursor A0A2;
        if (str == null) {
            return null;
        }
        C28781at A042 = this.A08.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video, media_caption, media_upload_handle, sticker_flags, first_viewed_timestamp, raw_transcription_text FROM message_media WHERE original_file_hash = ?", "SELECT_ORIGINAL_MESSAGE_FROM_ORIGINAL_FILE_HASH", new String[]{str});
            if (A0A2.moveToNext()) {
                AnonymousClass206 A032 = ((AnonymousClass1W6) this.A0C.get()).A01.A03(A0A2.getLong(A0A2.getColumnIndexOrThrow("message_row_id")));
                if (A032 instanceof AnonymousClass21V) {
                    AnonymousClass21V r1 = (AnonymousClass21V) A032;
                    A0A2.close();
                    A042.close();
                    return r1;
                }
            }
            A0A2.close();
            A042.close();
            return null;
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

    public ArrayList A0E(String str, int i) {
        File file;
        ArrayList A0D2 = A0D((C42621yT) null, str, i);
        ArrayList arrayList = new ArrayList(A0D2.size());
        Iterator it = A0D2.iterator();
        while (it.hasNext()) {
            AnonymousClass21V r2 = (AnonymousClass21V) it.next();
            C62572rc r1 = r2.A02;
            if (r1 != null && r1.A0V && (file = r1.A0G) != null && file.exists()) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    private String[] A00(AnonymousClass1BI r5, long j) {
        ArrayList arrayList = new ArrayList();
        if (r5 != null) {
            arrayList.add(String.valueOf(this.A02.A09(r5)));
        }
        if (j > 0) {
            arrayList.add(String.valueOf(j));
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(A0F);
    }

    public Cursor A01(AnonymousClass1BI r7) {
        StringBuilder sb = new StringBuilder();
        sb.append("mediamsgstore/getMediaMessagesCursor ");
        sb.append(r7);
        Log.i(sb.toString());
        C28781at A042 = this.A08.get();
        try {
            String str = C51012Wq.A09;
            Cursor A0A2 = ((C28801av) A042).A02.A0A(str, "GET_MEDIA_MESSAGES_SQL_ORDER_BY_SORT_ID", new String[]{String.valueOf(this.A02.A09(r7))});
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public Cursor A02(AnonymousClass1BI r7, int i) {
        C28781at A042 = this.A08.get();
        try {
            Cursor A0A2 = ((C28801av) A042).A02.A0A(AnonymousClass203.A08, "GET_MEDIA_MESSAGES_BY_TYPE_SQL", new String[]{String.valueOf(this.A02.A09(r7)), Integer.toString(i)});
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public Cursor A03(AnonymousClass1BI r8, int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("mediamsgstore/getMediaMessagesHeadCursor ");
        sb.append(r8);
        Log.i(sb.toString());
        C28781at A042 = this.A08.get();
        try {
            StringBuilder sb2 = new StringBuilder(C51012Wq.A0A);
            C26121Qx.A03(sb2, true, false);
            if (i > 0) {
                sb2.append(" LIMIT ");
                sb2.append(i);
            }
            String obj = sb2.toString();
            Cursor A0A2 = ((C28801av) A042).A02.A0A(obj, "GET_MEDIA_MESSAGES_HEAD_CURSOR", new String[]{String.valueOf(this.A02.A09(r8)), String.valueOf(this.A09.A04(j))});
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public Cursor A04(AnonymousClass1BI r8, int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("mediamsgstore/getMediaMessagesTailCursor ");
        sb.append(r8);
        Log.i(sb.toString());
        C28781at A042 = this.A08.get();
        try {
            StringBuilder sb2 = new StringBuilder(C51012Wq.A0A);
            C26121Qx.A03(sb2, false, false);
            if (i > 0) {
                sb2.append(" LIMIT ");
                sb2.append(i);
            }
            String obj = sb2.toString();
            Cursor A0A2 = ((C28801av) A042).A02.A0A(obj, "GET_MEDIA_MESSAGES_TAIL_CURSOR", new String[]{String.valueOf(this.A02.A09(r8)), String.valueOf(this.A09.A04(j))});
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public Cursor A05(AnonymousClass1BI r11, long j) {
        StringBuilder sb;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mediamsgstore/getMediaMessagesOrderedBySizeCursor jid:");
        sb2.append(r11);
        sb2.append(", fileSize:");
        sb2.append(j);
        Log.i(sb2.toString());
        C28781at A042 = this.A08.get();
        boolean z = false;
        if (r11 != null) {
            z = true;
        }
        try {
            boolean A052 = C18020vd.A05(C18040vf.A02, this.A0A, 6261);
            C207813l r0 = C207813l.$redex_init_class;
            String str2 = " AND file_size > ?";
            String str3 = " AND message.chat_row_id = ?";
            if (A052) {
                sb = new StringBuilder();
                str = C51012Wq.A01;
            } else {
                sb = new StringBuilder();
                str = C51012Wq.A00;
            }
            sb.append(str);
            if (!z) {
                str3 = "";
            }
            sb.append(str3);
            if (j <= 0) {
                str2 = "";
            }
            sb.append(str2);
            sb.append(" ORDER BY file_size DESC");
            Cursor A0A2 = ((C28801av) A042).A02.A0A(sb.toString(), "GET_MEDIA_AND_DOC_MESSAGES_JOIN_MESSAGE_MEDIA_UNSORTED_ORDER_BY_FILE_SIZE_DESC", A00(r11, j));
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public Cursor A06(AnonymousClass1BI r7, long j) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("mediamsgstore/getMediaMessagesOrderedByIDAscCursor jid:");
        sb.append(r7);
        sb.append(", fileSize:");
        sb.append(j);
        Log.i(sb.toString());
        C28781at A042 = this.A08.get();
        boolean z = false;
        if (r7 != null) {
            z = true;
        }
        try {
            String A002 = C207813l.A00(j, z, true);
            String[] A003 = A00(r7, j);
            if (j > 0) {
                str = "GET_MEDIA_AND_DOC_MESSAGES_JOIN_MESSAGE_MEDIA_UNSORTED_ORDER_BY_SORT_ID_ASC";
            } else {
                str = "GET_MEDIA_AND_DOC_MESSAGES_UNSORTED_ORDER_BY_SORT_ID_ASC";
            }
            Cursor A0A2 = ((C28801av) A042).A02.A0A(A002, str, A003);
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public Cursor A07(AnonymousClass1BI r7, long j) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("mediamsgstore/getMediaAndDocMessagesOrderedByIDDescCursor jid:");
        sb.append(r7);
        sb.append(", fileSize:");
        sb.append(j);
        Log.i(sb.toString());
        C28781at A042 = this.A08.get();
        boolean z = false;
        if (r7 != null) {
            z = true;
        }
        try {
            String A002 = C207813l.A00(j, z, false);
            String[] A003 = A00(r7, j);
            if (j > 0) {
                str = "GET_MEDIA_AND_DOC_MESSAGES_JOIN_MESSAGE_MEDIA_UNSORTED_ORDER_BY_SORT_ID_DESC";
            } else {
                str = "GET_MEDIA_AND_DOC_MESSAGES_UNSORTED_ORDER_BY_SORT_ID_DESC";
            }
            Cursor A0A2 = ((C28801av) A042).A02.A0A(A002, str, A003);
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public Cursor A08(Long l, Long l2, Set set, long j) {
        String str;
        String str2;
        String str3;
        C28781at A042 = this.A08.get();
        try {
            boolean z = true;
            if (C18020vd.A05(C18040vf.A02, this.A0A, 6261)) {
                int size = set.size();
                boolean z2 = false;
                if (l != null) {
                    z2 = true;
                }
                if (l2 == null) {
                    z = false;
                }
                C207813l r0 = C207813l.$redex_init_class;
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT file_path, message_row_id FROM message_media as msg_media JOIN available_message_view AS message JOIN chat_view AS chat WHERE message._id = msg_media.message_row_id AND message.chat_row_id = chat._id AND ");
                sb.append("message_type IN ");
                sb.append(AnonymousClass1H2.A00(size));
                String str4 = "";
                if (z2) {
                    str3 = " AND message_row_id < ? ";
                } else {
                    str3 = str4;
                }
                sb.append(str3);
                if (z) {
                    str4 = " AND message_row_id > ? ";
                }
                sb.append(str4);
                sb.append(" AND (message.from_me = 1 OR chat.group_type != 4)");
                sb.append(" ORDER BY ");
                sb.append("message_row_id");
                sb.append(" DESC LIMIT ?");
                str = sb.toString();
            } else {
                int size2 = set.size();
                boolean z3 = false;
                if (l != null) {
                    z3 = true;
                }
                if (l2 == null) {
                    z = false;
                }
                C207813l r02 = C207813l.$redex_init_class;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT file_path, message_row_id FROM message_media as msg_media JOIN available_message_view AS message ON message._id = msg_media.message_row_id JOIN chat_view AS chat ON message.chat_row_id = chat._id WHERE ");
                sb2.append("message_type IN ");
                sb2.append(AnonymousClass1H2.A00(size2));
                String str5 = "";
                if (z3) {
                    str2 = " AND message_row_id < ? ";
                } else {
                    str2 = str5;
                }
                sb2.append(str2);
                if (z) {
                    str5 = " AND message_row_id > ? ";
                }
                sb2.append(str5);
                sb2.append(" AND (message.from_me = 1 OR chat.group_type != 4)");
                sb2.append(" ORDER BY ");
                sb2.append("message_row_id");
                sb2.append(" DESC LIMIT ?");
                str = sb2.toString();
            }
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Integer) it.next()).intValue()));
            }
            if (l != null) {
                arrayList.add(String.valueOf(l));
            }
            if (l2 != null) {
                arrayList.add(String.valueOf(l2));
            }
            arrayList.add(String.valueOf(j));
            Cursor A0A2 = ((C28801av) A042).A02.A0A(str, "GET_REFERENCED_MEDIA_PATHS", (String[]) arrayList.toArray(new String[0]));
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public ArrayList A0C(C42621yT r5, File file, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = A0D(r5, str, -1).iterator();
        while (it.hasNext()) {
            AnonymousClass21V r1 = (AnonymousClass21V) it.next();
            C62572rc r0 = r1.A02;
            if (r0 != null && file.equals(r0.A0G)) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        r2 = (X.AnonymousClass21V) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G() {
        /*
            r7 = this;
            X.1Cd r0 = r7.A08
            X.1au r6 = r0.A05()
            X.0ve r5 = r7.A0A     // Catch:{ all -> 0x0066 }
            r4 = 0
            r2 = 1
            X.C18070vi.A0d(r5, r2)     // Catch:{ all -> 0x0066 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0066 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0066 }
            r1 = 6261(0x1875, float:8.774E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0066 }
            boolean r0 = X.C18020vd.A05(r0, r5, r1)     // Catch:{ all -> 0x0066 }
            if (r0 != r2) goto L_0x002d
            java.lang.String r2 = X.C50982Wn.A03     // Catch:{ all -> 0x0066 }
        L_0x001e:
            X.C18070vi.A0Z(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "GET_UNOPENED_VIEW_ONCE_MESSAGES_SQL"
            android.database.Cursor r3 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0066 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x0066 }
            goto L_0x0030
        L_0x002d:
            java.lang.String r2 = X.C50982Wn.A02     // Catch:{ all -> 0x0066 }
            goto L_0x001e
        L_0x0030:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0055
            X.00H r0 = r7.A0C     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x005c }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x005c }
            X.206 r2 = r0.A01(r3)     // Catch:{ all -> 0x005c }
            boolean r0 = r2 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0030
            X.21V r2 = (X.AnonymousClass21V) r2     // Catch:{ all -> 0x005c }
            X.2rc r1 = r2.A02     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0030
            r0 = 1
            r1.A0c = r0     // Catch:{ all -> 0x005c }
            X.1Nt r0 = r7.A04     // Catch:{ all -> 0x005c }
            r0.A05(r2)     // Catch:{ all -> 0x005c }
            goto L_0x0030
        L_0x0055:
            r3.close()     // Catch:{ all -> 0x0066 }
            r6.close()
            return
        L_0x005c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0066 }
        L_0x0065:
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x006b }
            throw r1
        L_0x006b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ST.A0G():void");
    }

    public AnonymousClass1ST(AnonymousClass190 r1, C218617r r2, AnonymousClass1L7 r3, AnonymousClass118 r4, AnonymousClass1LW r5, AnonymousClass121 r6, C25321Nt r7, C25301Nr r8, AnonymousClass1CL r9, C22611Cn r10, AnonymousClass1Cd r11, AnonymousClass1NJ r12, C18030ve r13, C18010vc r14, AnonymousClass00H r15) {
        this.A0A = r13;
        this.A02 = r5;
        this.A01 = r4;
        this.A0D = r1;
        this.A00 = r2;
        this.A09 = r12;
        this.A0E = r3;
        this.A05 = r8;
        this.A0C = r15;
        this.A03 = r6;
        this.A06 = r9;
        this.A08 = r11;
        this.A04 = r7;
        this.A0B = r14;
        this.A07 = r10;
    }

    public C130056io A09(String str, int i) {
        String str2;
        String str3;
        String[] strArr;
        Cursor A0A2;
        String str4;
        C17960vV.A01();
        C28781at A042 = this.A08.get();
        if (i == 0) {
            try {
                if (C18020vd.A05(C18040vf.A02, this.A0A, 6261)) {
                    str2 = C51012Wq.A0E;
                } else {
                    str2 = C51012Wq.A0D;
                }
                str3 = "GET_MEDIA_MESSAGE_FILE_BY_HASH_SQL";
                strArr = new String[]{str};
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
            if (C18020vd.A05(C18040vf.A02, this.A0A, 6261)) {
                str4 = C51012Wq.A0C;
            } else {
                str4 = C51012Wq.A0B;
            }
            str3 = "GET_MEDIA_MESSAGE_FILE_BY_HASH_AND_MEDIA_TYPE_SQL";
            strArr = new String[]{str, Integer.toString(i)};
        }
        try {
            A0A2 = ((C28801av) A042).A02.A0A(str2, str3, strArr);
            int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("enc_file_hash");
            int columnIndexOrThrow2 = A0A2.getColumnIndexOrThrow("timestamp");
            int columnIndexOrThrow3 = A0A2.getColumnIndexOrThrow("file_hash");
            int columnIndexOrThrow4 = A0A2.getColumnIndexOrThrow("message_type");
            int columnIndexOrThrow5 = A0A2.getColumnIndexOrThrow("message_url");
            int columnIndexOrThrow6 = A0A2.getColumnIndexOrThrow("mime_type");
            while (A0A2.moveToNext()) {
                C62572rc A022 = this.A04.A02(A0A2);
                String string = A0A2.getString(columnIndexOrThrow);
                long j = A0A2.getLong(columnIndexOrThrow2);
                String string2 = A0A2.getString(columnIndexOrThrow3);
                A0A2.getLong(columnIndexOrThrow4);
                String string3 = A0A2.getString(columnIndexOrThrow5);
                String string4 = A0A2.getString(columnIndexOrThrow6);
                File file = A022.A0G;
                if (file != null) {
                    file.exists();
                    byte[] bArr = A022.A0a;
                    if (bArr != null && bArr.length == 32 && A022.A0V) {
                        if (!A022.A0G.isAbsolute()) {
                            A022.A0G = this.A0E.A08(A022.A0G.getPath());
                        }
                        if (A022.A0G.exists()) {
                            C130056io r11 = new C130056io(A022, string, string2, string3, string4, j);
                            A0A2.close();
                            A042.close();
                            return r11;
                        }
                    }
                }
            }
            A0A2.close();
            A042.close();
            return null;
        } catch (SQLiteDiskIOException e) {
            this.A06.A00(1);
            throw e;
        } catch (Throwable th3) {
            AnonymousClass0DT.A00(th, th3);
        }
        throw th;
    }

    public AnonymousClass205 A0A(String str, String str2, byte[] bArr, boolean z) {
        String str3;
        Cursor A0A2;
        C17960vV.A01();
        C28781at A042 = this.A08.get();
        try {
            C23141Ev r4 = ((C28801av) A042).A02;
            boolean A052 = C18020vd.A05(C18040vf.A02, this.A0A, 6261);
            C207813l r0 = C207813l.$redex_init_class;
            if (A052) {
                str3 = C51012Wq.A0G;
            } else {
                str3 = C51012Wq.A0F;
            }
            A0A2 = r4.A0A(str3, "GET_MEDIA_MESSAGE_KEY_BY_HASHES_SQL", new String[]{str, str2});
            int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("from_me");
            int columnIndexOrThrow2 = A0A2.getColumnIndexOrThrow("key_id");
            AnonymousClass205 r9 = null;
            while (A0A2.moveToNext()) {
                AnonymousClass1BI A0C2 = this.A02.A0C(A0A2);
                if (A0C2 == null) {
                    Log.w("msgstore/getMediaMessageKeyByHashes/jid is null or invalid!");
                } else {
                    boolean z2 = false;
                    if (A0A2.getInt(columnIndexOrThrow) == 1) {
                        z2 = true;
                    }
                    AnonymousClass205 r5 = new AnonymousClass205(A0C2, A0A2.getString(columnIndexOrThrow2), z2);
                    C62572rc A022 = this.A04.A02(A0A2);
                    byte[] bArr2 = A022.A0a;
                    if (bArr2 != null && bArr2.length == 32 && A022.A0V && Arrays.equals(bArr2, bArr)) {
                        if (!z) {
                            A0A2.close();
                            A042.close();
                            return r5;
                        }
                        r9 = r5;
                    }
                }
            }
            A0A2.close();
            A042.close();
            return r9;
        } catch (SQLiteDiskIOException e) {
            try {
                this.A06.A00(1);
                throw e;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            AnonymousClass0DT.A00(th, th3);
        }
        throw th;
    }

    public ArrayList A0D(C42621yT r8, String str, int i) {
        String str2;
        String str3;
        String[] strArr;
        String str4;
        AnonymousClass26f A0C2;
        C17960vV.A01();
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A0A, 6261);
        if (i == -1) {
            if (A052) {
                str3 = C51012Wq.A07;
            } else {
                str3 = C51012Wq.A06;
            }
            strArr = new String[]{str};
            str4 = "GET_MEDIA_MESSAGES_BY_HASH_SQL";
        } else {
            if (A052) {
                str2 = C51012Wq.A05;
            } else {
                str2 = C51012Wq.A04;
            }
            strArr = new String[]{str, Integer.toString(i)};
            str4 = "GET_MEDIA_MESSAGES_BY_HASH_AND_TYPE_SQL";
        }
        ArrayList arrayList = new ArrayList();
        C28781at A042 = this.A08.get();
        try {
            A0C2 = ((C28801av) A042).A02.A0C(r8, str3, str4, strArr);
            while (A0C2.moveToNext()) {
                if (r8 != null) {
                    r8.A02();
                }
                AnonymousClass206 A012 = ((AnonymousClass1W6) this.A0C.get()).A01(A0C2);
                if (A012 instanceof AnonymousClass21V) {
                    arrayList.add((AnonymousClass21V) A012);
                }
            }
            A0C2.close();
            A042.close();
            return arrayList;
        } catch (SQLiteDiskIOException e) {
            try {
                this.A06.A00(1);
                throw e;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            AnonymousClass0DT.A00(th, th3);
        }
        throw th;
    }

    public List A0F(File file) {
        C17960vV.A01();
        try {
            return A0C((C42621yT) null, file, C1402370n.A00(file));
        } catch (IOException e) {
            Log.e("mediamessagestore/getMediaMessagesForFile/could not get file hash;", e);
            return Collections.emptyList();
        }
    }
}
