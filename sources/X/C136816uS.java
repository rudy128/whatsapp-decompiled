package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6uS  reason: invalid class name and case insensitive filesystem */
public final class C136816uS {
    public final C218617r A00;
    public final C25311Ns A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public File A00(C139726zL r4, String[] strArr) {
        File A16 = C108945cZ.A16(this.A02);
        C18070vi.A0X(A16);
        File A0e = C17880vN.A0e(A16, "avatar-temporary");
        if (!(strArr == null || strArr.length == 0)) {
            A0e = A02(strArr);
        }
        A0e.mkdirs();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r4.A00);
        return C17880vN.A0e(A0e, AnonymousClass000.A0y(".webp", A10));
    }

    public File A01(C1418377d r10) {
        File file;
        String str = r10.A07;
        if (str == null) {
            return null;
        }
        File A002 = A00(new C139726zL(str), (String[]) null);
        A002.getAbsolutePath();
        if (!A002.exists() || A002.length() <= 0) {
            A002.createNewFile();
            Object A003 = ((C131686lV) this.A04.get()).A00(r10, A002, true);
            if (A003 instanceof AnonymousClass1IU) {
                Log.e("AvatarOnDemandStickerFileHandler/downloadStickerImageIntoFile/failed to download sticker");
                C136936ue A0p = C108945cZ.A0p(this.A03);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Exception = ");
                A0p.A02(2, "AvatarOnDemandStickerFileHandler/downloadStickerImageIntoFile", C17890vO.A0V(C30671eK.A00(A003), A10));
                A003 = null;
            }
            file = (File) A003;
            if (file == null) {
                return null;
            }
        } else {
            file = A002;
        }
        C108945cZ.A1O(r10, A002);
        return file;
    }

    public File A02(String[] strArr) {
        String str;
        File A16 = C108945cZ.A16(this.A02);
        C18070vi.A0X(A16);
        File A0e = C17880vN.A0e(A16, "avatar-temporary");
        if (strArr != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("social/social-");
            str = AnonymousClass000.A0y(C200410p.A0I("-", "", "", strArr), A10);
        } else {
            str = "social";
        }
        return C17880vN.A0e(A0e, str);
    }

    public void A03() {
        File A16 = C108945cZ.A16(this.A02);
        C18070vi.A0X(A16);
        File A0e = C17880vN.A0e(A16, "avatar-temporary");
        A0e.mkdirs();
        C21721ArX.A05(A0e);
    }

    public C136816uS(C218617r r1, C25311Ns r2, AnonymousClass118 r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r3, r1, r4, r2, r5);
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
    }
}
