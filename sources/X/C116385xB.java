package X;

import android.util.Base64;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5xB  reason: invalid class name and case insensitive filesystem */
public class C116385xB extends C60192nY {
    public final AnonymousClass11S A00;
    public final C34931lJ A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass1KB A05;
    public final C25311Ns A06;
    public final C18030ve A07;
    public final AnonymousClass1SB A08;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        int i3;
        long j;
        boolean z2;
        A6U a6u2 = a6u;
        C18070vi.A0d(a6u2, 2);
        String[] strArr = a6u2.A06;
        C62382rJ r3 = a6u2.A01;
        C166378cn r0 = a6u2.A03;
        String str6 = null;
        if (strArr.length == 2 && "favoriteSticker".equals(strArr[0])) {
            String str7 = strArr[1];
            if (str7.length() == 0) {
                C17900vP.A0e("favorite-sticker-mutation/from-key-value unable to create file hash from ", str7, AnonymousClass000.A10());
            } else if (C18070vi.A18(C62382rJ.A03, r3) && r0 != null && r0.A0R() && (r0.bitField0_ & 134217728) != 0) {
                C166008cC r1 = r0.stickerAction_;
                C166008cC r2 = r1;
                if (r1 == null) {
                    r1 = C166008cC.DEFAULT_INSTANCE;
                }
                if ((r1.bitField0_ & 256) != 0) {
                    C166008cC r12 = r2;
                    if (r2 == null) {
                        r12 = C166008cC.DEFAULT_INSTANCE;
                    }
                    if ((r12.bitField0_ & 512) != 0) {
                        C166008cC r13 = r2;
                        if (r2 == null) {
                            r13 = C166008cC.DEFAULT_INSTANCE;
                        }
                        i = r13.deviceIdHint_;
                    } else {
                        i = -1;
                    }
                    if (r2 == null) {
                        r2 = C166008cC.DEFAULT_INSTANCE;
                    }
                    if ((r2.bitField0_ & 2) != 0) {
                        str2 = Base64.encodeToString(r2.fileEncSha256_.A06(), 2);
                    } else {
                        str2 = null;
                    }
                    if ((r2.bitField0_ & 4) != 0) {
                        str3 = Base64.encodeToString(r2.mediaKey_.A06(), 1);
                    } else {
                        str3 = null;
                    }
                    int i4 = r2.bitField0_;
                    if ((i4 & 1) != 0) {
                        str4 = r2.url_;
                    } else {
                        str4 = null;
                    }
                    if ((i4 & 8) != 0) {
                        str5 = r2.mimetype_;
                    } else {
                        str5 = null;
                    }
                    if ((i4 & 32) != 0) {
                        i2 = r2.width_;
                    } else {
                        i2 = 0;
                    }
                    if ((i4 & 16) != 0) {
                        i3 = r2.height_;
                    } else {
                        i3 = 0;
                    }
                    if ((i4 & 64) != 0) {
                        str6 = r2.directPath_;
                    }
                    if ((i4 & 128) != 0) {
                        j = r2.fileLength_;
                    } else {
                        j = 0;
                    }
                    if ((i4 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                        z2 = r2.isLottie_;
                    } else {
                        z2 = false;
                    }
                    C136536ty r6 = new C136536ty(str7, str4, str2, str3, str5, str6, i2, i3, j, z2);
                    long j2 = r0.timestamp_;
                    C19999A2n a2n = a6u2.A02;
                    C166008cC r02 = r0.stickerAction_;
                    if (r02 == null) {
                        r02 = C166008cC.DEFAULT_INSTANCE;
                    }
                    return new C116955yu(r6, a2n, str, i, j2, z, r02.isFavorite_);
                }
            }
        }
        return null;
    }

