package X;

import java.security.cert.X509Certificate;

/* renamed from: X.18j  reason: invalid class name and case insensitive filesystem */
public class C220418j {
    public AnonymousClass9A7 A00;
    public AnonymousClass9AA A01;
    public C27348DcK A02;
    public C27348DcK A03;
    public AnonymousClass9A9 A04;
    public final AnonymousClass18O A05;
    public final AnonymousClass118 A06;
    public final C18030ve A07;
    public final C219918e A08;
    public final C220118g A09;
    public final AnonymousClass18Z A0A;
    public final C213915u A0B = ((C213915u) AnonymousClass12Q.A03(C213915u.class));
    public final C214015v A0C = ((C214015v) C221618v.A02(C214015v.class));
    public final C220018f A0D;
    public final C219618b A0E;
    public final C220218h A0F;
    public final AnonymousClass00H A0G;

    public synchronized AnonymousClass9AA A00() {
        AnonymousClass9AA r2;
        r2 = this.A01;
        if (r2 == null) {
            X509Certificate[] x509CertificateArr = AnonymousClass9AA.A01;
            r2 = new AnonymousClass9AA(this.A06.A00, (C191189mA) this.A0G.get());
            this.A01 = r2;
        }
        return r2;
    }

    public synchronized C27348DcK A01(boolean z) {
        C27348DcK dcK;
        if (z) {
            dcK = this.A03;
            if (dcK == null) {
                C18030ve r2 = this.A07;
                AnonymousClass18O r1 = this.A05;
                AnonymousClass18Z r5 = this.A0A;
                C219618b r9 = this.A0E;
                C213915u r6 = this.A0B;
                dcK = new C27348DcK(r1, r2, this.A08, this.A09, r5, r6, this.A0C, this.A0D, r9, this.A0F);
                this.A03 = dcK;
            }
        } else {
            dcK = this.A02;
            if (dcK == null) {
                C18030ve r22 = this.A07;
                AnonymousClass18O r12 = this.A05;
                AnonymousClass18Z r52 = this.A0A;
                C219618b r92 = this.A0E;
                C213915u r62 = this.A0B;
                dcK = new C27348DcK(r12, r22, this.A08, this.A09, r52, r62, this.A0C, this.A0D, r92, this.A0F);
                this.A02 = dcK;
            }
        }
        return dcK;
    }

    public synchronized AnonymousClass9A9 A02() {
        AnonymousClass9A9 r2;
        r2 = this.A04;
        if (r2 == null) {
            X509Certificate[] x509CertificateArr = AnonymousClass9A9.A01;
            r2 = new AnonymousClass9A9(this.A06.A00, (C191189mA) this.A0G.get());
            this.A04 = r2;
        }
        return r2;
    }

    public C220418j(AnonymousClass18O r2, AnonymousClass118 r3, C18030ve r4, C219918e r5, C220118g r6, AnonymousClass18Z r7, C220018f r8, C219618b r9, C220218h r10, AnonymousClass00H r11) {
        this.A07 = r4;
        this.A06 = r3;
        this.A05 = r2;
        this.A0A = r7;
        this.A0E = r9;
        this.A0G = r11;
        this.A08 = r5;
        this.A0D = r8;
        this.A09 = r6;
        this.A0F = r10;
    }
}
