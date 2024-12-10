package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.mentions.MentionableEntry;
import java.util.Collections;
import java.util.List;

/* renamed from: X.DOe  reason: case insensitive filesystem */
public class C26982DOe implements C107045Ye {
    public C23831Bqo A00;
    public List A01;
    public final Activity A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass1M9 A04;
    public final C24921Me A05;
    public final C219217x A06;
    public final AnonymousClass1KW A07;
    public final AnonymousClass1BI A08;
    public final C34501ka A09;
    public final MentionableEntry A0A;
    public final C34531kd A0B;
    public final AnonymousClass18K A0C;

    public static void A01(C26982DOe dOe, List list) {
        String str;
        List list2 = list;
        if (list == null || list.isEmpty()) {
            dOe.A03.A08(2131896086, 0);
            str = "drag_drop_uri_null_or_empty";
        } else if (!dOe.A06.A0G()) {
            Activity activity = dOe.A02;
            int i = Build.VERSION.SDK_INT;
            int i2 = 2131894470;
            if (i >= 30) {
                i2 = 2131894473;
                if (i < 33) {
                    i2 = 2131894472;
                }
            }
            AnonymousClass74O.A09(activity, 2131894471, i2, 29);
            dOe.A01 = list;
            str = "missing_storage_permission";
        } else {
            C34531kd r1 = dOe.A0B;
            List singletonList = Collections.singletonList(dOe.A08);
            Activity activity2 = dOe.A02;
            r1.A05(activity2, (AnonymousClass1FR) activity2, new C92184gt(dOe, 0), (C692236j) null, "", singletonList, list2, 9, 17, false, false, false);
            C23831Bqo bqo = dOe.A00;
            bqo.A00 = AnonymousClass000.A0i();
            dOe.A0C.CC7(bqo);
            return;
        }
        A00(dOe, str);
    }

    public static void A00(C26982DOe dOe, String str) {
        C23831Bqo bqo = dOe.A00;
        bqo.A00 = AnonymousClass000.A0h();
        bqo.A02 = str;
        dOe.A0C.CC7(bqo);
    }

    public boolean Bky(Intent intent, int i, int i2) {
        if (i != 29 || i2 != -1) {
            return false;
        }
        A01(this, this.A01);
        return true;
    }

    public C26982DOe(Context context, AnonymousClass1KB r3, C34531kd r4, AnonymousClass1M9 r5, C24921Me r6, C219217x r7, AnonymousClass1KW r8, AnonymousClass18K r9, AnonymousClass1BI r10, C34501ka r11, MentionableEntry mentionableEntry) {
        this.A02 = AnonymousClass1L9.A00(context);
        this.A0B = r4;
        this.A03 = r3;
        this.A0A = mentionableEntry;
        this.A08 = r10;
        this.A06 = r7;
        this.A09 = r11;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r8;
        this.A0C = r9;
    }
}
