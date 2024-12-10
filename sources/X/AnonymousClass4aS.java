package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;

/* renamed from: X.4aS  reason: invalid class name */
public abstract class AnonymousClass4aS {
    public static final Integer A00(Intent intent) {
        if (intent != null) {
            switch (intent.getIntExtra("mat_entry_point", 0)) {
                case 2:
                    return AnonymousClass00R.A03;
                case 3:
                    return AnonymousClass00R.A0N;
                case 4:
                    return AnonymousClass00R.A0j;
                case 5:
                    return AnonymousClass00R.A0u;
                case 6:
                    return AnonymousClass00R.A0Y;
                case 7:
                    return AnonymousClass00R.A19;
                case 8:
                    return AnonymousClass00R.A02;
                case 9:
                    return AnonymousClass00R.A18;
                case 11:
                    return AnonymousClass00R.A05;
                case 12:
                    return AnonymousClass00R.A06;
                case 13:
                    return AnonymousClass00R.A07;
                case 14:
                    return AnonymousClass00R.A08;
                case 15:
                    return AnonymousClass00R.A09;
                case 16:
                    return AnonymousClass00R.A0A;
                case 17:
                    return AnonymousClass00R.A0B;
                case 18:
                    return AnonymousClass00R.A0D;
                case 19:
                    return AnonymousClass00R.A0E;
                case 23:
                    return AnonymousClass00R.A0F;
                case 24:
                    return AnonymousClass00R.A0G;
                case 27:
                    return AnonymousClass00R.A0H;
                case 28:
                    return AnonymousClass00R.A0I;
            }
        }
        return AnonymousClass00R.A00;
    }

    public static final String A02(Intent intent) {
        int intExtra = intent.getIntExtra("extra_forwarded_message_thread_type", -1);
        int intExtra2 = intent.getIntExtra("mat_entry_point", 0);
        if (intExtra == -1) {
            return null;
        }
        if (intExtra2 == 7 || intExtra2 == 4) {
            return C17900vP.A08(Integer.valueOf(intExtra));
        }
        return null;
    }

    public static final String A03(C18000vb r7, AnonymousClass4XM r8, AnonymousClass206 r9) {
        int i;
        C18070vi.A0e(r7, 1, r8);
        C691336a A00 = C50382Uf.A00(r9);
        if (A00 == null) {
            return null;
        }
        long j = A00.A03;
        if (j > 0) {
            i = Long.valueOf(j);
        } else {
            i = 1;
        }
        int A002 = AnonymousClass4XM.A00(r8, AnonymousClass000.A0M(i));
        String A01 = r8.A01(A002);
        C18070vi.A0d(A01, 1);
        int i2 = 2131755276;
        if (r9 instanceof C441822l) {
            i2 = 2131755274;
        }
        String A0K = r7.A0K(new Object[]{A01}, i2, (long) A002);
        C18070vi.A0X(A0K);
        return new C41661wr("\\s{2,}|^[\\s]|\\s+$").A00(AnonymousClass1YE.A07(A0K, "•", "", false), "");
    }

    public static final void A05(AnonymousClass1KB r3, AnonymousClass11C r4, AnonymousClass1CJ r5, AnonymousClass206 r6) {
        Object obj;
        ClipboardManager A09 = r4.A09();
        if (A09 != null) {
            String A04 = A04(r5, r6);
            if (A04 != null) {
                try {
                    A09.setPrimaryClip(ClipData.newPlainText(A04, A04));
                    r3.A08(2131892723, 0);
                    obj = C27621Wu.A00;
                } catch (Throwable th) {
                    obj = new AnonymousClass1IU(th);
                }
                if (C30671eK.A00(obj) == null) {
                    return;
                }
            } else {
                return;
            }
        }
        r3.A08(2131897878, 0);
    }

    public static final boolean A08(AnonymousClass1CJ r4, C29681ch r5, AnonymousClass1c4 r6) {
        C46162Dk r2;
        C18070vi.A0d(r4, 0);
        C18070vi.A0e(r6, 1, r5);
        C29691ci A00 = AnonymousClass1CJ.A00(r4, r5);
        if (!(A00 instanceof C46162Dk) || (r2 = (C46162Dk) A00) == null) {
            return true;
        }
        if (r2.A0A || r2.A0S(r6)) {
            return false;
        }
        return true;
    }

    public static final boolean A09(AnonymousClass1CJ r4, C29681ch r5, AnonymousClass1c4 r6) {
        C46162Dk r2;
        C18070vi.A0d(r6, 1);
        C29691ci A00 = AnonymousClass1CJ.A00(r4, r5);
        if (!(A00 instanceof C46162Dk) || (r2 = (C46162Dk) A00) == null) {
            return true;
        }
        if (r2.A0A) {
            return false;
        }
        if (!r2.A0S(r6) || r2.A0P()) {
            return true;
        }
        return false;
    }

    public static final boolean A0A(C46162Dk r4, AnonymousClass1c4 r5) {
        boolean z;
        C18070vi.A0d(r5, 1);
        if (r4.A0P()) {
            z = true;
            if (C18020vd.A00(C18040vf.A02, r5.A02, 4721) >= 1) {
                return z;
            }
            return false;
        }
        int i = 3;
        if (AnonymousClass000.A1Z(r4.A02, C179509Ig.SUBSCRIBED)) {
            i = 2;
        }
        z = true;
        if (C18020vd.A00(C18040vf.A02, r5.A02, 4721) < i) {
            return false;
        }
        return z;
    }

    public static final String A04(AnonymousClass1CJ r4, AnonymousClass206 r5) {
        C46162Dk r2;
        String str;
        C29691ci A0A = r4.A0A(r5.A0v.A00);
        if (!(A0A instanceof C46162Dk) || (r2 = (C46162Dk) A0A) == null || (str = r2.A0S) == null) {
            return null;
        }
        long j = r5.A0y;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("https://whatsapp.com/channel/");
        A10.append(str);
        A10.append('/');
        A10.append(j);
        return A10.toString();
    }

    public static String A01(Activity activity) {
        Intent intent = activity.getIntent();
        C18070vi.A0X(intent);
        return A02(intent);
    }

    public static final void A06(AnonymousClass1CJ r5, AnonymousClass1BI r6) {
        Long l;
        C29691ci A0A = r5.A0A(r6);
        if (A0A == null || (l = A0A.A09()) == null) {
            l = 0L;
        }
        if (l.longValue() <= 0) {
            r5.A0L(r6);
        }
    }

    public static final boolean A07(AnonymousClass11P r4, AnonymousClass206 r5) {
        C18070vi.A0h(r4, r5);
        if (AnonymousClass25A.A0a(r5) || AnonymousClass3MZ.A05(r4, r5) >= 2592000000L) {
            return false;
        }
        return true;
    }
}
