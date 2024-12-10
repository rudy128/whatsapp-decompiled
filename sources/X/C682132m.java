package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.32m  reason: invalid class name and case insensitive filesystem */
public final class C682132m implements C25341Nv {
    public final AnonymousClass00H A00;

    public C682132m(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bca(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        return r2 instanceof AnonymousClass21L;
    }

    public Set BZv() {
        return C18070vi.A0P(C692736o.class);
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [X.21a, X.21X] */
    /* JADX WARNING: type inference failed for: r2v12, types: [X.21d, X.21e] */
    public void Bhl(AnonymousClass25F r18) {
        Cursor A0A;
        String str;
        C445323u r2;
        File file;
        AnonymousClass206 A08 = C18070vi.A08(r18);
        C18070vi.A0z(A08, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageInteractive");
        AnonymousClass21L r6 = (AnonymousClass21L) A08;
        C25941Qf r5 = (C25941Qf) this.A00.get();
        long j = r6.A0x;
        ArrayList arrayList = null;
        if (C18020vd.A05(C18040vf.A02, r5.A04, 4668) && C20120A8f.A07(r6)) {
            String[] A1Y = C17880vN.A1Y();
            C17880vN.A1U(A1Y, 0, j);
            ArrayList A13 = AnonymousClass000.A13();
            C28781at A04 = r5.A03.get();
            try {
                A0A = ((C28801av) A04).A02.A0A("SELECT _id, message_row_id, addon_message_index, chat_row_id, file_path, file_size, media_key, media_key_timestamp, width, height, direct_path, message_url, mime_type, file_length, file_hash, enc_file_hash, partial_media_hash, partial_media_enc_hash, original_file_hash, thumbnail, thumbnail_direct_path, thumbnail_hash, enc_thumbnail_hash, scans_sidecar, transferred FROM addon_message_media WHERE message_row_id = ?", "GET_ADDON_MESSAGE_MEDIA_SQL", A1Y);
                while (A0A.moveToNext()) {
                    String A0S = C17890vO.A0S(A0A, "mime_type");
                    if (A0S == null) {
                        C17900vP.A0l("AddonMessageMediaStore/createAddonMessagesForMessageRow; media type not found for message: id=", AnonymousClass000.A10(), j);
                    } else {
                        int A01 = C17890vO.A01(A0A, "addon_message_index");
                        C20242ADa aDa = r6.A00.A04;
                        C17960vV.A07(aDa);
                        C20285AEt aEt = (C20285AEt) aDa.A00.get(A01);
                        if (aEt.A00 == 9) {
                            C445323u r22 = new C445323u(new AnonymousClass2M2(r6.A0v, A01), aEt, r6.A0I);
                            ADG adg = aEt.A09;
                            r2 = r22;
                            if (adg != null) {
                                UserJid userJid = adg.A01;
                                r2 = r22;
                                if (userJid != null) {
                                    r22.A01 = userJid;
                                    r22.A06 = adg.A06;
                                    r22.A0A = adg.A09;
                                    r22.A04 = adg.A04;
                                    r22.A03 = adg.A03;
                                    r22.A0B = adg.A0A;
                                    r22.A0C = adg.A0B;
                                    r22.A08 = adg.A08;
                                    r22.A07 = adg.A07;
                                    r22.A00 = adg.A00;
                                    r22.A02 = adg.A02;
                                    r22.A05 = adg.A05;
                                    r2 = r22;
                                }
                            }
                        } else {
                            switch (A0S.hashCode()) {
                                case -1487394660:
                                    str = "image/jpeg";
                                    break;
                                case -1487018032:
                                    str = "image/webp";
                                    break;
                                case -879264467:
                                    str = "image/jpg";
                                    break;
                                case -879258763:
                                    str = "image/png";
                                    break;
                                case 1331848029:
                                    if (A0S.equals("video/mp4")) {
                                        AnonymousClass2M2 r13 = new AnonymousClass2M2(r6.A0v, A01);
                                        long j2 = r6.A0I;
                                        C20242ADa aDa2 = r6.A00.A04;
                                        C17960vV.A07(aDa2);
                                        C20285AEt aEt2 = (C20285AEt) aDa2.A00.get(A01);
                                        C18070vi.A0d(aEt2, 3);
                                        ? r23 = new AnonymousClass21X(r13, 62, j2);
                                        r23.A00 = aEt2;
                                        r2 = r23;
                                        break;
                                    }
                                    break;
                            }
                            if (A0S.equals(str)) {
                                AnonymousClass2M2 r132 = new AnonymousClass2M2(r6.A0v, A01);
                                long j3 = r6.A0I;
                                C20242ADa aDa3 = r6.A00.A04;
                                C17960vV.A07(aDa3);
                                C20285AEt aEt3 = (C20285AEt) aDa3.A00.get(A01);
                                C18070vi.A0d(aEt3, 3);
                                ? r24 = new C438421d(r132, 57, j3);
                                r24.A00 = aEt3;
                                r2 = r24;
                            }
                            StringBuilder A10 = AnonymousClass000.A10();
                            AnonymousClass206.A06(r6, "AddonMessageMediaStore/createAddonMessage; unsupported media type for message: id=", A10);
                            C17900vP.A0e(", type=", A0S, A10);
                            continue;
                        }
                        C62572rc r133 = new C62572rc();
                        r133.A0A = C17890vO.A06(A0A, "file_size");
                        r133.A0a = C17890vO.A1X(A0A, "media_key");
                        r133.A0B = C17890vO.A06(A0A, "media_key_timestamp");
                        r133.A08 = C17890vO.A01(A0A, "width");
                        r133.A06 = C17890vO.A01(A0A, "height");
                        r133.A0J = C17890vO.A0S(A0A, "direct_path");
                        r133.A0X = C17890vO.A1X(A0A, "scans_sidecar");
                        String A0S2 = C17890vO.A0S(A0A, "file_path");
                        r133.A0O = C17890vO.A0S(A0A, "partial_media_hash");
                        r133.A0N = C17890vO.A0S(A0A, "partial_media_enc_hash");
                        r133.A0V = AnonymousClass1Eu.A06(A0A, A0A.getColumnIndexOrThrow("transferred"));
                        if (A0S2 == null) {
                            file = null;
                        } else {
                            file = new File(A0S2);
                        }
                        r133.A0G = r5.A01.A07(file);
                        r2.A02 = r133;
                        r2.A06 = C17890vO.A0S(A0A, "mime_type");
                        r2.A07 = C17890vO.A0S(A0A, "message_url");
                        r2.A01 = C17890vO.A06(A0A, "file_length");
                        r2.A05 = C17890vO.A0S(A0A, "file_hash");
                        r2.A08 = C17890vO.A0S(A0A, "enc_file_hash");
                        C693536w A002 = C693536w.A00(r5.A00, r2);
                        A002.A05 = C17890vO.A0S(A0A, "thumbnail_direct_path");
                        A002.A09 = C17890vO.A0S(A0A, "thumbnail_hash");
                        A002.A06 = C17890vO.A0S(A0A, "enc_thumbnail_hash");
                        A002.A0B = C17890vO.A1X(A0A, "media_key");
                        A002.A02 = C17890vO.A06(A0A, "media_key_timestamp");
                        byte[] A1X = C17890vO.A1X(A0A, "thumbnail");
                        if (!(A1X == null || r2.A0O() == null)) {
                            r2.A0p(A1X);
                        }
                        C60502o8.A01(r2, A002);
                        A13.add(A01, r2);
                    }
                }
                if (A13.isEmpty()) {
                    C17900vP.A0l("AddonMessageMediaStore/createAddonMessagesForMessageRow; no addon message created for message: id=", AnonymousClass000.A10(), j);
                    A0A.close();
                    A04.close();
                } else {
                    A0A.close();
                    A04.close();
                    arrayList = A13;
                }
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        }
        r6.A18(arrayList);
        return;
        throw th;
    }
}
