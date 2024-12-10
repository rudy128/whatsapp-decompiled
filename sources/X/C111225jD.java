package X;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.Editable;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$callIntentsRepository$1;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$editImageFromPrompt$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.5jD  reason: invalid class name and case insensitive filesystem */
public final class C111225jD extends AnonymousClass1J2 {
    public AnonymousClass181 A00;
    public AnonymousClass6RH A01;
    public C32951i1 A02;
    public C1194868i A03;
    public AnonymousClass00H A04;
    public Integer A05;
    public String A06;
    public List A07 = C18460wS.A00;
    public AtomicBoolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final Uri A0F;
    public final AnonymousClass1DT A0G = C108945cZ.A0S();
    public final AnonymousClass1DT A0H = C108945cZ.A0S();
    public final AnonymousClass1DT A0I = C108945cZ.A0S();
    public final AnonymousClass1DT A0J = AnonymousClass3MW.A0M(AnonymousClass6R4.MEDIUM);
    public final AnonymousClass1DT A0K = C108945cZ.A0S();
    public final AnonymousClass1DT A0L = C108945cZ.A0S();
    public final AnonymousClass1DT A0M = C108945cZ.A0S();
    public final AnonymousClass1DT A0N = C108945cZ.A0S();
    public final AnonymousClass1DT A0O = C108945cZ.A0S();
    public final AnonymousClass1DT A0P = C108945cZ.A0S();
    public final AnonymousClass1DT A0Q = C108945cZ.A0S();
    public final AnonymousClass1DT A0R = AnonymousClass3MW.A0M(AnonymousClass6RA.IMAGINE_FLASH);
    public final AnonymousClass1DT A0S = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0T = C108945cZ.A0S();
    public final AnonymousClass1DT A0U = AnonymousClass3MW.A0M(AnonymousClass6RH.INIT);
    public final C218617r A0V;
    public final AnonymousClass1KB A0W;
    public final C34531kd A0X;
    public final C129966if A0Y;
    public final C25781Pp A0Z;
    public final A06 A0a;
    public final AnonymousClass4T1 A0b;
    public final AnonymousClass11C A0c;
    public final AnonymousClass11P A0d;
    public final C130066ip A0e;
    public final C127226e0 A0f;
    public final C18030ve A0g;
    public final C24371Kb A0h;
    public final AnonymousClass1BI A0i;
    public final C24421Kg A0j;
    public final C41731wy A0k = AnonymousClass3MW.A0o();
    public final C41731wy A0l = AnonymousClass3MW.A0o();
    public final C41731wy A0m = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A0n;
    public final AnonymousClass00H A0o;
    public final AnonymousClass00H A0p;
    public final AnonymousClass00H A0q;
    public final AnonymousClass00H A0r;
    public final AnonymousClass00H A0s;
    public final AnonymousClass00H A0t;
    public final AnonymousClass00H A0u;
    public final AtomicLong A0v;
    public final C18600wl A0w;

    public static final void A05(Editable editable, C111225jD r6, boolean z) {
        Editable editable2 = editable;
        String valueOf = String.valueOf(editable);
        C111225jD r3 = r6;
        C130296jC A032 = A03(r6);
        if (A032 != null) {
            String str = A032.A04;
            if (!r6.A0D) {
                AnonymousClass3MX.A1Q(new AiImagineBottomSheetViewModel$editImageFromPrompt$1(editable2, r3, str, valueOf, (C30391dr) null, z), C41561wd.A00(r6));
            }
        }
    }

    public static final void A06(AnonymousClass6RH r4, C111225jD r5, String str, int i, boolean z) {
        AnonymousClass3MX.A1Q(new AiImagineBottomSheetViewModel$callIntentsRepository$1(r4, r5, str, (C30391dr) null, i, z), C41561wd.A00(r5));
    }

