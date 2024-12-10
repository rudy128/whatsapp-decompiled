package X;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2Po  reason: invalid class name and case insensitive filesystem */
public class C49202Po extends A34 {
    public final int A00;
    public final Uri A01;
    public final C218617r A02;
    public final AnonymousClass11C A03;
    public final C18030ve A04;
    public final AnonymousClass18K A05;
    public final C26421Sb A06;
    public final AnonymousClass206 A07;
    public final C62272r8 A08;
    public final C26521Sl A09;
    public final File A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;
    public final boolean A0E;
    public final AnonymousClass1KB A0F;
    public final C33251iW A0G;
    public final AnonymousClass118 A0H;
    public final C18000vb A0I;
    public final WeakReference A0J;

    public void A0F() {
        AnonymousClass1FR r2 = (AnonymousClass1FR) this.A0J.get();
        if (r2 != null) {
            r2.CNB(0, 2131899151);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Integer num;
        File file;
        String str;
        int i;
        AnonymousClass11C r2 = this.A03;
        Uri uri = this.A01;
        String A0M = C26511Sk.A0M(uri, r2.A0O());
        try {
            C62272r8 r12 = this.A08;
            C18030ve r14 = this.A04;
            C218617r r11 = this.A02;
            AnonymousClass18K r10 = this.A05;
            C26421Sb r26 = this.A06;
            C26521Sl r3 = this.A09;
            List list = this.A0C;
            File file2 = this.A0A;
            AnonymousClass206 r20 = this.A07;
            boolean z = this.A0E;
            String str2 = this.A0B;
            List list2 = this.A0D;
            int i2 = this.A00;
            boolean A17 = C18070vi.A17(r14, r11);
            C18070vi.A0p(r10, r26, r3);
            C18070vi.A0l(list, uri);
            if (file2 == null) {
                file2 = r3.A0j(uri, false);
                C18070vi.A0X(file2);
            }
            long length = file2.length();
            String A0L = C26511Sk.A0L(uri);
            AnonymousClass747 r32 = C62272r8.A04;
            String A022 = AnonymousClass747.A02(uri, r2);
            if (A022 != null && (A0L == null || A0L.length() == 0)) {
                A0L = C64062u9.A09(A022);
            }
            AnonymousClass2FE r13 = new AnonymousClass2FE();
            r13.A00 = Double.valueOf(Math.ceil(((double) length) / 2.0E7d) * 20.0d * 1000000.0d);
            if (A0L == null || A0L.length() == 0) {
                num = null;
            } else {
                String lowerCase = A0L.toLowerCase(Locale.ROOT);
                C18070vi.A0X(lowerCase);
                if (C62272r8.A0A.contains(lowerCase)) {
                    i = 2;
                } else if (C62272r8.A0C.contains(lowerCase)) {
                    i = 3;
                } else if (C62272r8.A06.contains(lowerCase)) {
                    i = 4;
                } else if (C62272r8.A08.contains(lowerCase)) {
                    i = 5;
                } else if (C62272r8.A07.contains(lowerCase)) {
                    i = 6;
                } else if (C62272r8.A09.contains(lowerCase)) {
                    i = 7;
                } else {
                    boolean contains = C62272r8.A0B.contains(lowerCase);
                    i = 1;
                    if (contains) {
                        i = 8;
                    }
                }
                num = Integer.valueOf(i);
            }
            r13.A01 = num;
            C18040vf r15 = C18040vf.A02;
            if (length <= ((long) C18020vd.A00(r15, r14, 542)) * 1048576) {
                r10.CC7(r13);
                byte[] A012 = r12.A01(file2, A0M, 1.0f, C18020vd.A00(r15, r12.A01, 6249));
                if (!r11.A0m(file2)) {
                    file = C218617r.A02(r11.A0G(), C17890vO.A0Q());
                    r11.A0i(file2, file);
                } else {
                    file = file2;
                }
                C62572rc r5 = new C62572rc();
                r5.A0G = file;
                if (str2 != null) {
                    int length2 = str2.length() - (A17 ? 1 : 0);
                    int i3 = 0;
                    boolean z2 = false;
                    while (i3 <= length2) {
                        int i4 = length2;
                        if (!z2) {
                            i4 = i3;
                        }
                        int A002 = C18070vi.A00(str2.charAt(i4), 32);
                        boolean z3 = false;
                        if (A002 <= 0) {
                            z3 = true;
                        }
                        if (z2) {
                            if (!z3) {
                                break;
                            }
                            length2--;
                        } else if (!z3) {
                            z2 = true;
                        } else {
                            i3++;
                        }
                    }
                    str = str2.subSequence(i3, length2 + 1).toString();
                } else {
                    str = null;
                }
                C63642tS A042 = r26.A04((Uri) null, r5, r20, (C692236j) null, str, list, (List) null, (List) null, 9, 0, 0, z);
                int A072 = r32.A07(file2, A0M);
                Iterator A0o = C29431cG.A0o(A042.A03);
                while (A0o.hasNext()) {
                    AnonymousClass21V A0b = C17880vN.A0b(A0o);
                    if (A0b instanceof C438921i) {
                        C438921i r1 = (C438921i) A0b;
                        r1.A00 = A072;
                        r1.A06 = A0M;
                        r1.A09 = A022;
                        r1.A0l(list2);
                    }
                }
                A042.A00 = i2;
                return new Pair(A042, A012);
            }
            r10.CC6(r13, C62272r8.A03);
            throw new AnonymousClass2RO();
        } catch (Exception e) {
            return e;
        }
    }

    public void A0H(Object obj) {
        AnonymousClass1KB r1;
        int i;
        AnonymousClass1FR r4 = (AnonymousClass1FR) this.A0J.get();
        if (r4 != null) {
            r4.CEx();
        }
        Context context = this.A0H.A00;
        if (obj instanceof AnonymousClass6SP) {
            r1 = this.A0F;
            i = 2131889969;
        } else if (obj instanceof AnonymousClass2RO) {
            int A002 = C18020vd.A00(C18040vf.A02, this.A04, 542);
            AnonymousClass1KB r10 = this.A0F;
            Locale locale = context.getResources().getConfiguration().locale;
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, A002, 0);
            r10.A0F(r4, C17880vN.A0q(context, this.A0I.A0J(new Object[]{String.format(locale, "%d", objArr)}, 283, (long) A002), new Object[1], 0, 2131890389));
            return;
        } else if (obj instanceof IOException) {
            Throwable th = (Throwable) obj;
            C17900vP.A0X(th, "SendMedia/sendDocumentAsync/IOException ", AnonymousClass000.A10());
            if (th.getMessage() == null || !th.getMessage().contains("No space")) {
                this.A0F.A08(2131896086, 0);
                return;
            } else {
                r1 = this.A0F;
                i = 2131889993;
            }
        } else if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            this.A0G.A0n((C63642tS) pair.first, (byte[]) pair.second, false, false);
            return;
        } else {
            return;
        }
        r1.A0F(r4, context.getString(i));
    }

    public C49202Po(Uri uri, AnonymousClass1FR r3, C218617r r4, AnonymousClass1KB r5, C33251iW r6, AnonymousClass11C r7, AnonymousClass118 r8, C18000vb r9, C18030ve r10, AnonymousClass18K r11, C26421Sb r12, AnonymousClass206 r13, C62272r8 r14, C26521Sl r15, File file, String str, List list, List list2, int i, boolean z) {
        this.A04 = r10;
        this.A0F = r5;
        this.A0H = r8;
        this.A02 = r4;
        this.A05 = r11;
        this.A0G = r6;
        this.A06 = r12;
        this.A08 = r14;
        this.A09 = r15;
        this.A03 = r7;
        this.A0I = r9;
        this.A0C = list;
        this.A01 = uri;
        this.A0A = file;
        this.A07 = r13;
        this.A0J = new WeakReference(r3);
        this.A0E = z;
        this.A0B = str;
        this.A0D = list2;
        this.A00 = i;
    }
}
