package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Sb  reason: invalid class name and case insensitive filesystem */
public class C26421Sb {
    public final AnonymousClass190 A00;
    public final C218617r A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass11S A03;
    public final C25311Ns A04;
    public final AnonymousClass181 A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass118 A07;
    public final AnonymousClass1ST A08;
    public final AnonymousClass1SX A09;
    public final C18030ve A0A;
    public final AnonymousClass1SV A0B;
    public final C24371Kb A0C;
    public final AnonymousClass1KX A0D;
    public final AnonymousClass1SJ A0E;
    public final AnonymousClass1SY A0F;
    public final WamediaManager A0G;
    public final AnonymousClass1SK A0H;
    public final AnonymousClass1SS A0I;
    public final AnonymousClass1SU A0J;
    public final C26411Sa A0K;
    public final AnonymousClass1SZ A0L;
    public final AnonymousClass1SR A0M;
    public final AnonymousClass1SW A0N;
    public final C18010vc A0O;
    public final C24421Kg A0P;
    public final AnonymousClass10I A0Q;
    public final JniBridge A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r4 = r11.A0I;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass34B A01(X.C63722ta r12, boolean r13) {
        /*
            r11 = this;
            r10 = r12
            java.lang.String r1 = r12.A04
            r5 = 0
            if (r1 == 0) goto L_0x002c
            X.1SS r4 = r11.A0I
            r0 = 0
            X.2h4 r3 = r4.A03(r1, r0)
            if (r3 == 0) goto L_0x002c
            X.11P r2 = r11.A06
            X.10I r5 = r11.A0Q
            X.73e r1 = new X.73e
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            X.0ve r7 = r11.A0A
            r0 = 4
            X.C18070vi.A0d(r7, r0)
            X.2h8 r0 = r12.A01
            X.BAf r6 = X.AnonymousClass1T6.A00(r0)
            X.34B r5 = new X.34B
            r8 = r3
            r9 = r1
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x002c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26421Sb.A01(X.2ta, boolean):X.34B");
    }

    public C56202h4 A00(String str) {
        if (str == null) {
            return null;
        }
        AnonymousClass1SS r3 = this.A0I;
        synchronized (r3) {
            C002100z r1 = r3.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(1);
            if (r1.A04(sb.toString()) == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(1);
            C56202h4 r0 = (C56202h4) r1.A04(sb2.toString());
            return r0;
        }
    }

    public AnonymousClass34A A02(String str, int i, int i2, boolean z) {
        AnonymousClass1SS r4 = this.A0I;
        C56202h4 A032 = r4.A03(str, 2);
        boolean z2 = z;
        if (A032 == null) {
            A032 = r4.A02(str, 2);
        } else if (z) {
            A032.A03++;
        }
        C1408173e r1 = new C1408173e(this.A06, A032, r4, this.A0Q, z2);
        r1.A0B(i, i2, false);
        return new AnonymousClass34A(A032, r1);
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [X.36a, java.lang.Object, X.229] */
    public AnonymousClass21V A03(Uri uri, C62572rc r12, AnonymousClass1BI r13, AnonymousClass206 r14, C692236j r15, String str, String str2, List list, List list2, int i, int i2, int i3, boolean z, boolean z2) {
        int A032;
        String valueOf;
        C54342dz r3 = (C54342dz) this.A0T.get();
        long A012 = AnonymousClass11P.A01(this.A06);
        C18070vi.A0d(r13, 0);
        C18070vi.A0d(r12, 1);
        int i4 = i;
        AnonymousClass206 A002 = ((AnonymousClass207) r3.A02.get()).A00(r3.A00.A01(r13, true), i4, A012);
        Class<AnonymousClass21V> cls = AnonymousClass21V.class;
        if (!(A002 instanceof AnonymousClass21V)) {
            String name = A002.getClass().getName();
            String name2 = cls.getName();
            String str3 = "";
            String str4 = str3.toString();
            if (str4.length() > 0) {
                str3 = ", ";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Failed requirement: ");
            sb.append(A002.A0u);
            sb.append("; expected subclass of ");
            sb.append(name2);
            sb.append(", but was ");
            sb.append(name);
            sb.append(str3);
            sb.append(str4);
            throw new IllegalArgumentException(sb.toString());
        }
        AnonymousClass21V r2 = (AnonymousClass21V) A002;
        r2.A02 = r12;
        r2.A02 = 0;
        r2.A0a(1);
        r2.A09 = null;
        r2.A01 = 0;
        r2.A09 = i2;
        r3.A01.A00(A002, r14);
        String str5 = r12.A0H;
        if (!TextUtils.isEmpty(str5)) {
            r2.A03 = str5;
        }
        if (str != null) {
            if (!(r2 instanceof C438921i)) {
                r2.A04 = str.trim();
                if (TextUtils.isEmpty(r2.A18())) {
                    r2.A04 = null;
                }
            } else {
                C438921i r1 = (C438921i) r2;
                r1.A1H(str.trim());
                if (TextUtils.isEmpty(r1.A01)) {
                    r1.A1H((String) null);
                }
            }
        }
        File file = r12.A0G;
        if (file == null) {
            if (uri != null) {
                valueOf = uri.toString();
            } else {
                valueOf = String.valueOf(r12.hashCode());
            }
            r2.A09 = valueOf;
            r2.A01 = 0;
        } else {
            r2.A09 = file.getName();
            r2.A01 = r12.A0G.length();
        }
        if (i4 == 2 || i4 == 3 || i4 == 43 || i4 == 81 || i4 == 13 || i4 == 82) {
            if (r12.A0F.A08) {
                A032 = Math.max(0, (int) TimeUnit.MILLISECONDS.toSeconds(15000));
            } else {
                long j = r12.A0D;
                if (j > 0 || r12.A0E > 0) {
                    r2.A0D = (int) ((r12.A0E - j) / 1000);
                } else {
                    A032 = C26511Sk.A03(r12.A0G);
                }
            }
            r2.A0D = A032;
        }
        r2.A0l(list);
        r12.A0A = r2.A01;
        r12.A0Q = true;
        r2.A1D(str2);
        if (z) {
            r2.A0b(4);
        }
        if (z2) {
            ? obj = new Object();
            obj.A00 = 0;
            obj.A05 = null;
            obj.A04 = null;
            obj.A01 = 0;
            obj.A02 = 0;
            obj.A03 = 0;
            obj.A06 = false;
            obj.A07 = true;
            r2.A0M(C691336a.class).A02(obj);
        }
        List list3 = list2;
        if (list2 != null && !list3.isEmpty()) {
            r12.A0b = (InteractiveAnnotation[]) list3.toArray(new InteractiveAnnotation[0]);
        }
        int i5 = i3;
        if (i3 > 0) {
            r2.A0b(1);
            r2.A06 = i5;
        }
        if (r15 != null) {
            C63672tV.A03(r2, r15);
        }
        return r2;
    }

    public C63642tS A04(Uri uri, C62572rc r21, AnonymousClass206 r22, C692236j r23, String str, List list, List list2, List list3, int i, int i2, int i3, boolean z) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            str2 = AnonymousClass1PP.A00(this.A03, this.A06, false);
        } else {
            str2 = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri2 = uri;
            arrayList.add(A03(uri2, r21.A00(), (AnonymousClass1BI) it.next(), r22, r23, str, str2, list2, list3, i, i2, i3, z, false));
        }
        return new C63642tS(arrayList);
    }

