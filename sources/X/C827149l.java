package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.49l  reason: invalid class name and case insensitive filesystem */
public class C827149l extends A34 {
    public final Context A00;
    public final Uri A01;
    public final C107655aN A02;
    public final C87864Xj A03;

    public static C85264Ms A00(int i) {
        C17960vV.A0C(true);
        return new C85264Ms(i, (Bitmap) null);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C85264Ms r3;
        String str;
        AUZ A002;
        Bitmap A003;
        String path = this.A01.getPath();
        C17960vV.A07(path);
        File file = new File(path);
        C87864Xj r6 = this.A03;
        Context context = this.A00;
        Bitmap A004 = C87864Xj.A00(context, file);
        if (A004 != null) {
            A0C(new C85264Ms(1, A004));
        }
        String str2 = file.getName().split("\\.")[0];
        C63352sv r32 = r6.A02;
        File A032 = r32.A03(str2);
        if (A032 != null && (A003 = C87864Xj.A00(context, A032)) != null) {
            return new C85264Ms(2, A003);
        }
        if (!r6.A01.A09()) {
            return A00(3);
        }
        try {
            AnonymousClass4XR r62 = r6.A03;
            if (C72463Mc.A00(r62.A00.A00) >= 2.0f) {
                str = "xxhdpi";
            } else {
                str = "hdpi";
            }
            HashMap A11 = C17880vN.A11();
            A11.put("category", "wallpaper");
            A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AnonymousClass001.A1H("_", str, AnonymousClass000.A11(str2)));
            A002 = AnonymousClass4XR.A00(r62.A02, r62, C88574a9.A02(C88574a9.A00(r62.A01, r62.A03, "wa/static/downloadable"), A11));
            if (A002 == null) {
                r3 = A00(4);
                TrafficStats.clearThreadStatsTag();
                return r3;
            }
            if (!r32.A06(A002, str2)) {
                r3 = A00(5);
            } else {
                File A033 = r32.A03(str2);
                C17960vV.A07(A033);
                Bitmap A005 = C87864Xj.A00(context, A033);
                if (A005 == null) {
                    r3 = A00(5);
                } else {
                    r3 = new C85264Ms(2, A005);
                }
            }
            A002.close();
            TrafficStats.clearThreadStatsTag();
            return r3;
        } catch (IOException unused) {
            try {
                r3 = A00(4);
            } catch (Throwable th) {
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C85264Ms r2 = (C85264Ms) obj;
        if (!this.A02.isCancelled()) {
            this.A02.C6X(r2);
            return;
        }
        Bitmap bitmap = r2.A01;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public /* bridge */ /* synthetic */ void A0I(Object[] objArr) {
        this.A02.C6X(((C85264Ms[]) objArr)[0]);
    }

    public C827149l(Context context, Uri uri, C107655aN r3, C87864Xj r4) {
        this.A03 = r4;
        this.A00 = context;
        this.A01 = uri;
        this.A02 = r3;
    }
}
