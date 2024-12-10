package X;

import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.D5a  reason: case insensitive filesystem */
public class C26586D5a implements AnonymousClass02j {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C26586D5a(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj4;
        this.A03 = obj3;
        this.A04 = obj;
    }

    public final void Bkx(Object obj) {
        AnonymousClass02n r0;
        Bundle extras;
        C24343Bze bze;
        C24343Bze bze2;
        Bundle extras2;
        if (this.A00 != 0) {
            AnonymousClass1OS r7 = (AnonymousClass1OS) this.A01;
            C18090vk r2 = (C18090vk) this.A02;
            AnonymousClass1FB r6 = (AnonymousClass1FB) this.A03;
            C26617D6l d6l = (C26617D6l) this.A04;
            C005702m r11 = (C005702m) obj;
            C18070vi.A0h(r7, r2);
            C18070vi.A0d(r11, 4);
            if (r11.A00 == -1) {
                Intent intent = r11.A01;
                if (intent != null && (extras2 = intent.getExtras()) != null) {
                    LinkedHashMap A13 = C17880vN.A13();
                    String string = extras2.getString("result_video_path");
                    String string2 = extras2.getString("result_photo_path");
                    HashMap A11 = C17880vN.A11();
                    if (string2 != null) {
                        A13.put("selfie_photo", string2);
                        A11.put("selfie_photo", "SELFIE_PHOTO_NATIVE");
                    }
                    if (string != null) {
                        A13.put("selfie_video", string);
                        A11.put("selfie_video", "SELFIE_VIDEO_NATIVE");
                    }
                    LinkedHashMap A0b = C108995ce.A0b(A13);
                    Iterator A15 = AnonymousClass000.A15(A13);
                    while (A15.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(A15);
                        A0b.put(A16.getKey(), ((C20049A4s) d6l.A01.get()).A01(AnonymousClass8BR.A10(A16)));
                    }
                    r7.invoke(A0b, A11);
                } else {
                    return;
                }
            } else {
                r2.invoke();
            }
            r6.getLifecycle().A06(d6l);
            r0 = d6l.A00;
        } else {
            C26615D6j d6j = (C26615D6j) this.A01;
            AnonymousClass1OS r5 = (AnonymousClass1OS) this.A02;
            C18090vk r22 = (C18090vk) this.A03;
            AnonymousClass1FB r3 = (AnonymousClass1FB) this.A04;
            C005702m r112 = (C005702m) obj;
            C18070vi.A0j(r5, r22);
            C18070vi.A0d(r112, 4);
            if (r112.A00 == -1) {
                Intent intent2 = r112.A01;
                if (intent2 != null && (extras = intent2.getExtras()) != null) {
                    LinkedHashMap A132 = C17880vN.A13();
                    LinkedHashMap A133 = C17880vN.A13();
                    String str = C24332BzT.ID_FRONT.type;
                    String string3 = extras.getString("front_file_path");
                    if (string3 != null) {
                        Serializable serializable = extras.getSerializable("front_authenticity_upload_medium");
                        if ((serializable instanceof C24343Bze) && (bze2 = (C24343Bze) serializable) != null) {
                            A132.put(str, string3);
                            A133.put(str, bze2.value);
                        }
                    }
                    String str2 = C24332BzT.ID_BACK.type;
                    String string4 = extras.getString("back_file_path");
                    if (string4 != null) {
                        Serializable serializable2 = extras.getSerializable("back_authenticity_upload_medium");
                        if ((serializable2 instanceof C24343Bze) && (bze = (C24343Bze) serializable2) != null) {
                            A132.put(str2, string4);
                            A133.put(str2, bze.value);
                        }
                    }
                    LinkedHashMap A0b2 = C108995ce.A0b(A132);
                    Iterator A152 = AnonymousClass000.A15(A132);
                    while (A152.hasNext()) {
                        Map.Entry A162 = AnonymousClass000.A16(A152);
                        A0b2.put(A162.getKey(), ((C20049A4s) d6j.A01.get()).A01(AnonymousClass8BR.A10(A162)));
                    }
                    r5.invoke(A0b2, A133);
                } else {
                    return;
                }
            } else {
                r22.invoke();
            }
            r3.getLifecycle().A06(d6j);
            r0 = d6j.A00;
        }
        if (r0 != null) {
            r0.A01();
        }
    }
}