    public C26421Sb(AnonymousClass190 r2, C218617r r3, AnonymousClass1KB r4, AnonymousClass11S r5, C25311Ns r6, AnonymousClass181 r7, AnonymousClass11P r8, AnonymousClass118 r9, AnonymousClass1ST r10, AnonymousClass1SX r11, C18030ve r12, AnonymousClass1SV r13, C24371Kb r14, AnonymousClass1KX r15, AnonymousClass1SJ r16, AnonymousClass1SY r17, WamediaManager wamediaManager, AnonymousClass1SK r19, AnonymousClass1SS r20, AnonymousClass1SU r21, C26411Sa r22, AnonymousClass1SZ r23, AnonymousClass1SR r24, AnonymousClass1SW r25, C18010vc r26, C24421Kg r27, AnonymousClass10I r28, JniBridge jniBridge, AnonymousClass00H r30, AnonymousClass00H r31) {
        this.A07 = r9;
        this.A06 = r8;
        this.A0A = r12;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A0Q = r28;
        this.A01 = r3;
        this.A0R = jniBridge;
        this.A05 = r7;
        this.A0P = r27;
        this.A0G = wamediaManager;
        this.A0E = r16;
        this.A0H = r19;
        this.A0M = r24;
        this.A0S = r30;
        this.A0I = r20;
        this.A08 = r10;
        this.A0N = r25;
        this.A09 = r11;
        this.A0J = r21;
        this.A0T = r31;
        this.A0F = r17;
        this.A0D = r15;
        this.A0B = r13;
        this.A0C = r14;
        this.A0O = r26;
        this.A0L = r23;
        this.A04 = r6;
        this.A0K = r22;
    }
}
