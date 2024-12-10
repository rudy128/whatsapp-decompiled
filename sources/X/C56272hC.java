package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2hC  reason: invalid class name and case insensitive filesystem */
public class C56272hC {
    public final File A00;
    public final File A01;
    public final File A02;
    public final File A03;
    public final File A04;
    public final File A05;
    public final File A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public final File A0A;
    public final File A0B;
    public final File A0C;
    public final File A0D;
    public final File A0E;
    public final File A0F;
    public final File A0G;
    public final File A0H;
    public final File A0I;
    public final File A0J;
    public final File A0K;
    public final File A0L;
    public final File A0M;
    public final File A0N;
    public final File A0O;
    public final File A0P;
    public final File A0Q;
    public final File A0R;
    public final File A0S;
    public final File A0T;
    public final File A0U;
    public final /* synthetic */ C218617r A0V;

    public C56272hC(C218617r r13) {
        this.A0V = r13;
        AnonymousClass00H r3 = r13.A03;
        File A052 = ((AnonymousClass1L7) r3.get()).A05();
        C218617r.A07(A052, false);
        this.A0C = A052;
        File A082 = ((AnonymousClass1L7) r3.get()).A08(".Shared");
        C218617r.A07(A082, true);
        this.A04 = A082;
        Context context = r13.A01.A00;
        this.A0B = C17890vO.A0I(context.getFilesDir(), ".Shared", false);
        File A0I2 = C17890vO.A0I(A052, C218617r.A0A, false);
        this.A01 = A0I2;
        File A0I3 = C17890vO.A0I(A052, C218617r.A09, false);
        this.A00 = A0I3;
        this.A0R = C17890vO.A0I(A052, C218617r.A0K, true);
        this.A0J = C17890vO.A0I(A052, C218617r.A0G, true);
        String str = C218617r.A0J;
        File A0I4 = C17890vO.A0I(A052, str, false);
        this.A0Q = A0I4;
        String str2 = C218617r.A0E;
        File A0I5 = C17890vO.A0I(A052, str2, false);
        this.A07 = A0I5;
        File A0I6 = C17890vO.A0I(A052, C218617r.A0D, false);
        this.A03 = A0I6;
        this.A0S = C17890vO.A0I(A052, "WallPaper", false);
        this.A0I = C17890vO.A0I(A052, C218617r.A0F, false);
        this.A0U = C17890vO.A0I(A052, ".Links", true);
        this.A0P = C17890vO.A0I(A052, ".Statuses", true);
        this.A0T = C17890vO.A0I(A052, ".udDHFY8K4Eqg", true);
        this.A0A = C17890vO.A0I(context.getFilesDir(), "ViewOnce", true);
        this.A08 = C17890vO.A0I(context.getFilesDir(), str2, true);
        this.A09 = C17890vO.A0I(context.getFilesDir(), str, true);
        File A0e = C17880vN.A0e(A052, C218617r.A0C);
        if (A0e.exists()) {
            C64062u9.A0R(A0e);
            Log.i("fmessageio/initExternalStorageDirectory calls dir removed");
        }
        this.A0L = C17890vO.A0I(A0I2, "Sent", true);
        this.A0K = C17890vO.A0I(A0I3, "Sent", true);
        this.A0O = C17890vO.A0I(A0I4, "Sent", true);
        this.A0N = C17890vO.A0I(A0I5, "Sent", true);
        this.A0M = C17890vO.A0I(A0I6, "Sent", true);
        this.A0G = C218617r.A00(r13, C17880vN.A0e(A0I5, "Private"), " Images");
        this.A0E = C218617r.A00(r13, C17880vN.A0e(A0I2, "Private"), " Audio");
        this.A0D = C218617r.A00(r13, C17880vN.A0e(A0I3, "Private"), " Animated Gifs");
        this.A0H = C218617r.A00(r13, C17880vN.A0e(A0I4, "Private"), " Video");
        this.A0F = C218617r.A00(r13, C17880vN.A0e(A0I6, "Private"), " Documents");
        this.A05 = C218617r.A00(r13, C17880vN.A0e(A052, C218617r.A0H), " Stickers");
        this.A02 = C218617r.A00(r13, C17880vN.A0e(A052, C218617r.A0B), " Backup Excluded Stickers");
        this.A06 = C218617r.A00(r13, C17880vN.A0e(A052, C218617r.A0I), " Sticker Packs");
    }
}
