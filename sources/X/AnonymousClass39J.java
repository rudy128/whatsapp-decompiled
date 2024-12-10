package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.util.Log;
import java.util.LinkedList;

/* renamed from: X.39J  reason: invalid class name */
public class AnonymousClass39J implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public static void A00(AnonymousClass39J r12, AnonymousClass206 r13) {
        boolean z;
        C28791au A05;
        byte[] bArr;
        C18070vi.A0d(r13, 0);
        AnonymousClass21V r1 = (AnonymousClass21V) r13;
        ((C25321Nt) r12.A01.get()).A05(r1);
        AnonymousClass1SX r8 = (AnonymousClass1SX) r12.A02.get();
        C693436v A17 = r1.A17();
        long j = r13.A0x;
        if (A17 != null) {
            synchronized (A17) {
                z = A17.A00;
            }
            if (z) {
                byte[] A06 = A17.A06();
                int[] A07 = A17.A07();
                try {
                    A05 = r8.A03.A05();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("message_row_id", Long.valueOf(j));
                    contentValues.put("sidecar", A06);
                    if (A07 == null) {
                        bArr = null;
                    } else {
                        int length = A07.length;
                        bArr = new byte[(length * 4)];
                        for (int i = 0; i < length; i++) {
                            int i2 = i * 4;
                            int i3 = A07[i];
                            bArr[i2 + 3] = (byte) i3;
                            bArr[i2 + 2] = (byte) (i3 >> 8);
                            bArr[i2 + 1] = (byte) (i3 >> 16);
                            bArr[i2] = (byte) (i3 >> 24);
                        }
                    }
                    contentValues.put("chunk_lengths", bArr);
                    contentValues.put("timestamp", Long.valueOf(AnonymousClass11P.A01(r8.A00)));
                    ((C28801av) A05).A02.A09("message_streaming_sidecar", "INSERT_MESSAGE_STREAMING_SIDECAR_SQL", contentValues, 5);
                    A05.close();
                    synchronized (A17) {
                        A17.A00 = false;
                    }
                    return;
                } catch (SQLiteConstraintException e) {
                    Log.e("SidecarMessageStore/insertStreamingSidecar/", e);
                    throw e;
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public void BL9(AnonymousClass206 r15) {
        Cursor A0A;
        InteractiveAnnotation[] interactiveAnnotationArr;
        C18070vi.A0d(r15, 0);
        C25321Nt r11 = (C25321Nt) this.A01.get();
        AnonymousClass21V r152 = (AnonymousClass21V) r15;
        C17960vV.A0G(AnonymousClass000.A1R((r152.A0x > 0 ? 1 : (r152.A0x == 0 ? 0 : -1))), AnonymousClass206.A03(r152, "MediaCoreMessageStore/fillMediaInfo/message must have row_id set; key=", AnonymousClass000.A10()));
        String[] strArr = new String[1];
        C17880vN.A1U(strArr, 0, r152.A0x);
        AnonymousClass1Cd r2 = r11.A02;
        C28781at A04 = r2.get();
        try {
            Cursor A0A2 = ((C28801av) A04).A02.A0A("SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video, media_caption, media_upload_handle, sticker_flags, first_viewed_timestamp, raw_transcription_text FROM message_media WHERE message_row_id = ?", "GET_MESSAGE_MEDIA_SQL", strArr);
            try {
                if (A0A2.moveToNext()) {
                    C62572rc A022 = r11.A02(A0A2);
                    long j = r152.A0x;
                    C17960vV.A0G(AnonymousClass000.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))), "MediaCoreMessageStore/loadInteractiveAnnotations/invalid row_id");
                    LinkedList linkedList = new LinkedList();
                    C28781at A042 = r2.get();
                    try {
                        C23141Ev r6 = ((C28801av) A042).A02;
                        String[] strArr2 = new String[1];
                        C17880vN.A1U(strArr2, 0, j);
                        A0A = r6.A0A("SELECT _id, message_row_id, skip_confirmation, location_latitude, location_longitude, location_name, newsletter_jid_row_id, newsletter_server_message_id, newsletter_name, newsletter_content_type, newsletter_accessibility_text, child_message_row_id, type, fp_interactive_annotation, sort_order FROM message_media_interactive_annotation WHERE message_row_id = ? ORDER BY sort_order", "GET_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_SQL", strArr2);
                        while (A0A.moveToNext()) {
                            InteractiveAnnotation A012 = r11.A01(A0A, A042);
                            if (A012 != null) {
                                linkedList.add(A012);
                            }
                        }
                        A0A.close();
                        A042.close();
                        if (linkedList.isEmpty()) {
                            interactiveAnnotationArr = null;
                        } else {
                            interactiveAnnotationArr = (InteractiveAnnotation[]) linkedList.toArray(new InteractiveAnnotation[0]);
                        }
                        A022.A0b = interactiveAnnotationArr;
                        r152.A1A(A0A2, A022);
                    } catch (Throwable th) {
                        A042.close();
                        throw th;
                    }
                }
                A0A2.close();
                A04.close();
                if (r152.A02 == null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    AnonymousClass206.A06(r152, "MediaCoreMessageStore/fillMediaInfo; media was not found for message: id=", A10);
                    AnonymousClass206.A07(r152, ", type=", A10);
                    C17890vO.A0w(A10);
                    r152.A02 = new C62572rc();
                    return;
                }
                return;
                throw th;
            } catch (Throwable th2) {
                if (A0A2 != null) {
                    A0A2.close();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A04.close();
                throw th3;
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th3, th4);
                throw th3;
            }
        }
    }

    public AnonymousClass39J(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BdY(AnonymousClass206 r1) {
        A00(this, r1);
    }

    public void CQL(AnonymousClass206 r1) {
        A00(this, r1);
    }
}
