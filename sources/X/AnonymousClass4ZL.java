package X;

import java.util.List;

/* renamed from: X.4ZL  reason: invalid class name */
public class AnonymousClass4ZL {
    public static final int A0E;
    public int A00 = -1;
    public int A01 = 0;
    public final AnonymousClass190 A02;
    public final AnonymousClass1KB A03;
    public final C48012Kv A04;
    public final AnonymousClass11C A05;
    public final AnonymousClass118 A06;
    public final C18030ve A07;
    public final C86024Pw A08 = new C86024Pw(this);
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final List A0C = AnonymousClass000.A13();
    public final List A0D = AnonymousClass000.A13();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (android.os.Build.MODEL.equals("SAMSUNG-SM-J320A") == false) goto L_0x0015;
     */
    static {
        /*
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "SAMSUNG-SM-J320A"
            boolean r1 = r1.equals(r0)
            r0 = 4
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            A0E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZL.<clinit>():void");
    }

    public static C122026Mm A00(AnonymousClass21X r7, AnonymousClass4ZL r8) {
        AnonymousClass00H r1 = r8.A0A;
        AnonymousClass18K r2 = ((AnonymousClass4PA) r1.get()).A00;
        C62242r5 r3 = ((AnonymousClass4PA) r1.get()).A01;
        AnonymousClass21X r5 = r7;
        int i = 1;
        int i2 = 1;
        if (r7.A0w()) {
            i = 3;
            i2 = 6;
        }
        return new C122026Mm(r2, r3, (AnonymousClass70W) null, r5, i, 3, i2);
    }

    public AnonymousClass4ZL(AnonymousClass190 r2, AnonymousClass1KB r3, C48012Kv r4, AnonymousClass11C r5, AnonymousClass118 r6, C18030ve r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        this.A07 = r7;
        this.A03 = r3;
        this.A02 = r2;
        this.A06 = r6;
        this.A05 = r5;
        this.A04 = r4;
        this.A0A = r8;
        this.A09 = r9;
        this.A0B = r10;
    }
}