    public static final void A0C(C111225jD r3, boolean z) {
        AnonymousClass1DT r4;
        List A10;
        if (z) {
            C127036dh r2 = new C127036dh((C130296jC) null);
            r2.A01.A0F(AnonymousClass6R5.LOAD_MORE);
            r4 = r3.A0G;
            List A102 = AnonymousClass3MW.A10(r4);
            if (A102 != null) {
                A102.add(r2);
            }
        } else {
            r4 = r3.A0G;
            List A103 = AnonymousClass3MW.A10(r4);
            if (A103 != null) {
                Iterator it = A103.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((C127036dh) next).A01.A06() == AnonymousClass6R5.LOAD_MORE) {
                        if (next != null && (A10 = AnonymousClass3MW.A10(r4)) != null) {
                            A10.remove(next);
                        }
                    }
                }
            }
        }
        r4.A0F(r4.A06());
    }

    public final void A0Y(List list) {
        Object A062;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            C127036dh r1 = (C127036dh) next;
            C130296jC r0 = r1.A00;
            if (!(r0 == null || r0.A00 == null || (A062 = r1.A01.A06()) == null)) {
                if (A062 == AnonymousClass6R5.DISPLAY_IMAGE_SELECTED || A062 == AnonymousClass6R5.DISPLAY_IMAGE_NOT_SELECTED) {
                    A13.add(next);
                }
            }
        }
        for (Object next2 : A13) {
            AnonymousClass1DT r12 = this.A0T;
            if (r12.A06() == null) {
                A0X(AnonymousClass1ZU.A05(next2));
            } else {
                List A10 = AnonymousClass3MW.A10(r12);
                if (A10 != null) {
                    A10.add(next2);
                }
            }
        }
        AnonymousClass1DT r13 = this.A0T;
        C18070vi.A0d(r13, 0);
        r13.A0F(r13.A06());
    }

    private final int A00() {
        int i;
        List<C127036dh> A10 = AnonymousClass3MW.A10(this.A0G);
        if (A10 == null) {
            return 0;
        }
        if (!(A10 instanceof Collection) || !A10.isEmpty()) {
            i = 0;
            for (C127036dh r0 : A10) {
                Object A062 = r0.A01.A06();
                if (A062 != null && ((A062 == AnonymousClass6R5.DISPLAY_IMAGE_SELECTED || A062 == AnonymousClass6R5.DISPLAY_IMAGE_NOT_SELECTED) && (i = i + 1) < 0)) {
                    AnonymousClass1ZU.A0A();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public static C130296jC A03(C111225jD r0) {
        return (C130296jC) r0.A0O.A06();
    }

    public static final void A04(Editable editable, C111225jD r4) {
        r4.A0P.A0E(editable);
        r4.A0V(AnonymousClass6RH.LOADING_SCREEN_GENERATING_IMAGINE_ME);
        r4.A0Z.A06(25, true);
        String valueOf = String.valueOf(editable);
        int i = 1;
        if (A0D(r4)) {
            i = 3;
        }
        A06(AnonymousClass6RH.IMAGINE_ME, r4, valueOf, i, false);
    }

    public static final void A07(C111225jD r4) {
        SharedPreferences A002;
        C200710s r1;
        int i;
        C25781Pp r12 = r4.A0Z;
        if (r12.A07(2)) {
            boolean z = r4.A0D;
            C32951i1 r42 = r4.A02;
            AnonymousClass1BI r3 = r12.A02;
            if (z) {
                if (r3 != null) {
                    A002 = C32951i1.A00(r42);
                    r1 = r42.A0T;
                    i = 42;
                } else {
                    return;
                }
            } else if (r3 != null) {
                A002 = C32951i1.A00(r42);
                r1 = r42.A0T;
                i = 23;
            } else {
                return;
            }
            C108965cb.A1K(r1, r42, r3, A002, i);
        }
    }

    public static final void A08(C111225jD r3, int i) {
        r3.A0W.A0J(new AnonymousClass7RP(r3, i, 26));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r0.intValue() != 0) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(X.C111225jD r6, X.C130296jC r7) {
        /*
            X.1DT r5 = r6.A0G
            java.util.List r0 = X.AnonymousClass3MW.A10(r5)
            r4 = 0
            if (r0 == 0) goto L_0x012c
            java.util.Iterator r3 = r0.iterator()
        L_0x000d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.6dh r0 = (X.C127036dh) r0
            X.1DT r0 = r0.A01
            java.lang.Object r1 = r0.A06()
            X.6R5 r0 = X.AnonymousClass6R5.LOADING
            if (r1 != r0) goto L_0x000d
        L_0x0024:
            X.6dh r2 = (X.C127036dh) r2
        L_0x0026:
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x00e9
            r2.A00 = r7
            X.1DT r1 = r2.A01
            X.6R5 r0 = X.AnonymousClass6R5.DISPLAY_IMAGE_NOT_SELECTED
            r1.A0F(r0)
            X.6dh[] r0 = new X.C127036dh[r3]
            r0[r4] = r2
            java.util.ArrayList r0 = X.AnonymousClass1ZU.A05(r0)
            r6.A0Y(r0)
            java.lang.Object r0 = r5.A06()
            r5.A0F(r0)
            X.6R5 r4 = X.AnonymousClass6R5.LOADING
            java.util.List r1 = X.AnonymousClass3MW.A10(r5)
            if (r1 == 0) goto L_0x0064
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00c7
            r2 = 0
        L_0x0058:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x0064
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x00bd
        L_0x0064:
            boolean r0 = r6.A09
            if (r0 == r3) goto L_0x00bd
            int r2 = r6.A00()
            r0 = 2
            if (r2 < r0) goto L_0x00bd
            X.1DT r0 = r6.A0U
            java.lang.Object r1 = r0.A06()
            X.6RH r0 = X.AnonymousClass6RH.SELECTING_OPTION
            if (r1 != r0) goto L_0x00bd
            r6.A09 = r3
            X.1Pp r3 = r6.A0Z
            int r4 = r2 + -1
            X.1BI r0 = r3.A02
            if (r0 == 0) goto L_0x00bd
            X.63w r2 = new X.63w
            r2.<init>()
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            int r0 = r3.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04 = r0
            r0 = 26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            java.lang.Integer r0 = r3.A03
            r2.A05 = r0
            boolean r1 = r3.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A01 = r0
            java.lang.Boolean r0 = X.C108945cZ.A1A(r1)
            r2.A00 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r4)
            r2.A07 = r0
            X.18K r0 = r3.A05
            r0.CC7(r2)
        L_0x00bd:
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x00c6
            X.1DT r0 = r6.A0O
            r0.A0E(r7)
        L_0x00c6:
            return
        L_0x00c7:
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x00cc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r1.next()
            X.6dh r0 = (X.C127036dh) r0
            X.1DT r0 = r0.A01
            java.lang.Object r0 = r0.A06()
            if (r0 != r4) goto L_0x00cc
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x00cc
            X.AnonymousClass1ZU.A0A()
            r0 = 0
            throw r0
        L_0x00e9:
            X.1DT r0 = r6.A0U
            java.lang.Object r1 = r0.A06()
            X.6RH r0 = X.AnonymousClass6RH.IMAGINE_EDIT_OPTIONS
            if (r1 != r0) goto L_0x00f7
            A0A(r6, r7, r3)
            goto L_0x00bd
        L_0x00f7:
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x00bd
            X.1DT r1 = r6.A0O
            java.lang.Object r0 = r1.A06()
            if (r0 != 0) goto L_0x0125
            r1.A0E(r7)
            X.6dh r2 = new X.6dh
            r2.<init>(r7)
            X.1DT r1 = r2.A01
            X.6R5 r0 = X.AnonymousClass6R5.DISPLAY_IMAGE_SELECTED
            r1.A0E(r0)
            X.6dh[] r0 = new X.C127036dh[r3]
            r0[r4] = r2
            java.util.ArrayList r2 = X.AnonymousClass1ZU.A05(r0)
            r5.A0E(r2)
            X.1KB r1 = r6.A0W
            r0 = 27
            X.C108965cb.A1A(r1, r6, r2, r0)
            goto L_0x00bd
        L_0x0125:
            A0A(r6, r7, r4)
            goto L_0x00bd
        L_0x0129:
            r2 = r4
            goto L_0x0024
        L_0x012c:
            r2 = r4
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111225jD.A09(X.5jD, X.6jC):void");
    }

    public static final void A0A(C111225jD r7, C130296jC r8, boolean z) {
        List A10;
        C127036dh r0;
        C127036dh r4 = new C127036dh(r8);
        r4.A01.A0F(AnonymousClass6R5.DISPLAY_IMAGE_NOT_SELECTED);
        AnonymousClass1DT r6 = r7.A0G;
        List A102 = AnonymousClass3MW.A10(r6);
        Object obj = null;
        if (!(A102 == null || (r0 = (C127036dh) C29431cG.A0e(A102)) == null)) {
            obj = r0.A01.A06();
        }
        AnonymousClass6R5 r1 = AnonymousClass6R5.LOAD_MORE;
        List A103 = AnonymousClass3MW.A10(r6);
        if (obj != r1) {
            if (A103 != null) {
                Iterator it = A103.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((C127036dh) next).A01.A06() == AnonymousClass6R5.LOADING) {
                        if (next != null) {
                            A09(r7, r8);
                        }
                    }
                }
            }
            List A104 = AnonymousClass3MW.A10(r6);
            if (A104 != null) {
                A104.add(r4);
            }
        } else if (A103 != null) {
            int size = A103.size();
            if (!(Integer.valueOf(size) == null || (A10 = AnonymousClass3MW.A10(r6)) == null)) {
                A10.add(size - 1, r4);
            }
        }
        r7.A0Y(AnonymousClass1ZU.A05(r4));
        if (z) {
            r7.A0W(r4);
        }
    }

    public static boolean A0D(C111225jD r2) {
        return C18020vd.A05(C18040vf.A01, ((AnonymousClass1UD) r2.A0o.get()).A00, 10851);
    }

    public final void A0U() {
        AnonymousClass6RH r0;
        AnonymousClass1DT r4 = this.A0U;
        Object A062 = r4.A06();
        AnonymousClass6RH r3 = AnonymousClass6RH.SELECTING_OPTION;
        Boolean A0i2 = AnonymousClass000.A0i();
        if (A062 != r3) {
            Object A063 = r4.A06();
            AnonymousClass6RH r2 = AnonymousClass6RH.IMAGINE_EDIT_OPTIONS;
            if (A063 == r2 && A0D(this)) {
                A0V(r3);
                return;
            } else if (r4.A06() != r2) {
                Object A064 = r4.A06();
                if ((A064 == null || !(A064 == AnonymousClass6RH.IMAGINE_EDIT_PREFIX_SELECTED || A064 == AnonymousClass6RH.IMAGINE_EDIT)) && r4.A06() != AnonymousClass6RH.IMAGINE_ANIMATE) {
                    r0 = AnonymousClass6RH.CLOSING;
                    A0V(r0);
                }
                A0V(r2);
                return;
            }
        }
        this.A0S.A0E(A0i2);
        this.A0R.A0E(AnonymousClass6RA.IMAGINE_FLASH);
        if (this.A0D) {
            r0 = AnonymousClass6RH.IMAGINE_ME;
        } else {
            r0 = AnonymousClass6RH.GENERATING_IMAGINE_FLASH;
        }
        A0V(r0);
    }

    public final void A0V(AnonymousClass6RH r7) {
        AnonymousClass6R4 r2;
        AnonymousClass6RH r0;
        AnonymousClass1DT r3 = this.A0U;
        Object A062 = r3.A06();
        AnonymousClass6RH r5 = AnonymousClass6RH.IMAGINE_EDIT;
        if (A062 == r5) {
            this.A0Z.A07(3);
        }
        if (r7 == r5) {
            this.A0R.A0E(AnonymousClass6RA.NOT_SELECTED);
        }
        AnonymousClass6RH r4 = AnonymousClass6RH.SELECTING_OPTION;
        if (r7 == r4 && (this.A06 == null || this.A0D)) {
            C108965cb.A1A(this.A0W, this, AnonymousClass6R4.LARGE, 25);
        }
        if (r7 == AnonymousClass6RH.IMAGINE_EDIT_OPTIONS) {
            C108965cb.A1A(this.A0W, this, AnonymousClass6R4.LARGE, 25);
        }
        if (r7 == AnonymousClass6RH.GENERATING_IMAGINE_FLASH) {
            r2 = AnonymousClass6R4.MEDIUM;
        } else {
            if (r7 == r5) {
                r2 = AnonymousClass6R4.LARGE_TO_SMALL;
            }
            C130296jC A032 = A03(this);
            if (r7 == AnonymousClass6RH.LOADING_SCREEN_GENERATING && r7 == AnonymousClass6RH.LOADING_SCREEN_GENERATING_EDIT_OPTIONS && r7 == AnonymousClass6RH.LOADING_SCREEN_GENERATING_IMAGINE_ME && (r7 != r4 || (A032 != null && A032.A00 != null))) {
                r0 = null;
            } else {
                r0 = (AnonymousClass6RH) r3.A06();
            }
            this.A01 = r0;
            r3.A0E(r7);
        }
        C108965cb.A1A(this.A0W, this, r2, 25);
        C130296jC A0322 = A03(this);
        if (r7 == AnonymousClass6RH.LOADING_SCREEN_GENERATING && r7 == AnonymousClass6RH.LOADING_SCREEN_GENERATING_EDIT_OPTIONS && r7 == AnonymousClass6RH.LOADING_SCREEN_GENERATING_IMAGINE_ME) {
        }
        r0 = (AnonymousClass6RH) r3.A06();
        this.A01 = r0;
        r3.A0E(r7);
    }

    public final void A0W(C127036dh r6) {
        C130296jC r1;
        String str;
        String str2;
        if (r6 != null && (r1 = r6.A00) != null) {
            this.A0O.A0E(r1);
            List A10 = AnonymousClass3MW.A10(this.A0G);
            if (A10 != null) {
                Iterator it = A10.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    C130296jC r0 = ((C127036dh) it.next()).A00;
                    if (r0 != null) {
                        str = r0.A03;
                    } else {
                        str = null;
                    }
                    C130296jC r02 = r6.A00;
                    if (r02 != null) {
                        str2 = r02.A03;
                    } else {
                        str2 = null;
                    }
                    if (C18070vi.A18(str, str2)) {
                        break;
                    }
                    i++;
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    this.A0I.A0E(AnonymousClass1D6.A01(r6, valueOf));
                }
            }
            AnonymousClass1DT r2 = this.A0U;
            if (r2.A06() == AnonymousClass6RH.SELECTING_OPTION || r2.A06() == AnonymousClass6RH.IMAGINE_EDIT_OPTIONS) {
                this.A0B = true;
            }
        }
    }

    public static final void A0B(C111225jD r4, String str, int i, boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        A0C(r4, false);
        int i2 = 1;
        while (true) {
            A13.add(new C127036dh((C130296jC) null));
            if (i2 == i) {
                break;
            }
            i2++;
        }
        List A10 = AnonymousClass3MW.A10(r4.A0G);
        if (A10 != null) {
            A10.addAll(A13);
        }
        A06(AnonymousClass6RH.SELECTING_OPTION, r4, str, i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r8 > 0) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T() {
        /*
            r9 = this;
            A07(r9)
            boolean r0 = r9.A0A
            r8 = 0
            if (r0 == 0) goto L_0x003b
            X.1DT r0 = r9.A0G
            java.util.List r0 = X.AnonymousClass3MW.A10(r0)
            if (r0 == 0) goto L_0x003b
            java.util.Iterator r3 = r0.iterator()
        L_0x0014:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r3.next()
            X.6dh r0 = (X.C127036dh) r0
            X.6jC r0 = r0.A00
            r2 = 0
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = r0.A03
        L_0x0027:
            X.6jC r0 = A03(r9)
            if (r0 == 0) goto L_0x002f
            java.lang.String r2 = r0.A03
        L_0x002f:
            boolean r0 = X.C18070vi.A18(r1, r2)
            if (r0 != 0) goto L_0x003b
            int r8 = r8 + 1
            goto L_0x0014
        L_0x0038:
            r1 = r2
            goto L_0x0027
        L_0x003a:
            r8 = -1
        L_0x003b:
            int r7 = r9.A00()
            X.1Pp r4 = r9.A0Z
            boolean r5 = r9.A0B
            boolean r3 = r9.A0A
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0055
            X.1BI r6 = r4.A02
            if (r6 == 0) goto L_0x0055
            r2 = 10
            r1 = 1
            int r0 = r4.A00
            r4.A04(r6, r2, r0, r1)
        L_0x0055:
            r2 = 3
            r4.A07(r2)
            r0 = 0
            X.C25781Pp.A01(r4, r0, r0)
            r0 = 8
            r1 = 1
            X.C25781Pp.A01(r4, r0, r1)
            r0 = 7
            X.C25781Pp.A01(r4, r0, r1)
            X.C25781Pp.A01(r4, r2, r1)
            r0 = 4
            X.C25781Pp.A01(r4, r0, r1)
            r0 = 5
            X.C25781Pp.A01(r4, r0, r1)
            r0 = 6
            X.C25781Pp.A01(r4, r0, r1)
            r0 = 2
            X.C25781Pp.A01(r4, r0, r1)
            r0 = 25
            X.C25781Pp.A01(r4, r0, r1)
            X.C25781Pp.A01(r4, r1, r1)
            if (r7 == 0) goto L_0x00cc
            X.63w r2 = new X.63w
            r2.<init>()
            if (r5 != 0) goto L_0x008f
            r1 = 29
            if (r8 <= 0) goto L_0x0091
        L_0x008f:
            r1 = 27
        L_0x0091:
            int r5 = r7 + -1
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            int r0 = r4.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04 = r0
            java.lang.Integer r0 = r4.A03
            r2.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A02 = r0
            boolean r1 = r4.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A01 = r0
            java.lang.Boolean r0 = X.C108945cZ.A1A(r1)
            r2.A00 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r8)
            r2.A08 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r5)
            r2.A07 = r0
            X.18K r0 = r4.A05
            r0.CC7(r2)
        L_0x00cc:
            if (r3 == 0) goto L_0x0102
            X.63w r2 = new X.63w
            r2.<init>()
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            int r0 = r4.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04 = r0
            java.lang.Integer r0 = r4.A03
            r2.A05 = r0
            boolean r1 = r4.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A01 = r0
            java.lang.Boolean r0 = X.C108945cZ.A1A(r1)
            r2.A00 = r0
            r0 = 28
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            X.18K r0 = r4.A05
            r0.CC7(r2)
        L_0x0102:
            r0 = 0
            r4.A04 = r0
            java.util.Map r0 = r4.A07
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111225jD.A0T():void");
    }

    public final void A0X(List list) {
        Object A062;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            C127036dh r1 = (C127036dh) next;
            C130296jC r0 = r1.A00;
            if (!(r0 == null || r0.A00 == null || (A062 = r1.A01.A06()) == null)) {
                if (A062 == AnonymousClass6R5.DISPLAY_IMAGE_SELECTED || A062 == AnonymousClass6R5.DISPLAY_IMAGE_NOT_SELECTED) {
                    A13.add(next);
                }
            }
        }
        if (A13.size() > 0) {
            this.A0T.A0F(C17880vN.A10(A13));
        }
    }

    /* JADX WARNING: type inference failed for: r0v43, types: [X.4T1, java.lang.Object] */
    public C111225jD(Uri uri, C131316kt r26, C218617r r27, AnonymousClass1KB r28, C34531kd r29, AnonymousClass181 r30, C25781Pp r31, C32951i1 r32, AnonymousClass11C r33, AnonymousClass11P r34, C130066ip r35, C127226e0 r36, C18030ve r37, C24371Kb r38, AnonymousClass1BI r39, C24421Kg r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45, AnonymousClass00H r46, AnonymousClass00H r47, AnonymousClass00H r48, AnonymousClass00H r49, C18600wl r50, int i) {
        AnonymousClass00H r8 = r44;
        AnonymousClass00H r15 = r41;
        AnonymousClass00H r14 = r42;
        AnonymousClass00H r13 = r43;
        C131316kt r23 = r26;
        C18070vi.A0w(r23, r15, r14, r13, r8);
        AnonymousClass00H r5 = r47;
        AnonymousClass00H r6 = r46;
        AnonymousClass00H r7 = r45;
        C218617r r22 = r27;
        C34531kd r20 = r29;
        C18070vi.A0x(r7, r6, r20, r22, r5);
        C18030ve r11 = r37;
        AnonymousClass00H r4 = r48;
        C24421Kg r9 = r40;
        AnonymousClass181 r19 = r30;
        AnonymousClass11P r12 = r34;
        C18070vi.A0y(r19, r12, r11, r4, r9);
        C24371Kb r10 = r38;
        AnonymousClass1KB r21 = r28;
        C25781Pp r18 = r31;
        AnonymousClass11C r16 = r33;
        C18070vi.A0t(r10, r21, r18, r16);
        AnonymousClass00H r3 = r49;
        C18070vi.A0d(r3, 20);
        C18600wl r2 = r50;
        C32951i1 r17 = r32;
        C108975cc.A11(r17, 21, r2);
        this.A0r = r15;
        this.A0q = r14;
        this.A0p = r13;
        this.A0s = r8;
        this.A0n = r7;
        this.A0t = r6;
        this.A0X = r20;
        this.A0V = r22;
        this.A04 = r5;
        this.A00 = r19;
        this.A0d = r12;
        this.A0g = r11;
        this.A0u = r4;
        this.A0j = r9;
        this.A0h = r10;
        this.A0W = r21;
        this.A0Z = r18;
        this.A0c = r16;
        this.A0o = r3;
        this.A02 = r17;
        this.A0i = r39;
        this.A0F = uri;
        this.A0E = i;
        this.A0w = r2;
        this.A0f = r36;
        this.A0e = r35;
        AtomicLong atomicLong = new AtomicLong(0);
        this.A0v = atomicLong;
        this.A0a = r23.A00(atomicLong);
        this.A0b = new Object();
        this.A08 = new AtomicBoolean(false);
        this.A0Y = new C129966if(this);
    }
}
