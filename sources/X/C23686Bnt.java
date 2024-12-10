package X;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewOutlineProvider;

/* renamed from: X.Bnt  reason: case insensitive filesystem */
public class C23686Bnt extends DFO {
    public final boolean A00;

    public static final void A00(DOZ doz, DFL dfl, BV1 bv1, BV9 bv9) {
        int i;
        C18070vi.A0e(bv1, 1, dfl);
        if (Build.VERSION.SDK_INT >= 28) {
            COI coi = bv9.A02;
            C18070vi.A0W(coi);
            C25886Cnx.A01(bv1, coi);
        }
        String A0D = dfl.A0D(48);
        if (A0D != null) {
            float A01 = A90.A01(A0D);
            if (A01 != 0.0f) {
                bv1.setElevation(A01);
                bv1.setOutlineProvider(new C22650BHo(dfl, 1));
                if (Build.VERSION.SDK_INT >= 28) {
                    COI coi2 = bv9.A02;
                    C18070vi.A0W(coi2);
                    C25886Cnx.A00(doz, dfl, bv1, coi2);
                }
            }
        }
        float A02 = BEA.A02(dfl, 46);
        int i2 = (A02 > 0.0f ? 1 : (A02 == 0.0f ? 0 : -1));
        if (dfl.A0I(43, false)) {
            if (i2 != 0) {
                bv1.setOutlineProvider(new C22652BHq(dfl, A02));
                float A022 = BEA.A02(dfl, 40);
                int A002 = C25887Cny.A00(dfl.A0G(56), 0);
                if (A022 != 0.0f || !C25887Cny.A02(A002)) {
                    CUC cuc = bv1.A00;
                    cuc.A04 = true;
                    cuc.A0B.setLayerType(2, (Paint) null);
                    DFL A09 = dfl.A09(45);
                    String A0D2 = dfl.A0D(44);
                    if (A0D2 != null) {
                        i = A90.A04(A0D2);
                    } else {
                        i = 0;
                    }
                    if (A09 != null) {
                        try {
                            String A0D3 = A09.A0D(35);
                            if (A0D3 == null || A90.A04(A0D3) == 0) {
                                String A0e = BE7.A0e(A09);
                                if (A0e != null) {
                                    if (A90.A04(A0e) == 0) {
                                    }
                                }
                            }
                        } catch (AnonymousClass9HX unused) {
                            C25913CoX.A01("ThemedColorUtils", "Error parsing themed color");
                        }
                        i = C25340Cdz.A00(doz, A09);
                    }
                    int A003 = C25885Cnw.A00(doz, dfl);
                    float[] A023 = C25885Cnw.A02(dfl.A0G(62));
                    float A024 = BEA.A02(dfl, 63);
                    cuc.A03 = A002;
                    cuc.A02 = A02;
                    Paint paint = cuc.A06;
                    paint.setColor(i);
                    if (i == 0) {
                        C108965cb.A11(paint, PorterDuff.Mode.CLEAR);
                    }
                    int i3 = (A022 > 0.0f ? 1 : (A022 == 0.0f ? 0 : -1));
                    Paint paint2 = cuc.A05;
                    if (i3 != 0) {
                        paint2.setColor(A003);
                    } else {
                        paint2.setColor(0);
                    }
                    AnonymousClass3MW.A1P(paint2);
                    paint2.setStrokeWidth(A022);
                    if (A022 > 0.0f && A023 != null) {
                        paint2.setPathEffect(new DashPathEffect(A023, A024));
                    }
                    Path path = cuc.A08;
                    path.setFillType(Path.FillType.EVEN_ODD);
                    float f = A022 / 2.0f;
                    cuc.A00 = f;
                    cuc.A01 = cuc.A02 - f;
                    path.reset();
                    return;
                }
                bv1.setClipToOutline(true);
            }
        } else if (i2 != 0) {
            bv1.setOutlineProvider(new C22650BHo(dfl, 2));
        }
    }

    public static final void A01(BV1 bv1, BV9 bv9) {
        bv1.setElevation(0.0f);
        bv1.setClipToOutline(false);
        bv1.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        if (Build.VERSION.SDK_INT >= 28) {
            COI coi = bv9.A02;
            C18070vi.A0W(coi);
            C25886Cnx.A02(bv1, coi);
        }
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C01930Bz r5 = (C01930Bz) obj;
        BV9 bv9 = (BV9) obj2;
        if (bv9.A01 != null) {
            BV1 bv1 = (BV1) r5;
            CUC cuc = bv1.A00;
            cuc.A04 = false;
            cuc.A0B.setLayerType(0, (Paint) null);
            A01(bv1, bv9);
            Drawable drawable = bv9.A03;
            Drawable drawable2 = bv9.A02;
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            if (drawable2 instanceof Animatable) {
                ((Animatable) drawable2).stop();
            }
        }
    }

    public C23686Bnt(DOZ doz, long j) {
        super(doz, j);
        this.A00 = !C26272CwJ.A08(doz);
    }
}