    public static C1418377d A00(C116385xB r8, C116955yu r9) {
        C136536ty r1 = r9.A01;
        C1418377d r6 = new C1418377d();
        String str = r1.A07;
        r6.A0F = str;
        r6.A0I = r1.A08;
        r6.A0A = r1.A04;
        r6.A0D = r1.A05;
        String str2 = r1.A06;
        r6.A0E = str2;
        r6.A0Q = "application/was".equals(str2);
        r6.A03 = r1.A01;
        r6.A02 = r1.A00;
        String str3 = r1.A03;
        r6.A08 = str3;
        r6.A00 = (int) r1.A02;
        if (str3 == null) {
            Log.e("FavouriteStickerHandler/findStickerAndDownload Receive empty sticker direct path");
            return null;
        }
        AnonymousClass1SB r2 = r8.A08;
        C17960vV.A07(str);
        File A042 = r2.A04.A04(str, str2);
        C17960vV.A07(A042);
        if (A042.exists() || ((A042 = r2.A0A(r6, A042)) != null && A042.exists())) {
            C108985cd.A1B(r6, A042);
            AnonymousClass70H.A00(r6, r2.A0G);
            return r6;
        }
        C17900vP.A0g("StickerRepository/setFileForFavoriteSticker download fail, fileHash=", str, AnonymousClass000.A10());
        return null;
    }

    public static void A01(C116385xB r3, C1418377d r4, long j) {
        if (!r4.A0N && r3.A08.A0M(r4, Long.valueOf(j), true, true)) {
            r3.A05.A0J(new C70623Bv(r3, r4, 9));
        }
    }

    private void A02(String str) {
        AnonymousClass00H r2 = this.A03;
        C1418377d A012 = ((C140046zr) r2.get()).A01(str);
        if (A012 != null) {
            this.A06.A07(str, A012.A0E);
            ((C140046zr) r2.get()).A02(str);
            this.A05.A0J(new C70623Bv(this, A012, 10));
        }
    }

    public List A0F(boolean z) {
        Log.i("FavoriteStickerHandler/createBootstrapMutations");
        C17960vV.A00();
        ArrayList A012 = ((C140046zr) this.A03.get()).A05.A01(150, 1);
        ArrayList A0g = C108975cc.A0g(A012);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            C136656uA r3 = (C136656uA) it.next();
            C108965cb.A1Q(new C136536ty(r3.A0C, r3.A0F, r3.A0B, r3.A0D, r3.A0E, r3.A09, r3.A06, r3.A05, (long) r3.A04, r3.A03), Long.valueOf(r3.A07), A0g);
        }
        ArrayList A0g2 = C108975cc.A0g(A0g);
        Iterator it2 = A0g.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            int A062 = this.A00.A06();
            C136536ty r6 = (C136536ty) pair.first;
            A0g2.add(new C116955yu(r6, (C19999A2n) null, (String) null, A062, C17880vN.A05(pair.second), false, C108975cc.A1K(r6)));
        }
        return A0g2;
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C116955yu r4 = (C116955yu) a8l;
        String str = r4.A01.A07;
        if (!r4.A02) {
            A02(str);
        } else if (((C140046zr) this.A03.get()).A01(str) == null) {
            C1418377d A002 = A00(this, r4);
            if (A002 != null) {
                A01(this, A002, r4.A04);
            } else {
                return;
            }
        }
        A07(r4);
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        C116955yu r3 = (C116955yu) a8l;
        String str = r3.A01.A07;
        if (!r3.A02) {
            A02(str);
        } else if (((C140046zr) this.A03.get()).A01(str) == null) {
            A06(r3);
            return;
        }
        A08(r3);
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        C116955yu r6 = (C116955yu) a8l;
        if (a8l2 == null || a8l2.A04 <= r6.A04) {
            String str = r6.A01.A07;
            if (!r6.A02) {
                A02(str);
            } else if (((C140046zr) this.A03.get()).A01(str) == null) {
                if (a8l2 != null) {
                    A06(a8l2);
                }
                A0A(r6);
                C108955ca.A1R(this.A02, this, r6, 8);
                return;
            }
            A0B(r6, a8l2);
            return;
        }
        A09(r6);
    }

    public boolean A0J() {
        return C18020vd.A05(C18040vf.A02, this.A07, 2775);
    }

    public C116385xB(AnonymousClass1KB r1, AnonymousClass11S r2, C25311Ns r3, C34931lJ r4, C26331Rs r5, C18030ve r6, AnonymousClass1SB r7, AnonymousClass10I r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        super(r5);
        this.A07 = r6;
        this.A05 = r1;
        this.A00 = r2;
        this.A02 = r8;
        this.A03 = r9;
        this.A04 = r10;
        this.A08 = r7;
        this.A06 = r3;
        this.A01 = r4;
    }

    public String A0D() {
        return "regular_low";
    }

    public String A0E() {
        return "favoriteSticker";
    }
}
