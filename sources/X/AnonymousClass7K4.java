package X;

import android.content.Context;
import com.whatsapp.ml.v2.repo.MLModelRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7K4  reason: invalid class name */
public abstract class AnonymousClass7K4 implements AnonymousClass8Ak {
    public final AnonymousClass118 A00;
    public final C18030ve A01;
    public final C127516eU A02;
    public final C128576gL A03;
    public final MLModelRepository A04;
    public final C138026wP A05 = new C138026wP(AnonymousClass00R.A00, TimeUnit.MILLISECONDS);

    public AnonymousClass7K4(C129126hI r8) {
        this.A01 = r8.A01;
        AnonymousClass118 r3 = r8.A00;
        this.A00 = r3;
        this.A04 = r8.A03;
        this.A02 = r8.A02;
        C18070vi.A0X(A00());
        Context context = r3.A00;
        String A0x = AnonymousClass3MW.A0x(context.getResources(), A02(), new Object[1], 0, 2131899547);
        C18070vi.A0X(A0x);
        this.A03 = new C128576gL(98, A0x, AnonymousClass3MY.A0m(context.getResources(), 2131898766));
    }

    public /* synthetic */ void BkW(AnonymousClass6TT r1) {
    }

    public static final String A00() {
        String[] strArr = AnonymousClass1X0.A04;
        return Locale.forLanguageTag("en").getDisplayLanguage(Locale.getDefault());
    }

    public static String A01(String str) {
        String[] strArr = AnonymousClass1X0.A04;
        String displayLanguage = Locale.forLanguageTag(str).getDisplayLanguage(Locale.getDefault());
        C18070vi.A0X(displayLanguage);
        return displayLanguage;
    }

    public String A02() {
        if (this instanceof AnonymousClass6AO) {
            return A01("ru");
        }
        if (this instanceof AnonymousClass6AN) {
            return A01("pt");
        }
        if (this instanceof AnonymousClass6AM) {
            return A01("hi");
        }
        if (this instanceof AnonymousClass6AL) {
            return A01("es");
        }
        if (this instanceof AnonymousClass6AK) {
            return A01("en");
        }
        if (this instanceof AnonymousClass6AJ) {
            return A01("en");
        }
        if (this instanceof AnonymousClass6AI) {
            return A01("en");
        }
        if (this instanceof AnonymousClass6AH) {
            return A01("en");
        }
        if (this instanceof AnonymousClass6AG) {
            return A01("en");
        }
        return A01("ar");
    }

    public String A03() {
        if (!(this instanceof AnonymousClass6AO) && !(this instanceof AnonymousClass6AN) && !(this instanceof AnonymousClass6AM) && !(this instanceof AnonymousClass6AL)) {
            if (this instanceof AnonymousClass6AK) {
                return A01("ru");
            }
            if (this instanceof AnonymousClass6AJ) {
                return A01("pt");
            }
            if (this instanceof AnonymousClass6AI) {
                return A01("hi");
            }
            if (this instanceof AnonymousClass6AH) {
                return A01("es");
            }
            if (this instanceof AnonymousClass6AG) {
                return A01("ar");
            }
        }
        String A002 = A00();
        C18070vi.A0X(A002);
        return A002;
    }

    public List BRe() {
        C122716Rq r0;
        String A022;
        AnonymousClass708 BV1 = BV1();
        AnonymousClass118 r5 = this.A00;
        String A023 = r5.A02(2131899553, A02(), A03());
        C18070vi.A0X(A023);
        MLModelRepository mLModelRepository = this.A04;
        if (this instanceof AnonymousClass6AO) {
            r0 = C122716Rq.TRANSLATION_RU_TO_EN;
        } else if (this instanceof AnonymousClass6AN) {
            r0 = C122716Rq.TRANSLATION_PT_TO_EN;
        } else if (this instanceof AnonymousClass6AM) {
            r0 = C122716Rq.TRANSLATION_HI_TO_EN;
        } else if (this instanceof AnonymousClass6AL) {
            r0 = C122716Rq.TRANSLATION_ES_TO_EN;
        } else if (this instanceof AnonymousClass6AK) {
            r0 = C122716Rq.TRANSLATION_EN_TO_RU;
        } else if (this instanceof AnonymousClass6AJ) {
            r0 = C122716Rq.TRANSLATION_EN_TO_PT;
        } else if (this instanceof AnonymousClass6AI) {
            r0 = C122716Rq.TRANSLATION_EN_TO_HI;
        } else if (this instanceof AnonymousClass6AH) {
            r0 = C122716Rq.TRANSLATION_EN_TO_ES;
        } else if (this instanceof AnonymousClass6AG) {
            r0 = C122716Rq.TRANSLATION_EN_TO_AR;
        } else {
            r0 = C122716Rq.TRANSLATION_AR_TO_EN;
        }
        ArrayList A032 = mLModelRepository.A03(r0);
        ArrayList A0D = C29351c6.A0D(A032);
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            AnonymousClass708 r9 = (AnonymousClass708) it.next();
            long A002 = C138776xf.A00(r9);
            boolean A18 = C18070vi.A18(r9, BV1);
            if (C18070vi.A18(r9, BV1)) {
                A022 = A023;
            } else {
                Object[] objArr = new Object[1];
                AnonymousClass3MX.A1S(objArr, 0, A002);
                A022 = r5.A02(2131899554, objArr);
                C18070vi.A0b(A022);
            }
            Object[] objArr2 = new Object[3];
            objArr2[0] = A02();
            objArr2[1] = A03();
            AnonymousClass3MX.A1S(objArr2, 2, A002);
            String A024 = r5.A02(2131899552, objArr2);
            C18070vi.A0X(A024);
            AnonymousClass708 BV12 = BV1();
            String A025 = r5.A02(2131899549, A02(), A03());
            C18070vi.A0X(A025);
            A0D.add(new AnonymousClass4V4(BV12, A025, A024, A022, C1591983p.A00, A18));
        }
        return A0D;
    }

    public C20078A6e Bbr() {
        Integer num;
        if (AnonymousClass3MX.A1T(C17880vN.A0C(this.A02.A01), "is_download_translation_model_wifi_only")) {
            num = AnonymousClass00R.A0C;
        } else {
            num = AnonymousClass00R.A01;
        }
        A1B a1b = new A1B();
        a1b.A00 = num;
        return a1b.A01();
    }

    public boolean isEnabled() {
        return C18020vd.A05(C18040vf.A02, this.A01, 9141);
    }

    public C138026wP BNJ() {
        return this.A05;
    }

    public C128576gL BVR() {
        return this.A03;
    }

    public List BXN() {
        return null;
    }
}
