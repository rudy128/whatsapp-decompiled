package X;

import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1Lr  reason: invalid class name and case insensitive filesystem */
public class C24791Lr {
    public final C218617r A00;
    public final AnonymousClass11S A01;
    public final C24771Lp A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass11P A04;

    public File A00(AnonymousClass1E7 r6) {
        StringBuilder sb;
        if ((r6 instanceof AnonymousClass25I) || C29681ch.A00(r6.A0J)) {
            return A02(r6);
        }
        AnonymousClass1BI r4 = (AnonymousClass1BI) r6.A06(AnonymousClass1BI.class);
        if (r4 == null) {
            return null;
        }
        boolean A0O = this.A01.A0O(r4);
        Context context = this.A03.A00;
        if (A0O) {
            return new File(context.getFilesDir(), "me.jpg");
        }
        File file = new File(context.getCacheDir(), "Profile Pictures");
        if (!file.exists()) {
            file.mkdirs();
        }
        String str = r4.user;
        if (str == null) {
            sb = new StringBuilder();
            str = r4.getRawString();
        }
        sb.append(str);
        sb.append(".jpg");
        return new File(file, sb.toString());
    }

    public File A01(AnonymousClass1E7 r5) {
        String rawString;
        if ((r5 instanceof AnonymousClass25I) || C29681ch.A00(r5.A0J)) {
            return A02(r5);
        }
        AnonymousClass1BI r3 = (AnonymousClass1BI) r5.A06(AnonymousClass1BI.class);
        if (r3 == null) {
            return null;
        }
        File file = new File(this.A03.A00.getFilesDir(), "Avatars");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (this.A01.A0O(r3)) {
            rawString = "me";
        } else {
            rawString = r3.getRawString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(rawString);
        sb.append(".j");
        return new File(file, sb.toString());
    }

    public File A02(AnonymousClass1E7 r5) {
        String rawString;
        C218617r r2;
        StringBuilder sb;
        if (r5 instanceof AnonymousClass25I) {
            r2 = this.A00;
            sb = new StringBuilder();
            sb.append("tmpp");
            rawString = ((AnonymousClass25I) r5).A00;
        } else {
            if (r5 != null) {
                AnonymousClass1BI r1 = r5.A0J;
                if (C29681ch.A00(r1)) {
                    C17960vV.A07(r1);
                    rawString = r1.getRawString();
                    r2 = this.A00;
                    sb = new StringBuilder();
                    sb.append("tmpp");
                }
            }
            return this.A00.A0b("tmpp");
        }
        sb.append(rawString);
        return r2.A0b(sb.toString());
    }

    public void A05(AnonymousClass1E7 r2, byte[] bArr, boolean z) {
        File A012;
        if (z) {
            A012 = A00(r2);
        } else {
            A012 = A01(r2);
        }
        if (bArr == null) {
            return;
        }
        if (A012 != null) {
            C64062u9.A0L(A012, bArr);
        } else {
            Log.e("ContactPhotoUpdater/updatePhotoFiles/no thumb photo file when expected");
        }
    }

    public boolean A06(AnonymousClass1E7 r4) {
        Resources resources = this.A03.A00.getResources();
        if (this.A02.A04().A0A(r4.A08(resources.getDimension(2131168737), resources.getDimensionPixelSize(2131168739))) != null) {
            return true;
        }
        return false;
    }

    public C24791Lr(C218617r r1, AnonymousClass11S r2, C24771Lp r3, AnonymousClass11P r4, AnonymousClass118 r5) {
        this.A04 = r4;
        this.A03 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A03(AnonymousClass1E7 r3) {
        File A002 = A00(r3);
        if (A002 != null && A002.exists()) {
            A002.delete();
        }
        File A012 = A01(r3);
        if (A012 != null && A012.exists()) {
            A012.delete();
        }
    }

    public void A04(AnonymousClass1E7 r6) {
        String A07 = r6.A07();
        if (A07 != null) {
            C32071ga A042 = this.A02.A04();
            for (String str : A042.A02.A06().keySet()) {
                if (str.startsWith(A07)) {
                    A042.A0E(str);
                }
            }
        }
        r6.A0g = true;
        if (C22971Dz.A0V(r6.A0J)) {
            r6.A0E = System.currentTimeMillis();
        }
    }

    public boolean A07(AnonymousClass1E7 r3) {
        File A012 = A01(r3);
        if (((A012 == null || !A012.exists()) && (A012 = A00(r3)) == null) || !A012.exists()) {
            return false;
        }
        return true;
    }
}
