package X;

import com.whatsapp.wamsys.JniBridge;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.1U9  reason: invalid class name */
public class AnonymousClass1U9 {
    public final AnonymousClass181 A00;
    public final C26881Tv A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass118 A03;
    public final C18030ve A04;
    public final C24371Kb A05;
    public final AnonymousClass1U8 A06;
    public final C24421Kg A07;
    public final C200710s A08;
    public final JniBridge A09;
    public final AnonymousClass00H A0A;
    public final HashMap A0B = new HashMap();

    public AnonymousClass1U9(AnonymousClass181 r3, C26881Tv r4, AnonymousClass11P r5, AnonymousClass118 r6, C18030ve r7, C24371Kb r8, AnonymousClass1U8 r9, C24421Kg r10, AnonymousClass10I r11, JniBridge jniBridge, AnonymousClass00H r13) {
        C200710s r1 = new C200710s(r11, false);
        this.A02 = r5;
        this.A04 = r7;
        this.A03 = r6;
        this.A09 = jniBridge;
        this.A00 = r3;
        this.A0A = r13;
        this.A07 = r10;
        this.A01 = r4;
        this.A06 = r9;
        this.A05 = r8;
        this.A08 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r5 != null) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A00(android.content.Context r4, java.lang.String r5, java.net.URL r6, int r7) {
        /*
            if (r6 != 0) goto L_0x0005
            r0 = 0
            if (r5 == 0) goto L_0x0006
        L_0x0005:
            r0 = 1
        L_0x0006:
            X.C17960vV.A0D(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r0 = "_"
            r2.append(r0)
            if (r6 == 0) goto L_0x003c
            java.lang.String r1 = r6.toString()
        L_0x001c:
            r0 = 0
            java.lang.String r0 = android.webkit.URLUtil.guessFileName(r1, r0, r0)
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            java.io.File r2 = r4.getCacheDir()
            java.lang.String r0 = "ProfilePictureTemp"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            r1.mkdirs()
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r3)
            return r0
        L_0x003c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "https://pps.whatsapp.net"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1U9.A00(android.content.Context, java.lang.String, java.net.URL, int):java.io.File");
    }

    public void A01(C55782gM r20, long j) {
        C55782gM r11 = r20;
        AnonymousClass1BI r9 = r11.A03;
        int i = r11.A02;
        Locale locale = Locale.US;
        Integer valueOf = Integer.valueOf(i);
        String format = String.format(locale, "%s.%d", new Object[]{r9.getRawString(), valueOf});
        HashMap hashMap = this.A0B;
        synchronized (hashMap) {
            C1195168l r4 = (C1195168l) hashMap.get(format);
            if (r4 != null) {
                if (!r4.A04.A04.equals(r11.A04)) {
                    AnonymousClass7RU.A01(r4, false);
                    hashMap.remove(format);
                }
            }
            String format2 = String.format(Locale.US, "%s.%d", new Object[]{r9.getRawString(), valueOf});
            C145937Ne r14 = new C145937Ne(r11, this, 16);
            AnonymousClass11P r6 = this.A02;
            C18030ve r92 = this.A04;
            AnonymousClass118 r7 = this.A03;
            JniBridge jniBridge = this.A09;
            C24421Kg r13 = this.A07;
            C1195168l r3 = new C1195168l(this.A00, this.A01, r6, r7, (AnonymousClass11Z) this.A0A.get(), r92, this.A05, r11, this.A06, r13, r14, jniBridge, format2, j);
            hashMap.put(format2, r3);
            this.A08.execute(r3);
        }
    }
}
