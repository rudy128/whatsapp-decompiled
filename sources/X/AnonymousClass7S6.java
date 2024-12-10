package X;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import com.whatsapp.usernames.UsernameSearchManager$setSearchSource$2$1;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.concurrent.CancellationException;

/* renamed from: X.7S6  reason: invalid class name */
public class AnonymousClass7S6 implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;

    public AnonymousClass7S6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object invoke(Object obj) {
        AnonymousClass1D6 r0;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                C111295jU r2 = (C111295jU) this.A01;
                r2.A1S.put(obj, AnonymousClass000.A0i());
                C111295jU.A08(r2);
                return null;
            case 1:
                ((C111295jU) this.A01).A0m((AnonymousClass77M) obj);
                return null;
            case 2:
            case 3:
                AnonymousClass7HR r3 = (AnonymousClass7HR) this.A01;
                C136156tM r11 = (C136156tM) obj;
                C18070vi.A0d(r11, 1);
                if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(r3.A00), 12096)) {
                    C108945cZ.A0e(r3.A02).A03(50, 1, 16);
                }
                AnonymousClass1FL r22 = r11.A02;
                String str3 = r11.A04;
                ((C138046wR) r3.A03.get()).A01.get();
                Intent A1I = AnonymousClass1LU.A1I(r22, (Integer) null, str3, (String) null, 24, 37, 68, true);
                A1I.putExtra("include", 1);
                A1I.putExtra("max_items", 1);
                r22.startActivityForResult(A1I, 102);
                break;
            case 4:
                AnonymousClass7HR r4 = (AnonymousClass7HR) this.A01;
                C136156tM r112 = (C136156tM) obj;
                C18070vi.A0d(r112, 1);
                if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(r4.A00), 12096)) {
                    C108945cZ.A0e(r4.A02).A03(C108955ca.A0f(), 1, 16);
                }
                ((C131946lv) r4.A01.get()).A00(r112.A02, new AnonymousClass778(r112.A03, r112.A05, r112.A04), r112.A00);
                break;
            case 5:
                C130756jx r42 = (C130756jx) this.A01;
                String str4 = (String) obj;
                C18070vi.A0b(str4);
                int A0C = AnonymousClass1YF.A0C(str4, '#', 0, false);
                if (A0C == -1) {
                    String A0I = AnonymousClass1YF.A0I(str4);
                    int length = A0I.length();
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            str2 = "";
                        } else if (A0I.charAt(i) == '@') {
                            i++;
                        } else {
                            str2 = C108955ca.A0z(A0I, i);
                        }
                    }
                    r0 = AnonymousClass1D6.A01(str2, (Object) null);
                } else {
                    String A0I2 = AnonymousClass1YF.A0I(C108955ca.A0q(0, A0C, str4));
                    int length2 = A0I2.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            str = "";
                        } else if (A0I2.charAt(i2) == '@') {
                            i2++;
                        } else {
                            str = C108955ca.A0z(A0I2, i2);
                        }
                    }
                    r0 = AnonymousClass1D6.A01(str, C108955ca.A0z(str4, A0C + 1));
                }
                String str5 = (String) r0.first;
                String str6 = (String) r0.second;
                AnonymousClass1OB r02 = r42.A01;
                if (r02 != null) {
                    r02.BEM((CancellationException) null);
                }
                r42.A02.A0E(C18460wS.A00);
                if (C124516Yq.A00.A03(str5)) {
                    r42.A01 = AnonymousClass3MY.A0s(new UsernameSearchManager$setSearchSource$2$1(r42, str5, str6, (C30391dr) null), r42.A08);
                    break;
                }
                break;
            case 6:
                ((AnonymousClass74M) this.A01).A1K.set(((Number) obj).intValue());
                return null;
            case 7:
                AnonymousClass1FU r23 = (AnonymousClass1FU) this.A01;
                AnonymousClass7RN.A00(r23.A05, r23, obj, 11);
                break;
            case 8:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A01;
                int A0M = AnonymousClass000.A0M(obj);
                if (A0M != 1) {
                    if (A0M == 2 || A0M == 3 || A0M == 4) {
                        VoipActivityV2.A1m(voipActivityV2, true);
                        break;
                    }
                } else {
                    VoipActivityV2.A1h(voipActivityV2, 13, 5);
                    VoipActivityV2.A1b(voipActivityV2);
                    break;
                }
            case 9:
                C43081zE r24 = (C43081zE) this.A01;
                Canvas canvas = (Canvas) obj;
                PorterDuffXfermode porterDuffXfermode = C43081zE.A0S;
                C18070vi.A0d(canvas, 1);
                canvas.drawPath(r24.A0B, (Paint) r24.A0R.getValue());
                break;
            default:
                PorterDuffXfermode porterDuffXfermode2 = C43081zE.A0S;
                AnonymousClass3Ma.A1Q((C18090vk) this.A01);
                break;
        }
        return C27621Wu.A00;
    }
}
