package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.UUID;

/* renamed from: X.1T5  reason: invalid class name */
public class AnonymousClass1T5 {
    public final AnonymousClass118 A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass1T3 A03;
    public final C26541Sn A04;
    public final AnonymousClass00H A05;
    public final C26521Sl A06;
    public final AnonymousClass00H A07;

    public static File A00(AnonymousClass1T5 r2, File file, String str) {
        long j;
        if (file == null) {
            Log.w("mediaprocessmanager/gettranscodedfile/originalFile is null");
        }
        C26521Sl r22 = r2.A06;
        if (file != null) {
            j = file.length();
        } else {
            j = -1;
        }
        return r22.A0k(str, j);
    }

    public C55982gh A01(AnonymousClass34B r21, C58192kI r22) {
        String str;
        CXH r8;
        C26541Sn r2;
        C26551So r0;
        AnonymousClass18K r4 = this.A02;
        AnonymousClass34B r10 = r21;
        AnonymousClass70S r9 = new AnonymousClass70S(this.A01, r4, Integer.valueOf(r10.A00()), r10.A0P.A00);
        String str2 = r10.A0N.A0D;
        r9.A01.A0N = Long.valueOf(UUID.fromString(str2).getMostSignificantBits() & Long.MAX_VALUE);
        C55982gh r1 = new C55982gh(r9);
        C58192kI r02 = r22;
        C26551So r42 = r02.A06;
        C25811CmO cmO = r02.A04;
        if (!r02.A0D && r02.A08 == null) {
            E8E e8e = r1.A07;
            C52302ah r11 = r1.A06;
            C28533E6h e6h = r1.A08;
            String str3 = r02.A0C;
            C17960vV.A07(str3);
            File A002 = r02.A00();
            StringBuilder sb = new StringBuilder();
            sb.append(UUID.randomUUID().toString());
            sb.append(".tmp");
            this.A04.A00(new AnonymousClass68S(r9, r10, r11, e8e, e6h, A00(this, A002, sb.toString()), str3), r42);
        } else if (r42 == C26551So.A04 || r42 == C26551So.A0U) {
            this.A03.A0A(this.A00.A00, new AnonymousClass346(r9, r10, r1, this, r02, cmO, r42), r10, r02.A09);
            return r1;
        } else if (C63972u0.A08(r42)) {
            this.A03.A0A(this.A00.A00, new AnonymousClass345(r9, r10, r1, this, r02, cmO), r10, r02.A09);
            return r1;
        } else {
            if (C63972u0.A03(r42)) {
                E8E e8e2 = r1.A07;
                C52302ah r112 = r1.A06;
                C28533E6h e6h2 = r1.A08;
                File file = r02.A08;
                C17960vV.A07(file);
                boolean z = r02.A0L;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(UUID.randomUUID().toString());
                sb2.append(".aac");
                r8 = new C24014Bu0(r9, r10, r112, e8e2, e6h2, file, A00(this, file, sb2.toString()), z);
                r2 = this.A04;
                r0 = C26551So.A05;
            } else if (C63972u0.A05(r42)) {
                String str4 = r02.A0C;
                C17960vV.A07(str4);
                E8E e8e3 = r1.A07;
                C52302ah r113 = r1.A06;
                C28533E6h e6h3 = r1.A08;
                File A003 = r02.A00();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(UUID.randomUUID().toString());
                sb3.append(".jpg");
                File A004 = A00(this, A003, sb3.toString());
                AnonymousClass6nF r14 = r02.A05;
                C17960vV.A07(r14);
                String str5 = str4;
                r8 = new AnonymousClass68T(r9, r10, r113, e8e3, e6h3, r14, A004, str5, r02.A0J, r02.A0G);
                r2 = this.A04;
                r0 = C26551So.A0E;
            } else if (C63972u0.A07(r42)) {
                File file2 = r02.A08;
                String str6 = r02.A0C;
                String str7 = r02.A0A;
                AnonymousClass73B r142 = r02.A07;
                String str8 = r02.A0B;
                E8E e8e4 = r1.A07;
                C52302ah r114 = r1.A06;
                C28533E6h e6h4 = r1.A08;
                File A005 = r02.A00();
                if (r02.A0I) {
                    str = ".was";
                } else {
                    str = ".webp";
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(UUID.randomUUID().toString());
                sb4.append(str);
                r8 = new AnonymousClass68U(r9, r10, r114, e8e4, e6h4, r142, file2, A00(this, A005, sb4.toString()), str6, str7, str8);
                r2 = this.A04;
                r0 = C26551So.A0j;
            } else if (r42 == C26551So.A0B) {
                File file3 = r02.A08;
                C17960vV.A07(file3);
                ((C26461Sf) this.A07.get()).A04(r10, new C24927CQa(r1.A07, r1.A08, file3));
                return r1;
            }
            r2.A00(r8, r0);
            return r1;
        }
        return r1;
    }

    public void A02(AnonymousClass85B r3, C26551So r4) {
        C18100vl r0;
        C26541Sn r1 = this.A04;
        if (C26541Sn.A04.contains(r4)) {
            r0 = r1.A02;
        } else {
            r0 = r1.A03;
        }
        ((C26461Sf) r0.getValue()).A08(r3);
        this.A03.A08(r3);
        ((C26461Sf) this.A05.get()).A08(r3);
    }

    public AnonymousClass1T5(AnonymousClass118 r1, C18030ve r2, AnonymousClass18K r3, AnonymousClass1T3 r4, C26541Sn r5, C26521Sl r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r6;
        this.A05 = r7;
        this.A07 = r8;
        this.A04 = r5;
        this.A03 = r4;
    }
}
