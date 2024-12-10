package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1Qc  reason: invalid class name and case insensitive filesystem */
public class C25911Qc {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass190 A01;

    public static ContentValues A00(C61762qD r4, long j) {
        Integer num;
        AnonymousClass2RE r0;
        ContentValues contentValues = new ContentValues(6);
        contentValues.put("message_row_id", Long.valueOf(j));
        contentValues.put("text_data", r4.A09);
        contentValues.put("extra_data", r4.A01);
        contentValues.put("button_type", Integer.valueOf(r4.A07));
        contentValues.put("used", Integer.valueOf(r4.A04 ? 1 : 0));
        contentValues.put("selected_index", Integer.valueOf(r4.A06));
        contentValues.put("selected_carousel_card_index", r4.A08);
        contentValues.put("otp_button_type", Integer.valueOf(r4.A0B.get()));
        contentValues.put("extra_consent_data", r4.A0A);
        contentValues.put("otp_matched_package_name", r4.A02);
        String str = r4.A03;
        if (!(str == null || str.length() == 0)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C18070vi.A0X(lowerCase);
            int hashCode = lowerCase.hashCode();
            if (hashCode != 3154575) {
                if (hashCode != 3552429) {
                    if (hashCode == 950483747 && lowerCase.equals("compact")) {
                        r0 = AnonymousClass2RE.COMPACT;
                    }
                } else if (lowerCase.equals("tall")) {
                    r0 = AnonymousClass2RE.TALL;
                }
            } else if (lowerCase.equals("full")) {
                r0 = AnonymousClass2RE.FULL;
            }
            num = Integer.valueOf(r0.value);
            contentValues.put("webview_presentation", num);
            contentValues.put("webview_interaction", Integer.valueOf(r4.A05 ? 1 : 0));
            return contentValues;
        }
        num = null;
        contentValues.put("webview_presentation", num);
        contentValues.put("webview_interaction", Integer.valueOf(r4.A05 ? 1 : 0));
        return contentValues;
    }

