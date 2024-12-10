package X;

import android.util.Base64;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.70H  reason: invalid class name */
public final class AnonymousClass70H {
    public final WamediaManager A00;
    public final AnonymousClass00H A01;

    public final C1418377d A01(C441322g r33) {
        String str;
        C441322g r1 = r33;
        C18070vi.A0d(r1, 0);
        C1418377d r6 = r1.A00;
        int i = 1;
        if (r6 != null && r6.A04 != null && r6.A0F != null) {
            return r6;
        }
        C1418377d r62 = new C1418377d((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false, false, false);
        C62572rc r2 = r1.A02;
        if (r2 != null) {
            File file = r2.A0G;
            String A19 = r1.A19();
            if (file != null && file.exists()) {
                C108945cZ.A1O(r62, file);
                r62.A01 = 1;
            } else if (A19 != null) {
                r62.A0B = A19;
                r62.A01 = 3;
            }
            r62.A0F = r1.A05;
            r62.A0A = r1.A08;
            r62.A03 = r2.A08;
            r62.A02 = r2.A06;
            r62.A0E = r1.A06;
            byte[] bArr = r2.A0a;
            if (bArr != null) {
                str = Base64.encodeToString(bArr, 1);
            } else {
                str = null;
            }
            r62.A0D = str;
            if (r1.A0v.A02) {
                i = 2;
            }
            r62.A05 = Integer.valueOf(i);
            String str2 = r2.A0J;
            if (str2 != null) {
                r62.A08 = str2;
            }
        }
        r62.A0Q = r1.A1I();
        A05(r62);
        r1.A00 = r62;
        return r62;
    }

    public final AnonymousClass73B A04(String str, byte[] bArr) {
        StringBuilder sb;
        String str2;
        C18070vi.A0d(bArr, 0);
        if (!"application/was".equals(str)) {
            return AnonymousClass73B.A01(bArr);
        }
        this.A01.get();
        try {
            return AnonymousClass73B.A00(C17880vN.A16(C108955ca.A13(bArr)));
        } catch (JSONException e) {
            e = e;
            sb = AnonymousClass000.A10();
            str2 = "LottieUtils/getMetadataFromBytes error getting metadata json ";
            Log.w(C17900vP.A0C(str2, sb, e));
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = AnonymousClass000.A10();
            str2 = "LottieUtils/getMetadataFromBytes exception retrieving lottie file ";
            Log.w(C17900vP.A0C(str2, sb, e));
            return null;
        }
    }

    public final void A06(List list) {
        String str;
        C18070vi.A0d(list, 0);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1418377d A0x = C108945cZ.A0x(it);
                if (!(A0x.A04 != null || (str = A0x.A0B) == null || str.length() == 0)) {
                    A05(A0x);
                }
            }
        }
    }

    public final AnonymousClass73B A02(File file, String str) {
        Integer num;
        boolean equalsIgnoreCase = "application/was".equalsIgnoreCase(str);
        String absolutePath = file.getAbsolutePath();
        if (equalsIgnoreCase) {
            C18070vi.A0X(absolutePath);
            num = AnonymousClass00R.A01;
        } else {
            C18070vi.A0X(absolutePath);
            num = AnonymousClass00R.A00;
        }
        return A03(num, absolutePath);
    }

    public final void A05(C1418377d r5) {
        AnonymousClass73B A012;
        AnonymousClass73B r1 = r5.A04;
        String str = null;
        if (r1 != null) {
            str = r1.A05;
        }
        r5.A06 = str;
        if (r1 != null) {
            String str2 = r5.A09;
            if (str2 == null || str2.length() == 0) {
                AnonymousClass737[] r0 = r1.A0H;
                if (r0 != null) {
                    r5.A09 = C137426vR.A00(r0);
                }
            }
            r5.A0N = r1.A0F;
            r5.A0J = r1.A0B;
            r5.A07 = r1.A07;
            r5.A0K = r1.A0C;
            r5.A0L = r1.A0D;
            r5.A0M = r1.A0E;
            return;
        }
        String str3 = r5.A0B;
        if (str3 != null && str3.length() != 0) {
            if (r5.A01() == AnonymousClass00R.A01) {
                AnonymousClass72L r12 = (AnonymousClass72L) this.A01.get();
                String str4 = r5.A0B;
                if (str4 != null) {
                    A012 = r12.A05(str4);
                } else {
                    return;
                }
            } else {
                WamediaManager wamediaManager = this.A00;
                C17960vV.A07(str3);
                A012 = AnonymousClass73B.A01(wamediaManager.extractWebpMetadataBytes(str3));
            }
            if (A012 != null) {
                r5.A04 = A012;
                r5.A0J = A012.A0B;
                r5.A0N = A012.A0F;
                r5.A07 = A012.A07;
                r5.A0K = A012.A0C;
                r5.A0L = A012.A0D;
                r5.A0M = A012.A0E;
                String str5 = A012.A05;
                if (str5 == null || !(!AnonymousClass1YF.A0T(str5))) {
                    str5 = r5.A06;
                }
                r5.A06 = str5;
                AnonymousClass737[] r02 = A012.A0H;
                if (r02 != null) {
                    r5.A09 = C137426vR.A00(r02);
                }
            }
        }
    }

    public AnonymousClass70H(WamediaManager wamediaManager, AnonymousClass00H r2) {
        C18070vi.A0j(r2, wamediaManager);
        this.A01 = r2;
        this.A00 = wamediaManager;
    }

    public static void A00(C1418377d r1, AnonymousClass00H r2) {
        ((AnonymousClass70H) r2.get()).A05(r1);
    }

    public final AnonymousClass73B A03(Integer num, String str) {
        C18070vi.A0h(str, num);
        if (num == AnonymousClass00R.A01) {
            return ((AnonymousClass72L) this.A01.get()).A05(str);
        }
        return AnonymousClass73B.A01(this.A00.extractWebpMetadataBytes(str));
    }
}