    public void A01(AnonymousClass206 r41) {
        Cursor A0A;
        C58072k6 r7;
        C439421n r1;
        Long valueOf;
        Integer num;
        int i;
        AnonymousClass2RE A002;
        String str;
        AnonymousClass206 r12 = r41;
        C17960vV.A0G(r12 instanceof C439421n, "TemplateMessageStore/fillTemplateData/message needs to be FMessageTemplate.");
        long j = r12.A0x;
        ArrayList arrayList = new ArrayList();
        C28781at A04 = this.A00.get();
        try {
            C23141Ev r5 = ((C28801av) A04).A02;
            String valueOf2 = String.valueOf(j);
            A0A = r5.A0A("SELECT content_text_data, footer_text_data, template_id, csat_trigger_expiration_ts, category, tag, mask_linked_devices FROM message_template WHERE message_row_id = ?", "GET_TEMPLATE_MESSAGE_SQL", new String[]{valueOf2});
            if (!A0A.moveToFirst()) {
                Log.e("TemplateMessageStore/getTemplateData/no template data in the table.");
                A0A.close();
                A04.close();
                AnonymousClass190 r4 = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("message.key");
                sb.append(r12.A0v);
                r4.A0G("TemplateMessageStore/fillTemplateData/template data is missing.", sb.toString(), true);
                r1 = (C439421n) r12;
                r7 = new C58072k6((Long) null, "", (String) null, (String) null, (String) null, (String) null, (List) null, false);
            } else {
                String string = A0A.getString(A0A.getColumnIndexOrThrow("content_text_data"));
                String string2 = A0A.getString(A0A.getColumnIndexOrThrow("footer_text_data"));
                String string3 = A0A.getString(A0A.getColumnIndexOrThrow("template_id"));
                long j2 = A0A.getLong(A0A.getColumnIndexOrThrow("csat_trigger_expiration_ts"));
                String string4 = A0A.getString(A0A.getColumnIndexOrThrow("category"));
                String string5 = A0A.getString(A0A.getColumnIndexOrThrow("tag"));
                boolean A05 = AnonymousClass1Eu.A05(A0A, A0A.getColumnIndexOrThrow("mask_linked_devices"));
                A0A.close();
                A0A = r5.A0A("SELECT _id, text_data, extra_data, button_type, used, selected_index, selected_carousel_card_index, otp_button_type, extra_consent_data, otp_matched_package_name, webview_presentation, webview_interaction FROM message_template_button WHERE message_row_id = ?", "GET_TEMPLATE_MESSAGE_BUTTONS_SQL", new String[]{valueOf2});
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("text_data");
                int columnIndexOrThrow3 = A0A.getColumnIndexOrThrow("extra_data");
                int columnIndexOrThrow4 = A0A.getColumnIndexOrThrow("button_type");
                int columnIndexOrThrow5 = A0A.getColumnIndexOrThrow("used");
                int columnIndexOrThrow6 = A0A.getColumnIndexOrThrow("selected_index");
                int columnIndexOrThrow7 = A0A.getColumnIndexOrThrow("selected_carousel_card_index");
                int columnIndexOrThrow8 = A0A.getColumnIndexOrThrow("otp_button_type");
                int columnIndexOrThrow9 = A0A.getColumnIndexOrThrow("extra_consent_data");
                int columnIndexOrThrow10 = A0A.getColumnIndexOrThrow("otp_matched_package_name");
                int columnIndexOrThrow11 = A0A.getColumnIndexOrThrow("webview_presentation");
                int columnIndexOrThrow12 = A0A.getColumnIndexOrThrow("webview_interaction");
                while (A0A.moveToNext()) {
                    long j3 = A0A.getLong(columnIndexOrThrow);
                    String string6 = A0A.getString(columnIndexOrThrow2);
                    String string7 = A0A.getString(columnIndexOrThrow3);
                    int i2 = A0A.getInt(columnIndexOrThrow4);
                    boolean z = false;
                    if (A0A.getInt(columnIndexOrThrow5) == 1) {
                        z = true;
                    }
                    int i3 = A0A.getInt(columnIndexOrThrow6);
                    if (!A0A.isNull(columnIndexOrThrow7)) {
                        num = Integer.valueOf(A0A.getInt(columnIndexOrThrow7));
                    } else {
                        num = null;
                    }
                    int i4 = A0A.getInt(columnIndexOrThrow8);
                    String string8 = A0A.getString(columnIndexOrThrow9);
                    String string9 = A0A.getString(columnIndexOrThrow10);
                    if (!A0A.isNull(columnIndexOrThrow11)) {
                        i = A0A.getInt(columnIndexOrThrow11);
                    } else {
                        i = 0;
                    }
                    C61762qD r23 = new C61762qD(num, string6, string7, string8, string9, i2, i3, i4, z);
                    r23.A00 = j3;
                    r23.A05 = AnonymousClass1Eu.A05(A0A, columnIndexOrThrow12);
                    if (i > 0 && (A002 = AnonymousClass2RE.A00(i)) != null) {
                        int ordinal = A002.ordinal();
                        if (ordinal == 0) {
                            str = "full";
                        } else if (ordinal == 1) {
                            str = "tall";
                        } else if (ordinal == 2) {
                            str = "compact";
                        } else {
                            throw new AnonymousClass3EW();
                        }
                        r23.A03 = str;
                    }
                    arrayList.add(r23);
                }
                A0A.close();
                A04.close();
                C17960vV.A07(string);
                if (arrayList.size() == 0) {
                    arrayList = null;
                }
                if (j2 == 0) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(j2);
                }
                r7 = new C58072k6(valueOf, string, string2, string3, string4, string5, arrayList, A05);
                r1 = (C439421n) r12;
            }
            r1.CL3(r7);
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A02(AnonymousClass206 r19) {
        C28791au A05;
        AnonymousClass206 r5 = r19;
        if (!(r5 instanceof C439421n)) {
            throw new IllegalArgumentException("message must be template message");
        } else if (r5.A0x != -1) {
            AnonymousClass1Cd r4 = this.A00;
            C28791au A052 = r4.A05();
            try {
                C41851xA BD0 = A052.BD0();
                try {
                    C439421n r8 = (C439421n) r5;
                    C58072k6 BaE = r8.BaE();
                    ContentValues contentValues = new ContentValues(5);
                    contentValues.put("message_row_id", Long.valueOf(r5.A0x));
                    contentValues.put("content_text_data", BaE.A02);
                    contentValues.put("footer_text_data", BaE.A03);
                    contentValues.put("template_id", BaE.A05);
                    contentValues.put("csat_trigger_expiration_ts", BaE.A00);
                    contentValues.put("category", BaE.A01);
                    contentValues.put("tag", BaE.A04);
                    contentValues.put("mask_linked_devices", Boolean.valueOf(BaE.A07));
                    boolean z = false;
                    if (((C28801av) A052).A02.A09("message_template", "INSERT_TEMPLATE_SQL", contentValues, 5) == r5.A0x) {
                        z = true;
                    }
                    C17960vV.A0H(z, "TemplateMessageStore/insertOrUpdateTemplateData/inserted row should have same row_id");
                    List<C61762qD> list = r8.BaE().A06;
                    if (list != null) {
                        for (C61762qD r3 : list) {
                            long j = r5.A0x;
                            A05 = r4.A05();
                            ContentValues A002 = A00(r3, j);
                            long j2 = r3.A00;
                            if (j2 == -1) {
                                r3.A00 = ((C28801av) A05).A02.A05("message_template_button", "INSERT_TEMPLATE_BUTTON_SQL", A002);
                            } else {
                                if (((C28801av) A05).A02.A02(A002, "message_template_button", "_id = ?", "UPDATE_TEMPLATE_BUTTON_SQL", new String[]{String.valueOf(j2)}) != 1) {
                                    Log.e("TemplateMessageStore/insertOrUpdateTemplateButton/fail to update template button.");
                                }
                            }
                            A05.close();
                        }
                    }
                    BD0.A00();
                    BD0.close();
                    A052.close();
                    return;
                } catch (Throwable th) {
                    BD0.close();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    A052.close();
                    throw th2;
                } catch (Throwable th3) {
                    AnonymousClass0DT.A00(th2, th3);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("main message part must be inserted before");
        }
        throw th;
    }

    public C25911Qc(AnonymousClass190 r1, AnonymousClass1Cd r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
